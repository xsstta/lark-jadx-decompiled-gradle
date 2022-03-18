package com.ss.android.lark.platform.statistics.p2502b;

/* renamed from: com.ss.android.lark.platform.statistics.b.j */
public class C51982j {

    /* renamed from: a */
    volatile int f129070a;

    /* renamed from: b */
    volatile int f129071b;

    /* renamed from: c */
    private C51983a f129072c;

    /* renamed from: com.ss.android.lark.platform.statistics.b.j$a */
    public static class C51983a {

        /* renamed from: a */
        public boolean f129073a;

        /* renamed from: b */
        public C51983a f129074b;

        /* renamed from: a */
        public void mo178176a() {
            this.f129074b = null;
        }

        /* renamed from: b */
        public C51983a mo178178b() {
            return this.f129074b;
        }

        /* renamed from: a */
        public void mo178177a(C51983a aVar, boolean z) {
            if (!this.f129073a || !z) {
                this.f129074b = aVar;
                return;
            }
            throw new RuntimeException("WTF");
        }
    }

    /* renamed from: a */
    public void mo178175a(C51983a aVar) {
        aVar.mo178176a();
        if (this.f129071b < this.f129070a) {
            synchronized (this.f129072c) {
                if (aVar.f129073a) {
                    throw new RuntimeException("WTF");
                } else if (this.f129071b < this.f129070a) {
                    aVar.mo178177a(this.f129072c.mo178178b(), false);
                    this.f129072c.mo178177a(aVar, false);
                    aVar.f129073a = true;
                    this.f129071b++;
                }
            }
        }
    }

    /* renamed from: a */
    public <T> T mo178174a(Class<? extends C51983a> cls) {
        T t = null;
        if (this.f129071b > 0) {
            synchronized (this.f129072c) {
                if (this.f129071b > 0) {
                    t = (T) this.f129072c.mo178178b();
                    if (t == null) {
                        throw new RuntimeException("WTF");
                    } else if (t.f129073a) {
                        this.f129072c.mo178177a(t.f129074b, false);
                        t.f129073a = false;
                        this.f129071b--;
                    } else {
                        throw new RuntimeException("WTF");
                    }
                }
            }
        }
        if (t != null) {
            return t;
        }
        try {
            return (T) cls.newInstance();
        } catch (Throwable unused) {
            return t;
        }
    }

    public C51982j(Class<? extends C51983a> cls, int i) {
        C51983a aVar = new C51983a();
        this.f129072c = aVar;
        synchronized (aVar) {
            this.f129070a = i;
            this.f129072c.f129073a = true;
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C51983a aVar2 = (C51983a) cls.newInstance();
                    aVar2.f129073a = true;
                    aVar2.mo178177a(this.f129072c.mo178178b(), false);
                    this.f129072c.mo178177a(aVar2, false);
                    this.f129071b++;
                } catch (Throwable unused) {
                }
            }
        }
    }
}
