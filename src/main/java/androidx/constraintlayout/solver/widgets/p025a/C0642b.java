package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.widgets.AbstractC0672g;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.C0674i;
import androidx.constraintlayout.solver.widgets.C0675j;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.a.b */
public class C0642b {

    /* renamed from: a */
    private final ArrayList<ConstraintWidget> f2586a = new ArrayList<>();

    /* renamed from: b */
    private C0643a f2587b = new C0643a();

    /* renamed from: c */
    private C0667d f2588c;

    /* renamed from: androidx.constraintlayout.solver.widgets.a.b$a */
    public static class C0643a {

        /* renamed from: a */
        public static int f2589a = 0;

        /* renamed from: b */
        public static int f2590b = 1;

        /* renamed from: c */
        public static int f2591c = 2;

        /* renamed from: d */
        public ConstraintWidget.DimensionBehaviour f2592d;

        /* renamed from: e */
        public ConstraintWidget.DimensionBehaviour f2593e;

        /* renamed from: f */
        public int f2594f;

        /* renamed from: g */
        public int f2595g;

        /* renamed from: h */
        public int f2596h;

        /* renamed from: i */
        public int f2597i;

        /* renamed from: j */
        public int f2598j;

        /* renamed from: k */
        public boolean f2599k;

        /* renamed from: l */
        public boolean f2600l;

        /* renamed from: m */
        public int f2601m;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.a.b$b */
    public interface AbstractC0644b {
        /* renamed from: a */
        void mo3613a();

        /* renamed from: a */
        void mo3614a(ConstraintWidget constraintWidget, C0643a aVar);
    }

    public C0642b(C0667d dVar) {
        this.f2588c = dVar;
    }

