package com.ss.android.lark.reaction.widget.hover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

public class HoverEventDisallowConstrainLayout extends ConstraintLayout {
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public HoverEventDisallowConstrainLayout(Context context) {
        super(context);
    }

    public HoverEventDisallowConstrainLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowConstrainLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
