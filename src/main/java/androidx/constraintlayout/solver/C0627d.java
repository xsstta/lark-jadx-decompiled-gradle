package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.d */
public class C0627d {

    /* renamed from: a */
    public static boolean f2430a = false;

    /* renamed from: b */
    public static boolean f2431b = true;

    /* renamed from: c */
    public static boolean f2432c = true;

    /* renamed from: d */
    public static boolean f2433d = true;

    /* renamed from: e */
    public static boolean f2434e = true;

    /* renamed from: f */
    public static boolean f2435f = false;

    /* renamed from: o */
    public static C0630e f2436o = null;

    /* renamed from: p */
    public static long f2437p = 0;

    /* renamed from: q */
    public static long f2438q = 0;

    /* renamed from: r */
    private static int f2439r = 1000;

    /* renamed from: A */
    private AbstractC0628a f2440A;

    /* renamed from: g */
    public boolean f2441g;

    /* renamed from: h */
    int f2442h;

    /* renamed from: i */
    C0624b[] f2443i = new C0624b[32];

    /* renamed from: j */
    public boolean f2444j;

    /* renamed from: k */
    public boolean f2445k;

    /* renamed from: l */
    int f2446l = 1;

    /* renamed from: m */
    int f2447m;

    /* renamed from: n */
    final C0626c f2448n;

    /* renamed from: s */
    private HashMap<String, SolverVariable> f2449s;

    /* renamed from: t */
    private AbstractC0628a f2450t;

    /* renamed from: u */
    private int f2451u = 32;

    /* renamed from: v */
    private int f2452v = 32;

    /* renamed from: w */
    private boolean[] f2453w = new boolean[32];

    /* renamed from: x */
    private int f2454x = 32;

    /* renamed from: y */
    private SolverVariable[] f2455y = new SolverVariable[f2439r];

    /* renamed from: z */
    private int f2456z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.d$a */
    public interface AbstractC0628a {
        /* renamed from: a */
        SolverVariable mo3407a(C0627d dVar, boolean[] zArr);

        /* renamed from: a */
        void mo3416a(AbstractC0628a aVar);

        /* renamed from: d */
        void mo3434d(SolverVariable solverVariable);

        /* renamed from: e */
        boolean mo3435e();

        /* renamed from: f */
        void mo3436f();

        /* renamed from: g */
        SolverVariable mo3437g();
    }

    /* renamed from: a */
    public static C0630e m2876a() {
        return f2436o;
    }

