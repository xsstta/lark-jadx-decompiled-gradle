package com.bytedance.apm.block.p136a;

/* renamed from: com.bytedance.apm.block.a.h */
public class C2861h {

    /* renamed from: a */
    public int f9133a;

    /* renamed from: b */
    public int f9134b;

    /* renamed from: c */
    public long f9135c;

    /* renamed from: d */
    public int f9136d;

    /* renamed from: e */
    public int f9137e = 1;

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.f9136d + "," + this.f9133a + "," + this.f9137e + "," + this.f9134b + "," + this.f9135c;
    }

    /* renamed from: a */
    public void mo12277a(long j) {
        this.f9137e++;
        this.f9134b = (int) (((long) this.f9134b) + j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2861h)) {
            return false;
        }
        C2861h hVar = (C2861h) obj;
        if (hVar.f9133a == this.f9133a && hVar.f9136d == this.f9136d) {
            return true;
        }
        return false;
    }

    public C2861h(int i, int i2, long j, int i3) {
        this.f9133a = i;
        this.f9134b = i2;
        this.f9136d = i3;
        this.f9135c = j;
    }
}
