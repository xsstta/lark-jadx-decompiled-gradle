package com.ss.android.videoshop.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class TouchEventAwareRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private boolean f162272a;

    public TouchEventAwareRelativeLayout(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f162272a = true;
        try {
            z = super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            z = false;
        }
        this.f162272a = false;
        return z;
    }

    public TouchEventAwareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchEventAwareRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
