package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a;

import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a.c */
public class C14035c {

    /* renamed from: a */
    private static Pattern f36777a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: b */
    private static final Pattern f36778b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f36779c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m56816a(String str) {
        return f36778b.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m56817b(String str) {
        return f36779c.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m56818c(String str) {
        if (m56816a(str) || m56817b(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m56819d(String str) {
        if (str != null) {
            try {
                if (str.length() < 7 || str.length() > 15 || str.equals("") || !f36777a.matcher(str).matches()) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                try {
                    int indexOf = str.indexOf(46);
                    if (!(indexOf == -1 || str.charAt(0) == '-')) {
                        if (Integer.parseInt(str.substring(0, indexOf)) <= 255) {
                            int i = indexOf + 1;
                            int indexOf2 = str.indexOf(46, i);
                            if (!(indexOf2 == -1 || str.charAt(i) == '-')) {
                                if (Integer.parseInt(str.substring(i, indexOf2)) <= 255) {
                                    int i2 = indexOf2 + 1;
                                    int indexOf3 = str.indexOf(46, i2);
                                    if (!(indexOf3 == -1 || str.charAt(i2) == '-' || Integer.parseInt(str.substring(i2, indexOf3)) > 255)) {
                                        int i3 = indexOf3 + 1;
                                        if (str.charAt(i3) == '-' || Integer.parseInt(str.substring(i3, str.length())) > 255 || str.charAt(str.length() - 1) == '.') {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                return false;
            }
        }
        return false;
    }
}
