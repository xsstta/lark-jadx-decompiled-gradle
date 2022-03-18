package com.bytedance.platform.godzilla.anr.monitor.idletask;

import com.bytedance.platform.godzilla.anr.monitor.AbstractC20300a;

/* renamed from: com.bytedance.platform.godzilla.anr.monitor.idletask.b */
public final class C20302b {

    /* renamed from: b */
    private static C20302b f49575b;

    /* renamed from: a */
    private AbstractC20300a f49576a;

    private C20302b() {
    }

    /* renamed from: b */
    public AbstractC20300a mo68616b() {
        return this.f49576a;
    }

    /* renamed from: a */
    public static C20302b m74054a() {
        if (f49575b == null) {
            synchronized (C20302b.class) {
                if (f49575b == null) {
                    f49575b = new C20302b();
                }
            }
        }
        return f49575b;
    }
}
