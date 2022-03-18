package com.bytedance.android.monitor.p111h;

import android.content.Context;

/* renamed from: com.bytedance.android.monitor.h.a */
public class C2649a implements AbstractC2650b {

    /* renamed from: a */
    private static volatile C2649a f8428a;

    /* renamed from: b */
    private C2652d f8429b;

    /* renamed from: c */
    private C2651c f8430c;

    @Override // com.bytedance.android.monitor.p111h.AbstractC2650b
    /* renamed from: a */
    public void mo11465a(Context context) {
    }

    @Override // com.bytedance.android.monitor.p111h.AbstractC2650b
    /* renamed from: d */
    public void mo11468d() {
    }

    @Override // com.bytedance.android.monitor.p111h.AbstractC2650b
    /* renamed from: b */
    public C2652d mo11466b() {
        if (this.f8429b == null) {
            this.f8429b = new C2652d();
        }
        return this.f8429b;
    }

    @Override // com.bytedance.android.monitor.p111h.AbstractC2650b
    /* renamed from: c */
    public C2651c mo11467c() {
        if (this.f8430c == null) {
            this.f8430c = new C2651c();
        }
        return this.f8430c;
    }

    /* renamed from: a */
    public static C2649a m11147a() {
        if (f8428a == null) {
            synchronized (C2649a.class) {
                if (f8428a == null) {
                    f8428a = new C2649a();
                }
            }
        }
        return f8428a;
    }
}
