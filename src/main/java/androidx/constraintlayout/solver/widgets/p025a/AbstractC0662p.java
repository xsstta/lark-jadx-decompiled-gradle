package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.solver.widgets.a.p */
public abstract class AbstractC0662p implements AbstractC0646d {

    /* renamed from: c */
    public int f2655c;

    /* renamed from: d */
    ConstraintWidget f2656d;

    /* renamed from: e */
    C0657m f2657e;

    /* renamed from: f */
    protected ConstraintWidget.DimensionBehaviour f2658f;

    /* renamed from: g */
    C0650g f2659g = new C0650g(this);

    /* renamed from: h */
    public int f2660h = 0;

    /* renamed from: i */
    boolean f2661i = false;

    /* renamed from: j */
    public C0648f f2662j = new C0648f(this);

    /* renamed from: k */
    public C0648f f2663k = new C0648f(this);

    /* renamed from: l */
    protected EnumC0664a f2664l = EnumC0664a.NONE;

    /* renamed from: androidx.constraintlayout.solver.widgets.a.p$a */
    enum EnumC0664a {
        NONE,
        START,
        END,
        CENTER
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    public void mo3615a(AbstractC0646d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo3616a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3655b(AbstractC0646d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo3618c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3656c(AbstractC0646d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo3619d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo3620e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3621f();

    /* renamed from: g */
    public boolean mo3657g() {
        return this.f2661i;
    }

    /* renamed from: b */
    public long mo3617b() {
        if (this.f2659g.f2622j) {
            return (long) this.f2659g.f2619g;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.a.p$1 */
    public static /* synthetic */ class C06631 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.f2665a = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.f2665a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.f2665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.f2665a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.f2665a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p.C06631.<clinit>():void");
        }
    }

    public AbstractC0662p(ConstraintWidget constraintWidget) {
        this.f2656d = constraintWidget;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0648f mo3650a(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f2523c == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.f2523c.f2521a;
        int i = C06631.f2665a[constraintAnchor.f2523c.f2522b.ordinal()];
        if (i == 1) {
            return constraintWidget.f2562f.f2662j;
        }
        if (i == 2) {
            return constraintWidget.f2562f.f2663k;
        }
        if (i == 3) {
            return constraintWidget.f2563g.f2662j;
        }
        if (i == 4) {
            return constraintWidget.f2563g.f2637a;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f2563g.f2663k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo3649a(int i, int i2) {
        int i3;
        if (i2 == 0) {
            int i4 = this.f2656d.f2572p;
            i3 = Math.max(this.f2656d.f2571o, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            int i5 = this.f2656d.f2575s;
            i3 = Math.max(this.f2656d.f2574r, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: b */
    private void m3177b(int i, int i2) {
        AbstractC0662p pVar;
        float f;
        AbstractC0662p pVar2;
        int i3;
        int i4 = this.f2655c;
        if (i4 == 0) {
            this.f2659g.mo3633a(mo3649a(i2, i));
        } else if (i4 == 1) {
            this.f2659g.mo3633a(Math.min(mo3649a(this.f2659g.f2626m, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget v = this.f2656d.mo3595v();
            if (v != null) {
                if (i == 0) {
                    pVar = v.f2562f;
                } else {
                    pVar = v.f2563g;
                }
                if (pVar.f2659g.f2622j) {
                    ConstraintWidget constraintWidget = this.f2656d;
                    if (i == 0) {
                        f = constraintWidget.f2573q;
                    } else {
                        f = constraintWidget.f2576t;
                    }
                    this.f2659g.mo3633a(mo3649a((int) ((((float) pVar.f2659g.f2619g) * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            if (this.f2656d.f2562f.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2656d.f2562f.f2655c != 3 || this.f2656d.f2563g.f2658f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2656d.f2563g.f2655c != 3) {
                ConstraintWidget constraintWidget2 = this.f2656d;
                if (i == 0) {
                    pVar2 = constraintWidget2.f2563g;
                } else {
                    pVar2 = constraintWidget2.f2562f;
                }
                if (pVar2.f2659g.f2622j) {
                    float N = this.f2656d.mo3512N();
                    if (i == 1) {
                        i3 = (int) ((((float) pVar2.f2659g.f2619g) / N) + 0.5f);
                    } else {
                        i3 = (int) ((N * ((float) pVar2.f2659g.f2619g)) + 0.5f);
                    }
                    this.f2659g.mo3633a(i3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0648f mo3651a(ConstraintAnchor constraintAnchor, int i) {
        AbstractC0662p pVar;
        if (constraintAnchor.f2523c == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.f2523c.f2521a;
        if (i == 0) {
            pVar = constraintWidget.f2562f;
        } else {
            pVar = constraintWidget.f2563g;
        }
        int i2 = C06631.f2665a[constraintAnchor.f2523c.f2522b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f2663k;
        }
        return pVar.f2662j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3653a(C0648f fVar, C0648f fVar2, int i) {
        fVar.f2624l.add(fVar2);
        fVar.f2618f = i;
        fVar2.f2623k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3654a(C0648f fVar, C0648f fVar2, int i, C0650g gVar) {
        fVar.f2624l.add(fVar2);
        fVar.f2624l.add(this.f2659g);
        fVar.f2620h = i;
        fVar.f2621i = gVar;
        fVar2.f2623k.add(fVar);
        gVar.f2623k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3652a(AbstractC0646d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        C0648f a = mo3650a(constraintAnchor);
        C0648f a2 = mo3650a(constraintAnchor2);
        if (a.f2622j && a2.f2622j) {
            int j = a.f2619g + constraintAnchor.mo3493j();
            int j2 = a2.f2619g - constraintAnchor2.mo3493j();
            int i2 = j2 - j;
            if (!this.f2659g.f2622j && this.f2658f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                m3177b(i, i2);
            }
            if (this.f2659g.f2622j) {
                if (this.f2659g.f2619g == i2) {
                    this.f2662j.mo3633a(j);
                    this.f2663k.mo3633a(j2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f2656d;
                if (i == 0) {
                    f = constraintWidget.mo3507I();
                } else {
                    f = constraintWidget.mo3508J();
                }
                if (a == a2) {
                    j = a.f2619g;
                    j2 = a2.f2619g;
                    f = 0.5f;
                }
                this.f2662j.mo3633a((int) (((float) j) + 0.5f + (((float) ((j2 - j) - this.f2659g.f2619g)) * f)));
                this.f2663k.mo3633a(this.f2662j.f2619g + this.f2659g.f2619g);
            }
        }
    }
}
