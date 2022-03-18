package com.huawei.hms.hatool;

/* renamed from: com.huawei.hms.hatool.m */
public class C23610m {

    /* renamed from: a */
    public C23608k f58284a;

    /* renamed from: b */
    public C23608k f58285b;

    /* renamed from: c */
    public C23608k f58286c;

    /* renamed from: d */
    public C23608k f58287d;

    public C23610m(String str) {
    }

    /* renamed from: a */
    public C23608k mo83114a() {
        return this.f58286c;
    }

    /* renamed from: a */
    public C23608k mo83115a(String str) {
        if (str.equals("oper")) {
            return mo83119c();
        }
        if (str.equals("maint")) {
            return mo83117b();
        }
        if (str.equals("diffprivacy")) {
            return mo83114a();
        }
        if (str.equals("preins")) {
            return mo83120d();
        }
        C23625y.m85982f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    /* renamed from: a */
    public void mo83116a(C23608k kVar) {
        this.f58284a = kVar;
    }

    /* renamed from: b */
    public C23608k mo83117b() {
        return this.f58284a;
    }

    /* renamed from: b */
    public void mo83118b(C23608k kVar) {
        this.f58285b = kVar;
    }

    /* renamed from: c */
    public C23608k mo83119c() {
        return this.f58285b;
    }

    /* renamed from: d */
    public C23608k mo83120d() {
        return this.f58287d;
    }
}
