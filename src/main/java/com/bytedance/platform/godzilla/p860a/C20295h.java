package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p866b.InstrumentationC20263a;
import com.bytedance.platform.godzilla.p860a.p862b.p866b.p868b.C20269a;
import com.bytedance.platform.godzilla.p860a.p862b.p866b.p868b.C20270b;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.a.h */
public class C20295h extends AbstractC20329a {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "ProviderInstalledFailedPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        InstrumentationC20263a.m73967a();
        Logger.m74095a(mo68532b(), "start");
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        InstrumentationC20263a.m73968a(new C20269a());
        InstrumentationC20263a.m73968a(new C20270b());
    }
}
