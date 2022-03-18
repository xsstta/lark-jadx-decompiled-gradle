package com.ss.android.lark.mm.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"alignWidthTo", "", "Landroid/view/View;", "refView", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.b */
public final class C47144b {
    /* renamed from: a */
    public static final void m186711a(View view, View view2) {
        Intrinsics.checkParameterIsNotNull(view, "$this$alignWidthTo");
        Intrinsics.checkParameterIsNotNull(view2, "refView");
        if (view.getLayoutParams().width < view2.getWidth()) {
            view.getLayoutParams().width = RangesKt.coerceAtLeast(view.getWidth(), view2.getWidth());
            view.requestLayout();
        }
    }
}
