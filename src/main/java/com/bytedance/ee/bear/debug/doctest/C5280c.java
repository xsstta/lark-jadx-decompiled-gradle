package com.bytedance.ee.bear.debug.doctest;

import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.debug.doctest.c */
public class C5280c implements AbstractC5279b {

    /* renamed from: a */
    private WeakReference<IDocTrigger> f15122a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.debug.doctest.c$a */
    public static final class C5282a {

        /* renamed from: a */
        static C5280c f15123a = new C5280c();
    }

    private C5280c() {
    }

    /* renamed from: a */
    public static AbstractC5279b m21602a() {
        return C5282a.f15123a;
    }

    @Override // com.bytedance.ee.bear.debug.doctest.AbstractC5279b
    /* renamed from: a */
    public void mo21250a(IDocTrigger eVar) {
        this.f15122a = new WeakReference<>(eVar);
    }
}
