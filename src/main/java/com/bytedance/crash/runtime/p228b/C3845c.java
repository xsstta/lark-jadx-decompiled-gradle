package com.bytedance.crash.runtime.p228b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3722c;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.util.C3955q;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b.c */
public class C3845c {

    /* renamed from: a */
    protected static JSONObject f11809a = new JSONObject();

    /* renamed from: b */
    private static String[] f11810b = null;

    /* renamed from: c */
    private static boolean f11811c = false;

    /* renamed from: d */
    private static boolean f11812d = false;

    /* renamed from: a */
    public static boolean m15929a() {
        JSONArray s = C3840b.m15901s();
        if (s == null || s.length() <= 0 || "none".equals(s.optString(0))) {
            return false;
        }
        if ("all".equals(s.optString(0))) {
            return true;
        }
        for (int i = 1; i < s.length(); i++) {
            try {
                if (Build.VERSION.SDK_INT == Integer.parseInt(s.optString(i))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m15934b() {
        JSONArray r;
        if (Build.BRAND.isEmpty() || (r = C3840b.m15900r()) == null || r.length() <= 0 || "none".equals(r.optString(0))) {
            return false;
        }
        if ("all".equals(r.optString(0))) {
            return true;
        }
        for (int i = 1; i < r.length(); i++) {
            try {
                if (Build.BRAND.equals(r.optString(i))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15930a(String str, C3843b bVar) {
        if (f11809a == null) {
            return false;
        }
        if (bVar == null) {
            bVar = new C3843b();
        }
        JSONObject optJSONObject = f11809a.optJSONObject(str);
        if (optJSONObject != null && !m15931a(optJSONObject.optJSONArray("disable"), bVar)) {
            return m15931a(optJSONObject.optJSONArray("enable"), bVar);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m15931a(JSONArray jSONArray, C3843b bVar) {
        if (C3955q.m16451a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C3722c a = C3691b.m15203a();
                a.mo15177a("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (m15932a(optJSONObject, bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m15932a(JSONObject jSONObject, C3843b bVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!m15933a(jSONObject.optJSONObject(next), bVar.mo15437b(next.substring(7)))) {
                        return false;
                    }
                } else if (next.startsWith("java_") && !m15933a(jSONObject.optJSONObject(next), bVar.mo15396a(next.substring(5)))) {
                    return false;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m15933a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals(ContainerUtils.KEY_VALUE_DELIMITER)) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
