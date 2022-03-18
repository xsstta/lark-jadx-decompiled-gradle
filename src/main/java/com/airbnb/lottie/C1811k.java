package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.k */
public final class C1811k<V> {

    /* renamed from: a */
    private final V f6224a;

    /* renamed from: b */
    private final Throwable f6225b;

    /* renamed from: a */
    public V mo9110a() {
        return this.f6224a;
    }

    /* renamed from: b */
    public Throwable mo9111b() {
        return this.f6225b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo9110a(), mo9111b()});
    }

    public C1811k(V v) {
        this.f6224a = v;
    }

    public C1811k(Throwable th) {
        this.f6225b = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811k)) {
            return false;
        }
        C1811k kVar = (C1811k) obj;
        if (mo9110a() != null && mo9110a().equals(kVar.mo9110a())) {
            return true;
        }
        if (mo9111b() == null || kVar.mo9111b() == null) {
            return false;
        }
        return mo9111b().toString().equals(mo9111b().toString());
    }
}
