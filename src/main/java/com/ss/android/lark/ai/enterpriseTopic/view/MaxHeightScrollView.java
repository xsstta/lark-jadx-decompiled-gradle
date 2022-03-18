package com.ss.android.lark.ai.enterpriseTopic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

public class MaxHeightScrollView extends NestedScrollView {

    /* renamed from: a */
    private int f71851a = C52990a.m205224a(getContext(), 234.0f);

    public void setMaxHeight(int i) {
        this.f71851a = i;
        invalidate();
    }

    public MaxHeightScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView
    public void onMeasure(int i, int i2) {
        int i3 = this.f71851a;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
