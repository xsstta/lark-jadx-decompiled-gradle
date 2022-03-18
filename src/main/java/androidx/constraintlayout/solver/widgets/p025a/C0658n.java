package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.AbstractC0672g;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p;
import androidx.constraintlayout.solver.widgets.p025a.C0648f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.constraintlayout.solver.widgets.a.n */
public class C0658n extends AbstractC0662p {

    /* renamed from: a */
    public C0648f f2637a = new C0648f(this);

    /* renamed from: b */
    C0650g f2638b = null;

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: e */
    public void mo3620e() {
        if (this.f2662j.f2622j) {
            this.f2656d.mo3578n(this.f2662j.f2619g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: a */
    public boolean mo3616a() {
        if (this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2656d.f2569m == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: c */
    public void mo3618c() {
        this.f2657e = null;
        this.f2662j.mo3632a();
        this.f2663k.mo3632a();
        this.f2637a.mo3632a();
        this.f2659g.mo3632a();
        this.f2661i = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2656d.mo3599x();
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.a.n$1 */
    static /* synthetic */ class C06591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.solver.widgets.a.p$a[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.p025a.C0658n.C06591.f2639a = r0
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.C0658n.C06591.f2639a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.C0658n.C06591.f2639a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0658n.C06591.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: d */
    public void mo3619d() {
        this.f2661i = false;
        this.f2662j.mo3632a();
        this.f2662j.f2622j = false;
        this.f2663k.mo3632a();
        this.f2663k.f2622j = false;
        this.f2637a.mo3632a();
        this.f2637a.f2622j = false;
        this.f2659g.f2622j = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: f */
    public void mo3621f() {
        ConstraintWidget v;
        ConstraintWidget v2;
        if (this.f2656d.f2558b) {
            this.f2659g.mo3633a(this.f2656d.mo3500B());
        }
        if (!this.f2659g.f2622j) {
            this.f2658f = this.f2656d.mo3518T();
            if (this.f2656d.mo3509K()) {
                this.f2638b = new C0641a(this);
            }
            if (this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (v2 = this.f2656d.mo3595v()) != null && v2.mo3518T() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int B = (v2.mo3500B() - this.f2656d.f2582z.mo3493j()) - this.f2656d.f2533B.mo3493j();
                    mo3653a(this.f2662j, v2.f2563g.f2662j, this.f2656d.f2582z.mo3493j());
                    mo3653a(this.f2663k, v2.f2563g.f2663k, -this.f2656d.f2533B.mo3493j());
                    this.f2659g.mo3633a(B);
                    return;
                } else if (this.f2658f == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2659g.mo3633a(this.f2656d.mo3500B());
                }
            }
        } else if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (v = this.f2656d.mo3595v()) != null && v.mo3518T() == ConstraintWidget.DimensionBehaviour.FIXED) {
            mo3653a(this.f2662j, v.f2563g.f2662j, this.f2656d.f2582z.mo3493j());
            mo3653a(this.f2663k, v.f2563g.f2663k, -this.f2656d.f2533B.mo3493j());
            return;
        }
        if (!this.f2659g.f2622j || !this.f2656d.f2558b) {
            if (this.f2659g.f2622j || this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f2659g.mo3634b(this);
            } else {
                int i = this.f2656d.f2569m;
                if (i == 2) {
                    ConstraintWidget v3 = this.f2656d.mo3595v();
                    if (v3 != null) {
                        C0650g gVar = v3.f2563g.f2659g;
                        this.f2659g.f2624l.add(gVar);
                        gVar.f2623k.add(this.f2659g);
                        this.f2659g.f2614b = true;
                        this.f2659g.f2623k.add(this.f2662j);
                        this.f2659g.f2623k.add(this.f2663k);
                    }
                } else if (i == 3 && !this.f2656d.mo3520V() && this.f2656d.f2568l != 3) {
                    C0650g gVar2 = this.f2656d.f2562f.f2659g;
                    this.f2659g.f2624l.add(gVar2);
                    gVar2.f2623k.add(this.f2659g);
                    this.f2659g.f2614b = true;
                    this.f2659g.f2623k.add(this.f2662j);
                    this.f2659g.f2623k.add(this.f2663k);
                }
            }
            if (this.f2656d.f2538G[2].f2523c != null && this.f2656d.f2538G[3].f2523c != null) {
                if (this.f2656d.mo3520V()) {
                    this.f2662j.f2618f = this.f2656d.f2538G[2].mo3493j();
                    this.f2663k.f2618f = -this.f2656d.f2538G[3].mo3493j();
                } else {
                    C0648f a = mo3650a(this.f2656d.f2538G[2]);
                    C0648f a2 = mo3650a(this.f2656d.f2538G[3]);
                    a.mo3634b(this);
                    a2.mo3634b(this);
                    this.f2664l = AbstractC0662p.EnumC0664a.CENTER;
                }
                if (this.f2656d.mo3509K()) {
                    mo3654a(this.f2637a, this.f2662j, 1, this.f2638b);
                }
            } else if (this.f2656d.f2538G[2].f2523c != null) {
                C0648f a3 = mo3650a(this.f2656d.f2538G[2]);
                if (a3 != null) {
                    mo3653a(this.f2662j, a3, this.f2656d.f2538G[2].mo3493j());
                    mo3654a(this.f2663k, this.f2662j, 1, this.f2659g);
                    if (this.f2656d.mo3509K()) {
                        mo3654a(this.f2637a, this.f2662j, 1, this.f2638b);
                    }
                    if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2656d.mo3512N() > BitmapDescriptorFactory.HUE_RED && this.f2656d.f2562f.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        this.f2656d.f2562f.f2659g.f2623k.add(this.f2659g);
                        this.f2659g.f2624l.add(this.f2656d.f2562f.f2659g);
                        this.f2659g.f2613a = this;
                    }
                }
            } else if (this.f2656d.f2538G[3].f2523c != null) {
                C0648f a4 = mo3650a(this.f2656d.f2538G[3]);
                if (a4 != null) {
                    mo3653a(this.f2663k, a4, -this.f2656d.f2538G[3].mo3493j());
                    mo3654a(this.f2662j, this.f2663k, -1, this.f2659g);
                    if (this.f2656d.mo3509K()) {
                        mo3654a(this.f2637a, this.f2662j, 1, this.f2638b);
                    }
                }
            } else if (this.f2656d.f2538G[4].f2523c != null) {
                C0648f a5 = mo3650a(this.f2656d.f2538G[4]);
                if (a5 != null) {
                    mo3653a(this.f2637a, a5, 0);
                    mo3654a(this.f2662j, this.f2637a, -1, this.f2638b);
                    mo3654a(this.f2663k, this.f2662j, 1, this.f2659g);
                }
            } else if (!(this.f2656d instanceof AbstractC0672g) && this.f2656d.mo3595v() != null) {
                mo3653a(this.f2662j, this.f2656d.mo3595v().f2563g.f2662j, this.f2656d.mo3601z());
                mo3654a(this.f2663k, this.f2662j, 1, this.f2659g);
                if (this.f2656d.mo3509K()) {
                    mo3654a(this.f2637a, this.f2662j, 1, this.f2638b);
                }
                if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2656d.mo3512N() > BitmapDescriptorFactory.HUE_RED && this.f2656d.f2562f.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2656d.f2562f.f2659g.f2623k.add(this.f2659g);
                    this.f2659g.f2624l.add(this.f2656d.f2562f.f2659g);
                    this.f2659g.f2613a = this;
                }
            }
            if (this.f2659g.f2624l.size() == 0) {
                this.f2659g.f2615c = true;
            }
        } else if (this.f2656d.f2538G[2].f2523c != null && this.f2656d.f2538G[3].f2523c != null) {
            if (this.f2656d.mo3520V()) {
                this.f2662j.f2618f = this.f2656d.f2538G[2].mo3493j();
                this.f2663k.f2618f = -this.f2656d.f2538G[3].mo3493j();
            } else {
                C0648f a6 = mo3650a(this.f2656d.f2538G[2]);
                if (a6 != null) {
                    mo3653a(this.f2662j, a6, this.f2656d.f2538G[2].mo3493j());
                }
                C0648f a7 = mo3650a(this.f2656d.f2538G[3]);
                if (a7 != null) {
                    mo3653a(this.f2663k, a7, -this.f2656d.f2538G[3].mo3493j());
                }
                this.f2662j.f2614b = true;
                this.f2663k.f2614b = true;
            }
            if (this.f2656d.mo3509K()) {
                mo3653a(this.f2637a, this.f2662j, this.f2656d.mo3510L());
            }
        } else if (this.f2656d.f2538G[2].f2523c != null) {
            C0648f a8 = mo3650a(this.f2656d.f2538G[2]);
            if (a8 != null) {
                mo3653a(this.f2662j, a8, this.f2656d.f2538G[2].mo3493j());
                mo3653a(this.f2663k, this.f2662j, this.f2659g.f2619g);
                if (this.f2656d.mo3509K()) {
                    mo3653a(this.f2637a, this.f2662j, this.f2656d.mo3510L());
                }
            }
        } else if (this.f2656d.f2538G[3].f2523c != null) {
            C0648f a9 = mo3650a(this.f2656d.f2538G[3]);
            if (a9 != null) {
                mo3653a(this.f2663k, a9, -this.f2656d.f2538G[3].mo3493j());
                mo3653a(this.f2662j, this.f2663k, -this.f2659g.f2619g);
            }
            if (this.f2656d.mo3509K()) {
                mo3653a(this.f2637a, this.f2662j, this.f2656d.mo3510L());
            }
        } else if (this.f2656d.f2538G[4].f2523c != null) {
            C0648f a10 = mo3650a(this.f2656d.f2538G[4]);
            if (a10 != null) {
                mo3653a(this.f2637a, a10, 0);
                mo3653a(this.f2662j, this.f2637a, -this.f2656d.mo3510L());
                mo3653a(this.f2663k, this.f2662j, this.f2659g.f2619g);
            }
        } else if (!(this.f2656d instanceof AbstractC0672g) && this.f2656d.mo3595v() != null && this.f2656d.mo3522a(ConstraintAnchor.Type.CENTER).f2523c == null) {
            mo3653a(this.f2662j, this.f2656d.mo3595v().f2563g.f2662j, this.f2656d.mo3601z());
            mo3653a(this.f2663k, this.f2662j, this.f2659g.f2619g);
            if (this.f2656d.mo3509K()) {
                mo3653a(this.f2637a, this.f2662j, this.f2656d.mo3510L());
            }
        }
    }

    public C0658n(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2662j.f2617e = C0648f.EnumC0649a.TOP;
        this.f2663k.f2617e = C0648f.EnumC0649a.BOTTOM;
        this.f2637a.f2617e = C0648f.EnumC0649a.BASELINE;
        this.f2660h = 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p, androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    public void mo3615a(AbstractC0646d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C06591.f2639a[this.f2664l.ordinal()];
        if (i2 == 1) {
            mo3655b(dVar);
        } else if (i2 == 2) {
            mo3656c(dVar);
        } else if (i2 == 3) {
            mo3652a(dVar, this.f2656d.f2582z, this.f2656d.f2533B, 1);
            return;
        }
        if (this.f2659g.f2615c && !this.f2659g.f2622j && this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = this.f2656d.f2569m;
            if (i3 == 2) {
                ConstraintWidget v = this.f2656d.mo3595v();
                if (v != null && v.f2563g.f2659g.f2622j) {
                    float f4 = this.f2656d.f2576t;
                    this.f2659g.mo3633a((int) ((((float) v.f2563g.f2659g.f2619g) * f4) + 0.5f));
                }
            } else if (i3 == 3 && this.f2656d.f2562f.f2659g.f2622j) {
                int O = this.f2656d.mo3513O();
                if (O == -1) {
                    f2 = (float) this.f2656d.f2562f.f2659g.f2619g;
                    f3 = this.f2656d.mo3512N();
                } else if (O == 0) {
                    f = ((float) this.f2656d.f2562f.f2659g.f2619g) * this.f2656d.mo3512N();
                    i = (int) (f + 0.5f);
                    this.f2659g.mo3633a(i);
                } else if (O != 1) {
                    i = 0;
                    this.f2659g.mo3633a(i);
                } else {
                    f2 = (float) this.f2656d.f2562f.f2659g.f2619g;
                    f3 = this.f2656d.mo3512N();
                }
                f = f2 / f3;
                i = (int) (f + 0.5f);
                this.f2659g.mo3633a(i);
            }
        }
        if (this.f2662j.f2615c && this.f2663k.f2615c) {
            if (this.f2662j.f2622j && this.f2663k.f2622j && this.f2659g.f2622j) {
                return;
            }
            if (this.f2659g.f2622j || this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2656d.f2568l != 0 || this.f2656d.mo3520V()) {
                if (!this.f2659g.f2622j && this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2655c == 1 && this.f2662j.f2624l.size() > 0 && this.f2663k.f2624l.size() > 0) {
                    int i4 = (this.f2663k.f2624l.get(0).f2619g + this.f2663k.f2618f) - (this.f2662j.f2624l.get(0).f2619g + this.f2662j.f2618f);
                    if (i4 < this.f2659g.f2626m) {
                        this.f2659g.mo3633a(i4);
                    } else {
                        this.f2659g.mo3633a(this.f2659g.f2626m);
                    }
                }
                if (this.f2659g.f2622j && this.f2662j.f2624l.size() > 0 && this.f2663k.f2624l.size() > 0) {
                    C0648f fVar = this.f2662j.f2624l.get(0);
                    C0648f fVar2 = this.f2663k.f2624l.get(0);
                    int i5 = fVar.f2619g + this.f2662j.f2618f;
                    int i6 = fVar2.f2619g + this.f2663k.f2618f;
                    float J = this.f2656d.mo3508J();
                    if (fVar == fVar2) {
                        i5 = fVar.f2619g;
                        i6 = fVar2.f2619g;
                        J = 0.5f;
                    }
                    this.f2662j.mo3633a((int) (((float) i5) + 0.5f + (((float) ((i6 - i5) - this.f2659g.f2619g)) * J)));
                    this.f2663k.mo3633a(this.f2662j.f2619g + this.f2659g.f2619g);
                    return;
                }
                return;
            }
            int i7 = this.f2662j.f2624l.get(0).f2619g + this.f2662j.f2618f;
            int i8 = this.f2663k.f2624l.get(0).f2619g + this.f2663k.f2618f;
            this.f2662j.mo3633a(i7);
            this.f2663k.mo3633a(i8);
            this.f2659g.mo3633a(i8 - i7);
        }
    }
}
