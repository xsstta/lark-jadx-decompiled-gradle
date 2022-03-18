package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C21589a {

    /* renamed from: a */
    private static int f52519a = 31;

    /* renamed from: b */
    private int f52520b = 1;

    /* renamed from: a */
    public C21589a mo73084a(Object obj) {
        this.f52520b = (f52519a * this.f52520b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C21589a mo73085a(boolean z) {
        this.f52520b = (f52519a * this.f52520b) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public int mo73083a() {
        return this.f52520b;
    }
}
