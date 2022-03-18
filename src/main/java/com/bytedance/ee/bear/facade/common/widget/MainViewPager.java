package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MainViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f20855a;

    public void setCanScroll(boolean z) {
        this.f20855a = z;
    }

    public MainViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f20855a) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20855a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public MainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
