package com.bytedance.apm.launch;

/* renamed from: com.bytedance.apm.launch.c */
public class C3038c {

    /* renamed from: a */
    private boolean f9772a;

    /* renamed from: b */
    private boolean f9773b;

    /* renamed from: c */
    private boolean f9774c;

    /* renamed from: d */
    private boolean f9775d;

    /* renamed from: e */
    private boolean f9776e;

    /* renamed from: f */
    private long f9777f;

    /* renamed from: g */
    private long f9778g;

    /* renamed from: a */
    public boolean mo12849a() {
        return this.f9772a;
    }

    /* renamed from: b */
    public boolean mo12850b() {
        return this.f9773b;
    }

    /* renamed from: c */
    public boolean mo12851c() {
        return this.f9775d;
    }

    /* renamed from: d */
    public long mo12852d() {
        return this.f9777f;
    }

    /* renamed from: com.bytedance.apm.launch.c$a */
    public static class C3039a {

        /* renamed from: a */
        private boolean f9779a;

        /* renamed from: b */
        private boolean f9780b;

        /* renamed from: c */
        private boolean f9781c;

        /* renamed from: d */
        private boolean f9782d;

        /* renamed from: e */
        private boolean f9783e;

        /* renamed from: f */
        private long f9784f = -1;

        /* renamed from: g */
        private long f9785g = 1000;

        /* renamed from: a */
        public C3039a mo12853a() {
            this.f9779a = true;
            return this;
        }

        /* renamed from: b */
        public C3039a mo12855b() {
            this.f9782d = true;
            return this;
        }

        /* renamed from: c */
        public C3038c mo12856c() {
            return new C3038c(this.f9779a, this.f9780b, this.f9781c, this.f9784f, this.f9782d, this.f9785g, this.f9783e);
        }

        /* renamed from: a */
        public C3039a mo12854a(long j) {
            this.f9784f = j;
            return this;
        }
    }

    public C3038c(boolean z, boolean z2, boolean z3, long j, boolean z4, long j2, boolean z5) {
        this.f9772a = z;
        this.f9773b = z2;
        this.f9774c = z3;
        this.f9777f = j;
        this.f9775d = z4;
        this.f9778g = j2;
        this.f9776e = z5;
    }
}
