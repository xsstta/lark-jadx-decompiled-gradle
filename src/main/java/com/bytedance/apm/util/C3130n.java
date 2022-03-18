package com.bytedance.apm.util;

/* renamed from: com.bytedance.apm.util.n */
public class C3130n<F, S> {

    /* renamed from: a */
    public F f10052a;

    /* renamed from: b */
    public S f10053b;

    public int hashCode() {
        int i;
        F f = this.f10052a;
        int i2 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = f.hashCode();
        }
        S s = this.f10053b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f10052a) + " " + ((Object) this.f10053b) + "}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3130n)) {
            return false;
        }
        C3130n nVar = (C3130n) obj;
        if (!C3127m.m13017a(nVar.f10052a, this.f10052a) || !C3127m.m13017a(nVar.f10053b, this.f10053b)) {
            return false;
        }
        return true;
    }

    public C3130n(F f, S s) {
        this.f10052a = f;
        this.f10053b = s;
    }
}
