package com.ss.android.lark.inv.export.util;

import android.text.SpannableString;

/* renamed from: com.ss.android.lark.inv.export.util.w */
public class C40144w {
    /* renamed from: a */
    public static SpannableString m159156a(String str, Object obj) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (char c : charArray) {
            if (c == '{') {
                i = sb.length();
            } else if (c == '}') {
                i2 = sb.length();
            } else {
                sb.append(c);
            }
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(obj, i, i2, 33);
        return spannableString;
    }
}
