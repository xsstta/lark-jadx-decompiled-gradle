package com.bytedance.apm.p137c;

/* renamed from: com.bytedance.apm.c.a */
public class C2878a {

    /* renamed from: a */
    public long f9205a;

    /* renamed from: b */
    public String f9206b;

    /* renamed from: c */
    private long f9207c;

    /* renamed from: d */
    private boolean f9208d;

    /* renamed from: e */
    private boolean f9209e;

    /* renamed from: f */
    private String f9210f;

    /* renamed from: g */
    private long f9211g;

    /* renamed from: h */
    private String f9212h;

    /* renamed from: i */
    private long f9213i;

    /* renamed from: j */
    private String f9214j;

    /* renamed from: k */
    private boolean f9215k;

    /* renamed from: l */
    private String f9216l;

    /* renamed from: m */
    private boolean f9217m;

    public C2878a() {
    }

    /* renamed from: c */
    public long mo12342c() {
        return this.f9211g;
    }

    /* renamed from: d */
    public long mo12344d() {
        return this.f9205a;
    }

    /* renamed from: e */
    public String mo12345e() {
        return this.f9206b;
    }

    /* renamed from: f */
    public boolean mo12346f() {
        return this.f9209e;
    }

    /* renamed from: g */
    public String mo12347g() {
        return this.f9210f;
    }

    /* renamed from: h */
    public String mo12348h() {
        return this.f9212h;
    }

    /* renamed from: i */
    public long mo12349i() {
        return this.f9213i;
    }

    /* renamed from: j */
    public String mo12350j() {
        return this.f9214j;
    }

    /* renamed from: k */
    public boolean mo12351k() {
        return this.f9215k;
    }

    /* renamed from: l */
    public String mo12352l() {
        return this.f9216l;
    }

    /* renamed from: m */
    public long mo12353m() {
        return this.f9207c;
    }

    /* renamed from: b */
    public boolean mo12341b() {
        return !this.f9208d;
    }

    /* renamed from: a */
    public boolean mo12338a() {
        return this.f9208d;
    }

    public String toString() {
        return "BatteryLogEntity{id=" + this.f9207c + ", front=" + this.f9208d + ", time=" + this.f9205a + ", type='" + this.f9206b + '\'' + ", status=" + this.f9209e + ", scene='" + this.f9210f + '\'' + ", accumulation=" + this.f9211g + ", source='" + this.f9212h + '\'' + ", versionId=" + this.f9213i + ", processName='" + this.f9214j + '\'' + ", mainProcess=" + this.f9215k + ", startUuid='" + this.f9216l + '\'' + ", deleteFlag=" + this.f9217m + '}';
    }

    /* renamed from: a */
    public void mo12335a(long j) {
        this.f9213i = j;
    }

    /* renamed from: b */
    public void mo12339b(long j) {
        this.f9207c = j;
    }

    /* renamed from: a */
    public void mo12336a(String str) {
        this.f9210f = str;
    }

    /* renamed from: b */
    public void mo12340b(String str) {
        this.f9214j = str;
    }

    /* renamed from: c */
    public void mo12343c(String str) {
        this.f9216l = str;
    }

    /* renamed from: a */
    public void mo12337a(boolean z) {
        this.f9215k = z;
    }

    public C2878a(boolean z, long j, String str, long j2) {
        this.f9208d = z;
        this.f9205a = j;
        this.f9206b = str;
        this.f9211g = j2;
    }

    public C2878a(boolean z, long j, String str, boolean z2, String str2, long j2, String str3) {
        this.f9208d = z;
        this.f9205a = j;
        this.f9206b = str;
        this.f9209e = z2;
        this.f9210f = str2;
        this.f9211g = j2;
        this.f9212h = str3;
    }
}