    /* renamed from: g */
    public C0626c mo3460g() {
        return this.f2448n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3447a(C0624b bVar, int i, int i2) {
        bVar.mo3430c(mo3439a(i2, (String) null), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3448a(AbstractC0628a aVar) throws Exception {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2482t++;
            C0630e eVar2 = f2436o;
            eVar2.f2483u = Math.max(eVar2.f2483u, (long) this.f2446l);
            C0630e eVar3 = f2436o;
            eVar3.f2484v = Math.max(eVar3.f2484v, (long) this.f2447m);
        }
        m2877b(aVar);
        m2873a(aVar, false);
        m2881j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3446a(androidx.constraintlayout.solver.C0624b r8) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0627d.mo3446a(androidx.constraintlayout.solver.b):void");
    }

    /* renamed from: a */
    public void mo3444a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C0624b c = mo3455c();
        SolverVariable d = mo3457d();
        d.f2395d = 0;
        c.mo3413a(solverVariable, solverVariable2, d, i);
        mo3446a(c);
    }

    /* renamed from: a */
    public void mo3445a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C0624b c = mo3455c();
        c.mo3414a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            c.mo3415a(this, i);
        }
        mo3446a(c);
    }

    /* renamed from: a */
    public void mo3450a(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        SolverVariable a = mo3440a(constraintWidget.mo3522a(ConstraintAnchor.Type.LEFT));
        SolverVariable a2 = mo3440a(constraintWidget.mo3522a(ConstraintAnchor.Type.TOP));
        SolverVariable a3 = mo3440a(constraintWidget.mo3522a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a4 = mo3440a(constraintWidget.mo3522a(ConstraintAnchor.Type.BOTTOM));
        SolverVariable a5 = mo3440a(constraintWidget2.mo3522a(ConstraintAnchor.Type.LEFT));
        SolverVariable a6 = mo3440a(constraintWidget2.mo3522a(ConstraintAnchor.Type.TOP));
        SolverVariable a7 = mo3440a(constraintWidget2.mo3522a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a8 = mo3440a(constraintWidget2.mo3522a(ConstraintAnchor.Type.BOTTOM));
        C0624b c = mo3455c();
        double d = (double) f;
        double d2 = (double) i;
        c.mo3425b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo3446a(c);
        C0624b c2 = mo3455c();
        c2.mo3425b(a, a3, a5, a7, (float) (Math.cos(d) * d2));
        mo3446a(c2);
    }

    /* renamed from: j */
    private void m2881j() {
        for (int i = 0; i < this.f2447m; i++) {
            C0624b bVar = this.f2443i[i];
            bVar.f2420a.f2396e = bVar.f2421b;
        }
    }

    /* renamed from: i */
    private void m2880i() {
        int i = 0;
        if (f2435f) {
            while (i < this.f2447m) {
                C0624b bVar = this.f2443i[i];
                if (bVar != null) {
                    this.f2448n.f2426a.mo3464a(bVar);
                }
                this.f2443i[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f2447m) {
            C0624b bVar2 = this.f2443i[i];
            if (bVar2 != null) {
                this.f2448n.f2427b.mo3464a(bVar2);
            }
            this.f2443i[i] = null;
            i++;
        }
    }

    /* renamed from: d */
    public SolverVariable mo3457d() {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2475m++;
        }
        if (this.f2446l + 1 >= this.f2452v) {
            m2879h();
        }
        SolverVariable a = m2874a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f2442h + 1;
        this.f2442h = i;
        this.f2446l++;
        a.f2393b = i;
        this.f2448n.f2429d[this.f2442h] = a;
        return a;
    }

    /* renamed from: e */
    public SolverVariable mo3458e() {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2476n++;
        }
        if (this.f2446l + 1 >= this.f2452v) {
            m2879h();
        }
        SolverVariable a = m2874a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f2442h + 1;
        this.f2442h = i;
        this.f2446l++;
        a.f2393b = i;
        this.f2448n.f2429d[this.f2442h] = a;
        return a;
    }

    public C0627d() {
        m2880i();
        C0626c cVar = new C0626c();
        this.f2448n = cVar;
        this.f2450t = new C0634g(cVar);
        if (f2435f) {
            this.f2440A = new C0629b(cVar);
        } else {
            this.f2440A = new C0624b(cVar);
        }
    }

    /* renamed from: h */
    private void m2879h() {
        int i = this.f2451u * 2;
        this.f2451u = i;
        this.f2443i = (C0624b[]) Arrays.copyOf(this.f2443i, i);
        C0626c cVar = this.f2448n;
        cVar.f2429d = (SolverVariable[]) Arrays.copyOf(cVar.f2429d, this.f2451u);
        int i2 = this.f2451u;
        this.f2453w = new boolean[i2];
        this.f2452v = i2;
        this.f2454x = i2;
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2466d++;
            C0630e eVar2 = f2436o;
            eVar2.f2477o = Math.max(eVar2.f2477o, (long) this.f2451u);
            C0630e eVar3 = f2436o;
            eVar3.f2486x = eVar3.f2477o;
        }
    }

    /* renamed from: b */
    public void mo3452b() {
        for (int i = 0; i < this.f2448n.f2429d.length; i++) {
            SolverVariable solverVariable = this.f2448n.f2429d[i];
            if (solverVariable != null) {
                solverVariable.mo3391b();
            }
        }
        this.f2448n.f2428c.mo3463a(this.f2455y, this.f2456z);
        this.f2456z = 0;
        Arrays.fill(this.f2448n.f2429d, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.f2449s;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2442h = 0;
        this.f2450t.mo3436f();
        this.f2446l = 1;
        for (int i2 = 0; i2 < this.f2447m; i2++) {
            C0624b[] bVarArr = this.f2443i;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f2422c = false;
            }
        }
        m2880i();
        this.f2447m = 0;
        if (f2435f) {
            this.f2440A = new C0629b(this.f2448n);
        } else {
            this.f2440A = new C0624b(this.f2448n);
        }
    }

    /* renamed from: c */
    public C0624b mo3455c() {
        C0624b bVar;
        if (f2435f) {
            bVar = this.f2448n.f2426a.mo3462a();
            if (bVar == null) {
                bVar = new C0629b(this.f2448n);
                f2438q++;
            } else {
                bVar.mo3431c();
            }
        } else {
            bVar = this.f2448n.f2427b.mo3462a();
            if (bVar == null) {
                bVar = new C0624b(this.f2448n);
                f2437p++;
            } else {
                bVar.mo3431c();
            }
        }
        SolverVariable.m2809a();
        return bVar;
    }

    /* renamed from: f */
    public void mo3459f() throws Exception {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2467e++;
        }
        if (this.f2450t.mo3435e()) {
            m2881j();
        } else if (this.f2444j || this.f2445k) {
            C0630e eVar2 = f2436o;
            if (eVar2 != null) {
                eVar2.f2479q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f2447m) {
                    z = true;
                    break;
                } else if (!this.f2443i[i].f2425f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo3448a(this.f2450t);
                return;
            }
            C0630e eVar3 = f2436o;
            if (eVar3 != null) {
                eVar3.f2478p++;
            }
            m2881j();
        } else {
            mo3448a(this.f2450t);
        }
    }

    /* renamed from: a */
    public void mo3449a(C0630e eVar) {
        f2436o = eVar;
    }

    /* renamed from: b */
    public int mo3451b(Object obj) {
        SolverVariable g = ((ConstraintAnchor) obj).mo3490g();
        if (g != null) {
            return (int) (g.f2396e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private final void m2878b(C0624b bVar) {
        int i;
        if (!f2432c || !bVar.f2425f) {
            this.f2443i[this.f2447m] = bVar;
            bVar.f2420a.f2394c = this.f2447m;
            this.f2447m++;
            bVar.f2420a.mo3390a(this, bVar);
        } else {
            bVar.f2420a.mo3389a(this, bVar.f2421b);
        }
        if (f2432c && this.f2441g) {
            int i2 = 0;
            while (i2 < this.f2447m) {
                if (this.f2443i[i2] == null) {
                    System.out.println("WTF");
                }
                C0624b[] bVarArr = this.f2443i;
                if (bVarArr[i2] != null && bVarArr[i2].f2425f) {
                    C0624b bVar2 = this.f2443i[i2];
                    bVar2.f2420a.mo3389a(this, bVar2.f2421b);
                    if (f2435f) {
                        this.f2448n.f2426a.mo3464a(bVar2);
                    } else {
                        this.f2448n.f2427b.mo3464a(bVar2);
                    }
                    this.f2443i[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.f2447m;
                        if (i3 >= i) {
                            break;
                        }
                        C0624b[] bVarArr2 = this.f2443i;
                        int i5 = i3 - 1;
                        bVarArr2[i5] = bVarArr2[i3];
                        if (bVarArr2[i5].f2420a.f2394c == i3) {
                            this.f2443i[i5].f2420a.f2394c = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.f2443i[i4] = null;
                    }
                    this.f2447m = i - 1;
                    i2--;
                }
                i2++;
            }
            this.f2441g = false;
        }
    }

    /* renamed from: b */
    private int m2877b(AbstractC0628a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f2447m) {
                z = false;
                break;
            } else if (this.f2443i[i].f2420a.f2400i != SolverVariable.Type.UNRESTRICTED && this.f2443i[i].f2421b < BitmapDescriptorFactory.HUE_RED) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0630e eVar = f2436o;
            if (eVar != null) {
                eVar.f2473k++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2447m; i6++) {
                C0624b bVar = this.f2443i[i6];
                if (bVar.f2420a.f2400i != SolverVariable.Type.UNRESTRICTED && !bVar.f2425f && bVar.f2421b < BitmapDescriptorFactory.HUE_RED) {
                    int i7 = 9;
                    if (f2434e) {
                        int c = bVar.f2424e.mo3405c();
                        int i8 = 0;
                        while (i8 < c) {
                            SolverVariable a = bVar.f2424e.mo3396a(i8);
                            float b = bVar.f2424e.mo3403b(a);
                            if (b > BitmapDescriptorFactory.HUE_RED) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = a.f2398g[i9] / b;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = a.f2393b;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f2446l; i10++) {
                            SolverVariable solverVariable = this.f2448n.f2429d[i10];
                            float b2 = bVar.f2424e.mo3403b(solverVariable);
                            if (b2 > BitmapDescriptorFactory.HUE_RED) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = solverVariable.f2398g[i11] / b2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C0624b bVar2 = this.f2443i[i3];
                bVar2.f2420a.f2394c = -1;
                C0630e eVar2 = f2436o;
                if (eVar2 != null) {
                    eVar2.f2472j++;
                }
                bVar2.mo3427b(this.f2448n.f2429d[i4]);
                bVar2.f2420a.f2394c = i3;
                bVar2.f2420a.mo3390a(this, bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f2446l / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public SolverVariable mo3440a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f2446l + 1 >= this.f2452v) {
            m2879h();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.mo3490g();
            if (solverVariable == null) {
                constraintAnchor.mo3480a(this.f2448n);
                solverVariable = constraintAnchor.mo3490g();
            }
            if (solverVariable.f2393b == -1 || solverVariable.f2393b > this.f2442h || this.f2448n.f2429d[solverVariable.f2393b] == null) {
                if (solverVariable.f2393b != -1) {
                    solverVariable.mo3391b();
                }
                int i = this.f2442h + 1;
                this.f2442h = i;
                this.f2446l++;
                solverVariable.f2393b = i;
                solverVariable.f2400i = SolverVariable.Type.UNRESTRICTED;
                this.f2448n.f2429d[this.f2442h] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.d$b */
    public class C0629b extends C0624b {
        public C0629b(C0626c cVar) {
            this.f2424e = new C0637h(this, cVar);
        }
    }

    /* renamed from: a */
    private SolverVariable m2874a(SolverVariable.Type type, String str) {
        SolverVariable a = this.f2448n.f2428c.mo3462a();
        if (a == null) {
            a = new SolverVariable(type, str);
            a.mo3387a(type, str);
        } else {
            a.mo3391b();
            a.mo3387a(type, str);
        }
        int i = this.f2456z;
        int i2 = f2439r;
        if (i >= i2) {
            int i3 = i2 * 2;
            f2439r = i3;
            this.f2455y = (SolverVariable[]) Arrays.copyOf(this.f2455y, i3);
        }
        SolverVariable[] solverVariableArr = this.f2455y;
        int i4 = this.f2456z;
        this.f2456z = i4 + 1;
        solverVariableArr[i4] = a;
        return a;
    }

    /* renamed from: a */
    public SolverVariable mo3439a(int i, String str) {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2474l++;
        }
        if (this.f2446l + 1 >= this.f2452v) {
            m2879h();
        }
        SolverVariable a = m2874a(SolverVariable.Type.ERROR, str);
        int i2 = this.f2442h + 1;
        this.f2442h = i2;
        this.f2446l++;
        a.f2393b = i2;
        a.f2395d = i;
        this.f2448n.f2429d[this.f2442h] = a;
        this.f2450t.mo3434d(a);
        return a;
    }

    /* renamed from: a */
    private final int m2873a(AbstractC0628a aVar, boolean z) {
        C0630e eVar = f2436o;
        if (eVar != null) {
            eVar.f2470h++;
        }
        for (int i = 0; i < this.f2446l; i++) {
            this.f2453w[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0630e eVar2 = f2436o;
            if (eVar2 != null) {
                eVar2.f2471i++;
            }
            i2++;
            if (i2 >= this.f2446l * 2) {
                return i2;
            }
            if (aVar.mo3437g() != null) {
                this.f2453w[aVar.mo3437g().f2393b] = true;
            }
            SolverVariable a = aVar.mo3407a(this, this.f2453w);
            if (a != null) {
                if (this.f2453w[a.f2393b]) {
                    return i2;
                }
                this.f2453w[a.f2393b] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.f2447m; i4++) {
                    C0624b bVar = this.f2443i[i4];
                    if (bVar.f2420a.f2400i != SolverVariable.Type.UNRESTRICTED && !bVar.f2425f && bVar.mo3420a(a)) {
                        float b = bVar.f2424e.mo3403b(a);
                        if (b < BitmapDescriptorFactory.HUE_RED) {
                            float f2 = (-bVar.f2421b) / b;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    C0624b bVar2 = this.f2443i[i3];
                    bVar2.f2420a.f2394c = -1;
                    C0630e eVar3 = f2436o;
                    if (eVar3 != null) {
                        eVar3.f2472j++;
                    }
                    bVar2.mo3427b(a);
                    bVar2.f2420a.f2394c = i3;
                    bVar2.f2420a.mo3390a(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void mo3441a(SolverVariable solverVariable, int i) {
        if (!f2431b || solverVariable.f2394c != -1) {
            int i2 = solverVariable.f2394c;
            if (solverVariable.f2394c != -1) {
                C0624b bVar = this.f2443i[i2];
                if (bVar.f2425f) {
                    bVar.f2421b = (float) i;
                } else if (bVar.f2424e.mo3405c() == 0) {
                    bVar.f2425f = true;
                    bVar.f2421b = (float) i;
                } else {
                    C0624b c = mo3455c();
                    c.mo3423b(solverVariable, i);
                    mo3446a(c);
                }
            } else {
                C0624b c2 = mo3455c();
                c2.mo3409a(solverVariable, i);
                mo3446a(c2);
            }
        } else {
            float f = (float) i;
            solverVariable.mo3389a(this, f);
            for (int i3 = 0; i3 < this.f2442h + 1; i3++) {
                SolverVariable solverVariable2 = this.f2448n.f2429d[i3];
                if (solverVariable2 != null && solverVariable2.f2404m && solverVariable2.f2405n == solverVariable.f2393b) {
                    solverVariable2.mo3389a(this, solverVariable2.f2406o + f);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0624b m2875a(C0627d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return dVar.mo3455c().mo3410a(solverVariable, solverVariable2, f);
    }

    /* renamed from: b */
    public void mo3453b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0624b c = mo3455c();
        SolverVariable d = mo3457d();
        d.f2395d = 0;
        c.mo3424b(solverVariable, solverVariable2, d, i);
        if (i2 != 8) {
            mo3447a(c, (int) (c.f2424e.mo3403b(d) * -1.0f), i2);
        }
        mo3446a(c);
    }

    /* renamed from: c */
    public C0624b mo3456c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (!f2431b || i2 != 8 || !solverVariable2.f2397f || solverVariable.f2394c != -1) {
            C0624b c = mo3455c();
            c.mo3411a(solverVariable, solverVariable2, i);
            if (i2 != 8) {
                c.mo3415a(this, i2);
            }
            mo3446a(c);
            return c;
        }
        solverVariable.mo3389a(this, solverVariable2.f2396e + ((float) i));
        return null;
    }

    /* renamed from: b */
    public void mo3454b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C0624b c = mo3455c();
        SolverVariable d = mo3457d();
        d.f2395d = 0;
        c.mo3424b(solverVariable, solverVariable2, d, i);
        mo3446a(c);
    }

    /* renamed from: a */
    public void mo3443a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0624b c = mo3455c();
        SolverVariable d = mo3457d();
        d.f2395d = 0;
        c.mo3413a(solverVariable, solverVariable2, d, i);
        if (i2 != 8) {
            mo3447a(c, (int) (c.f2424e.mo3403b(d) * -1.0f), i2);
        }
        mo3446a(c);
    }

    /* renamed from: a */
    public void mo3442a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C0624b c = mo3455c();
        c.mo3412a(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            c.mo3415a(this, i3);
        }
        mo3446a(c);
    }
}
