package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0640a;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0642b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.a.h */
public class C0651h {

    /* renamed from: a */
    private static C0642b.C0643a f2627a = new C0642b.C0643a();

    /* renamed from: a */
    public static void m3130a(C0667d dVar, C0642b.AbstractC0644b bVar) {
        ConstraintWidget.DimensionBehaviour S = dVar.mo3517S();
        ConstraintWidget.DimensionBehaviour T = dVar.mo3518T();
        dVar.d_();
        ArrayList<ConstraintWidget> ac = dVar.ac();
        int size = ac.size();
        for (int i = 0; i < size; i++) {
            ac.get(i).d_();
        }
        boolean Y = dVar.mo3660Y();
        if (S == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo3524a(0, dVar.mo3499A());
        } else {
            dVar.mo3556d(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = ac.get(i2);
            if (constraintWidget instanceof C0670f) {
                C0670f fVar = (C0670f) constraintWidget;
                if (fVar.mo3714c() == 1) {
                    if (fVar.mo3717g() != -1) {
                        fVar.mo3720z(fVar.mo3717g());
                    } else if (fVar.mo3718h() != -1 && dVar.mo3559d()) {
                        fVar.mo3720z(dVar.mo3499A() - fVar.mo3718h());
                    } else if (dVar.mo3559d()) {
                        fVar.mo3720z((int) ((fVar.mo3716f() * ((float) dVar.mo3499A())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof C0640a) && ((C0640a) constraintWidget).mo3609h() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = ac.get(i3);
                if (constraintWidget2 instanceof C0670f) {
                    C0670f fVar2 = (C0670f) constraintWidget2;
                    if (fVar2.mo3714c() == 1) {
                        m3126a(fVar2, bVar, Y);
                    }
                }
            }
        }
        m3126a(dVar, bVar, Y);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = ac.get(i4);
                if (constraintWidget3 instanceof C0640a) {
                    C0640a aVar = (C0640a) constraintWidget3;
                    if (aVar.mo3609h() == 0) {
                        m3129a(aVar, bVar, 0, Y);
                    }
                }
            }
        }
        if (T == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo3545b(0, dVar.mo3500B());
        } else {
            dVar.mo3561e(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = ac.get(i5);
            if (constraintWidget4 instanceof C0670f) {
                C0670f fVar3 = (C0670f) constraintWidget4;
                if (fVar3.mo3714c() == 0) {
                    if (fVar3.mo3717g() != -1) {
                        fVar3.mo3720z(fVar3.mo3717g());
                    } else if (fVar3.mo3718h() != -1 && dVar.mo3564e()) {
                        fVar3.mo3720z(dVar.mo3500B() - fVar3.mo3718h());
                    } else if (dVar.mo3564e()) {
                        fVar3.mo3720z((int) ((fVar3.mo3716f() * ((float) dVar.mo3500B())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof C0640a) && ((C0640a) constraintWidget4).mo3609h() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = ac.get(i6);
                if (constraintWidget5 instanceof C0670f) {
                    C0670f fVar4 = (C0670f) constraintWidget5;
                    if (fVar4.mo3714c() == 0) {
                        m3123a(fVar4, bVar);
                    }
                }
            }
        }
        m3123a((ConstraintWidget) dVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = ac.get(i7);
                if (constraintWidget6 instanceof C0640a) {
                    C0640a aVar2 = (C0640a) constraintWidget6;
                    if (aVar2.mo3609h() == 1) {
                        m3129a(aVar2, bVar, 1, Y);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = ac.get(i8);
            if (constraintWidget7.mo3582p() && m3131a(constraintWidget7)) {
                C0667d.m3200a(constraintWidget7, bVar, f2627a, C0642b.C0643a.f2589a);
                m3126a(constraintWidget7, bVar, Y);
                m3123a(constraintWidget7, bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m3128a(C0642b.AbstractC0644b bVar, ConstraintWidget constraintWidget, boolean z) {
        float I = constraintWidget.mo3507I();
        int d = constraintWidget.f2581y.f2523c.mo3487d();
        int d2 = constraintWidget.f2532A.f2523c.mo3487d();
        int j = constraintWidget.f2581y.mo3493j() + d;
        int j2 = d2 - constraintWidget.f2532A.mo3493j();
        if (d == d2) {
            I = 0.5f;
        } else {
            d = j;
            d2 = j2;
        }
        int A = constraintWidget.mo3499A();
        int i = (d2 - d) - A;
        if (d > d2) {
            i = (d - d2) - A;
        }
        int i2 = ((int) ((I * ((float) i)) + 0.5f)) + d;
        int i3 = i2 + A;
        if (d > d2) {
            i3 = i2 - A;
        }
        constraintWidget.mo3524a(i2, i3);
        m3126a(constraintWidget, bVar, z);
    }

    /* renamed from: a */
    private static boolean m3131a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour S = constraintWidget.mo3517S();
        ConstraintWidget.DimensionBehaviour T = constraintWidget.mo3518T();
        C0667d dVar = constraintWidget.mo3595v() != null ? (C0667d) constraintWidget.mo3595v() : null;
        if (dVar != null) {
            dVar.mo3517S();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.mo3518T();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        boolean z = S == ConstraintWidget.DimensionBehaviour.FIXED || S == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (S == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2568l == 0 && constraintWidget.f2544M == BitmapDescriptorFactory.HUE_RED && constraintWidget.mo3567g(0)) || constraintWidget.mo3559d();
        boolean z2 = T == ConstraintWidget.DimensionBehaviour.FIXED || T == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (T == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2569m == 0 && constraintWidget.f2544M == BitmapDescriptorFactory.HUE_RED && constraintWidget.mo3567g(1)) || constraintWidget.mo3564e();
        if (constraintWidget.f2544M > BitmapDescriptorFactory.HUE_RED && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m3127a(C0642b.AbstractC0644b bVar, ConstraintWidget constraintWidget) {
        float J = constraintWidget.mo3508J();
        int d = constraintWidget.f2582z.f2523c.mo3487d();
        int d2 = constraintWidget.f2533B.f2523c.mo3487d();
        int j = constraintWidget.f2582z.mo3493j() + d;
        int j2 = d2 - constraintWidget.f2533B.mo3493j();
        if (d == d2) {
            J = 0.5f;
        } else {
            d = j;
            d2 = j2;
        }
        int B = constraintWidget.mo3500B();
        int i = (d2 - d) - B;
        if (d > d2) {
            i = (d - d2) - B;
        }
        int i2 = (int) ((J * ((float) i)) + 0.5f);
        int i3 = d + i2;
        int i4 = i3 + B;
        if (d > d2) {
            i3 = d - i2;
            i4 = i3 - B;
        }
        constraintWidget.mo3545b(i3, i4);
        m3123a(constraintWidget, bVar);
    }

    /* renamed from: a */
    private static void m3123a(ConstraintWidget constraintWidget, C0642b.AbstractC0644b bVar) {
        boolean z;
        boolean z2;
        if (!(constraintWidget instanceof C0667d) && constraintWidget.mo3582p() && m3131a(constraintWidget)) {
            C0667d.m3200a(constraintWidget, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
        }
        ConstraintAnchor a = constraintWidget.mo3522a(ConstraintAnchor.Type.TOP);
        ConstraintAnchor a2 = constraintWidget.mo3522a(ConstraintAnchor.Type.BOTTOM);
        int d = a.mo3487d();
        int d2 = a2.mo3487d();
        if (a.mo3477a() != null && a.mo3489f()) {
            Iterator<ConstraintAnchor> it = a.mo3477a().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2521a;
                boolean a3 = m3131a(constraintWidget2);
                if (constraintWidget2.mo3582p() && a3) {
                    C0667d.m3200a(constraintWidget2, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
                }
                if (constraintWidget2.mo3518T() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a3) {
                    if (!constraintWidget2.mo3582p()) {
                        if (next == constraintWidget2.f2582z && constraintWidget2.f2533B.f2523c == null) {
                            int j = constraintWidget2.f2582z.mo3493j() + d;
                            constraintWidget2.mo3545b(j, constraintWidget2.mo3500B() + j);
                            m3123a(constraintWidget2, bVar);
                        } else if (next == constraintWidget2.f2533B && constraintWidget2.f2533B.f2523c == null) {
                            int j2 = d - constraintWidget2.f2533B.mo3493j();
                            constraintWidget2.mo3545b(j2 - constraintWidget2.mo3500B(), j2);
                            m3123a(constraintWidget2, bVar);
                        } else if (next == constraintWidget2.f2582z && constraintWidget2.f2533B.f2523c != null && constraintWidget2.f2533B.f2523c.mo3489f()) {
                            m3127a(bVar, constraintWidget2);
                        }
                    }
                } else if (constraintWidget2.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.f2575s >= 0 && constraintWidget2.f2574r >= 0) {
                    if ((constraintWidget2.mo3596w() == 8 || (constraintWidget2.f2569m == 0 && constraintWidget2.mo3512N() == BitmapDescriptorFactory.HUE_RED)) && !constraintWidget2.mo3520V() && !constraintWidget2.mo3574l()) {
                        if ((next != constraintWidget2.f2582z || constraintWidget2.f2533B.f2523c == null || !constraintWidget2.f2533B.f2523c.mo3489f()) && (next != constraintWidget2.f2533B || constraintWidget2.f2582z.f2523c == null || !constraintWidget2.f2582z.f2523c.mo3489f())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2 && !constraintWidget2.mo3520V()) {
                            m3124a(constraintWidget, bVar, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof C0670f)) {
            if (a2.mo3477a() != null && a2.mo3489f()) {
                Iterator<ConstraintAnchor> it2 = a2.mo3477a().iterator();
                while (it2.hasNext()) {
                    ConstraintAnchor next2 = it2.next();
                    ConstraintWidget constraintWidget3 = next2.f2521a;
                    boolean a4 = m3131a(constraintWidget3);
                    if (constraintWidget3.mo3582p() && a4) {
                        C0667d.m3200a(constraintWidget3, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
                    }
                    if ((next2 != constraintWidget3.f2582z || constraintWidget3.f2533B.f2523c == null || !constraintWidget3.f2533B.f2523c.mo3489f()) && (next2 != constraintWidget3.f2533B || constraintWidget3.f2582z.f2523c == null || !constraintWidget3.f2582z.f2523c.mo3489f())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (constraintWidget3.mo3518T() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                        if (!constraintWidget3.mo3582p()) {
                            if (next2 == constraintWidget3.f2582z && constraintWidget3.f2533B.f2523c == null) {
                                int j3 = constraintWidget3.f2582z.mo3493j() + d2;
                                constraintWidget3.mo3545b(j3, constraintWidget3.mo3500B() + j3);
                                m3123a(constraintWidget3, bVar);
                            } else if (next2 == constraintWidget3.f2533B && constraintWidget3.f2582z.f2523c == null) {
                                int j4 = d2 - constraintWidget3.f2533B.mo3493j();
                                constraintWidget3.mo3545b(j4 - constraintWidget3.mo3500B(), j4);
                                m3123a(constraintWidget3, bVar);
                            } else if (z && !constraintWidget3.mo3520V()) {
                                m3127a(bVar, constraintWidget3);
                            }
                        }
                    } else if (constraintWidget3.mo3518T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.f2575s >= 0 && constraintWidget3.f2574r >= 0) {
                        if ((constraintWidget3.mo3596w() == 8 || (constraintWidget3.f2569m == 0 && constraintWidget3.mo3512N() == BitmapDescriptorFactory.HUE_RED)) && !constraintWidget3.mo3520V() && !constraintWidget3.mo3574l() && z && !constraintWidget3.mo3520V()) {
                            m3124a(constraintWidget, bVar, constraintWidget3);
                        }
                    }
                }
            }
            ConstraintAnchor a5 = constraintWidget.mo3522a(ConstraintAnchor.Type.BASELINE);
            if (a5.mo3477a() != null && a5.mo3489f()) {
                int d3 = a5.mo3487d();
                Iterator<ConstraintAnchor> it3 = a5.mo3477a().iterator();
                while (it3.hasNext()) {
                    ConstraintAnchor next3 = it3.next();
                    ConstraintWidget constraintWidget4 = next3.f2521a;
                    boolean a6 = m3131a(constraintWidget4);
                    if (constraintWidget4.mo3582p() && a6) {
                        C0667d.m3200a(constraintWidget4, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
                    }
                    if ((constraintWidget4.mo3518T() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a6) && !constraintWidget4.mo3582p() && next3 == constraintWidget4.f2534C) {
                        constraintWidget4.mo3565f(d3);
                        m3123a(constraintWidget4, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3124a(ConstraintWidget constraintWidget, C0642b.AbstractC0644b bVar, ConstraintWidget constraintWidget2) {
        int i;
        float J = constraintWidget2.mo3508J();
        int d = constraintWidget2.f2582z.f2523c.mo3487d() + constraintWidget2.f2582z.mo3493j();
        int d2 = constraintWidget2.f2533B.f2523c.mo3487d() - constraintWidget2.f2533B.mo3493j();
        if (d2 >= d) {
            int B = constraintWidget2.mo3500B();
            if (constraintWidget2.mo3596w() != 8) {
                if (constraintWidget2.f2569m == 2) {
                    if (constraintWidget instanceof C0667d) {
                        i = constraintWidget.mo3500B();
                    } else {
                        i = constraintWidget.mo3595v().mo3500B();
                    }
                    B = (int) (J * 0.5f * ((float) i));
                } else if (constraintWidget2.f2569m == 0) {
                    B = d2 - d;
                }
                B = Math.max(constraintWidget2.f2574r, B);
                if (constraintWidget2.f2575s > 0) {
                    B = Math.min(constraintWidget2.f2575s, B);
                }
            }
            int i2 = d + ((int) ((J * ((float) ((d2 - d) - B))) + 0.5f));
            constraintWidget2.mo3545b(i2, B + i2);
            m3123a(constraintWidget2, bVar);
        }
    }

    /* renamed from: a */
    private static void m3126a(ConstraintWidget constraintWidget, C0642b.AbstractC0644b bVar, boolean z) {
        boolean z2;
        boolean z3;
        if (!(constraintWidget instanceof C0667d) && constraintWidget.mo3582p() && m3131a(constraintWidget)) {
            C0667d.m3200a(constraintWidget, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
        }
        ConstraintAnchor a = constraintWidget.mo3522a(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor a2 = constraintWidget.mo3522a(ConstraintAnchor.Type.RIGHT);
        int d = a.mo3487d();
        int d2 = a2.mo3487d();
        if (a.mo3477a() != null && a.mo3489f()) {
            Iterator<ConstraintAnchor> it = a.mo3477a().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2521a;
                boolean a3 = m3131a(constraintWidget2);
                if (constraintWidget2.mo3582p() && a3) {
                    C0667d.m3200a(constraintWidget2, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
                }
                if (constraintWidget2.mo3517S() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a3) {
                    if (!constraintWidget2.mo3582p()) {
                        if (next == constraintWidget2.f2581y && constraintWidget2.f2532A.f2523c == null) {
                            int j = constraintWidget2.f2581y.mo3493j() + d;
                            constraintWidget2.mo3524a(j, constraintWidget2.mo3499A() + j);
                            m3126a(constraintWidget2, bVar, z);
                        } else if (next == constraintWidget2.f2532A && constraintWidget2.f2581y.f2523c == null) {
                            int j2 = d - constraintWidget2.f2532A.mo3493j();
                            constraintWidget2.mo3524a(j2 - constraintWidget2.mo3499A(), j2);
                            m3126a(constraintWidget2, bVar, z);
                        } else if (next == constraintWidget2.f2581y && constraintWidget2.f2532A.f2523c != null && constraintWidget2.f2532A.f2523c.mo3489f() && !constraintWidget2.mo3519U()) {
                            m3128a(bVar, constraintWidget2, z);
                        }
                    }
                } else if (constraintWidget2.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.f2572p >= 0 && constraintWidget2.f2571o >= 0) {
                    if ((constraintWidget2.mo3596w() == 8 || (constraintWidget2.f2568l == 0 && constraintWidget2.mo3512N() == BitmapDescriptorFactory.HUE_RED)) && !constraintWidget2.mo3519U() && !constraintWidget2.mo3574l()) {
                        if ((next != constraintWidget2.f2581y || constraintWidget2.f2532A.f2523c == null || !constraintWidget2.f2532A.f2523c.mo3489f()) && (next != constraintWidget2.f2532A || constraintWidget2.f2581y.f2523c == null || !constraintWidget2.f2581y.f2523c.mo3489f())) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3 && !constraintWidget2.mo3519U()) {
                            m3125a(constraintWidget, bVar, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof C0670f) && a2.mo3477a() != null && a2.mo3489f()) {
            Iterator<ConstraintAnchor> it2 = a2.mo3477a().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f2521a;
                boolean a4 = m3131a(constraintWidget3);
                if (constraintWidget3.mo3582p() && a4) {
                    C0667d.m3200a(constraintWidget3, bVar, new C0642b.C0643a(), C0642b.C0643a.f2589a);
                }
                if ((next2 != constraintWidget3.f2581y || constraintWidget3.f2532A.f2523c == null || !constraintWidget3.f2532A.f2523c.mo3489f()) && (next2 != constraintWidget3.f2532A || constraintWidget3.f2581y.f2523c == null || !constraintWidget3.f2581y.f2523c.mo3489f())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (constraintWidget3.mo3517S() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget3.mo3582p()) {
                        if (next2 == constraintWidget3.f2581y && constraintWidget3.f2532A.f2523c == null) {
                            int j3 = constraintWidget3.f2581y.mo3493j() + d2;
                            constraintWidget3.mo3524a(j3, constraintWidget3.mo3499A() + j3);
                            m3126a(constraintWidget3, bVar, z);
                        } else if (next2 == constraintWidget3.f2532A && constraintWidget3.f2581y.f2523c == null) {
                            int j4 = d2 - constraintWidget3.f2532A.mo3493j();
                            constraintWidget3.mo3524a(j4 - constraintWidget3.mo3499A(), j4);
                            m3126a(constraintWidget3, bVar, z);
                        } else if (z2 && !constraintWidget3.mo3519U()) {
                            m3128a(bVar, constraintWidget3, z);
                        }
                    }
                } else if (constraintWidget3.mo3517S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.f2572p >= 0 && constraintWidget3.f2571o >= 0) {
                    if ((constraintWidget3.mo3596w() == 8 || (constraintWidget3.f2568l == 0 && constraintWidget3.mo3512N() == BitmapDescriptorFactory.HUE_RED)) && !constraintWidget3.mo3519U() && !constraintWidget3.mo3574l() && z2 && !constraintWidget3.mo3519U()) {
                        m3125a(constraintWidget, bVar, constraintWidget3, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3129a(C0640a aVar, C0642b.AbstractC0644b bVar, int i, boolean z) {
        if (!aVar.mo3610i()) {
            return;
        }
        if (i == 0) {
            m3126a(aVar, bVar, z);
        } else {
            m3123a(aVar, bVar);
        }
    }

    /* renamed from: a */
    private static void m3125a(ConstraintWidget constraintWidget, C0642b.AbstractC0644b bVar, ConstraintWidget constraintWidget2, boolean z) {
        int i;
        float I = constraintWidget2.mo3507I();
        int d = constraintWidget2.f2581y.f2523c.mo3487d() + constraintWidget2.f2581y.mo3493j();
        int d2 = constraintWidget2.f2532A.f2523c.mo3487d() - constraintWidget2.f2532A.mo3493j();
        if (d2 >= d) {
            int A = constraintWidget2.mo3499A();
            if (constraintWidget2.mo3596w() != 8) {
                if (constraintWidget2.f2568l == 2) {
                    if (constraintWidget instanceof C0667d) {
                        i = constraintWidget.mo3499A();
                    } else {
                        i = constraintWidget.mo3595v().mo3499A();
                    }
                    A = (int) (constraintWidget2.mo3507I() * 0.5f * ((float) i));
                } else if (constraintWidget2.f2568l == 0) {
                    A = d2 - d;
                }
                A = Math.max(constraintWidget2.f2571o, A);
                if (constraintWidget2.f2572p > 0) {
                    A = Math.min(constraintWidget2.f2572p, A);
                }
            }
            int i2 = d + ((int) ((I * ((float) ((d2 - d) - A))) + 0.5f));
            constraintWidget2.mo3524a(i2, A + i2);
            m3126a(constraintWidget2, bVar, z);
        }
    }
}
