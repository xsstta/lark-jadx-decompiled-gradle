package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MainViewPagerWithoutScroll extends ViewPager {

    /* renamed from: a */
    private boolean f143426a;

    public MainViewPagerWithoutScroll(Context context) {
        super(context);
    }

    public void setPagingEnabled(boolean z) {
        this.f143426a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f143426a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f143426a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public MainViewPagerWithoutScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
