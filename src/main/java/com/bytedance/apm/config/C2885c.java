package com.bytedance.apm.config;

/* renamed from: com.bytedance.apm.config.c */
public class C2885c {

    /* renamed from: a */
    private int f9271a;

    /* renamed from: b */
    private long f9272b;

    /* renamed from: com.bytedance.apm.config.c$a */
    public static final class C2887a {

        /* renamed from: a */
        public int f9273a;

        /* renamed from: b */
        public long f9274b = 2147483647L;

        /* renamed from: a */
        public C2885c mo12422a() {
            return new C2885c(this);
        }

        C2887a() {
        }

        /* renamed from: b */
        public C2887a mo12423b(int i) {
            this.f9274b = (long) i;
            return this;
        }

        /* renamed from: a */
        public C2887a mo12421a(int i) {
            this.f9273a = i;
            if (i == 1) {
                this.f9274b = 512000;
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C2887a m12182a() {
        return new C2887a();
    }

    private C2885c(C2887a aVar) {
        this.f9271a = aVar.f9273a;
        this.f9272b = aVar.f9274b;
    }
}
