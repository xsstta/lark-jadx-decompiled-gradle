package com.ss.android.lark.openplatform.common;

import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.statistics.Statistics;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.common.g */
public class C48830g {
    /* renamed from: a */
    public static void m192397a() {
        JSONObject b = m192400b();
        if (b != null) {
            Statistics.sendEvent("appplus_click_menu", b);
        }
    }

    /* renamed from: c */
    private static String m192401c() {
        return m192396a(OpenPlatformModule.m192198d().getTenantId());
    }

    /* renamed from: d */
    private static String m192402d() {
        return m192396a(OpenPlatformModule.m192198d().getUserId());
    }

    /* renamed from: b */
    private static JSONObject m192400b() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tenant_id_enc", m192401c());
            jSONObject.put("user_id_enc", m192402d());
            if (DesktopUtil.m144307b()) {
                str = "LKP";
            } else {
                str = "android";
            }
            jSONObject.put("platform", str);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m192398a(int i) {
        JSONObject b = m192400b();
        if (b != null) {
            try {
                b.put("apps_count", i);
                Statistics.sendEvent("mini_appplus_keyboard_click", b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m192396a(String str) {
        String str2 = new String(C69743a.m267688a(C69745a.m267697b(str + "42b91e")));
        return new String(C69743a.m267688a(C69745a.m267699c("08a441" + str2)));
    }

    /* renamed from: a */
    public static void m192399a(int i, String str) {
        JSONObject b = m192400b();
        if (b != null) {
            try {
                b.put("apps_count", i);
                b.put("lan", str);
                Statistics.sendEvent("mini_appplus_keyboard_app_count", b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
