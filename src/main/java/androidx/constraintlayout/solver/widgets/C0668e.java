package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.e */
public class C0668e extends C0675j {

    /* renamed from: a */
    public int f2690a = -1;
    public int aA = -1;
    public float aB = 0.5f;
    public float aC = 0.5f;
    public float aD = 0.5f;
    public float aE = 0.5f;
    public float aF = 0.5f;
    public float aG = 0.5f;
    public int aH;
    public int aI;
    public int aJ = 2;
    public int aK = 2;
    public ConstraintWidget[] aL;
    public int aM = 0;
    private int aR;
    private int aS = -1;
    private int aT;
    private ArrayList<C0669a> aU = new ArrayList<>();
    private ConstraintWidget[] aV = null;
    private ConstraintWidget[] aW = null;
    private int[] aX = null;
    public int aw = -1;
    public int ax = -1;
    public int ay = -1;
    public int az = -1;

    /* access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.solver.widgets.e$a */
    public class C0669a {

        /* renamed from: a */
        public ConstraintWidget f2691a;

        /* renamed from: b */
        int f2692b;

        /* renamed from: d */
        private int f2694d;

        /* renamed from: e */
        private ConstraintAnchor f2695e;

        /* renamed from: f */
        private ConstraintAnchor f2696f;

        /* renamed from: g */
        private ConstraintAnchor f2697g;

        /* renamed from: h */
        private ConstraintAnchor f2698h;

        /* renamed from: i */
        private int f2699i;

        /* renamed from: j */
        private int f2700j;

        /* renamed from: k */
        private int f2701k;

        /* renamed from: l */
        private int f2702l;

        /* renamed from: m */
        private int f2703m;

        /* renamed from: n */
        private int f2704n;

        /* renamed from: o */
        private int f2705o;

        /* renamed from: p */
        private int f2706p;

        /* renamed from: q */
        private int f2707q;

        /* renamed from: r */
        private int f2708r;

        /* renamed from: b */
        public int mo3710b() {
            if (this.f2694d == 0) {
                return this.f2703m - C0668e.this.aH;
            }
            return this.f2703m;
        }

        /* renamed from: c */
        public int mo3712c() {
            if (this.f2694d == 1) {
                return this.f2704n - C0668e.this.aI;
            }
            return this.f2704n;
        }

        /* renamed from: a */
        public void mo3705a() {
            this.f2692b = 0;
            this.f2691a = null;
            this.f2703m = 0;
            this.f2704n = 0;
            this.f2705o = 0;
            this.f2706p = 0;
            this.f2707q = 0;
        }

        /* renamed from: d */
        private void m3259d() {
            this.f2703m = 0;
            this.f2704n = 0;
            this.f2691a = null;
            this.f2692b = 0;
            int i = this.f2706p;
            int i2 = 0;
            while (i2 < i && this.f2705o + i2 < C0668e.this.aM) {
                ConstraintWidget constraintWidget = C0668e.this.aL[this.f2705o + i2];
                if (this.f2694d == 0) {
                    int A = constraintWidget.mo3499A();
                    int i3 = C0668e.this.aH;
                    if (constraintWidget.mo3596w() == 8) {
                        i3 = 0;
                    }
                    this.f2703m += A + i3;
                    int b = C0668e.this.mo3694b(constraintWidget, this.f2708r);
                    if (this.f2691a == null || this.f2692b < b) {
                        this.f2691a = constraintWidget;
                        this.f2692b = b;
                        this.f2704n = b;
                    }
                } else {
                    int a = C0668e.this.mo3693a(constraintWidget, this.f2708r);
                    int b2 = C0668e.this.mo3694b(constraintWidget, this.f2708r);
                    int i4 = C0668e.this.aI;
                    if (constraintWidget.mo3596w() == 8) {
                        i4 = 0;
                    }
                    this.f2704n += b2 + i4;
                    if (this.f2691a == null || this.f2692b < a) {
                        this.f2691a = constraintWidget;
                        this.f2692b = a;
                        this.f2703m = a;
                    }
                }
                i2++;
            }
        }

        /* renamed from: a */
        public void mo3706a(int i) {
            this.f2705o = i;
        }

