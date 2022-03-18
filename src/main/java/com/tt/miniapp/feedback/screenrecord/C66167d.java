package com.tt.miniapp.feedback.screenrecord;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.feedback.FeedbackRecordService;
import com.tt.miniapphost.feedback.IFeedbackRecordAIDL;
import com.tt.miniapphost.feedback.IFeedbackRecordCallback;

/* renamed from: com.tt.miniapp.feedback.screenrecord.d */
public class C66167d {

    /* renamed from: a */
    public IFeedbackRecordAIDL f167025a;

    /* renamed from: b */
    public IFeedbackRecordCallback f167026b;

    /* renamed from: c */
    private final ServiceConnection f167027c = new ServiceConnection() {
        /* class com.tt.miniapp.feedback.screenrecord.C66167d.ServiceConnectionC661681 */

        public void onServiceDisconnected(ComponentName componentName) {
            C66167d.this.f167025a = null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C66167d.this.f167025a = IFeedbackRecordAIDL.Stub.asInterface(iBinder);
            if (C66167d.this.f167026b != null) {
                C66167d.this.mo231478a();
            } else {
                C66167d.this.mo231480b();
            }
        }
    };

    /* renamed from: a */
    public void mo231478a() {
        try {
            this.f167025a.start(new ScreenRecordServiceBindManager$2(this));
        } catch (RemoteException e) {
            AppBrandLogger.stacktrace(6, "ScreenRecordServiceBindManager", e.getStackTrace());
        }
    }

    /* renamed from: b */
    public void mo231480b() {
        try {
            this.f167025a.stop(new ScreenRecordServiceBindManager$3(this));
        } catch (RemoteException e) {
            AppBrandLogger.stacktrace(6, "ScreenRecordServiceBindManager", e.getStackTrace());
        }
        AppbrandContext.getInst().getApplicationContext().unbindService(this.f167027c);
    }

    /* renamed from: a */
    public static C66167d m259090a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234281b();
    }

    /* renamed from: b */
    public void mo231481b(IFeedbackRecordCallback iFeedbackRecordCallback) {
        if (this.f167025a == null) {
            mo231479a((IFeedbackRecordCallback) null);
        } else {
            mo231480b();
        }
    }

    /* renamed from: a */
    public void mo231479a(IFeedbackRecordCallback iFeedbackRecordCallback) {
        if (this.f167025a == null) {
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            applicationContext.bindService(new Intent(applicationContext, FeedbackRecordService.class), this.f167027c, 1);
            this.f167026b = iFeedbackRecordCallback;
            return;
        }
        mo231478a();
    }
}
