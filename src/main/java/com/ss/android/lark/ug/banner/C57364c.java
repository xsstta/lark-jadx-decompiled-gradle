package com.ss.android.lark.ug.banner;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"parseColor", "", "colorString", "", "ug-banner_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.c */
public final class C57364c {
    /* renamed from: a */
    public static final int m222363a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "colorString");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            String substring = str.substring(6);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            String substring2 = str.substring(0, 6);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            return Color.parseColor(sb.toString());
        } catch (Exception unused) {
            return 0;
        }
    }
}
