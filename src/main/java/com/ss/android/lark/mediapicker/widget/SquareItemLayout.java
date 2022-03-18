package com.ss.android.lark.mediapicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class SquareItemLayout extends RelativeLayout {
    public SquareItemLayout(Context context) {
        super(context);
    }

    public SquareItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
