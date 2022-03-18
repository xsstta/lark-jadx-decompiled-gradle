package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.core.util.C0845f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: androidx.viewpager2.widget.e */
public final class C1617e implements ViewPager2.AbstractC1608g {

    /* renamed from: a */
    private final int f5599a;

    public C1617e(int i) {
        C0845f.m3990a(i, "Margin must be non-negative");
        this.f5599a = i;
    }

    /* renamed from: a */
    private ViewPager2 m7319a(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1608g
    /* renamed from: a */
    public void mo8353a(View view, float f) {
        ViewPager2 a = m7319a(view);
        float f2 = ((float) this.f5599a) * f;
        if (a.getOrientation() == 0) {
            if (a.isRtl()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}
