package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.sysopt.e */
public class C20336e extends AbstractC20329a {

    /* renamed from: a */
    private int f49615a = 1048576;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "PthreadCreateHookPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        PthreadCreateHook.start(this.f49615a);
    }

    public C20336e(int i) {
        this.f49615a = i;
    }
}
