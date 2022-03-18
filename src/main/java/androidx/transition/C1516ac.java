package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.ac */
public class C1516ac implements AbstractC1517ad {

    /* renamed from: a */
    private final ViewGroupOverlay f5343a;

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: a */
    public void mo7959a(Drawable drawable) {
        this.f5343a.add(drawable);
    }

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: b */
    public void mo7960b(Drawable drawable) {
        this.f5343a.remove(drawable);
    }

    C1516ac(ViewGroup viewGroup) {
        this.f5343a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.AbstractC1517ad
    /* renamed from: a */
    public void mo7957a(View view) {
        this.f5343a.add(view);
    }

    @Override // androidx.transition.AbstractC1517ad
    /* renamed from: b */
    public void mo7958b(View view) {
        this.f5343a.remove(view);
    }
}
