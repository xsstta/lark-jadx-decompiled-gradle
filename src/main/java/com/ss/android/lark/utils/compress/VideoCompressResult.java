package com.ss.android.lark.utils.compress;

public class VideoCompressResult {

    /* renamed from: a */
    private ResultType f142388a;

    /* renamed from: b */
    private C57816a f142389b;

    public enum ResultType {
        REUSE("REUSE"),
        COPY_VE_NO_SUPPORT("COPY_VE_NO_SUPPORT"),
        COPY_SKIP_PROCESS("COPY_SKIP_PROCESS"),
        COPY_SKIP_MUXER("COPY_SKIP_MUXER"),
        MUXER("MUXER"),
        ENCODE("ENCODE");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private ResultType(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.ss.android.lark.utils.compress.VideoCompressResult$a */
    public static class C57816a {

        /* renamed from: a */
        private boolean f142390a;

        /* renamed from: b */
        private String f142391b = "";

        /* renamed from: c */
        private int f142392c;

        /* renamed from: d */
        private int f142393d;

        /* renamed from: e */
        private int f142394e;

        /* renamed from: f */
        private int f142395f;

        /* renamed from: g */
        private String f142396g = "";

        /* renamed from: h */
        private String f142397h = "";

        /* renamed from: i */
        private String f142398i = "";

        /* renamed from: j */
        private float f142399j;

        /* renamed from: k */
        private String f142400k = "";

        /* renamed from: l */
        private int f142401l;

        /* renamed from: m */
        private String f142402m = "";

        /* renamed from: n */
        private int f142403n;

        /* renamed from: o */
        private float f142404o;

        /* renamed from: p */
        private String f142405p = "";

        /* renamed from: q */
        private float f142406q;

        /* renamed from: r */
        private String f142407r = "";

        /* renamed from: s */
        private int f142408s;

        /* renamed from: t */
        private int f142409t;

        /* renamed from: u */
        private float f142410u;

        /* renamed from: v */
        private float f142411v;

        /* renamed from: w */
        private int f142412w;

        /* renamed from: b */
        public String mo196129b() {
            return this.f142391b;
        }

        /* renamed from: c */
        public int mo196133c() {
            return this.f142394e;
        }

        /* renamed from: d */
        public int mo196137d() {
            return this.f142395f;
        }

        /* renamed from: e */
        public int mo196141e() {
            return this.f142392c;
        }

        /* renamed from: f */
        public int mo196145f() {
            return this.f142393d;
        }

        /* renamed from: g */
        public String mo196148g() {
            return this.f142398i;
        }

        /* renamed from: h */
        public float mo196151h() {
            return this.f142399j;
        }

        /* renamed from: i */
        public int mo196154i() {
            return this.f142403n;
        }

        /* renamed from: j */
        public float mo196156j() {
            return this.f142404o;
        }

        /* renamed from: k */
        public String mo196157k() {
            return this.f142405p;
        }

        /* renamed from: l */
        public float mo196158l() {
            return this.f142406q;
        }

        /* renamed from: m */
        public int mo196159m() {
            return this.f142408s;
        }

        /* renamed from: n */
        public int mo196160n() {
            return this.f142409t;
        }

        /* renamed from: o */
        public float mo196161o() {
            return this.f142410u;
        }

        /* renamed from: p */
        public int mo196162p() {
            return this.f142412w;
        }

        /* renamed from: q */
        public String mo196163q() {
            return this.f142396g;
        }

        /* renamed from: r */
        public String mo196164r() {
            return this.f142397h;
        }

        /* renamed from: s */
        public String mo196165s() {
            return this.f142400k;
        }

        /* renamed from: t */
        public String mo196166t() {
            return this.f142407r;
        }

        /* renamed from: a */
        public boolean mo196128a() {
            return this.f142390a;
        }

        /* renamed from: a */
        public void mo196124a(float f) {
            this.f142399j = f;
        }

        /* renamed from: a */
        public void mo196125a(int i) {
            this.f142394e = i;
        }

        /* renamed from: b */
        public void mo196130b(float f) {
            this.f142404o = f;
        }

        /* renamed from: c */
        public void mo196134c(float f) {
            this.f142406q = f;
        }

        /* renamed from: d */
        public void mo196138d(float f) {
            this.f142410u = f;
        }

        /* renamed from: e */
        public void mo196142e(float f) {
            this.f142411v = f;
        }

        /* renamed from: f */
        public void mo196146f(int i) {
            this.f142403n = i;
        }

        /* renamed from: g */
        public void mo196149g(int i) {
            this.f142408s = i;
        }

        /* renamed from: h */
        public void mo196152h(int i) {
            this.f142409t = i;
        }

        /* renamed from: i */
        public void mo196155i(int i) {
            this.f142412w = i;
        }

        /* renamed from: a */
        public void mo196126a(String str) {
            this.f142391b = str;
        }

        /* renamed from: b */
        public void mo196131b(int i) {
            this.f142395f = i;
        }

        /* renamed from: c */
        public void mo196135c(int i) {
            this.f142392c = i;
        }

        /* renamed from: d */
        public void mo196139d(int i) {
            this.f142393d = i;
        }

        /* renamed from: e */
        public void mo196143e(int i) {
            this.f142401l = i;
        }

        /* renamed from: f */
        public void mo196147f(String str) {
            this.f142397h = str;
        }

        /* renamed from: g */
        public void mo196150g(String str) {
            this.f142400k = str;
        }

        /* renamed from: h */
        public void mo196153h(String str) {
            this.f142407r = str;
        }

        /* renamed from: a */
        public void mo196127a(boolean z) {
            this.f142390a = z;
        }

        /* renamed from: b */
        public void mo196132b(String str) {
            this.f142398i = str;
        }

        /* renamed from: c */
        public void mo196136c(String str) {
            this.f142402m = str;
        }

        /* renamed from: d */
        public void mo196140d(String str) {
            this.f142405p = str;
        }

        /* renamed from: e */
        public void mo196144e(String str) {
            this.f142396g = str;
        }
    }

    /* renamed from: a */
    public ResultType mo196120a() {
        return this.f142388a;
    }

    /* renamed from: b */
    public C57816a mo196122b() {
        return this.f142389b;
    }

    public VideoCompressResult(ResultType resultType) {
        this.f142388a = resultType;
    }

    /* renamed from: a */
    public void mo196121a(C57816a aVar) {
        this.f142389b = aVar;
    }
}
