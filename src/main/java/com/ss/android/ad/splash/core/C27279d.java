package com.ss.android.ad.splash.core;

import com.ss.android.ad.splash.core.model.C27331b;

/* renamed from: com.ss.android.ad.splash.core.d */
public class C27279d {

    /* renamed from: a */
    private static volatile C27279d f67988a;

    /* renamed from: b */
    private volatile C27331b f67989b;

    /* renamed from: c */
    private long f67990c;

    private C27279d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo97312c() {
        this.f67989b = null;
        this.f67990c = 0;
    }

    /* renamed from: a */
    public static C27279d m99193a() {
        if (f67988a == null) {
            synchronized (C27279d.class) {
                if (f67988a == null) {
                    f67988a = new C27279d();
                }
            }
        }
        return f67988a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27331b mo97311b() {
        if (Math.abs(System.currentTimeMillis() - this.f67990c) <= 10000) {
            return this.f67989b;
        }
        this.f67989b = null;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97310a(C27331b bVar) {
        this.f67989b = bVar;
        this.f67990c = System.currentTimeMillis();
    }
}
