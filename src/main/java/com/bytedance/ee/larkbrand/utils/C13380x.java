package com.bytedance.ee.larkbrand.utils;

import android.net.Uri;
import com.huawei.hms.framework.common.ContainerUtils;

/* renamed from: com.bytedance.ee.larkbrand.utils.x */
public final class C13380x {
    /* renamed from: b */
    public static String m54430b(String str, String str2) {
        String str3;
        if (Uri.parse(str).getQueryParameter(str2) == null) {
            return null;
        }
        int indexOf = str.indexOf("?");
        int i = indexOf + 1;
        int indexOf2 = str.indexOf("#", i);
        if (indexOf2 > indexOf) {
            str3 = str.substring(i, indexOf2);
        } else {
            str3 = str.substring(i);
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (z) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            int indexOf3 = str3.indexOf(38, i2);
            if (indexOf3 == -1) {
                indexOf3 = str3.length();
            }
            int indexOf4 = str3.indexOf(61, i2);
            if (indexOf4 > indexOf3 || indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            if (!str3.substring(i2, indexOf4).equals(str2)) {
                i2 = indexOf3 + 1;
                if (i2 >= str3.length()) {
                    return null;
                }
                z = true;
            } else if (indexOf4 <= 0 || indexOf4 >= indexOf3) {
                return "";
            } else {
                return str3.substring(indexOf4 + 1, indexOf3);
            }
        }
    }

    /* renamed from: a */
    public static String m54428a(String str, String str2) {
        String str3;
        if (Uri.parse(str).getQueryParameter(str2) == null) {
            return str;
        }
        int indexOf = str.indexOf("?");
        int i = indexOf + 1;
        int indexOf2 = str.indexOf("#", i);
        if (indexOf2 > indexOf) {
            str3 = str.substring(i, indexOf2);
        } else {
            str3 = str.substring(i);
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        do {
            int indexOf3 = str3.indexOf(38, i2);
            if (indexOf3 == -1) {
                indexOf3 = str3.length();
            }
            int indexOf4 = str3.indexOf(61, i2);
            if (indexOf4 > indexOf3 || indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            if (!str3.substring(i2, indexOf4).equals(str2)) {
                if (z) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(str3.substring(i2, indexOf3));
                z = true;
            }
            i2 = indexOf3 + 1;
        } while (i2 < str3.length());
        if (indexOf2 > indexOf) {
            return str.substring(0, i) + sb.toString() + str.substring(indexOf2);
        }
        return str.substring(0, i) + sb.toString();
    }

    /* renamed from: a */
    public static String m54429a(String str, String str2, String str3) {
        if (str.contains("?")) {
            String a = m54428a(str, str2);
            return a + ContainerUtils.FIELD_DELIMITER + str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3;
        }
        return str + "?" + str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3;
    }
}
