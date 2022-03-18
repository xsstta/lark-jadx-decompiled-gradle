package com.bytedance.apm6.cpu.exception;

import java.util.Objects;

/* renamed from: com.bytedance.apm6.cpu.exception.i */
public class C3267i {

    /* renamed from: a */
    private int f10457a;

    /* renamed from: b */
    private String f10458b;

    /* renamed from: c */
    private long f10459c;

    /* renamed from: d */
    private double f10460d;

    /* renamed from: e */
    private String f10461e;

    /* renamed from: f */
    private String f10462f;

    /* renamed from: g */
    private long f10463g;

    /* renamed from: h */
    private int f10464h;

    /* renamed from: a */
    public int mo13449a() {
        return this.f10464h;
    }

    /* renamed from: b */
    public String mo13454b() {
        return this.f10461e;
    }

    /* renamed from: c */
    public long mo13458c() {
        return this.f10463g;
    }

    /* renamed from: d */
    public String mo13460d() {
        return this.f10462f;
    }

    /* renamed from: e */
    public double mo13461e() {
        return this.f10460d;
    }

    /* renamed from: f */
    public int mo13463f() {
        return this.f10457a;
    }

    /* renamed from: g */
    public String mo13464g() {
        return this.f10458b;
    }

    /* renamed from: h */
    public long mo13465h() {
        return this.f10459c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(mo13463f()), mo13464g());
    }

    public String toString() {
        return "ThreadExceptionItem{threadId=" + this.f10457a + ", threadName='" + this.f10458b + '\'' + ", threadCpuTime=" + this.f10459c + ", processCpuTime=" + this.f10463g + ", cpuUsage=" + this.f10460d + ", weight=" + this.f10461e + ", nice=" + this.f10464h + '}';
    }

    /* renamed from: a */
    public void mo13450a(double d) {
        this.f10460d = d;
    }

    /* renamed from: b */
    public void mo13455b(int i) {
        this.f10457a = i;
    }

    /* renamed from: c */
    public void mo13459c(String str) {
        this.f10458b = str;
    }

    /* renamed from: a */
    public void mo13451a(int i) {
        this.f10464h = i;
    }

    /* renamed from: b */
    public void mo13456b(long j) {
        this.f10459c = j;
    }

    /* renamed from: a */
    public void mo13452a(long j) {
        this.f10463g = j;
    }

    /* renamed from: b */
    public void mo13457b(String str) {
        this.f10462f = str;
    }

    /* renamed from: a */
    public void mo13453a(String str) {
        this.f10461e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3267i)) {
            return false;
        }
        C3267i iVar = (C3267i) obj;
        if (mo13463f() != iVar.mo13463f() || !mo13464g().equals(iVar.mo13464g())) {
            return false;
        }
        return true;
    }
}
