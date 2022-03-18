package com.ss.android.lark.threadwindow.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class SupportOverlapViewGroup extends ViewGroup {

    /* renamed from: a */
    private int f139132a;

    /* renamed from: b */
    private int f139133b;

    /* renamed from: c */
    private int f139134c;

    /* renamed from: d */
    private int f139135d;

    public SupportOverlapViewGroup(Context context) {
        this(context, null);
    }

    public SupportOverlapViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        setMeasuredDimension((this.f139133b * childCount) - ((childCount - 1) * this.f139132a), this.f139134c + this.f139135d);
    }

    public SupportOverlapViewGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SupportOverlapViewGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.child_view_height, R.attr.child_view_width, R.attr.overlap_width, R.attr.padding_vertical});
        this.f139132a = obtainStyledAttributes.getDimensionPixelSize(2, UIHelper.dp2px(8.0f));
        this.f139133b = obtainStyledAttributes.getDimensionPixelSize(1, UIHelper.dp2px(33.0f));
        this.f139134c = obtainStyledAttributes.getDimensionPixelSize(0, UIHelper.dp2px(24.0f));
        this.f139135d = obtainStyledAttributes.getDimensionPixelSize(3, UIHelper.dp2px(30.0f));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int paddingLeft = getPaddingLeft();
            int i6 = this.f139133b;
            int i7 = paddingLeft + ((i6 - this.f139132a) * ((childCount - i5) - 1));
            childAt.layout(i7, getPaddingTop(), i6 + i7, getPaddingTop() + this.f139134c);
        }
    }
}
