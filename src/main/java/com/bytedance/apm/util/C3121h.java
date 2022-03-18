package com.bytedance.apm.util;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.util.h */
public class C3121h {
    /* renamed from: c */
    public static boolean m13003c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static JSONObject m13004d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static JSONObject m12997a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static JSONObject m13001b(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    /* renamed from: e */
    public static JSONObject m13005e(JSONObject jSONObject) {
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

    /* renamed from: a */
    public static JSONObject m12999a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
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

    /* renamed from: b */
    public static void m13002b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m12998a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    /* renamed from: a */
    public static int m12996a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject a = m12998a(jSONObject, str, str2);
        if (a == null) {
            return 0;
        }
        return a.optInt(str3, 0);
    }

    /* renamed from: a */
    public static boolean m13000a(JSONObject jSONObject, String str, String str2, boolean z) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return z;
        }
        return optJSONObject.optBoolean(str2, z);
    }
}
