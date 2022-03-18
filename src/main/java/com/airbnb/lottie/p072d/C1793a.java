package com.airbnb.lottie.p072d;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1792d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.airbnb.lottie.d.a */
public class C1793a<T> {

    /* renamed from: a */
    public final T f6147a;

    /* renamed from: b */
    public T f6148b;

    /* renamed from: c */
    public final Interpolator f6149c;

    /* renamed from: d */
    public final float f6150d;

    /* renamed from: e */
    public Float f6151e;

    /* renamed from: f */
    public PointF f6152f;

    /* renamed from: g */
    public PointF f6153g;

    /* renamed from: h */
    private final C1792d f6154h;

    /* renamed from: i */
    private float f6155i = -3987645.8f;

    /* renamed from: j */
    private float f6156j = -3987645.8f;

    /* renamed from: k */
    private int f6157k = 784923401;

    /* renamed from: l */
    private int f6158l = 784923401;

    /* renamed from: m */
    private float f6159m = Float.MIN_VALUE;

    /* renamed from: n */
    private float f6160n = Float.MIN_VALUE;

    /* renamed from: e */
    public boolean mo9076e() {
        if (this.f6149c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public float mo9074c() {
        C1792d dVar = this.f6154h;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f6159m == Float.MIN_VALUE) {
            this.f6159m = (this.f6150d - dVar.mo9064f()) / this.f6154h.mo9071m();
        }
        return this.f6159m;
    }

    /* renamed from: f */
    public float mo9077f() {
        if (this.f6155i == -3987645.8f) {
            this.f6155i = this.f6147a.floatValue();
        }
        return this.f6155i;
    }

    /* renamed from: g */
    public float mo9078g() {
        if (this.f6156j == -3987645.8f) {
            this.f6156j = this.f6148b.floatValue();
        }
        return this.f6156j;
    }

    /* renamed from: h */
    public int mo9079h() {
        if (this.f6157k == 784923401) {
            this.f6157k = this.f6147a.intValue();
        }
        return this.f6157k;
    }

    /* renamed from: i */
    public int mo9080i() {
        if (this.f6158l == 784923401) {
            this.f6158l = this.f6148b.intValue();
        }
        return this.f6158l;
    }

    /* renamed from: d */
    public float mo9075d() {
        if (this.f6154h == null) {
            return 1.0f;
        }
        if (this.f6160n == Float.MIN_VALUE) {
            if (this.f6151e == null) {
                this.f6160n = 1.0f;
            } else {
                this.f6160n = mo9074c() + ((this.f6151e.floatValue() - this.f6150d) / this.f6154h.mo9071m());
            }
        }
        return this.f6160n;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f6147a) + ", endValue=" + ((Object) this.f6148b) + ", startFrame=" + this.f6150d + ", endFrame=" + this.f6151e + ", interpolator=" + this.f6149c + '}';
    }

    /* renamed from: a */
    public boolean mo9073a(float f) {
        if (f < mo9074c() || f >= mo9075d()) {
            return false;
        }
        return true;
    }

    public C1793a(T t) {
        this.f6147a = t;
        this.f6148b = t;
        this.f6150d = Float.MIN_VALUE;
        this.f6151e = Float.valueOf(Float.MAX_VALUE);
    }

    public C1793a(C1792d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f6154h = dVar;
        this.f6147a = t;
        this.f6148b = t2;
        this.f6149c = interpolator;
        this.f6150d = f;
        this.f6151e = f2;
    }
}
