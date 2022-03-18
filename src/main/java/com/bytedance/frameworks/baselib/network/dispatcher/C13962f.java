package com.bytedance.frameworks.baselib.network.dispatcher;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.f */
public class C13962f {

    /* renamed from: a */
    private ThreadPoolExecutor f36496a;

    /* renamed from: b */
    private ThreadPoolExecutor f36497b;

    /* renamed from: c */
    private ThreadPoolExecutor f36498c;

    /* renamed from: d */
    private ThreadPoolExecutor f36499d;

    /* renamed from: e */
    private int f36500e;

    /* renamed from: f */
    private int f36501f;

    /* renamed from: g */
    private int f36502g;

    /* renamed from: h */
    private int f36503h;

    /* renamed from: i */
    private long f36504i;

    /* renamed from: j */
    private long f36505j;

    /* renamed from: k */
    private long f36506k;

    /* renamed from: l */
    private boolean f36507l;

    /* renamed from: a */
    public ThreadPoolExecutor mo51340a() {
        return this.f36496a;
    }

    /* renamed from: b */
    public ThreadPoolExecutor mo51342b() {
        return this.f36497b;
    }

    /* renamed from: c */
    public ThreadPoolExecutor mo51343c() {
        return this.f36498c;
    }

    /* renamed from: d */
    public ThreadPoolExecutor mo51344d() {
        return this.f36499d;
    }

    /* renamed from: e */
    public int mo51345e() {
        return this.f36500e;
    }

    /* renamed from: f */
    public int mo51346f() {
        return this.f36501f;
    }

    /* renamed from: g */
    public int mo51347g() {
        return this.f36502g;
    }

    /* renamed from: h */
    public int mo51348h() {
        return this.f36503h;
    }

    /* renamed from: i */
    public long mo51349i() {
        return this.f36504i;
    }

    /* renamed from: j */
    public long mo51350j() {
        return this.f36505j;
    }

    /* renamed from: k */
    public long mo51351k() {
        return this.f36506k;
    }

    /* renamed from: l */
    public boolean mo51352l() {
        return this.f36507l;
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.f$a */
    public static final class C13964a {

        /* renamed from: a */
        public ThreadPoolExecutor f36508a;

        /* renamed from: b */
        public ThreadPoolExecutor f36509b;

        /* renamed from: c */
        public ThreadPoolExecutor f36510c;

        /* renamed from: d */
        public ThreadPoolExecutor f36511d;

        /* renamed from: e */
        public int f36512e;

        /* renamed from: f */
        public int f36513f;

        /* renamed from: g */
        public int f36514g;

        /* renamed from: h */
        public int f36515h;

        /* renamed from: i */
        public long f36516i;

        /* renamed from: j */
        public long f36517j;

        /* renamed from: k */
        public long f36518k;

        /* renamed from: l */
        public boolean f36519l = true;

        /* renamed from: a */
        public C13962f mo51356a() {
            return new C13962f(this);
        }

        /* renamed from: a */
        public C13964a mo51355a(boolean z) {
            this.f36519l = z;
            return this;
        }

        /* renamed from: c */
        public C13964a mo51359c(long j) {
            if (j > 0) {
                this.f36518k = j;
                return this;
            }
            throw new IllegalArgumentException("Immediate keep alive time must set > 0 when allow core thread timeout.");
        }

        /* renamed from: a */
        public C13964a mo51354a(long j) {
            if (j > 0) {
                this.f36516i = j;
                return this;
            }
            throw new IllegalArgumentException("Api keep alive time must set > 0 when allow core thread timeout.");
        }

        /* renamed from: b */
        public C13964a mo51358b(long j) {
            if (j > 0) {
                this.f36517j = j;
                return this;
            }
            throw new IllegalArgumentException("Download keep alive time must set > 0 when allow core thread timeout.");
        }

        /* renamed from: a */
        public C13964a mo51353a(int i, int i2) {
            if (i2 <= 0 || i <= 0) {
                throw new IllegalArgumentException("Api thread size must set > 0.");
            } else if (i <= i2) {
                this.f36512e = i2;
                this.f36514g = i;
                return this;
            } else {
                throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
            }
        }

        /* renamed from: b */
        public C13964a mo51357b(int i, int i2) {
            if (i2 <= 0 || i <= 0) {
                throw new IllegalArgumentException("Download thread size must set > 0.");
            } else if (i <= i2) {
                this.f36513f = i2;
                this.f36515h = i;
                return this;
            } else {
                throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
            }
        }
    }

    /* renamed from: m */
    public static C13964a m56477m() {
        return new C13964a();
    }

    /* renamed from: a */
    public void mo51341a(boolean z) {
        this.f36507l = z;
    }

    private C13962f(C13964a aVar) {
        this.f36500e = 8;
        this.f36501f = 8;
        this.f36502g = 8;
        this.f36503h = 8;
        this.f36504i = 30;
        this.f36505j = 10;
        this.f36506k = 10;
        this.f36507l = true;
        if (aVar.f36509b != null) {
            this.f36496a = aVar.f36509b;
        }
        if (aVar.f36508a != null) {
            this.f36497b = aVar.f36508a;
        }
        if (aVar.f36510c != null) {
            this.f36498c = aVar.f36510c;
        }
        if (aVar.f36511d != null) {
            this.f36499d = aVar.f36511d;
        }
        if (aVar.f36512e > 0) {
            this.f36500e = aVar.f36512e;
        }
        if (aVar.f36513f > 0) {
            this.f36501f = aVar.f36513f;
        }
        if (aVar.f36514g > 0) {
            this.f36502g = aVar.f36514g;
        }
        if (aVar.f36515h > 0) {
            this.f36503h = aVar.f36515h;
        }
        if (aVar.f36516i > 0) {
            this.f36504i = aVar.f36516i;
        }
        if (aVar.f36517j > 0) {
            this.f36505j = aVar.f36517j;
        }
        if (aVar.f36518k > 0) {
            this.f36506k = aVar.f36518k;
        }
        this.f36507l = aVar.f36519l;
    }
}
