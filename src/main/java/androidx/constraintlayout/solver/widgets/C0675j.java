package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0642b;

/* renamed from: androidx.constraintlayout.solver.widgets.j */
public class C0675j extends C0673h {

    /* renamed from: a */
    private int f2712a;
    private int aA;
    private int aB;
    private int aC;
    private boolean aD;
    private int aE;
    private int aF;
    protected C0642b.C0643a aP = new C0642b.C0643a();
    C0642b.AbstractC0644b aQ = null;
    private int aw;
    private int ax;
    private int ay;
    private int az;

    /* renamed from: b */
    public void mo3696b(int i, int i2, int i3, int i4) {
    }

    /* renamed from: X */
    public int mo3733X() {
        return this.aE;
    }

    /* renamed from: Y */
    public int mo3734Y() {
        return this.aF;
    }

    /* renamed from: b */
    public int mo3604b() {
        return this.f2712a;
    }

    /* renamed from: c */
    public int mo3738c() {
        return this.aw;
    }

    /* renamed from: f */
    public int mo3739f() {
        return this.aB;
    }

    /* renamed from: g */
    public int mo3741g() {
        return this.aC;
    }

    /* renamed from: h */
    public boolean mo3743h() {
        return this.aD;
    }

    /* renamed from: i */
    public void mo3744i() {
        for (int i = 0; i < this.aO; i++) {
            ConstraintWidget constraintWidget = this.aN[i];
            if (constraintWidget != null) {
                constraintWidget.mo3550b(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public boolean mo3735Z() {
        C0642b.AbstractC0644b bVar;
        if (this.f2541J != null) {
            bVar = ((C0667d) this.f2541J).mo3680g();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.aO) {
                return true;
            }
            ConstraintWidget constraintWidget = this.aN[i];
            if (constraintWidget != null && !(constraintWidget instanceof C0670f)) {
                ConstraintWidget.DimensionBehaviour v = constraintWidget.mo3594v(0);
                ConstraintWidget.DimensionBehaviour v2 = constraintWidget.mo3594v(1);
                if (v != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.f2568l == 1 || v2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.f2569m == 1) {
                    z = false;
                }
                if (!z) {
                    if (v == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        v = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (v2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        v2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.aP.f2592d = v;
                    this.aP.f2593e = v2;
                    this.aP.f2594f = constraintWidget.mo3499A();
                    this.aP.f2595g = constraintWidget.mo3500B();
                    bVar.mo3614a(constraintWidget, this.aP);
                    constraintWidget.mo3579o(this.aP.f2596h);
                    constraintWidget.mo3581p(this.aP.f2597i);
                    constraintWidget.mo3588s(this.aP.f2598j);
                }
            }
            i++;
        }
    }

    /* renamed from: M */
    public void mo3728M(int i) {
        this.aA = i;
    }

    /* renamed from: O */
    public void mo3730O(int i) {
        this.f2712a = i;
    }

    /* renamed from: Q */
    public void mo3732Q(int i) {
        this.aw = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.C0673h, androidx.constraintlayout.solver.widgets.AbstractC0672g
    /* renamed from: a */
    public void mo3722a(C0667d dVar) {
        mo3744i();
    }

    /* renamed from: L */
    public void mo3727L(int i) {
        this.az = i;
        this.aB = i;
        this.aC = i;
    }

    /* renamed from: N */
    public void mo3729N(int i) {
        this.ax = i;
        this.aB = i;
    }

    /* renamed from: P */
    public void mo3731P(int i) {
        this.ay = i;
        this.aC = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3740f(boolean z) {
        this.aD = z;
    }

    /* renamed from: K */
    public void mo3726K(int i) {
        this.ax = i;
        this.f2712a = i;
        this.ay = i;
        this.aw = i;
        this.az = i;
        this.aA = i;
    }

    /* renamed from: a */
    public void mo3737a(boolean z) {
        int i = this.az;
        if (i <= 0 && this.aA <= 0) {
            return;
        }
        if (z) {
            this.aB = this.aA;
            this.aC = i;
            return;
        }
        this.aB = i;
        this.aC = this.aA;
    }

    /* renamed from: g */
    public void mo3742g(int i, int i2) {
        this.aE = i;
        this.aF = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3736a(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.aQ == null && mo3595v() != null) {
            this.aQ = ((C0667d) mo3595v()).mo3680g();
        }
        this.aP.f2592d = dimensionBehaviour;
        this.aP.f2593e = dimensionBehaviour2;
        this.aP.f2594f = i;
        this.aP.f2595g = i2;
        this.aQ.mo3614a(constraintWidget, this.aP);
        constraintWidget.mo3579o(this.aP.f2596h);
        constraintWidget.mo3581p(this.aP.f2597i);
        constraintWidget.mo3554c(this.aP.f2599k);
        constraintWidget.mo3588s(this.aP.f2598j);
    }
}
