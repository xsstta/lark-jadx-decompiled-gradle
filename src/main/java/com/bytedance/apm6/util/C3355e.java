package com.bytedance.apm6.util;

import com.bytedance.apm6.util.p195b.C3350b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.util.e */
public class C3355e {
    /* renamed from: c */
    public static JSONObject m13961c(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static JSONObject m13959b(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject c = m13961c((JSONObject) opt);
                    if (c != null) {
                        jSONObject2.put(next, c);
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    jSONObject2.put(next, jSONArray2);
                } else {
                    jSONObject2.put(next, opt);
                }
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static boolean m13955a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m13956a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m13951a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getString(str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e) {
            C3350b.m13935b("JsonUtils", "removeString", e);
            return null;
        }
    }

    /* renamed from: b */
    public static int m13957b(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i = jSONObject.getInt(str);
            jSONObject.remove(str);
            return i;
        } catch (Exception e) {
            C3350b.m13935b("JsonUtils", "removeInt", e);
            return 0;
        }
    }

    /* renamed from: c */
    public static long m13960c(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            long j = jSONObject.getLong(str);
            jSONObject.remove(str);
            return j;
        } catch (Exception e) {
            C3350b.m13935b("JsonUtils", "removeLong", e);
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m13954a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m13952a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    /* renamed from: b */
    public static int m13958b(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return 0;
        }
        return optJSONObject.optInt(str2, 0);
    }

    /* renamed from: a */
    public static JSONObject m13953a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject a = m13952a(jSONObject, str, str2);
        if (a == null) {
            return null;
        }
        return a.optJSONObject(str3);
    }
}
