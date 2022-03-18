package com.bytedance.ee.larkbrand.utils;

import android.app.Application;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.bytedance.ee.larkbrand.utils.r */
public final class C13373r {
    /* renamed from: a */
    public static void m54380a() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            applicationContext.getSharedPreferences(HostDependManager.getInst().getSpPrefixPath() + "update_app_info_v2", 0).edit().clear().commit();
        }
    }

    /* renamed from: a */
    public static boolean m54381a(Context context, String str) {
        if (ActivityCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}
