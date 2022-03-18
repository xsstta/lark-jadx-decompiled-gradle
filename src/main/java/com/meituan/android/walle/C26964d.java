package com.meituan.android.walle;

/* renamed from: com.meituan.android.walle.d */
final class C26964d<A, B> {

    /* renamed from: a */
    private final A f66916a;

    /* renamed from: b */
    private final B f66917b;

    /* renamed from: a */
    public A mo95815a() {
        return this.f66916a;
    }

    public int hashCode() {
        int i;
        A a = this.f66916a;
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.hashCode();
        }
        int i3 = (i + 31) * 31;
        B b = this.f66917b;
        if (b != null) {
            i2 = b.hashCode();
        }
        return i3 + i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C26964d dVar = (C26964d) obj;
        A a = this.f66916a;
        if (a == null) {
            if (dVar.f66916a != null) {
                return false;
            }
        } else if (!a.equals(dVar.f66916a)) {
            return false;
        }
        B b = this.f66917b;
        if (b == null) {
            if (dVar.f66917b != null) {
                return false;
            }
        } else if (!b.equals(dVar.f66917b)) {
            return false;
        }
        return true;
    }

    private C26964d(A a, B b) {
        this.f66916a = a;
        this.f66917b = b;
    }

    /* renamed from: a */
    public static <A, B> C26964d<A, B> m97994a(A a, B b) {
        return new C26964d<>(a, b);
    }
}
