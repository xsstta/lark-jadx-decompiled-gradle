package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import android.os.Build;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;

/* renamed from: com.bytedance.platform.godzilla.sysopt.d */
public class C20335d extends AbstractC20329a {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "IvimageOptPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        Logger.m74095a(mo68532b(), "start");
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            Class<?> cls = null;
            try {
                cls = Class.forName("ivimagesr.o000ooo");
                Logger.m74095a("GODZILLA", "Class found = " + cls.getName());
                if (cls == null) {
                    return;
                }
            } catch (ClassNotFoundException e) {
                Logger.m74095a("GODZILLA", e.toString());
                if (cls == null) {
                    return;
                }
            } catch (Throwable th) {
                if (cls != null) {
                    Logger.m74095a("GODZILLA", "Register opt");
                    IvimageOpt.start();
                }
                throw th;
            }
            Logger.m74095a("GODZILLA", "Register opt");
            IvimageOpt.start();
        }
    }
}
