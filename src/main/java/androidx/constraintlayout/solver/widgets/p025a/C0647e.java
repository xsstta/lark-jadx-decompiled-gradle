package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0642b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.a.e */
public class C0647e {

    /* renamed from: a */
    ArrayList<C0657m> f2604a = new ArrayList<>();

    /* renamed from: b */
    private C0667d f2605b;

    /* renamed from: c */
    private boolean f2606c = true;

    /* renamed from: d */
    private boolean f2607d = true;

    /* renamed from: e */
    private C0667d f2608e;

    /* renamed from: f */
    private ArrayList<AbstractC0662p> f2609f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0657m> f2610g = new ArrayList<>();

    /* renamed from: h */
    private C0642b.AbstractC0644b f2611h = null;

    /* renamed from: i */
    private C0642b.C0643a f2612i = new C0642b.C0643a();

    /* renamed from: b */
    public void mo3628b() {
        this.f2606c = true;
    }

    /* renamed from: c */
    public void mo3630c() {
        this.f2607d = true;
    }

    /* renamed from: a */
    public boolean mo3626a(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f2606c || this.f2607d) {
            Iterator it = this.f2605b.aQ.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.mo3592u();
                constraintWidget.f2558b = false;
                constraintWidget.f2562f.mo3619d();
                constraintWidget.f2563g.mo3619d();
            }
            this.f2605b.mo3592u();
            this.f2605b.f2558b = false;
            this.f2605b.f2562f.mo3619d();
            this.f2605b.f2563g.mo3619d();
            this.f2607d = false;
        }
        if (m3108a(this.f2608e)) {
            return false;
        }
        this.f2605b.mo3576m(0);
        this.f2605b.mo3578n(0);
        ConstraintWidget.DimensionBehaviour v = this.f2605b.mo3594v(0);
        ConstraintWidget.DimensionBehaviour v2 = this.f2605b.mo3594v(1);
        if (this.f2606c) {
            mo3631d();
        }
        int y = this.f2605b.mo3600y();
        int z5 = this.f2605b.mo3601z();
        this.f2605b.f2562f.f2662j.mo3633a(y);
        this.f2605b.f2563g.f2662j.mo3633a(z5);
        mo3623a();
        if (v == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || v2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            if (z4) {
                Iterator<AbstractC0662p> it2 = this.f2609f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo3616a()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && v == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f2605b.mo3534a(ConstraintWidget.DimensionBehaviour.FIXED);
                C0667d dVar = this.f2605b;
                dVar.mo3579o(m3104a(dVar, 0));
                this.f2605b.f2562f.f2659g.mo3633a(this.f2605b.mo3499A());
            }
            if (z4 && v2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f2605b.mo3548b(ConstraintWidget.DimensionBehaviour.FIXED);
                C0667d dVar2 = this.f2605b;
                dVar2.mo3581p(m3104a(dVar2, 1));
                this.f2605b.f2563g.f2659g.mo3633a(this.f2605b.mo3500B());
            }
        }
        if (this.f2605b.f2540I[0] == ConstraintWidget.DimensionBehaviour.FIXED || this.f2605b.f2540I[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int A = this.f2605b.mo3499A() + y;
            this.f2605b.f2562f.f2663k.mo3633a(A);
            this.f2605b.f2562f.f2659g.mo3633a(A - y);
            mo3623a();
            if (this.f2605b.f2540I[1] == ConstraintWidget.DimensionBehaviour.FIXED || this.f2605b.f2540I[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int B = this.f2605b.mo3500B() + z5;
                this.f2605b.f2563g.f2663k.mo3633a(B);
                this.f2605b.f2563g.f2659g.mo3633a(B - z5);
            }
            mo3623a();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC0662p> it3 = this.f2609f.iterator();
        while (it3.hasNext()) {
            AbstractC0662p next = it3.next();
            if (next.f2656d != this.f2605b || next.f2661i) {
                next.mo3620e();
            }
        }
        Iterator<AbstractC0662p> it4 = this.f2609f.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            AbstractC0662p next2 = it4.next();
            if ((z2 || next2.f2656d != this.f2605b) && (!next2.f2662j.f2622j || ((!next2.f2663k.f2622j && !(next2 instanceof C0653j)) || (!next2.f2659g.f2622j && !(next2 instanceof C0645c) && !(next2 instanceof C0653j))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f2605b.mo3534a(v);
        this.f2605b.mo3548b(v2);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0155 A[EDGE_INSN: B:76:0x0155->B:63:0x0155 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3627a(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0647e.mo3627a(boolean, int):boolean");
    }

    /* renamed from: a */
    public void mo3625a(ArrayList<AbstractC0662p> arrayList) {
        arrayList.clear();
        this.f2608e.f2562f.mo3618c();
        this.f2608e.f2563g.mo3618c();
        arrayList.add(this.f2608e.f2562f);
        arrayList.add(this.f2608e.f2563g);
        Iterator it = this.f2608e.aQ.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof C0670f) {
                arrayList.add(new C0653j(constraintWidget));
            } else {
                if (constraintWidget.mo3519U()) {
                    if (constraintWidget.f2560d == null) {
                        constraintWidget.f2560d = new C0645c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f2560d);
                } else {
                    arrayList.add(constraintWidget.f2562f);
                }
                if (constraintWidget.mo3520V()) {
                    if (constraintWidget.f2561e == null) {
                        constraintWidget.f2561e = new C0645c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f2561e);
                } else {
                    arrayList.add(constraintWidget.f2563g);
                }
                if (constraintWidget instanceof C0673h) {
                    arrayList.add(new C0654k(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0662p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo3618c();
        }
        Iterator<AbstractC0662p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0662p next = it3.next();
            if (next.f2656d != this.f2608e) {
                next.mo3621f();
            }
        }
    }

    /* renamed from: d */
    public void mo3631d() {
        mo3625a(this.f2609f);
        this.f2604a.clear();
        C0657m.f2630a = 0;
        m3107a(this.f2605b.f2562f, 0, this.f2604a);
        m3107a(this.f2605b.f2563g, 1, this.f2604a);
        this.f2606c = false;
    }

    /* renamed from: a */
    public void mo3623a() {
        boolean z;
        Iterator it = this.f2605b.aQ.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.f2558b) {
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.f2540I[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.f2540I[1];
                int i = constraintWidget.f2568l;
                int i2 = constraintWidget.f2569m;
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                boolean z3 = constraintWidget.f2562f.f2659g.f2622j;
                boolean z4 = constraintWidget.f2563g.f2659g.f2622j;
                if (z3 && z4) {
                    m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.f2562f.f2659g.f2619g, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.f2563g.f2659g.f2619g);
                    constraintWidget.f2558b = true;
                } else if (z3 && z2) {
                    m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.f2562f.f2659g.f2619g, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.f2563g.f2659g.f2619g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f2563g.f2659g.f2626m = constraintWidget.mo3500B();
                    } else {
                        constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                        constraintWidget.f2558b = true;
                    }
                } else if (z4 && z) {
                    m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.f2562f.f2659g.f2619g, ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.f2563g.f2659g.f2619g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f2562f.f2659g.f2626m = constraintWidget.mo3499A();
                    } else {
                        constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                        constraintWidget.f2558b = true;
                    }
                }
                if (constraintWidget.f2558b && constraintWidget.f2563g.f2638b != null) {
                    constraintWidget.f2563g.f2638b.mo3633a(constraintWidget.mo3510L());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3624a(C0642b.AbstractC0644b bVar) {
        this.f2611h = bVar;
    }

    public C0647e(C0667d dVar) {
        this.f2605b = dVar;
        this.f2608e = dVar;
    }

    /* renamed from: b */
    public boolean mo3629b(boolean z) {
        if (this.f2606c) {
            Iterator it = this.f2605b.aQ.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.mo3592u();
                constraintWidget.f2558b = false;
                constraintWidget.f2562f.f2659g.f2622j = false;
                constraintWidget.f2562f.f2661i = false;
                constraintWidget.f2562f.mo3619d();
                constraintWidget.f2563g.f2659g.f2622j = false;
                constraintWidget.f2563g.f2661i = false;
                constraintWidget.f2563g.mo3619d();
            }
            this.f2605b.mo3592u();
            this.f2605b.f2558b = false;
            this.f2605b.f2562f.f2659g.f2622j = false;
            this.f2605b.f2562f.f2661i = false;
            this.f2605b.f2562f.mo3619d();
            this.f2605b.f2563g.f2659g.f2622j = false;
            this.f2605b.f2563g.f2661i = false;
            this.f2605b.f2563g.mo3619d();
            mo3631d();
        }
        if (m3108a(this.f2608e)) {
            return false;
        }
        this.f2605b.mo3576m(0);
        this.f2605b.mo3578n(0);
        this.f2605b.f2562f.f2662j.mo3633a(0);
        this.f2605b.f2563g.f2662j.mo3633a(0);
        return true;
    }

    /* renamed from: a */
    private boolean m3108a(C0667d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i;
        int i2;
        Iterator it = dVar.aQ.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.f2540I[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget.f2540I[1];
            if (constraintWidget.mo3596w() == 8) {
                constraintWidget.f2558b = true;
            } else {
                if (constraintWidget.f2573q < 1.0f && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f2568l = 2;
                }
                if (constraintWidget.f2576t < 1.0f && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f2569m = 2;
                }
                if (constraintWidget.mo3512N() > BitmapDescriptorFactory.HUE_RED) {
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f2568l = 3;
                    } else if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f2569m = 3;
                    } else if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.f2568l == 0) {
                            constraintWidget.f2568l = 3;
                        }
                        if (constraintWidget.f2569m == 0) {
                            constraintWidget.f2569m = 3;
                        }
                    }
                }
                if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2568l == 1 && (constraintWidget.f2581y.f2523c == null || constraintWidget.f2532A.f2523c == null)) {
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviour2;
                if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2569m == 1 && (constraintWidget.f2582z.f2523c == null || constraintWidget.f2533B.f2523c == null)) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                } else {
                    dimensionBehaviour = dimensionBehaviour3;
                }
                constraintWidget.f2562f.f2658f = dimensionBehaviour4;
                constraintWidget.f2562f.f2655c = constraintWidget.f2568l;
                constraintWidget.f2563g.f2658f = dimensionBehaviour;
                constraintWidget.f2563g.f2655c = constraintWidget.f2569m;
                if ((dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int A = constraintWidget.mo3499A();
                    if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        i = (dVar.mo3499A() - constraintWidget.f2581y.f2524d) - constraintWidget.f2532A.f2524d;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i = A;
                    }
                    int B = constraintWidget.mo3500B();
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        i2 = (dVar.mo3500B() - constraintWidget.f2582z.f2524d) - constraintWidget.f2533B.f2524d;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i2 = B;
                    }
                    m3105a(constraintWidget, dimensionBehaviour4, i, dimensionBehaviour, i2);
                    constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                    constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                    constraintWidget.f2558b = true;
                } else {
                    if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.f2568l == 3) {
                            if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int B2 = constraintWidget.mo3500B();
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, (int) ((((float) B2) * constraintWidget.f2544M) + 0.5f), ConstraintWidget.DimensionBehaviour.FIXED, B2);
                            constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                            constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                            constraintWidget.f2558b = true;
                        } else if (constraintWidget.f2568l == 1) {
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour, 0);
                            constraintWidget.f2562f.f2659g.f2626m = constraintWidget.mo3499A();
                        } else if (constraintWidget.f2568l == 2) {
                            if (dVar.f2540I[0] == ConstraintWidget.DimensionBehaviour.FIXED || dVar.f2540I[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                int B3 = constraintWidget.mo3500B();
                                m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, (int) ((constraintWidget.f2573q * ((float) dVar.mo3499A())) + 0.5f), dimensionBehaviour, B3);
                                constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                                constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                                constraintWidget.f2558b = true;
                            }
                        } else if (constraintWidget.f2538G[0].f2523c == null || constraintWidget.f2538G[1].f2523c == null) {
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour, 0);
                            constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                            constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                            constraintWidget.f2558b = true;
                        }
                    }
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.f2569m == 3) {
                            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int A2 = constraintWidget.mo3499A();
                            float f = constraintWidget.f2544M;
                            if (constraintWidget.mo3513O() == -1) {
                                f = 1.0f / f;
                            }
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, A2, ConstraintWidget.DimensionBehaviour.FIXED, (int) ((((float) A2) * f) + 0.5f));
                            constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                            constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                            constraintWidget.f2558b = true;
                        } else if (constraintWidget.f2569m == 1) {
                            m3105a(constraintWidget, dimensionBehaviour4, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            constraintWidget.f2563g.f2659g.f2626m = constraintWidget.mo3500B();
                        } else if (constraintWidget.f2569m == 2) {
                            if (dVar.f2540I[1] == ConstraintWidget.DimensionBehaviour.FIXED || dVar.f2540I[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                float f2 = constraintWidget.f2576t;
                                m3105a(constraintWidget, dimensionBehaviour4, constraintWidget.mo3499A(), ConstraintWidget.DimensionBehaviour.FIXED, (int) ((f2 * ((float) dVar.mo3500B())) + 0.5f));
                                constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                                constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                                constraintWidget.f2558b = true;
                            }
                        } else if (constraintWidget.f2538G[2].f2523c == null || constraintWidget.f2538G[3].f2523c == null) {
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour, 0);
                            constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                            constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                            constraintWidget.f2558b = true;
                        }
                    }
                    if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.f2568l == 1 || constraintWidget.f2569m == 1) {
                            m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            constraintWidget.f2562f.f2659g.f2626m = constraintWidget.mo3499A();
                            constraintWidget.f2563g.f2659g.f2626m = constraintWidget.mo3500B();
                        } else if (constraintWidget.f2569m == 2 && constraintWidget.f2568l == 2) {
                            if ((dVar.f2540I[0] == ConstraintWidget.DimensionBehaviour.FIXED || dVar.f2540I[0] == ConstraintWidget.DimensionBehaviour.FIXED) && (dVar.f2540I[1] == ConstraintWidget.DimensionBehaviour.FIXED || dVar.f2540I[1] == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                float f3 = constraintWidget.f2573q;
                                float f4 = constraintWidget.f2576t;
                                m3105a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, (int) ((f3 * ((float) dVar.mo3499A())) + 0.5f), ConstraintWidget.DimensionBehaviour.FIXED, (int) ((f4 * ((float) dVar.mo3500B())) + 0.5f));
                                constraintWidget.f2562f.f2659g.mo3633a(constraintWidget.mo3499A());
                                constraintWidget.f2563g.f2659g.mo3633a(constraintWidget.mo3500B());
                                constraintWidget.f2558b = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m3104a(C0667d dVar, int i) {
        int size = this.f2604a.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f2604a.get(i2).mo3637a(dVar, i));
        }
        return (int) j;
    }

    /* renamed from: a */
    private void m3107a(AbstractC0662p pVar, int i, ArrayList<C0657m> arrayList) {
        for (AbstractC0646d dVar : pVar.f2662j.f2623k) {
            if (dVar instanceof C0648f) {
                m3106a((C0648f) dVar, i, 0, pVar.f2663k, arrayList, null);
            } else if (dVar instanceof AbstractC0662p) {
                m3106a(((AbstractC0662p) dVar).f2662j, i, 0, pVar.f2663k, arrayList, null);
            }
        }
        for (AbstractC0646d dVar2 : pVar.f2663k.f2623k) {
            if (dVar2 instanceof C0648f) {
                m3106a((C0648f) dVar2, i, 1, pVar.f2662j, arrayList, null);
            } else if (dVar2 instanceof AbstractC0662p) {
                m3106a(((AbstractC0662p) dVar2).f2663k, i, 1, pVar.f2662j, arrayList, null);
            }
        }
        if (i == 1) {
            for (AbstractC0646d dVar3 : ((C0658n) pVar).f2637a.f2623k) {
                if (dVar3 instanceof C0648f) {
                    m3106a((C0648f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: a */
    private void m3105a(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        this.f2612i.f2592d = dimensionBehaviour;
        this.f2612i.f2593e = dimensionBehaviour2;
        this.f2612i.f2594f = i;
        this.f2612i.f2595g = i2;
        this.f2611h.mo3614a(constraintWidget, this.f2612i);
        constraintWidget.mo3579o(this.f2612i.f2596h);
        constraintWidget.mo3581p(this.f2612i.f2597i);
        constraintWidget.mo3554c(this.f2612i.f2599k);
        constraintWidget.mo3588s(this.f2612i.f2598j);
    }

    /* renamed from: a */
    private void m3106a(C0648f fVar, int i, int i2, C0648f fVar2, ArrayList<C0657m> arrayList, C0657m mVar) {
        AbstractC0662p pVar = fVar.f2616d;
        if (!(pVar.f2657e != null || pVar == this.f2605b.f2562f || pVar == this.f2605b.f2563g)) {
            if (mVar == null) {
                mVar = new C0657m(pVar, i2);
                arrayList.add(mVar);
            }
            pVar.f2657e = mVar;
            mVar.mo3638a(pVar);
            for (AbstractC0646d dVar : pVar.f2662j.f2623k) {
                if (dVar instanceof C0648f) {
                    m3106a((C0648f) dVar, i, 0, fVar2, arrayList, mVar);
                }
            }
            for (AbstractC0646d dVar2 : pVar.f2663k.f2623k) {
                if (dVar2 instanceof C0648f) {
                    m3106a((C0648f) dVar2, i, 1, fVar2, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof C0658n)) {
                for (AbstractC0646d dVar3 : ((C0658n) pVar).f2637a.f2623k) {
                    if (dVar3 instanceof C0648f) {
                        m3106a((C0648f) dVar3, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (C0648f fVar3 : pVar.f2662j.f2624l) {
                if (fVar3 == fVar2) {
                    mVar.f2631b = true;
                }
                m3106a(fVar3, i, 0, fVar2, arrayList, mVar);
            }
            for (C0648f fVar4 : pVar.f2663k.f2624l) {
                if (fVar4 == fVar2) {
                    mVar.f2631b = true;
                }
                m3106a(fVar4, i, 1, fVar2, arrayList, mVar);
            }
            if (i == 1 && (pVar instanceof C0658n)) {
                for (C0648f fVar5 : ((C0658n) pVar).f2637a.f2624l) {
                    m3106a(fVar5, i, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }
}
