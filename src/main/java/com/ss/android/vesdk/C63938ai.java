package com.ss.android.vesdk;

import com.ss.android.vesdk.VESensService;

/* renamed from: com.ss.android.vesdk.ai */
public class C63938ai {

    /* renamed from: a */
    private String f161434a;

    /* renamed from: b */
    private int f161435b;

    /* renamed from: c */
    private volatile VESensService.PRIVACY_STATUS f161436c = VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE;

    /* renamed from: d */
    private volatile VESensService.PRIVACY_STATUS f161437d = VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE;

    /* renamed from: e */
    private long f161438e;

    /* renamed from: f */
    private int f161439f = 3000;

    /* renamed from: g */
    private VESensService.ACTION_TYPE f161440g = VESensService.ACTION_TYPE.ACTION_TYPE_CRASH;

    /* renamed from: h */
    private boolean f161441h;

    /* renamed from: h */
    public void mo221168h() {
        this.f161441h = true;
    }

    /* renamed from: a */
    public int mo221157a() {
        return this.f161435b;
    }

    /* renamed from: b */
    public String mo221161b() {
        return this.f161434a;
    }

    /* renamed from: c */
    public VESensService.PRIVACY_STATUS mo221163c() {
        return this.f161436c;
    }

    /* renamed from: d */
    public VESensService.PRIVACY_STATUS mo221164d() {
        return this.f161437d;
    }

    /* renamed from: e */
    public long mo221165e() {
        return this.f161438e;
    }

    /* renamed from: f */
    public int mo221166f() {
        return this.f161439f;
    }

    /* renamed from: g */
    public VESensService.ACTION_TYPE mo221167g() {
        return this.f161440g;
    }

    /* renamed from: i */
    public boolean mo221169i() {
        return this.f161441h;
    }

    /* renamed from: a */
    public void mo221158a(int i) {
        this.f161439f = i;
    }

    /* renamed from: a */
    public void mo221159a(VESensService.ACTION_TYPE action_type) {
        this.f161440g = action_type;
    }

    /* renamed from: b */
    public void mo221162b(VESensService.PRIVACY_STATUS privacy_status) {
        this.f161437d = privacy_status;
        this.f161438e = System.currentTimeMillis();
        this.f161441h = false;
    }

    /* renamed from: a */
    public void mo221160a(VESensService.PRIVACY_STATUS privacy_status) {
        this.f161436c = privacy_status;
    }

    public C63938ai(int i, String str) {
        this.f161434a = str;
        this.f161435b = i;
    }
}
