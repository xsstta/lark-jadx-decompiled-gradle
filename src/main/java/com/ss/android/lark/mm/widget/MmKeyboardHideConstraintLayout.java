package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;

public class MmKeyboardHideConstraintLayout extends ConstraintLayout {
    public MmKeyboardHideConstraintLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && SoftKeyboardUtil.f118667a.mo165515c(this)) {
            SoftKeyboardUtil.f118667a.mo165512a(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MmKeyboardHideConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmKeyboardHideConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
