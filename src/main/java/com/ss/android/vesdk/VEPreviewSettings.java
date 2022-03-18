package com.ss.android.vesdk;

public class VEPreviewSettings {

    /* renamed from: A */
    public boolean f161314A;

    /* renamed from: B */
    public boolean f161315B = true;

    /* renamed from: C */
    public boolean f161316C = true;

    /* renamed from: D */
    public boolean f161317D;

    /* renamed from: E */
    public boolean f161318E = false;

    /* renamed from: a */
    public VESize f161319a = new VESize(720, 1280);

    /* renamed from: b */
    public boolean f161320b = false;

    /* renamed from: c */
    public boolean f161321c = false;

    /* renamed from: d */
    public boolean f161322d = false;

    /* renamed from: e */
    public boolean f161323e = false;

    /* renamed from: f */
    public boolean f161324f = false;

    /* renamed from: g */
    public boolean f161325g = false;

    /* renamed from: h */
    public boolean f161326h;

    /* renamed from: i */
    public boolean f161327i;

    /* renamed from: j */
    public boolean f161328j;

    /* renamed from: k */
    public boolean f161329k;

    /* renamed from: l */
    public boolean f161330l;

    /* renamed from: m */
    public boolean f161331m;

    /* renamed from: n */
    public long f161332n;

    /* renamed from: o */
    public boolean f161333o;

    /* renamed from: p */
    public boolean f161334p;

    /* renamed from: q */
    public VERecordContentType f161335q = VERecordContentType.RecordFullContent;

    /* renamed from: r */
    public boolean f161336r = false;

    /* renamed from: s */
    public int f161337s = Integer.MAX_VALUE;

    /* renamed from: t */
    public int f161338t;

    /* renamed from: u */
    public boolean f161339u = false;

    /* renamed from: v */
    public boolean f161340v = false;

    /* renamed from: w */
    public boolean f161341w = true;

    /* renamed from: x */
    public VERecordMode f161342x = VERecordMode.Default;

    /* renamed from: y */
    public VERecordGraphType f161343y = VERecordGraphType.LV_GRAPH_TYPE;

    /* renamed from: z */
    public VEDisplaySettings f161344z;

    public enum VERecordContentType {
        RecordOriginContent,
        RecordEffectContent,
        RecordFullContent,
        RecordIntermediateContent
    }

    public enum VERecordGraphType {
        LV_GRAPH_TYPE,
        AWESOME_GRAPH_TYPE,
        QR_CODE_GRAPH
    }

    public enum VERecordMode {
        Default,
        Pro
    }

    /* renamed from: com.ss.android.vesdk.VEPreviewSettings$a */
    public static class C63887a {

        /* renamed from: a */
        private VEPreviewSettings f161345a = new VEPreviewSettings();

        /* renamed from: a */
        public VEPreviewSettings mo220906a() {
            return this.f161345a;
        }

        /* renamed from: a */
        public C63887a mo220904a(VESize vESize) {
            this.f161345a.f161319a = vESize;
            return this;
        }

        /* renamed from: b */
        public C63887a mo220907b(boolean z) {
            this.f161345a.f161327i = z;
            return this;
        }

        /* renamed from: c */
        public C63887a mo220908c(boolean z) {
            this.f161345a.f161330l = z;
            return this;
        }

        /* renamed from: d */
        public C63887a mo220909d(boolean z) {
            this.f161345a.f161333o = z;
            return this;
        }

        /* renamed from: a */
        public C63887a mo220905a(boolean z) {
            this.f161345a.f161321c = z;
            return this;
        }
    }

    /* renamed from: a */
    public VESize mo220884a() {
        return this.f161319a;
    }

    /* renamed from: b */
    public boolean mo220885b() {
        return this.f161320b;
    }

    /* renamed from: c */
    public boolean mo220886c() {
        return this.f161322d;
    }

    /* renamed from: h */
    public boolean mo220891h() {
        return this.f161328j;
    }

    /* renamed from: i */
    public boolean mo220892i() {
        return this.f161329k;
    }

    /* renamed from: l */
    public long mo220895l() {
        return this.f161332n;
    }

    /* renamed from: m */
    public boolean mo220896m() {
        return this.f161333o;
    }

    /* renamed from: n */
    public boolean mo220897n() {
        return this.f161334p;
    }

    /* renamed from: p */
    public int mo220899p() {
        return this.f161337s;
    }

    /* renamed from: q */
    public int mo220900q() {
        return this.f161338t;
    }

    /* renamed from: r */
    public VEDisplaySettings mo220901r() {
        return this.f161344z;
    }

    /* renamed from: s */
    public boolean mo220902s() {
        return this.f161314A;
    }

    /* renamed from: t */
    public boolean mo220903t() {
        return this.f161317D;
    }

    /* renamed from: o */
    public int mo220898o() {
        return this.f161335q.ordinal();
    }

    /* renamed from: d */
    public boolean mo220887d() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_async_detection", (Object) true)).booleanValue()) {
            this.f161321c = true;
        }
        return this.f161321c;
    }

    /* renamed from: e */
    public boolean mo220888e() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_titan_auto_test_log", (Object) false)).booleanValue()) {
            this.f161325g = true;
        }
        return this.f161325g;
    }

    /* renamed from: f */
    public boolean mo220889f() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_opt_first_frame", (Object) false)).booleanValue()) {
            this.f161326h = true;
        }
        return this.f161326h;
    }

    /* renamed from: g */
    public boolean mo220890g() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_disable_effect_internal_setting", (Object) false)).booleanValue()) {
            this.f161327i = true;
        }
        return this.f161327i;
    }

    /* renamed from: j */
    public boolean mo220893j() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_three_buffer", (Object) false)).booleanValue()) {
            this.f161330l = true;
        }
        return this.f161330l;
    }

    /* renamed from: k */
    public boolean mo220894k() {
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_preload_effect_res", (Object) false)).booleanValue()) {
            this.f161331m = true;
        }
        return this.f161331m;
    }
}
