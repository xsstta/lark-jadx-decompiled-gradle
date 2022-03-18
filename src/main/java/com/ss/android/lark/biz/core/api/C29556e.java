package com.ss.android.lark.biz.core.api;

/* renamed from: com.ss.android.lark.biz.core.api.e */
public class C29556e {

    /* renamed from: a */
    private String f73980a;

    /* renamed from: b */
    private String f73981b;

    /* renamed from: c */
    private int f73982c;

    /* renamed from: d */
    private String f73983d;

    /* renamed from: e */
    private String f73984e;

    /* renamed from: f */
    private int f73985f;

    /* renamed from: g */
    private long f73986g;

    /* renamed from: h */
    private boolean f73987h;

    /* renamed from: i */
    private boolean f73988i;

    /* renamed from: j */
    private FileDownloadState f73989j;

    /* renamed from: k */
    private boolean f73990k;

    /* renamed from: com.ss.android.lark.biz.core.api.e$a */
    public static final class C29558a {

        /* renamed from: a */
        public String f73991a;

        /* renamed from: b */
        public String f73992b;

        /* renamed from: c */
        public int f73993c;

        /* renamed from: d */
        public String f73994d;

        /* renamed from: e */
        public String f73995e;

        /* renamed from: f */
        public long f73996f;

        /* renamed from: g */
        public boolean f73997g;

        /* renamed from: h */
        public boolean f73998h;

        private C29558a() {
        }

        /* renamed from: a */
        public C29556e mo105729a() {
            return new C29556e(this);
        }

        /* renamed from: a */
        public C29558a mo105725a(int i) {
            this.f73993c = i;
            return this;
        }

        /* renamed from: b */
        public C29558a mo105730b(String str) {
            this.f73992b = str;
            return this;
        }

        /* renamed from: c */
        public C29558a mo105732c(String str) {
            this.f73994d = str;
            return this;
        }

        /* renamed from: d */
        public C29558a mo105733d(String str) {
            this.f73995e = str;
            return this;
        }

        /* renamed from: a */
        public C29558a mo105726a(long j) {
            this.f73996f = j;
            return this;
        }

        /* renamed from: b */
        public C29558a mo105731b(boolean z) {
            this.f73998h = z;
            return this;
        }

        /* renamed from: a */
        public C29558a mo105727a(String str) {
            this.f73991a = str;
            return this;
        }

        /* renamed from: a */
        public C29558a mo105728a(boolean z) {
            this.f73997g = z;
            return this;
        }
    }

    /* renamed from: b */
    public String mo105715b() {
        return this.f73980a;
    }

    /* renamed from: c */
    public String mo105716c() {
        return this.f73981b;
    }

    /* renamed from: d */
    public int mo105717d() {
        return this.f73982c;
    }

    /* renamed from: e */
    public String mo105718e() {
        return this.f73984e;
    }

    /* renamed from: f */
    public String mo105719f() {
        return this.f73983d;
    }

    /* renamed from: g */
    public FileDownloadState mo105720g() {
        return this.f73989j;
    }

    /* renamed from: h */
    public int mo105721h() {
        return this.f73985f;
    }

    /* renamed from: i */
    public long mo105722i() {
        return this.f73986g;
    }

    /* renamed from: j */
    public boolean mo105723j() {
        return this.f73987h;
    }

    /* renamed from: k */
    public boolean mo105724k() {
        return this.f73988i;
    }

    /* renamed from: a */
    public static C29558a m109058a() {
        return new C29558a();
    }

    /* renamed from: a */
    public void mo105711a(int i) {
        this.f73985f = i;
    }

    /* renamed from: a */
    public void mo105712a(FileDownloadState fileDownloadState) {
        this.f73989j = fileDownloadState;
    }

    /* renamed from: a */
    public void mo105713a(String str) {
        this.f73984e = str;
    }

    private C29556e(C29558a aVar) {
        this.f73989j = FileDownloadState.DOWNLOAD_WAIT;
        this.f73980a = aVar.f73991a;
        this.f73981b = aVar.f73992b;
        this.f73982c = aVar.f73993c;
        this.f73983d = aVar.f73994d;
        this.f73984e = aVar.f73995e;
        this.f73986g = aVar.f73996f;
        this.f73987h = aVar.f73997g;
        this.f73988i = aVar.f73998h;
    }

    /* renamed from: a */
    public void mo105714a(boolean z) {
        this.f73990k = z;
    }
}
