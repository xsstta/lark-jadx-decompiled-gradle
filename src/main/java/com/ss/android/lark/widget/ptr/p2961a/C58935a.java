package com.ss.android.lark.widget.ptr.p2961a;

import android.graphics.PointF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.widget.ptr.a.a */
public class C58935a {

    /* renamed from: a */
    protected int f145927a;

    /* renamed from: b */
    protected int f145928b;

    /* renamed from: c */
    private PointF f145929c = new PointF();

    /* renamed from: d */
    private float f145930d;

    /* renamed from: e */
    private float f145931e;

    /* renamed from: f */
    private int f145932f = 0;

    /* renamed from: g */
    private int f145933g = 0;

    /* renamed from: h */
    private int f145934h;

    /* renamed from: i */
    private int f145935i;

    /* renamed from: j */
    private int f145936j = 0;

    /* renamed from: k */
    private boolean f145937k = true;

    /* renamed from: l */
    private float f145938l = 1.2f;

    /* renamed from: m */
    private float f145939m = 1.7f;

    /* renamed from: n */
    private float f145940n = 1.7f;

    /* renamed from: o */
    private boolean f145941o = false;

    /* renamed from: p */
    private int f145942p = -1;

    /* renamed from: q */
    private int f145943q = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199897a(int i, int i2) {
    }

    /* renamed from: e */
    public void mo199911e() {
        this.f145941o = false;
    }

    /* renamed from: g */
    public boolean mo199916g(int i) {
        return i < 0;
    }

    /* renamed from: c */
    public float mo199905c() {
        return this.f145939m;
    }

    /* renamed from: d */
    public float mo199909d() {
        return this.f145940n;
    }

    /* renamed from: h */
    public float mo199917h() {
        return this.f145938l;
    }

    /* renamed from: i */
    public int mo199918i() {
        return this.f145927a;
    }

    /* renamed from: j */
    public float mo199919j() {
        return this.f145930d;
    }

    /* renamed from: k */
    public float mo199920k() {
        return this.f145931e;
    }

    /* renamed from: l */
    public int mo199921l() {
        return this.f145933g;
    }

    /* renamed from: m */
    public int mo199922m() {
        return this.f145932f;
    }

    /* renamed from: b */
    public boolean mo199904b() {
        return this.f145941o;
    }

    /* renamed from: f */
    public void mo199913f() {
        this.f145943q = this.f145932f;
    }

    /* renamed from: o */
    public boolean mo199924o() {
        if (this.f145932f > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo199929t() {
        if (this.f145932f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo199915g() {
        if (this.f145932f >= this.f145943q) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo199925p() {
        if (this.f145933g != 0 || !mo199924o()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo199926q() {
        if (this.f145933g == 0 || !mo199929t()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo199927r() {
        if (this.f145932f >= mo199918i()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo199928s() {
        if (this.f145932f != this.f145936j) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo199931v() {
        int i = this.f145933g;
        int i2 = this.f145934h;
        if (i >= i2 || this.f145932f < i2) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo199932w() {
        if (this.f145932f > mo199933x()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo199923n() {
        float f = this.f145938l;
        this.f145927a = (int) (((float) this.f145934h) * f);
        this.f145928b = (int) (f * ((float) this.f145935i));
    }

    /* renamed from: u */
    public boolean mo199930u() {
        if (this.f145933g >= mo199918i() || this.f145932f < mo199918i()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public int mo199933x() {
        if (this.f145937k) {
            int i = this.f145942p;
            if (i >= 0) {
                return i;
            }
            return this.f145934h;
        }
        int i2 = this.f145942p;
        if (i2 >= 0) {
            return i2;
        }
        return this.f145935i;
    }

    /* renamed from: y */
    public float mo199934y() {
        int i = this.f145934h;
        if (i == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (((float) this.f145932f) * 1.0f) / ((float) i);
    }

    /* renamed from: a */
    public boolean mo199900a() {
        return this.f145937k;
    }

    /* renamed from: a */
    public void mo199893a(float f) {
        this.f145939m = f;
    }

    /* renamed from: b */
    public void mo199901b(float f) {
        this.f145940n = f;
    }

    /* renamed from: d */
    public void mo199910d(int i) {
        this.f145935i = i;
        mo199923n();
    }

    /* renamed from: e */
    public void mo199912e(int i) {
        this.f145942p = i;
    }

    /* renamed from: b */
    public final void mo199903b(int i) {
        int i2 = this.f145932f;
        this.f145933g = i2;
        this.f145932f = i;
        mo199897a(i, i2);
    }

    /* renamed from: c */
    public void mo199908c(int i) {
        this.f145934h = i;
        mo199923n();
    }

    /* renamed from: f */
    public boolean mo199914f(int i) {
        if (this.f145932f == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo199896a(int i) {
        this.f145938l = (((float) this.f145934h) * 1.0f) / ((float) i);
        this.f145927a = i;
        this.f145928b = i;
    }

    /* renamed from: c */
    public void mo199906c(float f) {
        this.f145938l = f;
        this.f145927a = (int) (((float) this.f145934h) * f);
        this.f145928b = (int) (((float) this.f145935i) * f);
    }

    /* renamed from: a */
    public void mo199898a(C58935a aVar) {
        this.f145932f = aVar.f145932f;
        this.f145933g = aVar.f145933g;
        this.f145934h = aVar.f145934h;
    }

    /* renamed from: a */
    public void mo199899a(boolean z) {
        this.f145937k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo199907c(float f, float f2) {
        this.f145930d = f;
        this.f145931e = f2;
    }

    /* renamed from: a */
    public void mo199894a(float f, float f2) {
        this.f145941o = true;
        this.f145936j = this.f145932f;
        this.f145929c.set(f, f2);
    }

    /* renamed from: b */
    public final void mo199902b(float f, float f2) {
        mo199895a(f, f2, f - this.f145929c.x, f2 - this.f145929c.y);
        this.f145929c.set(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo199895a(float f, float f2, float f3, float f4) {
        mo199907c(f3, f4 / this.f145939m);
    }
}
