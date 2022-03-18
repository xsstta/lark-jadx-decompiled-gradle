package com.ss.android.lark.mediapicker.dependency;

public class LoadOption {

    /* renamed from: k */
    public static final LoadOption f113213k = new LoadOption();

    /* renamed from: a */
    public String f113214a;

    /* renamed from: b */
    public boolean f113215b;

    /* renamed from: c */
    public boolean f113216c;

    /* renamed from: d */
    public boolean f113217d;

    /* renamed from: e */
    public int f113218e;

    /* renamed from: f */
    public MediaDiskCacheStrategy f113219f;

    /* renamed from: g */
    public int f113220g;

    /* renamed from: h */
    public int f113221h;

    /* renamed from: i */
    public int f113222i;

    /* renamed from: j */
    public float f113223j;

    public enum MediaDiskCacheStrategy {
        ALL(true, true),
        NONE(false, false),
        SOURCE(true, false),
        RESULT(false, true);
        
        private final boolean cacheResult;
        private final boolean cacheSource;

        public boolean cacheResult() {
            return this.cacheResult;
        }

        public boolean cacheSource() {
            return this.cacheSource;
        }

        private MediaDiskCacheStrategy(boolean z, boolean z2) {
            this.cacheSource = z;
            this.cacheResult = z2;
        }
    }

    private LoadOption() {
    }

    /* renamed from: a */
    public String mo158263a() {
        return this.f113214a;
    }

    /* renamed from: b */
    public boolean mo158264b() {
        return this.f113215b;
    }

    /* renamed from: c */
    public boolean mo158265c() {
        return this.f113216c;
    }

    /* renamed from: d */
    public boolean mo158266d() {
        return this.f113217d;
    }

    /* renamed from: e */
    public MediaDiskCacheStrategy mo158267e() {
        return this.f113219f;
    }

    /* renamed from: f */
    public int mo158268f() {
        return this.f113218e;
    }

    /* renamed from: g */
    public int mo158269g() {
        return this.f113220g;
    }

    /* renamed from: h */
    public int mo158270h() {
        return this.f113221h;
    }

    /* renamed from: i */
    public int mo158271i() {
        return this.f113222i;
    }

    /* renamed from: j */
    public float mo158272j() {
        return this.f113223j;
    }

    /* renamed from: com.ss.android.lark.mediapicker.dependency.LoadOption$a */
    public static class C44674a {

        /* renamed from: a */
        private LoadOption f113224a = new LoadOption();

        /* renamed from: a */
        public LoadOption mo158278a() {
            return new LoadOption(this.f113224a);
        }

        /* renamed from: a */
        public C44674a mo158275a(int i) {
            this.f113224a.f113218e = i;
            return this;
        }

        /* renamed from: b */
        public C44674a mo158279b(int i) {
            this.f113224a.f113220g = i;
            return this;
        }

        /* renamed from: c */
        public C44674a mo158281c(int i) {
            this.f113224a.f113221h = i;
            return this;
        }

        /* renamed from: d */
        public C44674a mo158283d(int i) {
            this.f113224a.f113222i = i;
            return this;
        }

        /* renamed from: a */
        public C44674a mo158276a(MediaDiskCacheStrategy mediaDiskCacheStrategy) {
            this.f113224a.f113219f = mediaDiskCacheStrategy;
            return this;
        }

        /* renamed from: b */
        public C44674a mo158280b(boolean z) {
            this.f113224a.f113216c = z;
            return this;
        }

        /* renamed from: c */
        public C44674a mo158282c(boolean z) {
            this.f113224a.f113217d = z;
            return this;
        }

        /* renamed from: a */
        public C44674a mo158277a(boolean z) {
            this.f113224a.f113215b = z;
            return this;
        }
    }

    public LoadOption(LoadOption loadOption) {
        this.f113214a = loadOption.mo158263a();
        this.f113215b = loadOption.mo158264b();
        this.f113216c = loadOption.mo158265c();
        this.f113217d = loadOption.mo158266d();
        this.f113219f = loadOption.mo158267e();
        this.f113218e = loadOption.mo158268f();
        this.f113220g = loadOption.mo158269g();
        this.f113221h = loadOption.mo158270h();
        this.f113222i = loadOption.mo158271i();
        this.f113223j = loadOption.mo158272j();
        String str = this.f113214a;
        if (str != null && str.toLowerCase().endsWith(".gif")) {
            this.f113219f = MediaDiskCacheStrategy.SOURCE;
        }
    }
}
