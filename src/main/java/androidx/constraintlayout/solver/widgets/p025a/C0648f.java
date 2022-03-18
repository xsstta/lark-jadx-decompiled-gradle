package androidx.constraintlayout.solver.widgets.p025a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.constraintlayout.solver.widgets.a.f */
public class C0648f implements AbstractC0646d {

    /* renamed from: a */
    public AbstractC0646d f2613a;

    /* renamed from: b */
    public boolean f2614b;

    /* renamed from: c */
    public boolean f2615c;

    /* renamed from: d */
    AbstractC0662p f2616d;

    /* renamed from: e */
    EnumC0649a f2617e = EnumC0649a.UNKNOWN;

    /* renamed from: f */
    int f2618f;

    /* renamed from: g */
    public int f2619g;

    /* renamed from: h */
    int f2620h = 1;

    /* renamed from: i */
    C0650g f2621i;

    /* renamed from: j */
    public boolean f2622j;

    /* renamed from: k */
    List<AbstractC0646d> f2623k = new ArrayList();

    /* renamed from: l */
    List<C0648f> f2624l = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.a.f$a */
    public enum EnumC0649a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    /* renamed from: a */
    public void mo3632a() {
        this.f2624l.clear();
        this.f2623k.clear();
        this.f2622j = false;
        this.f2619g = 0;
        this.f2615c = false;
        this.f2614b = false;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2616d.f2656d.mo3599x());
        sb.append(":");
        sb.append(this.f2617e);
        sb.append("(");
        if (this.f2622j) {
            obj = Integer.valueOf(this.f2619g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f2624l.size());
        sb.append(":d=");
        sb.append(this.f2623k.size());
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: b */
    public void mo3634b(AbstractC0646d dVar) {
        this.f2623k.add(dVar);
        if (this.f2622j) {
            dVar.mo3615a(dVar);
        }
    }

    public C0648f(AbstractC0662p pVar) {
        this.f2616d = pVar;
    }

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

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    public void mo3615a(AbstractC0646d dVar) {
        for (C0648f fVar : this.f2624l) {
            if (!fVar.f2622j) {
                return;
            }
        }
        this.f2615c = true;
        AbstractC0646d dVar2 = this.f2613a;
        if (dVar2 != null) {
            dVar2.mo3615a(this);
        }
        if (this.f2614b) {
            this.f2616d.mo3615a(this);
            return;
        }
        C0648f fVar2 = null;
        int i = 0;
        for (C0648f fVar3 : this.f2624l) {
            if (!(fVar3 instanceof C0650g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f2622j) {
            C0650g gVar = this.f2621i;
            if (gVar != null) {
                if (gVar.f2622j) {
                    this.f2618f = this.f2620h * this.f2621i.f2619g;
                } else {
                    return;
                }
            }
            mo3633a(fVar2.f2619g + this.f2618f);
        }
        AbstractC0646d dVar3 = this.f2613a;
        if (dVar3 != null) {
            dVar3.mo3615a(this);
        }
    }
}
