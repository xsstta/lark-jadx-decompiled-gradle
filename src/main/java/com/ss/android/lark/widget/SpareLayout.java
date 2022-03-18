package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class SpareLayout extends FrameLayout {
    public SpareLayout(Context context) {
        super(context);
    }

    public SpareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() <= 0) {
            super.onMeasure(i, i2);
        } else {
            m226091a(i, i2);
        }
    }

    /* renamed from: a */
    private void m226091a(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        int i5 = 0;
        for (int childCount = getChildCount() - 1; childCount > 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                int i7 = layoutParams.topMargin + layoutParams.bottomMargin;
                i4 += childAt.getMeasuredWidth() + i6;
                i5 = Math.max(i5, childAt.getMeasuredHeight() + i7);
            }
        }
        View childAt2 = getChildAt(0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
        int i8 = layoutParams2.leftMargin + layoutParams2.rightMargin;
        int i9 = layoutParams2.topMargin + layoutParams2.bottomMargin;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
        if (layoutParams3 == null || layoutParams3.width == -2) {
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = 1073741824;
        }
        measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(((size - i4) - i8) - paddingLeft, i3), i2);
        setMeasuredDimension(i4 + childAt2.getMeasuredWidth() + paddingLeft, Math.max(childAt2.getMeasuredHeight() + i9, i5) + paddingTop);
    }

    public SpareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int paddingLeft = layoutParams.leftMargin + i9 + getPaddingLeft();
                int i11 = layoutParams.gravity & SmEvents.EVENT_NE_RR;
                if (i11 != 16) {
                    if (i11 == 48) {
                        i8 = layoutParams.topMargin;
                        i7 = getPaddingTop();
                    } else if (i11 != 80) {
                        i8 = layoutParams.topMargin;
                        i7 = getPaddingTop();
                    } else {
                        i6 = ((i4 - layoutParams.bottomMargin) - getPaddingBottom()) - childAt.getMeasuredHeight();
                    }
                    i5 = i8 + i7;
                    childAt.layout(paddingLeft, i5, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i5);
                    i9 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                } else {
                    i6 = ((((((getPaddingTop() + i2) + layoutParams.topMargin) + i4) - getPaddingBottom()) - layoutParams.bottomMargin) - childAt.getMeasuredHeight()) / 2;
                }
                i5 = i6 - i2;
                childAt.layout(paddingLeft, i5, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i5);
                i9 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        }
    }
}
