package com.ss.android.lark.mm.module.player.core.layer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

public class MmVideoTimeTextView extends AppCompatTextView {

    /* renamed from: a */
    private int f117429a;

    public MmVideoTimeTextView(Context context) {
        super(context);
    }

    public MmVideoTimeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(this.f117429a, getMeasuredWidth());
        this.f117429a = max;
        setMeasuredDimension(max, View.MeasureSpec.getSize(i2));
    }

    public MmVideoTimeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
