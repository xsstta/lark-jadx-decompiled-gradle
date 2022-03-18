package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0670f;
import androidx.constraintlayout.solver.widgets.C0673h;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.a.i */
public class C0652i {
    /* renamed from: a */
    private static C0660o m3133a(ArrayList<C0660o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0660o oVar = arrayList.get(i2);
            if (i == oVar.f2642c) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0391 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3135a(androidx.constraintlayout.solver.widgets.C0667d r16, androidx.constraintlayout.solver.widgets.p025a.C0642b.AbstractC0644b r17) {
        /*
        // Method dump skipped, instructions count: 920
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0652i.m3135a(androidx.constraintlayout.solver.widgets.d, androidx.constraintlayout.solver.widgets.a.b$b):boolean");
    }

    /* renamed from: a */
    public static boolean m3134a(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z;
        boolean z2;
        if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            z = true;
        } else {
            z = false;
        }
        if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0660o m3132a(ConstraintWidget constraintWidget, int i, ArrayList<C0660o> arrayList, C0660o oVar) {
        int i2;
        int J;
        if (i == 0) {
            i2 = constraintWidget.au;
        } else {
            i2 = constraintWidget.av;
        }
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f2642c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0660o oVar2 = arrayList.get(i4);
                if (oVar2.mo3647b() == i2) {
                    if (oVar != null) {
                        oVar.mo3643a(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((constraintWidget instanceof C0673h) && (J = ((C0673h) constraintWidget).mo3724J(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C0660o oVar3 = arrayList.get(i5);
                    if (oVar3.mo3647b() == J) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new C0660o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo3646a(constraintWidget)) {
            if (constraintWidget instanceof C0670f) {
                C0670f fVar = (C0670f) constraintWidget;
                ConstraintAnchor b = fVar.mo3604b();
                if (fVar.mo3714c() == 0) {
                    i3 = 1;
                }
                b.mo3479a(i3, arrayList, oVar);
            }
            if (i == 0) {
                constraintWidget.au = oVar.mo3647b();
                constraintWidget.f2581y.mo3479a(i, arrayList, oVar);
                constraintWidget.f2532A.mo3479a(i, arrayList, oVar);
            } else {
                constraintWidget.av = oVar.mo3647b();
                constraintWidget.f2582z.mo3479a(i, arrayList, oVar);
                constraintWidget.f2534C.mo3479a(i, arrayList, oVar);
                constraintWidget.f2533B.mo3479a(i, arrayList, oVar);
            }
            constraintWidget.f2537F.mo3479a(i, arrayList, oVar);
        }
        return oVar;
    }
}
