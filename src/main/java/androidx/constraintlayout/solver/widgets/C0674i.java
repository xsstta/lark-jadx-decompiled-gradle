package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.solver.widgets.i */
public class C0674i {

    /* renamed from: a */
    static boolean[] f2711a = new boolean[3];

    /* renamed from: a */
    public static final boolean m3295a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    static void m3294a(C0667d dVar, C0627d dVar2, ConstraintWidget constraintWidget) {
        constraintWidget.f2566j = -1;
        constraintWidget.f2567k = -1;
        if (dVar.f2540I[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.f2540I[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f2581y.f2524d;
            int A = dVar.mo3499A() - constraintWidget.f2532A.f2524d;
            constraintWidget.f2581y.f2526f = dVar2.mo3440a(constraintWidget.f2581y);
            constraintWidget.f2532A.f2526f = dVar2.mo3440a(constraintWidget.f2532A);
            dVar2.mo3441a(constraintWidget.f2581y.f2526f, i);
            dVar2.mo3441a(constraintWidget.f2532A.f2526f, A);
            constraintWidget.f2566j = 2;
            constraintWidget.mo3562e(i, A);
        }
        if (dVar.f2540I[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.f2540I[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.f2582z.f2524d;
            int B = dVar.mo3500B() - constraintWidget.f2533B.f2524d;
            constraintWidget.f2582z.f2526f = dVar2.mo3440a(constraintWidget.f2582z);
            constraintWidget.f2533B.f2526f = dVar2.mo3440a(constraintWidget.f2533B);
            dVar2.mo3441a(constraintWidget.f2582z.f2526f, i2);
            dVar2.mo3441a(constraintWidget.f2533B.f2526f, B);
            if (constraintWidget.f2552U > 0 || constraintWidget.mo3596w() == 8) {
                constraintWidget.f2534C.f2526f = dVar2.mo3440a(constraintWidget.f2534C);
                dVar2.mo3441a(constraintWidget.f2534C.f2526f, constraintWidget.f2552U + i2);
            }
            constraintWidget.f2567k = 2;
            constraintWidget.mo3566f(i2, B);
        }
    }
}
