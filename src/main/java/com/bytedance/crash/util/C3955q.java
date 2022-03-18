package com.bytedance.crash.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.q */
public final class C3955q {
    /* renamed from: a */
    public static boolean m16453a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* renamed from: a */
    public static boolean m16452a(JSONArray jSONArray, String str) {
        if (!m16451a(jSONArray) && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                if (!(opt instanceof String)) {
                    break;
                } else if (((String) opt).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m16454a(JSONObject jSONObject, String str) {
        return m16453a(jSONObject) || m16451a(jSONObject.optJSONArray(str));
    }

    /* renamed from: c */
    public static Map<String, Object> m16458c(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static HashMap<String, Object> m16457b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONArray m16445a(Properties properties) {
        if (properties == null || properties.isEmpty()) {
            return null;
        }
        Set keySet = properties.keySet();
        JSONArray jSONArray = new JSONArray();
        for (Object obj : keySet) {
            jSONArray.put(((String) obj) + ":" + properties.get(obj));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static boolean m16451a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONArray m16446a(JSONObject jSONObject, String... strArr) {
        JSONObject c = m16459c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        return c.optJSONArray(strArr[strArr.length - 1]);
    }

    /* renamed from: a */
    public static void m16448a(JSONObject jSONObject, Map<String, ? extends Object> map) {
        if (jSONObject != null && map != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m16456b(JSONObject jSONObject, String... strArr) {
        JSONObject c = m16459c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        return c.optString(strArr[strArr.length - 1]);
    }

    /* renamed from: c */
    public static JSONObject m16459c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            C3968x.m16536b("err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                C3968x.m16536b("JSONUtil", "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m16449a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m16450a(JSONObject jSONObject, Object... objArr) {
        if (jSONObject == null || objArr == null || objArr.length % 2 != 0 || objArr.length == 0) {
            C3968x.m16532a("JSONUtils", "Err use of addKVs!!!!!");
            return;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            m16447a(jSONObject, String.valueOf(objArr[i]), objArr[i + 1]);
        }
    }

    /* renamed from: a */
    public static int m16443a(JSONObject jSONObject, int i, String... strArr) {
        return m16455b(jSONObject, i, strArr);
    }

    /* renamed from: a */
    public static JSONObject m16447a(JSONObject jSONObject, String str, Object obj) {
        if (!(jSONObject == null || obj == null || TextUtils.isEmpty(str))) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static int m16455b(JSONObject jSONObject, int i, String... strArr) {
        JSONObject c = m16459c(jSONObject, strArr);
        if (c == null) {
            return i;
        }
        return c.optInt(strArr[strArr.length - 1], i);
    }

    /* renamed from: a */
    public static JSONArray m16444a(int i, int i2, JSONArray jSONArray) {
        int i3 = i2 + i;
        if (jSONArray.length() <= i3) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i4 = 0; i4 < i; i4++) {
            jSONArray2.put(jSONArray.opt(i4));
        }
        jSONArray2.put("... skip " + ((jSONArray.length() - i2) - i) + " lines");
        while (i < i3) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i3 - i)));
            i++;
        }
        return jSONArray2;
    }
}
