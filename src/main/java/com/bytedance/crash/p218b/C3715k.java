package com.bytedance.crash.p218b;

import android.content.Context;

/* renamed from: com.bytedance.crash.b.k */
public class C3715k {

    /* renamed from: a */
    private static volatile C3715k f11460a;

    /* renamed from: b */
    private final C3693b f11461b;

    /* renamed from: a */
    public C3693b mo15165a() {
        return this.f11461b;
    }

    /* renamed from: b */
    public void mo15166b() {
        this.f11461b.mo15103a();
    }

    /* renamed from: c */
    public void mo15167c() {
        this.f11461b.mo15105b();
    }

    private C3715k(Context context) {
        this.f11461b = new C3693b(context);
    }

    /* renamed from: a */
    public static C3715k m15322a(Context context) {
        if (f11460a == null) {
            synchronized (C3715k.class) {
                if (f11460a == null) {
                    f11460a = new C3715k(context);
                }
            }
        }
        return f11460a;
    }
}
