package com.huawei.hms.hatool;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

public class p0 {
    /* renamed from: a */
    public static boolean m85877a(Context context) {
        return System.currentTimeMillis() - g0.m85718a(context, "Privacy_MY", "flashKeyTime", -1) > 43200000;
    }

    /* renamed from: a */
    public static boolean m85878a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return false;
            }
            C23625y.m85982f("hmsSdk", "not have read phone permission!");
            return true;
        } else if (context.checkSelfPermission(str) == 0) {
            return false;
        } else {
            C23625y.m85982f("hmsSdk", "not have read phone permission!");
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m85879a(Context context, String str, int i) {
        String str2 = g0.m85725c(context, str) + ".xml";
        long length = new File(context.getFilesDir(), "../shared_prefs/" + str2).length();
        if (length <= ((long) i)) {
            return false;
        }
        C23625y.m85977c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    /* renamed from: a */
    public static boolean m85880a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            C23625y.m85982f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
