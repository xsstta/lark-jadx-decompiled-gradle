package com.larksuite.framework.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.log.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

public class aq {

    /* renamed from: a */
    private static Pattern f64859a = Pattern.compile("^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)([\\w.]+\\/?)\\S*");

    /* renamed from: a */
    public static String m95057a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getScheme();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public static String m95059b(String str) {
        try {
            URL url = new URL(str);
            String host = url.getHost();
            Log.m165379d("UrlUtil", "url:" + url + "host:" + host);
            return host;
        } catch (MalformedURLException e) {
            Log.m165384e("UrlUtil", e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m95060c(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        if (parse.getScheme().equals("http") || parse.getScheme().equals("https")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m95058a(String str, String str2) {
        String str3;
        try {
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
        } catch (Exception unused) {
            return str;
        }
    }
}
