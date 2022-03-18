package com.ss.android.lark.keyboard.widget;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.keyboard.widget.g */
public final class C41112g {
    /* renamed from: a */
    public static final void m163057a(View view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "$this$setMargin");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = i;
            marginLayoutParams.leftMargin = i2;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m163058a(View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        m163057a(view, i, i2);
    }
}
