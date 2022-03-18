package com.larksuite.component.openplatform.core.loader.jsbundle;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.b */
public class C24543b {
    /* renamed from: b */
    public static String m89518b(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: a */
    public static long m89514a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (long) m89513a(str.split("\\."));
        }
        return -1;
    }

    /* renamed from: a */
    public static int m89513a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return 0;
        }
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                i += (Integer.parseInt(strArr[i2]) * ((int) Math.pow(100.0d, (double) (length - 1)))) / ((int) Math.pow(100.0d, (double) i2));
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "JSBundleUtils", e.getStackTrace());
                return 0;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m89516a(long j) {
        try {
            String a = m89517a(j, 3);
            if (!TextUtils.isEmpty(a)) {
                AppBrandLogger.m52828d("JSBundleUtils", "localUpdateVersion ", a);
            }
            return a;
        } catch (Exception e) {
            AppBrandLogger.m52829e("JSBundleUtils", e);
            return "";
        }
    }

    /* renamed from: a */
    public static long m89515a(String str, String str2) {
        return m89514a(str2) - m89514a(str);
    }

    /* renamed from: a */
    public static String m89517a(long j, int i) {
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            double d = (double) i;
            sb.append(String.valueOf(j / ((long) ((int) Math.pow(100.0d, d)))));
            sb.append(".");
            j %= (long) ((int) Math.pow(100.0d, d));
            i--;
        }
        if (!TextUtils.isEmpty(sb) && sb.length() >= 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
