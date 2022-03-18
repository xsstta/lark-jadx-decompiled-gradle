package com.bytedance.apm6.cpu.p169a;

/* renamed from: com.bytedance.apm6.cpu.a.a */
public class C3227a {

    /* renamed from: a */
    private long f10338a = 120;

    /* renamed from: b */
    private long f10339b = 600;

    /* renamed from: c */
    private long f10340c = 1200;

    /* renamed from: d */
    private boolean f10341d;

    /* renamed from: d */
    public boolean mo13350d() {
        return this.f10341d;
    }

    /* renamed from: a */
    public long mo13343a() {
        return this.f10338a * 1000;
    }

    /* renamed from: b */
    public long mo13346b() {
        return this.f10339b * 1000;
    }

    /* renamed from: c */
    public long mo13348c() {
        return this.f10340c * 1000;
    }

    public String toString() {
        return "CpuConfig{mFrontCollectInterval=" + this.f10338a + ", mBackCollectInterval=" + this.f10339b + ", mMonitorInterval=" + this.f10340c + ", mEnableUpload=" + this.f10341d + '}';
    }

    /* renamed from: a */
    public void mo13344a(long j) {
        this.f10338a = j;
    }

    /* renamed from: b */
    public void mo13347b(long j) {
        this.f10339b = j;
    }

    /* renamed from: c */
    public void mo13349c(long j) {
        this.f10340c = j;
    }

    /* renamed from: a */
    public void mo13345a(boolean z) {
        this.f10341d = z;
    }
}
