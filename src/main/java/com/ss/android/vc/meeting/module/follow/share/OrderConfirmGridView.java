package com.ss.android.vc.meeting.module.follow.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public class OrderConfirmGridView extends GridView {
    public OrderConfirmGridView(Context context) {
        super(context);
    }

    public OrderConfirmGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public OrderConfirmGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
