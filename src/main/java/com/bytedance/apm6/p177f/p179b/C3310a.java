package com.bytedance.apm6.p177f.p179b;

/* renamed from: com.bytedance.apm6.f.b.a */
public final class C3310a {

    /* renamed from: a */
    private long f10555a;

    /* renamed from: b */
    private double f10556b;

    /* renamed from: c */
    private boolean f10557c;

    /* renamed from: d */
    private boolean f10558d;

    /* renamed from: e */
    private boolean f10559e;

    /* renamed from: f */
    private boolean f10560f;

    /* renamed from: c */
    public long mo13535c() {
        return this.f10555a;
    }

    /* renamed from: d */
    public boolean mo13536d() {
        return this.f10557c;
    }

    /* renamed from: e */
    public boolean mo13537e() {
        return this.f10558d;
    }

    /* renamed from: f */
    public boolean mo13538f() {
        return this.f10559e;
    }

    /* renamed from: a */
    public boolean mo13532a() {
        return this.f10560f;
    }

    /* renamed from: b */
    public double mo13533b() {
        double d = this.f10556b;
        if (d > 0.5d) {
            return d;
        }
        return 0.8d;
    }

    public String toString() {
        return "MemoryConfig{memoryCollectionInterval=" + this.f10555a + ", memoryTopCheckThreshold=" + this.f10556b + ", isStopWhenBackground=" + this.f10557c + ", isRealTimeMemEnable=" + this.f10558d + ", isUploadEnable=" + this.f10559e + ", isApm6SampleEnable=" + this.f10560f + '}';
    }

    /* renamed from: a */
    public void mo13531a(boolean z) {
        this.f10558d = z;
    }

    /* renamed from: b */
    public void mo13534b(boolean z) {
        this.f10557c = z;
    }

    public C3310a(long j, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        if (j <= 0) {
            this.f10555a = 120;
        } else {
            this.f10555a = j;
        }
        this.f10556b = d;
        this.f10560f = z4;
        this.f10557c = z;
        this.f10558d = z2;
        this.f10559e = z3;
    }
}
