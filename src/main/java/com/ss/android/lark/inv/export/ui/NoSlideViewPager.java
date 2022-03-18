package com.ss.android.lark.inv.export.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

public class NoSlideViewPager extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NoSlideViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.lark.inv.export.ui.NoSlideViewPager$a */
    static class C40095a extends Scroller {
        public C40095a(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, 360);
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, 360);
        }
    }

    public NoSlideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C40095a(getContext(), new AccelerateInterpolator()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