        /* renamed from: b */
        public void mo3711b(int i) {
            int i2 = this.f2707q;
            if (i2 != 0) {
                int i3 = this.f2706p;
                int i4 = i / i2;
                int i5 = 0;
                while (i5 < i3 && this.f2705o + i5 < C0668e.this.aM) {
                    ConstraintWidget constraintWidget = C0668e.this.aL[this.f2705o + i5];
                    if (this.f2694d == 0) {
                        if (constraintWidget != null && constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2568l == 0) {
                            C0668e.this.mo3736a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.mo3518T(), constraintWidget.mo3500B());
                        }
                    } else if (constraintWidget != null && constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2569m == 0) {
                        C0668e.this.mo3736a(constraintWidget, constraintWidget.mo3517S(), constraintWidget.mo3499A(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                    }
                    i5++;
                }
                m3259d();
            }
        }

        /* renamed from: a */
        public void mo3708a(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f2694d == 0) {
                int a = C0668e.this.mo3693a(constraintWidget, this.f2708r);
                if (constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2707q++;
                    a = 0;
                }
                int i2 = C0668e.this.aH;
                if (constraintWidget.mo3596w() != 8) {
                    i = i2;
                }
                this.f2703m += a + i;
                int b = C0668e.this.mo3694b(constraintWidget, this.f2708r);
                if (this.f2691a == null || this.f2692b < b) {
                    this.f2691a = constraintWidget;
                    this.f2692b = b;
                    this.f2704n = b;
                }
            } else {
                int a2 = C0668e.this.mo3693a(constraintWidget, this.f2708r);
                int b2 = C0668e.this.mo3694b(constraintWidget, this.f2708r);
                if (constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2707q++;
                    b2 = 0;
                }
                int i3 = C0668e.this.aI;
                if (constraintWidget.mo3596w() != 8) {
                    i = i3;
                }
                this.f2704n += b2 + i;
                if (this.f2691a == null || this.f2692b < a2) {
                    this.f2691a = constraintWidget;
                    this.f2692b = a2;
                    this.f2703m = a2;
                }
            }
            this.f2706p++;
        }

