package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.e */
public final class C1248e {

    /* renamed from: a */
    private final AbstractC1277q f4491a;

    /* renamed from: b */
    private final boolean f4492b;

    /* renamed from: c */
    private final boolean f4493c;

    /* renamed from: d */
    private final Object f4494d;

    /* renamed from: a */
    public boolean mo6290a() {
        return this.f4493c;
    }

    /* renamed from: b */
    public AbstractC1277q<?> mo6291b() {
        return this.f4491a;
    }

    /* renamed from: androidx.navigation.e$a */
    public static final class C1249a {

        /* renamed from: a */
        private AbstractC1277q<?> f4495a;

        /* renamed from: b */
        private boolean f4496b;

        /* renamed from: c */
        private Object f4497c;

        /* renamed from: d */
        private boolean f4498d;

        /* renamed from: a */
        public C1248e mo6298a() {
            if (this.f4495a == null) {
                this.f4495a = AbstractC1277q.m5803a(this.f4497c);
            }
            return new C1248e(this.f4495a, this.f4496b, this.f4497c, this.f4498d);
        }

        /* renamed from: a */
        public C1249a mo6295a(AbstractC1277q<?> qVar) {
            this.f4495a = qVar;
            return this;
        }

        /* renamed from: a */
        public C1249a mo6296a(Object obj) {
            this.f4497c = obj;
            this.f4498d = true;
            return this;
        }

        /* renamed from: a */
        public C1249a mo6297a(boolean z) {
            this.f4496b = z;
            return this;
        }
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f4491a.hashCode() * 31) + (this.f4492b ? 1 : 0)) * 31) + (this.f4493c ? 1 : 0)) * 31;
        Object obj = this.f4494d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1248e eVar = (C1248e) obj;
        if (this.f4492b != eVar.f4492b || this.f4493c != eVar.f4493c || !this.f4491a.equals(eVar.f4491a)) {
            return false;
        }
        Object obj2 = this.f4494d;
        if (obj2 != null) {
            return obj2.equals(eVar.f4494d);
        }
        if (eVar.f4494d == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6289a(String str, Bundle bundle) {
        if (this.f4493c) {
            this.f4491a.mo6401a(bundle, str, this.f4494d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6292b(String str, Bundle bundle) {
        if (!this.f4492b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f4491a.mo6398a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    C1248e(AbstractC1277q<?> qVar, boolean z, Object obj, boolean z2) {
        if (!qVar.mo6402a() && z) {
            throw new IllegalArgumentException(qVar.mo6403b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.f4491a = qVar;
            this.f4492b = z;
            this.f4494d = obj;
            this.f4493c = z2;
        } else {
            throw new IllegalArgumentException("Argument with type " + qVar.mo6403b() + " has null value but is not nullable.");
        }
    }
}
