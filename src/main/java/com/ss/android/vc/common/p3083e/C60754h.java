package com.ss.android.vc.common.p3083e;

import android.text.TextUtils;

/* renamed from: com.ss.android.vc.common.e.h */
public class C60754h {
    /* renamed from: b */
    public static String m236086b(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("/")) != null && split.length > 0) {
            return split[split.length - 1];
        }
        return "";
    }

    /* renamed from: a */
    public static String m236085a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length() / 3) {
            int i2 = i * 3;
            i++;
            stringBuffer.append((CharSequence) str, i2, i * 3);
            stringBuffer.append(" ");
        }
        int i3 = i * 3;
        if (i3 < str.length()) {
            stringBuffer.append((CharSequence) str, i3, str.length());
        }
        return stringBuffer.toString();
    }
}
