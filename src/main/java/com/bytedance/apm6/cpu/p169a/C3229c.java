package com.bytedance.apm6.cpu.p169a;

import java.util.Map;

/* renamed from: com.bytedance.apm6.cpu.a.c */
public class C3229c {

    /* renamed from: a */
    private boolean f10342a;

    /* renamed from: b */
    private boolean f10343b;

    /* renamed from: c */
    private double f10344c = 3.0d;

    /* renamed from: d */
    private double f10345d = 6.0d;

    /* renamed from: e */
    private double f10346e = 0.05d;

    /* renamed from: f */
    private boolean f10347f;

    /* renamed from: g */
    private Map<String, Double> f10348g;

    /* renamed from: h */
    private Map<String, Double> f10349h;

    /* renamed from: b */
    public Map<String, Double> mo13356b() {
        return this.f10348g;
    }

    /* renamed from: c */
    public Map<String, Double> mo13360c() {
        return this.f10349h;
    }

    /* renamed from: d */
    public boolean mo13363d() {
        return this.f10343b;
    }

    /* renamed from: e */
    public double mo13364e() {
        return this.f10344c;
    }

    /* renamed from: f */
    public double mo13365f() {
        return this.f10346e;
    }

    /* renamed from: g */
    public boolean mo13366g() {
        return this.f10347f;
    }

    /* renamed from: h */
    public double mo13367h() {
        return this.f10345d;
    }

    /* renamed from: a */
    public boolean mo13355a() {
        return this.f10342a;
    }

    public String toString() {
        return "CpuExceptionConfig{isOpen=" + this.f10342a + ", isCollectMainThread=" + this.f10343b + ", maxProcessBackCpuSpeed=" + this.f10344c + ", maxProcessForeCpuSpeed=" + this.f10345d + ", maxThreadCpuRate=" + this.f10346e + ", isCollectAllProcess=" + this.f10347f + ", backSceneMaxSpeedMap=" + this.f10348g + ", foreSceneMaxSpeedMap=" + this.f10349h + '}';
    }

    /* renamed from: a */
    public void mo13352a(double d) {
        this.f10344c = d;
    }

    /* renamed from: a */
    public void mo13353a(Map<String, Double> map) {
        this.f10348g = map;
    }

    /* renamed from: b */
    public void mo13357b(double d) {
        this.f10346e = d;
    }

    /* renamed from: c */
    public void mo13361c(double d) {
        this.f10345d = d;
    }

    /* renamed from: a */
    public void mo13354a(boolean z) {
        this.f10342a = z;
    }

    /* renamed from: b */
    public void mo13358b(Map<String, Double> map) {
        this.f10349h = map;
    }

    /* renamed from: c */
    public void mo13362c(boolean z) {
        this.f10347f = z;
    }

    /* renamed from: b */
    public void mo13359b(boolean z) {
        this.f10343b = z;
    }
}
