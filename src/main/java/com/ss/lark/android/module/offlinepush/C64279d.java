package com.ss.lark.android.module.offlinepush;

import android.content.Context;
import com.bytedance.common.utility.NetworkClient;
import com.ss.lark.android.module.offlinepush.C64266c;

/* renamed from: com.ss.lark.android.module.offlinepush.d */
public class C64279d {

    /* renamed from: a */
    final Context f162460a;

    /* renamed from: b */
    final String f162461b;

    /* renamed from: c */
    final String f162462c;

    /* renamed from: d */
    final String f162463d;

    /* renamed from: e */
    final int f162464e;

    /* renamed from: f */
    final int f162465f;

    /* renamed from: g */
    final String f162466g;

    /* renamed from: h */
    final String f162467h;

    /* renamed from: i */
    final String f162468i;

    /* renamed from: j */
    final String f162469j;

    /* renamed from: k */
    final String f162470k;

    /* renamed from: l */
    final String f162471l;

    /* renamed from: m */
    final NetworkClient f162472m;

    /* renamed from: n */
    final C64266c.AbstractC64276c f162473n;

    /* renamed from: o */
    final C64266c.AbstractC64277d f162474o;

    /* renamed from: p */
    final String f162475p;

    /* renamed from: q */
    int f162476q;

    /* renamed from: com.ss.lark.android.module.offlinepush.d$a */
    public static class C64281a {

        /* renamed from: a */
        Context f162477a;

        /* renamed from: b */
        String f162478b;

        /* renamed from: c */
        int f162479c;

        /* renamed from: d */
        String f162480d;

        /* renamed from: e */
        String f162481e;

        /* renamed from: f */
        int f162482f;

        /* renamed from: g */
        int f162483g;

        /* renamed from: h */
        String f162484h;

        /* renamed from: i */
        String f162485i;

        /* renamed from: j */
        String f162486j;

        /* renamed from: k */
        String f162487k;

        /* renamed from: l */
        String f162488l;

        /* renamed from: m */
        String f162489m;

        /* renamed from: n */
        NetworkClient f162490n;

        /* renamed from: o */
        C64266c.AbstractC64276c f162491o;

        /* renamed from: p */
        C64266c.AbstractC64277d f162492p;

        /* renamed from: q */
        String f162493q;

        /* renamed from: a */
        public C64279d mo222750a() {
            return new C64279d(this);
        }

        /* renamed from: a */
        public C64281a mo222745a(int i) {
            this.f162479c = i;
            return this;
        }

        /* renamed from: b */
        public C64281a mo222751b(int i) {
            this.f162482f = i;
            return this;
        }

        /* renamed from: c */
        public C64281a mo222753c(int i) {
            this.f162483g = i;
            return this;
        }

        /* renamed from: d */
        public C64281a mo222755d(String str) {
            this.f162484h = str;
            return this;
        }

        /* renamed from: e */
        public C64281a mo222756e(String str) {
            this.f162485i = str;
            return this;
        }

        /* renamed from: f */
        public C64281a mo222757f(String str) {
            this.f162486j = str;
            return this;
        }

        /* renamed from: g */
        public C64281a mo222758g(String str) {
            this.f162487k = str;
            return this;
        }

        /* renamed from: h */
        public C64281a mo222759h(String str) {
            this.f162488l = str;
            return this;
        }

        /* renamed from: i */
        public C64281a mo222760i(String str) {
            this.f162489m = str;
            return this;
        }

        /* renamed from: j */
        public C64281a mo222761j(String str) {
            this.f162493q = str;
            return this;
        }

        public C64281a(Context context) {
            this.f162477a = context;
        }

        /* renamed from: a */
        public C64281a mo222746a(NetworkClient networkClient) {
            this.f162490n = networkClient;
            return this;
        }

        /* renamed from: b */
        public C64281a mo222752b(String str) {
            this.f162480d = str;
            return this;
        }

        /* renamed from: c */
        public C64281a mo222754c(String str) {
            this.f162481e = str;
            return this;
        }

        /* renamed from: a */
        public C64281a mo222747a(C64266c.AbstractC64276c cVar) {
            this.f162491o = cVar;
            return this;
        }

        /* renamed from: a */
        public C64281a mo222748a(C64266c.AbstractC64277d dVar) {
            this.f162492p = dVar;
            return this;
        }

        /* renamed from: a */
        public C64281a mo222749a(String str) {
            this.f162478b = str;
            return this;
        }
    }

    private C64279d(C64281a aVar) {
        Context context = aVar.f162477a;
        this.f162460a = context;
        String str = aVar.f162478b;
        this.f162461b = str;
        this.f162476q = aVar.f162479c;
        String str2 = aVar.f162480d;
        this.f162462c = str2;
        String str3 = aVar.f162481e;
        this.f162463d = str3;
        int i = aVar.f162482f;
        this.f162464e = i;
        this.f162465f = aVar.f162483g;
        this.f162473n = aVar.f162491o;
        NetworkClient networkClient = aVar.f162490n;
        this.f162472m = networkClient;
        this.f162474o = aVar.f162492p;
        String str4 = aVar.f162484h;
        this.f162466g = str4;
        String str5 = aVar.f162485i;
        this.f162467h = str5;
        String str6 = aVar.f162486j;
        this.f162468i = str6;
        String str7 = aVar.f162487k;
        this.f162469j = str7;
        String str8 = aVar.f162488l;
        this.f162470k = str8;
        String str9 = aVar.f162489m;
        this.f162471l = str9;
        this.f162475p = aVar.f162493q;
        m252772a(context, "context");
        m252772a(str, "appName");
        m252772a(Integer.valueOf(this.f162476q), "appId");
        m252772a(str2, "appChannel");
        m252772a(str3, "appVersion");
        m252772a(Integer.valueOf(i), "appVersionCode");
        m252772a(networkClient, "networkClient");
        m252772a(str4, "miPushAppId");
        m252772a(str5, "miPushAppKey");
        m252772a(str6, "meizuAppId");
        m252772a(str7, "meizuAppKey");
        m252772a(str8, "oppoAppKey");
        m252772a(str9, "oppoAppSecret");
    }

    /* renamed from: a */
    private void m252772a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str + " cannot be empty");
        }
    }
}
