package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;

public class BindingFailedResolution implements ServiceConnection, IBridgeActivityDelegate {

    /* renamed from: f */
    private static final Object f57787f = new Object();

    /* renamed from: a */
    private Activity f57788a;

    /* renamed from: b */
    private boolean f57789b = true;

    /* renamed from: c */
    private C23445d f57790c;

    /* renamed from: d */
    private Handler f57791d = null;

    /* renamed from: e */
    private Handler f57792e = null;

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2003;
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.api.BindingFailedResolution$d */
    public static class C23445d extends AbstractPromptDialog {
        private C23445d() {
        }

        /* synthetic */ C23445d(C23442a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        /* access modifiers changed from: protected */
        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message", Util.getAppName(context, null), Util.getAppName(context, HMSPackageManager.getInstance(context).getHMSPackageName()));
        }
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        return this.f57788a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        m85039b();
        C23458a.f57862b.mo82097b(this.f57788a);
        this.f57788a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f57790c != null) {
            HMSLog.m86966i("BindingFailedResolution", "re show prompt dialog");
            m85042e();
        }
    }

    /* renamed from: b */
    private void m85039b() {
        synchronized (f57787f) {
            Handler handler = this.f57791d;
            if (handler != null) {
                handler.removeMessages(2);
                this.f57791d = null;
            }
        }
    }

    /* renamed from: c */
    private void m85040c() {
        Handler handler = this.f57791d;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f57791d = new Handler(Looper.getMainLooper(), new C23443b());
        }
        this.f57791d.sendEmptyMessageDelayed(2, 5000);
    }

    /* renamed from: d */
    private void m85041d() {
        Handler handler = this.f57792e;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.f57792e = new Handler(Looper.getMainLooper(), new C23442a());
        }
        this.f57792e.sendEmptyMessageDelayed(3, 2000);
    }

    /* renamed from: e */
    private void m85042e() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            C23445d dVar = this.f57790c;
            if (dVar == null) {
                this.f57790c = new C23445d(null);
            } else {
                dVar.dismiss();
            }
            HMSLog.m86966i("BindingFailedResolution", "showPromptdlg to resolve conn error");
            this.f57790c.show(activity, new C23444c());
        }
    }

    /* renamed from: a */
    private void m85033a() {
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.m86964e("BindingFailedResolution", "In connect, bind core try fail");
            m85038a(false);
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.aidlservice");
        intent.setPackage(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        synchronized (f57787f) {
            if (activity.bindService(intent, this, 1)) {
                m85040c();
                return;
            }
            HMSLog.m86964e("BindingFailedResolution", "In connect, bind core try fail");
            m85038a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.BindingFailedResolution$a */
    public class C23442a implements Handler.Callback {
        C23442a() {
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            BindingFailedResolution.this.m85034a((BindingFailedResolution) 8);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.BindingFailedResolution$b */
    public class C23443b implements Handler.Callback {
        C23443b() {
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m86964e("BindingFailedResolution", "In connect, bind core try timeout");
            BindingFailedResolution.this.m85038a((BindingFailedResolution) false);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.api.BindingFailedResolution$c */
    public class C23444c implements AbstractDialog.Callback {
        C23444c() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f57790c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.m85034a((BindingFailedResolution) 8);
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f57790c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.m85034a((BindingFailedResolution) 8);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f57788a = activity;
        C23458a.f57862b.mo82096a(this.f57788a);
        m85041d();
        m85035a(activity);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m85038a(boolean z) {
        if (this.f57789b) {
            this.f57789b = false;
            onStartResult(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onStartResult(boolean z) {
        if (getActivity() != null) {
            if (z) {
                m85034a(0);
            } else {
                m85042e();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m85034a(int i) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            HMSLog.m86966i("BindingFailedResolution", "finishBridgeActivity：" + i);
            Intent intent = new Intent();
            intent.putExtra(BridgeActivity.EXTRA_RESULT, i);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    private void m85035a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName(), HuaweiApiAvailability.ACTIVITY_NAME);
        HMSLog.m86966i("BindingFailedResolution", "onBridgeActivityCreate：try to start HMS");
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (Throwable th) {
            HMSLog.m86964e("BindingFailedResolution", "ActivityNotFoundException：" + th.getMessage());
            Handler handler = this.f57792e;
            if (handler != null) {
                handler.removeMessages(3);
                this.f57792e = null;
            }
            m85033a();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m86966i("BindingFailedResolution", "On key up when resolve conn error");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m85039b();
        m85038a(true);
        Activity activity = getActivity();
        if (activity != null) {
            Util.unBindServiceCatchException(activity, this);
            HMSLog.m86966i("BindingFailedResolution", "test connect success, try to reConnect and reply message");
            BindResolveClients.getInstance().notifyClientReconnect();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.m86966i("BindingFailedResolution", "onBridgeActivityResult");
        Handler handler = this.f57792e;
        if (handler != null) {
            handler.removeMessages(3);
            this.f57792e = null;
        }
        m85033a();
        return true;
    }
}
