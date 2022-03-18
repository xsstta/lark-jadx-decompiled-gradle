package com.tt.miniapp.manager.p3302a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;

/* renamed from: com.tt.miniapp.manager.a.a */
public class C66377a {
    /* renamed from: a */
    public static SharedPreferences m259531a(Context context) {
        return C12899a.m53203a(context, "tma_jssdk_info");
    }

    /* renamed from: b */
    public static SharedPreferences m259534b(Context context) {
        return C12899a.m53203a(context, "component_jssdk_info");
    }

    /* renamed from: e */
    private static SharedPreferences m259538e(Context context) {
        return context.getSharedPreferences("appbrand_file", 0);
    }

    /* renamed from: c */
    public static boolean m259536c(Context context) {
        return m259538e(context).getBoolean("base_local_test_bundle_update_switch", false);
    }

    /* renamed from: d */
    public static String m259537d(Context context) {
        return m259538e(context).getString("latest_version_name", "");
    }

    /* renamed from: a */
    public static SharedPreferences m259532a(Context context, String str) {
        return C12899a.m53203a(context, "component_jssdk_info_" + str);
    }

    /* renamed from: b */
    public static void m259535b(Context context, String str) {
        m259538e(context).edit().putString("latest_version_name", str).apply();
    }

    /* renamed from: a */
    public static void m259533a(Context context, boolean z) {
        m259538e(context).edit().putBoolean("base_local_test_bundle_update_switch", z).apply();
    }
}
