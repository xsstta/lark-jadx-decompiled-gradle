package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;

/* renamed from: com.bytedance.platform.godzilla.sysopt.f */
public class C20337f extends AbstractC20329a {

    /* renamed from: a */
    private Application f49616a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "SmFakeNameHandlerPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        Application application = this.f49616a;
        if (application != null) {
            SmFakeNameHandler.start(application);
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49616a = application;
    }
}
