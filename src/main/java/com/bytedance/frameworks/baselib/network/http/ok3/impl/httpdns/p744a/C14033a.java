package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a;

import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a.a */
public class C14033a {

    /* renamed from: a */
    private static final String f36775a = "a";

    /* renamed from: a */
    public static String m56813a(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m56814a(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            if (charArray.length > 0 && charArray.length <= 255) {
                for (char c : charArray) {
                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '.' || c == '-'))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
