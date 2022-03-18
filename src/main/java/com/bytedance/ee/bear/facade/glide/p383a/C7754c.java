package com.bytedance.ee.bear.facade.glide.p383a;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.p085b.C2219g;
import com.bytedance.ee.bear.contract.AbstractC5082ab;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p700c.C13598b;
import java.lang.ref.WeakReference;
import java.net.URL;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.c */
public class C7754c extends C2219g {

    /* renamed from: b */
    private String f21015b;

    /* renamed from: c */
    private String f21016c;

    /* renamed from: d */
    private int f21017d;

    /* renamed from: e */
    private int f21018e;

    /* renamed from: f */
    private String f21019f;

    /* renamed from: g */
    private String f21020g;

    /* renamed from: h */
    private String f21021h;

    /* renamed from: i */
    private String f21022i;

    /* renamed from: j */
    private boolean f21023j;

    /* renamed from: k */
    private boolean f21024k;

    /* renamed from: l */
    private String f21025l;

    /* renamed from: m */
    private WeakReference<ImageView> f21026m;

    /* renamed from: n */
    private boolean f21027n;

    /* renamed from: o */
    private C10917c f21028o;

    /* renamed from: p */
    private boolean f21029p;

    /* renamed from: l */
    public int mo30384l() {
        return this.f21018e;
    }

    /* renamed from: m */
    public String mo30385m() {
        return this.f21019f;
    }

    /* renamed from: n */
    public String mo30386n() {
        return this.f21020g;
    }

    /* renamed from: p */
    public String mo30388p() {
        return this.f21015b;
    }

    /* renamed from: q */
    public String mo30389q() {
        return this.f21022i;
    }

    /* renamed from: r */
    public int mo30390r() {
        return this.f21017d;
    }

    /* renamed from: s */
    public boolean mo30391s() {
        return this.f21024k;
    }

    /* renamed from: t */
    public boolean mo30392t() {
        return this.f21023j;
    }

    /* renamed from: u */
    public boolean mo30393u() {
        return this.f21027n;
    }

    /* renamed from: w */
    public String mo30395w() {
        String str = this.f21025l;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bumptech.glide.load.p085b.C2219g
    /* renamed from: a */
    public URL mo10575a() {
        return m31045c(mo29122g());
    }

    /* renamed from: e */
    public String mo29120e() {
        return C13598b.m55197d(mo10578d());
    }

    /* renamed from: g */
    public String mo29122g() {
        if (mo30380h()) {
            return this.f21016c;
        }
        return this.f21015b;
    }

    /* renamed from: h */
    public boolean mo30380h() {
        if (this.f21024k) {
            return true;
        }
        return !TextUtils.isEmpty(this.f21016c);
    }

    /* renamed from: i */
    public AbstractC5082ab mo30381i() {
        return (AbstractC5082ab) KoinJavaComponent.m268610a(AbstractC5082ab.class);
    }

    /* renamed from: k */
    public AbstractC5233x mo30383k() {
        if (this.f21028o == null) {
            return null;
        }
        return C5234y.m21391b();
    }

    /* renamed from: v */
    public ImageView mo30394v() {
        return this.f21026m.get();
    }

    /* renamed from: f */
    public URL mo29121f() {
        if (TextUtils.isEmpty(this.f21015b)) {
            return null;
        }
        return m31045c(this.f21015b);
    }

    /* renamed from: j */
    public boolean mo30382j() {
        if (this.f21028o == null) {
            return false;
        }
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* renamed from: o */
    public String mo30387o() {
        if (this.f21021h == null) {
            this.f21021h = C7745a.m31019a().mo30372e(mo29122g(), this.f21025l);
        }
        String str = this.f21021h;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bumptech.glide.load.p085b.C2219g
    /* renamed from: d */
    public String mo10578d() {
        String str;
        if (TextUtils.isEmpty(mo29122g())) {
            str = "";
        } else {
            str = mo29122g();
        }
        return str + this.f21018e + mo30387o();
    }

    /* renamed from: a */
    public void mo30377a(boolean z) {
        this.f21027n = z;
    }

    /* renamed from: b */
    public void mo30379b(String str) {
        this.f21021h = str;
    }

    /* renamed from: a */
    public void mo30376a(Boolean bool) {
        this.f21029p = bool.booleanValue();
    }

    /* renamed from: c */
    private URL m31045c(String str) {
        try {
            return new URL(Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo30378a(String str) {
        boolean z;
        if (TextUtils.equals(this.f21022i, "template")) {
            return false;
        }
        if (this.f21017d == C8275a.f22375h.mo32555b() && (TextUtils.equals(this.f21022i, "space_list") || TextUtils.equals(this.f21022i, "space_list_icon"))) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(C7745a.m31019a().mo30365a(str, mo30395w()));
        if (this.f21029p || mo30382j()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return isEmpty;
    }

    public C7754c(String str, String str2, int i, int i2, String str3, String str4, String str5, boolean z, ImageView imageView, C10917c cVar) {
        this(str, str2, i, i2, str3, str4, str5, z, "", imageView, cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7754c(java.lang.String r2, java.lang.String r3, int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, android.widget.ImageView r11, com.bytedance.ee.bear.service.C10917c r12) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "isValid"
            goto L_0x000a
        L_0x0009:
            r0 = r2
        L_0x000a:
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.f21025l = r0
            r1.f21015b = r2
            r1.f21016c = r3
            r1.f21017d = r4
            r1.f21018e = r5
            r1.f21019f = r6
            r1.f21020g = r7
            r1.f21022i = r8
            r1.f21025l = r10
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r11)
            r1.f21026m = r2
            r1.f21028o = r12
            r1.f21024k = r9
            java.lang.String r2 = r1.mo29122g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ 1
            r1.f21023j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.facade.glide.p383a.C7754c.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, android.widget.ImageView, com.bytedance.ee.bear.service.c):void");
    }
}
