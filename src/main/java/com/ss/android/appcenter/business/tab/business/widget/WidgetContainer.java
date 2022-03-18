package com.ss.android.appcenter.business.tab.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class WidgetContainer extends FrameLayout {
    public WidgetContainer(Context context) {
        super(context);
    }

    public WidgetContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
    }

    public WidgetContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
