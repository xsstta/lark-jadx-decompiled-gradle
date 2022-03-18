package com.ss.android.lark.image.impl.p1962b;

/* renamed from: com.ss.android.lark.image.impl.b.m */
public class C38865m {

    /* renamed from: a */
    public final int f99853a;

    /* renamed from: b */
    public final int f99854b;

    /* renamed from: c */
    public final long f99855c;

    /* renamed from: d */
    public final int f99856d;

    /* renamed from: e */
    public final String f99857e;

    /* renamed from: f */
    public final int f99858f;

    /* renamed from: g */
    public final boolean f99859g;

    /* renamed from: com.ss.android.lark.image.impl.b.m$a */
    public static final class C38867a {

        /* renamed from: a */
        public int f99860a;

        /* renamed from: b */
        public int f99861b;

        /* renamed from: c */
        public long f99862c;

        /* renamed from: d */
        public int f99863d;

        /* renamed from: e */
        public String f99864e;

        /* renamed from: f */
        public int f99865f;

        /* renamed from: g */
        public boolean f99866g;

        private C38867a() {
        }

        /* renamed from: a */
        public C38865m mo142385a() {
            return new C38865m(this);
        }

        /* renamed from: a */
        public C38867a mo142381a(int i) {
            this.f99860a = i;
            return this;
        }

        /* renamed from: b */
        public C38867a mo142386b(int i) {
            this.f99861b = i;
            return this;
        }

        /* renamed from: c */
        public C38867a mo142387c(int i) {
            this.f99863d = i;
            return this;
        }

        /* renamed from: d */
        public C38867a mo142388d(int i) {
            this.f99865f = i;
            return this;
        }

        /* renamed from: a */
        public C38867a mo142382a(long j) {
            this.f99862c = j;
            return this;
        }

        /* renamed from: a */
        public C38867a mo142383a(String str) {
            this.f99864e = str;
            return this;
        }

        /* renamed from: a */
        public C38867a mo142384a(boolean z) {
            this.f99866g = z;
            return this;
        }
    }

    /* renamed from: d */
    public static C38867a m153409d() {
        return new C38867a();
    }

    /* renamed from: a */
    public boolean mo142377a() {
        int i = this.f99856d;
        if (i < 0 || i >= 95) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo142378b() {
        if (this.f99853a <= 0 || this.f99854b <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int mo142379c() {
        return Math.min(this.f99853a, this.f99854b);
    }

    public String toString() {
        return String.format("w:%d, h:%d, size:%d, compressed:%s, mimeType:%s, exifOrientation:%d, hasExif:%s", Integer.valueOf(this.f99853a), Integer.valueOf(this.f99854b), Long.valueOf(this.f99855c), Boolean.valueOf(mo142377a()), this.f99857e, Integer.valueOf(this.f99858f), Boolean.valueOf(this.f99859g));
    }

    private C38865m(C38867a aVar) {
        this.f99853a = aVar.f99860a;
        this.f99854b = aVar.f99861b;
        this.f99855c = aVar.f99862c;
        this.f99856d = aVar.f99863d;
        this.f99857e = aVar.f99864e;
        this.f99858f = aVar.f99865f;
        this.f99859g = aVar.f99866g;
    }

    /* renamed from: a */
    public static C38867a m153408a(C38865m mVar) {
        return new C38867a().mo142381a(mVar.f99853a).mo142386b(mVar.f99854b).mo142383a(mVar.f99857e).mo142382a(mVar.f99855c).mo142387c(mVar.f99856d).mo142388d(mVar.f99858f).mo142384a(mVar.f99859g);
    }
}
