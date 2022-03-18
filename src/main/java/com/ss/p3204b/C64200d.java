package com.ss.p3204b;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.ss.b.d */
public class C64200d {

    /* renamed from: a */
    private static int f162297a = 3;

    /* renamed from: b */
    private static int f162298b = 3;

    /* renamed from: c */
    private static int f162299c = 3;

    /* renamed from: a */
    public static boolean m252475a() {
        int i;
        int i2 = f162297a;
        if (i2 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) {
                i = 2;
            } else {
                i = 1;
            }
            f162297a = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m252476b() {
        int i;
        int i2 = f162298b;
        if (i2 == 3) {
            String str = Build.HARDWARE;
            if (TextUtils.isEmpty(str) || (!str.toLowerCase().contains("hi") && !str.toLowerCase().contains("kirin"))) {
                i = 2;
            } else {
                i = 1;
            }
            f162298b = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m252477c() {
        int i;
        int i2 = f162299c;
        if (i2 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) {
                i = 2;
            } else {
                i = 1;
            }
            f162299c = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
