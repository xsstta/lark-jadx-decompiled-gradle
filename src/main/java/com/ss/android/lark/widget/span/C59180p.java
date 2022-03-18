package com.ss.android.lark.widget.span;

/* renamed from: com.ss.android.lark.widget.span.p */
public class C59180p {

    /* renamed from: a */
    public static String[] f146880a = {"com", "net", "org", "cn", "xin", "xyz", "ltd", "vip", "shop", "wang", "club", "top", "site", "cc", "group", "link", "red", "ink", "pro", "biz", "mobi", "info", "kim", "name", "tv", "work"};

    /* renamed from: a */
    public static String m229867a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < f146880a.length; i++) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(f146880a[i]);
        }
        return sb.toString();
    }
}
