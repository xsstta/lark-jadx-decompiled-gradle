package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.a */
public class C0640a extends C0673h {

    /* renamed from: a */
    boolean f2585a;
    private int aw;
    private boolean ax = true;
    private int ay;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public boolean mo3542a() {
        return true;
    }

    /* renamed from: b */
    public int mo3604b() {
        return this.aw;
    }

    /* renamed from: c */
    public boolean mo3606c() {
        return this.ax;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: d */
    public boolean mo3559d() {
        return this.f2585a;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: e */
    public boolean mo3564e() {
        return this.f2585a;
    }

    /* renamed from: g */
    public int mo3608g() {
        return this.ay;
    }

    /* renamed from: h */
    public int mo3609h() {
        int i = this.aw;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3607f() {
        for (int i = 0; i < this.aO; i++) {
            ConstraintWidget constraintWidget = this.aN[i];
            int i2 = this.aw;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.mo3527a(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.mo3527a(1, true);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + mo3599x() + " {";
        for (int i = 0; i < this.aO; i++) {
            ConstraintWidget constraintWidget = this.aN[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.mo3599x();
        }
        return str + "}";
    }

    /* renamed from: i */
    public boolean mo3610i() {
        int i;
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < this.aO; i3++) {
            ConstraintWidget constraintWidget = this.aN[i3];
            if ((this.ax || constraintWidget.mo3542a()) && ((((i = this.aw) == 0 || i == 1) && !constraintWidget.mo3559d()) || (((i2 = this.aw) == 2 || i2 == 3) && !constraintWidget.mo3564e()))) {
                z = false;
            }
        }
        if (!z || this.aO <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aO; i5++) {
            ConstraintWidget constraintWidget2 = this.aN[i5];
            if (this.ax || constraintWidget2.mo3542a()) {
                if (!z2) {
                    int i6 = this.aw;
                    if (i6 == 0) {
                        i4 = constraintWidget2.mo3522a(ConstraintAnchor.Type.LEFT).mo3487d();
                    } else if (i6 == 1) {
                        i4 = constraintWidget2.mo3522a(ConstraintAnchor.Type.RIGHT).mo3487d();
                    } else if (i6 == 2) {
                        i4 = constraintWidget2.mo3522a(ConstraintAnchor.Type.TOP).mo3487d();
                    } else if (i6 == 3) {
                        i4 = constraintWidget2.mo3522a(ConstraintAnchor.Type.BOTTOM).mo3487d();
                    }
                    z2 = true;
                }
                int i7 = this.aw;
                if (i7 == 0) {
                    i4 = Math.min(i4, constraintWidget2.mo3522a(ConstraintAnchor.Type.LEFT).mo3487d());
                } else if (i7 == 1) {
                    i4 = Math.max(i4, constraintWidget2.mo3522a(ConstraintAnchor.Type.RIGHT).mo3487d());
                } else if (i7 == 2) {
                    i4 = Math.min(i4, constraintWidget2.mo3522a(ConstraintAnchor.Type.TOP).mo3487d());
                } else if (i7 == 3) {
                    i4 = Math.max(i4, constraintWidget2.mo3522a(ConstraintAnchor.Type.BOTTOM).mo3487d());
                }
            }
        }
        int i8 = i4 + this.ay;
        int i9 = this.aw;
        if (i9 == 0 || i9 == 1) {
            mo3524a(i8, i8);
        } else {
            mo3545b(i8, i8);
        }
        this.f2585a = true;
        return true;
    }

    /* renamed from: a */
    public void mo3602a(int i) {
        this.aw = i;
    }

    /* renamed from: a */
    public void mo3603a(boolean z) {
        this.ax = z;
    }

    /* renamed from: b */
    public void mo3605b(int i) {
        this.ay = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.C0673h, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3536a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo3536a(constraintWidget, hashMap);
        C0640a aVar = (C0640a) constraintWidget;
        this.aw = aVar.aw;
        this.ax = aVar.ax;
        this.ay = aVar.ay;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3530a(C0627d dVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        this.f2538G[0] = this.f2581y;
        this.f2538G[2] = this.f2582z;
        this.f2538G[1] = this.f2532A;
        this.f2538G[3] = this.f2533B;
        for (int i5 = 0; i5 < this.f2538G.length; i5++) {
            this.f2538G[i5].f2526f = dVar.mo3440a(this.f2538G[i5]);
        }
        int i6 = this.aw;
        if (i6 >= 0 && i6 < 4) {
            ConstraintAnchor constraintAnchor = this.f2538G[this.aw];
            if (!this.f2585a) {
                mo3610i();
            }
            if (this.f2585a) {
                this.f2585a = false;
                int i7 = this.aw;
                if (i7 == 0 || i7 == 1) {
                    dVar.mo3441a(this.f2581y.f2526f, this.f2546O);
                    dVar.mo3441a(this.f2532A.f2526f, this.f2546O);
                } else if (i7 == 2 || i7 == 3) {
                    dVar.mo3441a(this.f2582z.f2526f, this.f2547P);
                    dVar.mo3441a(this.f2533B.f2526f, this.f2547P);
                }
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.aO) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.aN[i8];
                    if ((this.ax || constraintWidget.mo3542a()) && ((((i3 = this.aw) == 0 || i3 == 1) && constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2581y.f2523c != null && constraintWidget.f2532A.f2523c != null) || (((i4 = this.aw) == 2 || i4 == 3) && constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2582z.f2523c != null && constraintWidget.f2533B.f2523c != null))) {
                        z2 = true;
                    } else {
                        i8++;
                    }
                }
                z2 = true;
                if (this.f2581y.mo3486c() || this.f2532A.mo3486c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f2582z.mo3486c() || this.f2533B.mo3486c()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i2 = this.aw) != 0 || !z3) && ((i2 != 2 || !z4) && ((i2 != 1 || !z3) && (i2 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                int i9 = 5;
                if (!z5) {
                    i9 = 4;
                }
                for (int i10 = 0; i10 < this.aO; i10++) {
                    ConstraintWidget constraintWidget2 = this.aN[i10];
                    if (this.ax || constraintWidget2.mo3542a()) {
                        SolverVariable a = dVar.mo3440a(constraintWidget2.f2538G[this.aw]);
                        constraintWidget2.f2538G[this.aw].f2526f = a;
                        if (constraintWidget2.f2538G[this.aw].f2523c == null || constraintWidget2.f2538G[this.aw].f2523c.f2521a != this) {
                            i = 0;
                        } else {
                            i = constraintWidget2.f2538G[this.aw].f2524d + 0;
                        }
                        int i11 = this.aw;
                        if (i11 == 0 || i11 == 2) {
                            dVar.mo3454b(constraintAnchor.f2526f, a, this.ay - i, z2);
                        } else {
                            dVar.mo3444a(constraintAnchor.f2526f, a, this.ay + i, z2);
                        }
                        dVar.mo3456c(constraintAnchor.f2526f, a, this.ay + i, i9);
                    }
                }
                int i12 = this.aw;
                if (i12 == 0) {
                    dVar.mo3456c(this.f2532A.f2526f, this.f2581y.f2526f, 0, 8);
                    dVar.mo3456c(this.f2581y.f2526f, this.f2541J.f2532A.f2526f, 0, 4);
                    dVar.mo3456c(this.f2581y.f2526f, this.f2541J.f2581y.f2526f, 0, 0);
                } else if (i12 == 1) {
                    dVar.mo3456c(this.f2581y.f2526f, this.f2532A.f2526f, 0, 8);
                    dVar.mo3456c(this.f2581y.f2526f, this.f2541J.f2581y.f2526f, 0, 4);
                    dVar.mo3456c(this.f2581y.f2526f, this.f2541J.f2532A.f2526f, 0, 0);
                } else if (i12 == 2) {
                    dVar.mo3456c(this.f2533B.f2526f, this.f2582z.f2526f, 0, 8);
                    dVar.mo3456c(this.f2582z.f2526f, this.f2541J.f2533B.f2526f, 0, 4);
                    dVar.mo3456c(this.f2582z.f2526f, this.f2541J.f2582z.f2526f, 0, 0);
                } else if (i12 == 3) {
                    dVar.mo3456c(this.f2582z.f2526f, this.f2533B.f2526f, 0, 8);
                    dVar.mo3456c(this.f2582z.f2526f, this.f2541J.f2582z.f2526f, 0, 4);
                    dVar.mo3456c(this.f2582z.f2526f, this.f2541J.f2533B.f2526f, 0, 0);
                }
            }
        }
    }
}
