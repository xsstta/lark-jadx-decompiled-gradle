package androidx.navigation;

/* renamed from: androidx.navigation.p */
public final class C1275p {

    /* renamed from: a */
    private boolean f4574a;

    /* renamed from: b */
    private int f4575b;

    /* renamed from: c */
    private boolean f4576c;

    /* renamed from: d */
    private int f4577d;

    /* renamed from: e */
    private int f4578e;

    /* renamed from: f */
    private int f4579f;

    /* renamed from: g */
    private int f4580g;

    /* renamed from: a */
    public boolean mo6382a() {
        return this.f4574a;
    }

    /* renamed from: b */
    public int mo6383b() {
        return this.f4575b;
    }

    /* renamed from: c */
    public boolean mo6384c() {
        return this.f4576c;
    }

    /* renamed from: d */
    public int mo6385d() {
        return this.f4577d;
    }

    /* renamed from: e */
    public int mo6386e() {
        return this.f4578e;
    }

    /* renamed from: f */
    public int mo6388f() {
        return this.f4579f;
    }

    /* renamed from: g */
    public int mo6389g() {
        return this.f4580g;
    }

    /* renamed from: androidx.navigation.p$a */
    public static final class C1276a {

        /* renamed from: a */
        boolean f4581a;

        /* renamed from: b */
        int f4582b = -1;

        /* renamed from: c */
        boolean f4583c;

        /* renamed from: d */
        int f4584d = -1;

        /* renamed from: e */
        int f4585e = -1;

        /* renamed from: f */
        int f4586f = -1;

        /* renamed from: g */
        int f4587g = -1;

        /* renamed from: a */
        public C1275p mo6394a() {
            return new C1275p(this.f4581a, this.f4582b, this.f4583c, this.f4584d, this.f4585e, this.f4586f, this.f4587g);
        }

        /* renamed from: a */
        public C1276a mo6391a(int i) {
            this.f4584d = i;
            return this;
        }

        /* renamed from: b */
        public C1276a mo6395b(int i) {
            this.f4585e = i;
            return this;
        }

        /* renamed from: c */
        public C1276a mo6396c(int i) {
            this.f4586f = i;
            return this;
        }

        /* renamed from: d */
        public C1276a mo6397d(int i) {
            this.f4587g = i;
            return this;
        }

        /* renamed from: a */
        public C1276a mo6393a(boolean z) {
            this.f4581a = z;
            return this;
        }

        /* renamed from: a */
        public C1276a mo6392a(int i, boolean z) {
            this.f4582b = i;
            this.f4583c = z;
            return this;
        }
    }

    public int hashCode() {
        return ((((((((((((mo6382a() ? 1 : 0) * 31) + mo6383b()) * 31) + (mo6384c() ? 1 : 0)) * 31) + mo6385d()) * 31) + mo6386e()) * 31) + mo6388f()) * 31) + mo6389g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1275p pVar = (C1275p) obj;
        if (this.f4574a == pVar.f4574a && this.f4575b == pVar.f4575b && this.f4576c == pVar.f4576c && this.f4577d == pVar.f4577d && this.f4578e == pVar.f4578e && this.f4579f == pVar.f4579f && this.f4580g == pVar.f4580g) {
            return true;
        }
        return false;
    }

    C1275p(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        this.f4574a = z;
        this.f4575b = i;
        this.f4576c = z2;
        this.f4577d = i2;
        this.f4578e = i3;
        this.f4579f = i4;
        this.f4580g = i5;
    }
}
