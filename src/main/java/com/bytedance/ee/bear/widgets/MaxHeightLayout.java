package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class MaxHeightLayout extends FrameLayout {

    /* renamed from: a */
    private int f31777a;

    public MaxHeightLayout(Context context) {
        super(context);
    }

    public void setMaxHeight(int i) {
        this.f31777a = i;
    }

    public MaxHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f31777a;
        if (size > i3) {
            size = i3;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    public MaxHeightLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
