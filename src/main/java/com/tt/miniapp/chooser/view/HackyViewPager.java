package com.tt.miniapp.chooser.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class HackyViewPager extends ViewPager {
    public HackyViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public HackyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
