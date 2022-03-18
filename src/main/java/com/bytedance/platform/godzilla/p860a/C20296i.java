package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p866b.p867a.C20266b;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.a.i */
public class C20296i extends AbstractC20329a {

    /* renamed from: a */
    private boolean f49571a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "SpFetcherDeadObjectPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        if (this.f49571a) {
            new C20266b().mo68553b();
            try {
                Field declaredField = StorageManager.class.getDeclaredField("sStorageManager");
                declaredField.setAccessible(true);
                declaredField.set(null, null);
                Logger.m74099c("DeadObjectFixer", "Fix success.");
            } catch (Exception e) {
                Logger.m74099c("DeadObjectFixer", "Fix fail " + e);
            }
        }
        Logger.m74095a(mo68532b(), "start");
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        boolean z;
        super.mo68531a(application);
        if (Build.VERSION.SDK_INT == 26) {
            z = true;
        } else {
            z = false;
        }
        this.f49571a = z;
    }
}
