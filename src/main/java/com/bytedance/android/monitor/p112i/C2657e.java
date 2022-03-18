package com.bytedance.android.monitor.p112i;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.i.e */
public class C2657e {
    /* renamed from: a */
    public static JSONObject m11170a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception e) {
            C2655c.m11159a(e);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static int m11169a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* renamed from: b */
    public static String m11177b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* renamed from: c */
    public static JSONObject m11178c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: d */
    public static JSONArray m11179d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONArray();
        }
        return jSONObject.optJSONArray(str);
    }

    /* renamed from: e */
    public static Object m11180e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: a */
    public static void m11175a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m11173a(jSONObject, next, m11180e(jSONObject2, next));
                }
            } catch (Exception e) {
                C2655c.m11159a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m11171a(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public static void m11172a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public static void m11173a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public static void m11174a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            C2655c.m11159a(e);
        }
    }

    /* renamed from: a */
    public static boolean m11176a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null) {
            return bool.booleanValue();
        }
        return jSONObject.optBoolean(str, bool.booleanValue());
    }
}
