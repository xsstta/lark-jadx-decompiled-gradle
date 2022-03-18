package com.facebook.battery.metrics.core;

import com.facebook.battery.metrics.core.AbstractC20997b;
import com.facebook.battery.metrics.core.SystemMetrics;

/* renamed from: com.facebook.battery.metrics.core.a */
public class C20996a<R extends SystemMetrics<R>, S extends AbstractC20997b<R>> {

    /* renamed from: a */
    private final S f51379a;

    /* renamed from: b */
    private final R f51380b;

    /* renamed from: c */
    private R f51381c;

    /* renamed from: d */
    private R f51382d;

    /* renamed from: e */
    private boolean f51383e;

    /* renamed from: a */
    public R mo71115a() {
        if (mo71116b() == null) {
            return null;
        }
        R r = this.f51382d;
        this.f51382d = this.f51381c;
        this.f51381c = r;
        return this.f51380b;
    }

    /* renamed from: b */
    public R mo71116b() {
        boolean a = this.f51383e & this.f51379a.mo71109a(this.f51381c);
        this.f51383e = a;
        if (!a) {
            return null;
        }
        this.f51381c.diff(this.f51382d, this.f51380b);
        return this.f51380b;
    }

    public C20996a(S s) {
        this(s, s.mo71110b(), s.mo71110b(), s.mo71110b());
        this.f51383e = s.mo71109a(this.f51382d) & this.f51383e;
    }

    public C20996a(S s, R r, R r2, R r3) {
        this.f51383e = true;
        this.f51379a = s;
        this.f51381c = r;
        this.f51382d = r2;
        this.f51380b = r3;
    }
}
