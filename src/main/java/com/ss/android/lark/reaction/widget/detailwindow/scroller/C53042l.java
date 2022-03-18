package com.ss.android.lark.reaction.widget.detailwindow.scroller;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.l */
public class C53042l {

    /* renamed from: a */
    private static final float[] f131036a = new float[101];

    /* renamed from: b */
    private static float f131037b = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: A */
    private float f131038A;

    /* renamed from: B */
    private float f131039B;

    /* renamed from: c */
    private final Interpolator f131040c;

    /* renamed from: d */
    private final float f131041d;

    /* renamed from: e */
    private int f131042e;

    /* renamed from: f */
    private int f131043f;

    /* renamed from: g */
    private int f131044g;

    /* renamed from: h */
    private int f131045h;

    /* renamed from: i */
    private int f131046i;

    /* renamed from: j */
    private int f131047j;

    /* renamed from: k */
    private int f131048k;

    /* renamed from: l */
    private int f131049l;

    /* renamed from: m */
    private int f131050m;

    /* renamed from: n */
    private int f131051n;

    /* renamed from: o */
    private int f131052o;

    /* renamed from: p */
    private long f131053p;

    /* renamed from: q */
    private int f131054q;

    /* renamed from: r */
    private float f131055r;

    /* renamed from: s */
    private float f131056s;

    /* renamed from: t */
    private float f131057t;

    /* renamed from: u */
    private boolean f131058u = true;

    /* renamed from: v */
    private boolean f131059v;

    /* renamed from: w */
    private float f131060w;

    /* renamed from: x */
    private float f131061x;

    /* renamed from: y */
    private int f131062y;

    /* renamed from: z */
    private float f131063z = ViewConfiguration.getScrollFriction();

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.l$a  reason: invalid class name */
    static class animationInterpolatorC53043a implements Interpolator {

        /* renamed from: a */
        private static final float f131064a;

        /* renamed from: b */
        private static final float f131065b;

        animationInterpolatorC53043a() {
        }

        static {
            float a = 1.0f / m205376a(1.0f);
            f131064a = a;
            f131065b = 1.0f - (a * m205376a(1.0f));
        }

        public float getInterpolation(float f) {
            float a = f131064a * m205376a(f);
            if (a > BitmapDescriptorFactory.HUE_RED) {
                return a + f131065b;
            }
            return a;
        }

        /* renamed from: a */
        private static float m205376a(float f) {
            float f2 = f * 8.0f;
            if (f2 < 1.0f) {
                return f2 - (1.0f - ((float) Math.exp((double) (-f2))));
            }
            return ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
        }
    }

    /* renamed from: a */
    public final int mo181146a() {
        return this.f131052o;
    }

    /* renamed from: c */
    public final int mo181152c() {
        return this.f131046i;
    }

    /* renamed from: e */
    public void mo181154e() {
        this.f131051n = this.f131045h;
        this.f131052o = this.f131046i;
        this.f131058u = true;
    }

