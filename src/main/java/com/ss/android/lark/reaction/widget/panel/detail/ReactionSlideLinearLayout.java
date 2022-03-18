package com.ss.android.lark.reaction.widget.panel.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ReactionSlideLinearLayout extends LinearLayout {
    public ReactionSlideLinearLayout(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ReactionSlideLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReactionSlideLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
