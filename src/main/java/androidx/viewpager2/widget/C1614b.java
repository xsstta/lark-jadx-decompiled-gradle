package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.b */
public final class C1614b extends ViewPager2.AbstractC1603e {

    /* renamed from: a */
    private final List<ViewPager2.AbstractC1603e> f5589a;

    /* renamed from: a */
    private void m7307a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8360b(ViewPager2.AbstractC1603e eVar) {
        this.f5589a.remove(eVar);
    }

    C1614b(int i) {
        this.f5589a = new ArrayList(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8359a(ViewPager2.AbstractC1603e eVar) {
        this.f5589a.add(eVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
    public void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.AbstractC1603e eVar : this.f5589a) {
                eVar.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            m7307a(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
    public void onPageSelected(int i) {
        try {
            for (ViewPager2.AbstractC1603e eVar : this.f5589a) {
                eVar.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            m7307a(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
    public void onPageScrolled(int i, float f, int i2) {
        try {
            for (ViewPager2.AbstractC1603e eVar : this.f5589a) {
                eVar.onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m7307a(e);
        }
    }
}
