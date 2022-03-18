package com.tt.miniapp.p3298k;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.event.C66020b;

/* renamed from: com.tt.miniapp.k.b */
public class C66263b {
    /* renamed from: a */
    public static void m259266a(long j, IAppContext iAppContext) {
        C66020b.m258530a("mp_collect_guide_click", iAppContext).mo231090a("duration", Long.valueOf(j)).mo231092a();
    }

    /* renamed from: a */
    public static void m259267a(boolean z, IAppContext iAppContext) {
        String str;
        C66020b.C66021a a = C66020b.m258530a("mp_collect_guide_click_result", iAppContext);
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        a.mo231090a("result_type", str).mo231092a();
    }

    /* renamed from: a */
    public static void m259268a(boolean z, String str, IAppContext iAppContext) {
        String str2;
        C66020b.C66021a a = C66020b.m258530a("mp_collect_guide_show", iAppContext);
        if (z) {
            str2 = "bubble";
        } else {
            str2 = "float";
        }
        a.mo231090a(ShareHitPoint.f121869d, str2).mo231090a("title", str).mo231092a();
    }

    /* renamed from: a */
    public static void m259269a(boolean z, boolean z2, long j, String str, IAppContext iAppContext) {
        String str2;
        String str3;
        C66020b.C66021a a = C66020b.m258530a("mp_collect_guide_close", iAppContext);
        if (z) {
            str2 = "user";
        } else {
            str2 = "system";
        }
        C66020b.C66021a a2 = a.mo231090a("closed_by", str2);
        if (z2) {
            str3 = "bubble";
        } else {
            str3 = "float";
        }
        a2.mo231090a("closed_at", str3).mo231090a("duration", Long.valueOf(j)).mo231090a("title", str).mo231092a();
    }
}
