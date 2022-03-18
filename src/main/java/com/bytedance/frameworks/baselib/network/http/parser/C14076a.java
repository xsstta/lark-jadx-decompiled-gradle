package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.parser.a */
public class C14076a {
    /* renamed from: a */
    public static String m56992a(String str, String str2) {
        Matcher matcher = Pattern.compile(".*(((" + str2 + "=[^;]*)|(" + str2 + "=\"[\";]*))|(" + str2 + "=.*$)).*").matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
}
