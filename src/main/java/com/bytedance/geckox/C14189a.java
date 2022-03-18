package com.bytedance.geckox;

/* renamed from: com.bytedance.geckox.a */
public class C14189a {

    /* renamed from: a */
    private static volatile C14189a f37323a;

    /* renamed from: b */
    private boolean f37324b;

    /* renamed from: c */
    private boolean f37325c;

    /* renamed from: d */
    private boolean f37326d;

    /* renamed from: e */
    private int f37327e = 7;

    /* renamed from: b */
    public boolean mo52069b() {
        return this.f37324b;
    }

    /* renamed from: c */
    public boolean mo52070c() {
        return this.f37325c;
    }

    /* renamed from: d */
    public boolean mo52071d() {
        return this.f37326d;
    }

    private C14189a() {
    }

    /* renamed from: a */
    public static C14189a m57302a() {
        if (f37323a == null) {
            synchronized (C14189a.class) {
                if (f37323a == null) {
                    f37323a = new C14189a();
                }
            }
        }
        return f37323a;
    }
}
