package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.AbstractC0672g;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p;
import androidx.constraintlayout.solver.widgets.p025a.C0648f;

/* renamed from: androidx.constraintlayout.solver.widgets.a.l */
public class C0655l extends AbstractC0662p {

    /* renamed from: a */
    private static int[] f2628a = new int[2];

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: e */
    public void mo3620e() {
        if (this.f2662j.f2622j) {
            this.f2656d.mo3576m(this.f2662j.f2619g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: a */
    public boolean mo3616a() {
        if (this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2656d.f2568l == 0) {
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
        this.f2659g.mo3632a();
        this.f2661i = false;
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
        this.f2659g.f2622j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2656d.mo3599x();
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.a.l$1 */
    static /* synthetic */ class C06561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2629a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.solver.widgets.a.p$a[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.p025a.C0655l.C06561.f2629a = r0
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.C0655l.C06561.f2629a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.C0655l.C06561.f2629a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.a.p$a r1 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.EnumC0664a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0655l.C06561.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: f */
    public void mo3621f() {
        ConstraintWidget v;
        ConstraintWidget v2;
        if (this.f2656d.f2558b) {
            this.f2659g.mo3633a(this.f2656d.mo3499A());
        }
        if (!this.f2659g.f2622j) {
            this.f2658f = this.f2656d.mo3517S();
            if (this.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (((v2 = this.f2656d.mo3595v()) != null && v2.mo3517S() == ConstraintWidget.DimensionBehaviour.FIXED) || v2.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
                    int A = (v2.mo3499A() - this.f2656d.f2581y.mo3493j()) - this.f2656d.f2532A.mo3493j();
                    mo3653a(this.f2662j, v2.f2562f.f2662j, this.f2656d.f2581y.mo3493j());
                    mo3653a(this.f2663k, v2.f2562f.f2663k, -this.f2656d.f2532A.mo3493j());
                    this.f2659g.mo3633a(A);
                    return;
                } else if (this.f2658f == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2659g.mo3633a(this.f2656d.mo3499A());
                }
            }
        } else if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (((v = this.f2656d.mo3595v()) != null && v.mo3517S() == ConstraintWidget.DimensionBehaviour.FIXED) || v.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
            mo3653a(this.f2662j, v.f2562f.f2662j, this.f2656d.f2581y.mo3493j());
            mo3653a(this.f2663k, v.f2562f.f2663k, -this.f2656d.f2532A.mo3493j());
            return;
        }
        if (!this.f2659g.f2622j || !this.f2656d.f2558b) {
            if (this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                int i = this.f2656d.f2568l;
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
                } else if (i == 3) {
                    if (this.f2656d.f2569m == 3) {
                        this.f2662j.f2613a = this;
                        this.f2663k.f2613a = this;
                        this.f2656d.f2563g.f2662j.f2613a = this;
                        this.f2656d.f2563g.f2663k.f2613a = this;
                        this.f2659g.f2613a = this;
                        if (this.f2656d.mo3520V()) {
                            this.f2659g.f2624l.add(this.f2656d.f2563g.f2659g);
                            this.f2656d.f2563g.f2659g.f2623k.add(this.f2659g);
                            this.f2656d.f2563g.f2659g.f2613a = this;
                            this.f2659g.f2624l.add(this.f2656d.f2563g.f2662j);
                            this.f2659g.f2624l.add(this.f2656d.f2563g.f2663k);
                            this.f2656d.f2563g.f2662j.f2623k.add(this.f2659g);
                            this.f2656d.f2563g.f2663k.f2623k.add(this.f2659g);
                        } else if (this.f2656d.mo3519U()) {
                            this.f2656d.f2563g.f2659g.f2624l.add(this.f2659g);
                            this.f2659g.f2623k.add(this.f2656d.f2563g.f2659g);
                        } else {
                            this.f2656d.f2563g.f2659g.f2624l.add(this.f2659g);
                        }
                    } else {
                        C0650g gVar2 = this.f2656d.f2563g.f2659g;
                        this.f2659g.f2624l.add(gVar2);
                        gVar2.f2623k.add(this.f2659g);
                        this.f2656d.f2563g.f2662j.f2623k.add(this.f2659g);
                        this.f2656d.f2563g.f2663k.f2623k.add(this.f2659g);
                        this.f2659g.f2614b = true;
                        this.f2659g.f2623k.add(this.f2662j);
                        this.f2659g.f2623k.add(this.f2663k);
                        this.f2662j.f2624l.add(this.f2659g);
                        this.f2663k.f2624l.add(this.f2659g);
                    }
                }
            }
            if (this.f2656d.f2538G[0].f2523c == null || this.f2656d.f2538G[1].f2523c == null) {
                if (this.f2656d.f2538G[0].f2523c != null) {
                    C0648f a = mo3650a(this.f2656d.f2538G[0]);
                    if (a != null) {
                        mo3653a(this.f2662j, a, this.f2656d.f2538G[0].mo3493j());
                        mo3654a(this.f2663k, this.f2662j, 1, this.f2659g);
                    }
                } else if (this.f2656d.f2538G[1].f2523c != null) {
                    C0648f a2 = mo3650a(this.f2656d.f2538G[1]);
                    if (a2 != null) {
                        mo3653a(this.f2663k, a2, -this.f2656d.f2538G[1].mo3493j());
                        mo3654a(this.f2662j, this.f2663k, -1, this.f2659g);
                    }
                } else if (!(this.f2656d instanceof AbstractC0672g) && this.f2656d.mo3595v() != null) {
                    mo3653a(this.f2662j, this.f2656d.mo3595v().f2562f.f2662j, this.f2656d.mo3600y());
                    mo3654a(this.f2663k, this.f2662j, 1, this.f2659g);
                }
            } else if (this.f2656d.mo3519U()) {
                this.f2662j.f2618f = this.f2656d.f2538G[0].mo3493j();
                this.f2663k.f2618f = -this.f2656d.f2538G[1].mo3493j();
            } else {
                C0648f a3 = mo3650a(this.f2656d.f2538G[0]);
                C0648f a4 = mo3650a(this.f2656d.f2538G[1]);
                a3.mo3634b(this);
                a4.mo3634b(this);
                this.f2664l = AbstractC0662p.EnumC0664a.CENTER;
            }
        } else if (this.f2656d.f2538G[0].f2523c == null || this.f2656d.f2538G[1].f2523c == null) {
            if (this.f2656d.f2538G[0].f2523c != null) {
                C0648f a5 = mo3650a(this.f2656d.f2538G[0]);
                if (a5 != null) {
                    mo3653a(this.f2662j, a5, this.f2656d.f2538G[0].mo3493j());
                    mo3653a(this.f2663k, this.f2662j, this.f2659g.f2619g);
                }
            } else if (this.f2656d.f2538G[1].f2523c != null) {
                C0648f a6 = mo3650a(this.f2656d.f2538G[1]);
                if (a6 != null) {
                    mo3653a(this.f2663k, a6, -this.f2656d.f2538G[1].mo3493j());
                    mo3653a(this.f2662j, this.f2663k, -this.f2659g.f2619g);
                }
            } else if (!(this.f2656d instanceof AbstractC0672g) && this.f2656d.mo3595v() != null && this.f2656d.mo3522a(ConstraintAnchor.Type.CENTER).f2523c == null) {
                mo3653a(this.f2662j, this.f2656d.mo3595v().f2562f.f2662j, this.f2656d.mo3600y());
                mo3653a(this.f2663k, this.f2662j, this.f2659g.f2619g);
            }
        } else if (this.f2656d.mo3519U()) {
            this.f2662j.f2618f = this.f2656d.f2538G[0].mo3493j();
            this.f2663k.f2618f = -this.f2656d.f2538G[1].mo3493j();
        } else {
            C0648f a7 = mo3650a(this.f2656d.f2538G[0]);
            if (a7 != null) {
                mo3653a(this.f2662j, a7, this.f2656d.f2538G[0].mo3493j());
            }
            C0648f a8 = mo3650a(this.f2656d.f2538G[1]);
            if (a8 != null) {
                mo3653a(this.f2663k, a8, -this.f2656d.f2538G[1].mo3493j());
            }
            this.f2662j.f2614b = true;
            this.f2663k.f2614b = true;
        }
    }

    public C0655l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2662j.f2617e = C0648f.EnumC0649a.LEFT;
        this.f2663k.f2617e = C0648f.EnumC0649a.RIGHT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e9, code lost:
        if (r14 != 1) goto L_0x0357;
     */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p, androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3615a(androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d r17) {
        /*
        // Method dump skipped, instructions count: 1156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0655l.mo3615a(androidx.constraintlayout.solver.widgets.a.d):void");
    }

    /* renamed from: a */
    private void m3150a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }
}
