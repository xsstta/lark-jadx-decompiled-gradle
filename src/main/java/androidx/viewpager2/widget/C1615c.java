package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.c */
public final class C1615c implements ViewPager2.AbstractC1608g {

    /* renamed from: a */
    private final List<ViewPager2.AbstractC1608g> f5590a = new ArrayList();

    /* renamed from: a */
    public void mo8361a(ViewPager2.AbstractC1608g gVar) {
        this.f5590a.add(gVar);
    }

    /* renamed from: b */
    public void mo8362b(ViewPager2.AbstractC1608g gVar) {
        this.f5590a.remove(gVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1608g
    /* renamed from: a */
    public void mo8353a(View view, float f) {
        for (ViewPager2.AbstractC1608g gVar : this.f5590a) {
            gVar.mo8353a(view, f);
        }
    }
}
