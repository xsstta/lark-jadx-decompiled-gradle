package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0626c;
import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p;
import androidx.constraintlayout.solver.widgets.p025a.C0645c;
import androidx.constraintlayout.solver.widgets.p025a.C0655l;
import androidx.constraintlayout.solver.widgets.p025a.C0658n;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {

    /* renamed from: X */
    public static float f2531X = 0.5f;

    /* renamed from: A */
    public ConstraintAnchor f2532A = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);

    /* renamed from: B */
    public ConstraintAnchor f2533B = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);

    /* renamed from: C */
    public ConstraintAnchor f2534C = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);

    /* renamed from: D */
    ConstraintAnchor f2535D = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);

    /* renamed from: E */
    ConstraintAnchor f2536E = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    /* renamed from: F */
    public ConstraintAnchor f2537F;

    /* renamed from: G */
    public ConstraintAnchor[] f2538G;

    /* renamed from: H */
    protected ArrayList<ConstraintAnchor> f2539H;

    /* renamed from: I */
    public DimensionBehaviour[] f2540I;

    /* renamed from: J */
    public ConstraintWidget f2541J;

    /* renamed from: K */
    int f2542K;

    /* renamed from: L */
    int f2543L;

    /* renamed from: M */
    public float f2544M;

    /* renamed from: N */
    protected int f2545N;

    /* renamed from: O */
    protected int f2546O;

    /* renamed from: P */
    protected int f2547P;

    /* renamed from: Q */
    int f2548Q;

    /* renamed from: R */
    int f2549R;

    /* renamed from: S */
    protected int f2550S;

    /* renamed from: T */
    protected int f2551T;

    /* renamed from: U */
    int f2552U;

    /* renamed from: V */
    protected int f2553V;

    /* renamed from: W */
    protected int f2554W;

    /* renamed from: Y */
    float f2555Y;

    /* renamed from: Z */
    float f2556Z;

    /* renamed from: a */
    private boolean f2557a = true;
    private int[] aA = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private int aF;
    private int aG;
    private boolean[] aH;
    private Object aI;
    private int aJ;
    private int aK;
    private String aL;
    private String aM;
    int aa;
    int ab;
    int ac;
    int ad;
    boolean ae;
    boolean af;
    boolean ag;
    boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    boolean f175413ai;
    boolean aj;
    boolean ak;
    int al;
    int am;
    boolean an;
    boolean ao;
    public float[] ap;
    protected ConstraintWidget[] aq;
    protected ConstraintWidget[] ar;
    ConstraintWidget as;
    ConstraintWidget at;
    public int au;
    public int av;
    private boolean aw;
    private boolean ax = true;
    private boolean ay;
    private boolean az;

    /* renamed from: b */
    public boolean f2558b;

    /* renamed from: c */
    public AbstractC0662p[] f2559c = new AbstractC0662p[2];

    /* renamed from: d */
    public C0645c f2560d;

    /* renamed from: e */
    public C0645c f2561e;

    /* renamed from: f */
    public C0655l f2562f;

    /* renamed from: g */
    public C0658n f2563g;

    /* renamed from: h */
    public boolean[] f2564h = {true, true};

    /* renamed from: i */
    boolean f2565i;

    /* renamed from: j */
    public int f2566j = -1;

    /* renamed from: k */
    public int f2567k = -1;

    /* renamed from: l */
    public int f2568l;

    /* renamed from: m */
    public int f2569m;

    /* renamed from: n */
    public int[] f2570n = new int[2];

    /* renamed from: o */
    public int f2571o;

    /* renamed from: p */
    public int f2572p;

    /* renamed from: q */
    public float f2573q = 1.0f;

    /* renamed from: r */
    public int f2574r;

    /* renamed from: s */
    public int f2575s;

    /* renamed from: t */
    public float f2576t = 1.0f;

    /* renamed from: u */
    public boolean f2577u;

    /* renamed from: v */
    public boolean f2578v;

    /* renamed from: w */
    int f2579w = -1;

    /* renamed from: x */
    float f2580x = 1.0f;

    /* renamed from: y */
    public ConstraintAnchor f2581y = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);

    /* renamed from: z */
    public ConstraintAnchor f2582z = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: C */
    public int mo3501C() {
        return this.f2553V;
    }

    /* renamed from: D */
    public int mo3502D() {
        return this.f2554W;
    }

    /* renamed from: I */
    public float mo3507I() {
        return this.f2555Y;
    }

    /* renamed from: J */
    public float mo3508J() {
        return this.f2556Z;
    }

    /* renamed from: K */
    public boolean mo3509K() {
        return this.aC;
    }

    /* renamed from: L */
    public int mo3510L() {
        return this.f2552U;
    }

    /* renamed from: M */
    public Object mo3511M() {
        return this.aI;
    }

    /* renamed from: N */
    public float mo3512N() {
        return this.f2544M;
    }

    /* renamed from: O */
    public int mo3513O() {
        return this.f2545N;
    }

    /* renamed from: P */
    public int mo3514P() {
        return this.al;
    }

    /* renamed from: Q */
    public int mo3515Q() {
        return this.am;
    }

    /* renamed from: l */
    public boolean mo3574l() {
        return this.aE;
    }

    /* renamed from: o */
    public boolean mo3580o() {
        return this.aD;
    }

    /* renamed from: q */
    public int mo3583q() {
        return this.aF;
    }

    /* renamed from: r */
    public int mo3585r() {
        return this.aG;
    }

    /* renamed from: v */
    public ConstraintWidget mo3595v() {
        return this.f2541J;
    }

    /* renamed from: w */
    public int mo3596w() {
        return this.aK;
    }

    /* renamed from: x */
    public String mo3599x() {
        return this.aL;
    }

    /* renamed from: a */
    public void mo3535a(ConstraintWidget constraintWidget, float f, int i) {
        mo3532a(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.aB = f;
    }

    /* renamed from: a */
    public void mo3539a(String str) {
        this.aL = str;
    }

    /* renamed from: a */
    public void mo3529a(C0627d dVar) {
        dVar.mo3440a(this.f2581y);
        dVar.mo3440a(this.f2582z);
        dVar.mo3440a(this.f2532A);
        dVar.mo3440a(this.f2533B);
        if (this.f2552U > 0) {
            dVar.mo3440a(this.f2534C);
        }
    }

    /* renamed from: a */
    public void mo3538a(Object obj) {
        this.aI = obj;
    }

    /* renamed from: a */
    public boolean mo3542a() {
        return this.aK != 8;
    }

    /* renamed from: a */
    public void mo3533a(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.mo3491h() == this) {
            mo3531a(constraintAnchor.mo3492i(), constraintAnchor2.mo3491h(), constraintAnchor2.mo3492i(), i);
        }
    }

    /* renamed from: a */
    public void mo3531a(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor a = mo3522a(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor a2 = mo3522a(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor a3 = mo3522a(ConstraintAnchor.Type.TOP);
                ConstraintAnchor a4 = mo3522a(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((a == null || !a.mo3496m()) && (a2 == null || !a2.mo3496m())) {
                    mo3531a(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    mo3531a(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((a3 == null || !a3.mo3496m()) && (a4 == null || !a4.mo3496m())) {
                    mo3531a(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    mo3531a(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    mo3522a(ConstraintAnchor.Type.CENTER).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.CENTER), 0);
                } else if (z) {
                    mo3522a(ConstraintAnchor.Type.CENTER_X).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.CENTER_X), 0);
                } else if (z2) {
                    mo3522a(ConstraintAnchor.Type.CENTER_Y).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.CENTER_Y), 0);
                }
            } else if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                mo3531a(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                mo3531a(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                mo3522a(ConstraintAnchor.Type.CENTER).mo3482a(constraintWidget.mo3522a(type2), 0);
            } else if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                mo3531a(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                mo3531a(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                mo3522a(ConstraintAnchor.Type.CENTER).mo3482a(constraintWidget.mo3522a(type2), 0);
            }
        } else if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor a5 = mo3522a(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor a6 = constraintWidget.mo3522a(type2);
            ConstraintAnchor a7 = mo3522a(ConstraintAnchor.Type.RIGHT);
            a5.mo3482a(a6, 0);
            a7.mo3482a(a6, 0);
            mo3522a(ConstraintAnchor.Type.CENTER_X).mo3482a(a6, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor a8 = constraintWidget.mo3522a(type2);
            mo3522a(ConstraintAnchor.Type.TOP).mo3482a(a8, 0);
            mo3522a(ConstraintAnchor.Type.BOTTOM).mo3482a(a8, 0);
            mo3522a(ConstraintAnchor.Type.CENTER_Y).mo3482a(a8, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            mo3522a(ConstraintAnchor.Type.LEFT).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.LEFT), 0);
            mo3522a(ConstraintAnchor.Type.RIGHT).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.RIGHT), 0);
            mo3522a(ConstraintAnchor.Type.CENTER_X).mo3482a(constraintWidget.mo3522a(type2), 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            mo3522a(ConstraintAnchor.Type.TOP).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.TOP), 0);
            mo3522a(ConstraintAnchor.Type.BOTTOM).mo3482a(constraintWidget.mo3522a(ConstraintAnchor.Type.BOTTOM), 0);
            mo3522a(ConstraintAnchor.Type.CENTER_Y).mo3482a(constraintWidget.mo3522a(type2), 0);
        } else {
            ConstraintAnchor a9 = mo3522a(type);
            ConstraintAnchor a10 = constraintWidget.mo3522a(type2);
            if (a9.mo3481a(a10)) {
                if (type == ConstraintAnchor.Type.BASELINE) {
                    ConstraintAnchor a11 = mo3522a(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor a12 = mo3522a(ConstraintAnchor.Type.BOTTOM);
                    if (a11 != null) {
                        a11.mo3495l();
                    }
                    if (a12 != null) {
                        a12.mo3495l();
                    }
                    i = 0;
                } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                    ConstraintAnchor a13 = mo3522a(ConstraintAnchor.Type.BASELINE);
                    if (a13 != null) {
                        a13.mo3495l();
                    }
                    ConstraintAnchor a14 = mo3522a(ConstraintAnchor.Type.CENTER);
                    if (a14.mo3494k() != a10) {
                        a14.mo3495l();
                    }
                    ConstraintAnchor n = mo3522a(type).mo3497n();
                    ConstraintAnchor a15 = mo3522a(ConstraintAnchor.Type.CENTER_Y);
                    if (a15.mo3496m()) {
                        n.mo3495l();
                        a15.mo3495l();
                    }
                } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor a16 = mo3522a(ConstraintAnchor.Type.CENTER);
                    if (a16.mo3494k() != a10) {
                        a16.mo3495l();
                    }
                    ConstraintAnchor n2 = mo3522a(type).mo3497n();
                    ConstraintAnchor a17 = mo3522a(ConstraintAnchor.Type.CENTER_X);
                    if (a17.mo3496m()) {
                        n2.mo3495l();
                        a17.mo3495l();
                    }
                }
                a9.mo3482a(a10, i);
            }
        }
    }

    /* renamed from: a */
    public void mo3534a(DimensionBehaviour dimensionBehaviour) {
        this.f2540I[0] = dimensionBehaviour;
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3530a(androidx.constraintlayout.solver.C0627d r51, boolean r52) {
        /*
        // Method dump skipped, instructions count: 1557
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo3530a(androidx.constraintlayout.solver.d, boolean):void");
    }

    /* renamed from: a */
    public void mo3541a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f2579w == -1) {
            if (z3 && !z4) {
                this.f2579w = 0;
            } else if (!z3 && z4) {
                this.f2579w = 1;
                if (this.f2545N == -1) {
                    this.f2580x = 1.0f / this.f2580x;
                }
            }
        }
        if (this.f2579w == 0 && (!this.f2582z.mo3496m() || !this.f2533B.mo3496m())) {
            this.f2579w = 1;
        } else if (this.f2579w == 1 && (!this.f2581y.mo3496m() || !this.f2532A.mo3496m())) {
            this.f2579w = 0;
        }
        if (this.f2579w == -1 && (!this.f2582z.mo3496m() || !this.f2533B.mo3496m() || !this.f2581y.mo3496m() || !this.f2532A.mo3496m())) {
            if (this.f2582z.mo3496m() && this.f2533B.mo3496m()) {
                this.f2579w = 0;
            } else if (this.f2581y.mo3496m() && this.f2532A.mo3496m()) {
                this.f2580x = 1.0f / this.f2580x;
                this.f2579w = 1;
            }
        }
        if (this.f2579w == -1) {
            int i = this.f2571o;
            if (i > 0 && this.f2574r == 0) {
                this.f2579w = 0;
            } else if (i == 0 && this.f2574r > 0) {
                this.f2580x = 1.0f / this.f2580x;
                this.f2579w = 1;
            }
        }
    }

    /* renamed from: a */
    public void mo3536a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.f2566j = constraintWidget.f2566j;
        this.f2567k = constraintWidget.f2567k;
        this.f2568l = constraintWidget.f2568l;
        this.f2569m = constraintWidget.f2569m;
        int[] iArr = this.f2570n;
        int[] iArr2 = constraintWidget.f2570n;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f2571o = constraintWidget.f2571o;
        this.f2572p = constraintWidget.f2572p;
        this.f2574r = constraintWidget.f2574r;
        this.f2575s = constraintWidget.f2575s;
        this.f2576t = constraintWidget.f2576t;
        this.f2577u = constraintWidget.f2577u;
        this.f2578v = constraintWidget.f2578v;
        this.f2579w = constraintWidget.f2579w;
        this.f2580x = constraintWidget.f2580x;
        int[] iArr3 = constraintWidget.aA;
        this.aA = Arrays.copyOf(iArr3, iArr3.length);
        this.aB = constraintWidget.aB;
        this.aC = constraintWidget.aC;
        this.aD = constraintWidget.aD;
        this.f2581y.mo3495l();
        this.f2582z.mo3495l();
        this.f2532A.mo3495l();
        this.f2533B.mo3495l();
        this.f2534C.mo3495l();
        this.f2535D.mo3495l();
        this.f2536E.mo3495l();
        this.f2537F.mo3495l();
        this.f2540I = (DimensionBehaviour[]) Arrays.copyOf(this.f2540I, 2);
        ConstraintWidget constraintWidget2 = null;
        this.f2541J = this.f2541J == null ? null : hashMap.get(constraintWidget.f2541J);
        this.f2542K = constraintWidget.f2542K;
        this.f2543L = constraintWidget.f2543L;
        this.f2544M = constraintWidget.f2544M;
        this.f2545N = constraintWidget.f2545N;
        this.f2546O = constraintWidget.f2546O;
        this.f2547P = constraintWidget.f2547P;
        this.f2548Q = constraintWidget.f2548Q;
        this.f2549R = constraintWidget.f2549R;
        this.f2550S = constraintWidget.f2550S;
        this.f2551T = constraintWidget.f2551T;
        this.f2552U = constraintWidget.f2552U;
        this.f2553V = constraintWidget.f2553V;
        this.f2554W = constraintWidget.f2554W;
        this.f2555Y = constraintWidget.f2555Y;
        this.f2556Z = constraintWidget.f2556Z;
        this.aI = constraintWidget.aI;
        this.aJ = constraintWidget.aJ;
        this.aK = constraintWidget.aK;
        this.aL = constraintWidget.aL;
        this.aM = constraintWidget.aM;
        this.aa = constraintWidget.aa;
        this.ab = constraintWidget.ab;
        this.ac = constraintWidget.ac;
        this.ad = constraintWidget.ad;
        this.ae = constraintWidget.ae;
        this.af = constraintWidget.af;
        this.ag = constraintWidget.ag;
        this.ah = constraintWidget.ah;
        this.f175413ai = constraintWidget.f175413ai;
        this.aj = constraintWidget.aj;
        this.al = constraintWidget.al;
        this.am = constraintWidget.am;
        this.an = constraintWidget.an;
        this.ao = constraintWidget.ao;
        float[] fArr = this.ap;
        float[] fArr2 = constraintWidget.ap;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.aq;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.aq;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.ar;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.ar;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.as;
        this.as = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.at;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.at = constraintWidget2;
    }

    /* renamed from: a */
    public void mo3540a(boolean z, boolean z2) {
        int i;
        int i2;
        boolean g = z & this.f2562f.mo3657g();
        boolean g2 = z2 & this.f2563g.mo3657g();
        int i3 = this.f2562f.f2662j.f2619g;
        int i4 = this.f2563g.f2662j.f2619g;
        int i5 = this.f2562f.f2663k.f2619g;
        int i6 = this.f2563g.f2663k.f2619g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (g) {
            this.f2546O = i3;
        }
        if (g2) {
            this.f2547P = i4;
        }
        if (this.aK == 8) {
            this.f2542K = 0;
            this.f2543L = 0;
            return;
        }
        if (g) {
            if (this.f2540I[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f2542K)) {
                i8 = i2;
            }
            this.f2542K = i8;
            int i10 = this.f2553V;
            if (i8 < i10) {
                this.f2542K = i10;
            }
        }
        if (g2) {
            if (this.f2540I[1] == DimensionBehaviour.FIXED && i9 < (i = this.f2543L)) {
                i9 = i;
            }
            this.f2543L = i9;
            int i11 = this.f2554W;
            if (i9 < i11) {
                this.f2543L = i11;
            }
        }
    }

    /* renamed from: a */
    public void mo3537a(C0667d dVar, C0627d dVar2, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C0674i.m3294a(dVar, dVar2, this);
                hashSet.remove(this);
                mo3530a(dVar2, dVar.mo3673b(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> a = this.f2581y.mo3477a();
            if (a != null) {
                Iterator<ConstraintAnchor> it = a.iterator();
                while (it.hasNext()) {
                    it.next().f2521a.mo3537a(dVar, dVar2, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> a2 = this.f2532A.mo3477a();
            if (a2 != null) {
                Iterator<ConstraintAnchor> it2 = a2.iterator();
                while (it2.hasNext()) {
                    it2.next().f2521a.mo3537a(dVar, dVar2, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> a3 = this.f2582z.mo3477a();
        if (a3 != null) {
            Iterator<ConstraintAnchor> it3 = a3.iterator();
            while (it3.hasNext()) {
                it3.next().f2521a.mo3537a(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> a4 = this.f2533B.mo3477a();
        if (a4 != null) {
            Iterator<ConstraintAnchor> it4 = a4.iterator();
            while (it4.hasNext()) {
                it4.next().f2521a.mo3537a(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> a5 = this.f2534C.mo3477a();
        if (a5 != null) {
            Iterator<ConstraintAnchor> it5 = a5.iterator();
            while (it5.hasNext()) {
                it5.next().f2521a.mo3537a(dVar, dVar2, hashSet, i, true);
            }
        }
    }

    /* renamed from: E */
    public int mo3503E() {
        return mo3600y() + this.f2542K;
    }

    /* renamed from: F */
    public int mo3504F() {
        return mo3601z() + this.f2543L;
    }

    /* renamed from: S */
    public DimensionBehaviour mo3517S() {
        return this.f2540I[0];
    }

    /* renamed from: T */
    public DimensionBehaviour mo3518T() {
        return this.f2540I[1];
    }

    /* renamed from: m */
    public int mo3575m() {
        return this.aA[1];
    }

    /* renamed from: n */
    public int mo3577n() {
        return this.aA[0];
    }

    /* renamed from: A */
    public int mo3499A() {
        if (this.aK == 8) {
            return 0;
        }
        return this.f2542K;
    }

    /* renamed from: B */
    public int mo3500B() {
        if (this.aK == 8) {
            return 0;
        }
        return this.f2543L;
    }

    /* renamed from: G */
    public int mo3505G() {
        ConstraintAnchor constraintAnchor = this.f2581y;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.f2524d;
        }
        ConstraintAnchor constraintAnchor2 = this.f2532A;
        if (constraintAnchor2 != null) {
            return i + constraintAnchor2.f2524d;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo3521W() {
        if ((this instanceof C0675j) || (this instanceof C0670f)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public int mo3506H() {
        int i = 0;
        if (this.f2581y != null) {
            i = 0 + this.f2582z.f2524d;
        }
        if (this.f2532A != null) {
            return i + this.f2533B.f2524d;
        }
        return i;
    }

    public void d_() {
        this.ay = false;
        this.az = false;
        int size = this.f2539H.size();
        for (int i = 0; i < size; i++) {
            this.f2539H.get(i).mo3488e();
        }
    }

    /* renamed from: e */
    public boolean mo3564e() {
        if (this.az || (this.f2582z.mo3489f() && this.f2533B.mo3489f())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo3582p() {
        if (!this.f2557a || this.aK == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo3590t() {
        if (this.f2540I[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.f2540I[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void mo3592u() {
        if (this.f2562f == null) {
            this.f2562f = new C0655l(this);
        }
        if (this.f2563g == null) {
            this.f2563g = new C0658n(this);
        }
    }

    /* renamed from: y */
    public int mo3600y() {
        ConstraintWidget constraintWidget = this.f2541J;
        if (constraintWidget == null || !(constraintWidget instanceof C0667d)) {
            return this.f2546O;
        }
        return ((C0667d) constraintWidget).aA + this.f2546O;
    }

    /* renamed from: z */
    public int mo3601z() {
        ConstraintWidget constraintWidget = this.f2541J;
        if (constraintWidget == null || !(constraintWidget instanceof C0667d)) {
            return this.f2547P;
        }
        return ((C0667d) constraintWidget).aB + this.f2547P;
    }

    /* renamed from: b */
    private void mo3604b() {
        this.f2539H.add(this.f2581y);
        this.f2539H.add(this.f2582z);
        this.f2539H.add(this.f2532A);
        this.f2539H.add(this.f2533B);
        this.f2539H.add(this.f2535D);
        this.f2539H.add(this.f2536E);
        this.f2539H.add(this.f2537F);
        this.f2539H.add(this.f2534C);
    }

    /* renamed from: R */
    public void mo3516R() {
        ConstraintWidget v = mo3595v();
        if (v == null || !(v instanceof C0667d) || !((C0667d) mo3595v()).aa()) {
            int size = this.f2539H.size();
            for (int i = 0; i < size; i++) {
                this.f2539H.get(i).mo3495l();
            }
        }
    }

    /* renamed from: U */
    public boolean mo3519U() {
        if (this.f2581y.f2523c != null && this.f2581y.f2523c.f2523c == this.f2581y) {
            return true;
        }
        if (this.f2532A.f2523c == null || this.f2532A.f2523c.f2523c != this.f2532A) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public boolean mo3520V() {
        if (this.f2582z.f2523c != null && this.f2582z.f2523c.f2523c == this.f2582z) {
            return true;
        }
        if (this.f2533B.f2523c == null || this.f2533B.f2523c.f2523c != this.f2533B) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo3559d() {
        if (this.ay || (this.f2581y.mo3489f() && this.f2532A.mo3489f())) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo3572k() {
        int size = this.f2539H.size();
        for (int i = 0; i < size; i++) {
            if (this.f2539H.get(i).mo3485b()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.aM != null) {
            str = "type: " + this.aM + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.aL != null) {
            str2 = "id: " + this.aL + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f2546O);
        sb.append(", ");
        sb.append(this.f2547P);
        sb.append(") - (");
        sb.append(this.f2542K);
        sb.append(" x ");
        sb.append(this.f2543L);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 */
    public static /* synthetic */ class C06391 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2583a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2584b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
            // Method dump skipped, instructions count: 156
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.C06391.<clinit>():void");
        }
    }

    /* renamed from: s */
    public void mo3587s() {
        this.f2581y.mo3495l();
        this.f2582z.mo3495l();
        this.f2532A.mo3495l();
        this.f2533B.mo3495l();
        this.f2534C.mo3495l();
        this.f2535D.mo3495l();
        this.f2536E.mo3495l();
        this.f2537F.mo3495l();
        this.f2541J = null;
        this.aB = BitmapDescriptorFactory.HUE_RED;
        this.f2542K = 0;
        this.f2543L = 0;
        this.f2544M = BitmapDescriptorFactory.HUE_RED;
        this.f2545N = -1;
        this.f2546O = 0;
        this.f2547P = 0;
        this.f2550S = 0;
        this.f2551T = 0;
        this.f2552U = 0;
        this.f2553V = 0;
        this.f2554W = 0;
        float f = f2531X;
        this.f2555Y = f;
        this.f2556Z = f;
        this.f2540I[0] = DimensionBehaviour.FIXED;
        this.f2540I[1] = DimensionBehaviour.FIXED;
        this.aI = null;
        this.aJ = 0;
        this.aK = 0;
        this.aM = null;
        this.f175413ai = false;
        this.aj = false;
        this.al = 0;
        this.am = 0;
        this.an = false;
        this.ao = false;
        float[] fArr = this.ap;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2566j = -1;
        this.f2567k = -1;
        int[] iArr = this.aA;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2568l = 0;
        this.f2569m = 0;
        this.f2573q = 1.0f;
        this.f2576t = 1.0f;
        this.f2572p = Integer.MAX_VALUE;
        this.f2575s = Integer.MAX_VALUE;
        this.f2571o = 0;
        this.f2574r = 0;
        this.f2565i = false;
        this.f2579w = -1;
        this.f2580x = 1.0f;
        this.ak = false;
        boolean[] zArr = this.f2564h;
        zArr[0] = true;
        zArr[1] = true;
        this.aE = false;
        boolean[] zArr2 = this.aH;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2557a = true;
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f2537F = constraintAnchor;
        this.f2538G = new ConstraintAnchor[]{this.f2581y, this.f2532A, this.f2582z, this.f2533B, this.f2534C, constraintAnchor};
        this.f2539H = new ArrayList<>();
        this.aH = new boolean[2];
        this.f2540I = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.f2541J = null;
        this.f2542K = 0;
        this.f2543L = 0;
        this.f2544M = BitmapDescriptorFactory.HUE_RED;
        this.f2545N = -1;
        this.f2546O = 0;
        this.f2547P = 0;
        this.f2548Q = 0;
        this.f2549R = 0;
        this.f2550S = 0;
        this.f2551T = 0;
        this.f2552U = 0;
        float f = f2531X;
        this.f2555Y = f;
        this.f2556Z = f;
        this.aJ = 0;
        this.aK = 0;
        this.aL = null;
        this.aM = null;
        this.ak = false;
        this.al = 0;
        this.am = 0;
        this.ap = new float[]{-1.0f, -1.0f};
        this.aq = new ConstraintWidget[]{null, null};
        this.ar = new ConstraintWidget[]{null, null};
        this.as = null;
        this.at = null;
        this.au = -1;
        this.av = -1;
        mo3604b();
    }

    /* renamed from: a */
    public void mo3523a(float f) {
        this.f2555Y = f;
    }

    public void a_(ConstraintWidget constraintWidget) {
        this.f2541J = constraintWidget;
    }

    /* renamed from: b */
    public void mo3544b(float f) {
        this.f2556Z = f;
    }

    /* renamed from: c */
    public void mo3554c(boolean z) {
        this.aC = z;
    }

    /* renamed from: d */
    public void mo3558d(boolean z) {
        this.aD = z;
    }

    /* renamed from: e */
    public void mo3563e(boolean z) {
        this.f2557a = z;
    }

    /* renamed from: j */
    public void mo3570j(int i) {
        this.aK = i;
    }

    /* renamed from: m */
    public void mo3576m(int i) {
        this.f2546O = i;
    }

    /* renamed from: n */
    public void mo3578n(int i) {
        this.f2547P = i;
    }

    /* renamed from: t */
    public void mo3589t(int i) {
        this.al = i;
    }

    /* renamed from: u */
    public void mo3593u(int i) {
        this.am = i;
    }

    /* renamed from: b */
    public void mo3548b(DimensionBehaviour dimensionBehaviour) {
        this.f2540I[1] = dimensionBehaviour;
    }

    /* renamed from: c */
    public void mo3552c(float f) {
        this.ap[0] = f;
    }

    /* renamed from: d */
    public void mo3555d(float f) {
        this.ap[1] = f;
    }

    /* renamed from: e */
    public void mo3561e(int i) {
        this.f2582z.mo3478a(i);
        this.f2547P = i;
    }

    /* renamed from: h */
    public void mo3568h(int i) {
        this.aA[0] = i;
    }

    /* renamed from: i */
    public void mo3569i(int i) {
        this.aA[1] = i;
    }

    /* renamed from: b */
    public void mo3550b(boolean z) {
        this.aE = z;
    }

    /* renamed from: c */
    public AbstractC0662p mo3551c(int i) {
        if (i == 0) {
            return this.f2562f;
        }
        if (i == 1) {
            return this.f2563g;
        }
        return null;
    }

    /* renamed from: d */
    public void mo3556d(int i) {
        this.f2581y.mo3478a(i);
        this.f2546O = i;
    }

    /* renamed from: l */
    public float mo3573l(int i) {
        if (i == 0) {
            return this.f2555Y;
        }
        if (i == 1) {
            return this.f2556Z;
        }
        return -1.0f;
    }

    /* renamed from: o */
    public void mo3579o(int i) {
        this.f2542K = i;
        int i2 = this.f2553V;
        if (i < i2) {
            this.f2542K = i2;
        }
    }

    /* renamed from: p */
    public void mo3581p(int i) {
        this.f2543L = i;
        int i2 = this.f2554W;
        if (i < i2) {
            this.f2543L = i2;
        }
    }

    /* renamed from: q */
    public void mo3584q(int i) {
        if (i < 0) {
            this.f2553V = 0;
        } else {
            this.f2553V = i;
        }
    }

    /* renamed from: r */
    public void mo3586r(int i) {
        if (i < 0) {
            this.f2554W = 0;
        } else {
            this.f2554W = i;
        }
    }

    /* renamed from: s */
    public void mo3588s(int i) {
        boolean z;
        this.f2552U = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.aC = z;
    }

    /* renamed from: k */
    public int mo3571k(int i) {
        if (i == 0) {
            return mo3499A();
        }
        if (i == 1) {
            return mo3500B();
        }
        return 0;
    }

    /* renamed from: v */
    public DimensionBehaviour mo3594v(int i) {
        if (i == 0) {
            return mo3517S();
        }
        if (i == 1) {
            return mo3518T();
        }
        return null;
    }

    /* renamed from: a */
    private boolean mo3602a(int i) {
        int i2 = i * 2;
        if (this.f2538G[i2].f2523c != null) {
            ConstraintAnchor constraintAnchor = this.f2538G[i2].f2523c.f2523c;
            ConstraintAnchor[] constraintAnchorArr = this.f2538G;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].f2523c == null || this.f2538G[i3].f2523c.f2523c != this.f2538G[i3]) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo3565f(int i) {
        if (this.aC) {
            int i2 = i - this.f2552U;
            int i3 = this.f2543L + i2;
            this.f2547P = i2;
            this.f2582z.mo3478a(i2);
            this.f2533B.mo3478a(i3);
            this.f2534C.mo3478a(i);
            this.az = true;
        }
    }

    /* renamed from: g */
    public boolean mo3567g(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.f2581y.f2523c != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f2532A.f2523c != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.f2582z.f2523c != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f2533B.f2523c != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.f2534C.f2523c != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public ConstraintWidget mo3597w(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.f2581y.f2523c == null || this.f2581y.f2523c.f2523c != (constraintAnchor2 = this.f2581y)) {
                return null;
            }
            return constraintAnchor2.f2523c.f2521a;
        } else if (i == 1 && this.f2582z.f2523c != null && this.f2582z.f2523c.f2523c == (constraintAnchor = this.f2582z)) {
            return constraintAnchor.f2523c.f2521a;
        } else {
            return null;
        }
    }

    /* renamed from: x */
    public ConstraintWidget mo3598x(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.f2532A.f2523c == null || this.f2532A.f2523c.f2523c != (constraintAnchor2 = this.f2532A)) {
                return null;
            }
            return constraintAnchor2.f2523c.f2521a;
        } else if (i == 1 && this.f2533B.f2523c != null && this.f2533B.f2523c.f2523c == (constraintAnchor = this.f2533B)) {
            return constraintAnchor.f2523c.f2521a;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public ConstraintAnchor mo3522a(ConstraintAnchor.Type type) {
        switch (C06391.f2583a[type.ordinal()]) {
            case 1:
                return this.f2581y;
            case 2:
                return this.f2582z;
            case 3:
                return this.f2532A;
            case 4:
                return this.f2533B;
            case 5:
                return this.f2534C;
            case 6:
                return this.f2537F;
            case 7:
                return this.f2535D;
            case 8:
                return this.f2536E;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3549b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.mo3549b(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo3528a(C0626c cVar) {
        this.f2581y.mo3480a(cVar);
        this.f2582z.mo3480a(cVar);
        this.f2532A.mo3480a(cVar);
        this.f2533B.mo3480a(cVar);
        this.f2534C.mo3480a(cVar);
        this.f2537F.mo3480a(cVar);
        this.f2535D.mo3480a(cVar);
        this.f2536E.mo3480a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3527a(int i, boolean z) {
        this.aH[i] = z;
    }

    /* renamed from: e */
    public void mo3562e(int i, int i2) {
        this.f2546O = i;
        int i3 = i2 - i;
        this.f2542K = i3;
        int i4 = this.f2553V;
        if (i3 < i4) {
            this.f2542K = i4;
        }
    }

    /* renamed from: f */
    public void mo3566f(int i, int i2) {
        this.f2547P = i;
        int i3 = i2 - i;
        this.f2543L = i3;
        int i4 = this.f2554W;
        if (i3 < i4) {
            this.f2543L = i4;
        }
    }

    /* renamed from: a */
    public void mo3524a(int i, int i2) {
        this.f2581y.mo3478a(i);
        this.f2532A.mo3478a(i2);
        this.f2546O = i;
        this.f2542K = i2 - i;
        this.ay = true;
    }

    /* renamed from: b */
    public void mo3545b(int i, int i2) {
        this.f2582z.mo3478a(i);
        this.f2533B.mo3478a(i2);
        this.f2547P = i;
        this.f2543L = i2 - i;
        if (this.aC) {
            this.f2534C.mo3478a(i + this.f2552U);
        }
        this.az = true;
    }

    /* renamed from: c */
    public void mo3553c(int i, int i2) {
        this.aF = i;
        this.aG = i2;
        mo3563e(false);
    }

    /* renamed from: d */
    public void mo3557d(int i, int i2) {
        this.f2546O = i;
        this.f2547P = i2;
    }

    /* renamed from: b */
    public void mo3547b(C0627d dVar, boolean z) {
        C0658n nVar;
        C0655l lVar;
        int b = dVar.mo3451b(this.f2581y);
        int b2 = dVar.mo3451b(this.f2582z);
        int b3 = dVar.mo3451b(this.f2532A);
        int b4 = dVar.mo3451b(this.f2533B);
        if (z && (lVar = this.f2562f) != null && lVar.f2662j.f2622j && this.f2562f.f2663k.f2622j) {
            b = this.f2562f.f2662j.f2619g;
            b3 = this.f2562f.f2663k.f2619g;
        }
        if (z && (nVar = this.f2563g) != null && nVar.f2662j.f2622j && this.f2563g.f2663k.f2622j) {
            b2 = this.f2563g.f2662j.f2619g;
            b4 = this.f2563g.f2663k.f2619g;
        }
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        mo3526a(b, b2, b3, b4);
    }

    /* renamed from: b */
    public void mo3546b(int i, int i2, int i3, float f) {
        this.f2569m = i;
        this.f2574r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2575s = i3;
        this.f2576t = f;
        if (f > BitmapDescriptorFactory.HUE_RED && f < 1.0f && i == 0) {
            this.f2569m = 2;
        }
    }

    /* renamed from: a */
    public void mo3525a(int i, int i2, int i3, float f) {
        this.f2568l = i;
        this.f2571o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2572p = i3;
        this.f2573q = f;
        if (f > BitmapDescriptorFactory.HUE_RED && f < 1.0f && i == 0) {
            this.f2568l = 2;
        }
    }

    /* renamed from: a */
    public void mo3526a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f2546O = i;
        this.f2547P = i2;
        if (this.aK == 8) {
            this.f2542K = 0;
            this.f2543L = 0;
            return;
        }
        if (this.f2540I[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.f2542K)) {
            i7 = i6;
        }
        if (this.f2540I[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.f2543L)) {
            i8 = i5;
        }
        this.f2542K = i7;
        this.f2543L = i8;
        int i9 = this.f2554W;
        if (i8 < i9) {
            this.f2543L = i9;
        }
        int i10 = this.f2553V;
        if (i7 < i10) {
            this.f2542K = i10;
        }
    }

    /* renamed from: a */
    public void mo3532a(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo3522a(type).mo3483a(constraintWidget.mo3522a(type2), i, i2, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04a8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:344:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2969a(androidx.constraintlayout.solver.C0627d r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.solver.SolverVariable r37, androidx.constraintlayout.solver.SolverVariable r38, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.solver.widgets.ConstraintAnchor r41, androidx.constraintlayout.solver.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
        // Method dump skipped, instructions count: 1321
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.m2969a(androidx.constraintlayout.solver.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }
}
