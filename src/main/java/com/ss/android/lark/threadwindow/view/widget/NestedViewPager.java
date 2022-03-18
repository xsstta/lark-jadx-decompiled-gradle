package com.ss.android.lark.threadwindow.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.threadtab.p2757a.C55976a;
import com.ss.android.lark.threadwindow.fragment.AbstractC56086d;

public class NestedViewPager extends ViewPager {
    public NestedViewPager(Context context) {
        super(context);
    }

    public NestedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view == this) {
            return super.canScroll(view, z, i, i2, i3);
        }
        int currentItem = getCurrentItem();
        if (!(getAdapter() instanceof C55976a)) {
            return super.canScroll(view, z, i, i2, i3);
        }
        if (currentItem < 0 || currentItem > getAdapter().getCount() - 1) {
            return super.canScroll(view, z, i, i2, i3);
        }
        Fragment item = ((C55976a) getAdapter()).getItem(currentItem);
        if (!(item instanceof AbstractC56086d)) {
            return super.canScroll(view, z, i, i2, i3);
        }
        ViewPager a = ((AbstractC56086d) item).mo191354a();
        if (a.getAdapter() == null) {
            return false;
        }
        int currentItem2 = a.getCurrentItem();
        if ((currentItem2 != a.getAdapter().getCount() - 1 || i >= 0) && (currentItem2 != 0 || i <= 0)) {
            return true;
        }
        return false;
    }
}
