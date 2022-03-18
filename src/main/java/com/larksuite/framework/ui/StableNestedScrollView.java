package com.larksuite.framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

public class StableNestedScrollView extends NestedScrollView {
    public StableNestedScrollView(Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e("NestedScrollViewFixed", e.getMessage(), e);
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
            Log.e("NestedScrollViewFixed", e.getMessage(), e);
            e.printStackTrace();
            return false;
        }
    }

    public StableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StableNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
