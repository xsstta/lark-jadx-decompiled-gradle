package com.bytedance.ee.bear.bean;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.bean.a */
public class C4517a implements Cloneable {

    /* renamed from: a */
    public int f13212a;

    /* renamed from: b */
    public int f13213b;

    /* renamed from: c */
    public final int f13214c;

    /* renamed from: d */
    public final String f13215d;

    /* renamed from: e */
    public final String f13216e;

    /* renamed from: f */
    public final String f13217f;

    /* renamed from: g */
    public String f13218g;

    /* renamed from: h */
    public String f13219h;

    /* renamed from: i */
    public String f13220i;

    /* renamed from: j */
    public int f13221j;

    /* renamed from: k */
    public String f13222k;

    /* renamed from: l */
    public String f13223l;

    /* renamed from: m */
    public int f13224m;

    /* renamed from: n */
    public boolean f13225n;

    /* renamed from: o */
    public String f13226o;

    /* renamed from: p */
    public boolean f13227p;

    /* renamed from: q */
    public boolean f13228q;

    /* renamed from: r */
    public String f13229r;

    /* renamed from: s */
    public String f13230s;

    /* renamed from: a */
    public C4517a clone() {
        try {
            return (C4517a) super.clone();
        } catch (CloneNotSupportedException e) {
            C13479a.m54759a("At", "clone at failed", e);
            return null;
        }
    }

    /* renamed from: com.bytedance.ee.bear.bean.a$a */
    public static class C4518a {

        /* renamed from: a */
        public int f13231a;

        /* renamed from: b */
        public int f13232b;

        /* renamed from: c */
        public int f13233c;

        /* renamed from: d */
        public String f13234d;

        /* renamed from: e */
        public String f13235e;

        /* renamed from: f */
        public String f13236f;

        /* renamed from: g */
        public String f13237g;

        /* renamed from: h */
        public String f13238h;

        /* renamed from: i */
        public String f13239i;

        /* renamed from: j */
        public int f13240j;

        /* renamed from: k */
        public String f13241k;

        /* renamed from: l */
        public String f13242l;

        /* renamed from: m */
        public int f13243m;

        /* renamed from: n */
        public boolean f13244n;

        /* renamed from: o */
        public String f13245o;

        /* renamed from: p */
        public boolean f13246p;

        /* renamed from: q */
        public boolean f13247q;

        /* renamed from: r */
        public String f13248r = "";

        /* renamed from: s */
        public String f13249s = "";

        /* renamed from: a */
        public C4517a mo17394a() {
            return new C4517a(this.f13231a, this.f13232b, this.f13233c, this.f13234d, this.f13235e, this.f13236f, this.f13237g, this.f13238h, this.f13239i, this.f13240j, this.f13241k, this.f13242l, this.f13243m, this.f13244n, this.f13245o, this.f13246p, this.f13247q, this.f13248r, this.f13249s);
        }

        /* renamed from: a */
        public C4518a mo17391a(int i) {
            this.f13231a = i;
            return this;
        }

        /* renamed from: b */
        public C4518a mo17395b(int i) {
            this.f13232b = i;
            return this;
        }

        /* renamed from: c */
        public C4518a mo17398c(int i) {
            this.f13233c = i;
            return this;
        }

        /* renamed from: d */
        public C4518a mo17401d(int i) {
            this.f13240j = i;
            return this;
        }

        /* renamed from: e */
        public C4518a mo17403e(int i) {
            this.f13243m = i;
            return this;
        }

        /* renamed from: f */
        public C4518a mo17405f(String str) {
            this.f13239i = str;
            return this;
        }

        /* renamed from: g */
        public C4518a mo17406g(String str) {
            this.f13241k = str;
            return this;
        }

        /* renamed from: h */
        public C4518a mo17407h(String str) {
            this.f13242l = str;
            return this;
        }

        /* renamed from: i */
        public C4518a mo17408i(String str) {
            this.f13245o = str;
            return this;
        }

        /* renamed from: j */
        public C4518a mo17409j(String str) {
            this.f13248r = str;
            return this;
        }

        /* renamed from: k */
        public C4518a mo17410k(String str) {
            this.f13249s = str;
            return this;
        }

        /* renamed from: a */
        public C4518a mo17392a(String str) {
            this.f13234d = str;
            return this;
        }

        /* renamed from: b */
        public C4518a mo17396b(String str) {
            this.f13235e = str;
            return this;
        }

        /* renamed from: c */
        public C4518a mo17399c(String str) {
            this.f13236f = str;
            return this;
        }

        /* renamed from: d */
        public C4518a mo17402d(String str) {
            this.f13237g = str;
            return this;
        }

        /* renamed from: e */
        public C4518a mo17404e(String str) {
            this.f13238h = str;
            return this;
        }

        /* renamed from: a */
        public C4518a mo17393a(boolean z) {
            this.f13244n = z;
            return this;
        }

        /* renamed from: b */
        public C4518a mo17397b(boolean z) {
            this.f13246p = z;
            return this;
        }

        /* renamed from: c */
        public C4518a mo17400c(boolean z) {
            this.f13247q = z;
            return this;
        }
    }

    public C4517a(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, int i5, boolean z, String str9, boolean z2, boolean z3, String str10, String str11) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        this.f13212a = i;
        this.f13213b = i2;
        this.f13214c = i3;
        this.f13215d = str;
        String str17 = "";
        if (str2 == null) {
            str12 = str17;
        } else {
            str12 = str2;
        }
        this.f13216e = str12;
        this.f13217f = str3;
        if (str4 == null) {
            str13 = str17;
        } else {
            str13 = str4;
        }
        this.f13218g = str13;
        if (str5 == null) {
            str14 = str17;
        } else {
            str14 = str5;
        }
        this.f13219h = str14;
        if (str6 == null) {
            str15 = str17;
        } else {
            str15 = str6;
        }
        this.f13220i = str15;
        this.f13221j = i4;
        this.f13222k = str7;
        this.f13223l = str8;
        this.f13224m = i5;
        this.f13225n = z;
        this.f13226o = str9;
        this.f13227p = z2;
        this.f13228q = z3;
        if (str10 == null) {
            str16 = str17;
        } else {
            str16 = str10;
        }
        this.f13229r = str16;
        this.f13230s = str11 != null ? str11 : str17;
    }
}
