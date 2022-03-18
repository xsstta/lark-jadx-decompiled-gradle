package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.solver.widgets.a.j */
public class C0653j extends AbstractC0662p {
    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: a */
    public boolean mo3616a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: c */
    public void mo3618c() {
        this.f2662j.mo3632a();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: d */
    public void mo3619d() {
        this.f2662j.f2622j = false;
        this.f2663k.f2622j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: e */
    public void mo3620e() {
        if (((C0670f) this.f2656d).mo3714c() == 1) {
            this.f2656d.mo3576m(this.f2662j.f2619g);
        } else {
            this.f2656d.mo3578n(this.f2662j.f2619g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: f */
    public void mo3621f() {
        C0670f fVar = (C0670f) this.f2656d;
        int g = fVar.mo3717g();
        int h = fVar.mo3718h();
        fVar.mo3716f();
        if (fVar.mo3714c() == 1) {
            if (g != -1) {
                this.f2662j.f2624l.add(this.f2656d.f2541J.f2562f.f2662j);
                this.f2656d.f2541J.f2562f.f2662j.f2623k.add(this.f2662j);
                this.f2662j.f2618f = g;
            } else if (h != -1) {
                this.f2662j.f2624l.add(this.f2656d.f2541J.f2562f.f2663k);
                this.f2656d.f2541J.f2562f.f2663k.f2623k.add(this.f2662j);
                this.f2662j.f2618f = -h;
            } else {
                this.f2662j.f2614b = true;
                this.f2662j.f2624l.add(this.f2656d.f2541J.f2562f.f2663k);
                this.f2656d.f2541J.f2562f.f2663k.f2623k.add(this.f2662j);
            }
            m3136a(this.f2656d.f2562f.f2662j);
            m3136a(this.f2656d.f2562f.f2663k);
            return;
        }
        if (g != -1) {
            this.f2662j.f2624l.add(this.f2656d.f2541J.f2563g.f2662j);
            this.f2656d.f2541J.f2563g.f2662j.f2623k.add(this.f2662j);
            this.f2662j.f2618f = g;
        } else if (h != -1) {
            this.f2662j.f2624l.add(this.f2656d.f2541J.f2563g.f2663k);
            this.f2656d.f2541J.f2563g.f2663k.f2623k.add(this.f2662j);
            this.f2662j.f2618f = -h;
        } else {
            this.f2662j.f2614b = true;
            this.f2662j.f2624l.add(this.f2656d.f2541J.f2563g.f2663k);
            this.f2656d.f2541J.f2563g.f2663k.f2623k.add(this.f2662j);
        }
        m3136a(this.f2656d.f2563g.f2662j);
        m3136a(this.f2656d.f2563g.f2663k);
    }

    /* renamed from: a */
    private void m3136a(C0648f fVar) {
        this.f2662j.f2623k.add(fVar);
        fVar.f2624l.add(this.f2662j);
    }

    public C0653j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2562f.mo3618c();
        constraintWidget.f2563g.mo3618c();
        this.f2660h = ((C0670f) constraintWidget).mo3714c();
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p, androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    public void mo3615a(AbstractC0646d dVar) {
        if (this.f2662j.f2615c && !this.f2662j.f2622j) {
            this.f2662j.mo3633a((int) ((((float) this.f2662j.f2624l.get(0).f2619g) * ((C0670f) this.f2656d).mo3716f()) + 0.5f));
        }
    }
}
