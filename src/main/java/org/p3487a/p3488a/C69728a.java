package org.p3487a.p3488a;

/* renamed from: org.a.a.a */
public class C69728a implements AbstractC69733d {

    /* renamed from: a */
    private int f174177a;

    /* renamed from: b */
    private int f174178b;

    @Override // org.p3487a.p3488a.AbstractC69733d
    /* renamed from: a */
    public int mo244632a() {
        return this.f174177a;
    }

    @Override // org.p3487a.p3488a.AbstractC69733d
    /* renamed from: b */
    public int mo244633b() {
        return this.f174178b;
    }

    @Override // org.p3487a.p3488a.AbstractC69733d
    /* renamed from: c */
    public int mo244634c() {
        return (this.f174178b - this.f174177a) + 1;
    }

    public int hashCode() {
        return (this.f174177a % 100) + (this.f174178b % 100);
    }

    public String toString() {
        return this.f174177a + ":" + this.f174178b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof AbstractC69733d)) {
            return -1;
        }
        AbstractC69733d dVar = (AbstractC69733d) obj;
        int a = this.f174177a - dVar.mo244632a();
        if (a != 0) {
            return a;
        }
        return this.f174178b - dVar.mo244633b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC69733d)) {
            return false;
        }
        AbstractC69733d dVar = (AbstractC69733d) obj;
        if (this.f174177a == dVar.mo244632a() && this.f174178b == dVar.mo244633b()) {
            return true;
        }
        return false;
    }

    public C69728a(int i, int i2) {
        this.f174177a = i;
        this.f174178b = i2;
    }
}
