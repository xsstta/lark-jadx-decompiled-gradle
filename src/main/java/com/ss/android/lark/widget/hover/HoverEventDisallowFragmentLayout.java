package com.ss.android.lark.widget.hover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class HoverEventDisallowFragmentLayout extends FrameLayout {
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public HoverEventDisallowFragmentLayout(Context context) {
        super(context);
    }

    public HoverEventDisallowFragmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowFragmentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
