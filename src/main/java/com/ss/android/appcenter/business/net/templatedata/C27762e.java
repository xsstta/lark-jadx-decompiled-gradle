package com.ss.android.appcenter.business.net.templatedata;

/* renamed from: com.ss.android.appcenter.business.net.templatedata.e */
public class C27762e {

    /* renamed from: a */
    public String f69357a;

    /* renamed from: b */
    public String f69358b;

    /* renamed from: c */
    public String f69359c;

    /* renamed from: d */
    public String f69360d;

    /* renamed from: e */
    public boolean f69361e;

    public String toString() {
        return String.format("ExternalComponentRequest{method='%s', url='%s', key='%s', jsonBody='%s', withAuth=%s}", this.f69357a, this.f69358b, this.f69359c, this.f69360d, Boolean.valueOf(this.f69361e));
    }

    public C27762e(String str, String str2, String str3, boolean z) {
        this.f69357a = str;
        this.f69358b = str2;
        this.f69359c = str3;
        this.f69361e = z;
    }
}
