package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.sysoptimizer.DvmOptimizer;

/* renamed from: com.bytedance.platform.godzilla.sysopt.c */
public class C20334c extends AbstractC20329a {

    /* renamed from: a */
    private Application f49614a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "DvmOptimizerPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        Application application = this.f49614a;
        if (application != null) {
            DvmOptimizer.optDvmLinearAllocBuffer(application);
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49614a = application;
    }
}
