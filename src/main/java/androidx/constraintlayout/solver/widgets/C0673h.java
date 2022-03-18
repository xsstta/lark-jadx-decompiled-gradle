package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.p025a.C0652i;
import androidx.constraintlayout.solver.widgets.p025a.C0660o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.h */
public class C0673h extends ConstraintWidget implements AbstractC0672g {
    public ConstraintWidget[] aN = new ConstraintWidget[4];
    public int aO;

    @Override // androidx.constraintlayout.solver.widgets.AbstractC0672g
    /* renamed from: a */
    public void mo3722a(C0667d dVar) {
    }

    @Override // androidx.constraintlayout.solver.widgets.AbstractC0672g
    /* renamed from: j */
    public void mo3723j() {
        this.aO = 0;
        Arrays.fill(this.aN, (Object) null);
    }

    /* renamed from: J */
    public int mo3724J(int i) {
        for (int i2 = 0; i2 < this.aO; i2++) {
            ConstraintWidget constraintWidget = this.aN[i2];
            if (i == 0 && constraintWidget.au != -1) {
                return constraintWidget.au;
            }
            if (i == 1 && constraintWidget.av != -1) {
                return constraintWidget.av;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.solver.widgets.AbstractC0672g
    /* renamed from: a */
    public void mo3721a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.aO + 1;
            ConstraintWidget[] constraintWidgetArr = this.aN;
            if (i > constraintWidgetArr.length) {
                this.aN = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.aN;
            int i2 = this.aO;
            constraintWidgetArr2[i2] = constraintWidget;
            this.aO = i2 + 1;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3536a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo3536a(constraintWidget, hashMap);
        C0673h hVar = (C0673h) constraintWidget;
        this.aO = 0;
        int i = hVar.aO;
        for (int i2 = 0; i2 < i; i2++) {
            mo3721a(hashMap.get(hVar.aN[i2]));
        }
    }

    /* renamed from: a */
    public void mo3725a(ArrayList<C0660o> arrayList, int i, C0660o oVar) {
        for (int i2 = 0; i2 < this.aO; i2++) {
            oVar.mo3646a(this.aN[i2]);
        }
        for (int i3 = 0; i3 < this.aO; i3++) {
            C0652i.m3132a(this.aN[i3], i, arrayList, oVar);
        }
    }
}
