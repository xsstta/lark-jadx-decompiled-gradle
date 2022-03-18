package com.ss.android.lark.calendar.impl.features.common.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.NestedScrollingChild;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a)\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u0002H\u0005¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a(\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0012\u001a\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a$\u0010\u0014\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001a\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001a\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016\u001a\u0012\u0010\u001d\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\r\u001a\n\u0010\u001f\u001a\u00020\u001a*\u00020\u0002¨\u0006 "}, d2 = {"canNestedScrollHorizontally", "", "Landroid/view/View;", "canNestedScrollVertically", "constrains", "T", "", "min", "max", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;", "findChildUnder", "Landroid/view/ViewGroup;", "rawX", "", "rawY", "findFirst", "recursively", "predict", "Lkotlin/Function1;", "findHorizontalNestedScrollingTarget", "findScrollableTarget", "dScrollY", "", "findVerticalNestedScrollingTarget", "isUnder", "setLayoutSize", "", "layoutWidth", "layoutHeight", "setRoundRect", "radius", "stopScroll", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.c */
public final class C31167c {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.c$a */
    public static final class C31168a extends Lambda implements Function1<View, Boolean> {
        final /* synthetic */ float $rawX;
        final /* synthetic */ float $rawY;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31168a(float f, float f2) {
            super(1);
            this.$rawX = f;
            this.$rawY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(View view) {
            return Boolean.valueOf(invoke(view));
        }

        public final boolean invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            return C31167c.m116346a(view, this.$rawX, this.$rawY);
        }
    }

    /* renamed from: b */
    public static final boolean m116348b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$canNestedScrollHorizontally");
        if (!(view instanceof NestedScrollingChild) || (!view.canScrollHorizontally(1) && !view.canScrollHorizontally(-1))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final void m116350c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$stopScroll");
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, ((float) (view.getLeft() + view.getRight())) / 2.0f, ((float) (view.getTop() + view.getBottom())) / 2.0f, 0);
        view.dispatchTouchEvent(obtain);
        Intrinsics.checkExpressionValueIsNotNull(obtain, "e");
        obtain.setAction(3);
        view.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public static final boolean m116345a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$canNestedScrollVertically");
        if (!(view instanceof NestedScrollingChild) || (!view.canScrollVertically(1) && !view.canScrollVertically(-1))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final View m116342a(ViewGroup viewGroup, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$findChildUnder");
        return m116343a(viewGroup, false, (Function1<? super View, Boolean>) new C31168a(f, f2));
    }

    /* renamed from: a */
    public static final View m116343a(ViewGroup viewGroup, boolean z, Function1<? super View, Boolean> function1) {
        View a;
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$findFirst");
        Intrinsics.checkParameterIsNotNull(function1, "predict");
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            ViewGroup viewGroup2 = null;
            if (i >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "v");
            if (function1.invoke(childAt).booleanValue()) {
                return childAt;
            }
            if (z) {
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = childAt;
                }
                ViewGroup viewGroup3 = viewGroup2;
                if (!(viewGroup3 == null || (a = m116343a(viewGroup3, z, function1)) == null)) {
                    return a;
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    public static final View m116347b(ViewGroup viewGroup, float f, float f2) {
        View b;
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$findHorizontalNestedScrollingTarget");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "v");
            if (m116346a(childAt, f, f2)) {
                if (m116348b(childAt)) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (b = m116347b((ViewGroup) childAt, f, f2)) != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final View m116349c(ViewGroup viewGroup, float f, float f2) {
        View c;
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$findVerticalNestedScrollingTarget");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "v");
            if (m116346a(childAt, f, f2)) {
                if (m116345a(childAt)) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (c = m116349c((ViewGroup) childAt, f, f2)) != null) {
                    return c;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final <T extends Number> T m116344a(T t, T t2, T t3) {
        Intrinsics.checkParameterIsNotNull(t, "$this$constrains");
        Intrinsics.checkParameterIsNotNull(t2, "min");
        Intrinsics.checkParameterIsNotNull(t3, "max");
        if (t.doubleValue() < t2.doubleValue()) {
            return t2;
        }
        return t.doubleValue() > t3.doubleValue() ? t3 : t;
    }

    /* renamed from: a */
    public static final boolean m116346a(View view, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "$this$isUnder");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int width = iArr[0] + view.getWidth();
        int i2 = (int) f;
        if (i > i2 || width < i2) {
            return false;
        }
        int i3 = iArr[1];
        int height = iArr[1] + view.getHeight();
        int i4 = (int) f2;
        if (i3 <= i4 && height >= i4) {
            return true;
        }
        return false;
    }
}
