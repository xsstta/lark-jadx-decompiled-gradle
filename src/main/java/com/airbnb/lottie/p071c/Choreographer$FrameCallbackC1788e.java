package com.airbnb.lottie.p071c;

import android.view.Choreographer;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.C1792d;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.airbnb.lottie.c.e */
public class Choreographer$FrameCallbackC1788e extends AbstractC1784a implements Choreographer.FrameCallback {

    /* renamed from: a */
    protected boolean f6114a;

    /* renamed from: b */
    private float f6115b = 1.0f;

    /* renamed from: c */
    private boolean f6116c;

    /* renamed from: d */
    private long f6117d;

    /* renamed from: e */
    private float f6118e;

    /* renamed from: f */
    private int f6119f;

    /* renamed from: g */
    private float f6120g = -2.14748365E9f;

    /* renamed from: h */
    private float f6121h = 2.14748365E9f;

    /* renamed from: i */
    private C1792d f6122i;

    /* renamed from: e */
    public float mo9033e() {
        return this.f6118e;
    }

    /* renamed from: h */
    public float mo9039h() {
        return this.f6115b;
    }

    public boolean isRunning() {
        return this.f6114a;
    }

    /* renamed from: k */
    public void mo9043k() {
        mo9048p();
    }

    public void cancel() {
        mo9007b();
        mo9048p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo9048p() {
        mo9029c(true);
    }

    /* renamed from: r */
    private boolean m7976r() {
        if (mo9039h() < BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo9034f() {
        this.f6122i = null;
        this.f6120g = -2.14748365E9f;
        this.f6121h = 2.14748365E9f;
    }

    /* renamed from: g */
    public void mo9035g() {
        mo9028c(-mo9039h());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo9031d());
    }

    public long getDuration() {
        C1792d dVar = this.f6122i;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.mo9063e();
    }

    /* renamed from: j */
    public void mo9042j() {
        mo9048p();
        mo9008b(m7976r());
    }

    /* renamed from: q */
    private float m7975q() {
        C1792d dVar = this.f6122i;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.mo9066h()) / Math.abs(this.f6115b);
    }

    /* renamed from: d */
    public float mo9031d() {
        C1792d dVar = this.f6122i;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (this.f6118e - dVar.mo9064f()) / (this.f6122i.mo9065g() - this.f6122i.mo9064f());
    }

    /* renamed from: m */
    public float mo9045m() {
        C1792d dVar = this.f6122i;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f6120g;
        if (f == -2.14748365E9f) {
            return dVar.mo9064f();
        }
        return f;
    }

    /* renamed from: n */
    public float mo9046n() {
        C1792d dVar = this.f6122i;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f6121h;
        if (f == 2.14748365E9f) {
            return dVar.mo9065g();
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo9047o() {
        if (isRunning()) {
            mo9029c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: s */
    private void m7977s() {
        if (this.f6122i != null) {
            float f = this.f6118e;
            if (f < this.f6120g || f > this.f6121h) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f6120g), Float.valueOf(this.f6121h), Float.valueOf(this.f6118e)));
            }
        }
    }

    public float getAnimatedFraction() {
        float m;
        float n;
        float m2;
        if (this.f6122i == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (m7976r()) {
            m = mo9046n() - this.f6118e;
            n = mo9046n();
            m2 = mo9045m();
        } else {
            m = this.f6118e - mo9045m();
            n = mo9046n();
            m2 = mo9045m();
        }
        return m / (n - m2);
    }

    /* renamed from: i */
    public void mo9040i() {
        float f;
        this.f6114a = true;
        mo9004a(m7976r());
        if (m7976r()) {
            f = mo9046n();
        } else {
            f = mo9045m();
        }
        mo9023a((float) ((int) f));
        this.f6117d = 0;
        this.f6119f = 0;
        mo9047o();
    }

    /* renamed from: l */
    public void mo9044l() {
        this.f6114a = true;
        mo9047o();
        this.f6117d = 0;
        if (m7976r() && mo9033e() == mo9045m()) {
            this.f6118e = mo9046n();
        } else if (!m7976r() && mo9033e() == mo9046n()) {
            this.f6118e = mo9045m();
        }
    }

    /* renamed from: c */
    public void mo9028c(float f) {
        this.f6115b = f;
    }

    /* renamed from: b */
    public void mo9027b(float f) {
        mo9024a(this.f6120g, f);
    }

    /* renamed from: a */
    public void mo9025a(int i) {
        mo9024a((float) i, (float) ((int) this.f6121h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9029c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f6114a = false;
        }
    }

    /* renamed from: a */
    public void mo9023a(float f) {
        if (this.f6118e != f) {
            this.f6118e = C1790g.m8008b(f, mo9045m(), mo9046n());
            this.f6117d = 0;
            mo9009c();
        }
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f6116c) {
            this.f6116c = false;
            mo9035g();
        }
    }

    /* renamed from: a */
    public void mo9026a(C1792d dVar) {
        boolean z;
        if (this.f6122i == null) {
            z = true;
        } else {
            z = false;
        }
        this.f6122i = dVar;
        if (z) {
            mo9024a((float) ((int) Math.max(this.f6120g, dVar.mo9064f())), (float) ((int) Math.min(this.f6121h, dVar.mo9065g())));
        } else {
            mo9024a((float) ((int) dVar.mo9064f()), (float) ((int) dVar.mo9065g()));
        }
        float f = this.f6118e;
        this.f6118e = BitmapDescriptorFactory.HUE_RED;
        mo9023a((float) ((int) f));
        mo9009c();
    }

    public void doFrame(long j) {
        float f;
        float f2;
        mo9047o();
        if (this.f6122i != null && isRunning()) {
            C1783c.m7956a("LottieValueAnimator#doFrame");
            long j2 = this.f6117d;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float q = ((float) j3) / m7975q();
            float f3 = this.f6118e;
            if (m7976r()) {
                q = -q;
            }
            float f4 = f3 + q;
            this.f6118e = f4;
            boolean z = !C1790g.m8010c(f4, mo9045m(), mo9046n());
            this.f6118e = C1790g.m8008b(this.f6118e, mo9045m(), mo9046n());
            this.f6117d = j;
            mo9009c();
            if (z) {
                if (getRepeatCount() == -1 || this.f6119f < getRepeatCount()) {
                    mo9003a();
                    this.f6119f++;
                    if (getRepeatMode() == 2) {
                        this.f6116c = !this.f6116c;
                        mo9035g();
                    } else {
                        if (m7976r()) {
                            f = mo9046n();
                        } else {
                            f = mo9045m();
                        }
                        this.f6118e = f;
                    }
                    this.f6117d = j;
                } else {
                    if (this.f6115b < BitmapDescriptorFactory.HUE_RED) {
                        f2 = mo9045m();
                    } else {
                        f2 = mo9046n();
                    }
                    this.f6118e = f2;
                    mo9048p();
                    mo9008b(m7976r());
                }
            }
            m7977s();
            C1783c.m7957b("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: a */
    public void mo9024a(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C1792d dVar = this.f6122i;
            if (dVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = dVar.mo9064f();
            }
            C1792d dVar2 = this.f6122i;
            if (dVar2 == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = dVar2.mo9065g();
            }
            this.f6120g = C1790g.m8008b(f, f3, f4);
            this.f6121h = C1790g.m8008b(f2, f3, f4);
            mo9023a((float) ((int) C1790g.m8008b(this.f6118e, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }
}
