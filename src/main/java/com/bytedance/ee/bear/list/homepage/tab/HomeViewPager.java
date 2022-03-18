package com.bytedance.ee.bear.list.homepage.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class HomeViewPager extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public HomeViewPager(Context context) {
        super(context);
    }

    public HomeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
