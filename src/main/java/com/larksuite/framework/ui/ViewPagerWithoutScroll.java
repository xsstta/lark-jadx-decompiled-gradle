package com.larksuite.framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerWithoutScroll extends ViewPager {

    /* renamed from: a */
    private boolean f64649a;

    public ViewPagerWithoutScroll(Context context) {
        super(context);
    }

    public void setPagingEnabled(boolean z) {
        this.f64649a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f64649a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f64649a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public ViewPagerWithoutScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
