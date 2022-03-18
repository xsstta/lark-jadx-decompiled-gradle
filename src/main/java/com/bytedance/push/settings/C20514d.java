package com.bytedance.push.settings;

import org.json.JSONObject;

/* renamed from: com.bytedance.push.settings.d */
public class C20514d {
    /* renamed from: a */
    private static Boolean m74709a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 1) {
                return true;
            }
            if (num.intValue() == 0) {
                return false;
            }
            return null;
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return true;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return false;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m74710a(JSONObject jSONObject, String str) {
        return m74711a(jSONObject, str, false);
    }

    /* renamed from: a */
    public static boolean m74711a(JSONObject jSONObject, String str, boolean z) {
        Boolean a = m74709a(jSONObject.opt(str));
        if (a != null) {
            return a.booleanValue();
        }
        return z;
    }
}
