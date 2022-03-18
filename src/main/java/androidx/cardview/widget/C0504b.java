package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
class C0504b implements AbstractC0508e {
    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2840a() {
    }

    C0504b() {
    }

    /* renamed from: j */
    private C0509f m2213j(AbstractC0507d dVar) {
        return (C0509f) dVar.mo2838c();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: g */
    public void mo2853g(AbstractC0507d dVar) {
        mo2847b(dVar, mo2842a(dVar));
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: h */
    public void mo2854h(AbstractC0507d dVar) {
        mo2847b(dVar, mo2842a(dVar));
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public float mo2842a(AbstractC0507d dVar) {
        return m2213j(dVar).mo2856a();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: b */
    public float mo2846b(AbstractC0507d dVar) {
        return mo2850d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: c */
    public float mo2848c(AbstractC0507d dVar) {
        return mo2850d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: d */
    public float mo2850d(AbstractC0507d dVar) {
        return m2213j(dVar).mo2860b();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: e */
    public float mo2851e(AbstractC0507d dVar) {
        return dVar.mo2839d().getElevation();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: i */
    public ColorStateList mo2855i(AbstractC0507d dVar) {
        return m2213j(dVar).mo2861c();
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: f */
    public void mo2852f(AbstractC0507d dVar) {
        if (!dVar.mo2836a()) {
            dVar.mo2834a(0, 0, 0, 0);
            return;
        }
        float a = mo2842a(dVar);
        float d = mo2850d(dVar);
        int ceil = (int) Math.ceil((double) C0510g.m2281b(a, d, dVar.mo2837b()));
        int ceil2 = (int) Math.ceil((double) C0510g.m2278a(a, d, dVar.mo2837b()));
        dVar.mo2834a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2843a(AbstractC0507d dVar, float f) {
        m2213j(dVar).mo2857a(f);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: c */
    public void mo2849c(AbstractC0507d dVar, float f) {
        dVar.mo2839d().setElevation(f);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: b */
    public void mo2847b(AbstractC0507d dVar, float f) {
        m2213j(dVar).mo2858a(f, dVar.mo2836a(), dVar.mo2837b());
        mo2852f(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2845a(AbstractC0507d dVar, ColorStateList colorStateList) {
        m2213j(dVar).mo2859a(colorStateList);
    }

    @Override // androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2844a(AbstractC0507d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2835a(new C0509f(colorStateList, f));
        View d = dVar.mo2839d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo2847b(dVar, f3);
    }
}
