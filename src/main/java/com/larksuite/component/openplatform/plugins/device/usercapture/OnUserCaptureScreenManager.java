package com.larksuite.component.openplatform.plugins.device.usercapture;

import android.app.Activity;
import com.larksuite.component.openplatform.plugins.device.usercapture.C25604a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class OnUserCaptureScreenManager implements C25604a.AbstractC25605a {

    /* renamed from: a */
    private AbstractC25905b f62285a;

    /* renamed from: b */
    private C25606b f62286b;

    /* renamed from: c */
    private AtomicBoolean f62287c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f62288d;

    public static class UserCaptureScreenObservedResponse extends C25921b {
    }

    /* renamed from: a */
    public void mo88814a() {
        mo88818c();
        this.f62285a = null;
        this.f62286b = null;
    }

    /* renamed from: c */
    public void mo88818c() {
        if (this.f62287c.compareAndSet(true, false)) {
            Log.m165389i("OnUserCaptureScreenManager", "unregister take screen shot observer");
            this.f62286b.mo88824a();
            return;
        }
        Log.m165389i("OnUserCaptureScreenManager", "not register");
    }

    /* renamed from: b */
    public void mo88817b() {
        if (this.f62287c.compareAndSet(false, true)) {
            Log.m165389i("OnUserCaptureScreenManager", "register take screen shot observer");
            this.f62286b.mo88825a(this.f62285a.mo92207a().getApplicationContext());
            return;
        }
        Log.m165389i("OnUserCaptureScreenManager", "has registered observer");
    }

    /* renamed from: a */
    public void mo88816a(boolean z) {
        this.f62288d = z;
    }

    public OnUserCaptureScreenManager(AbstractC25905b bVar) {
        this.f62285a = bVar;
        this.f62286b = new C25606b(this, ((Activity) bVar.mo92207a()).getApplication());
    }

    @Override // com.larksuite.component.openplatform.plugins.device.usercapture.C25604a.AbstractC25605a
    /* renamed from: a */
    public void mo88815a(String str, long j) {
        Log.m165389i("OnUserCaptureScreenManager", "onUserCaptureScreen trigger, data = " + str);
        AbstractC25905b bVar = this.f62285a;
        if (bVar == null) {
            Log.m165397w("OnUserCaptureScreenManager", "onUserCaptureScreen trigger but bridgeContext is null");
        } else if (!this.f62288d) {
            bVar.mo92214a("userCaptureScreenObserved", new UserCaptureScreenObservedResponse());
        }
    }
}
