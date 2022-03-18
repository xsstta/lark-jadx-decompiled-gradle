package com.ss.android.photoeditor.ve.p3018e;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"isIntersect", "", "firstView", "Landroid/view/View;", "firstViewPadding", "", "secondView", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.l */
public final class C59909l {
    /* renamed from: a */
    public static final boolean m232496a(View view, int i, View view2) {
        Intrinsics.checkParameterIsNotNull(view, "firstView");
        Intrinsics.checkParameterIsNotNull(view2, "secondView");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        rect2.left = rect.left - i;
        rect2.top = rect.top - i;
        rect2.right = rect.right - i;
        rect2.bottom = rect.bottom - i;
        Rect rect3 = new Rect();
        view2.getGlobalVisibleRect(rect3);
        return Rect.intersects(rect2, rect3);
    }
}
