package com.tt.miniapp.progress;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.refer.common.util.C67866g;
import java.util.Random;

public class TMALaunchProgress extends AppbrandServiceManager.ServiceBase implements Handler.Callback, AbstractC66659a {
    private final String TAG = "TMALaunchProgress";
    public volatile int mCurrentProgress;
    private Handler mHandler;
    private boolean mIsDestroy;
    public AbstractC66660b mListener;
    private SparseArray<C66658a> mProgressConfig;
    private Random mProgressRandom;
    private HandlerThread mThread;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.tt.miniapp.progress.AbstractC66659a
    public int getCurrentStatus() {
        return this.mCurrentProgress;
    }

    public boolean isDestroy() {
        return this.mIsDestroy;
    }

    private void sendStartCommand() {
        this.mHandler.sendEmptyMessage(CommonCode.StatusCode.API_CLIENT_EXPIRED);
    }

    private void callbackUIThread() {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.progress.TMALaunchProgress.RunnableC666571 */

            public void run() {
                if (TMALaunchProgress.this.mListener != null) {
                    TMALaunchProgress.this.mListener.mo232124f(TMALaunchProgress.this.mCurrentProgress);
                }
            }
        });
    }

    private int getRandomProgress() {
        if (this.mProgressRandom == null) {
            this.mProgressRandom = new Random();
        }
        return this.mProgressRandom.nextInt(3) + 1;
    }

    private void initThread() {
        if (this.mThread == null) {
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("TMALaunchProgress");
            this.mThread = new_android_os_HandlerThread_by_knot;
            new_android_os_HandlerThread_by_knot.start();
            this.mHandler = new Handler(this.mThread.getLooper(), this);
        }
    }

    @Override // com.tt.miniapp.progress.AbstractC66659a
    public synchronized void start() {
        if (!this.mIsDestroy) {
            initThread();
            sendStartCommand();
        }
    }

    private void checkProgress() {
        int size = this.mProgressConfig.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (!this.mProgressConfig.get(i).f168262b) {
                i2 = this.mProgressConfig.get(i).f168261a;
                break;
            } else {
                if (i == size - 1) {
                    i2 = 100;
                }
                i++;
            }
        }
        if (this.mCurrentProgress > i2) {
            this.mCurrentProgress = i2;
        } else {
            sendRunCommand(100);
        }
    }

    @Override // com.tt.miniapp.progress.AbstractC66659a
    public synchronized void stop() {
        if (C25529d.m91169j(this.mApp.getiAppContext())) {
            Log.m165389i("TMALaunchProgress", "can not stop ,because SSB");
        } else if (!this.mIsDestroy) {
            try {
                HandlerThread handlerThread = this.mThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                this.mIsDestroy = true;
            } catch (Exception e) {
                AppBrandLogger.m52829e("TMALaunchProgress", e);
            }
        }
    }

    @Override // com.tt.miniapp.progress.AbstractC66659a
    public void setOnProgressChangedListener(AbstractC66660b bVar) {
        this.mListener = bVar;
    }

    private void sendRunCommand(long j) {
        this.mHandler.sendEmptyMessageDelayed(1000, j);
    }

    private void sendUpdateCommand(int i) {
        this.mHandler.obtainMessage(1002, Integer.valueOf(i)).sendToTarget();
    }

    @Override // com.tt.miniapp.progress.AbstractC66659a
    public synchronized void updateStatus(int i) {
        AppBrandLogger.m52830i("TMALaunchProgress", "updateStatus" + i + " , mIsDestroy  " + this.mIsDestroy);
        if (!this.mIsDestroy) {
            initThread();
            sendUpdateCommand(i);
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1000:
                this.mHandler.removeMessages(1000);
                this.mCurrentProgress += getRandomProgress();
                checkProgress();
                callbackUIThread();
                break;
            case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                this.mProgressConfig.get(0).f168262b = true;
                sendRunCommand(0);
                break;
            case 1002:
                C66658a aVar = this.mProgressConfig.get(((Integer) message.obj).intValue(), null);
                if (aVar != null) {
                    aVar.f168262b = true;
                    sendRunCommand(0);
                    break;
                }
                break;
        }
        return false;
    }

    private TMALaunchProgress(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        SparseArray<C66658a> sparseArray = new SparseArray<>();
        this.mProgressConfig = sparseArray;
        sparseArray.put(0, new C66658a(0, false));
        this.mProgressConfig.put(1, new C66658a(15, false));
        this.mProgressConfig.put(2, new C66658a(35, false));
        this.mProgressConfig.put(3, new C66658a(45, false));
        this.mProgressConfig.put(4, new C66658a(55, false));
        this.mProgressConfig.put(5, new C66658a(65, false));
        this.mProgressConfig.put(6, new C66658a(80, false));
        this.mProgressConfig.put(7, new C66658a(90, false));
        this.mProgressConfig.put(8, new C66658a(95, false));
        this.mProgressConfig.put(9, new C66658a(100, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.progress.TMALaunchProgress$a */
    public class C66658a {

        /* renamed from: a */
        public int f168261a;

        /* renamed from: b */
        public boolean f168262b;

        public C66658a(int i, boolean z) {
            this.f168261a = i;
            this.f168262b = z;
        }
    }
}
