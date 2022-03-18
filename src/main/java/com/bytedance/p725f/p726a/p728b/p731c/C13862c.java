package com.bytedance.p725f.p726a.p728b.p731c;

import com.bytedance.p725f.p726a.p733c.AbstractC13867b;
import com.bytedance.p725f.p726a.p734d.C13872a;

/* renamed from: com.bytedance.f.a.b.c.c */
public class C13862c implements AbstractC13867b {

    /* renamed from: a */
    protected String f36277a;

    /* renamed from: b */
    protected int f36278b = -1;

    /* renamed from: c */
    protected long f36279c;

    /* renamed from: d */
    protected long f36280d;

    /* renamed from: e */
    protected long f36281e;

    /* renamed from: f */
    protected double f36282f;

    /* renamed from: g */
    protected double f36283g;

    /* renamed from: a */
    public long mo51131a() {
        return this.f36280d;
    }

    /* renamed from: b */
    public long mo51136b() {
        return this.f36279c;
    }

    /* renamed from: c */
    public void mo51138c() {
        this.f36277a = null;
        this.f36278b = -1;
        this.f36279c = 0;
        this.f36280d = 0;
        this.f36281e = 0;
        this.f36282f = 0.0d;
        this.f36283g = 0.0d;
    }

    public String toString() {
        return "proc_stat:{pid=" + this.f36278b + " process_name:" + this.f36277a + " history cpu_time:" + mo51136b() + " delta cpu_time:" + mo51131a() + " delta cpu_time * cpuNum:" + (mo51131a() * ((long) C13872a.m56254a())) + " cpu_usage:" + (this.f36282f * 100.0d) + "%}";
    }

    /* renamed from: a */
    public void mo51132a(int i) {
        this.f36278b = i;
    }

    /* renamed from: b */
    public void mo51137b(long j) {
        this.f36279c = j;
    }

    /* renamed from: a */
    public void mo51135a(String str) {
        this.f36277a = str;
    }

    /* renamed from: a */
    public void mo51133a(long j) {
        if (this.f36280d >= 0) {
            this.f36282f = (((double) C13872a.m56254a()) * ((double) mo51131a())) / ((double) j);
        }
    }

    /* renamed from: a */
    public void mo51134a(AbstractC13867b bVar) {
        long j;
        long b = mo51136b();
        if (bVar == null) {
            j = 0;
        } else {
            j = ((C13862c) bVar).mo51136b();
        }
        long j2 = b - j;
        this.f36280d = j2;
        if (this.f36281e == 0) {
            this.f36281e = j2;
        }
    }
}
