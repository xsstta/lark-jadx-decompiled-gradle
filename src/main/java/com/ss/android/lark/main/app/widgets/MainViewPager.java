package com.ss.android.lark.main.app.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MainViewPager extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public MainViewPager(Context context) {
        this(context, null);
    }

    public MainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
