package com.bytedance.ee.util.p716r;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.List;

/* renamed from: com.bytedance.ee.util.r.c */
public class C13721c {
    /* renamed from: d */
    public static String m55650d(String str) {
        if (str == null) {
            return "";
        }
        return C13598b.m55197d(str);
    }

    /* renamed from: c */
    public static String m55649c(String str) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) <= ' ') {
            length--;
        }
        if (length < str.length()) {
            return str.substring(0, length);
        }
        return str;
    }

    /* renamed from: b */
    public static String m55648b(String str) {
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() >= 22) {
                str = str.replace(lastPathSegment, "");
            }
            int indexOf = str.indexOf("?");
            if (indexOf >= 0) {
                return str.substring(0, indexOf);
            }
            return str;
        } catch (Throwable th) {
            C13479a.m54773d("StringUtils", "getUrl: ", th);
            return str;
        }
    }

    /* renamed from: a */
    public static String m55643a(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("?")) <= 0 || indexOf >= str.length()) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: a */
    public static int m55641a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            C13479a.m54761a("StringUtils", e);
            return i;
        }
    }

    /* renamed from: b */
    public static int m55647b(String str, String str2) {
        int i = ((m55642a(str, 0L) - m55642a(str2, 0L)) > 0 ? 1 : ((m55642a(str, 0L) - m55642a(str2, 0L)) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i > 0) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public static long m55642a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            C13479a.m54761a("StringUtils", e);
            return j;
        }
    }

    /* renamed from: a */
    public static String m55644a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (int i = 0; i < stackTrace.length; i++) {
                String stackTraceElement = stackTrace[i].toString();
                if (str != null && stackTraceElement.contains(str)) {
                    sb.append(stackTrace[i].toString());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m55645a(List<String> list, String str) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m55646a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return TextUtils.equals(str.toLowerCase(), str2.toLowerCase());
    }
}
