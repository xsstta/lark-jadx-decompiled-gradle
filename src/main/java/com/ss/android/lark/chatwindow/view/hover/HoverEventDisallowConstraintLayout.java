package com.ss.android.lark.chatwindow.view.hover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

public class HoverEventDisallowConstraintLayout extends ConstraintLayout {
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public HoverEventDisallowConstraintLayout(Context context) {
        super(context);
    }

    public HoverEventDisallowConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
