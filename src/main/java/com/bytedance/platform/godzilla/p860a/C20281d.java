package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import android.os.Build;
import com.bytedance.platform.godzilla.p860a.p869c.C20272a;
import com.bytedance.platform.godzilla.p860a.p869c.C20275b;
import com.bytedance.platform.godzilla.p860a.p869c.C20278c;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.a.d */
public class C20281d extends AbstractC20329a {

    /* renamed from: a */
    private Application f49564a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "DeadSystemExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        new C20275b().mo68556b();
        if (Build.VERSION.SDK_INT == 29) {
            new C20278c().mo68557a(this.f49564a);
            new C20272a().mo68555b();
        }
    }

    public C20281d(Application application) {
        this.f49564a = application;
        if (application == null) {
            throw new IllegalArgumentException("Argument application can not be null!");
        }
    }
}
