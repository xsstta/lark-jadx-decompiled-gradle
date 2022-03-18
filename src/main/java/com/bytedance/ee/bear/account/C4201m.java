package com.bytedance.ee.bear.account;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.account.m */
public class C4201m {

    /* renamed from: a */
    private String f12688a;

    /* renamed from: b */
    private String f12689b;

    /* renamed from: c */
    private String f12690c;

    /* renamed from: d */
    private String f12691d;

    /* renamed from: e */
    private String f12692e;

    /* renamed from: f */
    private String f12693f;

    /* renamed from: g */
    private String f12694g;

    /* renamed from: h */
    private String f12695h;

    /* renamed from: i */
    private String f12696i;

    /* renamed from: j */
    private String f12697j;

    /* renamed from: k */
    private String f12698k;

    /* renamed from: l */
    private String f12699l;

    /* renamed from: m */
    private int f12700m;

    /* renamed from: n */
    private boolean f12701n;

    /* renamed from: o */
    private boolean f12702o;

    /* renamed from: p */
    private String f12703p;

    /* renamed from: q */
    private boolean f12704q;

    /* renamed from: r */
    private String f12705r;

    /* renamed from: s */
    private boolean f12706s;

    public C4201m() {
    }

    /* renamed from: a */
    public String mo16474a() {
        return this.f12688a;
    }

    /* renamed from: b */
    public String mo16479b() {
        return this.f12689b;
    }

    /* renamed from: c */
    public String mo16482c() {
        return this.f12690c;
    }

    /* renamed from: d */
    public String mo16485d() {
        return this.f12691d;
    }

    /* renamed from: e */
    public String mo16488e() {
        return this.f12692e;
    }

    /* renamed from: f */
    public String mo16491f() {
        return this.f12693f;
    }

    /* renamed from: g */
    public String mo16493g() {
        return this.f12694g;
    }

    /* renamed from: h */
    public String mo16495h() {
        return this.f12695h;
    }

    /* renamed from: i */
    public String mo16498i() {
        return this.f12696i;
    }

    /* renamed from: j */
    public int mo16500j() {
        return this.f12700m;
    }

    /* renamed from: k */
    public String mo16502k() {
        return this.f12697j;
    }

    /* renamed from: l */
    public String mo16504l() {
        return this.f12698k;
    }

    /* renamed from: n */
    public String mo16508n() {
        return this.f12699l;
    }

    /* renamed from: o */
    public boolean mo16510o() {
        return this.f12702o;
    }

    /* renamed from: p */
    public String mo16511p() {
        return this.f12703p;
    }

    /* renamed from: q */
    public boolean mo16512q() {
        return this.f12704q;
    }

    /* renamed from: r */
    public String mo16513r() {
        return this.f12705r;
    }

    /* renamed from: t */
    public boolean mo16515t() {
        return this.f12701n;
    }

    /* renamed from: m */
    public boolean mo16507m() {
        return this.f12706s;
    }

