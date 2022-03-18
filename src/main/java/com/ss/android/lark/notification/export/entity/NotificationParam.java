package com.ss.android.lark.notification.export.entity;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class NotificationParam {

    /* renamed from: a */
    private final int f122024a;

    /* renamed from: b */
    private final String f122025b;

    /* renamed from: c */
    private final PendingIntent f122026c;

    /* renamed from: d */
    private final PendingIntent f122027d;

    /* renamed from: e */
    private final boolean f122028e;

    /* renamed from: f */
    private final int f122029f;

    /* renamed from: g */
    private final Bitmap f122030g;

    /* renamed from: h */
    private final String f122031h;

    /* renamed from: i */
    private final String f122032i;

    /* renamed from: j */
    private final String f122033j;

    /* renamed from: k */
    private final String f122034k;

    /* renamed from: l */
    private final String f122035l;

    /* renamed from: m */
    private final boolean f122036m;

    /* renamed from: n */
    private final boolean f122037n;

    /* renamed from: o */
    private final Uri f122038o;

    /* renamed from: p */
    private final int f122039p;

    /* renamed from: q */
    private final int f122040q;

    /* renamed from: r */
    private final String f122041r;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotifyMode {
    }

    /* renamed from: a */
    public int mo169555a() {
        return this.f122024a;
    }

    /* renamed from: b */
    public String mo169556b() {
        return this.f122025b;
    }

    /* renamed from: c */
    public PendingIntent mo169557c() {
        return this.f122026c;
    }

    /* renamed from: d */
    public int mo169558d() {
        return this.f122029f;
    }

    /* renamed from: e */
    public Bitmap mo169559e() {
        return this.f122030g;
    }

    /* renamed from: f */
    public String mo169560f() {
        return this.f122031h;
    }

    /* renamed from: g */
    public String mo169561g() {
        return this.f122032i;
    }

    /* renamed from: h */
    public String mo169562h() {
        return this.f122033j;
    }

    /* renamed from: i */
    public String mo169563i() {
        return this.f122034k;
    }

    /* renamed from: j */
    public String mo169564j() {
        return this.f122035l;
    }

    /* renamed from: k */
    public int mo169565k() {
        return this.f122039p;
    }

    /* renamed from: l */
    public boolean mo169566l() {
        return this.f122036m;
    }

    /* renamed from: m */
    public boolean mo169567m() {
        return this.f122037n;
    }

    /* renamed from: n */
    public Uri mo169568n() {
        return this.f122038o;
    }

    /* renamed from: o */
    public int mo169569o() {
        return this.f122040q;
    }

    /* renamed from: p */
    public String mo169570p() {
        return this.f122041r;
    }

    /* renamed from: com.ss.android.lark.notification.export.entity.NotificationParam$a */
    public static class C48498a {

        /* renamed from: a */
        private final int f122042a;

        /* renamed from: b */
        private String f122043b = "-1";

        /* renamed from: c */
        private int f122044c = -1;

        /* renamed from: d */
        private Bitmap f122045d;

        /* renamed from: e */
        private PendingIntent f122046e;

        /* renamed from: f */
        private PendingIntent f122047f;

        /* renamed from: g */
        private boolean f122048g;

        /* renamed from: h */
        private String f122049h;

        /* renamed from: i */
        private String f122050i;

        /* renamed from: j */
        private String f122051j;

        /* renamed from: k */
        private String f122052k;

        /* renamed from: l */
        private String f122053l;

        /* renamed from: m */
        private boolean f122054m;

        /* renamed from: n */
        private boolean f122055n;

        /* renamed from: o */
        private Uri f122056o;

        /* renamed from: p */
        private int f122057p = -1;

        /* renamed from: q */
        private int f122058q;

        /* renamed from: r */
        private String f122059r;

        /* renamed from: a */
        public NotificationParam mo169578a() {
            return new NotificationParam(this.f122042a, this.f122043b, this.f122046e, this.f122047f, this.f122048g, this.f122044c, this.f122045d, this.f122049h, this.f122050i, this.f122051j, this.f122052k, this.f122053l, this.f122054m, this.f122055n, this.f122056o, this.f122057p, this.f122058q, this.f122059r);
        }

        /* renamed from: a */
        public C48498a mo169571a(int i) {
            this.f122044c = i;
            return this;
        }

        /* renamed from: b */
        public C48498a mo169579b(int i) {
            this.f122057p = i;
            return this;
        }

        /* renamed from: c */
        public C48498a mo169582c(int i) {
            this.f122058q = i;
            return this;
        }

        /* renamed from: d */
        public C48498a mo169584d(String str) {
            this.f122052k = str;
            return this;
        }

        /* renamed from: e */
        public C48498a mo169585e(String str) {
            this.f122053l = str;
            return this;
        }

        /* renamed from: f */
        public C48498a mo169586f(String str) {
            this.f122059r = str;
            return this;
        }

        /* renamed from: a */
        public C48498a mo169574a(Bitmap bitmap) {
            this.f122045d = bitmap;
            return this;
        }

        /* renamed from: b */
        public C48498a mo169580b(String str) {
            this.f122050i = str;
            return this;
        }

        /* renamed from: c */
        public C48498a mo169583c(String str) {
            this.f122051j = str;
            return this;
        }

        /* renamed from: a */
        public C48498a mo169572a(PendingIntent pendingIntent) {
            this.f122046e = pendingIntent;
            this.f122048g = false;
            this.f122047f = null;
            return this;
        }

        /* renamed from: b */
        public C48498a mo169581b(boolean z) {
            this.f122055n = z;
            return this;
        }

        /* renamed from: a */
        public C48498a mo169575a(Uri uri) {
            this.f122056o = uri;
            return this;
        }

        /* renamed from: a */
        public C48498a mo169576a(String str) {
            this.f122049h = str;
            return this;
        }

        /* renamed from: a */
        public C48498a mo169577a(boolean z) {
            this.f122054m = z;
            return this;
        }

        public C48498a(int i, String str) {
            this.f122042a = i;
            this.f122043b = str;
        }

        /* renamed from: a */
        public C48498a mo169573a(Context context, int i) {
            this.f122045d = BitmapFactory.decodeResource(context.getResources(), i);
            return this;
        }
    }

    private NotificationParam(int i, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z, int i2, Bitmap bitmap, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, Uri uri, int i3, int i4, String str7) {
        this.f122024a = i;
        this.f122025b = str;
        this.f122026c = pendingIntent;
        this.f122027d = pendingIntent2;
        this.f122028e = z;
        this.f122029f = i2;
        this.f122030g = bitmap;
        this.f122031h = str2;
        this.f122032i = str3;
        this.f122033j = str4;
        this.f122034k = str5;
        this.f122035l = str6;
        this.f122036m = z2;
        this.f122037n = z3;
        this.f122038o = uri;
        this.f122040q = i3;
        this.f122039p = i4;
        this.f122041r = str7;
    }
}
