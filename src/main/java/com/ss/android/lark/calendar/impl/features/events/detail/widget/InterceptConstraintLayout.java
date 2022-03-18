package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

public class InterceptConstraintLayout extends ConstraintLayout {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public InterceptConstraintLayout(Context context) {
        super(context);
    }

    public InterceptConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
