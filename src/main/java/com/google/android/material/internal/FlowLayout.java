package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0906h;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    private int f54635a;

    /* renamed from: b */
    private int f54636b;

    /* renamed from: c */
    private boolean f54637c;

    /* renamed from: d */
    private int f54638d;

    /* renamed from: b */
    public boolean mo77079b() {
        return this.f54637c;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f54636b;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f54635a;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f54638d;
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f54636b = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f54635a = i;
    }

    public void setSingleLine(boolean z) {
        this.f54637c = z;
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public int mo77707b(View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m80824a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.itemSpacing, R.attr.lineSpacing}, 0, 0);
        this.f54635a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f54636b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (paddingLeft + i5 + childAt.getMeasuredWidth() <= paddingRight || mo77079b()) {
                    i6 = paddingLeft;
                } else {
                    i6 = getPaddingLeft();
                    i7 = this.f54635a + paddingTop;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f54636b;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m80823a(size, mode, i8 + getPaddingRight()), m80823a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* renamed from: a */
    private static int m80823a(int i, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return Math.min(i3, i);
        }
        if (i2 != 1073741824) {
            return i3;
        }
        return i;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80824a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() == 0) {
            this.f54638d = 0;
            return;
        }
        this.f54638d = 1;
        if (ViewCompat.m4082h(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (z2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i9 = (i3 - i) - i6;
        int i10 = i5;
        int i11 = paddingTop;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = C0906h.m4355a(marginLayoutParams);
                    i8 = C0906h.m4357b(marginLayoutParams);
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                int measuredWidth = i10 + i7 + childAt.getMeasuredWidth();
                if (!this.f54637c && measuredWidth > i9) {
                    i11 = this.f54635a + paddingTop;
                    this.f54638d++;
                    i10 = i5;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f54638d - 1));
                int i13 = i10 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (z2) {
                    childAt.layout(i9 - measuredWidth2, i11, (i9 - i10) - i7, measuredHeight);
                } else {
                    childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                }
                i10 += i7 + i8 + childAt.getMeasuredWidth() + this.f54636b;
                paddingTop = measuredHeight;
            }
        }
    }
}
