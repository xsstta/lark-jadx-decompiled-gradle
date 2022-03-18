package com.bytedance.ee.bear.jsbridge;

/* renamed from: com.bytedance.ee.bear.jsbridge.e */
public class C7946e {
    /* renamed from: a */
    public static String m31759a(String str) {
        if (str.startsWith("bear://return/_fetchQueue")) {
            String replace = str.replace("bear://return/_fetchQueue", "");
            return replace.substring(replace.indexOf(47) + 1, replace.length());
        }
        String[] split = str.replace("bear://return/", "").split("/");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i]);
        }
        return sb.toString();
    }
}
