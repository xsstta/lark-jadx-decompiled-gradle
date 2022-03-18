package com.ss.android.lark.widget.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/layout/DynamicLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mHorizontalSpace", "mIsStretchToParent", "", "mVerticalSpace", "completeLayoutParam", "", "orientation", "init", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class DynamicLinearLayout extends LinearLayout {

    /* renamed from: a */
    public static final Companion f144047a = new Companion(null);

    /* renamed from: b */
    private boolean f144048b;

    /* renamed from: c */
    private int f144049c;

    /* renamed from: d */
    private int f144050d;

    public DynamicLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public DynamicLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public DynamicLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/layout/DynamicLinearLayout$Companion;", "", "()V", "TAG", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.layout.DynamicLinearLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m226709a(int i) {
        int childCount = getChildCount();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (i2 != childCount - 1) {
                        if (z) {
                            layoutParams2.bottomMargin = this.f144049c;
                            layoutParams2.rightMargin = 0;
                        } else {
                            layoutParams2.rightMargin = this.f144050d;
                            layoutParams2.bottomMargin = 0;
                        }
                    }
                    if (z && this.f144048b) {
                        layoutParams2.width = -1;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }
    }

    /* renamed from: a */
    private final void m226710a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enableAutoStretch, R.attr.horizontalSpace, R.attr.verticalSpace});
            Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…able.DynamicLinearLayout)");
            this.f144048b = obtainStyledAttributes.getBoolean(0, false);
            this.f144049c = obtainStyledAttributes.getDimensionPixelSize(2, this.f144049c);
            this.f144050d = obtainStyledAttributes.getDimensionPixelSize(1, this.f144050d);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 0);
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    childAt.measure(makeMeasureSpec, i2);
                    i4 += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }
        Log.m165389i("DynamicLinearLayout", "onMeasure totalWidth=" + i4 + " real widthSize=" + size);
        if (i4 > size) {
            i3 = 1;
        }
        m226709a(i3);
        setOrientation(i3);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m226710a(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DynamicLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
