package com.airbnb.lottie.model;

import androidx.core.util.C0844e;

/* renamed from: com.airbnb.lottie.model.h */
public class C1851h<T> {

    /* renamed from: a */
    T f6379a;

    /* renamed from: b */
    T f6380b;

    public int hashCode() {
        int i;
        T t = this.f6379a;
        int i2 = 0;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        T t2 = this.f6380b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f6379a) + " " + String.valueOf(this.f6380b) + "}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0844e)) {
            return false;
        }
        C0844e eVar = (C0844e) obj;
        if (!m8293b(eVar.f3317a, this.f6379a) || !m8293b(eVar.f3318b, this.f6380b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo9265a(T t, T t2) {
        this.f6379a = t;
        this.f6380b = t2;
    }

    /* renamed from: b */
    private static boolean m8293b(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
