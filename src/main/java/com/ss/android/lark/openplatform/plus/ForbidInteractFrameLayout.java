package com.ss.android.lark.openplatform.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class ForbidInteractFrameLayout extends FrameLayout {
    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ForbidInteractFrameLayout(Context context) {
        super(context);
    }

    public ForbidInteractFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ForbidInteractFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
