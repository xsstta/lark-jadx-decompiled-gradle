package androidx.core.view;

/* renamed from: androidx.core.view.c */
public final class C0897c {

    /* renamed from: a */
    private final Object f3427a;

    public int hashCode() {
        Object obj = this.f3427a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3427a + "}";
    }

    private C0897c(Object obj) {
        this.f3427a = obj;
    }

    /* renamed from: a */
    static C0897c m4339a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0897c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0897c cVar = (C0897c) obj;
        Object obj2 = this.f3427a;
        if (obj2 != null) {
            return obj2.equals(cVar.f3427a);
        }
        if (cVar.f3427a == null) {
            return true;
        }
        return false;
    }
}
