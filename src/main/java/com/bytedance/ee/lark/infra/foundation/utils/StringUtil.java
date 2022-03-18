package com.bytedance.ee.lark.infra.foundation.utils;

import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.i */
public final class StringUtil {

    /* renamed from: a */
    public static final StringUtil f34171a = new StringUtil();

    /* renamed from: a */
    public final String mo48349a(String str) {
        return str == null ? "" : str;
    }

    private StringUtil() {
    }

    /* renamed from: a */
    public static final String m52868a(String str, int i, char c, char[] cArr) {
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "$this$workMask");
        Intrinsics.checkParameterIsNotNull(cArr, "except");
        int i3 = 0;
        if (i < 0) {
            int length = str.length();
            char[] cArr2 = new char[length];
            while (i3 < length) {
                cArr2[i3] = c;
                i3++;
            }
            return new String(cArr2);
        }
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int length2 = str2.length();
        for (int i4 = 0; i4 < length2; i4++) {
            char charAt = str2.charAt(i4);
            if (C69043h.m265749a(cArr, charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "filterTo(StringBuilder(), predicate).toString()");
        int length3 = sb2.length();
        int length4 = str.length() - length3;
        int i5 = i * 2;
        if (i5 > length4) {
            int length5 = str.length();
            char[] cArr3 = new char[length5];
            while (i3 < length5) {
                char charAt2 = str.charAt(i3);
                if (!C69043h.m265749a(cArr, charAt2)) {
                    charAt2 = c;
                }
                cArr3[i3] = charAt2;
                i3++;
            }
            return new String(cArr3);
        }
        int ceil = (int) Math.ceil(((double) length4) / 2.0d);
        int i6 = i5 + ceil;
        if (length4 < i6) {
            double d = ((double) (i6 - length4)) / 2.0d;
            int max = Math.max(i - ((int) Math.floor(d)), 0);
            i2 = Math.max(i - ((int) Math.ceil(d)), 0);
            i = max;
        } else {
            i2 = i;
        }
        int length6 = str.length();
        char[] cArr4 = new char[length6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i3 < length6) {
            char charAt3 = str.charAt(i3);
            if (C69043h.m265749a(cArr, charAt3)) {
                i7++;
            } else {
                int length7 = (str.length() - i3) - (length3 - i7);
                if (length7 > ceil && i8 < i) {
                    i8++;
                } else if (i9 < ceil || length7 > i2) {
                    i9++;
                    charAt3 = c;
                }
            }
            cArr4[i3] = charAt3;
            i3++;
        }
        return new String(cArr4);
    }

    /* renamed from: a */
    public static /* synthetic */ String m52869a(String str, int i, char c, char[] cArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            c = '*';
        }
        if ((i2 & 4) != 0) {
            cArr = new char[]{'-', '_', '.'};
        }
        return m52868a(str, i, c, cArr);
    }
}
