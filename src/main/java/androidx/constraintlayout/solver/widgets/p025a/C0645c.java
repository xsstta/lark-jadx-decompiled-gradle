package androidx.constraintlayout.solver.widgets.p025a;

import androidx.constraintlayout.solver.widgets.C0667d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.a.c */
public class C0645c extends AbstractC0662p {

    /* renamed from: a */
    ArrayList<AbstractC0662p> f2602a = new ArrayList<>();

    /* renamed from: b */
    private int f2603b;

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: d */
    public void mo3619d() {
        this.f2662j.f2622j = false;
        this.f2663k.f2622j = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: a */
    public boolean mo3616a() {
        int size = this.f2602a.size();
        for (int i = 0; i < size; i++) {
            if (!this.f2602a.get(i).mo3616a()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: c */
    public void mo3618c() {
        this.f2657e = null;
        Iterator<AbstractC0662p> it = this.f2602a.iterator();
        while (it.hasNext()) {
            it.next().mo3618c();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: e */
    public void mo3620e() {
        for (int i = 0; i < this.f2602a.size(); i++) {
            this.f2602a.get(i).mo3620e();
        }
    }

    /* renamed from: i */
    private ConstraintWidget m3094i() {
        for (int i = 0; i < this.f2602a.size(); i++) {
            AbstractC0662p pVar = this.f2602a.get(i);
            if (pVar.f2656d.mo3596w() != 8) {
                return pVar.f2656d;
            }
        }
        return null;
    }

    /* renamed from: j */
    private ConstraintWidget m3095j() {
        for (int size = this.f2602a.size() - 1; size >= 0; size--) {
            AbstractC0662p pVar = this.f2602a.get(size);
            if (pVar.f2656d.mo3596w() != 8) {
                return pVar.f2656d;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: b */
    public long mo3617b() {
        int size = this.f2602a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0662p pVar = this.f2602a.get(i);
            j = j + ((long) pVar.f2662j.f2618f) + pVar.mo3617b() + ((long) pVar.f2663k.f2618f);
        }
        return j;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        if (this.f2660h == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        String sb2 = sb.toString();
        Iterator<AbstractC0662p> it = this.f2602a.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }

    /* renamed from: h */
    private void m3093h() {
        boolean z;
        int i;
        ConstraintWidget constraintWidget = this.f2656d;
        ConstraintWidget w = constraintWidget.mo3597w(this.f2660h);
        while (true) {
            constraintWidget = w;
            if (constraintWidget == null) {
                break;
            }
            w = constraintWidget.mo3597w(this.f2660h);
        }
        this.f2656d = constraintWidget;
        this.f2602a.add(constraintWidget.mo3551c(this.f2660h));
        ConstraintWidget x = constraintWidget.mo3598x(this.f2660h);
        while (x != null) {
            this.f2602a.add(x.mo3551c(this.f2660h));
            x = x.mo3598x(this.f2660h);
        }
        Iterator<AbstractC0662p> it = this.f2602a.iterator();
        while (it.hasNext()) {
            AbstractC0662p next = it.next();
            if (this.f2660h == 0) {
                next.f2656d.f2560d = this;
            } else if (this.f2660h == 1) {
                next.f2656d.f2561e = this;
            }
        }
        if (this.f2660h != 0 || !((C0667d) this.f2656d.mo3595v()).mo3660Y()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f2602a.size() > 1) {
            ArrayList<AbstractC0662p> arrayList = this.f2602a;
            this.f2656d = arrayList.get(arrayList.size() - 1).f2656d;
        }
        if (this.f2660h == 0) {
            i = this.f2656d.mo3514P();
        } else {
            i = this.f2656d.mo3515Q();
        }
        this.f2603b = i;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p
    /* renamed from: f */
    public void mo3621f() {
        Iterator<AbstractC0662p> it = this.f2602a.iterator();
        while (it.hasNext()) {
            it.next().mo3621f();
        }
        int size = this.f2602a.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.f2602a.get(0).f2656d;
            ConstraintWidget constraintWidget2 = this.f2602a.get(size - 1).f2656d;
            if (this.f2660h == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.f2581y;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.f2532A;
                C0648f a = mo3651a(constraintAnchor, 0);
                int j = constraintAnchor.mo3493j();
                ConstraintWidget i = m3094i();
                if (i != null) {
                    j = i.f2581y.mo3493j();
                }
                if (a != null) {
                    mo3653a(this.f2662j, a, j);
                }
                C0648f a2 = mo3651a(constraintAnchor2, 0);
                int j2 = constraintAnchor2.mo3493j();
                ConstraintWidget j3 = m3095j();
                if (j3 != null) {
                    j2 = j3.f2532A.mo3493j();
                }
                if (a2 != null) {
                    mo3653a(this.f2663k, a2, -j2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.f2582z;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f2533B;
                C0648f a3 = mo3651a(constraintAnchor3, 1);
                int j4 = constraintAnchor3.mo3493j();
                ConstraintWidget i2 = m3094i();
                if (i2 != null) {
                    j4 = i2.f2582z.mo3493j();
                }
                if (a3 != null) {
                    mo3653a(this.f2662j, a3, j4);
                }
                C0648f a4 = mo3651a(constraintAnchor4, 1);
                int j5 = constraintAnchor4.mo3493j();
                ConstraintWidget j6 = m3095j();
                if (j6 != null) {
                    j5 = j6.f2533B.mo3493j();
                }
                if (a4 != null) {
                    mo3653a(this.f2663k, a4, -j5);
                }
            }
            this.f2662j.f2613a = this;
            this.f2663k.f2613a = this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f2659g.f2622j != false) goto L_0x00d1;
     */
    @Override // androidx.constraintlayout.solver.widgets.p025a.AbstractC0662p, androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3615a(androidx.constraintlayout.solver.widgets.p025a.AbstractC0646d r23) {
        /*
        // Method dump skipped, instructions count: 1080
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.p025a.C0645c.mo3615a(androidx.constraintlayout.solver.widgets.a.d):void");
    }

    public C0645c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f2660h = i;
        m3093h();
    }
}
