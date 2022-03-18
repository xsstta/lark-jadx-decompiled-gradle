package com.ss.android.lark.pin.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;

public class BoundedLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f128494a;

    /* renamed from: b */
    private int f128495b;

    public BoundedLinearLayout(Context context) {
        super(context);
        m200355a(context, null);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m200355a(context, attributeSet);
    }

    /* renamed from: a */
    private void m200355a(Context context, AttributeSet attributeSet) {
        this.f128494a = 0;
        this.f128495b = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bounded_height, R.attr.bounded_width});
            this.f128495b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f128494a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f128495b;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f128495b, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f128494a;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f128494a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m200355a(context, attributeSet);
    }
}
