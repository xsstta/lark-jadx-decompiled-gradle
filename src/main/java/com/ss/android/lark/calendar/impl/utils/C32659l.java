package com.ss.android.lark.calendar.impl.utils;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0004\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"dp2px", "", "", "getDp2px", "(Ljava/lang/Number;)I", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.l */
public final class C32659l {
    /* renamed from: a */
    public static final int m125335a(Number number) {
        Intrinsics.checkParameterIsNotNull(number, "$this$dp2px");
        float floatValue = number.floatValue();
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics());
    }
}
