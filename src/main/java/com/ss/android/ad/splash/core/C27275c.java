package com.ss.android.ad.splash.core;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.core.c */
public class C27275c {

    /* renamed from: a */
    private String f67957a;

    /* renamed from: b */
    private String f67958b;

    /* renamed from: c */
    private String f67959c;

    /* renamed from: d */
    private String f67960d;

    /* renamed from: e */
    private String f67961e;

    /* renamed from: f */
    private String f67962f;

    /* renamed from: g */
    private String f67963g;

    /* renamed from: h */
    private String f67964h;

    /* renamed from: i */
    private String f67965i;

    /* renamed from: j */
    private String f67966j;

    /* renamed from: k */
    private String f67967k;

    /* renamed from: l */
    private String f67968l;

    /* renamed from: m */
    private long f67969m;

    /* renamed from: n */
    private String f67970n;

    /* renamed from: o */
    private String f67971o;

    /* renamed from: p */
    private String f67972p;

    /* renamed from: q */
    private String f67973q;

    /* renamed from: r */
    private String f67974r;

    /* renamed from: s */
    private boolean f67975s = true;

    /* renamed from: f */
    private String m99141f() {
        if (m99140a(this.f67959c)) {
            this.f67959c = C27287e.as().mo97994c();
        }
        return this.f67959c;
    }

    /* renamed from: g */
    private String m99142g() {
        if (m99140a(this.f67960d)) {
            this.f67960d = C27287e.as().mo97995d();
        }
        return this.f67960d;
    }

    /* renamed from: h */
    private String m99143h() {
        if (m99140a(this.f67961e)) {
            this.f67961e = C27287e.as().mo97996e();
        }
        return this.f67961e;
    }

    /* renamed from: i */
    private String m99144i() {
        if (m99140a(this.f67963g)) {
            this.f67963g = C27287e.as().mo97998g();
        }
        return this.f67963g;
    }

    /* renamed from: j */
    private String m99145j() {
        if (m99140a(this.f67964h)) {
            this.f67964h = C27287e.as().mo97999h();
        }
        return this.f67964h;
    }

    /* renamed from: k */
    private String m99146k() {
        if (m99140a(this.f67965i)) {
            this.f67965i = C27287e.as().mo98000i();
        }
        return this.f67965i;
    }

    /* renamed from: l */
    private String m99147l() {
        if (m99140a(this.f67968l)) {
            this.f67968l = C27287e.as().mo98003l();
        }
        return this.f67968l;
    }

    /* renamed from: m */
    private String m99148m() {
        if (m99140a(this.f67967k)) {
            this.f67967k = C27287e.as().mo98002k();
        }
        return this.f67967k;
    }

    /* renamed from: n */
    private String m99149n() {
        if (m99140a(this.f67970n)) {
            this.f67970n = C27287e.as().mo98005n();
        }
        return this.f67970n;
    }

    /* renamed from: o */
    private String m99150o() {
        if (m99140a(this.f67971o)) {
            this.f67971o = C27287e.as().mo98006o();
        }
        return this.f67971o;
    }

    /* renamed from: p */
    private String m99151p() {
        if (m99140a(this.f67972p)) {
            this.f67972p = C27287e.as().mo98007p();
        }
        return this.f67972p;
    }

    /* renamed from: q */
    private String m99152q() {
        if (m99140a(this.f67973q)) {
            this.f67973q = C27287e.as().mo98008q();
        }
        return this.f67973q;
    }

    /* renamed from: r */
    private String m99153r() {
        if (m99140a(this.f67974r)) {
            this.f67974r = C27287e.as().mo98009r();
        }
        return this.f67974r;
    }

    /* renamed from: a */
    public String mo97272a() {
        if (m99140a(this.f67957a)) {
            this.f67957a = C27287e.as().mo97992a();
        }
        return this.f67957a;
    }

    /* renamed from: b */
    public String mo97274b() {
        if (m99140a(this.f67958b)) {
            this.f67958b = C27287e.as().mo97993b();
        }
        return this.f67958b;
    }

    /* renamed from: c */
    public String mo97275c() {
        if (m99140a(this.f67962f)) {
            this.f67962f = C27287e.as().mo97997f();
        }
        return this.f67962f;
    }

    /* renamed from: d */
    public String mo97276d() {
        if (m99140a(this.f67966j)) {
            this.f67966j = C27287e.as().mo98001j();
        }
        return this.f67966j;
    }

    /* renamed from: e */
    public long mo97277e() {
        if (this.f67969m == 0 && C27287e.as() != null) {
            this.f67969m = C27287e.as().mo98004m();
        }
        return this.f67969m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(mo97275c())) {
            sb.append("&channel=");
            sb.append(Uri.encode(mo97275c()));
        }
        if (!TextUtils.isEmpty(mo97272a())) {
            sb.append("&aid=");
            sb.append(Uri.encode(mo97272a()));
        }
        if (!TextUtils.isEmpty(m99153r())) {
            sb.append("&gaid=");
            sb.append(Uri.encode(m99153r()));
        }
        if (!TextUtils.isEmpty(mo97274b())) {
            sb.append("&app_name=");
            sb.append(Uri.encode(mo97274b()));
        }
        if (!TextUtils.isEmpty(m99143h())) {
            sb.append("&update_version_code=");
            sb.append(Uri.encode(m99143h()));
        }
        if (!TextUtils.isEmpty(m99141f())) {
            sb.append("&version_code=");
            sb.append(Uri.encode(m99141f()));
        }
        if (!TextUtils.isEmpty(m99142g())) {
            sb.append("&version_name=");
            sb.append(Uri.encode(m99142g()));
        }
        if (!TextUtils.isEmpty(m99144i())) {
            sb.append("&manifest_version_code=");
            sb.append(Uri.encode(m99144i()));
        }
        if (!TextUtils.isEmpty(m99145j())) {
            sb.append("&language=");
            sb.append(Uri.encode(m99145j()));
        } else if (!C27287e.m99259e().mo97701f()) {
            sb.append("&language=");
            sb.append("zh");
        }
        if (!TextUtils.isEmpty(m99146k())) {
            sb.append("&iid=");
            sb.append(Uri.encode(m99146k()));
        }
        if (!TextUtils.isEmpty(mo97276d())) {
            sb.append("&device_id=");
            sb.append(Uri.encode(mo97276d()));
        }
        if (!TextUtils.isEmpty(m99147l())) {
            sb.append("&openudid=");
            sb.append(Uri.encode(m99147l()));
        }
        if (!TextUtils.isEmpty(m99148m())) {
            sb.append("&uuid=");
            sb.append(Uri.encode(m99148m()));
        }
        if (this.f67975s) {
            if (!TextUtils.isEmpty(m99149n())) {
                sb.append("&ab_version=");
                sb.append(Uri.encode(m99149n()));
            }
            if (!TextUtils.isEmpty(m99150o())) {
                sb.append("&ab_client=");
                sb.append(Uri.encode(m99150o()));
            }
            if (!TextUtils.isEmpty(m99151p())) {
                sb.append("&ab_group=");
                sb.append(Uri.encode(m99151p()));
            }
            if (!TextUtils.isEmpty(m99152q())) {
                sb.append("&ab_feature=");
                sb.append(Uri.encode(m99152q()));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo97273a(boolean z) {
        this.f67975s = z;
    }

    /* renamed from: a */
    private boolean m99140a(String str) {
        if (!TextUtils.isEmpty(str) || C27287e.as() == null) {
            return false;
        }
        return true;
    }
}
