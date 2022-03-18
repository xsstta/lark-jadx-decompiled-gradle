package androidx.core.util;

/* renamed from: androidx.core.util.e */
public class C0844e<F, S> {

    /* renamed from: a */
    public final F f3317a;

    /* renamed from: b */
    public final S f3318b;

    public int hashCode() {
        int i;
        F f = this.f3317a;
        int i2 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = f.hashCode();
        }
        S s = this.f3318b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f3317a) + " " + String.valueOf(this.f3318b) + "}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0844e)) {
            return false;
        }
        C0844e eVar = (C0844e) obj;
        if (!C0843d.m3987a(eVar.f3317a, this.f3317a) || !C0843d.m3987a(eVar.f3318b, this.f3318b)) {
            return false;
        }
        return true;
    }

    public C0844e(F f, S s) {
        this.f3317a = f;
        this.f3318b = s;
    }

    /* renamed from: a */
    public static <A, B> C0844e<A, B> m3988a(A a, B b) {
        return new C0844e<>(a, b);
    }
}
