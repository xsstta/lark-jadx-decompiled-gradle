package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0626c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.k */
public class C0676k extends ConstraintWidget {
    public ArrayList<ConstraintWidget> aQ = new ArrayList<>();

    public ArrayList<ConstraintWidget> ac() {
        return this.aQ;
    }

    public void ad() {
        this.aQ.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: s */
    public void mo3587s() {
        this.aQ.clear();
        super.mo3587s();
    }

    /* renamed from: Z */
    public void mo3661Z() {
        ArrayList<ConstraintWidget> arrayList = this.aQ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.aQ.get(i);
                if (constraintWidget instanceof C0676k) {
                    ((C0676k) constraintWidget).mo3661Z();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3748c(ConstraintWidget constraintWidget) {
        this.aQ.remove(constraintWidget);
        constraintWidget.mo3587s();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3528a(C0626c cVar) {
        super.mo3528a(cVar);
        int size = this.aQ.size();
        for (int i = 0; i < size; i++) {
            this.aQ.get(i).mo3528a(cVar);
        }
    }

    /* renamed from: b */
    public void mo3747b(ConstraintWidget constraintWidget) {
        this.aQ.add(constraintWidget);
        if (constraintWidget.mo3595v() != null) {
            ((C0676k) constraintWidget.mo3595v()).mo3748c(constraintWidget);
        }
        constraintWidget.a_(this);
    }
}
