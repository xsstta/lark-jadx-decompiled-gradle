package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.widgets.C0665b;
import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.a.o */
public class C0660o {

    /* renamed from: b */
    static int f2640b;

    /* renamed from: a */
    ArrayList<ConstraintWidget> f2641a = new ArrayList<>();

    /* renamed from: c */
    int f2642c = -1;

    /* renamed from: d */
    boolean f2643d = false;

    /* renamed from: e */
    int f2644e = 0;

    /* renamed from: f */
    ArrayList<C0661a> f2645f = null;

    /* renamed from: g */
    private int f2646g = -1;

    /* renamed from: a */
    public int mo3640a() {
        return this.f2644e;
    }

    /* renamed from: b */
    public int mo3647b() {
        return this.f2642c;
    }

    /* renamed from: c */
    private String m3168c() {
        int i = this.f2644e;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public String toString() {
        String str = m3168c() + " [" + this.f2642c + "] <";
        Iterator<ConstraintWidget> it = this.f2641a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo3599x();
        }
        return str + " >";
    }

    /* renamed from: a */
    public void mo3642a(int i) {
        this.f2644e = i;
    }

    /* renamed from: a */
    public void mo3645a(boolean z) {
        this.f2643d = z;
    }

    public C0660o(int i) {
        int i2 = f2640b;
        f2640b = i2 + 1;
        this.f2642c = i2;
        this.f2644e = i;
    }

    /* renamed from: a */
    public void mo3644a(ArrayList<C0660o> arrayList) {
        int size = this.f2641a.size();
        if (this.f2646g != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0660o oVar = arrayList.get(i);
                if (this.f2646g == oVar.f2642c) {
                    mo3643a(this.f2644e, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: a */
    public boolean mo3646a(ConstraintWidget constraintWidget) {
        if (this.f2641a.contains(constraintWidget)) {
            return false;
        }
        this.f2641a.add(constraintWidget);
        return true;
    }

    /* renamed from: a */
    public int mo3641a(C0627d dVar, int i) {
        if (this.f2641a.size() == 0) {
            return 0;
        }
        return m3167a(dVar, this.f2641a, i);
    }

    /* renamed from: a */
    public void mo3643a(int i, C0660o oVar) {
        Iterator<ConstraintWidget> it = this.f2641a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            oVar.mo3646a(next);
            if (i == 0) {
                next.au = oVar.mo3647b();
            } else {
                next.av = oVar.mo3647b();
            }
        }
        this.f2646g = oVar.f2642c;
    }

    /* renamed from: a */
    private int m3167a(C0627d dVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int b;
        int b2;
        C0667d dVar2 = (C0667d) arrayList.get(0).mo3595v();
        dVar.mo3452b();
        dVar2.mo3530a(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo3530a(dVar, false);
        }
        if (i == 0 && dVar2.aE > 0) {
            C0665b.m3195a(dVar2, dVar, arrayList, 0);
        }
        if (i == 1 && dVar2.aF > 0) {
            C0665b.m3195a(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.mo3459f();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f2645f = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f2645f.add(new C0661a(arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            b = dVar.mo3451b(dVar2.f2581y);
            b2 = dVar.mo3451b(dVar2.f2532A);
            dVar.mo3452b();
        } else {
            b = dVar.mo3451b(dVar2.f2582z);
            b2 = dVar.mo3451b(dVar2.f2533B);
            dVar.mo3452b();
        }
        return b2 - b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.a.o$a */
    public class C0661a {

        /* renamed from: a */
        WeakReference<ConstraintWidget> f2647a;

        /* renamed from: b */
        int f2648b;

        /* renamed from: c */
        int f2649c;

        /* renamed from: d */
        int f2650d;

        /* renamed from: e */
        int f2651e;

        /* renamed from: f */
        int f2652f;

        /* renamed from: g */
        int f2653g;

        public C0661a(ConstraintWidget constraintWidget, C0627d dVar, int i) {
            this.f2647a = new WeakReference<>(constraintWidget);
            this.f2648b = dVar.mo3451b(constraintWidget.f2581y);
            this.f2649c = dVar.mo3451b(constraintWidget.f2582z);
            this.f2650d = dVar.mo3451b(constraintWidget.f2532A);
            this.f2651e = dVar.mo3451b(constraintWidget.f2533B);
            this.f2652f = dVar.mo3451b(constraintWidget.f2534C);
            this.f2653g = i;
        }
    }
}
