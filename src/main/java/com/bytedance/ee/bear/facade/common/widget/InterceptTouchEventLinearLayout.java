package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class InterceptTouchEventLinearLayout extends LinearLayout {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public InterceptTouchEventLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
