package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import android.os.Build;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import com.bytedance.sysoptimizer.HWReceiverCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

/* renamed from: com.bytedance.platform.godzilla.a.f */
public class C20293f extends AbstractC20329a {

    /* renamed from: a */
    private Application f49569a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "HWReceiverCrashPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        if (Build.VERSION.SDK_INT == 22 || Build.VERSION.SDK_INT == 23) {
            ReceiverRegisterCrashOptimizer.fix(this.f49569a);
        }
        HWReceiverCrashOptimizer.fix(this.f49569a);
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
        this.f49569a = application;
    }
}
