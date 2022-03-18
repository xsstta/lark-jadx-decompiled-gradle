package com.ss.android.lark.desktopmode.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class DrawerContainerView extends FrameLayout {
    public DrawerContainerView(Context context) {
        super(context);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return super.onGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getButtonState() == 2 || motionEvent.getAction() == 8) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public DrawerContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawerContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
