package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.b */
public class C0665b {
    /* renamed from: a */
    public static void m3195a(C0667d dVar, C0627d dVar2, ArrayList<ConstraintWidget> arrayList, int i) {
        C0666c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = dVar.aE;
            cVarArr = dVar.aH;
            i2 = 0;
        } else {
            int i4 = dVar.aF;
            cVarArr = dVar.aG;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C0666c cVar = cVarArr[i5];
            cVar.mo3658a();
            if (arrayList == null || (arrayList != null && arrayList.contains(cVar.f2667a))) {
                m3194a(dVar, dVar2, i, i2, cVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v63, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.al == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.am == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x03ca A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m3194a(androidx.constraintlayout.solver.widgets.C0667d r36, androidx.constraintlayout.solver.C0627d r37, int r38, int r39, androidx.constraintlayout.solver.widgets.C0666c r40) {
        /*
        // Method dump skipped, instructions count: 1391
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0665b.m3194a(androidx.constraintlayout.solver.widgets.d, androidx.constraintlayout.solver.d, int, int, androidx.constraintlayout.solver.widgets.c):void");
    }
}