    /* renamed from: s */
    public String mo16514s() {
        if (TextUtils.isEmpty(this.f12690c)) {
            return this.f12689b;
        }
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return this.f12689b;
        }
        if (Locale.CHINESE.getLanguage().equals(locale.getLanguage())) {
            return this.f12689b;
        }
        if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
            return this.f12690c;
        }
        return this.f12689b;
    }

    public String toString() {
        return "User{uid='" + this.f12688a + '\'' + ", cnName='" + this.f12689b + '\'' + '}';
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int hashCode = this.f12688a.hashCode() * 31;
        String str = this.f12689b;
        int i13 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i14 = (hashCode + i) * 31;
        String str2 = this.f12690c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        String str3 = this.f12691d;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        String str4 = this.f12692e;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        String str5 = this.f12693f;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str6 = this.f12694g;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        String str7 = this.f12695h;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        String str8 = this.f12696i;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        String str9 = this.f12697j;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        String str10 = this.f12698k;
        if (str10 != null) {
            i10 = str10.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        String str11 = this.f12699l;
        if (str11 != null) {
            i11 = str11.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (((((((i23 + i11) * 31) + this.f12700m) * 31) + (this.f12701n ? 1 : 0)) * 31) + (this.f12702o ? 1 : 0)) * 31;
        String str12 = this.f12703p;
        if (str12 != null) {
            i12 = str12.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (((i24 + i12) * 31) + (this.f12704q ? 1 : 0)) * 31;
        String str13 = this.f12705r;
        if (str13 != null) {
            i13 = str13.hashCode();
        }
        return i25 + i13;
    }

    /* renamed from: m */
    public void mo16506m(String str) {
        this.f12703p = str;
    }

    /* renamed from: a */
    public void mo16475a(int i) {
        this.f12700m = i;
    }

    /* renamed from: b */
    public void mo16480b(String str) {
        this.f12689b = str;
    }

    /* renamed from: c */
    public void mo16483c(String str) {
        this.f12690c = str;
    }

    /* renamed from: d */
    public void mo16486d(String str) {
        this.f12691d = str;
    }

    /* renamed from: e */
    public void mo16489e(String str) {
        this.f12692e = str;
    }

    /* renamed from: f */
    public void mo16492f(String str) {
        this.f12693f = str;
    }

    /* renamed from: g */
    public void mo16494g(String str) {
        this.f12694g = str;
    }

    /* renamed from: h */
    public void mo16496h(String str) {
        this.f12695h = str;
    }

    /* renamed from: i */
    public void mo16499i(String str) {
        this.f12696i = str;
    }

    /* renamed from: j */
    public void mo16501j(String str) {
        this.f12697j = str;
    }

    /* renamed from: k */
    public void mo16503k(String str) {
        this.f12698k = str;
    }

    /* renamed from: l */
    public void mo16505l(String str) {
        this.f12699l = str;
    }

    /* renamed from: n */
    public void mo16509n(String str) {
        this.f12705r = str;
    }

    /* renamed from: a */
    public void mo16477a(String str) {
        this.f12688a = str;
    }

    /* renamed from: b */
    public void mo16481b(boolean z) {
        this.f12702o = z;
    }

    /* renamed from: c */
    public void mo16484c(boolean z) {
        this.f12704q = z;
    }

    /* renamed from: d */
    public void mo16487d(boolean z) {
        this.f12701n = z;
    }

    /* renamed from: a */
    public void mo16478a(boolean z) {
        this.f12706s = z;
    }

    public C4201m(C4201m mVar) {
        this.f12688a = mVar.f12688a;
        this.f12689b = mVar.f12689b;
        this.f12690c = mVar.f12690c;
        this.f12691d = mVar.f12691d;
        this.f12692e = mVar.f12692e;
        this.f12693f = mVar.f12693f;
        this.f12694g = mVar.f12694g;
        this.f12695h = mVar.f12695h;
        this.f12696i = mVar.f12696i;
        this.f12697j = mVar.f12697j;
        this.f12698k = mVar.f12698k;
        this.f12699l = mVar.f12699l;
        this.f12700m = mVar.f12700m;
        this.f12701n = mVar.f12701n;
        this.f12702o = mVar.f12702o;
        this.f12703p = mVar.f12703p;
        this.f12704q = mVar.f12704q;
        this.f12705r = mVar.f12705r;
        this.f12706s = mVar.f12706s;
    }

    /* renamed from: a */
    public void mo16476a(UserInfo userInfo) {
        this.f12688a = userInfo.suid;
        this.f12689b = userInfo.cnName;
        this.f12690c = userInfo.enName;
        this.f12691d = userInfo.tenantName;
        this.f12692e = userInfo.email;
        this.f12693f = userInfo.mobile;
        this.f12694g = userInfo.avatarUrl;
        this.f12695h = userInfo.suid;
        this.f12697j = userInfo.tenantId;
        this.f12698k = userInfo.departmentId;
        this.f12699l = userInfo.tenantName;
        this.f12701n = userInfo.canCreateSheet;
        this.f12702o = userInfo.canCross;
        this.f12703p = userInfo.domain;
        this.f12704q = userInfo.isSingleproduct;
        this.f12705r = userInfo.tenantTag;
        this.f12706s = userInfo.isManager;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4201m mVar = (C4201m) obj;
        if (this.f12700m != mVar.f12700m || this.f12701n != mVar.f12701n || this.f12702o != mVar.f12702o || !this.f12688a.equals(mVar.f12688a)) {
            return false;
        }
        String str = this.f12689b;
        if (str == null ? mVar.f12689b != null : !str.equals(mVar.f12689b)) {
            return false;
        }
        String str2 = this.f12690c;
        if (str2 == null ? mVar.f12690c != null : !str2.equals(mVar.f12690c)) {
            return false;
        }
        String str3 = this.f12691d;
        if (str3 == null ? mVar.f12691d != null : !str3.equals(mVar.f12691d)) {
            return false;
        }
        String str4 = this.f12692e;
        if (str4 == null ? mVar.f12692e != null : !str4.equals(mVar.f12692e)) {
            return false;
        }
        String str5 = this.f12693f;
        if (str5 == null ? mVar.f12693f != null : !str5.equals(mVar.f12693f)) {
            return false;
        }
        String str6 = this.f12694g;
        if (str6 == null ? mVar.f12694g != null : !str6.equals(mVar.f12694g)) {
            return false;
        }
        String str7 = this.f12695h;
        if (str7 == null ? mVar.f12695h != null : !str7.equals(mVar.f12695h)) {
            return false;
        }
        String str8 = this.f12696i;
        if (str8 == null ? mVar.f12696i != null : !str8.equals(mVar.f12696i)) {
            return false;
        }
        String str9 = this.f12697j;
        if (str9 == null ? mVar.f12697j != null : !str9.equals(mVar.f12697j)) {
            return false;
        }
        String str10 = this.f12698k;
        if (str10 == null ? mVar.f12698k != null : !str10.equals(mVar.f12698k)) {
            return false;
        }
        String str11 = this.f12699l;
        if (str11 == null ? mVar.f12699l != null : !str11.equals(mVar.f12699l)) {
            return false;
        }
        if (this.f12704q != mVar.f12704q) {
            return false;
        }
        String str12 = this.f12705r;
        if (str12 == null ? mVar.f12705r != null : !str12.equals(mVar.f12705r)) {
            return false;
        }
        String str13 = this.f12703p;
        String str14 = mVar.f12703p;
        if (str13 != null) {
            return str13.equals(str14);
        }
        if (str14 == null) {
            return true;
        }
        return false;
    }
}
