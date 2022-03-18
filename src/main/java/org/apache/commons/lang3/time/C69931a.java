package org.apache.commons.lang3.time;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: org.apache.commons.lang3.time.a */
public class C69931a {

    /* renamed from: a */
    private static final Pattern f174799a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* renamed from: b */
    private static final TimeZone f174800b = new C69934c(false, 0, 0);

    /* renamed from: b */
    private static int m268303b(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    /* renamed from: c */
    private static boolean m268304c(String str) {
        if (str == null || str.charAt(0) != '-') {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static TimeZone m268302a(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return f174800b;
        }
        Matcher matcher = f174799a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int b = m268303b(matcher.group(2));
        int b2 = m268303b(matcher.group(4));
        if (b == 0 && b2 == 0) {
            return f174800b;
        }
        return new C69934c(m268304c(matcher.group(1)), b, b2);
    }
}
