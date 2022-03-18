package com.larksuite.framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class AlignParentWidthRelativeLayout extends RelativeLayout {
    public AlignParentWidthRelativeLayout(Context context) {
        super(context);
    }

    public AlignParentWidthRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ((RelativeLayout.LayoutParams) childAt.getLayoutParams()).width = measuredWidth;
            }
        }
    }

    public AlignParentWidthRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
