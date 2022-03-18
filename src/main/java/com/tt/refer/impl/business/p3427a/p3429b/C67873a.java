package com.tt.refer.impl.business.p3427a.p3429b;

import com.larksuite.suite.R;

/* renamed from: com.tt.refer.impl.business.a.b.a */
public class C67873a {

    /* renamed from: com.tt.refer.impl.business.a.b.a$a */
    public static class C67874a {

        /* renamed from: a */
        public int f170939a;

        /* renamed from: b */
        public int f170940b = -1;

        /* renamed from: c */
        public boolean f170941c;

        /* renamed from: d */
        public String f170942d;

        /* renamed from: e */
        public float f170943e;

        /* renamed from: f */
        public float f170944f;
    }

    /* renamed from: a */
    public static C67874a m264045a(int i) {
        C67874a aVar = new C67874a();
        if (i <= 0) {
            aVar.f170941c = false;
        } else if (i < 10) {
            aVar.f170941c = true;
            aVar.f170939a = R.drawable.badge_orange_single_count_bg_stroke;
            aVar.f170942d = "" + i;
        } else if (i < 1000) {
            aVar.f170941c = true;
            aVar.f170939a = R.drawable.badge_orange_multi_count_bg_stroke;
            aVar.f170942d = "" + i;
        } else {
            aVar.f170941c = true;
            aVar.f170939a = R.drawable.badge_orange_bg_etc_count_stroke;
            aVar.f170942d = "";
        }
        aVar.f170943e = 2.5f;
        aVar.f170940b = -1;
        aVar.f170944f = 11.0f;
        return aVar;
    }
}
