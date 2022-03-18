package com.ss.android.lark.mediapicker.utils;

/* renamed from: com.ss.android.lark.mediapicker.utils.e */
public class C44748e {
    /* renamed from: b */
    private static String m177488b(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* renamed from: a */
    public static String m177487a(int i) {
        if (i < 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        StringBuilder sb = new StringBuilder();
        if (i6 > 0) {
            sb.append(m177488b(i6));
            sb.append(":");
        }
        sb.append(m177488b(i5));
        sb.append(":");
        sb.append(m177488b(i3));
        return sb.toString();
    }
}
