package com.bytedance.ee.util.p716r;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.r.d */
public class C13722d {
    /* renamed from: a */
    public static int m55651a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54758a("VersionUtils", "version name illegal");
            return 0;
        }
        String str3 = str.split("-")[0];
        String str4 = str2.split("-")[0];
        String[] split = str3.split("\\.");
        String[] split2 = str4.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i == 0) {
                i = split[i2].compareTo(split2[i2]);
            }
            if (i != 0) {
                break;
            }
        }
        if (i == 0) {
            return split.length - split2.length;
        }
        return i;
    }
}
