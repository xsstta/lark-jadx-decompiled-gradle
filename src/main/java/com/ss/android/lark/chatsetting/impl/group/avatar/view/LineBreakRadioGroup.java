package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.ss.android.lark.utils.UIHelper;

public class LineBreakRadioGroup extends RadioGroup {

    /* renamed from: a */
    private int f89348a;

    /* renamed from: b */
    private int f89349b;

    /* renamed from: a */
    private void m134450a() {
        this.f89348a = UIHelper.dp2px(8.0f);
        this.f89349b = UIHelper.dp2px(12.0f);
    }

    public LineBreakRadioGroup(Context context) {
        super(context);
        m134450a();
    }

    public LineBreakRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m134450a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            if (measuredWidth > 0) {
                measuredWidth += this.f89348a;
            }
            int i9 = i7 + measuredWidth;
            if (getPaddingLeft() + i9 + getPaddingRight() > size) {
                int max = Math.max(i7, i4);
                i5 = i5 + i6 + this.f89349b;
                i6 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                i3 = max;
                i7 = measuredWidth - this.f89348a;
            } else {
                i6 = Math.max(i6, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i3 = i4;
                i7 = i9;
            }
            if (i8 == childCount - 1) {
                i5 = i5 + i6 + this.f89349b;
                i4 = Math.max(i7, i4);
            } else {
                i4 = i3;
            }
        }
        int paddingLeft = i4 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i5 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams.leftMargin + paddingLeft + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > i3 - i) {
                paddingLeft = getPaddingLeft();
                paddingTop = paddingTop + i5 + this.f89349b;
                i5 = getChildAt(i6).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i5 = Math.max(i5, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i7 = marginLayoutParams.leftMargin + paddingLeft;
            int i8 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
            paddingLeft += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + this.f89348a;
        }
    }
}
