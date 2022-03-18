package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.log.Log;

public class FixTouchBugViewPager extends ViewPager {
    public FixTouchBugViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.m165386e("FixTouchBugViewPager", e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.m165386e("FixTouchBugViewPager", e);
            return false;
        }
    }

    public FixTouchBugViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
