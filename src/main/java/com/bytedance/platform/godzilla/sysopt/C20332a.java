package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.sysoptimizer.ArtOptimizer;

/* renamed from: com.bytedance.platform.godzilla.sysopt.a */
public class C20332a extends AbstractC20329a {

    /* renamed from: a */
    private Application f49611a;

    /* renamed from: b */
    private boolean f49612b;

    /* renamed from: c */
    private boolean f49613c;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "ArtOptimizerPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        Application application = this.f49611a;
        if (application != null) {
            if (this.f49612b) {
                ArtOptimizer.optSuspendTimeout(application);
            }
            if (this.f49613c) {
                ArtOptimizer.disableDumpOatFileForANR(this.f49611a);
            }
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49611a = application;
    }

    public C20332a(boolean z, boolean z2) {
        this.f49612b = z;
        this.f49613c = z2;
    }
}
