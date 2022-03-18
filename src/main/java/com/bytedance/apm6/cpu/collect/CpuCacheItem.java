package com.bytedance.apm6.cpu.collect;

public class CpuCacheItem {

    /* renamed from: a */
    private CpuDataType f10355a;

    /* renamed from: b */
    private double f10356b;

    /* renamed from: c */
    private double f10357c;

    /* renamed from: d */
    private double f10358d;

    /* renamed from: e */
    private double f10359e;

    /* renamed from: f */
    private String f10360f;

    /* renamed from: g */
    private long f10361g;

    /* renamed from: h */
    private int f10362h;

    public enum CpuDataType {
        MIX,
        FRONT,
        BACK
    }

    /* renamed from: a */
    public double mo13374a() {
        return this.f10356b;
    }

    /* renamed from: b */
    public double mo13377b() {
        return this.f10357c;
    }

    /* renamed from: c */
    public double mo13379c() {
        return this.f10358d;
    }

    /* renamed from: d */
    public double mo13381d() {
        return this.f10359e;
    }

    /* renamed from: e */
    public String mo13383e() {
        return this.f10360f;
    }

    /* renamed from: f */
    public long mo13384f() {
        return this.f10361g;
    }

    /* renamed from: g */
    public int mo13385g() {
        return this.f10362h;
    }

    /* renamed from: h */
    public void mo13386h() {
        this.f10362h++;
    }

    public String toString() {
        return "CpuCacheItem{type=" + this.f10355a + ", metricRate=" + this.f10356b + ", metricMaxRate=" + this.f10357c + ", metricCpuStats=" + this.f10358d + ", metricMaxCpuStats=" + this.f10359e + ", sceneString='" + this.f10360f + '\'' + ", firstTs=" + this.f10361g + ", times=" + this.f10362h + '}';
    }

    /* renamed from: a */
    public CpuCacheItem mo13375a(String str) {
        this.f10360f = str;
        return this;
    }

    /* renamed from: a */
    public void mo13376a(double d) {
        if (d >= 0.0d) {
            this.f10356b += d;
        }
    }

    /* renamed from: b */
    public void mo13378b(double d) {
        if (this.f10357c < d) {
            this.f10357c = d;
        }
    }

    /* renamed from: c */
    public void mo13380c(double d) {
        if (d >= 0.0d) {
            this.f10358d += d;
        }
    }

    /* renamed from: d */
    public void mo13382d(double d) {
        if (this.f10359e < d) {
            this.f10359e = d;
        }
    }

    public CpuCacheItem(CpuDataType cpuDataType, long j) {
        this.f10355a = cpuDataType;
        this.f10361g = j;
    }
}
