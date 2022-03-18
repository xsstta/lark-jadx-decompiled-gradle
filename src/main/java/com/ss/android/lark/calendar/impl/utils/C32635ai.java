package com.ss.android.lark.calendar.impl.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"constrainLength", "", "len", "", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.ai */
public final class C32635ai {
    /* renamed from: a */
    public static final String m125200a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "$this$constrainLength");
        int length = str.length();
        if (1 > i || length <= i) {
            return str;
        }
        String substring = str.substring(0, i);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
