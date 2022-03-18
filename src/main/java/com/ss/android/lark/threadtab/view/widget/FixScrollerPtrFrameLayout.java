package com.ss.android.lark.threadtab.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class FixScrollerPtrFrameLayout extends LKUIPtrClassicFrameLayout {

    /* renamed from: a */
    private boolean f138379a;

    public FixScrollerPtrFrameLayout(Context context) {
        super(context);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f138379a = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        if (this.f138379a) {
            return dispatchTouchEventSupper(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public FixScrollerPtrFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixScrollerPtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
