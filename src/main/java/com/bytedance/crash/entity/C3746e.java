package com.bytedance.crash.entity;

import android.provider.Settings;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.util.C3955q;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.e */
public class C3746e {

    /* renamed from: a */
    private static JSONObject f11536a;

    /* renamed from: b */
    private static String f11537b;

    /* renamed from: c */
    private static String f11538c;

    /* renamed from: d */
    private static boolean f11539d;

    /* renamed from: e */
    private static boolean f11540e;

    /* renamed from: c */
    public static boolean m15490c() {
        return f11539d;
    }

    /* renamed from: d */
    public static boolean m15492d() {
        return f11540e;
    }

    /* renamed from: a */
    public static boolean m15486a() {
        return "true".equals(f11537b);
    }

    /* renamed from: b */
    public static boolean m15488b() {
        return "true".equals(f11538c);
    }

    /* renamed from: e */
    public static JSONObject m15493e() {
        if (f11536a == null) {
            try {
                String string = Settings.Global.getString(C3774m.m15609j().getContentResolver(), "bytest_automation_info");
                if (string != null) {
                    f11536a = new JSONObject(string);
                } else {
                    f11536a = new JSONObject();
                }
            } catch (Throwable unused) {
                f11536a = new JSONObject();
            }
        }
        return f11536a;
    }

    /* renamed from: a */
    public static void m15485a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m15489c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m15487b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m15491d(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m15489c(JSONObject jSONObject) {
        Object opt;
        m15493e();
        JSONObject jSONObject2 = f11536a;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f11536a.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m15491d(JSONObject jSONObject) {
        m15493e();
        JSONObject jSONObject2 = f11536a;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!C3955q.m16453a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C3742b.m15437b(optJSONObject2, optJSONObject);
            }
        }
    }
}
