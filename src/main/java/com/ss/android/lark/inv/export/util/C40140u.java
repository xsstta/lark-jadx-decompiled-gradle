package com.ss.android.lark.inv.export.util;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.inv.export.util.u */
public class C40140u {
    /* renamed from: a */
    public static boolean m159138a(CharSequence charSequence) {
        return m159139a("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", charSequence);
    }

    /* renamed from: b */
    public static boolean m159140b(CharSequence charSequence) {
        return m159139a("^\\d{1,14}$", charSequence);
    }

    /* renamed from: c */
    public static boolean m159142c(CharSequence charSequence) {
        return m159139a("^[1]\\d{10}$", charSequence);
    }

    /* renamed from: b */
    public static boolean m159141b(String str) {
        if (Pattern.compile("[A-Za-z]").matcher(str).find()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m159137a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m159139a(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || !Pattern.matches(str, charSequence)) {
            return false;
        }
        return true;
    }
}
