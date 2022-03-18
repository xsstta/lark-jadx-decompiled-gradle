package com.larksuite.framework.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J0\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014¨\u0006\u001f"}, d2 = {"Lcom/larksuite/framework/ui/PriorityLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "generateDefaultLayoutParams", "Lcom/larksuite/framework/ui/PriorityLayout$LayoutParams;", "generateLayoutParams", "lp", "Landroid/view/ViewGroup$LayoutParams;", "getMeasureMode", "handleMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "LayoutParams", "common-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PriorityLayout extends FrameLayout {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/larksuite/framework/ui/PriorityLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", ShareHitPoint.f121868c, "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "(Lcom/larksuite/framework/ui/PriorityLayout$LayoutParams;)V", "priority", "getPriority", "()I", "setPriority", "(I)V", "Companion", "common-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public static final Companion f64646a = new Companion(null);

        /* renamed from: b */
        private int f64647b = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/framework/ui/PriorityLayout$LayoutParams$Companion;", "", "()V", "HIGHEST_LEVEL", "", "LOWEST_LEVEL", "common-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.larksuite.framework.ui.PriorityLayout$LayoutParams$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final int mo93143a() {
            return this.f64647b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Intrinsics.checkParameterIsNotNull(layoutParams, ShareHitPoint.f121868c);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkParameterIsNotNull(context, "context");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.priority});
            this.f64647b = Math.max(1, Math.min(obtainStyledAttributes.getInt(0, 0), 10));
            obtainStyledAttributes.recycle();
        }
    }

    public PriorityLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PriorityLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* renamed from: b */
    private final int m94686b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.width == -2) {
            return Integer.MIN_VALUE;
        }
        return 1073741824;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(layoutParams, "lp");
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() <= 0 || i == 0) {
            super.onMeasure(i, i2);
        } else {
            m94685a(i, i2);
        }
    }

    /* renamed from: a */
    private final void m94685a(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        List[] listArr = new List[11];
        for (int i5 = 0; i5 < 11; i5++) {
            listArr[i5] = new ArrayList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getVisibility() == 8) {
                i4 = childCount;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                    i4 = childCount;
                    int i9 = layoutParams2.topMargin + layoutParams2.bottomMargin;
                    int i10 = layoutParams2.leftMargin + layoutParams2.rightMargin;
                    i8 = Math.max(i8, childAt.getMeasuredHeight() + i9);
                    listArr[layoutParams2.mo93143a()].add(childAt);
                    linkedHashMap.put(childAt, Integer.valueOf(childAt.getMeasuredWidth()));
                    linkedHashMap2.put(childAt, Integer.valueOf(i10));
                    i7 += childAt.getMeasuredWidth() + i10;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.larksuite.framework.ui.PriorityLayout.LayoutParams");
                }
            }
            i6++;
            childCount = i4;
        }
        int i11 = i7;
        int i12 = 0;
        while (i11 + paddingLeft >= size && i12 < 10) {
            i12++;
            List<View> list = listArr[i12];
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (View view : list) {
                Integer num = (Integer) linkedHashMap.get(view);
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                arrayList.add(Integer.valueOf(i3));
            }
            int sumOfInt = CollectionsKt.sumOfInt(arrayList);
            List<View> list2 = listArr[i12];
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (View view2 : list2) {
                arrayList2.add(Integer.valueOf(view2.getMinimumWidth()));
            }
            i11 = (i11 - sumOfInt) + CollectionsKt.sumOfInt(arrayList2);
        }
        if (i12 > 0) {
            for (int i13 = 0; i13 < i12; i13++) {
                for (View view3 : listArr[i13]) {
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    Intrinsics.checkExpressionValueIsNotNull(layoutParams3, "it.layoutParams");
                    view3.measure(View.MeasureSpec.makeMeasureSpec(view3.getMinimumWidth(), m94686b(layoutParams3)), i2);
                }
            }
            int i14 = (size - paddingLeft) - i11;
            List<View> list3 = listArr[i12];
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (View view4 : list3) {
                arrayList3.add(Integer.valueOf(view4.getMeasuredWidth()));
            }
            float sumOfInt2 = (float) CollectionsKt.sumOfInt(arrayList3);
            for (View view5 : listArr[i12]) {
                ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
                Intrinsics.checkExpressionValueIsNotNull(layoutParams4, "it.layoutParams");
                view5.measure(View.MeasureSpec.makeMeasureSpec(view5.getMinimumWidth() + ((int) (((float) i14) * (((float) view5.getMeasuredWidth()) / sumOfInt2))), m94686b(layoutParams4)), i2);
            }
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = Math.min(i7 + paddingLeft, size);
        }
        setMeasuredDimension(size, i8 + paddingTop);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriorityLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PriorityLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int paddingLeft = layoutParams2.leftMargin + i9 + getPaddingLeft();
                    int i11 = layoutParams2.gravity & SmEvents.EVENT_NE_RR;
                    if (i11 != 16) {
                        if (i11 == 48) {
                            i8 = layoutParams2.topMargin;
                            i7 = getPaddingTop();
                        } else if (i11 != 80) {
                            i8 = layoutParams2.topMargin;
                            i7 = getPaddingTop();
                        } else {
                            i6 = ((i4 - layoutParams2.bottomMargin) - getPaddingBottom()) - childAt.getMeasuredHeight();
                        }
                        i5 = i8 + i7;
                        childAt.layout(paddingLeft, i5, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i5);
                        i9 += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                    } else {
                        i6 = ((((((getPaddingTop() + i2) + layoutParams2.topMargin) + i4) - getPaddingBottom()) - layoutParams2.bottomMargin) - childAt.getMeasuredHeight()) / 2;
                    }
                    i5 = i6 - i2;
                    childAt.layout(paddingLeft, i5, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i5);
                    i9 += childAt.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }
}
