package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ControlChildViewClickableLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f81374a = true;

    public void setChildViewClickable(boolean z) {
        this.f81374a = z;
    }

    public ControlChildViewClickableLayout(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f81374a;
    }

    public ControlChildViewClickableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
