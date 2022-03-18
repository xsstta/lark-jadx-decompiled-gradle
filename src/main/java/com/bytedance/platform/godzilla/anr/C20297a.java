package com.bytedance.platform.godzilla.anr;

import android.app.Application;
import android.os.Build;
import com.bytedance.platform.godzilla.anr.p871a.C20298a;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.anr.a */
public class C20297a extends AbstractC20329a {

    /* renamed from: a */
    private Application f49572a;

    /* renamed from: b */
    private boolean f49573b;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "CookieManagerPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        if (this.f49572a != null) {
            Logger.m74095a(mo68532b(), "start");
            if (this.f49573b) {
                new C20298a().mo68574a(this.f49572a);
                return;
            }
            return;
        }
        throw new RuntimeException("mApplication must not null!!!");
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        boolean z;
        super.mo68531a(application);
        this.f49572a = application;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        this.f49573b = z;
    }
}
