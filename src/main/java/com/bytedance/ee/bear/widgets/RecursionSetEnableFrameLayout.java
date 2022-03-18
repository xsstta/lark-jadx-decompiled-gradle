package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RecursionSetEnableFrameLayout extends FrameLayout {
    public RecursionSetEnableFrameLayout(Context context) {
        super(context);
    }

    public void setEnabled(boolean z) {
        m48971a(this, z);
    }

    public RecursionSetEnableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m48971a(View view, boolean z) {
        if (view == this) {
            super.setEnabled(z);
        } else {
            view.setEnabled(z);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m48971a(viewGroup.getChildAt(i), z);
            }
        }
    }

    public RecursionSetEnableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
