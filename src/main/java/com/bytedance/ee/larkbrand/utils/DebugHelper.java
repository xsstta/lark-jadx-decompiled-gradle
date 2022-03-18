package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

public class DebugHelper {

    public enum FalconDebugConfig {
        USE_FG,
        OPEN_FALCON,
        CLOSE_FALCON
    }

    /* renamed from: a */
    public static boolean m54232a(Context context) {
        return C12782a.m52839b("key_debug", false);
    }

    /* renamed from: b */
    public static boolean m54233b(Context context) {
        if (m54232a(context)) {
            return C12782a.m52839b("force_to_current_version", false);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m54234c(Context context) {
        if (m54232a(context)) {
            return C12782a.m52839b("force_to_update_appbrand", false);
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m54235d(Context context) {
        if (m54232a(context)) {
            return C12782a.m52839b("force_to_update_js_sdk", false);
        }
        return false;
    }

    /* renamed from: e */
    public static int m54236e(Context context) {
        if (m54232a(context)) {
            return C12782a.m52836b("need_stable_js_sdk", 0);
        }
        return 0;
    }

    /* renamed from: f */
    public static int m54237f(Context context) {
        if (m54232a(context)) {
            return C12782a.m52836b("no_compress_js_sdk", 0);
        }
        return 0;
    }

    /* renamed from: g */
    public static String m54238g(Context context) {
        if (m54232a(context)) {
            return C12782a.m52838b("assign_jssdk_url", "");
        }
        return "";
    }
}
