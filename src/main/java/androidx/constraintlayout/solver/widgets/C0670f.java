package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
public class C0670f extends ConstraintWidget {

    /* renamed from: a */
    protected float f2709a = -1.0f;
    private boolean aA;
    protected int aw = -1;
    protected int ax = -1;
    private ConstraintAnchor ay = this.f2582z;
    private int az;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public boolean mo3542a() {
        return true;
    }

    /* renamed from: b */
    public ConstraintAnchor mo3604b() {
        return this.ay;
    }

    /* renamed from: c */
    public int mo3714c() {
        return this.az;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: d */
    public boolean mo3559d() {
        return this.aA;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: e */
    public boolean mo3564e() {
        return this.aA;
    }

    /* renamed from: f */
    public float mo3716f() {
        return this.f2709a;
    }

    /* renamed from: g */
    public int mo3717g() {
        return this.aw;
    }

    /* renamed from: h */
    public int mo3718h() {
        return this.ax;
    }

    public C0670f() {
        this.f2539H.clear();
        this.f2539H.add(this.ay);
        int length = this.f2538G.length;
        for (int i = 0; i < length; i++) {
            this.f2538G[i] = this.ay;
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.f$1 */
    static /* synthetic */ class C06711 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0670f.C06711.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo3713b(int i) {
        if (i > -1) {
            this.f2709a = -1.0f;
            this.aw = i;
            this.ax = -1;
        }
    }

    /* renamed from: e */
    public void mo3715e(float f) {
        if (f > -1.0f) {
            this.f2709a = f;
            this.aw = -1;
            this.ax = -1;
        }
    }

    /* renamed from: y */
    public void mo3719y(int i) {
        if (i > -1) {
            this.f2709a = -1.0f;
            this.aw = -1;
            this.ax = i;
        }
    }

    /* renamed from: z */
    public void mo3720z(int i) {
        this.ay.mo3478a(i);
        this.aA = true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public ConstraintAnchor mo3522a(ConstraintAnchor.Type type) {
        switch (C06711.f2710a[type.ordinal()]) {
            case 1:
            case 2:
                if (this.az == 1) {
                    return this.ay;
                }
                break;
            case 3:
            case 4:
                if (this.az == 0) {
                    return this.ay;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(type.name());
    }

    /* renamed from: a */
    public void mo3602a(int i) {
        if (this.az != i) {
            this.az = i;
            this.f2539H.clear();
            if (this.az == 1) {
                this.ay = this.f2581y;
            } else {
                this.ay = this.f2582z;
            }
            this.f2539H.add(this.ay);
            int length = this.f2538G.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2538G[i2] = this.ay;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3536a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo3536a(constraintWidget, hashMap);
        C0670f fVar = (C0670f) constraintWidget;
        this.f2709a = fVar.f2709a;
        this.aw = fVar.aw;
        this.ax = fVar.ax;
        mo3602a(fVar.az);
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: b */
    public void mo3547b(C0627d dVar, boolean z) {
        if (mo3595v() != null) {
            int b = dVar.mo3451b(this.ay);
            if (this.az == 1) {
                mo3576m(b);
                mo3578n(0);
                mo3581p(mo3595v().mo3500B());
                mo3579o(0);
                return;
            }
            mo3576m(0);
            mo3578n(b);
            mo3579o(mo3595v().mo3499A());
            mo3581p(0);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3530a(C0627d dVar, boolean z) {
        boolean z2;
        C0667d dVar2 = (C0667d) mo3595v();
        if (dVar2 != null) {
            ConstraintAnchor a = dVar2.mo3522a(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor a2 = dVar2.mo3522a(ConstraintAnchor.Type.RIGHT);
            boolean z3 = true;
            if (this.f2541J == null || this.f2541J.f2540I[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.az == 0) {
                a = dVar2.mo3522a(ConstraintAnchor.Type.TOP);
                a2 = dVar2.mo3522a(ConstraintAnchor.Type.BOTTOM);
                if (this.f2541J == null || this.f2541J.f2540I[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.aA && this.ay.mo3489f()) {
                SolverVariable a3 = dVar.mo3440a(this.ay);
                dVar.mo3441a(a3, this.ay.mo3487d());
                if (this.aw != -1) {
                    if (z2) {
                        dVar.mo3443a(dVar.mo3440a(a2), a3, 0, 5);
                    }
                } else if (this.ax != -1 && z2) {
                    SolverVariable a4 = dVar.mo3440a(a2);
                    dVar.mo3443a(a3, dVar.mo3440a(a), 0, 5);
                    dVar.mo3443a(a4, a3, 0, 5);
                }
                this.aA = false;
            } else if (this.aw != -1) {
                SolverVariable a5 = dVar.mo3440a(this.ay);
                dVar.mo3456c(a5, dVar.mo3440a(a), this.aw, 8);
                if (z2) {
                    dVar.mo3443a(dVar.mo3440a(a2), a5, 0, 5);
                }
            } else if (this.ax != -1) {
                SolverVariable a6 = dVar.mo3440a(this.ay);
                SolverVariable a7 = dVar.mo3440a(a2);
                dVar.mo3456c(a6, a7, -this.ax, 8);
                if (z2) {
                    dVar.mo3443a(a6, dVar.mo3440a(a), 0, 5);
                    dVar.mo3443a(a7, a6, 0, 5);
                }
            } else if (this.f2709a != -1.0f) {
                dVar.mo3446a(C0627d.m2875a(dVar, dVar.mo3440a(this.ay), dVar.mo3440a(a2), this.f2709a));
            }
        }
    }
}
