package com.ss.android.lark.widget.photo_picker.widget;

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

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public HoverEventDisallowConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
