package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

public class MaxHeightRecyclerView extends RecyclerView {

    /* renamed from: a */
    int f152071a;

    /* renamed from: b */
    private final int f152072b = -1;

    public MaxHeightRecyclerView(Context context) {
        super(context);
    }

    public void setMaxHeight(int i) {
        if (this.f152071a != i) {
            this.f152071a = i;
            requestLayout();
        }
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236343a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        int i3 = this.f152071a;
        if (i3 != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m236343a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxHeight});
        this.f152071a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236343a(context, attributeSet);
    }
}
