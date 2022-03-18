package com.ss.android.lark.passport.infra.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;

public class MaxHeightView extends View {

    /* renamed from: a */
    private int f123588a;

    public MaxHeightView(Context context) {
        this(context, null);
    }

    public MaxHeightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m194091a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getSize(i) > i2) {
            return View.MeasureSpec.makeMeasureSpec(i2, mode);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, m194091a(i2, this.f123588a));
    }

    public MaxHeightView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaxHeightView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f123588a = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.max_height});
        this.f123588a = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }
}
