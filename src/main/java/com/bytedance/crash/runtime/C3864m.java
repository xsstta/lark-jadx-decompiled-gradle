package com.bytedance.crash.runtime;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.MonitorCrash;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.m */
public class C3864m {

    /* renamed from: a */
    private static MonitorCrash f11849a = null;

    /* renamed from: b */
    private static int f11850b = -1;

    /* renamed from: c */
    private static int f11851c;

    /* renamed from: b */
    private static boolean m16011b() {
        if (f11850b == -1) {
            f11850b = 5;
            f11850b = C3840b.m15884d(5);
        }
        int i = f11851c;
        if (i >= f11850b) {
            return false;
        }
        f11851c = i + 1;
        return true;
    }

    /* renamed from: com.bytedance.crash.runtime.m$a */
    public static class C3865a {

        /* renamed from: a */
        JSONObject f11852a = new JSONObject();

        /* renamed from: b */
        JSONObject f11853b = new JSONObject();

        /* renamed from: c */
        String f11854c;

        /* renamed from: a */
        public void mo15482a() {
            if (C3774m.m15609j() != null) {
                C3968x.m16530a((Object) ("upload " + this.f11854c + " " + this.f11853b + " " + this.f11852a));
                C3864m.m16007a(this.f11854c, this.f11852a, this.f11853b);
            }
        }

        /* renamed from: a */
        public C3865a mo15481a(Object... objArr) {
            C3955q.m16450a(this.f11852a, objArr);
            return this;
        }

        /* renamed from: b */
        public C3865a mo15483b(Object... objArr) {
            C3955q.m16450a(this.f11853b, objArr);
            return this;
        }

        public C3865a(String str) {
            this.f11854c = str;
        }
    }

    /* renamed from: a */
    public static MonitorCrash m16005a() {
        if (f11849a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(C3774m.m15609j(), "2010", 30106103, "3.1.6-rc.53-lark.oversea", "");
            f11849a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f11849a;
    }

    /* renamed from: a */
    public static C3865a m16006a(String str) {
        return new C3865a(str);
    }

    /* renamed from: a */
    private static void m16010a(JSONObject... jSONObjectArr) {
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject : jSONObjectArr) {
                if (jSONObject != null) {
                    C3955q.m16448a(jSONObject, C3850d.m15954a(C3774m.m15591a().mo15458c().getCommonParams(), "aid", "4444", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0"));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16008a(String str, String... strArr) {
        m16006a(str).mo15481a(strArr).mo15482a();
    }

    /* renamed from: a */
    public static void m16009a(Throwable th, String str) {
        if (C3774m.m15609j() != null && m16011b()) {
            m16005a().reportCustomErr(str, "INNER", th);
        }
    }

    /* renamed from: a */
    public static void m16007a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (C3774m.m15609j() != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            m16010a(jSONObject);
            m16005a().reportEvent(str, 1, jSONObject, jSONObject2, null);
        }
    }
}
