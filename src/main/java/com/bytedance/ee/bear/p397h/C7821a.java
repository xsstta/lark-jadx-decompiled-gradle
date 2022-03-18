package com.bytedance.ee.bear.p397h;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.h.a */
public class C7821a {

    /* renamed from: a */
    private static volatile C7821a f21131a;

    /* renamed from: b */
    private volatile AbstractC7826d f21132b;

    private C7821a() {
    }

    /* renamed from: a */
    public static C7821a m31348a() {
        if (f21131a == null) {
            synchronized (C7821a.class) {
                if (f21131a == null) {
                    f21131a = new C7821a();
                }
            }
        }
        return f21131a;
    }

    /* renamed from: a */
    public void mo30592a(AbstractC7826d dVar) {
        C13479a.m54764b("FeatureSwitch", "init, agent=" + dVar);
        this.f21132b = dVar;
    }
}
