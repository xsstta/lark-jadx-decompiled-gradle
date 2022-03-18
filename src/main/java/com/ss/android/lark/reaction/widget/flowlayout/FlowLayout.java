package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    protected List<List<View>> f131071a;

    /* renamed from: b */
    protected List<Integer> f131072b;

    /* renamed from: c */
    protected List<Integer> f131073c;

    /* renamed from: d */
    protected int f131074d;

    /* renamed from: e */
    protected List<View> f131075e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gravity {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public void setGravity(int i) {
        this.f131074d = i;
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
        this.f131071a = new ArrayList();
        this.f131072b = new ArrayList();
        this.f131073c = new ArrayList();
        this.f131075e = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.reaction_auto_select_effect, R.attr.reaction_gravity, R.attr.reaction_max_select});
        this.f131074d = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        this.f131071a.clear();
        this.f131072b.clear();
        this.f131073c.clear();
        this.f131075e.clear();
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
                    this.f131072b.add(Integer.valueOf(i7));
                    this.f131071a.add(this.f131075e);
                    this.f131073c.add(Integer.valueOf(i8));
                    i7 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f131075e = new ArrayList();
                    i8 = 0;
                }
                i8 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i7 = Math.max(i7, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f131075e.add(childAt);
            }
        }
        this.f131072b.add(Integer.valueOf(i7));
        this.f131073c.add(Integer.valueOf(i8));
        this.f131071a.add(this.f131075e);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f131071a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f131075e = this.f131071a.get(i10);
            int intValue = this.f131072b.get(i10).intValue();
            int intValue2 = this.f131073c.get(i10).intValue();
            int i11 = this.f131074d;
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
            for (int i12 = 0; i12 < this.f131075e.size(); i12++) {
                View view = this.f131075e.get(i12);
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
