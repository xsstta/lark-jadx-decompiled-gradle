package com.bytedance.ee.falcon.inspector.network;

import android.content.Context;
import com.bytedance.ee.falcon.inspector.p604b.AbstractC12650c;
import com.bytedance.ee.falcon.inspector.p604b.C12648a;

/* renamed from: com.bytedance.ee.falcon.inspector.network.k */
public class C12681k extends C12648a {

    /* renamed from: c */
    private static C12681k f33929c;

    /* renamed from: a */
    public final C12685n f33930a;

    /* renamed from: b */
    public C12666c f33931b;

    /* renamed from: d */
    private final AbstractC12650c f33932d;

    /* renamed from: c */
    public C12685n mo48064c() {
        return this.f33930a;
    }

    /* renamed from: d */
    public C12666c mo48065d() {
        return this.f33931b;
    }

    /* renamed from: b */
    public static synchronized C12681k m52540b() {
        C12681k kVar;
        synchronized (C12681k.class) {
            kVar = f33929c;
        }
        return kVar;
    }

    public C12681k(C12685n nVar) {
        C126821 r0 = new AbstractC12650c() {
            /* class com.bytedance.ee.falcon.inspector.network.C12681k.C126821 */
        };
        this.f33932d = r0;
        this.f33930a = nVar;
        mo48021a(r0);
    }

    /* renamed from: a */
    public static synchronized C12681k m52539a(Context context) {
        C12681k kVar;
        synchronized (C12681k.class) {
            if (f33929c == null) {
                f33929c = new C12681k(new C12685n(context.getApplicationContext()));
            }
            kVar = f33929c;
        }
        return kVar;
    }
}
