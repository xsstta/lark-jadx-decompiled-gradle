package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.C13297h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.utils.t */
public class C13376t {
    /* renamed from: a */
    private static SharedPreferences m54402a(String str) {
        return m54401a(AppbrandContext.getInst().getApplicationContext(), str);
    }

    /* renamed from: b */
    private static String m54407b(String str) {
        return HostDependManager.getInst().getSpPrefixPath() + "meta_extra_" + str;
    }

    /* renamed from: a */
    private static SharedPreferences m54401a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return context.getApplicationContext().getSharedPreferences(m54407b(str), 0);
    }

    /* renamed from: a */
    public static String m54403a(String str, String str2) {
        SharedPreferences a = m54402a(str);
        if (a == null) {
            return str2;
        }
        return a.getString("openSchemaWhiteList", str2);
    }

    /* renamed from: b */
    private static void m54408b(String str, String str2) {
        SharedPreferences a = m54402a(str);
        if (a != null) {
            a.edit().putString("openSchemaWhiteList", str2).apply();
        }
    }

    /* renamed from: b */
    private static void m54409b(String str, boolean z) {
        SharedPreferences a = m54402a(str);
        if (a != null) {
            a.edit().putBoolean("useOpenSchemaWhiteList", z).apply();
        }
    }

    /* renamed from: a */
    public static void m54405a(String str, JSONObject jSONObject) {
        boolean z;
        if (jSONObject.has("useOpenSchemaWhiteList")) {
            z = jSONObject.optBoolean("useOpenSchemaWhiteList", true);
        } else {
            z = true;
        }
        m54409b(str, z);
        AppBrandLogger.m52828d("LarkMetaExtraUtils", "use open schema " + z);
        if (jSONObject.has("openSchemaWhiteList")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("openSchemaWhiteList");
            m54408b(str, optJSONArray.toString());
            AppBrandLogger.m52828d("LarkMetaExtraUtils", " open schema " + optJSONArray.toString());
        }
    }

    /* renamed from: a */
    public static boolean m54406a(String str, boolean z) {
        SharedPreferences a = m54402a(str);
        if (a == null) {
            return z;
        }
        return a.getBoolean("useOpenSchemaWhiteList", z);
    }

    /* renamed from: a */
    public static void m54404a(String str, String str2, IAppContext iAppContext) {
        AppBrandLogger.m52830i("LarkMetaExtraUtils", " appid " + str + " meta extra " + str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            C13297h.m54142a(str, jSONObject, iAppContext);
            m54405a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
