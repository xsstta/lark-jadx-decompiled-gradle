package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/common/widget/AutoLayoutLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defaultStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "childCountPerLineList", "", "mHeight", "mLineCount", "mOverrideGravity", "mWidth", "onLayout", "", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setGravity", "gravity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AutoLayoutLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f152010a;

    /* renamed from: b */
    private int f152011b;

    /* renamed from: c */
    private int f152012c;

    /* renamed from: d */
    private int f152013d;

    /* renamed from: e */
    private final List<Integer> f152014e;

    public AutoLayoutLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public AutoLayoutLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public AutoLayoutLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public void setGravity(int i) {
        super.setGravity(i);
        this.f152013d = i;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f152010a = 0;
        if (getChildCount() == 0) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                size = 0;
            }
            setMeasuredDimension(size, size2);
            return;
        }
        this.f152010a++;
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                measureChild(childAt, i, i2);
                paddingStart += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                if (paddingStart > size) {
                    paddingStart = childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin + getPaddingStart() + getPaddingEnd();
                    this.f152010a++;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        View childAt2 = getChildAt(0);
        Intrinsics.checkExpressionValueIsNotNull(childAt2, "firstChild");
        ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
        if (layoutParams3 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            int measuredHeight = paddingTop + ((childAt2.getMeasuredHeight() + layoutParams4.topMargin + layoutParams4.bottomMargin) * this.f152010a);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = measuredHeight;
            }
            this.f152011b = size;
            this.f152012c = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoLayoutLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f152013d = 8388613;
        this.f152014e = new ArrayList();
        setOrientation(0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = (this.f152013d & 7) | 8388608;
        this.f152014e.clear();
        if (this.f152010a > 1) {
            int paddingStart = getPaddingStart() + getPaddingEnd();
            int childCount = getChildCount();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    paddingStart += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                    if (paddingStart > this.f152011b) {
                        this.f152014e.add(Integer.valueOf(i10 - i9));
                        i8++;
                        paddingStart = getPaddingStart() + getPaddingEnd() + childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                        i9 = i10;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            if (i8 == this.f152010a - 1) {
                this.f152014e.add(Integer.valueOf(getChildCount() - i9));
            }
            View childAt2 = getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt2, "firstChild");
            ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                int paddingTop = getPaddingTop() + layoutParams4.topMargin;
                int size = this.f152014e.size();
                int i11 = 0;
                while (i7 < size) {
                    int paddingStart2 = getPaddingStart();
                    int paddingEnd = this.f152011b - getPaddingEnd();
                    setBottom(childAt2.getMeasuredHeight() + paddingTop);
                    int intValue = this.f152014e.get(i7).intValue() + i11;
                    int i12 = i11;
                    while (i12 < intValue) {
                        View childAt3 = getChildAt(i12);
                        Intrinsics.checkExpressionValueIsNotNull(childAt3, "child");
                        ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                        if (layoutParams5 != null) {
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                            int i13 = paddingStart2 + layoutParams6.leftMargin;
                            int i14 = paddingEnd - layoutParams6.rightMargin;
                            if (i6 == 8388611) {
                                i5 = i6;
                                childAt3.layout(i13, paddingTop, childAt3.getMeasuredWidth() + i13, getBottom());
                            } else {
                                i5 = i6;
                                childAt3.layout(i14 - childAt3.getMeasuredWidth(), paddingTop, i14, getBottom());
                            }
                            paddingStart2 = i13 + childAt3.getMeasuredWidth() + layoutParams6.rightMargin;
                            paddingEnd = i14 - (childAt3.getMeasuredWidth() + layoutParams6.leftMargin);
                            i12++;
                            size = size;
                            i6 = i5;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                    i11 += this.f152014e.get(i7).intValue();
                    paddingTop += childAt2.getMeasuredHeight() + layoutParams4.topMargin + layoutParams4.bottomMargin;
                    i7++;
                    size = size;
                    i6 = i6;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoLayoutLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
