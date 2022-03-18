package com.ss.android.lark.mail.impl.p2171h.p2177e;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42341b;

/* renamed from: com.ss.android.lark.mail.impl.h.e.a */
public class C42350a extends C42341b {

    /* renamed from: a */
    protected int f107810a;

    /* renamed from: b */
    protected long f107811b;

    /* renamed from: c */
    protected long f107812c = -1;

    /* renamed from: d */
    protected long f107813d = -1;

    /* renamed from: e */
    protected String f107814e;

    /* renamed from: f */
    private long f107815f;

    /* renamed from: g */
    private long f107816g;

    /* renamed from: h */
    private long f107817h;

    /* renamed from: i */
    private long f107818i;

    /* renamed from: j */
    private long f107819j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152461a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo152464b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo152467d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo152468e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo152469f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo152470g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo152471h() {
    }

    /* renamed from: i */
    public void mo152472i() {
        if (this.f107816g == 0) {
            this.f107816g = System.currentTimeMillis();
        }
    }

    /* renamed from: j */
    public void mo152473j() {
        this.f107817h = System.currentTimeMillis();
        Log.m165388i("BaseRenderMonitor onActivityFinish mPressBackTimeMillis:" + this.f107817h);
        if (this.f107815f == 0 && this.f107816g == 0) {
            m169112k();
        }
    }

    /* renamed from: k */
    private void m169112k() {
        long j = this.f107817h;
        if (j > 0) {
            this.f107812c = j - this.f107818i;
        }
        if (this.f107811b == 0) {
            this.f107811b = 8000;
        }
        long j2 = this.f107815f;
        if (j2 > 0) {
            long j3 = j2 - this.f107819j;
            this.f107813d = j3;
            if (j2 < j || j <= 0) {
                if (j3 >= this.f107811b) {
                    mo152464b();
                } else if (this.f107816g > 0) {
                    mo152467d();
                } else {
                    mo152461a();
                }
            } else if (j3 < this.f107811b) {
                mo152468e();
            } else {
                mo152469f();
            }
        } else if (this.f107816g > 0) {
            mo152470g();
        } else {
            mo152471h();
        }
    }

    /* renamed from: b */
    public void mo152465b(int i) {
        if (i == -1) {
            m169112k();
        }
    }

    /* renamed from: a */
    public void mo152462a(int i) {
        if (i == 0) {
            this.f107815f = System.currentTimeMillis();
            m169112k();
        }
    }

    /* renamed from: b */
    public void mo152466b(String str) {
        this.f107818i = System.currentTimeMillis();
        this.f107814e = str;
    }

    /* renamed from: a */
    public void mo152463a(int i, long j) {
        this.f107819j = System.currentTimeMillis();
        this.f107810a = i;
        this.f107811b = j;
    }
}
