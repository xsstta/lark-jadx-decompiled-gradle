package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class InterceptLinearLayout extends LinearLayout {

    /* renamed from: a */
    private View.OnClickListener f81375a;

    public InterceptLinearLayout(Context context) {
        super(context);
    }

    public void setClickInterceptListener(View.OnClickListener onClickListener) {
        this.f81375a = onClickListener;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (motionEvent.getAction() != 1 || (onClickListener = this.f81375a) == null) {
            return false;
        }
        onClickListener.onClick(this);
        return true;
    }

    public InterceptLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