        /* renamed from: a */
        public void mo3709a(boolean z, int i, boolean z2) {
            boolean z3;
            ConstraintWidget constraintWidget;
            int i2;
            int i3;
            int i4;
            int i5 = this.f2706p;
            int i6 = 0;
            while (i6 < i5 && this.f2705o + i6 < C0668e.this.aM) {
                ConstraintWidget constraintWidget2 = C0668e.this.aL[this.f2705o + i6];
                if (constraintWidget2 != null) {
                    constraintWidget2.mo3516R();
                }
                i6++;
            }
            if (!(i5 == 0 || this.f2691a == null)) {
                if (!z2 || i != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i7 = -1;
                int i8 = -1;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (z) {
                        i4 = (i5 - 1) - i9;
                    } else {
                        i4 = i9;
                    }
                    if (this.f2705o + i4 >= C0668e.this.aM) {
                        break;
                    }
                    if (C0668e.this.aL[this.f2705o + i4].mo3596w() == 0) {
                        if (i7 == -1) {
                            i7 = i9;
                        }
                        i8 = i9;
                    }
                }
                ConstraintWidget constraintWidget3 = null;
                if (this.f2694d == 0) {
                    ConstraintWidget constraintWidget4 = this.f2691a;
                    constraintWidget4.mo3593u(C0668e.this.aw);
                    int i10 = this.f2700j;
                    if (i > 0) {
                        i10 += C0668e.this.aI;
                    }
                    constraintWidget4.f2582z.mo3482a(this.f2696f, i10);
                    if (z2) {
                        constraintWidget4.f2533B.mo3482a(this.f2698h, this.f2702l);
                    }
                    if (i > 0) {
                        this.f2696f.f2521a.f2533B.mo3482a(constraintWidget4.f2582z, 0);
                    }
                    if (C0668e.this.aK == 3 && !constraintWidget4.mo3509K()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i5) {
                                break;
                            }
                            if (z) {
                                i3 = (i5 - 1) - i11;
                            } else {
                                i3 = i11;
                            }
                            if (this.f2705o + i3 >= C0668e.this.aM) {
                                break;
                            }
                            constraintWidget = C0668e.this.aL[this.f2705o + i3];
                            if (constraintWidget.mo3509K()) {
                                break;
                            }
                            i11++;
                        }
                    }
                    constraintWidget = constraintWidget4;
                    int i12 = 0;
                    while (i12 < i5) {
                        if (z) {
                            i2 = (i5 - 1) - i12;
                        } else {
                            i2 = i12;
                        }
                        if (this.f2705o + i2 < C0668e.this.aM) {
                            ConstraintWidget constraintWidget5 = C0668e.this.aL[this.f2705o + i2];
                            if (i12 == 0) {
                                constraintWidget5.mo3533a(constraintWidget5.f2581y, this.f2695e, this.f2699i);
                            }
                            if (i2 == 0) {
                                int i13 = C0668e.this.f2690a;
                                float f = C0668e.this.aB;
                                if (this.f2705o == 0 && C0668e.this.ax != -1) {
                                    i13 = C0668e.this.ax;
                                    f = C0668e.this.aD;
                                } else if (z2 && C0668e.this.az != -1) {
                                    i13 = C0668e.this.az;
                                    f = C0668e.this.aF;
                                }
                                constraintWidget5.mo3589t(i13);
                                constraintWidget5.mo3523a(f);
                            }
                            if (i12 == i5 - 1) {
                                constraintWidget5.mo3533a(constraintWidget5.f2532A, this.f2697g, this.f2701k);
                            }
                            if (constraintWidget3 != null) {
                                constraintWidget5.f2581y.mo3482a(constraintWidget3.f2532A, C0668e.this.aH);
                                if (i12 == i7) {
                                    constraintWidget5.f2581y.mo3484b(this.f2699i);
                                }
                                constraintWidget3.f2532A.mo3482a(constraintWidget5.f2581y, 0);
                                if (i12 == i8 + 1) {
                                    constraintWidget3.f2532A.mo3484b(this.f2701k);
                                }
                            }
                            if (constraintWidget5 != constraintWidget4) {
                                if (C0668e.this.aK != 3 || !constraintWidget.mo3509K() || constraintWidget5 == constraintWidget || !constraintWidget5.mo3509K()) {
                                    int i14 = C0668e.this.aK;
                                    if (i14 == 0) {
                                        constraintWidget5.f2582z.mo3482a(constraintWidget4.f2582z, 0);
                                    } else if (i14 == 1) {
                                        constraintWidget5.f2533B.mo3482a(constraintWidget4.f2533B, 0);
                                    } else if (z3) {
                                        constraintWidget5.f2582z.mo3482a(this.f2696f, this.f2700j);
                                        constraintWidget5.f2533B.mo3482a(this.f2698h, this.f2702l);
                                    } else {
                                        constraintWidget5.f2582z.mo3482a(constraintWidget4.f2582z, 0);
                                        constraintWidget5.f2533B.mo3482a(constraintWidget4.f2533B, 0);
                                    }
                                } else {
                                    constraintWidget5.f2534C.mo3482a(constraintWidget.f2534C, 0);
                                }
                            }
                            i12++;
                            constraintWidget3 = constraintWidget5;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ConstraintWidget constraintWidget6 = this.f2691a;
                constraintWidget6.mo3589t(C0668e.this.f2690a);
                int i15 = this.f2699i;
                if (i > 0) {
                    i15 += C0668e.this.aH;
                }
                if (z) {
                    constraintWidget6.f2532A.mo3482a(this.f2697g, i15);
                    if (z2) {
                        constraintWidget6.f2581y.mo3482a(this.f2695e, this.f2701k);
                    }
                    if (i > 0) {
                        this.f2697g.f2521a.f2581y.mo3482a(constraintWidget6.f2532A, 0);
                    }
                } else {
                    constraintWidget6.f2581y.mo3482a(this.f2695e, i15);
                    if (z2) {
                        constraintWidget6.f2532A.mo3482a(this.f2697g, this.f2701k);
                    }
                    if (i > 0) {
                        this.f2695e.f2521a.f2532A.mo3482a(constraintWidget6.f2581y, 0);
                    }
                }
                int i16 = 0;
                while (i16 < i5 && this.f2705o + i16 < C0668e.this.aM) {
                    ConstraintWidget constraintWidget7 = C0668e.this.aL[this.f2705o + i16];
                    if (i16 == 0) {
                        constraintWidget7.mo3533a(constraintWidget7.f2582z, this.f2696f, this.f2700j);
                        int i17 = C0668e.this.aw;
                        float f2 = C0668e.this.aC;
                        if (this.f2705o == 0 && C0668e.this.ay != -1) {
                            i17 = C0668e.this.ay;
                            f2 = C0668e.this.aE;
                        } else if (z2 && C0668e.this.aA != -1) {
                            i17 = C0668e.this.aA;
                            f2 = C0668e.this.aG;
                        }
                        constraintWidget7.mo3593u(i17);
                        constraintWidget7.mo3544b(f2);
                    }
                    if (i16 == i5 - 1) {
                        constraintWidget7.mo3533a(constraintWidget7.f2533B, this.f2698h, this.f2702l);
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget7.f2582z.mo3482a(constraintWidget3.f2533B, C0668e.this.aI);
                        if (i16 == i7) {
                            constraintWidget7.f2582z.mo3484b(this.f2700j);
                        }
                        constraintWidget3.f2533B.mo3482a(constraintWidget7.f2582z, 0);
                        if (i16 == i8 + 1) {
                            constraintWidget3.f2533B.mo3484b(this.f2702l);
                        }
                    }
                    if (constraintWidget7 != constraintWidget6) {
                        if (z) {
                            int i18 = C0668e.this.aJ;
                            if (i18 == 0) {
                                constraintWidget7.f2532A.mo3482a(constraintWidget6.f2532A, 0);
                            } else if (i18 == 1) {
                                constraintWidget7.f2581y.mo3482a(constraintWidget6.f2581y, 0);
                            } else if (i18 == 2) {
                                constraintWidget7.f2581y.mo3482a(constraintWidget6.f2581y, 0);
                                constraintWidget7.f2532A.mo3482a(constraintWidget6.f2532A, 0);
                            }
                        } else {
                            int i19 = C0668e.this.aJ;
                            if (i19 == 0) {
                                constraintWidget7.f2581y.mo3482a(constraintWidget6.f2581y, 0);
                            } else if (i19 == 1) {
                                constraintWidget7.f2532A.mo3482a(constraintWidget6.f2532A, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    constraintWidget7.f2581y.mo3482a(this.f2695e, this.f2699i);
                                    constraintWidget7.f2532A.mo3482a(this.f2697g, this.f2701k);
                                } else {
                                    constraintWidget7.f2581y.mo3482a(constraintWidget6.f2581y, 0);
                                    constraintWidget7.f2532A.mo3482a(constraintWidget6.f2532A, 0);
                                }
                            }
                            i16++;
                            constraintWidget3 = constraintWidget7;
                        }
                    }
                    i16++;
                    constraintWidget3 = constraintWidget7;
                }
            }
        }

        public C0669a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f2694d = i;
            this.f2695e = constraintAnchor;
            this.f2696f = constraintAnchor2;
            this.f2697g = constraintAnchor3;
            this.f2698h = constraintAnchor4;
            this.f2699i = C0668e.this.mo3739f();
            this.f2700j = C0668e.this.mo3604b();
            this.f2701k = C0668e.this.mo3741g();
            this.f2702l = C0668e.this.mo3738c();
            this.f2708r = i2;
        }

