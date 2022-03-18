package com.bytedance.reader_apk;

/* renamed from: com.bytedance.reader_apk.b */
public final class C20565b<A, B> {

    /* renamed from: a */
    private final A f50138a;

    /* renamed from: b */
    private final B f50139b;

    /* renamed from: a */
    public A mo69211a() {
        return this.f50138a;
    }

    public int hashCode() {
        int i;
        A a = this.f50138a;
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.hashCode();
        }
        int i3 = (i + 31) * 31;
        B b = this.f50139b;
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
        C20565b bVar = (C20565b) obj;
        A a = this.f50138a;
        if (a == null) {
            if (bVar.f50138a != null) {
                return false;
            }
        } else if (!a.equals(bVar.f50138a)) {
            return false;
        }
        B b = this.f50139b;
        if (b == null) {
            if (bVar.f50139b != null) {
                return false;
            }
        } else if (!b.equals(bVar.f50139b)) {
            return false;
        }
        return true;
    }

    private C20565b(A a, B b) {
        this.f50138a = a;
        this.f50139b = b;
    }

    /* renamed from: a */
    public static <A, B> C20565b<A, B> m74892a(A a, B b) {
        return new C20565b<>(a, b);
    }
}
