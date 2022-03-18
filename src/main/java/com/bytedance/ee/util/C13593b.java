package com.bytedance.ee.util;

/* renamed from: com.bytedance.ee.util.b */
public class C13593b {
    /* renamed from: b */
    private static String m55173b(String str) {
        char[] charArray = str.toCharArray();
        charArray[0] = (char) (charArray[0] - ' ');
        return String.valueOf(charArray);
    }

    /* renamed from: a */
    public static String m55172a(String str) {
        String[] split = str.split("_");
        if (split.length == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]);
        for (int i = 1; i < split.length; i++) {
            sb.append(m55173b(split[i]));
        }
        return sb.toString();
    }
}
