package com.ss.android.lark.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    protected List<List<View>> f144000a;

    /* renamed from: b */
    protected List<Integer> f144001b;

    /* renamed from: c */
    protected List<Integer> f144002c;

    /* renamed from: d */
    protected int f144003d;

    /* renamed from: e */
    protected List<View> f144004e;

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                if (i5 == childCount - 1) {
                    i6 = Math.max(i7, i6);
                    i9 += i8;
                }
                i4 = size2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i4 = size2;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i10 = i7 + measuredWidth;
                if (i10 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i6 = Math.max(i6, i7);
                    i9 += i8;
                } else {
                    measuredHeight = Math.max(i8, measuredHeight);
                    measuredWidth = i10;
                }
                if (i5 == childCount - 1) {
                    i6 = Math.max(measuredWidth, i6);
                    i9 += measuredHeight;
                }
                i8 = measuredHeight;
                i7 = measuredWidth;
            }
            i5++;
            size2 = i4;
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i6 + getPaddingLeft();
        }
        if (mode2 == 1073741824) {
            i3 = size2;
        } else {
            i3 = i9 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, i3);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f144000a = new ArrayList();
        this.f144001b = new ArrayList();
        this.f144002c = new ArrayList();
        this.f144004e = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.auto_select_effect, R.attr.gravity, R.attr.marginOutside, R.attr.maxLines, R.attr.max_select, R.attr.paddingBottom, R.attr.paddingEnd, R.attr.paddingStart, R.attr.paddingTop, R.attr.rowSpacing, R.attr.textColor, R.attr.textSize});
        this.f144003d = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        this.f144000a.clear();
        this.f144001b.clear();
        this.f144002c.clear();
        this.f144004e.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i8 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    this.f144001b.add(Integer.valueOf(i7));
                    this.f144000a.add(this.f144004e);
                    this.f144002c.add(Integer.valueOf(i8));
                    i7 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f144004e = new ArrayList();
                    i8 = 0;
                }
                i8 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i7 = Math.max(i7, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f144004e.add(childAt);
            }
        }
        this.f144001b.add(Integer.valueOf(i7));
        this.f144002c.add(Integer.valueOf(i8));
        this.f144000a.add(this.f144004e);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f144000a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f144004e = this.f144000a.get(i10);
            int intValue = this.f144001b.get(i10).intValue();
            int intValue2 = this.f144002c.get(i10).intValue();
            int i11 = this.f144003d;
            if (i11 != -1) {
                if (i11 == 0) {
                    i5 = (width - intValue2) / 2;
                    i6 = getPaddingLeft();
                } else if (i11 == 1) {
                    i5 = width - intValue2;
                    i6 = getPaddingLeft();
                }
                paddingLeft = i5 + i6;
            } else {
                paddingLeft = getPaddingLeft();
            }
            for (int i12 = 0; i12 < this.f144004e.size(); i12++) {
                View view = this.f144004e.get(i12);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i13 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i14 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i13, i14, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + i14);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }
}
