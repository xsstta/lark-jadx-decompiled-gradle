package androidx.constraintlayout.motion.p024a;

import androidx.constraintlayout.motion.widget.AbstractanimationInterpolatorC0582o;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.constraintlayout.motion.a.g */
public class C0535g extends AbstractanimationInterpolatorC0582o {

    /* renamed from: a */
    private float f1969a;

    /* renamed from: b */
    private float f1970b;

    /* renamed from: c */
    private float f1971c;

    /* renamed from: d */
    private float f1972d;

    /* renamed from: e */
    private float f1973e;

    /* renamed from: f */
    private float f1974f;

    /* renamed from: g */
    private float f1975g;

    /* renamed from: h */
    private float f1976h;

    /* renamed from: i */
    private float f1977i;

    /* renamed from: j */
    private int f1978j;

    /* renamed from: k */
    private String f1979k;

    /* renamed from: l */
    private boolean f1980l;

    /* renamed from: m */
    private float f1981m;

    /* renamed from: n */
    private float f1982n;

    @Override // androidx.constraintlayout.motion.widget.AbstractanimationInterpolatorC0582o
    /* renamed from: a */
    public float mo3125a() {
        if (this.f1980l) {
            return -mo3126a(this.f1982n);
        }
        return mo3126a(this.f1982n);
    }

    public float getInterpolation(float f) {
        float b = m2460b(f);
        this.f1982n = f;
        if (this.f1980l) {
            return this.f1981m - b;
        }
        return this.f1981m + b;
    }

    /* renamed from: a */
    public float mo3126a(float f) {
        float f2 = this.f1972d;
        if (f <= f2) {
            float f3 = this.f1969a;
            return f3 + (((this.f1970b - f3) * f) / f2);
        }
        int i = this.f1978j;
        if (i == 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = f - f2;
        float f5 = this.f1973e;
        if (f4 < f5) {
            float f6 = this.f1970b;
            return f6 + (((this.f1971c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f1976h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f1974f;
            if (f7 >= f8) {
                return this.f1977i;
            }
            float f9 = this.f1971c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: b */
    private float m2460b(float f) {
        float f2 = this.f1972d;
        if (f <= f2) {
            float f3 = this.f1969a;
            return (f3 * f) + ((((this.f1970b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f1978j;
        if (i == 1) {
            return this.f1975g;
        }
        float f4 = f - f2;
        float f5 = this.f1973e;
        if (f4 < f5) {
            float f6 = this.f1975g;
            float f7 = this.f1970b;
            return f6 + (f7 * f4) + ((((this.f1971c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f1976h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f1974f;
            if (f8 >= f9) {
                return this.f1977i;
            }
            float f10 = this.f1976h;
            float f11 = this.f1971c;
            return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
        }
    }

    /* renamed from: a */
    private void m2459a(float f, float f2, float f3, float f4, float f5) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0E-4f;
        }
        this.f1969a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f1979k = "backward accelerate, decelerate";
                this.f1978j = 2;
                this.f1969a = f;
                this.f1970b = sqrt;
                this.f1971c = BitmapDescriptorFactory.HUE_RED;
                float f8 = (sqrt - f) / f3;
                this.f1972d = f8;
                this.f1973e = sqrt / f3;
                this.f1975g = ((f + sqrt) * f8) / 2.0f;
                this.f1976h = f2;
                this.f1977i = f2;
                return;
            }
            this.f1979k = "backward accelerate cruse decelerate";
            this.f1978j = 3;
            this.f1969a = f;
            this.f1970b = f4;
            this.f1971c = f4;
            float f9 = (f4 - f) / f3;
            this.f1972d = f9;
            float f10 = f4 / f3;
            this.f1974f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f1973e = ((f2 - f11) - f12) / f4;
            this.f1975g = f11;
            this.f1976h = f2 - f12;
            this.f1977i = f2;
        } else if (f7 >= f2) {
            this.f1979k = "hard stop";
            this.f1978j = 1;
            this.f1969a = f;
            this.f1970b = BitmapDescriptorFactory.HUE_RED;
            this.f1975g = f2;
            this.f1972d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f1979k = "cruse decelerate";
                this.f1978j = 2;
                this.f1969a = f;
                this.f1970b = f;
                this.f1971c = BitmapDescriptorFactory.HUE_RED;
                this.f1975g = f13;
                this.f1976h = f2;
                this.f1972d = f14;
                this.f1973e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f1972d = f15;
            float f16 = sqrt2 / f3;
            this.f1973e = f16;
            if (sqrt2 < f4) {
                this.f1979k = "accelerate decelerate";
                this.f1978j = 2;
                this.f1969a = f;
                this.f1970b = sqrt2;
                this.f1971c = BitmapDescriptorFactory.HUE_RED;
                this.f1972d = f15;
                this.f1973e = f16;
                this.f1975g = ((f + sqrt2) * f15) / 2.0f;
                this.f1976h = f2;
                return;
            }
            this.f1979k = "accelerate cruse decelerate";
            this.f1978j = 3;
            this.f1969a = f;
            this.f1970b = f4;
            this.f1971c = f4;
            float f17 = (f4 - f) / f3;
            this.f1972d = f17;
            float f18 = f4 / f3;
            this.f1974f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f1973e = ((f2 - f19) - f20) / f4;
            this.f1975g = f19;
            this.f1976h = f2 - f20;
            this.f1977i = f2;
        }
    }

    /* renamed from: a */
    public void mo3127a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        this.f1981m = f;
        if (f > f2) {
            z = true;
        } else {
            z = false;
        }
        this.f1980l = z;
        if (z) {
            m2459a(-f3, f - f2, f5, f6, f4);
        } else {
            m2459a(f3, f2 - f, f5, f6, f4);
        }
    }
}
