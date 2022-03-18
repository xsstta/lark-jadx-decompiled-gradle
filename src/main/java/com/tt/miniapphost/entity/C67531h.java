package com.tt.miniapphost.entity;

import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tt.miniapphost.util.DebugUtil;
import java.util.Locale;

/* renamed from: com.tt.miniapphost.entity.h */
public class C67531h {

    /* renamed from: a */
    private String f170305a;

    /* renamed from: b */
    private String f170306b;

    /* renamed from: c */
    private String f170307c;

    /* renamed from: d */
    private String f170308d;

    /* renamed from: e */
    private String f170309e;

    /* renamed from: f */
    private String f170310f = "Android";

    /* renamed from: g */
    private String f170311g = Build.VERSION.RELEASE;

    /* renamed from: h */
    private String f170312h;

    /* renamed from: i */
    private String f170313i;

    /* renamed from: j */
    private String f170314j;

    /* renamed from: k */
    private String f170315k;

    /* renamed from: l */
    private String f170316l;

    /* renamed from: m */
    private SparseArray<String> f170317m;

    /* renamed from: n */
    private String f170318n;

    /* renamed from: a */
    public String mo234500a() {
        return this.f170308d;
    }

    /* renamed from: b */
    public String mo234502b() {
        return this.f170309e;
    }

    /* renamed from: c */
    public String mo234503c() {
        return this.f170310f;
    }

    /* renamed from: d */
    public String mo234504d() {
        return this.f170311g;
    }

    /* renamed from: e */
    public String mo234505e() {
        return this.f170315k;
    }

    /* renamed from: f */
    public String mo234506f() {
        return this.f170314j;
    }

    /* renamed from: g */
    public String mo234507g() {
        return this.f170313i;
    }

    /* renamed from: h */
    public String mo234508h() {
        return this.f170316l;
    }

    /* renamed from: i */
    public String mo234509i() {
        return this.f170318n;
    }

    /* renamed from: j */
    public String mo234510j() {
        return this.f170306b;
    }

    /* renamed from: k */
    public String mo234511k() {
        return this.f170305a;
    }

    /* renamed from: l */
    public String mo234512l() {
        return this.f170307c;
    }

    /* renamed from: m */
    public String mo234513m() {
        return this.f170312h;
    }

    /* renamed from: com.tt.miniapphost.entity.h$a */
    public static class C67532a {

        /* renamed from: a */
        public String f170319a = "";

        /* renamed from: b */
        public String f170320b = "";

        /* renamed from: c */
        public String f170321c = "";

        /* renamed from: d */
        public String f170322d = "";

        /* renamed from: e */
        public String f170323e = "";

        /* renamed from: f */
        public String f170324f = "";

        /* renamed from: g */
        public String f170325g = "";

        /* renamed from: h */
        public String f170326h = "";

        /* renamed from: i */
        public String f170327i = "";

        /* renamed from: j */
        public String f170328j = "";

        /* renamed from: k */
        public SparseArray<String> f170329k;

        /* renamed from: l */
        private Locale f170330l;

        /* renamed from: m */
        private String f170331m = "";

        /* renamed from: a */
        public C67531h mo234517a() {
            return new C67531h(this.f170319a, this.f170320b, this.f170321c, this.f170322d, this.f170323e, this.f170324f, this.f170325g, this.f170326h, this.f170327i, this.f170328j, this.f170329k, this.f170331m);
        }

        /* renamed from: a */
        public C67532a mo234514a(SparseArray<String> sparseArray) {
            this.f170329k = sparseArray;
            return this;
        }

        /* renamed from: b */
        public C67532a mo234518b(String str) {
            this.f170321c = str;
            return this;
        }

        /* renamed from: c */
        public C67532a mo234519c(String str) {
            this.f170323e = str;
            return this;
        }

        /* renamed from: a */
        public C67532a mo234516a(Locale locale) {
            this.f170330l = locale;
            return this;
        }

        /* renamed from: a */
        public C67532a mo234515a(String str) {
            if (!DebugUtil.debug() || !TextUtils.isEmpty(str)) {
                this.f170320b = str;
                return this;
            }
            throw new IllegalStateException("appId can not empty");
        }

        /* renamed from: d */
        public C67532a mo234520d(String str) {
            if (!DebugUtil.debug() || !TextUtils.isEmpty(str)) {
                this.f170324f = str;
                return this;
            }
            throw new IllegalStateException("channel can not empty");
        }

        /* renamed from: e */
        public C67532a mo234521e(String str) {
            if (!DebugUtil.debug() || !TextUtils.isEmpty(str)) {
                this.f170326h = str;
                return this;
            }
            throw new IllegalStateException("appName can not empty");
        }
    }

    /* renamed from: a */
    public String mo234501a(int i, String str) {
        SparseArray<String> sparseArray = this.f170317m;
        if (sparseArray == null || sparseArray.get(i) == null) {
            return str;
        }
        return this.f170317m.get(i);
    }

    public C67531h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SparseArray<String> sparseArray, String str11) {
        this.f170305a = str;
        this.f170306b = str2;
        this.f170307c = str3;
        this.f170308d = str4;
        this.f170316l = str5;
        this.f170309e = str6;
        this.f170314j = str7;
        this.f170315k = str8;
        this.f170312h = str9;
        this.f170313i = str10;
        this.f170317m = sparseArray;
        this.f170318n = str11;
    }
}
