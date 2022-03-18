package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0640a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0648f;

/* renamed from: androidx.constraintlayout.solver.widgets.a.k */
class C0654k extends AbstractC0662p {
    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: a */
    public boolean mo3616a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: d */
    public void mo3619d() {
        this.f2662j.f2622j = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: c */
    public void mo3618c() {
        this.f2657e = null;
        this.f2662j.mo3632a();
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: e */
    public void mo3620e() {
        if (this.f2656d instanceof C0640a) {
            int b = ((C0640a) this.f2656d).mo3604b();
            if (b == 0 || b == 1) {
                this.f2656d.mo3576m(this.f2662j.f2619g);
            } else {
                this.f2656d.mo3578n(this.f2662j.f2619g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: f */
    public void mo3621f() {
        if (this.f2656d instanceof C0640a) {
            this.f2662j.f2614b = true;
            C0640a aVar = (C0640a) this.f2656d;
            int b = aVar.mo3604b();
            boolean c = aVar.mo3606c();
            int i = 0;
            if (b == 0) {
                this.f2662j.f2617e = C0648f.EnumC0649a.LEFT;
                while (i < aVar.aO) {
                    ConstraintWidget constraintWidget = aVar.aN[i];
                    if (c || constraintWidget.mo3596w() != 8) {
                        C0648f fVar = constraintWidget.f2562f.f2662j;
                        fVar.f2623k.add(this.f2662j);
                        this.f2662j.f2624l.add(fVar);
                    }
                    i++;
                }
                m3143a(this.f2656d.f2562f.f2662j);
                m3143a(this.f2656d.f2562f.f2663k);
            } else if (b == 1) {
                this.f2662j.f2617e = C0648f.EnumC0649a.RIGHT;
                while (i < aVar.aO) {
                    ConstraintWidget constraintWidget2 = aVar.aN[i];
                    if (c || constraintWidget2.mo3596w() != 8) {
                        C0648f fVar2 = constraintWidget2.f2562f.f2663k;
                        fVar2.f2623k.add(this.f2662j);
                        this.f2662j.f2624l.add(fVar2);
                    }
                    i++;
                }
                m3143a(this.f2656d.f2562f.f2662j);
                m3143a(this.f2656d.f2562f.f2663k);
            } else if (b == 2) {
                this.f2662j.f2617e = C0648f.EnumC0649a.TOP;
                while (i < aVar.aO) {
                    ConstraintWidget constraintWidget3 = aVar.aN[i];
                    if (c || constraintWidget3.mo3596w() != 8) {
                        C0648f fVar3 = constraintWidget3.f2563g.f2662j;
                        fVar3.f2623k.add(this.f2662j);
                        this.f2662j.f2624l.add(fVar3);
                    }
                    i++;
                }
                m3143a(this.f2656d.f2563g.f2662j);
                m3143a(this.f2656d.f2563g.f2663k);
            } else if (b == 3) {
                this.f2662j.f2617e = C0648f.EnumC0649a.BOTTOM;
                while (i < aVar.aO) {
                    ConstraintWidget constraintWidget4 = aVar.aN[i];
                    if (c || constraintWidget4.mo3596w() != 8) {
                        C0648f fVar4 = constraintWidget4.f2563g.f2663k;
                        fVar4.f2623k.add(this.f2662j);
                        this.f2662j.f2624l.add(fVar4);
                    }
                    i++;
                }
                m3143a(this.f2656d.f2563g.f2662j);
                m3143a(this.f2656d.f2563g.f2663k);
            }
        }
    }

    public C0654k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: a */
    private void m3143a(C0648f fVar) {
        this.f2662j.f2623k.add(fVar);
        fVar.f2624l.add(this.f2662j);
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p, androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    public void mo3615a(AbstractC0646d dVar) {
        C0640a aVar = (C0640a) this.f2656d;
        int b = aVar.mo3604b();
        int i = 0;
        int i2 = -1;
        for (C0648f fVar : this.f2662j.f2624l) {
            int i3 = fVar.f2619g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (b == 0 || b == 2) {
            this.f2662j.mo3633a(i2 + aVar.mo3608g());
        } else {
            this.f2662j.mo3633a(i + aVar.mo3608g());
        }
    }
}
