package com.ss.android.lark.mine.impl.custom_status.my_status;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J0\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014J\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/FlowLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "heightMargin", "", "widthMargin", "initAttrs", "", "onLayout", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setAllNoSelected", "toggleSelected", "resId", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FlowLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f115134a;

    /* renamed from: b */
    private int f115135b;

    /* renamed from: a */
    public final void mo160579a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            childAt.setBackgroundResource(R.drawable.bg_end_time_text);
            if (!(childAt instanceof TextView)) {
                childAt = null;
            }
            TextView textView = (TextView) childAt;
            if (textView != null) {
                textView.setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FlowLinearLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m180707a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.margin_height, R.attr.margin_width});
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…yleable.FlowLinearLayout)");
        this.f115134a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f115135b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo160580a(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            if (childAt.getId() == i) {
                childAt.setBackgroundResource(R.drawable.bg_end_time_text_selected);
                if (!(childAt instanceof TextView)) {
                    childAt = null;
                }
                TextView textView = (TextView) childAt;
                if (textView != null) {
                    textView.setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
                }
            } else {
                childAt.setBackgroundResource(R.drawable.bg_end_time_text);
                if (!(childAt instanceof TextView)) {
                    childAt = null;
                }
                TextView textView2 = (TextView) childAt;
                if (textView2 != null) {
                    textView2.setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m180707a(attributeSet);
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
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (measuredWidth > 0) {
                    measuredWidth += this.f115134a;
                }
                int i9 = i7 + measuredWidth;
                if (getPaddingLeft() + i9 + getPaddingRight() > size) {
                    int coerceAtLeast = RangesKt.coerceAtLeast(i7, i4);
                    int i10 = measuredWidth - this.f115134a;
                    i5 += i6 + this.f115135b;
                    i6 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    i3 = coerceAtLeast;
                    i7 = i10;
                } else {
                    i6 = RangesKt.coerceAtLeast(i6, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                    i3 = i4;
                    i7 = i9;
                }
                if (i8 == childCount - 1) {
                    i5 += this.f115135b + i6;
                    i4 = RangesKt.coerceAtLeast(i7, i4);
                } else {
                    i4 = i3;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
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
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin + paddingLeft + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > i3 - i) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i5 + this.f115135b;
                    View childAt2 = getChildAt(i6);
                    Intrinsics.checkExpressionValueIsNotNull(childAt2, "getChildAt(i)");
                    i5 = childAt2.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i5 = RangesKt.coerceAtLeast(i5, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                }
                int i7 = marginLayoutParams.leftMargin + paddingLeft;
                int i8 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i8);
                paddingLeft += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + this.f115134a;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }
}
