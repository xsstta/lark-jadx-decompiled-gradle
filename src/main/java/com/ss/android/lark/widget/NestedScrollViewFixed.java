package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.ss.android.lark.log.Log;

public class NestedScrollViewFixed extends NestedScrollView {
    public NestedScrollViewFixed(Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.m165384e("NestedScrollViewFixed", e.getMessage(), e);
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            super.onTouchEvent(motionEvent);
            return false;
        } catch (IllegalArgumentException e) {
            Log.m165384e("NestedScrollViewFixed", e.getMessage(), e);
            e.printStackTrace();
            return false;
        }
    }

    public NestedScrollViewFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedScrollViewFixed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