    /* renamed from: a */
    public void mo3612a(C0667d dVar) {
        this.f2586a.clear();
        int size = dVar.aQ.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) dVar.aQ.get(i);
            if (constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f2586a.add(constraintWidget);
            }
        }
        dVar.mo3604b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        if (r8 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a7, code lost:
        if (r5.f2544M <= com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x00aa;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3088b(androidx.constraintlayout.solver.widgets.C0667d r12) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0642b.m3088b(androidx.constraintlayout.solver.widgets.d):void");
    }

    /* renamed from: a */
    private boolean m3087a(AbstractC0644b bVar, ConstraintWidget constraintWidget, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f2587b.f2592d = constraintWidget.mo3517S();
        this.f2587b.f2593e = constraintWidget.mo3518T();
        this.f2587b.f2594f = constraintWidget.mo3499A();
        this.f2587b.f2595g = constraintWidget.mo3500B();
        this.f2587b.f2600l = false;
        this.f2587b.f2601m = i;
        if (this.f2587b.f2592d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            z = true;
        } else {
            z = false;
        }
        if (this.f2587b.f2593e == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 && constraintWidget.f2570n[0] == 4) {
            this.f2587b.f2592d = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f2570n[1] == 4) {
            this.f2587b.f2593e = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.mo3614a(constraintWidget, this.f2587b);
        constraintWidget.mo3579o(this.f2587b.f2596h);
        constraintWidget.mo3581p(this.f2587b.f2597i);
        constraintWidget.mo3554c(this.f2587b.f2599k);
        constraintWidget.mo3588s(this.f2587b.f2598j);
        this.f2587b.f2601m = C0643a.f2589a;
        return this.f2587b.f2600l;
    }

    /* renamed from: a */
    private void m3086a(C0667d dVar, String str, int i, int i2) {
        int C = dVar.mo3501C();
        int D = dVar.mo3502D();
        dVar.mo3584q(0);
        dVar.mo3586r(0);
        dVar.mo3579o(i);
        dVar.mo3581p(i2);
        dVar.mo3584q(C);
        dVar.mo3586r(D);
        this.f2588c.mo3661Z();
    }

    /* renamed from: a */
    public long mo3611a(C0667d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int i10;
        boolean z3;
        int i11;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i12;
        boolean z8;
        AbstractC0644b bVar;
        int i13;
        int i14;
        int i15;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC0644b g = dVar.mo3680g();
        int size = dVar.aQ.size();
        int A = dVar.mo3499A();
        int B = dVar.mo3500B();
        boolean a = C0674i.m3295a(i, SmActions.ACTION_ONTHECALL_EXIT);
        if (a || C0674i.m3295a(i, 64)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = (ConstraintWidget) dVar.aQ.get(i16);
                if (constraintWidget.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (constraintWidget.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z13 || !z14 || constraintWidget.mo3512N() <= BitmapDescriptorFactory.HUE_RED) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if ((!constraintWidget.mo3519U() || !z15) && ((!constraintWidget.mo3520V() || !z15) && !(constraintWidget instanceof C0675j) && !constraintWidget.mo3519U() && !constraintWidget.mo3520V())) {
                    i16++;
                }
            }
            z = false;
        }
        if (z && C0627d.f2436o != null) {
            C0627d.f2436o.f2465c++;
        }
        if (!(i4 == 1073741824 && i6 == 1073741824) && !a) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z16 = z & z2;
        if (z16) {
            int min = Math.min(dVar.mo3577n(), i5);
            int min2 = Math.min(dVar.mo3575m(), i7);
            if (i4 == 1073741824 && dVar.mo3499A() != min) {
                dVar.mo3579o(min);
                dVar.mo3604b();
            }
            if (i6 == 1073741824 && dVar.mo3500B() != min2) {
                dVar.mo3581p(min2);
                dVar.mo3604b();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z3 = dVar.mo3668a(a);
                i10 = 2;
            } else {
                boolean f = dVar.mo3679f(a);
                if (i4 == 1073741824) {
                    f &= dVar.mo3669a(a, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z3 = dVar.mo3669a(a, 1) & f;
                    i10++;
                } else {
                    z3 = f;
                }
            }
            if (z3) {
                if (i4 == 1073741824) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i6 == 1073741824) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.mo3540a(z11, z12);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (z3 && i10 == 2) {
            return 0;
        }
        int h = dVar.mo3682h();
        if (size > 0) {
            m3088b(dVar);
        }
        mo3612a(dVar);
        int size2 = this.f2586a.size();
        if (size > 0) {
            m3086a(dVar, "First pass", A, B);
        }
        if (size2 > 0) {
            if (dVar.mo3517S() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVar.mo3518T() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z5 = true;
            } else {
                z5 = false;
            }
            int max = Math.max(dVar.mo3499A(), this.f2588c.mo3501C());
            int max2 = Math.max(dVar.mo3500B(), this.f2588c.mo3502D());
            int i17 = 0;
            boolean z17 = false;
            while (i17 < size2) {
                ConstraintWidget constraintWidget2 = this.f2586a.get(i17);
                if (!(constraintWidget2 instanceof C0675j)) {
                    i13 = h;
                    i15 = A;
                    i14 = B;
                } else {
                    int A2 = constraintWidget2.mo3499A();
                    i13 = h;
                    int B2 = constraintWidget2.mo3500B();
                    i15 = A;
                    boolean a2 = m3087a(g, constraintWidget2, C0643a.f2590b) | z17;
                    if (dVar.ay != null) {
                        z9 = a2;
                        i14 = B;
                        dVar.ay.f2464b++;
                    } else {
                        z9 = a2;
                        i14 = B;
                    }
                    int A3 = constraintWidget2.mo3499A();
                    int B3 = constraintWidget2.mo3500B();
                    if (A3 != A2) {
                        constraintWidget2.mo3579o(A3);
                        if (z4 && constraintWidget2.mo3503E() > max) {
                            max = Math.max(max, constraintWidget2.mo3503E() + constraintWidget2.mo3522a(ConstraintAnchor.Type.RIGHT).mo3493j());
                        }
                        z10 = true;
                    } else {
                        z10 = z9;
                    }
                    if (B3 != B2) {
                        constraintWidget2.mo3581p(B3);
                        if (z5 && constraintWidget2.mo3504F() > max2) {
                            max2 = Math.max(max2, constraintWidget2.mo3504F() + constraintWidget2.mo3522a(ConstraintAnchor.Type.BOTTOM).mo3493j());
                        }
                        z10 = true;
                    }
                    z17 = z10 | ((C0675j) constraintWidget2).mo3743h();
                }
                i17++;
                h = i13;
                A = i15;
                B = i14;
            }
            int i18 = 0;
            int i19 = 2;
            while (i18 < i19) {
                int i20 = 0;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget3 = this.f2586a.get(i20);
                    if ((!(constraintWidget3 instanceof AbstractC0672g) || (constraintWidget3 instanceof C0675j)) && !(constraintWidget3 instanceof C0670f) && constraintWidget3.mo3596w() != 8 && ((!z16 || !constraintWidget3.f2562f.f2659g.f2622j || !constraintWidget3.f2563g.f2659g.f2622j) && !(constraintWidget3 instanceof C0675j))) {
                        int A4 = constraintWidget3.mo3499A();
                        int B4 = constraintWidget3.mo3500B();
                        int L = constraintWidget3.mo3510L();
                        int i21 = C0643a.f2590b;
                        z8 = z16;
                        if (i18 == 1) {
                            i21 = C0643a.f2591c;
                        }
                        boolean a3 = m3087a(g, constraintWidget3, i21) | z17;
                        if (dVar.ay != null) {
                            i12 = size2;
                            bVar = g;
                            dVar.ay.f2464b++;
                        } else {
                            i12 = size2;
                            bVar = g;
                        }
                        int A5 = constraintWidget3.mo3499A();
                        int B5 = constraintWidget3.mo3500B();
                        if (A5 != A4) {
                            constraintWidget3.mo3579o(A5);
                            if (z4 && constraintWidget3.mo3503E() > max) {
                                max = Math.max(max, constraintWidget3.mo3503E() + constraintWidget3.mo3522a(ConstraintAnchor.Type.RIGHT).mo3493j());
                            }
                            a3 = true;
                        }
                        if (B5 != B4) {
                            constraintWidget3.mo3581p(B5);
                            if (z5 && constraintWidget3.mo3504F() > max2) {
                                max2 = Math.max(max2, constraintWidget3.mo3504F() + constraintWidget3.mo3522a(ConstraintAnchor.Type.BOTTOM).mo3493j());
                            }
                            a3 = true;
                        }
                        if (!constraintWidget3.mo3509K() || L == constraintWidget3.mo3510L()) {
                            z17 = a3;
                        } else {
                            z17 = true;
                        }
                    } else {
                        z8 = z16;
                        i12 = size2;
                        bVar = g;
                    }
                    i20++;
                    size2 = i12;
                    g = bVar;
                    z16 = z8;
                }
                if (!z17) {
                    break;
                }
                m3086a(dVar, "intermediate pass", A, B);
                i18++;
                g = g;
                z16 = z16;
                i19 = 2;
                z17 = false;
                size2 = size2;
            }
            if (z17) {
                m3086a(dVar, "2nd pass", A, B);
                if (dVar.mo3499A() < max) {
                    dVar.mo3579o(max);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (dVar.mo3500B() < max2) {
                    dVar.mo3581p(max2);
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (z7) {
                    m3086a(dVar, "3rd pass", A, B);
                }
            }
            i11 = h;
        } else {
            i11 = h;
        }
        dVar.mo3602a(i11);
        return 0;
    }
}
