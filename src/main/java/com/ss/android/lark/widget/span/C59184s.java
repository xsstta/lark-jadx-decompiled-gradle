package com.ss.android.lark.widget.span;

/* renamed from: com.ss.android.lark.widget.span.s */
class C59184s {

    /* renamed from: a */
    public static final String f146895a;

    /* renamed from: b */
    private static final String f146896b;

    /* renamed from: c */
    private static final String f146897c;

    /* renamed from: d */
    private static final String f146898d;

    /* renamed from: e */
    private static final String f146899e;

    static {
        String str = "[" + "[A-Za-z0-9\\-\\._~:\\/\\?#\\[\\\\\\]@\\!\\$&'\\(\\)\\*\\+,;=%]".substring(1, 47).replace("\\[", "").replace("\\]", "").replace("\\(", "").replace("\\)", "").replace(",", "").replace("\\.", "") + "]";
        f146896b = str;
        String str2 = "[" + "[A-Za-z0-9\\-\\._~:\\/\\?#\\[\\\\\\]@\\!\\$&'\\(\\)\\*\\+,;=%]".substring(1, 47).replace("\\[", "").replace("\\]", "").replace("\\(", "").replace("\\)", "").replace(",", "") + "]";
        f146897c = str2;
        String str3 = "(http|https|ftp|lark)://" + str2 + "+" + str + "(?!" + str + ")";
        f146898d = str3;
        String str4 = "(?!.*(http|https|ftp|lark)://)[A-Za-z0-9\\-\\._~:\\/\\?#\\[\\\\\\]@\\!\\$&'\\(\\)\\*\\+,;=%]{2,}\\.(" + C59180p.m229867a() + ")(:[0-9]+)?(/" + "[A-Za-z0-9\\-\\._~:\\/\\?#\\[\\\\\\]@\\!\\$&'\\(\\)\\*\\+,;=%]" + "*" + str + "|/)?(?!" + str + ")";
        f146899e = str4;
        f146895a = "(?i)(" + str3 + "|" + str4 + ")";
    }
}
