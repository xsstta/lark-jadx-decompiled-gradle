package com.ss.android.lark.widget.span;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.widget.span.g */
public class C59157g {

    /* renamed from: a */
    public static final Pattern f146838a = Pattern.compile("<mention.*?[^>]tag_id=\\\"([\\s\\S]*?)\">([\\s\\S]*?)</mention>");

    /* renamed from: a */
    public static String m229818a(String str, String str2) {
        return "<mention tag_id=\"" + str + "\">#" + str2 + "</mention>";
    }
}
