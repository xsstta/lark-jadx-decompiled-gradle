package com.bytedance.ee.lark.infra.config.mina.p614a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.C12748d;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.a.a */
public class C12738a {

    /* renamed from: a */
    private static JSONObject f34103a;

    /* renamed from: b */
    private static SharedPreferences m52728b(Context context) {
        return context.getSharedPreferences("settings_config", 0);
    }

    /* renamed from: a */
    public static JSONObject m52725a(Context context) {
        JSONObject jSONObject = f34103a;
        if (jSONObject != null) {
            return jSONObject;
        }
        String string = m52728b(context).getString("SETTINGS_JSON", "");
        if (TextUtils.isEmpty(string)) {
            C12748d.m52749a("SETTINGS_JSON");
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("SettingsDAO", e);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m52729b(Context context, Enum... enumArr) {
        JSONObject c = m52730c(context, enumArr);
        if (c == null || enumArr.length <= 0) {
            return new JSONObject();
        }
        return c.optJSONObject(enumArr[enumArr.length - 1].toString());
    }

    /* renamed from: c */
    private static JSONObject m52730c(Context context, Enum... enumArr) {
        JSONObject a = m52725a(context);
        if (a == null || enumArr.length <= 0) {
            return null;
        }
        int length = enumArr.length;
        for (int i = 0; i < length - 1; i++) {
            if (a == null) {
                return null;
            }
            a = a.optJSONObject(enumArr[i].toString());
        }
        return a;
    }

    /* renamed from: a */
    public static List<String> m52724a(Context context, Enum... enumArr) {
        JSONObject c = m52730c(context, enumArr);
        if (c == null || enumArr.length <= 0) {
            return new ArrayList();
        }
        JSONArray optJSONArray = c.optJSONArray(enumArr[enumArr.length - 1].toString());
        if (optJSONArray == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m52726a(Context context, JSONObject jSONObject) {
        f34103a = jSONObject;
        m52728b(context).edit().putString("SETTINGS_JSON", f34103a.toString()).apply();
        AppBrandLogger.m52828d("SettingsDAO", f34103a);
    }

    /* renamed from: a */
    public static int m52722a(Context context, int i, Enum... enumArr) {
        JSONObject c = m52730c(context, enumArr);
        if (c == null || enumArr.length <= 0) {
            return i;
        }
        return c.optInt(enumArr[enumArr.length - 1].toString(), i);
    }

    /* renamed from: a */
    public static String m52723a(Context context, String str, Enum... enumArr) {
        JSONObject c = m52730c(context, enumArr);
        if (c == null || enumArr.length <= 0) {
            return str;
        }
        return c.optString(enumArr[enumArr.length - 1].toString(), str);
    }

    /* renamed from: a */
    public static boolean m52727a(Context context, boolean z, Enum... enumArr) {
        JSONObject c = m52730c(context, enumArr);
        if (c == null || enumArr.length <= 0) {
            return z;
        }
        return c.optBoolean(enumArr[enumArr.length - 1].toString(), z);
    }
}
