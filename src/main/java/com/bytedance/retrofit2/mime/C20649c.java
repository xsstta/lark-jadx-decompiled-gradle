package com.bytedance.retrofit2.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.retrofit2.mime.c */
public final class C20649c {

    /* renamed from: a */
    private static final Pattern f50376a = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    /* renamed from: a */
    public static String m75080a(String str, String str2) {
        Matcher matcher = f50376a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("[\"\\\\]", "");
        }
        return str2;
    }
}
