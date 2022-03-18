package com.ss.android.lark.integrator.p2000c;

import android.os.BadParcelableException;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.c.b */
public class C39131b extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "BadParcelableExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        try {
            if ((th instanceof BadParcelableException) && Build.VERSION.SDK_INT == 29) {
                if (!TextUtils.isEmpty(th.getMessage())) {
                    if (!th.getMessage().contains("ClassNotFoundException when unmarshalling: androidx.fragment.app.FragmentManagerState")) {
                        return false;
                    }
                    Log.m165385e("GodzillaSuperCaught", mo68532b() + " success", th, true);
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.m165385e("GodzillaSuperCaught", mo68532b() + " error", th2, true);
            return false;
        }
    }
}
