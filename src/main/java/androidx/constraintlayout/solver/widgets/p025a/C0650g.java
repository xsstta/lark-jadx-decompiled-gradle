package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.p025a.C0648f;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.solver.widgets.a.g */
public class C0650g extends C0648f {

    /* renamed from: m */
    public int f2626m;

    public C0650g(AbstractC0662p pVar) {
        super(pVar);
        if (pVar instanceof C0655l) {
            this.f2617e = C0648f.EnumC0649a.HORIZONTAL_DIMENSION;
        } else {
            this.f2617e = C0648f.EnumC0649a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.C0648f
    /* renamed from: a */
    public void mo3633a(int i) {
        if (!this.f2622j) {
            this.f2622j = true;
            this.f2619g = i;
            for (AbstractC0646d dVar : this.f2623k) {
                dVar.mo3615a(dVar);
            }
        }
    }
}