    /* renamed from: f */
    public int mo181155f() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.f131053p);
    }

    /* renamed from: b */
    public float mo181150b() {
        if (this.f131042e == 1) {
            return this.f131061x;
        }
        return this.f131060w - ((this.f131038A * ((float) mo181155f())) / 2000.0f);
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < 100; i++) {
            float f7 = ((float) i) / 100.0f;
            float f8 = 1.0f;
            while (true) {
                f = ((f8 - f5) / 2.0f) + f5;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f9 = (((0.175f * f2) + (0.35000002f * f)) * f3) + f4;
                if (((double) Math.abs(f9 - f7)) < 1.0E-5d) {
                    break;
                } else if (f9 > f7) {
                    f8 = f;
                } else {
                    f5 = f;
                }
            }
            f131036a[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f10 = 1.0f;
            while (true) {
                float f11 = ((f10 - f6) / 2.0f) + f6;
                float f12 = 1.0f - f11;
                float f13 = (f11 * 3.0f * f12 * ((f12 * 0.5f) + f11)) + (f11 * f11 * f11);
                if (((double) Math.abs(f13 - f7)) < 1.0E-5d) {
                    break;
                } else if (f13 > f7) {
                    f10 = f11;
                } else {
                    f6 = f11;
                }
            }
        }
        f131036a[100] = 1.0f;
    }

    /* renamed from: d */
    public boolean mo181153d() {
        if (this.f131058u) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f131053p);
        int i = this.f131054q;
        if (currentAnimationTimeMillis < i) {
            int i2 = this.f131042e;
            if (i2 == 0) {
                float interpolation = this.f131040c.getInterpolation(((float) currentAnimationTimeMillis) * this.f131055r);
                this.f131051n = this.f131043f + Math.round(this.f131056s * interpolation);
                this.f131052o = this.f131044g + Math.round(interpolation * this.f131057t);
            } else if (i2 == 1) {
                float f = ((float) currentAnimationTimeMillis) / ((float) i);
                int i3 = (int) (f * 100.0f);
                float f2 = 1.0f;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (i3 < 100) {
                    float f4 = ((float) i3) / 100.0f;
                    int i4 = i3 + 1;
                    float[] fArr = f131036a;
                    float f5 = fArr[i3];
                    f3 = (fArr[i4] - f5) / ((((float) i4) / 100.0f) - f4);
                    f2 = f5 + ((f - f4) * f3);
                }
                this.f131061x = ((f3 * ((float) this.f131062y)) / ((float) i)) * 1000.0f;
                int i5 = this.f131043f;
                int round = i5 + Math.round(((float) (this.f131045h - i5)) * f2);
                this.f131051n = round;
                int min = Math.min(round, this.f131048k);
                this.f131051n = min;
                this.f131051n = Math.max(min, this.f131047j);
                int i6 = this.f131044g;
                int round2 = i6 + Math.round(f2 * ((float) (this.f131046i - i6)));
                this.f131052o = round2;
                int min2 = Math.min(round2, this.f131050m);
                this.f131052o = min2;
                int max = Math.max(min2, this.f131049l);
                this.f131052o = max;
                if (this.f131051n == this.f131045h && max == this.f131046i) {
                    this.f131058u = true;
                }
            }
        } else {
            this.f131051n = this.f131045h;
            this.f131052o = this.f131046i;
            this.f131058u = true;
        }
        return true;
    }

    /* renamed from: c */
    private float m205363c(float f) {
        return this.f131041d * 386.0878f * f;
    }

    /* renamed from: a */
    public final void mo181147a(float f) {
        this.f131038A = m205363c(f);
        this.f131063z = f;
    }

    /* renamed from: d */
    private double m205364d(float f) {
        return Math.log((double) ((Math.abs(f) * 0.35f) / (this.f131063z * this.f131039B)));
    }

    /* renamed from: e */
    private double m205365e(float f) {
        double d = m205364d(f);
        float f2 = f131037b;
        return ((double) (this.f131063z * this.f131039B)) * Math.exp((((double) f2) / (((double) f2) - 1.0d)) * d);
    }

    /* renamed from: a */
    public void mo181148a(int i) {
        this.f131046i = i;
        this.f131057t = (float) (i - this.f131044g);
        this.f131058u = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo181151b(float f) {
        return (int) (Math.exp(m205364d(f) / (((double) f131037b) - 1.0d)) * 1000.0d);
    }

    public C53042l(Context context, Interpolator interpolator, boolean z) {
        if (interpolator == null) {
            this.f131040c = new animationInterpolatorC53043a();
        } else {
            this.f131040c = interpolator;
        }
        this.f131041d = context.getResources().getDisplayMetrics().density * 160.0f;
        this.f131038A = m205363c(ViewConfiguration.getScrollFriction());
        this.f131059v = z;
        this.f131039B = m205363c(0.84f);
    }

    /* renamed from: a */
    public void mo181149a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f;
        if (this.f131059v && !this.f131058u) {
            float b = mo181150b();
            float f2 = (float) (this.f131045h - this.f131043f);
            float f3 = (float) (this.f131046i - this.f131044g);
            float hypot = (float) Math.hypot((double) f2, (double) f3);
            float f4 = (f2 / hypot) * b;
            float f5 = (f3 / hypot) * b;
            float f6 = (float) i3;
            if (Math.signum(f6) == Math.signum(f4)) {
                float f7 = (float) i4;
                if (Math.signum(f7) == Math.signum(f5)) {
                    i3 = (int) (f6 + f4);
                    i4 = (int) (f7 + f5);
                }
            }
        }
        this.f131042e = 1;
        this.f131058u = false;
        float hypot2 = (float) Math.hypot((double) i3, (double) i4);
        this.f131060w = hypot2;
        this.f131054q = mo181151b(hypot2);
        this.f131053p = AnimationUtils.currentAnimationTimeMillis();
        this.f131043f = i;
        this.f131044g = i2;
        float f8 = 1.0f;
        int i9 = (hypot2 > BitmapDescriptorFactory.HUE_RED ? 1 : (hypot2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i9 == 0) {
            f = 1.0f;
        } else {
            f = ((float) i3) / hypot2;
        }
        if (i9 != 0) {
            f8 = ((float) i4) / hypot2;
        }
        double e = m205365e(hypot2);
        this.f131062y = (int) (((double) Math.signum(hypot2)) * e);
        this.f131047j = i5;
        this.f131048k = i6;
        this.f131049l = i7;
        this.f131050m = i8;
        int round = i + ((int) Math.round(((double) f) * e));
        this.f131045h = round;
        int min = Math.min(round, this.f131048k);
        this.f131045h = min;
        this.f131045h = Math.max(min, this.f131047j);
        int round2 = i2 + ((int) Math.round(e * ((double) f8)));
        this.f131046i = round2;
        int min2 = Math.min(round2, this.f131050m);
        this.f131046i = min2;
        this.f131046i = Math.max(min2, this.f131049l);
    }
}
