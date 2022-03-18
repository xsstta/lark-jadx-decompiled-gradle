package com.tt.option.p3392m;

import android.text.TextUtils;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.process.C67556a;
import org.json.JSONObject;

/* renamed from: com.tt.option.m.c */
public class C67657c {

    /* renamed from: com.tt.option.m.c$a */
    public static class C67658a {

        /* renamed from: a */
        public String f170492a = "0";

        /* renamed from: b */
        public String f170493b = "0";
    }

    /* renamed from: c */
    private static C67658a m263253c() {
        return ContextSingletonInstance.getInstance().netRequestDataInstance;
    }

    /* renamed from: a */
    public static String m263250a() {
        C67658a c = m263253c();
        if (m263251a(c.f170492a)) {
            return c.f170492a;
        }
        if (AppbrandContext.getInst().getInitParams() != null) {
            c.f170492a = AppbrandContext.getInst().getInitParams().mo234506f();
        }
        if (m263251a(c.f170492a)) {
            return c.f170492a;
        }
        JSONObject d = C67556a.m262947d();
        if (d != null) {
            c.f170492a = d.optString("device_id", "0");
        }
        return c.f170492a;
    }

    /* renamed from: b */
    public static String m263252b() {
        C67658a c = m263253c();
        if (m263251a(c.f170493b)) {
            return c.f170493b;
        }
        if (AppbrandContext.getInst().getInitParams() != null) {
            c.f170493b = AppbrandContext.getInst().getInitParams().mo234513m();
        }
        if (m263251a(c.f170493b)) {
            return c.f170493b;
        }
        JSONObject d = C67556a.m262947d();
        if (d != null) {
            c.f170493b = d.optString("iid", "0");
        }
        return c.f170493b;
    }

    /* renamed from: a */
    private static boolean m263251a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null") || TextUtils.equals(str, "0")) {
            return false;
        }
        return true;
    }
}
