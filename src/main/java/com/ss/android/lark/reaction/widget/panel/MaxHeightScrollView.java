package com.ss.android.lark.reaction.widget.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

public class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f131182a = C52990a.m205224a(getContext(), 220.0f);

    public void setMaxHeight(int i) {
        this.f131182a = i;
        invalidate();
    }

    public MaxHeightScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f131182a, Integer.MIN_VALUE));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
