package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.p024a.C0535g;
import androidx.constraintlayout.motion.widget.C0584q;
import androidx.constraintlayout.solver.widgets.AbstractC0672g;
import androidx.constraintlayout.solver.widgets.C0640a;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0668e;
import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.C0675j;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.AbstractC0910l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MotionLayout extends ConstraintLayout implements AbstractC0910l {

    /* renamed from: a */
    public static boolean f1994a;

    /* renamed from: A */
    float f1995A;

    /* renamed from: B */
    boolean f1996B = false;

    /* renamed from: C */
    protected boolean f1997C = false;

    /* renamed from: D */
    int f1998D;

    /* renamed from: E */
    int f1999E;

    /* renamed from: F */
    int f2000F;

    /* renamed from: G */
    int f2001G;

    /* renamed from: H */
    int f2002H;

    /* renamed from: I */
    int f2003I;

    /* renamed from: J */
    float f2004J;

    /* renamed from: K */
    EnumC0546h f2005K = EnumC0546h.UNDEFINED;

    /* renamed from: L */
    C0541c f2006L = new C0541c();

    /* renamed from: M */
    ArrayList<Integer> f2007M = new ArrayList<>();

    /* renamed from: N */
    private boolean f2008N = true;

    /* renamed from: O */
    private long f2009O = 0;

    /* renamed from: P */
    private float f2010P = 1.0f;

    /* renamed from: Q */
    private long f2011Q;

    /* renamed from: R */
    private boolean f2012R;

    /* renamed from: S */
    private AbstractC0545g f2013S;

    /* renamed from: T */
    private float f2014T;

    /* renamed from: U */
    private float f2015U;

    /* renamed from: V */
    private boolean f2016V = false;

    /* renamed from: W */
    private C0535g f2017W = new C0535g();
    private C0539a aa = new C0539a();
    private C0548b ab;
    private boolean ac = false;
    private ArrayList<MotionHelper> ad = null;
    private ArrayList<MotionHelper> ae = null;
    private ArrayList<AbstractC0545g> af = null;
    private int ag = 0;
    private long ah = -1;

    /* renamed from: ai  reason: collision with root package name */
    private float f175412ai = BitmapDescriptorFactory.HUE_RED;
    private int aj = 0;
    private float ak = BitmapDescriptorFactory.HUE_RED;
    private C0552e al = new C0552e();
    private boolean am = false;
    private C0544f an;
    private boolean ao = false;
    private RectF ap = new RectF();
    private View aq = null;

    /* renamed from: b */
    C0584q f2018b;

    /* renamed from: c */
    Interpolator f2019c;

    /* renamed from: d */
    float f2020d;

    /* renamed from: e */
    public int f2021e = -1;

    /* renamed from: f */
    int f2022f = -1;

    /* renamed from: g */
    public int f2023g = -1;

    /* renamed from: h */
    public int f2024h;

    /* renamed from: i */
    public int f2025i;

    /* renamed from: j */
    HashMap<View, C0581n> f2026j = new HashMap<>();

    /* renamed from: k */
    float f2027k = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: l */
    float f2028l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m */
    float f2029m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n */
    boolean f2030n = false;

    /* renamed from: o */
    boolean f2031o = false;

    /* renamed from: p */
    int f2032p = 0;

    /* renamed from: q */
    C0540b f2033q;

    /* renamed from: r */
    boolean f2034r = true;

    /* renamed from: s */
    int f2035s;

    /* renamed from: t */
    int f2036t;

    /* renamed from: u */
    int f2037u;

    /* renamed from: v */
    int f2038v;

    /* renamed from: w */
    boolean f2039w = false;

    /* renamed from: x */
    float f2040x;

    /* renamed from: y */
    float f2041y;

    /* renamed from: z */
    long f2042z;

    /* access modifiers changed from: protected */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public interface AbstractC0542d {
        /* renamed from: a */
        void mo3219a();

        /* renamed from: a */
        void mo3220a(int i);

        /* renamed from: a */
        void mo3221a(MotionEvent motionEvent);

        /* renamed from: b */
        float mo3222b();

        /* renamed from: c */
        float mo3223c();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public interface AbstractC0545g {
        /* renamed from: a */
        void mo3138a(MotionLayout motionLayout, int i);

        /* renamed from: a */
        void mo3139a(MotionLayout motionLayout, int i, int i2);

        /* renamed from: a */
        void mo3140a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: a */
        void mo3141a(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public enum EnumC0546h {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: a */
    private static boolean m2483a(float f, float f2, float f3) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    private static class C0543e implements AbstractC0542d {

        /* renamed from: b */
        private static C0543e f2078b = new C0543e();

        /* renamed from: a */
        VelocityTracker f2079a;

        private C0543e() {
        }

        /* renamed from: d */
        public static C0543e m2539d() {
            f2078b.f2079a = VelocityTracker.obtain();
            return f2078b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0542d
        /* renamed from: a */
        public void mo3219a() {
            VelocityTracker velocityTracker = this.f2079a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2079a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0542d
        /* renamed from: b */
        public float mo3222b() {
            VelocityTracker velocityTracker = this.f2079a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0542d
        /* renamed from: c */
        public float mo3223c() {
            VelocityTracker velocityTracker = this.f2079a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0542d
        /* renamed from: a */
        public void mo3220a(int i) {
            VelocityTracker velocityTracker = this.f2079a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.AbstractC0542d
        /* renamed from: a */
        public void mo3221a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f2079a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
    }

    public int getCurrentState() {
        return this.f2022f;
    }

    public int getEndState() {
        return this.f2023g;
    }

    public float getProgress() {
        return this.f2028l;
    }

    public int getStartState() {
        return this.f2021e;
    }

    public float getTargetPosition() {
        return this.f2029m;
    }

    public float getVelocity() {
        return this.f2020d;
    }

    /* renamed from: h */
    public boolean mo3177h() {
        return this.f2008N;
    }

    /* renamed from: a */
    public void mo3152a(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.an == null) {
                this.an = new C0544f();
            }
            this.an.mo3230b(i);
            this.an.mo3226a(i2);
            return;
        }
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            this.f2021e = i;
            this.f2023g = i2;
            qVar.mo3309a(i, i2);
            this.f2006L.mo3215a(this.mLayoutWidget, this.f2018b.mo3321c(i), this.f2018b.mo3321c(i2));
            mo3164g();
            this.f2028l = BitmapDescriptorFactory.HUE_RED;
            mo3159c();
        }
    }

    /* renamed from: a */
    public void mo3148a(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.an == null) {
                this.an = new C0544f();
            }
            this.an.mo3225a(f);
            this.an.mo3229b(f2);
            return;
        }
        setProgress(f);
        setState(EnumC0546h.MOVING);
        this.f2020d = f2;
        mo3147a(1.0f);
    }

    /* renamed from: a */
    public void mo3150a(int i, float f, float f2) {
        if (this.f2018b != null && this.f2028l != f) {
            this.f2016V = true;
            this.f2009O = getNanoTime();
            float g = ((float) this.f2018b.mo3327g()) / 1000.0f;
            this.f2010P = g;
            this.f2029m = f;
            this.f2030n = true;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (i == 2) {
                    f = 1.0f;
                }
                this.f2017W.mo3127a(this.f2028l, f, f2, g, this.f2018b.mo3330j(), this.f2018b.mo3331k());
                int i2 = this.f2022f;
                this.f2029m = f;
                this.f2022f = i2;
                this.f2019c = this.f2017W;
            } else if (i == 4) {
                this.aa.mo3206a(f2, this.f2028l, this.f2018b.mo3330j());
                this.f2019c = this.aa;
            } else if (i == 5) {
                if (m2483a(f2, this.f2028l, this.f2018b.mo3330j())) {
                    this.aa.mo3206a(f2, this.f2028l, this.f2018b.mo3330j());
                    this.f2019c = this.aa;
                } else {
                    this.f2017W.mo3127a(this.f2028l, f, f2, this.f2010P, this.f2018b.mo3330j(), this.f2018b.mo3331k());
                    this.f2020d = BitmapDescriptorFactory.HUE_RED;
                    int i3 = this.f2022f;
                    this.f2029m = f;
                    this.f2022f = i3;
                    this.f2019c = this.f2017W;
                }
            }
            this.f2012R = false;
            this.f2009O = getNanoTime();
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo3153a(int i, int i2, int i3) {
        int a;
        C0584q qVar = this.f2018b;
        if (!(qVar == null || qVar.f2294b == null || (a = this.f2018b.f2294b.mo3927a(this.f2022f, i, (float) i2, (float) i3)) == -1)) {
            i = a;
        }
        int i4 = this.f2022f;
        if (i4 != i) {
            if (this.f2021e == i) {
                mo3147a(BitmapDescriptorFactory.HUE_RED);
            } else if (this.f2023g == i) {
                mo3147a(1.0f);
            } else {
                this.f2023g = i;
                if (i4 != -1) {
                    mo3152a(i4, i);
                    mo3147a(1.0f);
                    this.f2028l = BitmapDescriptorFactory.HUE_RED;
                    mo3160d();
                    return;
                }
                this.f2016V = false;
                this.f2029m = 1.0f;
                this.f2027k = BitmapDescriptorFactory.HUE_RED;
                this.f2028l = BitmapDescriptorFactory.HUE_RED;
                this.f2011Q = getNanoTime();
                this.f2009O = getNanoTime();
                this.f2012R = false;
                this.f2019c = null;
                this.f2010P = ((float) this.f2018b.mo3327g()) / 1000.0f;
                this.f2021e = -1;
                this.f2018b.mo3309a(-1, this.f2023g);
                this.f2018b.mo3323d();
                int childCount = getChildCount();
                this.f2026j.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.f2026j.put(childAt, new C0581n(childAt));
                }
                this.f2030n = true;
                this.f2006L.mo3215a(this.mLayoutWidget, null, this.f2018b.mo3321c(i));
                mo3164g();
                this.f2006L.mo3216b();
                m2485i();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0581n nVar = this.f2026j.get(getChildAt(i6));
                    this.f2018b.mo3313a(nVar);
                    nVar.mo3275a(width, height, this.f2010P, getNanoTime());
                }
                float i7 = this.f2018b.mo3329i();
                if (i7 != BitmapDescriptorFactory.HUE_RED) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C0581n nVar2 = this.f2026j.get(getChildAt(i8));
                        float b = nVar2.mo3282b() + nVar2.mo3269a();
                        f = Math.min(f, b);
                        f2 = Math.max(f2, b);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C0581n nVar3 = this.f2026j.get(getChildAt(i9));
                        float a2 = nVar3.mo3269a();
                        float b2 = nVar3.mo3282b();
                        nVar3.f2256f = 1.0f / (1.0f - i7);
                        nVar3.f2255e = i7 - ((((a2 + b2) - f) * i7) / (f2 - f));
                    }
                }
                this.f2027k = BitmapDescriptorFactory.HUE_RED;
                this.f2028l = BitmapDescriptorFactory.HUE_RED;
                this.f2030n = true;
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public void mo3155a(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f2020d;
        float f5 = this.f2028l;
        if (this.f2019c != null) {
            float signum = Math.signum(this.f2029m - f5);
            float interpolation = this.f2019c.getInterpolation(this.f2028l + 1.0E-5f);
            float interpolation2 = this.f2019c.getInterpolation(this.f2028l);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f2010P;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f2019c;
        if (interpolator instanceof AbstractanimationInterpolatorC0582o) {
            f4 = ((AbstractanimationInterpolatorC0582o) interpolator).mo3125a();
        }
        C0581n nVar = this.f2026j.get(view);
        if ((i & 1) == 0) {
            nVar.mo3273a(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            nVar.mo3272a(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    @Override // androidx.core.view.AbstractC0910l
    /* renamed from: a */
    public void mo1702a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f2039w && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f2039w = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3156a(boolean z) {
        float f;
        boolean z2;
        int i;
        int i2;
        float f2;
        if (this.f2011Q == -1) {
            this.f2011Q = getNanoTime();
        }
        float f3 = this.f2028l;
        if (f3 > BitmapDescriptorFactory.HUE_RED && f3 < 1.0f) {
            this.f2022f = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.ac || (this.f2030n && (z || this.f2029m != f3))) {
            float signum = Math.signum(this.f2029m - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f2019c;
            if (!(interpolator instanceof AbstractanimationInterpolatorC0582o)) {
                f = ((((float) (nanoTime - this.f2011Q)) * signum) * 1.0E-9f) / this.f2010P;
                this.f2020d = f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = this.f2028l + f;
            if (this.f2012R) {
                f4 = this.f2029m;
            }
            int i3 = (signum > BitmapDescriptorFactory.HUE_RED ? 1 : (signum == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if ((i3 <= 0 || f4 < this.f2029m) && (signum > BitmapDescriptorFactory.HUE_RED || f4 > this.f2029m)) {
                z2 = false;
            } else {
                f4 = this.f2029m;
                this.f2030n = false;
                z2 = true;
            }
            this.f2028l = f4;
            this.f2027k = f4;
            this.f2011Q = nanoTime;
            if (interpolator != null && !z2) {
                if (this.f2016V) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.f2009O)) * 1.0E-9f);
                    this.f2028l = f2;
                    this.f2011Q = nanoTime;
                    Interpolator interpolator2 = this.f2019c;
                    if (interpolator2 instanceof AbstractanimationInterpolatorC0582o) {
                        float a = ((AbstractanimationInterpolatorC0582o) interpolator2).mo3125a();
                        this.f2020d = a;
                        if (Math.abs(a) * this.f2010P <= 1.0E-5f) {
                            this.f2030n = false;
                        }
                        if (a > BitmapDescriptorFactory.HUE_RED && f2 >= 1.0f) {
                            this.f2028l = 1.0f;
                            this.f2030n = false;
                            f2 = 1.0f;
                        }
                        if (a < BitmapDescriptorFactory.HUE_RED && f2 <= BitmapDescriptorFactory.HUE_RED) {
                            this.f2028l = BitmapDescriptorFactory.HUE_RED;
                            this.f2030n = false;
                            f4 = BitmapDescriptorFactory.HUE_RED;
                        }
                    }
                } else {
                    f2 = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.f2019c;
                    if (interpolator3 instanceof AbstractanimationInterpolatorC0582o) {
                        this.f2020d = ((AbstractanimationInterpolatorC0582o) interpolator3).mo3125a();
                    } else {
                        this.f2020d = ((interpolator3.getInterpolation(f4 + f) - f2) * signum) / f;
                    }
                }
                f4 = f2;
            }
            if (Math.abs(this.f2020d) > 1.0E-5f) {
                setState(EnumC0546h.MOVING);
            }
            if ((i3 > 0 && f4 >= this.f2029m) || (signum <= BitmapDescriptorFactory.HUE_RED && f4 <= this.f2029m)) {
                f4 = this.f2029m;
                this.f2030n = false;
            }
            int i4 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            if (i4 >= 0 || f4 <= BitmapDescriptorFactory.HUE_RED) {
                this.f2030n = false;
                setState(EnumC0546h.FINISHED);
            }
            int childCount = getChildCount();
            this.ac = false;
            long nanoTime2 = getNanoTime();
            this.f2004J = f4;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C0581n nVar = this.f2026j.get(childAt);
                if (nVar != null) {
                    this.ac = nVar.mo3281a(childAt, f4, nanoTime2, this.al) | this.ac;
                }
            }
            boolean z5 = (i3 > 0 && f4 >= this.f2029m) || (signum <= BitmapDescriptorFactory.HUE_RED && f4 <= this.f2029m);
            if (!this.ac && !this.f2030n && z5) {
                setState(EnumC0546h.FINISHED);
            }
            if (this.f1997C) {
                requestLayout();
            }
            this.ac = (!z5) | this.ac;
            if (!(f4 > BitmapDescriptorFactory.HUE_RED || (i2 = this.f2021e) == -1 || this.f2022f == i2)) {
                this.f2022f = i2;
                this.f2018b.mo3321c(i2).mo3908d(this);
                setState(EnumC0546h.FINISHED);
                z4 = true;
            }
            if (((double) f4) >= 1.0d && this.f2022f != (i = this.f2023g)) {
                this.f2022f = i;
                this.f2018b.mo3321c(i).mo3908d(this);
                setState(EnumC0546h.FINISHED);
                z4 = true;
            }
            if (this.ac || this.f2030n) {
                invalidate();
            } else if ((i3 > 0 && i4 == 0) || (signum < BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED)) {
                setState(EnumC0546h.FINISHED);
            }
            if ((!this.ac && this.f2030n && i3 > 0 && i4 == 0) || (signum < BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED)) {
                mo3162e();
            }
        }
        float f5 = this.f2028l;
        if (f5 >= 1.0f) {
            int i6 = this.f2022f;
            int i7 = this.f2023g;
            if (i6 == i7) {
                z3 = z4;
            }
            this.f2022f = i7;
        } else {
            if (f5 <= BitmapDescriptorFactory.HUE_RED) {
                int i8 = this.f2022f;
                int i9 = this.f2021e;
                if (i8 == i9) {
                    z3 = z4;
                }
                this.f2022f = i9;
            }
            this.ao |= z4;
            if (z4 && !this.am) {
                requestLayout();
            }
            this.f2027k = this.f2028l;
        }
        z4 = z3;
        this.ao |= z4;
        requestLayout();
        this.f2027k = this.f2028l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3151a(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C0581n> hashMap = this.f2026j;
        View viewById = getViewById(i);
        C0581n nVar = hashMap.get(viewById);
        if (nVar != null) {
            nVar.mo3272a(f, f2, f3, fArr);
            float y = viewById.getY();
            int i2 = ((f - this.f2014T) > BitmapDescriptorFactory.HUE_RED ? 1 : ((f - this.f2014T) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            this.f2014T = f;
            this.f2015U = y;
            return;
        }
        if (viewById == null) {
            str = "" + i;
        } else {
            str = viewById.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    /* renamed from: a */
    public void mo3154a(int i, boolean z, float f) {
        AbstractC0545g gVar = this.f2013S;
        if (gVar != null) {
            gVar.mo3141a(this, i, z, f);
        }
        ArrayList<AbstractC0545g> arrayList = this.af;
        if (arrayList != null) {
            Iterator<AbstractC0545g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3141a(this, i, z, f);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class C0539a extends AbstractanimationInterpolatorC0582o {

        /* renamed from: a */
        float f2046a;

        /* renamed from: b */
        float f2047b;

        /* renamed from: c */
        float f2048c;

        @Override // androidx.constraintlayout.motion.widget.AbstractanimationInterpolatorC0582o
        /* renamed from: a */
        public float mo3125a() {
            return MotionLayout.this.f2020d;
        }

        C0539a() {
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f2046a;
            if (f4 > BitmapDescriptorFactory.HUE_RED) {
                float f5 = this.f2048c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f2020d = f4 - (f5 * f);
                f2 = (this.f2046a * f) - (((this.f2048c * f) * f) / 2.0f);
                f3 = this.f2047b;
            } else {
                float f6 = this.f2048c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f2020d = f4 + (f6 * f);
                f2 = (this.f2046a * f) + (((this.f2048c * f) * f) / 2.0f);
                f3 = this.f2047b;
            }
            return f2 + f3;
        }

        /* renamed from: a */
        public void mo3206a(float f, float f2, float f3) {
            this.f2046a = f;
            this.f2047b = f2;
            this.f2048c = f3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC0542d mo3146a() {
        return C0543e.m2539d();
    }

    /* renamed from: c */
    public void mo3159c() {
        mo3147a(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: d */
    public void mo3160d() {
        mo3147a(1.0f);
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    /* renamed from: g */
    public void mo3164g() {
        this.f2006L.mo3212a();
        invalidate();
    }

    public int[] getConstraintSetIds() {
        C0584q qVar = this.f2018b;
        if (qVar == null) {
            return null;
        }
        return qVar.mo3319b();
    }

    public ArrayList<C0584q.C0586a> getDefinedTransitions() {
        C0584q qVar = this.f2018b;
        if (qVar == null) {
            return null;
        }
        return qVar.mo3306a();
    }

    public C0548b getDesignTool() {
        if (this.ab == null) {
            this.ab = new C0548b(this);
        }
        return this.ab;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public class C0541c {

        /* renamed from: a */
        C0667d f2071a = new C0667d();

        /* renamed from: b */
        C0667d f2072b = new C0667d();

        /* renamed from: c */
        C0689b f2073c = null;

        /* renamed from: d */
        C0689b f2074d = null;

        /* renamed from: e */
        int f2075e;

        /* renamed from: f */
        int f2076f;

        /* renamed from: a */
        public void mo3212a() {
            mo3213a(MotionLayout.this.f2024h, MotionLayout.this.f2025i);
            MotionLayout.this.mo3158b();
        }

        /* renamed from: b */
        public void mo3216b() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f2026j.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.f2026j.put(childAt, new C0581n(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C0581n nVar = MotionLayout.this.f2026j.get(childAt2);
                if (nVar != null) {
                    if (this.f2073c != null) {
                        ConstraintWidget a = mo3211a(this.f2071a, childAt2);
                        if (a != null) {
                            nVar.mo3278a(a, this.f2073c);
                        } else if (MotionLayout.this.f2032p != 0) {
                            Log.e("MotionLayout", C0547a.m2557a() + "no widget for  " + C0547a.m2559a(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f2074d != null) {
                        ConstraintWidget a2 = mo3211a(this.f2072b, childAt2);
                        if (a2 != null) {
                            nVar.mo3285b(a2, this.f2074d);
                        } else if (MotionLayout.this.f2032p != 0) {
                            Log.e("MotionLayout", C0547a.m2557a() + "no widget for  " + C0547a.m2559a(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        C0541c() {
        }

        /* renamed from: b */
        public void mo3217b(int i, int i2) {
            this.f2075e = i;
            this.f2076f = i2;
        }

        /* renamed from: c */
        public boolean mo3218c(int i, int i2) {
            if (i == this.f2075e && i2 == this.f2076f) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ConstraintWidget mo3211a(C0667d dVar, View view) {
            if (dVar.mo3511M() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> ac = dVar.ac();
            int size = ac.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = ac.get(i);
                if (constraintWidget.mo3511M() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3214a(C0667d dVar, C0667d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> ac = dVar.ac();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.ac().clear();
            dVar2.mo3536a(dVar, hashMap);
            Iterator<ConstraintWidget> it = ac.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof C0640a) {
                    constraintWidget = new C0640a();
                } else if (next instanceof C0670f) {
                    constraintWidget = new C0670f();
                } else if (next instanceof C0668e) {
                    constraintWidget = new C0668e();
                } else if (next instanceof AbstractC0672g) {
                    constraintWidget = new C0673h();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.mo3747b(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = ac.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).mo3536a(next2, hashMap);
            }
        }

        /* renamed from: a */
        private void m2525a(C0667d dVar, C0689b bVar) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            Iterator<ConstraintWidget> it = dVar.ac().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.mo3511M()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.ac().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.mo3511M();
                bVar.mo3886a(view.getId(), layoutParams);
                next2.mo3579o(bVar.mo3909e(view.getId()));
                next2.mo3581p(bVar.mo3906d(view.getId()));
                if (view instanceof ConstraintHelper) {
                    bVar.mo3890a((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo3801c();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (bVar.mo3897b(view.getId()) == 1) {
                    next2.mo3570j(view.getVisibility());
                } else {
                    next2.mo3570j(bVar.mo3903c(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.ac().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof C0675j) {
                    AbstractC0672g gVar = (AbstractC0672g) next3;
                    ((ConstraintHelper) next3.mo3511M()).mo3800a(dVar, gVar, sparseArray);
                    ((C0675j) gVar).mo3744i();
                }
            }
        }

        /* renamed from: a */
        public void mo3213a(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout.this.f2002H = mode;
            MotionLayout.this.f2003I = mode2;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            if (MotionLayout.this.f2022f == MotionLayout.this.getStartState()) {
                MotionLayout.this.resolveSystem(this.f2072b, optimizationLevel, i, i2);
                if (this.f2073c != null) {
                    MotionLayout.this.resolveSystem(this.f2071a, optimizationLevel, i, i2);
                }
            } else {
                if (this.f2073c != null) {
                    MotionLayout.this.resolveSystem(this.f2071a, optimizationLevel, i, i2);
                }
                MotionLayout.this.resolveSystem(this.f2072b, optimizationLevel, i, i2);
            }
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                MotionLayout.this.f2002H = mode;
                MotionLayout.this.f2003I = mode2;
                if (MotionLayout.this.f2022f == MotionLayout.this.getStartState()) {
                    MotionLayout.this.resolveSystem(this.f2072b, optimizationLevel, i, i2);
                    if (this.f2073c != null) {
                        MotionLayout.this.resolveSystem(this.f2071a, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.f2073c != null) {
                        MotionLayout.this.resolveSystem(this.f2071a, optimizationLevel, i, i2);
                    }
                    MotionLayout.this.resolveSystem(this.f2072b, optimizationLevel, i, i2);
                }
                MotionLayout.this.f1998D = this.f2071a.mo3499A();
                MotionLayout.this.f1999E = this.f2071a.mo3500B();
                MotionLayout.this.f2000F = this.f2072b.mo3499A();
                MotionLayout.this.f2001G = this.f2072b.mo3500B();
                MotionLayout motionLayout = MotionLayout.this;
                if (motionLayout.f1998D == MotionLayout.this.f2000F && MotionLayout.this.f1999E == MotionLayout.this.f2001G) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                motionLayout.f1997C = z4;
            }
            int i3 = MotionLayout.this.f1998D;
            int i4 = MotionLayout.this.f1999E;
            if (MotionLayout.this.f2002H == Integer.MIN_VALUE || MotionLayout.this.f2002H == 0) {
                i3 = (int) (((float) MotionLayout.this.f1998D) + (MotionLayout.this.f2004J * ((float) (MotionLayout.this.f2000F - MotionLayout.this.f1998D))));
            }
            if (MotionLayout.this.f2003I == Integer.MIN_VALUE || MotionLayout.this.f2003I == 0) {
                i4 = (int) (((float) MotionLayout.this.f1999E) + (MotionLayout.this.f2004J * ((float) (MotionLayout.this.f2001G - MotionLayout.this.f1999E))));
            }
            if (this.f2071a.mo3683i() || this.f2072b.mo3683i()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f2071a.mo3659X() || this.f2072b.mo3659X()) {
                z3 = true;
            } else {
                z3 = false;
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i3, i4, z2, z3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3215a(C0667d dVar, C0689b bVar, C0689b bVar2) {
            this.f2073c = bVar;
            this.f2074d = bVar2;
            this.f2071a = new C0667d();
            this.f2072b = new C0667d();
            this.f2071a.mo3667a(MotionLayout.this.mLayoutWidget.mo3680g());
            this.f2072b.mo3667a(MotionLayout.this.mLayoutWidget.mo3680g());
            this.f2071a.ad();
            this.f2072b.ad();
            mo3214a(MotionLayout.this.mLayoutWidget, this.f2071a);
            mo3214a(MotionLayout.this.mLayoutWidget, this.f2072b);
            if (((double) MotionLayout.this.f2028l) > 0.5d) {
                if (bVar != null) {
                    m2525a(this.f2071a, bVar);
                }
                m2525a(this.f2072b, bVar2);
            } else {
                m2525a(this.f2072b, bVar2);
                if (bVar != null) {
                    m2525a(this.f2071a, bVar);
                }
            }
            this.f2071a.mo3681g(MotionLayout.this.isRtl());
            this.f2071a.mo3678f();
            this.f2072b.mo3681g(MotionLayout.this.isRtl());
            this.f2072b.mo3678f();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.f2071a.mo3534a(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.f2072b.mo3534a(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.f2071a.mo3548b(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.f2072b.mo3548b(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C0544f {

        /* renamed from: a */
        float f2080a = Float.NaN;

        /* renamed from: b */
        float f2081b = Float.NaN;

        /* renamed from: c */
        int f2082c = -1;

        /* renamed from: d */
        int f2083d = -1;

        /* renamed from: e */
        final String f2084e = "motion.progress";

        /* renamed from: f */
        final String f2085f = "motion.velocity";

        /* renamed from: g */
        final String f2086g = "motion.StartState";

        /* renamed from: h */
        final String f2087h = "motion.EndState";

        /* renamed from: c */
        public void mo3231c() {
            this.f2083d = MotionLayout.this.f2023g;
            this.f2082c = MotionLayout.this.f2021e;
            this.f2081b = MotionLayout.this.getVelocity();
            this.f2080a = MotionLayout.this.getProgress();
        }

        /* renamed from: b */
        public Bundle mo3228b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2080a);
            bundle.putFloat("motion.velocity", this.f2081b);
            bundle.putInt("motion.StartState", this.f2082c);
            bundle.putInt("motion.EndState", this.f2083d);
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3224a() {
            int i = this.f2082c;
            if (!(i == -1 && this.f2083d == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo3149a(this.f2083d);
                } else {
                    int i2 = this.f2083d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.mo3152a(i, i2);
                    }
                }
                MotionLayout.this.setState(EnumC0546h.SETUP);
            }
            if (!Float.isNaN(this.f2081b)) {
                MotionLayout.this.mo3148a(this.f2080a, this.f2081b);
                this.f2080a = Float.NaN;
                this.f2081b = Float.NaN;
                this.f2082c = -1;
                this.f2083d = -1;
            } else if (!Float.isNaN(this.f2080a)) {
                MotionLayout.this.setProgress(this.f2080a);
            }
        }

        /* renamed from: a */
        public void mo3225a(float f) {
            this.f2080a = f;
        }

        /* renamed from: b */
        public void mo3229b(float f) {
            this.f2081b = f;
        }

        /* renamed from: a */
        public void mo3226a(int i) {
            this.f2083d = i;
        }

        /* renamed from: b */
        public void mo3230b(int i) {
            this.f2082c = i;
        }

        C0544f() {
        }

        /* renamed from: a */
        public void mo3227a(Bundle bundle) {
            this.f2080a = bundle.getFloat("motion.progress");
            this.f2081b = bundle.getFloat("motion.velocity");
            this.f2082c = bundle.getInt("motion.StartState");
            this.f2083d = bundle.getInt("motion.EndState");
        }
    }

    /* renamed from: i */
    private void m2485i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0581n nVar = this.f2026j.get(childAt);
            if (nVar != null) {
                nVar.mo3284b(childAt);
            }
        }
    }

    public Bundle getTransitionState() {
        if (this.an == null) {
            this.an = new C0544f();
        }
        this.an.mo3231c();
        return this.an.mo3228b();
    }

    public long getTransitionTimeMs() {
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            this.f2010P = ((float) qVar.mo3327g()) / 1000.0f;
        }
        return (long) (this.f2010P * 1000.0f);
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        if (getWindowToken() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void requestLayout() {
        C0584q qVar;
        if (this.f1997C || this.f2022f != -1 || (qVar = this.f2018b) == null || qVar.f2295c == null || this.f2018b.f2295c.mo3335a() != 0) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2 */
    public static /* synthetic */ class C05382 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$h[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0546h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.motion.widget.MotionLayout.C05382.f2045a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$h r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0546h.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C05382.f2045a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$h r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0546h.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C05382.f2045a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$h r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0546h.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C05382.f2045a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$h r1 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0546h.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C05382.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3162e() {
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            if (qVar.mo3318b(this, this.f2022f)) {
                requestLayout();
                return;
            }
            int i = this.f2022f;
            if (i != -1) {
                this.f2018b.mo3312a(this, i);
            }
            if (this.f2018b.mo3322c()) {
                this.f2018b.mo3332l();
            }
        }
    }

    public String toString() {
        Context context = getContext();
        return C0547a.m2558a(context, this.f2021e) + "->" + C0547a.m2558a(context, this.f2023g) + " (pos:" + this.f2028l + " Dpos/Dt:" + this.f2020d;
    }

    /* renamed from: l */
    private void m2488l() {
        ArrayList<AbstractC0545g> arrayList;
        if ((this.f2013S != null || ((arrayList = this.af) != null && !arrayList.isEmpty())) && this.ak != this.f2027k) {
            if (this.aj != -1) {
                AbstractC0545g gVar = this.f2013S;
                if (gVar != null) {
                    gVar.mo3139a(this, this.f2021e, this.f2023g);
                }
                ArrayList<AbstractC0545g> arrayList2 = this.af;
                if (arrayList2 != null) {
                    Iterator<AbstractC0545g> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo3139a(this, this.f2021e, this.f2023g);
                    }
                }
                this.f1996B = true;
            }
            this.aj = -1;
            float f = this.f2027k;
            this.ak = f;
            AbstractC0545g gVar2 = this.f2013S;
            if (gVar2 != null) {
                gVar2.mo3140a(this, this.f2021e, this.f2023g, f);
            }
            ArrayList<AbstractC0545g> arrayList3 = this.af;
            if (arrayList3 != null) {
                Iterator<AbstractC0545g> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo3140a(this, this.f2021e, this.f2023g, this.f2027k);
                }
            }
            this.f1996B = true;
        }
    }

    /* renamed from: m */
    private void m2489m() {
        ArrayList<AbstractC0545g> arrayList;
        if (this.f2013S != null || ((arrayList = this.af) != null && !arrayList.isEmpty())) {
            this.f1996B = false;
            Iterator<Integer> it = this.f2007M.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                AbstractC0545g gVar = this.f2013S;
                if (gVar != null) {
                    gVar.mo3138a(this, next.intValue());
                }
                ArrayList<AbstractC0545g> arrayList2 = this.af;
                if (arrayList2 != null) {
                    Iterator<AbstractC0545g> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo3138a(this, next.intValue());
                    }
                }
            }
            this.f2007M.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3163f() {
        int i;
        ArrayList<AbstractC0545g> arrayList;
        if ((this.f2013S != null || ((arrayList = this.af) != null && !arrayList.isEmpty())) && this.aj == -1) {
            this.aj = this.f2022f;
            if (!this.f2007M.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.f2007M;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f2022f;
            if (!(i == i2 || i2 == -1)) {
                this.f2007M.add(Integer.valueOf(i2));
            }
        }
        m2489m();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        C0584q qVar = this.f2018b;
        if (!(qVar == null || (i = this.f2022f) == -1)) {
            C0689b c = qVar.mo3321c(i);
            this.f2018b.mo3311a(this);
            if (c != null) {
                c.mo3905c(this);
            }
            this.f2021e = this.f2022f;
        }
        mo3162e();
        C0544f fVar = this.an;
        if (fVar != null) {
            fVar.mo3224a();
            return;
        }
        C0584q qVar2 = this.f2018b;
        if (qVar2 != null && qVar2.f2295c != null && this.f2018b.f2295c.mo3339b() == 4) {
            mo3160d();
            setState(EnumC0546h.SETUP);
            setState(EnumC0546h.MOVING);
        }
    }

    /* renamed from: j */
    private void m2486j() {
        float f;
        boolean z;
        float signum = Math.signum(this.f2029m - this.f2028l);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f2019c;
        if (!(interpolator instanceof C0535g)) {
            f = ((((float) (nanoTime - this.f2011Q)) * signum) * 1.0E-9f) / this.f2010P;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        float f2 = this.f2028l + f;
        if (this.f2012R) {
            f2 = this.f2029m;
        }
        int i = (signum > BitmapDescriptorFactory.HUE_RED ? 1 : (signum == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if ((i <= 0 || f2 < this.f2029m) && (signum > BitmapDescriptorFactory.HUE_RED || f2 > this.f2029m)) {
            z = false;
        } else {
            f2 = this.f2029m;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.f2016V) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.f2009O)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.f2029m) || (signum <= BitmapDescriptorFactory.HUE_RED && f2 <= this.f2029m)) {
            f2 = this.f2029m;
        }
        this.f2004J = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0581n nVar = this.f2026j.get(childAt);
            if (nVar != null) {
                nVar.mo3281a(childAt, f2, nanoTime2, this.al);
            }
        }
        if (this.f1997C) {
            requestLayout();
        }
    }

    /* renamed from: k */
    private void m2487k() {
        C0584q qVar = this.f2018b;
        if (qVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int d = qVar.mo3323d();
        C0584q qVar2 = this.f2018b;
        m2480a(d, qVar2.mo3321c(qVar2.mo3323d()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C0584q.C0586a> it = this.f2018b.mo3306a().iterator();
        while (it.hasNext()) {
            C0584q.C0586a next = it.next();
            if (next == this.f2018b.f2295c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            m2482a(next);
            int d2 = next.mo3342d();
            int c = next.mo3341c();
            String a = C0547a.m2558a(getContext(), d2);
            String a2 = C0547a.m2558a(getContext(), c);
            if (sparseIntArray.get(d2) == c) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + a + "->" + a2);
            }
            if (sparseIntArray2.get(c) == d2) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + a + "->" + a2);
            }
            sparseIntArray.put(d2, c);
            sparseIntArray2.put(c, d2);
            if (this.f2018b.mo3321c(d2) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + a);
            }
            if (this.f2018b.mo3321c(c) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + a);
            }
        }
    }

    /* renamed from: b */
    public void mo3158b() {
        boolean z;
        float f;
        float f2;
        int childCount = getChildCount();
        this.f2006L.mo3216b();
        boolean z2 = true;
        this.f2030n = true;
        int width = getWidth();
        int height = getHeight();
        int h = this.f2018b.mo3328h();
        int i = 0;
        if (h != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                C0581n nVar = this.f2026j.get(getChildAt(i2));
                if (nVar != null) {
                    nVar.mo3283b(h);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0581n nVar2 = this.f2026j.get(getChildAt(i3));
            if (nVar2 != null) {
                this.f2018b.mo3313a(nVar2);
                nVar2.mo3275a(width, height, this.f2010P, getNanoTime());
            }
        }
        float i4 = this.f2018b.mo3329i();
        if (i4 != BitmapDescriptorFactory.HUE_RED) {
            if (((double) i4) < 0.0d) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(i4);
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i5 = 0;
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            while (true) {
                if (i5 >= childCount) {
                    z2 = false;
                    break;
                }
                C0581n nVar3 = this.f2026j.get(getChildAt(i5));
                if (!Float.isNaN(nVar3.f2254d)) {
                    break;
                }
                float a = nVar3.mo3269a();
                float b = nVar3.mo3282b();
                if (z) {
                    f2 = b - a;
                } else {
                    f2 = b + a;
                }
                f5 = Math.min(f5, f2);
                f6 = Math.max(f6, f2);
                i5++;
            }
            if (z2) {
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0581n nVar4 = this.f2026j.get(getChildAt(i6));
                    if (!Float.isNaN(nVar4.f2254d)) {
                        f4 = Math.min(f4, nVar4.f2254d);
                        f3 = Math.max(f3, nVar4.f2254d);
                    }
                }
                while (i < childCount) {
                    C0581n nVar5 = this.f2026j.get(getChildAt(i));
                    if (!Float.isNaN(nVar5.f2254d)) {
                        nVar5.f2256f = 1.0f / (1.0f - abs);
                        if (z) {
                            nVar5.f2255e = abs - (((f3 - nVar5.f2254d) / (f3 - f4)) * abs);
                        } else {
                            nVar5.f2255e = abs - (((nVar5.f2254d - f4) * abs) / (f3 - f4));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C0581n nVar6 = this.f2026j.get(getChildAt(i));
                float a2 = nVar6.mo3269a();
                float b2 = nVar6.mo3282b();
                if (z) {
                    f = b2 - a2;
                } else {
                    f = b2 + a2;
                }
                nVar6.f2256f = 1.0f / (1.0f - abs);
                nVar6.f2255e = abs - (((f - f5) * abs) / (f6 - f5));
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    public void setInteractionEnabled(boolean z) {
        this.f2008N = z;
    }

    public void setTransitionListener(AbstractC0545g gVar) {
        this.f2013S = gVar;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    private class C0540b {

        /* renamed from: a */
        float[] f2050a;

        /* renamed from: b */
        int[] f2051b;

        /* renamed from: c */
        float[] f2052c;

        /* renamed from: d */
        Path f2053d;

        /* renamed from: e */
        Paint f2054e;

        /* renamed from: f */
        Paint f2055f;

        /* renamed from: g */
        Paint f2056g;

        /* renamed from: h */
        Paint f2057h;

        /* renamed from: i */
        Paint f2058i;

        /* renamed from: j */
        final int f2059j = -21965;

        /* renamed from: k */
        final int f2060k = -2067046;

        /* renamed from: l */
        final int f2061l = -13391360;

        /* renamed from: m */
        final int f2062m = 1996488704;

        /* renamed from: n */
        final int f2063n = 10;

        /* renamed from: o */
        DashPathEffect f2064o;

        /* renamed from: p */
        int f2065p;

        /* renamed from: q */
        Rect f2066q = new Rect();

        /* renamed from: r */
        boolean f2067r = false;

        /* renamed from: s */
        int f2068s = 1;

        /* renamed from: u */
        private float[] f2070u;

        /* renamed from: a */
        private void m2512a(Canvas canvas) {
            canvas.drawLines(this.f2050a, this.f2054e);
        }

        /* renamed from: b */
        private void m2517b(Canvas canvas) {
            float[] fArr = this.f2050a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2056g);
        }

        /* renamed from: c */
        private void m2520c(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f2065p; i++) {
                int[] iArr = this.f2051b;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                m2517b(canvas);
            }
            if (z2) {
                m2521d(canvas);
            }
        }

        /* renamed from: d */
        private void m2521d(Canvas canvas) {
            float[] fArr = this.f2050a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f2056g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f2056g);
        }

        public C0540b() {
            Paint paint = new Paint();
            this.f2054e = paint;
            paint.setAntiAlias(true);
            this.f2054e.setColor(-21965);
            this.f2054e.setStrokeWidth(2.0f);
            this.f2054e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2055f = paint2;
            paint2.setAntiAlias(true);
            this.f2055f.setColor(-2067046);
            this.f2055f.setStrokeWidth(2.0f);
            this.f2055f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2056g = paint3;
            paint3.setAntiAlias(true);
            this.f2056g.setColor(-13391360);
            this.f2056g.setStrokeWidth(2.0f);
            this.f2056g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2057h = paint4;
            paint4.setAntiAlias(true);
            this.f2057h.setColor(-13391360);
            this.f2057h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2070u = new float[8];
            Paint paint5 = new Paint();
            this.f2058i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED);
            this.f2064o = dashPathEffect;
            this.f2056g.setPathEffect(dashPathEffect);
            this.f2052c = new float[100];
            this.f2051b = new int[50];
            if (this.f2067r) {
                this.f2054e.setStrokeWidth(8.0f);
                this.f2058i.setStrokeWidth(8.0f);
                this.f2055f.setStrokeWidth(8.0f);
                this.f2068s = 4;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3210a(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f2066q);
        }

        /* renamed from: a */
        private void m2516a(Canvas canvas, C0581n nVar) {
            this.f2053d.reset();
            for (int i = 0; i <= 50; i++) {
                nVar.mo3274a(((float) i) / ((float) 50), this.f2070u, 0);
                Path path = this.f2053d;
                float[] fArr = this.f2070u;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2053d;
                float[] fArr2 = this.f2070u;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2053d;
                float[] fArr3 = this.f2070u;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2053d;
                float[] fArr4 = this.f2070u;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2053d.close();
            }
            this.f2054e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2053d, this.f2054e);
            canvas.translate(-2.0f, -2.0f);
            this.f2054e.setColor(-65536);
            canvas.drawPath(this.f2053d, this.f2054e);
        }

        /* renamed from: a */
        private void m2513a(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2050a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            mo3210a(str, this.f2057h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f2066q.width() / 2)), -20.0f, this.f2057h);
            canvas.drawLine(f, f2, f10, f11, this.f2056g);
        }

        /* renamed from: b */
        private void m2518b(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2050a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            mo3210a(str, this.f2057h);
            canvas.drawText(str, ((min2 / 2.0f) - ((float) (this.f2066q.width() / 2))) + min, f2 - 20.0f, this.f2057h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f2056g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            mo3210a(str2, this.f2057h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f2066q.height() / 2))), this.f2057h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f2056g);
        }

        /* renamed from: a */
        public void mo3208a(Canvas canvas, int i, int i2, C0581n nVar) {
            if (i == 4) {
                m2520c(canvas);
            }
            if (i == 2) {
                m2517b(canvas);
            }
            if (i == 3) {
                m2521d(canvas);
            }
            m2512a(canvas);
            m2519b(canvas, i, i2, nVar);
        }

        /* renamed from: b */
        private void m2519b(Canvas canvas, int i, int i2, C0581n nVar) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            if (nVar.f2251a != null) {
                i4 = nVar.f2251a.getWidth();
                i3 = nVar.f2251a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i != 4 || this.f2051b[i6 - 1] != 0) {
                    float[] fArr = this.f2052c;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f2053d.reset();
                    this.f2053d.moveTo(f3, f4 + 10.0f);
                    this.f2053d.lineTo(f3 + 10.0f, f4);
                    this.f2053d.lineTo(f3, f4 - 10.0f);
                    this.f2053d.lineTo(f3 - 10.0f, f4);
                    this.f2053d.close();
                    int i8 = i6 - 1;
                    nVar.mo3271a(i8);
                    if (i == 4) {
                        int[] iArr = this.f2051b;
                        if (iArr[i8] == 1) {
                            m2513a(canvas, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED);
                        } else if (iArr[i8] == 2) {
                            m2518b(canvas, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED);
                        } else if (iArr[i8] == 3) {
                            i5 = 3;
                            f2 = f4;
                            f = f3;
                            m2515a(canvas, f3 - BitmapDescriptorFactory.HUE_RED, f4 - BitmapDescriptorFactory.HUE_RED, i4, i3);
                            canvas.drawPath(this.f2053d, this.f2058i);
                        }
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                        canvas.drawPath(this.f2053d, this.f2058i);
                    } else {
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                    }
                    if (i == 2) {
                        m2513a(canvas, f - BitmapDescriptorFactory.HUE_RED, f2 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i == i5) {
                        m2518b(canvas, f - BitmapDescriptorFactory.HUE_RED, f2 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i == 6) {
                        m2515a(canvas, f - BitmapDescriptorFactory.HUE_RED, f2 - BitmapDescriptorFactory.HUE_RED, i4, i3);
                    }
                    canvas.drawPath(this.f2053d, this.f2058i);
                }
            }
            float[] fArr2 = this.f2050a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2055f);
                float[] fArr3 = this.f2050a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2055f);
            }
        }

        /* renamed from: a */
        public void mo3209a(Canvas canvas, HashMap<View, C0581n> hashMap, int i, int i2) {
            if (!(hashMap == null || hashMap.size() == 0)) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f2023g) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f2057h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f2054e);
                }
                for (C0581n nVar : hashMap.values()) {
                    int c = nVar.mo3286c();
                    if (i2 > 0 && c == 0) {
                        c = 1;
                    }
                    if (c != 0) {
                        this.f2065p = nVar.mo3270a(this.f2052c, this.f2051b);
                        if (c >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f2050a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f2050a = new float[(i3 * 2)];
                                this.f2053d = new Path();
                            }
                            int i4 = this.f2068s;
                            canvas.translate((float) i4, (float) i4);
                            this.f2054e.setColor(1996488704);
                            this.f2058i.setColor(1996488704);
                            this.f2055f.setColor(1996488704);
                            this.f2056g.setColor(1996488704);
                            nVar.mo3280a(this.f2050a, i3);
                            mo3208a(canvas, c, this.f2065p, nVar);
                            this.f2054e.setColor(-21965);
                            this.f2055f.setColor(-2067046);
                            this.f2058i.setColor(-2067046);
                            this.f2056g.setColor(-13391360);
                            int i5 = this.f2068s;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo3208a(canvas, c, this.f2065p, nVar);
                            if (c == 5) {
                                m2516a(canvas, nVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: a */
        private void m2514a(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.f2056g);
            canvas.drawLine(f, f2, f3, f4, this.f2056g);
        }

        /* renamed from: a */
        private void m2515a(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            mo3210a(str, this.f2057h);
            canvas.drawText(str, ((f / 2.0f) - ((float) (this.f2066q.width() / 2))) + BitmapDescriptorFactory.HUE_RED, f2 - 20.0f, this.f2057h);
            canvas.drawLine(f, f2, Math.min((float) BitmapDescriptorFactory.HUE_RED, 1.0f), f2, this.f2056g);
            String str2 = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            mo3210a(str2, this.f2057h);
            canvas.drawText(str2, f + 5.0f, BitmapDescriptorFactory.HUE_RED - ((f2 / 2.0f) - ((float) (this.f2066q.height() / 2))), this.f2057h);
            canvas.drawLine(f, f2, f, Math.max((float) BitmapDescriptorFactory.HUE_RED, 1.0f), this.f2056g);
        }
    }

    /* renamed from: b */
    public C0584q.C0586a mo3157b(int i) {
        return this.f2018b.mo3316b(i);
    }

    public void setDebugMode(int i) {
        this.f2032p = i;
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            qVar.mo3315a(isRtl());
        }
    }

    public void setScene(C0584q qVar) {
        this.f2018b = qVar;
        qVar.mo3315a(isRtl());
        mo3164g();
    }

    public void setTransitionDuration(int i) {
        C0584q qVar = this.f2018b;
        if (qVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            qVar.mo3324d(i);
        }
    }

    /* renamed from: a */
    public void mo3149a(int i) {
        if (!isAttachedToWindow()) {
            if (this.an == null) {
                this.an = new C0544f();
            }
            this.an.mo3226a(i);
            return;
        }
        mo3153a(i, -1, -1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.ad;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.ae;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setInterpolatedProgress(float f) {
        if (this.f2018b != null) {
            setState(EnumC0546h.MOVING);
            Interpolator f2 = this.f2018b.mo3326f();
            if (f2 != null) {
                setProgress(f2.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.ae;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.ae.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.ad;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.ad.get(i).setProgress(f);
            }
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.an == null) {
            this.an = new C0544f();
        }
        this.an.mo3227a(bundle);
        if (isAttachedToWindow()) {
            this.an.mo3224a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0584q qVar = this.f2018b;
        if (qVar == null || !this.f2008N || !qVar.mo3322c()) {
            return super.onTouchEvent(motionEvent);
        }
        C0584q.C0586a aVar = this.f2018b.f2295c;
        if (aVar != null && !aVar.mo3345g()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f2018b.mo3310a(motionEvent, getCurrentState(), this);
        return true;
    }

    /* renamed from: a */
    private void m2482a(C0584q.C0586a aVar) {
        Log.v("MotionLayout", "CHECK: transition = " + aVar.mo3336a(getContext()));
        Log.v("MotionLayout", "CHECK: transition.setDuration = " + aVar.mo3343e());
        if (aVar.mo3342d() == aVar.mo3341c()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.f2018b = new C0584q(getContext(), this, i);
                if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                    this.f2018b.mo3311a(this);
                    this.f2006L.mo3215a(this.mLayoutWidget, this.f2018b.mo3321c(this.f2021e), this.f2018b.mo3321c(this.f2023g));
                    mo3164g();
                    this.f2018b.mo3315a(isRtl());
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } else {
            this.f2018b = null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.af == null) {
                this.af = new ArrayList<>();
            }
            this.af.add(motionHelper);
            if (motionHelper.mo3142a()) {
                if (this.ad == null) {
                    this.ad = new ArrayList<>();
                }
                this.ad.add(motionHelper);
            }
            if (motionHelper.mo3143b()) {
                if (this.ae == null) {
                    this.ae = new ArrayList<>();
                }
                this.ae.add(motionHelper);
            }
        }
    }

    public void setProgress(float f) {
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.an == null) {
                this.an = new C0544f();
            }
            this.an.mo3225a(f);
            return;
        }
        if (i <= 0) {
            this.f2022f = this.f2021e;
            if (this.f2028l == BitmapDescriptorFactory.HUE_RED) {
                setState(EnumC0546h.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f2022f = this.f2023g;
            if (this.f2028l == 1.0f) {
                setState(EnumC0546h.FINISHED);
            }
        } else {
            this.f2022f = -1;
            setState(EnumC0546h.MOVING);
        }
        if (this.f2018b != null) {
            this.f2012R = true;
            this.f2029m = f;
            this.f2027k = f;
            this.f2011Q = -1;
            this.f2009O = -1;
            this.f2019c = null;
            this.f2030n = true;
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setState(EnumC0546h hVar) {
        if (hVar != EnumC0546h.FINISHED || this.f2022f != -1) {
            EnumC0546h hVar2 = this.f2005K;
            this.f2005K = hVar;
            if (hVar2 == EnumC0546h.MOVING && hVar == EnumC0546h.MOVING) {
                m2488l();
            }
            int i = C05382.f2045a[hVar2.ordinal()];
            if (i == 1 || i == 2) {
                if (hVar == EnumC0546h.MOVING) {
                    m2488l();
                }
                if (hVar == EnumC0546h.FINISHED) {
                    mo3163f();
                }
            } else if (i == 3 && hVar == EnumC0546h.FINISHED) {
                mo3163f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0584q.C0586a aVar) {
        long j;
        this.f2018b.mo3314a(aVar);
        setState(EnumC0546h.SETUP);
        if (this.f2022f == this.f2018b.mo3325e()) {
            this.f2028l = 1.0f;
            this.f2027k = 1.0f;
            this.f2029m = 1.0f;
        } else {
            this.f2028l = BitmapDescriptorFactory.HUE_RED;
            this.f2027k = BitmapDescriptorFactory.HUE_RED;
            this.f2029m = BitmapDescriptorFactory.HUE_RED;
        }
        if (aVar.mo3340b(1)) {
            j = -1;
        } else {
            j = getNanoTime();
        }
        this.f2011Q = j;
        int d = this.f2018b.mo3323d();
        int e = this.f2018b.mo3325e();
        if (d != this.f2021e || e != this.f2023g) {
            this.f2021e = d;
            this.f2023g = e;
            this.f2018b.mo3309a(d, e);
            this.f2006L.mo3215a(this.mLayoutWidget, this.f2018b.mo3321c(this.f2021e), this.f2018b.mo3321c(this.f2023g));
            this.f2006L.mo3217b(this.f2021e, this.f2023g);
            this.f2006L.mo3212a();
            mo3164g();
        }
    }

    public MotionLayout(Context context) {
        super(context);
        m2481a((AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas) {
        String str;
        mo3156a(false);
        super.dispatchDraw(canvas);
        if (this.f2018b != null) {
            if ((this.f2032p & 1) == 1 && !isInEditMode()) {
                this.ag++;
                long nanoTime = getNanoTime();
                long j = this.ah;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f175412ai = ((float) ((int) ((((float) this.ag) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.ag = 0;
                        this.ah = nanoTime;
                    }
                } else {
                    this.ah = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f175412ai + " fps " + C0547a.m2560a(this, this.f2021e) + " -> ");
                sb.append(C0547a.m2560a(this, this.f2023g));
                sb.append(" (progress: ");
                sb.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb.append(" ) state=");
                int i = this.f2022f;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = C0547a.m2560a(this, i);
                }
                sb.append(str);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f2032p > 1) {
                if (this.f2033q == null) {
                    this.f2033q = new C0540b();
                }
                this.f2033q.mo3209a(canvas, this.f2026j, this.f2018b.mo3327g(), this.f2032p);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0584q.C0586a aVar;
        C0620t f;
        int e;
        RectF a;
        C0584q qVar = this.f2018b;
        if (qVar != null && this.f2008N && (aVar = qVar.f2295c) != null && aVar.mo3345g() && (f = aVar.mo3344f()) != null && ((motionEvent.getAction() != 0 || (a = f.mo3369a(this, new RectF())) == null || a.contains(motionEvent.getX(), motionEvent.getY())) && (e = f.mo3381e()) != -1)) {
            View view = this.aq;
            if (view == null || view.getId() != e) {
                this.aq = findViewById(e);
            }
            View view2 = this.aq;
            if (view2 != null) {
                this.ap.set((float) view2.getLeft(), (float) this.aq.getTop(), (float) this.aq.getRight(), (float) this.aq.getBottom());
                if (this.ap.contains(motionEvent.getX(), motionEvent.getY()) && !m2484a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.aq, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public void setTransition(int i) {
        if (this.f2018b != null) {
            C0584q.C0586a b = mo3157b(i);
            this.f2021e = b.mo3342d();
            this.f2023g = b.mo3341c();
            if (!isAttachedToWindow()) {
                if (this.an == null) {
                    this.an = new C0544f();
                }
                this.an.mo3230b(this.f2021e);
                this.an.mo3226a(this.f2023g);
                return;
            }
            float f = Float.NaN;
            int i2 = this.f2022f;
            int i3 = this.f2021e;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i2 == i3) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else if (i2 == this.f2023g) {
                f = 1.0f;
            }
            this.f2018b.mo3314a(b);
            this.f2006L.mo3215a(this.mLayoutWidget, this.f2018b.mo3321c(this.f2021e), this.f2018b.mo3321c(this.f2023g));
            mo3164g();
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f2028l = f2;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", C0547a.m2557a() + " transitionToStart ");
                mo3159c();
                return;
            }
            setProgress(f);
        }
    }

    /* renamed from: a */
    private void m2481a(AttributeSet attributeSet) {
        C0584q qVar;
        f1994a = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.applyMotionScene, R.attr.currentState, R.attr.layoutDescription, R.attr.motionDebug, R.attr.motionProgress, R.attr.showPaths});
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = 2;
                if (index == 2) {
                    this.f2018b = new C0584q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f2022f = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f2029m = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                    this.f2030n = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f2032p == 0) {
                        if (!obtainStyledAttributes.getBoolean(index, false)) {
                            i2 = 0;
                        }
                        this.f2032p = i2;
                    }
                } else if (index == 3) {
                    this.f2032p = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f2018b == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f2018b = null;
            }
        }
        if (this.f2032p != 0) {
            m2487k();
        }
        if (this.f2022f == -1 && (qVar = this.f2018b) != null) {
            this.f2022f = qVar.mo3323d();
            this.f2021e = this.f2018b.mo3323d();
            this.f2023g = this.f2018b.mo3325e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3147a(float f) {
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            float f2 = this.f2028l;
            float f3 = this.f2027k;
            if (f2 != f3 && this.f2012R) {
                this.f2028l = f3;
            }
            float f4 = this.f2028l;
            if (f4 != f) {
                this.f2016V = false;
                this.f2029m = f;
                this.f2010P = ((float) qVar.mo3327g()) / 1000.0f;
                setProgress(this.f2029m);
                this.f2019c = this.f2018b.mo3326f();
                this.f2012R = false;
                this.f2009O = getNanoTime();
                this.f2030n = true;
                this.f2027k = f4;
                this.f2028l = f4;
                invalidate();
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            float f = this.f2040x;
            float f2 = this.f1995A;
            qVar.mo3317b(f / f2, this.f2041y / f2);
        }
    }

    /* renamed from: a */
    private void m2480a(int i, C0689b bVar) {
        String a = C0547a.m2558a(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + a + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (bVar.mo3910f(id) == null) {
                Log.w("MotionLayout", "CHECK: " + a + " NO CONSTRAINTS for " + C0547a.m2559a(childAt));
            }
        }
        int[] a2 = bVar.mo3896a();
        for (int i3 = 0; i3 < a2.length; i3++) {
            int i4 = a2[i3];
            String a3 = C0547a.m2558a(getContext(), i4);
            if (findViewById(a2[i3]) == null) {
                Log.w("MotionLayout", "CHECK: " + a + " NO View matches id " + a3);
            }
            if (bVar.mo3906d(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + a + "(" + a3 + ") no LAYOUT_HEIGHT");
            }
            if (bVar.mo3909e(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + a + "(" + a3 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int i, int i2) {
        boolean z;
        if (this.f2018b == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (this.f2024h == i && this.f2025i == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.ao) {
            this.ao = false;
            mo3162e();
            m2489m();
            z = true;
        }
        if (this.mDirtyHierarchy) {
            z = true;
        }
        this.f2024h = i;
        this.f2025i = i2;
        int d = this.f2018b.mo3323d();
        int e = this.f2018b.mo3325e();
        if ((z || this.f2006L.mo3218c(d, e)) && this.f2021e != -1) {
            super.onMeasure(i, i2);
            this.f2006L.mo3215a(this.mLayoutWidget, this.f2018b.mo3321c(d), this.f2018b.mo3321c(e));
            this.f2006L.mo3212a();
            this.f2006L.mo3217b(d, e);
        } else {
            z2 = true;
        }
        if (this.f1997C || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int A = this.mLayoutWidget.mo3499A() + getPaddingLeft() + getPaddingRight();
            int B = this.mLayoutWidget.mo3500B() + paddingTop;
            int i3 = this.f2002H;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f1998D;
                A = (int) (((float) i4) + (this.f2004J * ((float) (this.f2000F - i4))));
                requestLayout();
            }
            int i5 = this.f2003I;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f1999E;
                B = (int) (((float) i6) + (this.f2004J * ((float) (this.f2001G - i6))));
                requestLayout();
            }
            setMeasuredDimension(A, B);
        }
        m2486j();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2481a(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(EnumC0546h.SETUP);
        this.f2022f = i;
        this.f2021e = -1;
        this.f2023g = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.mo3873a(i, (float) i2, (float) i3);
            return;
        }
        C0584q qVar = this.f2018b;
        if (qVar != null) {
            qVar.mo3321c(i).mo3905c(this);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2481a(attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C0584q qVar = this.f2018b;
        if (qVar == null || qVar.f2295c == null || this.f2018b.f2295c.mo3344f() == null || (this.f2018b.f2295c.mo3344f().mo3384f() & 2) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2484a(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m2484a(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.ap.set(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, f + ((float) view.getRight()), f2 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            if (!this.ap.contains(motionEvent.getX(), motionEvent.getY()) || !view.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.am = true;
        try {
            if (this.f2018b == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f2037u == i5 && this.f2038v == i6)) {
                mo3164g();
                mo3156a(true);
            }
            this.f2037u = i5;
            this.f2038v = i6;
            this.f2035s = i5;
            this.f2036t = i6;
            this.am = false;
        } finally {
            this.am = false;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(final View view, int i, int i2, int[] iArr, int i3) {
        C0620t f;
        int e;
        C0584q qVar = this.f2018b;
        if (qVar != null && qVar.f2295c != null && this.f2018b.f2295c.mo3345g()) {
            C0584q.C0586a aVar = this.f2018b.f2295c;
            if (aVar == null || !aVar.mo3345g() || (f = aVar.mo3344f()) == null || (e = f.mo3381e()) == -1 || view.getId() == e) {
                C0584q qVar2 = this.f2018b;
                if (qVar2 != null && qVar2.mo3333m()) {
                    float f2 = this.f2027k;
                    if ((f2 == 1.0f || f2 == BitmapDescriptorFactory.HUE_RED) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(aVar.mo3344f() == null || (this.f2018b.f2295c.mo3344f().mo3384f() & 1) == 0)) {
                    float c = this.f2018b.mo3320c((float) i, (float) i2);
                    float f3 = this.f2028l;
                    if ((f3 <= BitmapDescriptorFactory.HUE_RED && c < BitmapDescriptorFactory.HUE_RED) || (f3 >= 1.0f && c > BitmapDescriptorFactory.HUE_RED)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new Runnable() {
                                /* class androidx.constraintlayout.motion.widget.MotionLayout.RunnableC05371 */

                                public void run() {
                                    view.setNestedScrollingEnabled(true);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                float f4 = this.f2027k;
                long nanoTime = getNanoTime();
                float f5 = (float) i;
                this.f2040x = f5;
                float f6 = (float) i2;
                this.f2041y = f6;
                this.f1995A = (float) (((double) (nanoTime - this.f2042z)) * 1.0E-9d);
                this.f2042z = nanoTime;
                this.f2018b.mo3308a(f5, f6);
                if (f4 != this.f2027k) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo3156a(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f2039w = true;
                }
            }
        }
    }
}
