package com.bytedance.ee.util.p714p;

import java.text.DecimalFormat;

/* renamed from: com.bytedance.ee.util.p.a */
public class C13719a {
    /* renamed from: b */
    public static String m55622b(Long l) {
        return m55621a(l, "0", "B");
    }

    /* renamed from: c */
    public static String m55623c(Long l) {
        return m55621a(l, "0", "KB");
    }

    /* renamed from: a */
    public static String m55620a(Long l) {
        return m55621a(l, "0", "B") + "G";
    }

    /* renamed from: a */
    private static String m55621a(Long l, String str, String str2) {
        if (l == null || l.longValue() <= 0) {
            return str;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#");
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 66:
                if (str2.equals("B")) {
                    c = 0;
                    break;
                }
                break;
            case 2391:
                if (str2.equals("KB")) {
                    c = 1;
                    break;
                }
                break;
            case 2453:
                if (str2.equals("MB")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return decimalFormat.format(l.longValue() / 1073741824);
            case 1:
                return decimalFormat.format(l.longValue() / 1048576);
            case 2:
                return decimalFormat.format(l.longValue() / 1024);
            default:
                return decimalFormat.format(l);
        }
    }
}
