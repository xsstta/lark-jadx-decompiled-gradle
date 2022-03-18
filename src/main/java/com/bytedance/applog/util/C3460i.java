package com.bytedance.applog.util;

import com.bytedance.applog.p201e.AbstractC3402b;
import com.bytedance.applog.p201e.C3411e;
import com.bytedance.applog.p201e.C3412f;
import com.bytedance.applog.p201e.C3413g;
import com.bytedance.applog.p201e.C3414h;
import com.bytedance.applog.p201e.C3418l;
import org.json.JSONArray;

/* renamed from: com.bytedance.applog.util.i */
public class C3460i {

    /* renamed from: a */
    private static AbstractC3464m f10982a = m14619b();

    /* renamed from: b */
    private static AbstractC3464m m14619b() {
        AbstractC3464m mVar;
        try {
            Object invoke = Class.forName("com.bytedance.applog.et_verify.EventVerify").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            if (invoke instanceof AbstractC3464m) {
                mVar = (AbstractC3464m) invoke;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                C3469r.m14665a(mVar.toString());
            }
            return mVar;
        } catch (Exception unused) {
            return null;
        } finally {
            C3469r.m14666a("can't find event verify, should compile with ET", (Throwable) null);
        }
    }

    /* renamed from: a */
    public static boolean m14618a() {
        AbstractC3464m mVar = f10982a;
        if (mVar != null) {
            return mVar.mo13911a();
        }
        return false;
    }

    /* renamed from: a */
    public static void m14615a(String str) {
        AbstractC3464m mVar = f10982a;
        if (mVar != null) {
            mVar.mo13908a(str);
        } else {
            C3469r.m14669c("can't find ET, should compile with ET", null);
        }
    }

    /* renamed from: a */
    public static void m14617a(boolean z) {
        AbstractC3464m mVar = f10982a;
        if (mVar != null) {
            mVar.mo13910a(z);
        } else {
            C3469r.m14669c("can't find ET, should compile with ET", null);
        }
    }

    /* renamed from: a */
    public static String m14614a(AbstractC3402b bVar) {
        if (bVar instanceof C3411e) {
            return "event";
        }
        if (bVar instanceof C3413g) {
            return "event_v3";
        }
        if (bVar instanceof C3412f) {
            return "log_data";
        }
        if (bVar instanceof C3414h) {
            return "launch";
        }
        if (bVar instanceof C3418l) {
            return "terminate";
        }
        return null;
    }

    /* renamed from: a */
    public static void m14616a(String str, JSONArray jSONArray) {
        AbstractC3464m mVar = f10982a;
        if (mVar != null) {
            mVar.mo13909a(str, jSONArray);
        }
    }
}
