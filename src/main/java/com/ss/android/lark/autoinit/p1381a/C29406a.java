package com.ss.android.lark.autoinit.p1381a;

/* renamed from: com.ss.android.lark.autoinit.a.a */
public class C29406a {

    /* renamed from: a */
    private static final int f73514a = 19;

    /* renamed from: b */
    private static final int f73515b = 1;

    /* renamed from: a */
    public static String m108180a(String str) {
        int i;
        int indexOf;
        if (str == null || str.isEmpty() || !str.startsWith("com.ss.android.lark") || (indexOf = str.indexOf(".", (i = f73514a + f73515b))) <= i) {
            return null;
        }
        return str.substring(i, indexOf);
    }
}
