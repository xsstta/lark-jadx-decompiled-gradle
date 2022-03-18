package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.text.C0835f;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    private int f31772a;

    /* renamed from: b */
    private List<View> f31773b;

    /* renamed from: f */
    protected List<List<View>> f31774f;

    /* renamed from: g */
    protected List<Integer> f31775g;

    /* renamed from: h */
    protected List<Integer> f31776h;

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
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChild(childAt, (i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, (i2 - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i8 = i4 + measuredWidth;
                if (i8 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i3 = Math.max(i3, i4);
                    i6 += i5;
                } else {
                    measuredHeight = Math.max(i5, measuredHeight);
                    measuredWidth = i8;
                }
                if (i7 == childCount - 1) {
                    i3 = Math.max(measuredWidth, i3);
                    i6 += measuredHeight;
                }
                i5 = measuredHeight;
                i4 = measuredWidth;
            } else if (i7 == childCount - 1) {
                i3 = Math.max(i4, i3);
                i6 += i5;
            }
        }
        if (mode != 1073741824) {
            size = getPaddingRight() + i3 + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = i6 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31774f = new ArrayList();
        this.f31775g = new ArrayList();
        this.f31776h = new ArrayList();
        this.f31773b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.max_select, R.attr.tag_gravity});
        this.f31772a = obtainStyledAttributes.getInt(1, -1);
        if (C0835f.m3981a(Locale.getDefault()) == 1) {
            if (this.f31772a == -1) {
                this.f31772a = 1;
            } else {
                this.f31772a = -1;
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f31774f.clear();
        this.f31775g.clear();
        this.f31776h.clear();
        this.f31773b.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i6 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    this.f31775g.add(Integer.valueOf(i5));
                    this.f31774f.add(this.f31773b);
                    this.f31776h.add(Integer.valueOf(i6));
                    i5 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f31773b = new ArrayList();
                    i6 = 0;
                }
                i6 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i5 = Math.max(i5, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f31773b.add(childAt);
            }
        }
        this.f31775g.add(Integer.valueOf(i5));
        this.f31776h.add(Integer.valueOf(i6));
        this.f31774f.add(this.f31773b);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f31774f.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f31773b = this.f31774f.get(i8);
            int intValue = this.f31775g.get(i8).intValue();
            int intValue2 = this.f31776h.get(i8).intValue();
            int i9 = this.f31772a;
            if (i9 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i9 == 0) {
                paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
            } else if (i9 == 1) {
                paddingLeft = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                Collections.reverse(this.f31773b);
            }
            for (int i10 = 0; i10 < this.f31773b.size(); i10++) {
                View view = this.f31773b.get(i10);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i11 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i12 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }
}
