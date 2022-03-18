package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import androidx.core.content.ContextCompat;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60401j;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.p3038g.AbstractC60370b;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.ttvecamera.systemresmanager.TESystemResManager;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public enum TECameraServer {
    INSTANCE;
    
    public PrivacyCert cachedClosePrivacyCert = null;
    public PrivacyCert cachedOpenPrivacyCert = null;
    public long mBeginTime = 0;
    public C60401j mCameraClient;
    public ConditionVariable mCameraClientCondition = new ConditionVariable();
    public AbstractC60396i.AbstractC60397a mCameraEvent = new AbstractC60396i.AbstractC60397a() {
        /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass43 */

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: a */
        public void mo206500a(int i, AbstractC60396i iVar, Object obj) {
            C60427s.m234839a("TECameraServer", "onCameraClosed, CameraState = " + TECameraServer.this.mCurrentCameraState);
            synchronized (TECameraServer.this.mStateLock) {
                TECameraServer.this.updateCameraState(0);
            }
            TECameraServer.this.mCameraObserver.mo206865a(0);
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: b */
        public void mo206502b(int i, int i2, String str, Object obj) {
            C60427s.m234842b("TECameraServer", "onCameraInfo: " + i + ", ext: " + i2 + " msg: " + str);
            TECameraServer.this.mCameraObserver.mo206867a(i, i2, str);
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: a */
        public void mo206499a(int i, int i2, String str, Object obj) {
            C60427s.m234844d("TECameraServer", "onCameraError: code = " + i2 + ", msg = " + str);
            C60401j.AbstractC60402a aVar = TECameraServer.this.mCameraObserver;
            aVar.mo206868a(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f150674c + ",face:" + TECameraServer.this.mCameraSettings.f150676e + " " + TECameraServer.this.mCameraSettings.f150686o.toString() + " " + str);
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: c */
        public void mo206504c(int i, int i2, String str, Object obj) {
            if (!TECameraServer.this.mCameraSettings.ac || i2 != -437) {
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCameraInstance == null || TECameraServer.this.mCameraInstance.mo206844R() <= 0) {
                        mo206499a(i, i2, str, obj);
                        C60408m.m234769a("te_record_camera_preview_ret", (long) i2);
                    } else {
                        TECameraServer.this.mStartPreviewError = true;
                        C60427s.m234843c("TECameraServer", "Retry to startPreview. " + TECameraServer.this.mCameraInstance.mo206844R() + " times is waiting to retry.");
                        TECameraServer.this.mCameraInstance.mo206845S();
                        Handler handler = TECameraServer.this.mHandler;
                        if (handler != null) {
                            handler.postDelayed(new Runnable() {
                                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass43.RunnableC602872 */

                                public void run() {
                                    TECameraServer.this.start(TECameraServer.this.mCameraClient);
                                }
                            }, 100);
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
            C60408m.m234769a("te_record_camera_preview_ret", (long) i2);
            Handler handler2 = TECameraServer.this.mHandler;
            if (handler2 != null) {
                handler2.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass43.RunnableC602861 */

                    public void run() {
                        TECameraServer.this.handlePreviewingFallback();
                    }
                });
            }
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: a */
        public void mo206498a(int i, int i2, AbstractC60396i iVar, Object obj) {
            TECameraServer.this.mOpenTime = System.currentTimeMillis() - TECameraServer.this.mBeginTime;
            C60427s.m234839a("TECameraServer", "onCameraOpened: CameraType = " + TECameraServer.this.mCameraSettings.f150674c + ", Ret = " + i2 + ",retryCnt = " + TECameraServer.this.mRetryCnt);
            ConcurrentHashMap concurrentHashMap = TECameraServer.this.mOpenInfoMap;
            StringBuilder sb = new StringBuilder();
            sb.append("CamType");
            sb.append(TECameraServer.this.mRetryCnt);
            concurrentHashMap.put(sb.toString(), Integer.valueOf(TECameraServer.this.mCameraSettings.f150674c));
            TECameraServer.this.mOpenInfoMap.put("Ret" + TECameraServer.this.mRetryCnt, Integer.valueOf(i2));
            TECameraServer.this.mOpenInfoMap.put("OpenTime" + TECameraServer.this.mRetryCnt, Long.valueOf(TECameraServer.this.mOpenTime));
            if (i2 == 0) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.mRetryCnt = tECameraServer.mCameraSettings.f150691t;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 1) {
                        TECameraServer.this.updateCameraState(2);
                        TECameraServer.this.mCameraObserver.mo206866a(i, i2);
                        TECameraServer.this.mOpenInfoMap.put("ResultType", "Open Success");
                        C60408m.m234769a("te_record_camera_open_ret", (long) i2);
                        C60408m.m234769a("te_record_camera_open_cost", TECameraServer.this.mOpenTime);
                        C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                        C60427s.m234839a("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + TECameraServer.this.mOpenTime);
                        TECameraServer.this.mOpenInfoMap.clear();
                        return;
                    }
                    C60427s.m234843c("TECameraServer", "Open camera error ? May be closed now!!, state = " + TECameraServer.this.mCurrentCameraState);
                }
            } else if ((i == 7 || TECameraServer.this.mCameraSettings.f150674c == 11) && i2 == -428) {
                C60427s.m234839a("TECameraServer", "Cameraunit auth failed, fall back to camera2");
                TECameraServer tECameraServer2 = TECameraServer.this;
                tECameraServer2.mRetryCnt = tECameraServer2.mCameraSettings.f150691t;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        C60427s.m234843c("TECameraServer", "No need switch state: " + TECameraServer.this.mCurrentCameraState + " ==> " + 0);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.mCurrentCameraState = 0;
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.mo206657b(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                    }
                }
                TECameraServer.this.mCameraSettings.f150674c = 2;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else if (i2 != -403 && TECameraServer.this.mRetryCnt > 0 && TECameraServer.this.isCameraPermitted()) {
                TECameraServer.this.mCameraObserver.mo206868a(i2, "Retry to Open Camera Failed @" + TECameraServer.this.mCameraSettings.f150674c + ",face:" + TECameraServer.this.mCameraSettings.f150676e + " " + TECameraServer.this.mCameraSettings.f150686o.toString());
                if (TECameraServer.this.mIsCameraPendingClose) {
                    TECameraServer.this.mIsCameraPendingClose = false;
                    C60427s.m234844d("TECameraServer", "retry to open camera, but camera close was called");
                    TECameraServer.this.mRetryCnt = -1;
                    TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                    C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                    return;
                }
                if (i == 2 && TECameraServer.this.mRetryCnt == TECameraServer.this.mCameraSettings.f150691t && (i2 == 4 || i2 == 5 || i2 == 1)) {
                    C60427s.m234839a("TECameraServer", "camera2 is not available");
                    TECameraServer tECameraServer3 = TECameraServer.this;
                    tECameraServer3.mRetryCnt = tECameraServer3.mCameraSettings.f150693v;
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C60427s.m234839a("TECameraServer", "retry to open camera，mRetryCnt = " + TECameraServer.this.mRetryCnt);
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        C60427s.m234843c("TECameraServer", "No need switch state: " + TECameraServer.this.mCurrentCameraState + " ==> " + 0);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.updateCameraState(0);
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.mo206657b(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                    }
                }
                TECameraServer.this.mRetryCnt--;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            } else if ((!TECameraServer.this.mCameraSettings.f150654H || i == 1) && i2 != -403) {
                TECameraServer.this.mCameraObserver.mo206866a(i, i2);
                C60427s.m234839a("TECameraServer", "finally go to the error.");
                C60408m.m234769a("te_record_camera_open_ret", (long) i2);
                TECameraServer.this.mCameraObserver.mo206868a(i2, "Open camera failed @" + TECameraServer.this.mCameraSettings.f150674c + ",face:" + TECameraServer.this.mCameraSettings.f150676e + " " + TECameraServer.this.mCameraSettings.f150686o.toString());
                TECameraServer tECameraServer4 = TECameraServer.this;
                tECameraServer4.close(tECameraServer4.cachedOpenPrivacyCert);
                TECameraServer.this.mRetryCnt = -1;
                C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else {
                C60427s.m234839a("TECameraServer", "Open camera failed, fall back to camera1");
                TECameraServer tECameraServer5 = TECameraServer.this;
                tECameraServer5.mRetryCnt = tECameraServer5.mCameraSettings.f150691t;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        C60427s.m234843c("TECameraServer", "No need switch state: " + TECameraServer.this.mCurrentCameraState + " ==> " + 0);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.updateCameraState(0);
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.mo206657b(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                    }
                }
                TECameraServer.this.mCameraSettings.f150674c = 1;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                C60408m.m234770a("te_record_camera_open_info", TECameraServer.this.mOpenInfoMap.toString());
            }
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: b */
        public void mo206501b(int i, int i2, int i3, String str, Object obj) {
            C60427s.m234839a("TECameraServer", "stopCapture success!");
            mo206502b(i2, i3, str, obj);
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: a */
        public void mo206497a(int i, int i2, int i3, String str, Object obj) {
            C60427s.m234839a("TECameraServer", "startCapture success!");
            TECameraServer.this.mStartPreviewError = false;
            mo206502b(i2, i3, str, obj);
            C60408m.m234769a("te_record_camera_preview_ret", 0L);
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: c */
        public void mo206503c(int i, int i2, int i3, String str, Object obj) {
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("onTorchSuccess ");
            sb.append(str);
            if (i3 == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            sb.append(str2);
            C60427s.m234839a("TECameraServer", sb.toString());
        }

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60397a
        /* renamed from: d */
        public void mo206505d(int i, int i2, int i3, String str, Object obj) {
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("onTorchError ");
            sb.append(str);
            if (i3 == 0) {
                str2 = " close";
            } else {
                str2 = " open";
            }
            sb.append(str2);
            C60427s.m234839a("TECameraServer", sb.toString());
        }
    };
    public volatile AbstractC60396i mCameraInstance;
    public C60401j.AbstractC60402a mCameraObserver = new C60401j.C60403b();
    public TECameraSettings mCameraSettings;
    private Runnable mCheckCloseTask;
    public volatile int mCurrentCameraState = 0;
    private float mCurrentZoom;
    private boolean mEnableVBoost = false;
    private boolean mFirstEC = true;
    public boolean mFirstZoom = true;
    public Handler mHandler;
    private volatile boolean mHandlerDestroyed = true;
    private HandlerThread mHandlerThread;
    public volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private boolean mIsForegroundVisible = false;
    private volatile boolean mIsInitialized;
    private final Object mLock = new Object();
    public Handler mMainHandler;
    private boolean mOnBackGround = false;
    public ConcurrentHashMap mOpenInfoMap = new ConcurrentHashMap();
    public long mOpenTime = 0;
    private final AbstractC60396i.AbstractC60399c mPictureSizeCallBack = new AbstractC60396i.AbstractC60399c() {
        /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass44 */

        @Override // com.ss.android.ttvecamera.AbstractC60396i.AbstractC60399c
        /* renamed from: a */
        public TEFrameSizei mo206508a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (TECameraServer.this.mPictureSizeCallback != null) {
                return TECameraServer.this.mPictureSizeCallback.mo206869a(list, list2);
            }
            return null;
        }
    };
    public C60401j.AbstractC60404c mPictureSizeCallback;
    C60375c mProviderManager;
    private C60375c.C60376a mProviderSettings;
    public int mRetryCnt = -1;
    public TECameraSettings.AbstractC60303j mSATZoomCallback;
    public boolean mStartPreviewError = false;
    public final Object mStateLock = new Object();
    private TESystemResManager mSystemResManager;
    private int mVBoostTimeoutMS = 0;
    private volatile int sClientCount = 0;
    private AbstractC60396i.AbstractC60400d satZoomCallback = new AbstractC60396i.AbstractC60400d() {
        /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass46 */
    };

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public void changeCaptureFormat() {
    }

    public int getCameraState() {
        return getCameraState(false);
    }

    public int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo206666g();
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.mo206665f();
    }

    private void setAsyncCloseCheckMsg() {
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mCheckCloseTask);
            this.mMainHandler.postDelayed(this.mCheckCloseTask, 2000);
        }
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        C60427s.m234842b("TECameraServer", "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    public synchronized int decreaseClientCount() {
        this.sClientCount--;
        C60427s.m234842b("TECameraServer", "sClientCount = " + this.sClientCount);
        if (this.sClientCount < 0) {
            C60427s.m234843c("TECameraServer", "Invalid ClientCount = " + this.sClientCount);
            this.sClientCount = 0;
        }
        return this.sClientCount;
    }

    public synchronized int destroy() {
        C60427s.m234839a("TECameraServer", "destroy...");
        this.mIsInitialized = false;
        this.mMainHandler = null;
        this.mCheckCloseTask = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        this.mProviderSettings = null;
        if (this.mCameraInstance != null) {
            this.mCameraInstance.mo206838L();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602821 */

                public void run() {
                    AbstractC60370b b = TECameraServer.this.mProviderManager.mo206800b();
                    if (b != null) {
                        b.mo206791h();
                    }
                }
            });
        }
        if (this.mHandlerThread != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.mHandlerThread.quitSafely();
            } else {
                this.mHandlerThread.quit();
            }
            this.mHandlerThread = null;
            this.mHandlerDestroyed = true;
            this.mHandler = null;
        }
        this.mCameraObserver = C60401j.C60403b.m234757a();
        return 0;
    }

    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.f150674c != 1) {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo206654b();
                        updateCameraState(2);
                        this.mCameraInstance.mo206657b(this.cachedOpenPrivacyCert);
                        this.mCameraInstance = null;
                        updateCameraState(0);
                    }
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.mCameraSettings.f150674c = 1;
                this.mCameraEvent.mo206502b(51, 0, "need recreate surfacetexture", null);
                INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
            }
        }
    }

    public boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (ContextCompat.checkSelfPermission(this.mCameraSettings.f150673b, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            C60427s.m234844d("TECameraServer", "test camera permission failed!: " + e.toString());
        }
        ConcurrentHashMap concurrentHashMap = this.mOpenInfoMap;
        concurrentHashMap.put("CamPerm" + this.mRetryCnt, Boolean.valueOf(z));
        return z;
    }

    private AbstractC60396i createCameraInstance() {
        if (Build.VERSION.SDK_INT < 24) {
            return C60339d.m234340a(this.mCameraSettings.f150673b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.f150674c == 1) {
            return C60339d.m234340a(this.mCameraSettings.f150673b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.f150674c == 5 && Build.VERSION.SDK_INT > 28) {
            return C60407l.m234766a(this.mCameraSettings, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.f150674c == 7) {
            return C60426r.m234834a(this.mCameraSettings, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if (this.mCameraSettings.f150674c == 9) {
            return C60309a.m234245a(this.mCameraSettings, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if ((10 != this.mCameraSettings.f150674c && 11 != this.mCameraSettings.f150674c) || Build.VERSION.SDK_INT <= 28) {
            return C60362g.m234476a(this.mCameraSettings.f150674c, this.mCameraSettings.f150673b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        AbstractC60396i iVar = null;
        try {
            iVar = (AbstractC60396i) Class.forName("com.ss.android.ttvecamera.TEVendorCamera").getMethod("create", Integer.TYPE, Context.class, AbstractC60396i.AbstractC60397a.class, Handler.class, AbstractC60396i.AbstractC60399c.class).invoke(null, Integer.valueOf(this.mCameraSettings.f150674c), this.mCameraSettings.f150673b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        } catch (Exception e) {
            C60427s.m234840a("TECameraServer", "createCameraInstance for TEVendorCamera class failed, exception occurred", e);
        }
        if (iVar != null) {
            C60427s.m234839a("TECameraServer", "createCameraInstance TEVendorCamera");
            return iVar;
        }
        this.mCameraSettings.f150674c = 2;
        return C60362g.m234476a(this.mCameraSettings.f150674c, this.mCameraSettings.f150673b, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
    }

    public void appLifeCycleChanged(boolean z) {
        this.mOnBackGround = z;
    }

    public void setSATZoomCallback(TECameraSettings.AbstractC60303j jVar) {
        this.mSATZoomCallback = jVar;
    }

    public int close(PrivacyCert privacyCert) {
        return close(true, privacyCert);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ttvecamera.TECameraServer$a */
    public static class C60293a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<TECameraServer> f150645a;

        public C60293a(TECameraServer tECameraServer) {
            this.f150645a = new WeakReference<>(tECameraServer);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            TECameraServer tECameraServer = this.f150645a.get();
            if (i == 1) {
                C60427s.m234842b("TECameraServer", "startZoom...");
                synchronized (tECameraServer.mStateLock) {
                    if (tECameraServer.mCameraInstance != null) {
                        tECameraServer.mCameraInstance.mo206641a(((float) message.arg1) / 100.0f, (TECameraSettings.AbstractC60306m) obj);
                    }
                    if (tECameraServer.mFirstZoom) {
                        tECameraServer.mCameraEvent.mo206502b(SmEvents.EVENT_TO, 0, "startzoom", tECameraServer.mCameraInstance);
                        tECameraServer.mFirstZoom = false;
                    }
                }
            }
            return false;
        }
    }

    public int getCameraState(boolean z) {
        int i;
        if (!z) {
            return this.mCurrentCameraState;
        }
        synchronized (this.mStateLock) {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    public int getFlashMode(C60401j jVar) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.mo206668i();
    }

    public TECameraSettings.C60295b getCameraECInfo(C60401j jVar) {
        if (assertClient(jVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo206842P();
        }
        return null;
    }

    public int[] getPictureSize(C60401j jVar) {
        if (assertClient(jVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo206669j();
        }
        return null;
    }

    public boolean isSupportWhileBalance(C60401j jVar) {
        boolean z = false;
        if (!assertClient(jVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.mo206676q()) {
                z = true;
            }
        }
        return z;
    }

    public boolean isTorchSupported(C60401j jVar) {
        AbstractC60396i iVar;
        if (assertClient(jVar) && (iVar = this.mCameraInstance) != null && iVar.mo206677r()) {
            return true;
        }
        return false;
    }

    private boolean assertClient(C60401j jVar) {
        synchronized (this.mLock) {
            C60401j jVar2 = this.mCameraClient;
            if (jVar2 == jVar) {
                return true;
            }
            if (jVar2 == null) {
                C60427s.m234843c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
            } else {
                C60427s.m234843c("TECameraServer", "Invalid CameraClient, need : " + this.mCameraClient);
            }
            return false;
        }
    }

    private synchronized void init(boolean z) {
        C60427s.m234839a("TECameraServer", "init...");
        if (!this.mIsInitialized) {
            this.mHandler = createHandler(z, "TECameraServer");
            this.mHandlerDestroyed = false;
            this.mProviderManager = new C60375c();
            this.mIsInitialized = true;
            this.mCurrentZoom = BitmapDescriptorFactory.HUE_RED;
            this.mOnBackGround = false;
            this.mMainHandler = new Handler(Looper.getMainLooper());
            this.mSystemResManager = new TESystemResManager();
        }
    }

    public int cancelFocus(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass13 */

                public void run() {
                    TECameraServer.this.cancelFocus(jVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "cancelFocus...");
        synchronized (this.mStateLock) {
            this.mCameraInstance.mo206671l();
        }
        return 0;
    }

    public int enableCaf(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass14 */

                public void run() {
                    TECameraServer.this.enableCaf(jVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "enableCaf...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206672m();
            }
        }
        return 0;
    }

    public boolean isAutoExposureLockSupported(C60401j jVar) {
        if (!assertClient(jVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                return this.mCameraInstance.mo206674o();
            }
            C60427s.m234843c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
            return false;
        }
    }

    public boolean isAutoFocusLockSupported(C60401j jVar) {
        if (!assertClient(jVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                return this.mCameraInstance.mo206675p();
            }
            C60427s.m234843c("TECameraServer", "Can not get ae lock supported on state : " + this.mCurrentCameraState);
            return false;
        }
    }

    public boolean isSupportedExposureCompensation(C60401j jVar) {
        if (!assertClient(jVar)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.mo206673n();
        }
        C60427s.m234843c("TECameraServer", "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public int removeCameraProvider(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass50 */

                public void run() {
                    TECameraServer.this.removeCameraProvider(jVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "removeCameraProvider");
        synchronized (this.mStateLock) {
            this.mProviderManager.mo206798a();
        }
        return 0;
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            C60427s.m234843c("TECameraServer", "No need update state: " + i);
            return;
        }
        C60427s.m234839a("TECameraServer", "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i);
        this.mCurrentCameraState = i;
    }

    private boolean shouldReOpenCamera(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || (tECameraSettings2.f150674c == tECameraSettings.f150674c && this.mCameraSettings.f150686o.f150716a == tECameraSettings.f150686o.f150716a && this.mCameraSettings.f150686o.f150717b == tECameraSettings.f150686o.f150717b && this.mCameraSettings.f150676e == tECameraSettings.f150676e && this.mCameraSettings.f150656J == tECameraSettings.f150656J && this.mCameraSettings.f150663Q == tECameraSettings.f150663Q && this.mCameraSettings.f150647A == tECameraSettings.f150647A && this.mCameraSettings.f150690s == tECameraSettings.f150690s && this.mCameraSettings.f150694w == tECameraSettings.f150694w && this.mCameraSettings.f150696y == tECameraSettings.f150696y && !isARConfigNotEqual(tECameraSettings))) {
            return false;
        }
        return true;
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C60427s.m234843c("TECameraServer", "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    C60427s.m234844d("TECameraServer", "Invalidate camera state = " + i);
                    return false;
                } else if (this.mCurrentCameraState == 1) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.mCurrentCameraState != 0) {
                C60427s.m234843c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public void downExposureCompensation(final C60401j jVar) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass28 */

                    public void run() {
                        TECameraServer.this.downExposureCompensation(jVar);
                    }
                });
                return;
            }
            C60427s.m234839a("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.C60295b P = this.mCameraInstance.mo206842P();
                    if (P == null) {
                        this.mCameraObserver.mo206868a(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo206660c(P.f150705b - 1);
                    }
                } else {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                }
            }
        }
    }

    public int getExposureCompensation(C60401j jVar) {
        if (assertClient(jVar)) {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    return this.mCameraInstance.mo206843Q();
                }
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not get ec on state : " + this.mCurrentCameraState);
                return -105;
            }
        }
        throw new RuntimeException("Client is not connected!!!");
    }

    public void realCloseCamera(PrivacyCert privacyCert) {
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 0) {
                C60427s.m234843c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> " + 0);
            } else {
                updateCameraState(0);
                if (this.mCameraInstance != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.mCameraInstance.mo206657b(privacyCert);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C60427s.m234839a("TECameraServer", "system call close() cost: " + currentTimeMillis2);
                }
            }
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206838L();
                this.mCameraInstance = null;
            }
        }
    }

    public int startCameraFaceDetect(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602896 */

                public void run() {
                    TECameraServer.this.startCameraFaceDetect(jVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "startCameraFaceDetect");
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState != 3) {
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not start face detect on state : " + this.mCurrentCameraState);
                return -105;
            }
            this.mCameraInstance.mo206659c();
            return 0;
        }
    }

    public int startRecording(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C60427s.m234844d("TECameraServer", "mHandler is null!");
            return -112;
        } else if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass45 */

                public void run() {
                    TECameraServer.this.startRecording(jVar);
                }
            });
            return 0;
        } else {
            synchronized (this.mStateLock) {
                C60427s.m234839a("TECameraServer", "startRecording: client " + jVar);
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206762t();
                }
            }
            return 0;
        }
    }

    public int stopCameraFaceDetect(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602907 */

                public void run() {
                    TECameraServer.this.stopCameraFaceDetect(jVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "stopCameraFaceDetect");
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState != 3) {
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not stop face detect on state : " + this.mCurrentCameraState);
                return -105;
            }
            this.mCameraInstance.mo206662d();
            return 0;
        }
    }

    public int stopRecording(final C60401j jVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C60427s.m234844d("TECameraServer", "mHandler is null!");
            return -112;
        } else if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass48 */

                public void run() {
                    TECameraServer.this.stopRecording(jVar);
                }
            });
            return 0;
        } else {
            synchronized (this.mStateLock) {
                C60427s.m234839a("TECameraServer", "stopRecording: client " + jVar);
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206763u();
                }
            }
            return 0;
        }
    }

    public void upExposureCompensation(final C60401j jVar) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass27 */

                    public void run() {
                        TECameraServer.this.upExposureCompensation(jVar);
                    }
                });
                return;
            }
            C60427s.m234839a("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.C60295b P = this.mCameraInstance.mo206842P();
                    if (P == null) {
                        this.mCameraObserver.mo206868a(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo206660c(P.f150705b + 1);
                    }
                } else {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Can not set ec on state : " + this.mCurrentCameraState);
                }
            }
        }
    }

    private boolean isARConfigNotEqual(TECameraSettings tECameraSettings) {
        if (this.mCameraSettings == null) {
            return true;
        }
        if (tECameraSettings.f150696y != 2) {
            return false;
        }
        if (this.mCameraSettings.al != null && this.mCameraSettings.al.f150698a.ordinal() == tECameraSettings.al.f150698a.ordinal() && this.mCameraSettings.al.f150699b.ordinal() == tECameraSettings.al.f150699b.ordinal() && this.mCameraSettings.al.f150700c.ordinal() == tECameraSettings.al.f150700c.ordinal() && this.mCameraSettings.al.f150701d.ordinal() == tECameraSettings.al.f150701d.ordinal() && this.mCameraSettings.al.f150702e.ordinal() == tECameraSettings.al.f150702e.ordinal() && this.mCameraSettings.al.f150703f.ordinal() == tECameraSettings.al.f150703f.ordinal()) {
            return false;
        }
        return true;
    }

    private boolean onlySwitchSession(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || tECameraSettings2.f150676e != 0 || tECameraSettings.f150676e != 0) {
            return false;
        }
        if ((this.mCameraSettings.f150674c != 7 && this.mCameraSettings.f150674c != 11) || this.mCameraSettings.f150674c != tECameraSettings.f150674c || this.mCameraSettings.f150686o.f150716a != tECameraSettings.f150686o.f150716a || this.mCameraSettings.f150686o.f150717b != tECameraSettings.f150686o.f150717b || this.mCameraSettings.f150656J != tECameraSettings.f150656J || this.mCameraSettings.f150647A != tECameraSettings.f150647A || this.mCameraSettings.f150690s != tECameraSettings.f150690s || this.mCameraSettings.f150694w != tECameraSettings.f150694w || this.mCameraSettings.f150663Q == tECameraSettings.f150663Q || this.mCameraSettings.f150664R == tECameraSettings.f150664R) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_video_stabilization", tECameraSettings.f150663Q);
        bundle.putBoolean("enable_ai_night_video", tECameraSettings.f150664R);
        this.mCameraInstance.mo206645a(bundle);
        this.mCameraSettings = tECameraSettings;
        return true;
    }

    public int stop(final C60401j jVar) {
        C60427s.m234839a("TECameraServer", "stop: client " + jVar);
        if (!assertClient(jVar)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C60427s.m234844d("TECameraServer", "mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602832 */

                public void run() {
                    TECameraServer.this.stop(jVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    C60427s.m234843c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> " + 2);
                    return 0;
                } else if (this.mCurrentCameraState != 3) {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> " + 2);
                    return -105;
                } else {
                    updateCameraState(2);
                    this.mCameraInstance.mo206654b();
                }
            }
        }
        return 0;
    }

    public int start(final C60401j jVar) {
        C60427s.m234839a("TECameraServer", "start: client " + jVar);
        if (!assertClient(jVar)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null || tECameraSettings.f150673b == null) {
            C60427s.m234844d("TECameraServer", "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C60427s.m234844d("TECameraServer", "mHandler is null!");
            return -112;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass51 */

                public void run() {
                    TECameraServer.this.start(jVar);
                    if (TECameraServer.this.mCameraSettings.f150682k) {
                        TECameraServer.this.mCameraClientCondition.open();
                    }
                }
            });
            if (this.mCameraSettings.f150682k) {
                long currentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C60427s.m234839a("TECameraServer", "Camera start cost: " + currentTimeMillis2 + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    C60427s.m234843c("TECameraServer", "No need switch state: " + this.mCurrentCameraState + " ==> " + 3);
                    if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                        return 0;
                    }
                    this.mCameraInstance.mo206654b();
                    updateCameraState(2);
                    this.mIsCameraProviderChanged = false;
                }
                if (this.mCurrentCameraState != 2) {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> " + 3);
                    return -105;
                }
                this.mCameraObserver.mo206867a(3, this.mCurrentCameraState, "Camera state: opened");
                this.mCameraInstance.mo206640a();
                updateCameraState(3);
                C60408m.m234769a("te_record_camera_type", (long) this.mCameraInstance.mo206664e());
                C60408m.m234770a("te_preview_camera_resolution", this.mCameraSettings.f150686o.f150716a + "*" + this.mCameraSettings.f150686o.f150717b);
                C60408m.m234768a("te_record_camera_frame_rate", (double) this.mCameraSettings.f150675d.f151003b);
                C60408m.m234769a("te_record_camera_direction", (long) this.mCameraSettings.f150676e);
            }
        }
        return 0;
    }

    public int disConnect(C60401j jVar, PrivacyCert privacyCert) {
        return disConnect(jVar, true, privacyCert);
    }

    public void notifyHostForegroundVisible(C60401j jVar, boolean z) {
        if (assertClient(jVar)) {
            this.mIsForegroundVisible = z;
            C60427s.m234839a("TECameraServer", "is foreground visible: " + z);
        }
    }

    public int getISO(final C60401j jVar, final TECameraSettings.AbstractC60298e eVar) {
        int i = -1;
        if (!assertClient(jVar)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass35 */

                public void run() {
                    int iso = TECameraServer.this.getISO(jVar, eVar);
                    if (iso >= 0) {
                        eVar.mo206527a(iso);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    i = this.mCameraInstance.mo206748B();
                }
            }
        }
        return i;
    }

    public float getManualFocusAbility(final C60401j jVar, final TECameraSettings.AbstractC60299f fVar) {
        float f = -1.0f;
        if (!assertClient(jVar)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass15 */

                public void run() {
                    float manualFocusAbility = TECameraServer.this.getManualFocusAbility(jVar, fVar);
                    if (manualFocusAbility >= BitmapDescriptorFactory.HUE_RED) {
                        fVar.mo206529a(manualFocusAbility);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    f = this.mCameraInstance.mo206767z();
                }
            }
        }
        return f;
    }

    public int process(final C60401j jVar, final TECameraSettings.C60300g gVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass25 */

                public void run() {
                    TECameraServer.this.process(jVar, gVar);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206850a(gVar);
            }
        }
        return 0;
    }

    public float queryShaderZoomStep(final C60401j jVar, final TECameraSettings.AbstractC60304k kVar) {
        if (!assertClient(jVar)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass20 */

                public void run() {
                    TECameraServer.this.queryShaderZoomStep(jVar, kVar);
                }
            });
            return BitmapDescriptorFactory.HUE_RED;
        }
        C60427s.m234839a("TECameraServer", "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206648a(kVar);
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public void setAperture(final C60401j jVar, final float f) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass39 */

                    public void run() {
                        TECameraServer.this.setAperture(jVar, f);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206756b(f);
                }
            }
        }
    }

    public int setFeatureParameters(final C60401j jVar, final Bundle bundle) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass24 */

                public void run() {
                    TECameraServer.this.setFeatureParameters(jVar, bundle);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206645a(bundle);
            }
        }
        return 0;
    }

    public void setISO(final C60401j jVar, final int i) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass33 */

                    public void run() {
                        TECameraServer.this.setISO(jVar, i);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206760f(i);
                }
            }
        }
    }

    public void setManualFocusDistance(final C60401j jVar, final float f) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass16 */

                    public void run() {
                        TECameraServer.this.setManualFocusDistance(jVar, f);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206754a(f);
                }
            }
        }
    }

    public void setSceneMode(C60401j jVar, final int i) {
        if (assertClient(jVar)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass18 */

                    public void run() {
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.mo206642a(i);
                        }
                    }
                });
                return;
            }
            return;
        }
        C60427s.m234843c("TECameraServer", "set scnen failed: " + i);
    }

    public void setShutterTime(final C60401j jVar, final long j) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass37 */

                    public void run() {
                        TECameraServer.this.setShutterTime(jVar, j);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206755a(j);
                }
            }
        }
    }

    public int stopZoom(final C60401j jVar, final TECameraSettings.AbstractC60306m mVar) {
        if (!assertClient(jVar)) {
            C60427s.m234844d("TECameraServer", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass21 */

                public void run() {
                    TECameraServer.this.stopZoom(jVar, mVar);
                }
            });
            return 0;
        } else {
            C60427s.m234839a("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206649a(mVar);
                }
            }
            return 0;
        }
    }

    public int takePicture(C60401j jVar, final TECameraSettings.AbstractC60302i iVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass10 */

            public void run() {
                C60427s.m234839a("TECameraServer", "takePicture");
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 3) {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.mo206868a(-105, str);
                        C60427s.m234844d("TECameraServer", str);
                        TECameraSettings.AbstractC60302i iVar = iVar;
                        if (iVar != null) {
                            iVar.mo206532a(new Exception(str));
                        }
                        return;
                    }
                    if (TECameraServer.this.mCameraSettings.f150674c == 1) {
                        TECameraServer.this.updateCameraState(2);
                    }
                    TECameraServer.this.mCameraInstance.mo206647a(iVar);
                }
            }
        });
        return 0;
    }

    private TECameraServer() {
    }

    private Handler createHandler(boolean z, String str) {
        Looper looper;
        if (z) {
            try {
                HandlerThread handlerThread = this.mHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
                new_android_os_HandlerThread_by_knot.start();
                new_android_os_HandlerThread_by_knot.getLooper().setMessageLogging(new Printer() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass42 */

                    /* renamed from: b */
                    private long f150607b;

                    /* renamed from: c */
                    private int f150608c;

                    /* renamed from: d */
                    private long f150609d;

                    public void println(String str) {
                        if (str.startsWith(">>>>> Dispatching to Handler")) {
                            this.f150607b = System.currentTimeMillis();
                        } else if (str.startsWith("<<<<< Finished to Handler")) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f150607b;
                            if (currentTimeMillis > 1000) {
                                int i = this.f150608c + 1;
                                this.f150608c = i;
                                C60408m.m234769a("te_record_camera_task_time_out_count", (long) i);
                                if (currentTimeMillis > this.f150609d) {
                                    this.f150609d = currentTimeMillis;
                                    C60408m.m234769a("te_record_camera_max_lag_task_cost", currentTimeMillis);
                                    C60427s.m234839a("TECameraServer", "task: " + str + ", cost: " + currentTimeMillis + "ms");
                                }
                            }
                        }
                    }
                });
                this.mHandlerThread = new_android_os_HandlerThread_by_knot;
                return new Handler(new_android_os_HandlerThread_by_knot.getLooper(), new C60293a(this));
            } catch (Exception e) {
                C60427s.m234844d("TECameraServer", "CreateHandler failed!: " + e.toString());
            }
        }
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        return new Handler(looper);
    }

    public int addCameraProvider(final C60401j jVar, final C60375c.C60376a aVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            C60427s.m234839a("TECameraServer", "addCameraProvider");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.mo206868a(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                if (!(this.mProviderSettings == null || this.mCameraInstance.mo206836J() == null)) {
                    C60375c.C60376a aVar2 = this.mProviderSettings;
                    if (aVar2 == null || aVar2.mo206808b(aVar)) {
                        this.mIsCameraProviderChanged = false;
                    }
                }
                this.mProviderManager.mo206799a(aVar, this.mCameraInstance);
                this.mIsCameraProviderChanged = true;
                C60375c.C60376a aVar3 = this.mProviderSettings;
                if (aVar3 == null) {
                    this.mProviderSettings = new C60375c.C60376a(aVar);
                } else {
                    aVar3.mo206807a(aVar);
                }
            }
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass49 */

                public void run() {
                    TECameraServer.this.addCameraProvider(jVar, aVar);
                }
            });
        }
        return 0;
    }

    public int focusAtPoint(final C60401j jVar, final C60420o oVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass11 */

                public void run() {
                    int focusAtPoint = TECameraServer.this.focusAtPoint(jVar, oVar);
                    if (focusAtPoint != 0 && oVar.mo206893a() != null) {
                        oVar.mo206893a().mo206916a(focusAtPoint, TECameraServer.this.mCameraSettings.f150676e, "");
                    }
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "focusAtPoint at: " + oVar);
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                this.mCameraInstance.mo206651a(oVar);
                return 0;
            }
            C60401j.AbstractC60402a aVar = this.mCameraObserver;
            aVar.mo206868a(-105, "Can not set focus on state : " + this.mCurrentCameraState);
            return -105;
        }
    }

    public float[] getApertureRange(final C60401j jVar, final TECameraSettings.AbstractC60294a aVar) {
        float[] fArr = {0.0f};
        if (!assertClient(jVar)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass38 */

                public void run() {
                    float[] apertureRange = TECameraServer.this.getApertureRange(jVar, aVar);
                    if (apertureRange != null) {
                        aVar.mo206523a(apertureRange);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    fArr = this.mCameraInstance.mo206750D();
                }
            }
        }
        return fArr;
    }

    public float[] getFOV(final C60401j jVar, final TECameraSettings.AbstractC60296c cVar) {
        float[] fArr = new float[2];
        if (!assertClient(jVar)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602918 */

                public void run() {
                    float[] fov = TECameraServer.this.getFOV(jVar, cVar);
                    TECameraSettings.AbstractC60296c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo206526a(fov);
                    }
                }
            });
        } else {
            C60427s.m234839a("TECameraServer", "getFOV");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Can not getFOV on state : " + this.mCurrentCameraState);
                    return new float[]{-2.0f, -2.0f};
                }
                fArr = this.mCameraInstance.mo206670k();
            }
        }
        return fArr;
    }

    public int[] getISORange(final C60401j jVar, final TECameraSettings.AbstractC60298e eVar) {
        int[] iArr = new int[2];
        if (!assertClient(jVar)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass32 */

                public void run() {
                    int[] iSORange = TECameraServer.this.getISORange(jVar, eVar);
                    if (iSORange != null) {
                        eVar.mo206528a(iSORange);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    iArr = this.mCameraInstance.mo206747A();
                }
            }
        }
        return iArr;
    }

    public long[] getShutterTimeRange(final C60401j jVar, final TECameraSettings.AbstractC60305l lVar) {
        long[] jArr = new long[2];
        if (!assertClient(jVar)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass36 */

                public void run() {
                    long[] shutterTimeRange = TECameraServer.this.getShutterTimeRange(jVar, lVar);
                    if (shutterTimeRange != null) {
                        lVar.mo206534a(shutterTimeRange);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    jArr = this.mCameraInstance.mo206749C();
                }
            }
        }
        return jArr;
    }

    public void setAutoExposureLock(final C60401j jVar, final boolean z) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass29 */

                    public void run() {
                        TECameraServer.this.setAutoExposureLock(jVar, z);
                    }
                });
                return;
            }
            C60427s.m234839a("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo206652a(z);
                    return;
                }
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
            }
        }
    }

    public void setAutoFocusLock(final C60401j jVar, final boolean z) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass30 */

                    public void run() {
                        TECameraServer.this.setAutoFocusLock(jVar, z);
                    }
                });
                return;
            }
            C60427s.m234842b("TECameraServer", "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo206658b(z);
                    return;
                }
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
            }
        }
    }

    public void setExposureCompensation(final C60401j jVar, final int i) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass26 */

                    public void run() {
                        TECameraServer.this.setExposureCompensation(jVar, i);
                    }
                });
                return;
            }
            C60427s.m234839a("TECameraServer", "setExposureCompensation: " + i);
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo206660c(i);
                    if (this.mFirstEC) {
                        this.mCameraEvent.mo206502b(115, 0, "exposure compensation", this.mCameraInstance);
                        this.mFirstEC = false;
                    }
                    return;
                }
                C60401j.AbstractC60402a aVar = this.mCameraObserver;
                aVar.mo206868a(-105, "Can not set ec on state : " + this.mCurrentCameraState);
            }
        }
    }

    public int switchCameraMode(final C60401j jVar, final int i) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (jVar.f150970a.f150674c == 1) {
            return -100;
        }
        if (i != 1 && i != 0 && i != 2) {
            return -100;
        }
        if (jVar.f150970a.f150696y == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass34 */

                public void run() {
                    TECameraServer.this.switchCameraMode(jVar, i);
                }
            });
        } else {
            C60427s.m234839a("TECameraServer", "switchCameraMode");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C60401j.AbstractC60402a aVar = this.mCameraObserver;
                    aVar.mo206868a(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> " + 3);
                    return -105;
                }
                this.mCameraInstance.mo206656b(i);
            }
        }
        return 0;
    }

    public int switchFlashMode(final C60401j jVar, final int i) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass41 */

                public void run() {
                    TECameraServer.this.switchFlashMode(jVar, i);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "switchFlashMode: " + i);
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206663d(i);
                this.mCameraEvent.mo206502b(SmEvents.EVENT_RS, i, "", this.mCameraInstance);
            }
        }
        return 0;
    }

    public int toggleTorch(final C60401j jVar, final boolean z) {
        if (!assertClient(jVar)) {
            C60427s.m234844d("TECameraServer", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        } else if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass40 */

                public void run() {
                    TECameraServer.this.toggleTorch(jVar, z);
                }
            });
            return 0;
        } else {
            C60427s.m234839a("TECameraServer", "toggleTorch: " + z);
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206661c(z);
                }
            }
            return 0;
        }
    }

    public int close(final boolean z, final PrivacyCert privacyCert) {
        Handler handler = this.mHandler;
        if (handler == null) {
            C60427s.m234844d("TECameraServer", "mHandler is null!");
            return -112;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            C60427s.m234839a("TECameraServer", "close... sync:" + z);
            if (this.mEnableVBoost) {
                this.mSystemResManager.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                realCloseCamera(privacyCert);
                this.mSystemResManager.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.RESTORE_CPU));
            } else {
                realCloseCamera(privacyCert);
            }
            Handler handler2 = this.mMainHandler;
            if (handler2 != null) {
                handler2.removeCallbacks(this.mCheckCloseTask);
                C60427s.m234839a("TECameraServer", "remove check close task");
            }
            if (!z && decreaseClientCount() == 0) {
                return destroy();
            }
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            handler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602843 */

                public void run() {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C60427s.m234839a("TECameraServer", "Push close task cost: " + currentTimeMillis);
                    TECameraServer.this.close(z, privacyCert);
                    TECameraServer.this.mIsCameraPendingClose = false;
                    if (z) {
                        TECameraServer.this.mCameraClientCondition.open();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    C60408m.m234769a("te_record_camera_push_close_task_time", currentTimeMillis);
                    C60408m.m234769a("te_record_camera_close_cost", currentTimeMillis2);
                    C60427s.m234838a("te_record_camera_close_cost", Long.valueOf(currentTimeMillis2));
                }
            });
            if (z) {
                this.mCameraClientCondition.block(5000);
                if (this.mIsCameraPendingClose) {
                    C60427s.m234839a("TECameraServer", "camera close blocked timeout, retry close camera");
                    realCloseCamera(privacyCert);
                    this.mIsCameraPendingClose = false;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C60427s.m234839a("TECameraServer", "Camera close cost: " + currentTimeMillis2 + "ms");
                if (currentTimeMillis2 >= 5000) {
                    C60427s.m234844d("TECameraServer", "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                }
            }
        }
        return 0;
    }

    public void queryFeatures(String str, Bundle bundle) {
        if (this.mCameraInstance != null) {
            Bundle a = this.mCameraInstance.mo206847a(str);
            if (a == null) {
                C60427s.m234844d("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (a.containsKey(str2)) {
                    Class a2 = TECameraSettings.C60297d.m234221a(str2);
                    if (a2 == Boolean.class) {
                        bundle.putBoolean(str2, a.getBoolean(str2));
                    } else if (a2 == Integer.class) {
                        bundle.putInt(str2, a.getInt(str2));
                    } else if (a2 == Long.class) {
                        bundle.putLong(str2, a.getLong(str2));
                    } else if (a2 == Float.class) {
                        bundle.putFloat(str2, a.getFloat(str2));
                    } else if (a2 == Double.class) {
                        bundle.putDouble(str2, a.getDouble(str2));
                    } else if (a2 == String.class) {
                        bundle.putString(str2, a.getString(str2));
                    } else if (a2 == ArrayList.class) {
                        bundle.putParcelableArrayList(str2, a.getParcelableArrayList(str2));
                    } else if (a2 == TEFrameSizei.class) {
                        bundle.putParcelable(str2, a.getParcelable(str2));
                    } else if (a2 == TEFocusParameters.class) {
                        bundle.putParcelable(str2, a.getParcelable(str2));
                    } else {
                        C60427s.m234843c("TECameraServer", "Not supported key:" + str2);
                    }
                }
            }
            return;
        }
        C60427s.m234844d("TECameraServer", "queryFeatures: camera instance null");
    }

    private Message createMessage(int i, boolean z, Handler handler) {
        Message message;
        if (!z || !handler.hasMessages(i)) {
            message = handler.obtainMessage();
        } else {
            handler.removeMessages(i);
            message = new Message();
        }
        message.what = i;
        return message;
    }

    public TEFrameSizei getBestPreviewSize(C60401j jVar, float f, TEFrameSizei tEFrameSizei) {
        if (!assertClient(jVar) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo206639a(f, tEFrameSizei);
    }

    public int queryZoomAbility(final C60401j jVar, final TECameraSettings.AbstractC60306m mVar, final boolean z) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass19 */

                public void run() {
                    TECameraServer.this.queryZoomAbility(jVar, mVar, z);
                }
            });
            return 0;
        }
        C60427s.m234839a("TECameraServer", "queryZoomAbility...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.mo206650a(mVar, z);
            }
        }
        return 0;
    }

    public void setPictureSize(C60401j jVar, final int i, final int i2) {
        if (assertClient(jVar)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass17 */

                    public void run() {
                        if (TECameraServer.this.mCurrentCameraState != 3) {
                            C60427s.m234844d("TECameraServer", "set picture size failed, w: " + i + ", h: " + i2 + ", state: " + TECameraServer.this.mCurrentCameraState);
                            return;
                        }
                        TECameraServer.this.mCameraInstance.mo206643a(i, i2);
                    }
                });
                return;
            }
            return;
        }
        C60427s.m234843c("TECameraServer", "set picture size failed, w: " + i + ", h: " + i2);
    }

    public void setWhileBalance(final C60401j jVar, final boolean z, final String str) {
        if (assertClient(jVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass31 */

                    public void run() {
                        TECameraServer.this.setWhileBalance(jVar, z, str);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                C60427s.m234839a("TECameraServer", "setWhileBalance...");
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206653a(z, str);
                }
            }
        }
    }

    public int changeRecorderState(final C60401j jVar, final int i, final AbstractC60396i.AbstractC60398b bVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.mo206868a(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.mo206849a(i, bVar);
                return 0;
            }
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass47 */

            public void run() {
                TECameraServer.this.changeRecorderState(jVar, i, bVar);
            }
        });
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (decreaseClientCount() != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        return destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        setAsyncCloseCheckMsg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r3.cachedClosePrivacyCert = r6;
        close(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r5 == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int disConnect(com.ss.android.ttvecamera.C60401j r4, boolean r5, com.bytedance.bpea.basics.PrivacyCert r6) {
        /*
            r3 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "disConnect with client: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.ss.android.ttvecamera.C60427s.m234839a(r0, r1)
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.ss.android.ttvecamera.j r1 = r3.mCameraClient     // Catch:{ all -> 0x0043 }
            if (r1 != r4) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            r4 = 0
            r3.mCameraClient = r4     // Catch:{ all -> 0x0043 }
            android.os.Handler r1 = r3.mHandler     // Catch:{ all -> 0x0043 }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            r3.cachedClosePrivacyCert = r6
            r3.close(r5, r6)
            if (r5 == 0) goto L_0x003a
            int r4 = r3.decreaseClientCount()
            if (r4 != 0) goto L_0x003d
            int r4 = r3.destroy()
            return r4
        L_0x003a:
            r3.setAsyncCloseCheckMsg()
        L_0x003d:
            r4 = 0
            return r4
        L_0x003f:
            r4 = -100
            monitor-exit(r0)
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.TECameraServer.disConnect(com.ss.android.ttvecamera.j, boolean, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public int startZoom(C60401j jVar, float f, TECameraSettings.AbstractC60306m mVar) {
        if (!assertClient(jVar)) {
            C60427s.m234844d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        AbstractC60396i iVar = this.mCameraInstance;
        if (iVar == null) {
            C60427s.m234844d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C60427s.m234843c("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float abs = Math.abs(f - this.mCurrentZoom);
        if (Math.abs(f - iVar.f150967x) < 0.1f) {
            f = iVar.f150967x;
        } else if (Math.abs(f) < 0.1f) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else if (abs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f;
        Message createMessage = createMessage(1, true, this.mHandler);
        createMessage.arg1 = (int) (f * 100.0f);
        createMessage.obj = mVar;
        this.mHandler.sendMessage(createMessage);
        return 0;
    }

    public int zoomV2(final C60401j jVar, final float f, final TECameraSettings.AbstractC60306m mVar) {
        if (!assertClient(jVar)) {
            C60427s.m234844d("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass22 */

                public void run() {
                    TECameraServer.this.zoomV2(jVar, f, mVar);
                }
            });
        } else {
            C60427s.m234839a("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo206655b(f, mVar);
                }
                if (this.mFirstZoom) {
                    this.mCameraEvent.mo206502b(SmEvents.EVENT_TO, 0, "zoomV2", this.mCameraInstance);
                    this.mFirstZoom = false;
                }
            }
        }
        return 0;
    }

    public int open(final C60401j jVar, final TECameraSettings tECameraSettings, final PrivacyCert privacyCert) {
        int i;
        if (!assertClient(jVar)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            C60427s.m234844d("TECameraServer", "pending close");
            return -105;
        } else if (!tECameraSettings.ad || !this.mOnBackGround) {
            Handler handler = this.mHandler;
            if (handler == null) {
                C60427s.m234844d("TECameraServer", "mHandler is null!");
                return -112;
            } else if (this.mIsCameraPendingClose) {
                C60427s.m234844d("TECameraServer", "had called disConnect(), abandon open camera!");
                return -113;
            } else {
                if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
                    this.mCameraSettings = tECameraSettings;
                    this.mCheckCloseTask = new Runnable() {
                        /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass23 */

                        public void run() {
                            if (TECameraServer.this.mCurrentCameraState > 1) {
                                C60427s.m234844d("TECameraServer", "close camera in main thread");
                                if (!TECameraServer.this.mCameraSettings.f150660N || TECameraServer.this.mCameraInstance == null) {
                                    TECameraServer tECameraServer = TECameraServer.this;
                                    tECameraServer.realCloseCamera(tECameraServer.cachedClosePrivacyCert);
                                } else {
                                    TECameraServer.this.mCameraInstance.mo206646a(TECameraServer.this.cachedClosePrivacyCert);
                                }
                                if (TECameraServer.this.decreaseClientCount() == 0) {
                                    TECameraServer.this.destroy();
                                }
                            } else if (TECameraServer.this.mMainHandler != null) {
                                TECameraServer.this.mMainHandler.postDelayed(this, 2000);
                            }
                        }
                    };
                    this.mCurrentZoom = BitmapDescriptorFactory.HUE_RED;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = tECameraSettings.f150691t;
                    }
                    synchronized (this.mStateLock) {
                        if (this.mCurrentCameraState != 0) {
                            C60427s.m234843c("TECameraServer", "No need open camera again, state = " + this.mCurrentCameraState);
                            if (this.mCurrentCameraState != 1) {
                                this.mCameraObserver.mo206867a(1, 0, "Camera features is ready");
                            }
                            return 0;
                        }
                        updateCameraState(1);
                        if (this.mCameraInstance == null) {
                            this.mCameraInstance = createCameraInstance();
                            if (this.mCameraInstance == null) {
                                if (this.mCameraSettings.f150674c != 7) {
                                    if (this.mCameraSettings.f150674c != 11) {
                                        updateCameraState(0);
                                        this.mCameraObserver.mo206868a(-100, "open : mCameraInstance is null.");
                                        return -1;
                                    }
                                }
                                updateCameraState(0);
                                this.mCameraEvent.mo206498a(this.mCameraSettings.f150674c, -428, (AbstractC60396i) null, (Object) null);
                                return -1;
                            }
                            this.mCameraInstance.mo206852a(this.satZoomCallback);
                        }
                        this.mBeginTime = System.currentTimeMillis();
                        if (this.mEnableVBoost) {
                            this.mSystemResManager.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                            i = this.mCameraInstance.mo206638a(this.mCameraSettings, privacyCert);
                            this.mSystemResManager.mo206924a(new TESystemResManager.C60430a(TESystemResManager.ActionType.RESTORE_CPU));
                        } else {
                            i = this.mCameraInstance.mo206638a(this.mCameraSettings, privacyCert);
                        }
                        if (i != 0) {
                            C60427s.m234843c("TECameraServer", "Open camera failed, ret = " + i);
                        }
                    }
                } else {
                    final long currentTimeMillis = System.currentTimeMillis();
                    handler.post(new Runnable() {
                        /* class com.ss.android.ttvecamera.TECameraServer.AnonymousClass12 */

                        public void run() {
                            C60427s.m234839a("TECameraServer", "Push open task cost: " + (System.currentTimeMillis() - currentTimeMillis));
                            C60408m.m234769a("te_record_camera_push_open_task_time", System.currentTimeMillis() - currentTimeMillis);
                            TECameraServer.this.open(jVar, tECameraSettings, privacyCert);
                            C60427s.m234839a("TECameraServer", "Camera open cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                        }
                    });
                }
                return 0;
            }
        } else {
            C60427s.m234844d("TECameraServer", "in background");
            return -105;
        }
    }

    public int switchCamera(final C60401j jVar, final int i, final PrivacyCert privacyCert) {
        C60427s.m234839a("TECameraServer", "switchCamera: " + i);
        if (!assertClient(jVar)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null) {
            C60427s.m234844d("TECameraServer", "switchCamera failed: " + i);
            return -108;
        } else if (tECameraSettings.f150676e == i) {
            return -423;
        } else {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602854 */

                    public void run() {
                        TECameraServer.this.switchCamera(jVar, i, privacyCert);
                    }
                });
            } else {
                synchronized (this.mStateLock) {
                    if (this.mCurrentCameraState == 1) {
                        this.mCameraObserver.mo206868a(-105, "Camera is opening, ignore this switch request.");
                        return -105;
                    }
                    this.mCameraSettings.f150676e = i;
                    this.mCurrentZoom = BitmapDescriptorFactory.HUE_RED;
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            if (this.mCameraSettings.f150674c != 7) {
                                if (this.mCameraSettings.f150674c != 11) {
                                    this.mCameraObserver.mo206868a(-100, "open : mCameraInstance is null.");
                                    return -1;
                                }
                            }
                            this.mCameraEvent.mo206498a(this.mCameraSettings.f150674c, -428, (AbstractC60396i) null, (Object) null);
                            return -1;
                        }
                    }
                    if (this.mCurrentCameraState != 0) {
                        this.mCameraInstance.mo206657b(privacyCert);
                        updateCameraState(0);
                    }
                    updateCameraState(1);
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.f150691t;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    int a = this.mCameraInstance.mo206638a(this.mCameraSettings, privacyCert);
                    if (a != 0) {
                        C60401j.AbstractC60402a aVar = this.mCameraObserver;
                        aVar.mo206868a(a, "Switch camera failed @" + this.mCameraSettings.f150674c + ",face:" + this.mCameraSettings.f150676e + " " + this.mCameraSettings.f150686o.toString());
                    }
                }
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
        close(r8);
        open(r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int switchCamera(final com.ss.android.ttvecamera.C60401j r6, final com.ss.android.ttvecamera.TECameraSettings r7, final com.bytedance.bpea.basics.PrivacyCert r8) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.TECameraServer.switchCamera(com.ss.android.ttvecamera.j, com.ss.android.ttvecamera.TECameraSettings, com.bytedance.bpea.basics.PrivacyCert):int");
    }

    public int takePicture(C60401j jVar, final int i, final int i2, final TECameraSettings.AbstractC60302i iVar) {
        if (!assertClient(jVar)) {
            return -108;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.android.ttvecamera.TECameraServer.RunnableC602929 */

            public void run() {
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 3) {
                        String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                        TECameraServer.this.mCameraObserver.mo206868a(-105, str);
                        C60427s.m234844d("TECameraServer", str);
                        TECameraSettings.AbstractC60302i iVar = iVar;
                        if (iVar != null) {
                            iVar.mo206532a(new Exception(str));
                        }
                        return;
                    }
                    if (TECameraServer.this.mCameraSettings.f150674c == 1) {
                        TECameraServer.this.updateCameraState(2);
                    }
                    TECameraServer.this.mCameraInstance.mo206644a(i, i2, iVar);
                }
            }
        });
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        increaseClientCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        com.ss.android.ttvecamera.C60427s.m234839a("TECameraServer", "reopen camera.");
        close(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        r4.mIsCameraPendingClose = false;
        r4.cachedOpenPrivacyCert = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return open(r5, r7, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int connect(com.ss.android.ttvecamera.C60401j r5, com.ss.android.ttvecamera.C60401j.AbstractC60402a r6, com.ss.android.ttvecamera.TECameraSettings r7, com.ss.android.ttvecamera.C60401j.AbstractC60404c r8, com.bytedance.bpea.basics.PrivacyCert r9) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.TECameraServer.connect(com.ss.android.ttvecamera.j, com.ss.android.ttvecamera.j$a, com.ss.android.ttvecamera.TECameraSettings, com.ss.android.ttvecamera.j$c, com.bytedance.bpea.basics.PrivacyCert):int");
    }
}
