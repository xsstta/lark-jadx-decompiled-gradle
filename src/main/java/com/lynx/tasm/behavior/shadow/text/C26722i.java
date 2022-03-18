package com.lynx.tasm.behavior.shadow.text;

import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.C26748b;
import com.lynx.tasm.utils.C26955i;

/* renamed from: com.lynx.tasm.behavior.shadow.text.i */
public class C26722i {

    /* renamed from: a */
    public int f66140a = -1;

    /* renamed from: b */
    public int f66141b = -1;

    /* renamed from: c */
    public int f66142c = -16777216;

    /* renamed from: d */
    public int f66143d;

    /* renamed from: e */
    public int f66144e = -1;

    /* renamed from: f */
    public int f66145f;

    /* renamed from: g */
    public int f66146g;

    /* renamed from: h */
    public int f66147h;

    /* renamed from: i */
    public int f66148i;

    /* renamed from: j */
    public float f66149j = 1.0E21f;

    /* renamed from: k */
    public float f66150k = 1.0E21f;

    /* renamed from: l */
    public float f66151l;

    /* renamed from: m */
    public float f66152m = C26955i.m97952a(14.0f);

    /* renamed from: n */
    public boolean f66153n = false;

    /* renamed from: o */
    public boolean f66154o = false;

    /* renamed from: p */
    public String f66155p = null;

    /* renamed from: q */
    public C26748b f66156q;

    /* renamed from: r */
    public int f66157r;

    /* renamed from: c */
    public int mo94895c() {
        return this.f66146g;
    }

    /* renamed from: d */
    public String mo94896d() {
        return this.f66155p;
    }

    /* renamed from: e */
    public void mo94897e() {
        if (this.f66156q == null) {
            this.f66156q = new C26748b();
        }
    }

    /* renamed from: a */
    public int mo94891a() {
        int i = this.f66145f;
        if (i == 1 && this.f66146g == 2) {
            return 3;
        }
        if (i == 1) {
            return i;
        }
        int i2 = this.f66146g;
        if (i2 == 2) {
            return i2;
        }
        return 0;
    }

    /* renamed from: b */
    public C26722i mo94894b() {
        C26722i iVar = new C26722i();
        iVar.f66140a = this.f66140a;
        iVar.f66141b = this.f66141b;
        iVar.f66142c = this.f66142c;
        iVar.f66143d = this.f66143d;
        iVar.f66144e = this.f66144e;
        iVar.f66145f = this.f66145f;
        iVar.f66146g = this.f66146g;
        iVar.f66147h = this.f66147h;
        iVar.f66148i = this.f66148i;
        iVar.f66149j = this.f66149j;
        iVar.f66150k = this.f66150k;
        iVar.f66151l = this.f66151l;
        iVar.f66152m = this.f66152m;
        iVar.f66153n = this.f66153n;
        iVar.f66154o = this.f66154o;
        iVar.f66155p = this.f66155p;
        iVar.f66156q = this.f66156q;
        iVar.f66157r = this.f66157r;
        return iVar;
    }

    public int hashCode() {
        int i;
        int floatToIntBits = ((((((((((((((((((((((((((this.f66140a * 31) + this.f66141b) * 31) + this.f66142c) * 31) + this.f66143d) * 31) + this.f66144e) * 31) + this.f66145f) * 31) + this.f66147h) * 31) + this.f66148i) * 31) + Float.floatToIntBits(this.f66149j)) * 31) + Float.floatToIntBits(this.f66150k)) * 31) + Float.floatToIntBits(this.f66151l)) * 31) + Float.floatToIntBits(this.f66152m)) * 31) + (this.f66153n ? 1 : 0)) * 31) + (this.f66154o ? 1 : 0)) * 31;
        String str = this.f66155p;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (floatToIntBits + i) * 31;
        C26748b bVar = this.f66156q;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((i3 + i2) * 31) + this.f66157r;
    }

    /* renamed from: a */
    public void mo94892a(String str) {
        this.f66155p = str;
    }

    /* renamed from: a */
    public void mo94893a(boolean z) {
        this.f66154o = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26722i)) {
            return false;
        }
        C26722i iVar = (C26722i) obj;
        if (this.f66140a == iVar.f66140a && this.f66141b == iVar.f66141b && this.f66142c == iVar.f66142c && this.f66143d == iVar.f66143d && this.f66144e == iVar.f66144e && this.f66145f == iVar.f66145f && this.f66146g == iVar.f66146g && this.f66147h == iVar.f66147h && this.f66148i == iVar.f66148i && this.f66149j == iVar.f66149j && this.f66150k == iVar.f66150k && this.f66151l == iVar.f66151l && this.f66152m == iVar.f66152m && this.f66153n == iVar.f66153n && this.f66154o == iVar.f66154o && TextUtils.equals(this.f66155p, iVar.f66155p) && this.f66156q == iVar.f66156q && this.f66157r == iVar.f66157r) {
            return true;
        }
        return false;
    }
}
