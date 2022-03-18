package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import android.content.Context;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;

/* renamed from: com.bytedance.platform.godzilla.a.a */
public class C20254a extends AbstractC20329a {

    /* renamed from: a */
    private Context f49537a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "BadParcelableExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        BadParcelableCrashOptimizer.fix(this.f49537a);
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49537a = application;
    }
}
