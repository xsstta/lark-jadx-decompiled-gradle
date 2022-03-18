package com.huawei.hms.hatool;

import android.content.Context;

public class k1 {

    /* renamed from: a */
    public C23608k f58262a;

    /* renamed from: b */
    public C23608k f58263b;

    /* renamed from: c */
    public Context f58264c;

    /* renamed from: d */
    public String f58265d;

    public k1(Context context) {
        if (context != null) {
            this.f58264c = context.getApplicationContext();
        }
        this.f58262a = new C23608k();
        this.f58263b = new C23608k();
    }

    /* renamed from: a */
    public k1 mo83077a(int i, String str) {
        C23608k kVar;
        C23625y.m85977c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!t0.m85922b(str)) {
            str = "";
        }
        if (i == 0) {
            kVar = this.f58262a;
        } else if (i != 1) {
            C23625y.m85982f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        } else {
            kVar = this.f58263b;
        }
        kVar.mo83050b(str);
        return this;
    }

    /* renamed from: a */
    public k1 mo83078a(String str) {
        C23625y.m85977c("hmsSdk", "Builder.setAppID is execute");
        this.f58265d = str;
        return this;
    }

    /* renamed from: a */
    public k1 mo83079a(boolean z) {
        C23625y.m85977c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f58262a.mo83067j().mo83031a(z);
        this.f58263b.mo83067j().mo83031a(z);
        return this;
    }

    /* renamed from: a */
    public void mo83080a() {
        if (this.f58264c == null) {
            C23625y.m85974b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        C23625y.m85977c("hmsSdk", "Builder.create() is execute.");
        h1 h1Var = new h1("_hms_config_tag");
        h1Var.mo83020b(new C23608k(this.f58262a));
        h1Var.mo83018a(new C23608k(this.f58263b));
        f1.m85710a().mo83002a(this.f58264c);
        g1.m85726a().mo83005a(this.f58264c);
        m1.m85855c().mo83121a(h1Var);
        f1.m85710a().mo83003a(this.f58265d);
    }

    /* renamed from: b */
    public k1 mo83081b(boolean z) {
        C23625y.m85977c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f58262a.mo83067j().mo83033b(z);
        this.f58263b.mo83067j().mo83033b(z);
        return this;
    }

    /* renamed from: c */
    public k1 mo83082c(boolean z) {
        C23625y.m85977c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f58262a.mo83067j().mo83035c(z);
        this.f58263b.mo83067j().mo83035c(z);
        return this;
    }
}
