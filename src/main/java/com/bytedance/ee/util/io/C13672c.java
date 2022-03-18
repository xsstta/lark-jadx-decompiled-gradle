package com.bytedance.ee.util.io;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.util.io.c */
public class C13672c {

    /* renamed from: a */
    private static final String[] f35861a = {"tar.gz", "tar.bz2", "tar.lzma"};

    /* renamed from: a */
    public static String m55478a(long j) {
        if (j < 0) {
            return "";
        }
        String[] strArr = {"B", "K", "M", "G"};
        double d = (double) j;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (d < 1024.0d) {
                return (((double) Math.round(d * 100.0d)) / 100.0d) + " " + str;
            }
            d /= 1024.0d;
        }
        return (((double) Math.round(d * 100.0d)) / 100.0d) + " " + strArr[3];
    }

    /* renamed from: b */
    public static String m55481b(String str) {
        C13479a.m54772d("FilePropsUtil", "getExtension: name=" + str);
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf == -1) {
                return str2;
            }
            int length = f35861a.length;
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(".");
                String[] strArr = f35861a;
                sb.append(strArr[i]);
                if (str.endsWith(sb.toString())) {
                    return strArr[i];
                }
            }
            str2 = str.substring(lastIndexOf + 1);
            C13479a.m54775e("FilePropsUtil", "FilePropsUtil.java.getExtension: extension=" + str2);
            return str2;
        } catch (Exception e) {
            C13479a.m54761a("FilePropsUtil", e);
        }
    }

    /* renamed from: a */
    public static String m55480a(String str) {
        C13479a.m54772d("FilePropsUtil", "getFileNameWithoutExtension: fullName=" + str);
        if (TextUtils.isEmpty(str)) {
            C13479a.m54775e("FilePropsUtil", "FilePropsUtil.java.getFileNameWithoutExtension: fullName is empty");
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            C13479a.m54775e("FilePropsUtil", "FilePropsUtil.java.getFileNameWithoutExtension: DOT index is invalid");
            return str;
        } else if (lastIndexOf == 0) {
            C13479a.m54775e("FilePropsUtil", "FilePropsUtil.java.getFileNameWithoutExtension: DOT index is zero");
            return "";
        } else {
            String[] strArr = f35861a;
            int length = strArr.length;
            for (String str2 : strArr) {
                if (str.endsWith("." + str2)) {
                    lastIndexOf = str.length() - (str2.length() + 1);
                }
            }
            try {
                return str.substring(0, lastIndexOf);
            } catch (Exception e) {
                C13479a.m54759a("FilePropsUtil", "getFileNameWithoutExtension: ", e);
                return "";
            }
        }
    }

    /* renamed from: a */
    public static String m55479a(Context context, long j) {
        float f;
        if (j > 0) {
            f = (float) j;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        String str = "B";
        if (f < BitmapDescriptorFactory.HUE_RED || f >= 1024.0f) {
            if (f >= 1024.0f) {
                f /= 1024.0f;
                str = "KB";
            }
            if (f >= 1024.0f) {
                f /= 1024.0f;
                str = "MB";
            }
            if (f >= 1024.0f) {
                f /= 1024.0f;
                str = "GB";
            }
            if (f >= 1024.0f) {
                f /= 1024.0f;
                str = "TB";
            }
            if (f >= 1024.0f) {
                f /= 1024.0f;
                str = "PB";
            }
            return String.format("%.2f", Float.valueOf(f)) + str;
        }
        return Long.toString(j) + str;
    }
}
