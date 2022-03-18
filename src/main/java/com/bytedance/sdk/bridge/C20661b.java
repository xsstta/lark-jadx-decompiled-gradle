package com.bytedance.sdk.bridge;

import android.content.Context;
import com.bytedance.sdk.bridge.api.AbstractC20660a;

/* renamed from: com.bytedance.sdk.bridge.b */
public class C20661b {

    /* renamed from: a */
    private Boolean f50400a;

    /* renamed from: b */
    private String f50401b;

    /* renamed from: c */
    private Boolean f50402c;

    /* renamed from: d */
    private Boolean f50403d;

    /* renamed from: e */
    private Boolean f50404e;

    /* renamed from: f */
    private AbstractC20660a f50405f;

    /* renamed from: g */
    private boolean f50406g;

    /* renamed from: h */
    private Context f50407h;

    /* renamed from: i */
    private String f50408i;

    /* renamed from: b */
    public String mo69545b() {
        return this.f50401b;
    }

    /* renamed from: e */
    public boolean mo69548e() {
        return this.f50406g;
    }

    /* renamed from: g */
    public AbstractC20660a mo69550g() {
        return this.f50405f;
    }

    /* renamed from: a */
    public Boolean mo69544a() {
        boolean z;
        Boolean bool = this.f50400a;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public Boolean mo69546c() {
        boolean z;
        Boolean bool = this.f50402c;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    public Boolean mo69547d() {
        boolean z;
        Boolean bool = this.f50403d;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    public Boolean mo69549f() {
        boolean z;
        Boolean bool = this.f50404e;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: com.bytedance.sdk.bridge.b$a */
    public static class C20663a {

        /* renamed from: a */
        private String f50409a;

        /* renamed from: b */
        private Boolean f50410b;

        /* renamed from: c */
        private Boolean f50411c = true;

        /* renamed from: d */
        private Boolean f50412d;

        /* renamed from: e */
        private Boolean f50413e;

        /* renamed from: f */
        private AbstractC20660a f50414f;

        /* renamed from: g */
        private boolean f50415g;

        /* renamed from: h */
        private Context f50416h;

        /* renamed from: i */
        private String f50417i = "https://jsb.snssdk.com/";

        /* renamed from: a */
        public C20661b mo69553a() {
            return new C20661b(this.f50410b, this.f50409a, this.f50411c, this.f50412d, this.f50413e, this.f50414f, this.f50417i, this.f50415g, this.f50416h);
        }

        /* renamed from: a */
        public C20663a mo69551a(Boolean bool) {
            this.f50410b = bool;
            return this;
        }

        /* renamed from: b */
        public C20663a mo69554b(Boolean bool) {
            this.f50411c = bool;
            return this;
        }

        /* renamed from: c */
        public C20663a mo69555c(Boolean bool) {
            this.f50412d = bool;
            return this;
        }

        /* renamed from: d */
        public C20663a mo69556d(Boolean bool) {
            this.f50413e = bool;
            return this;
        }

        /* renamed from: a */
        public C20663a mo69552a(String str) {
            this.f50409a = str;
            return this;
        }
    }

    private C20661b(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, AbstractC20660a aVar, String str2, boolean z, Context context) {
        this.f50400a = bool;
        this.f50401b = str;
        this.f50402c = bool2;
        this.f50403d = bool3;
        this.f50404e = bool4;
        this.f50405f = aVar;
        this.f50407h = context;
        this.f50408i = str2;
        this.f50406g = z;
    }
}