        /* renamed from: a */
        public void mo3707a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f2694d = i;
            this.f2695e = constraintAnchor;
            this.f2696f = constraintAnchor2;
            this.f2697g = constraintAnchor3;
            this.f2698h = constraintAnchor4;
            this.f2699i = i2;
            this.f2700j = i3;
            this.f2701k = i4;
            this.f2702l = i5;
            this.f2708r = i6;
        }
    }

    /* renamed from: A */
    public void mo3684A(int i) {
        this.aA = i;
    }

    /* renamed from: B */
    public void mo3685B(int i) {
        this.f2690a = i;
    }

    /* renamed from: C */
    public void mo3686C(int i) {
        this.aw = i;
    }

    /* renamed from: D */
    public void mo3687D(int i) {
        this.aJ = i;
    }

    /* renamed from: E */
    public void mo3688E(int i) {
        this.aK = i;
    }

    /* renamed from: F */
    public void mo3689F(int i) {
        this.aR = i;
    }

    /* renamed from: G */
    public void mo3690G(int i) {
        this.aH = i;
    }

    /* renamed from: H */
    public void mo3691H(int i) {
        this.aI = i;
    }

    /* renamed from: I */
    public void mo3692I(int i) {
        this.aS = i;
    }

    /* renamed from: a */
    public void mo3602a(int i) {
        this.aT = i;
    }

    /* renamed from: b */
    public void mo3695b(int i) {
        this.ax = i;
    }

    /* renamed from: e */
    public void mo3697e(float f) {
        this.aB = f;
    }

    /* renamed from: f */
    public void mo3698f(float f) {
        this.aC = f;
    }

    /* renamed from: g */
    public void mo3699g(float f) {
        this.aD = f;
    }

    /* renamed from: h */
    public void mo3700h(float f) {
        this.aE = f;
    }

    /* renamed from: i */
    public void mo3701i(float f) {
        this.aF = f;
    }

    /* renamed from: j */
    public void mo3702j(float f) {
        this.aG = f;
    }

    /* renamed from: y */
    public void mo3703y(int i) {
        this.ay = i;
    }

    /* renamed from: z */
    public void mo3704z(int i) {
        this.az = i;
    }

    /* renamed from: g */
    private void m3234g(boolean z) {
        ConstraintWidget constraintWidget;
        int i;
        if (!(this.aX == null || this.aW == null || this.aV == null)) {
            for (int i2 = 0; i2 < this.aM; i2++) {
                this.aL[i2].mo3516R();
            }
            int[] iArr = this.aX;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            for (int i5 = 0; i5 < i3; i5++) {
                if (z) {
                    i = (i3 - i5) - 1;
                } else {
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.aW[i];
                if (!(constraintWidget3 == null || constraintWidget3.mo3596w() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.mo3533a(constraintWidget3.f2581y, this.f2581y, mo3739f());
                        constraintWidget3.mo3589t(this.f2690a);
                        constraintWidget3.mo3523a(this.aB);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.mo3533a(constraintWidget3.f2532A, this.f2532A, mo3741g());
                    }
                    if (i5 > 0) {
                        constraintWidget3.mo3533a(constraintWidget3.f2581y, constraintWidget2.f2532A, this.aH);
                        constraintWidget2.mo3533a(constraintWidget2.f2532A, constraintWidget3.f2581y, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.aV[i6];
                if (!(constraintWidget4 == null || constraintWidget4.mo3596w() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.mo3533a(constraintWidget4.f2582z, this.f2582z, mo3604b());
                        constraintWidget4.mo3593u(this.aw);
                        constraintWidget4.mo3544b(this.aC);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.mo3533a(constraintWidget4.f2533B, this.f2533B, mo3738c());
                    }
                    if (i6 > 0) {
                        constraintWidget4.mo3533a(constraintWidget4.f2582z, constraintWidget2.f2533B, this.aI);
                        constraintWidget2.mo3533a(constraintWidget2.f2533B, constraintWidget4.f2582z, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.aT == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.aL;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.mo3596w() == 8)) {
                        ConstraintWidget constraintWidget5 = this.aW[i7];
                        ConstraintWidget constraintWidget6 = this.aV[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.mo3533a(constraintWidget.f2581y, constraintWidget5.f2581y, 0);
                            constraintWidget.mo3533a(constraintWidget.f2532A, constraintWidget5.f2532A, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.mo3533a(constraintWidget.f2582z, constraintWidget6.f2582z, 0);
                            constraintWidget.mo3533a(constraintWidget.f2533B, constraintWidget6.f2533B, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo3693a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.f2568l == 0) {
                return 0;
            }
            if (constraintWidget.f2568l == 2) {
                int i2 = (int) (constraintWidget.f2573q * ((float) i));
                if (i2 != constraintWidget.mo3499A()) {
                    constraintWidget.mo3563e(true);
                    mo3736a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i2, constraintWidget.mo3518T(), constraintWidget.mo3500B());
                }
                return i2;
            } else if (constraintWidget.f2568l == 1) {
                return constraintWidget.mo3499A();
            } else {
                if (constraintWidget.f2568l == 3) {
                    return (int) ((((float) constraintWidget.mo3500B()) * constraintWidget.f2544M) + 0.5f);
                }
            }
        }
        return constraintWidget.mo3499A();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3530a(C0627d dVar, boolean z) {
        boolean z2;
        boolean z3;
        super.mo3530a(dVar, z);
        if (mo3595v() != null) {
            z2 = ((C0667d) mo3595v()).mo3660Y();
        } else {
            z2 = false;
        }
        int i = this.aR;
        if (i != 0) {
            if (i == 1) {
                int size = this.aU.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0669a aVar = this.aU.get(i2);
                    if (i2 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo3709a(z2, i2, z3);
                }
            } else if (i == 2) {
                m3234g(z2);
            }
        } else if (this.aU.size() > 0) {
            this.aU.get(0).mo3709a(z2, 0, true);
        }
        mo3740f(false);
    }

    /* renamed from: b */
    public final int mo3694b(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.f2569m == 0) {
                return 0;
            }
            if (constraintWidget.f2569m == 2) {
                int i2 = (int) (constraintWidget.f2576t * ((float) i));
                if (i2 != constraintWidget.mo3500B()) {
                    constraintWidget.mo3563e(true);
                    mo3736a(constraintWidget, constraintWidget.mo3517S(), constraintWidget.mo3499A(), ConstraintWidget.DimensionBehaviour.FIXED, i2);
                }
                return i2;
            } else if (constraintWidget.f2569m == 1) {
                return constraintWidget.mo3500B();
            } else {
                if (constraintWidget.f2569m == 3) {
                    return (int) ((((float) constraintWidget.mo3499A()) * constraintWidget.f2544M) + 0.5f);
                }
            }
        }
        return constraintWidget.mo3500B();
    }

    @Override // androidx.constraintlayout.solver.widgets.C0673h, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3536a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo3536a(constraintWidget, hashMap);
        C0668e eVar = (C0668e) constraintWidget;
        this.f2690a = eVar.f2690a;
        this.aw = eVar.aw;
        this.ax = eVar.ax;
        this.ay = eVar.ay;
        this.az = eVar.az;
        this.aA = eVar.aA;
        this.aB = eVar.aB;
        this.aC = eVar.aC;
        this.aD = eVar.aD;
        this.aE = eVar.aE;
        this.aF = eVar.aF;
        this.aG = eVar.aG;
        this.aH = eVar.aH;
        this.aI = eVar.aI;
        this.aJ = eVar.aJ;
        this.aK = eVar.aK;
        this.aR = eVar.aR;
        this.aS = eVar.aS;
        this.aT = eVar.aT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0106  */
    @Override // androidx.constraintlayout.solver.widgets.C0675j
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3696b(int r19, int r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0668e.mo3696b(int, int, int, int):void");
    }

    /* renamed from: b */
    private void m3232b(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C0669a aVar;
        if (i != 0) {
            if (this.aU.size() == 0) {
                aVar = new C0669a(i2, this.f2581y, this.f2582z, this.f2532A, this.f2533B, i3);
                this.aU.add(aVar);
            } else {
                C0669a aVar2 = this.aU.get(0);
                aVar2.mo3705a();
                aVar = aVar2;
                aVar.mo3707a(i2, this.f2581y, this.f2582z, this.f2532A, this.f2533B, mo3739f(), mo3604b(), mo3741g(), mo3738c(), i3);
            }
            for (int i4 = 0; i4 < i; i4++) {
                aVar.mo3708a(constraintWidgetArr[i4]);
            }
            iArr[0] = aVar.mo3710b();
            iArr[1] = aVar.mo3712c();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* renamed from: c */
    private void m3233c(androidx.constraintlayout.solver.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0668e.m3233c(androidx.constraintlayout.solver.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    /* renamed from: a */
    private void m3231a(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        C0669a aVar;
        int i7;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        if (i != 0) {
            this.aU.clear();
            C0669a aVar2 = new C0669a(i2, this.f2581y, this.f2582z, this.f2532A, this.f2533B, i3);
            this.aU.add(aVar2);
            if (i2 == 0) {
                i4 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i11 < i) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i11];
                    int a = mo3693a(constraintWidget, i3);
                    if (constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    if ((i10 == i3 || this.aH + i10 + a > i3) && aVar2.f2691a != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i11 > 0 && (i9 = this.aS) > 0 && i11 % i9 == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar2 = new C0669a(i2, this.f2581y, this.f2582z, this.f2532A, this.f2533B, i3);
                        aVar2.mo3706a(i11);
                        this.aU.add(aVar2);
                    } else if (i11 > 0) {
                        i10 += this.aH + a;
                        aVar2.mo3708a(constraintWidget);
                        i11++;
                        i4 = i4;
                    }
                    i10 = a;
                    aVar2.mo3708a(constraintWidget);
                    i11++;
                    i4 = i4;
                }
            } else {
                i4 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i13 < i) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i13];
                    int b = mo3694b(constraintWidget2, i3);
                    if (constraintWidget2.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    if ((i12 == i3 || this.aI + i12 + b > i3) && aVar2.f2691a != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i13 > 0 && (i8 = this.aS) > 0 && i13 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar2 = new C0669a(i2, this.f2581y, this.f2582z, this.f2532A, this.f2533B, i3);
                        aVar2.mo3706a(i13);
                        this.aU.add(aVar2);
                    } else if (i13 > 0) {
                        i12 += this.aI + b;
                        aVar2.mo3708a(constraintWidget2);
                        i13++;
                        i4 = i4;
                    }
                    i12 = b;
                    aVar2.mo3708a(constraintWidget2);
                    i13++;
                    i4 = i4;
                }
            }
            int size = this.aU.size();
            ConstraintAnchor constraintAnchor3 = this.f2581y;
            ConstraintAnchor constraintAnchor4 = this.f2582z;
            ConstraintAnchor constraintAnchor5 = this.f2532A;
            ConstraintAnchor constraintAnchor6 = this.f2533B;
            int f = mo3739f();
            int b2 = mo3604b();
            int g = mo3741g();
            int c = mo3738c();
            if (mo3517S() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || mo3518T() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i14 = 0; i14 < size; i14++) {
                    C0669a aVar3 = this.aU.get(i14);
                    if (i2 == 0) {
                        aVar3.mo3711b(i3 - aVar3.mo3710b());
                    } else {
                        aVar3.mo3711b(i3 - aVar3.mo3712c());
                    }
                }
            }
            int i15 = b2;
            int i16 = g;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = f;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i21 = c;
            while (i19 < size) {
                C0669a aVar4 = this.aU.get(i19);
                if (i2 == 0) {
                    if (i19 < size - 1) {
                        constraintAnchor2 = this.aU.get(i19 + 1).f2691a.f2582z;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.f2533B;
                        i7 = mo3738c();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar4.f2691a.f2533B;
                    i5 = i19;
                    aVar4.mo3707a(i2, constraintAnchor8, constraintAnchor7, constraintAnchor5, constraintAnchor2, i20, i15, i16, i7, i3);
                    int max = Math.max(i18, aVar4.mo3710b());
                    i17 += aVar4.mo3712c();
                    if (i5 > 0) {
                        i17 += this.aI;
                    }
                    constraintAnchor8 = constraintAnchor8;
                    i18 = max;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor5;
                    i15 = 0;
                    constraintAnchor6 = constraintAnchor2;
                    i21 = i7;
                } else {
                    i5 = i19;
                    if (i5 < size - 1) {
                        aVar = aVar4;
                        constraintAnchor = this.aU.get(i5 + 1).f2691a.f2581y;
                        i6 = 0;
                    } else {
                        aVar = aVar4;
                        constraintAnchor = this.f2532A;
                        i6 = mo3741g();
                    }
                    ConstraintAnchor constraintAnchor10 = aVar.f2691a.f2532A;
                    aVar.mo3707a(i2, constraintAnchor8, constraintAnchor7, constraintAnchor, constraintAnchor6, i20, i15, i6, i21, i3);
                    i18 += aVar.mo3710b();
                    int max2 = Math.max(i17, aVar.mo3712c());
                    if (i5 > 0) {
                        i18 += this.aH;
                    }
                    i17 = max2;
                    i16 = i6;
                    constraintAnchor8 = constraintAnchor10;
                    i20 = 0;
                }
                i19 = i5 + 1;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i18;
            iArr[1] = i17;
        }
    }
}
