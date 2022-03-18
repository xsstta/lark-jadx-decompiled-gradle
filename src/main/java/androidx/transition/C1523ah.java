package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.ah */
public class C1523ah implements AbstractC1524ai {

    /* renamed from: a */
    private final ViewOverlay f5359a;

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: a */
    public void mo7959a(Drawable drawable) {
        this.f5359a.add(drawable);
    }

    @Override // androidx.transition.AbstractC1524ai
    /* renamed from: b */
    public void mo7960b(Drawable drawable) {
        this.f5359a.remove(drawable);
    }

    C1523ah(View view) {
        this.f5359a = view.getOverlay();
    }
}
