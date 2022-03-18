package com.bytedance.apm.p143i.p147c;

import android.os.Build;

/* renamed from: com.bytedance.apm.i.c.g */
public class C2977g {

    /* renamed from: a */
    private AbstractC2966b f9574a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.c.g$a */
    public static class C2979a {

        /* renamed from: a */
        public static C2977g f9575a = new C2977g();
    }

    /* renamed from: a */
    public static C2977g m12520a() {
        return C2979a.f9575a;
    }

    /* renamed from: b */
    public long mo12715b() {
        return this.f9574a.mo12691b();
    }

    /* renamed from: c */
    public long mo12716c() {
        return this.f9574a.mo12692c();
    }

    /* renamed from: d */
    public long mo12717d() {
        return this.f9574a.mo12693d();
    }

    /* renamed from: e */
    public long mo12718e() {
        return this.f9574a.mo12694e();
    }

    /* renamed from: f */
    public long mo12719f() {
        return this.f9574a.mo12695f();
    }

    /* renamed from: g */
    public long mo12720g() {
        return this.f9574a.mo12696g();
    }

    /* renamed from: h */
    public long mo12721h() {
        return this.f9574a.mo12697h();
    }

    private C2977g() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9574a = new C2969d();
        } else {
            this.f9574a = new C2972e();
        }
        this.f9574a.mo12689a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12714a(boolean z) {
        this.f9574a.mo12690a(z);
    }
}
