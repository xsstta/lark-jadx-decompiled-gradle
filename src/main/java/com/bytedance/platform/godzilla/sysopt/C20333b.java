package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import android.os.Build;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.sysopt.b */
public class C20333b extends AbstractC20329a {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "Dex2OatPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        Logger.m74095a(mo68532b(), "start");
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 28) {
            Dex2OatSwitch.setDex2OatEnabled(false, Build.VERSION.SDK_INT);
        }
    }
}
