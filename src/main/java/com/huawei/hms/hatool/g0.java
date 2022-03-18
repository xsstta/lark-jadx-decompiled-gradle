package com.huawei.hms.hatool;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

public class g0 {
    /* renamed from: a */
    public static long m85718a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23625y.m85982f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences b = m85722b(context, str);
        return b != null ? b.getLong(str2, j) : j;
    }

    /* renamed from: a */
    public static String m85719a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23625y.m85982f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b = m85722b(context, str);
        return b != null ? b.getString(str2, str3) : str3;
    }

    /* renamed from: a */
    public static Map<String, ?> m85720a(Context context, String str) {
        return m85722b(context, str).getAll();
    }

    /* renamed from: a */
    public static void m85721a(Context context, String str, String... strArr) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "clearData(): parameter error.context,spname";
        } else if (strArr == null) {
            str2 = "clearData(): No data need to be deleted,keys is null";
        } else {
            SharedPreferences b = m85722b(context, str);
            if (b != null) {
                SharedPreferences.Editor edit = b.edit();
                if (strArr.length == 0) {
                    edit.clear();
                    edit.commit();
                    return;
                }
                for (String str3 : strArr) {
                    if (b.contains(str3)) {
                        edit.remove(str3);
                        edit.commit();
                    }
                }
                return;
            }
            return;
        }
        C23625y.m85982f("hmsSdk", str2);
    }

    /* renamed from: b */
    public static SharedPreferences m85722b(Context context, String str) {
        return context.getSharedPreferences(m85725c(context, str), 0);
    }

    /* renamed from: b */
    public static void m85723b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23625y.m85982f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = m85722b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    /* renamed from: b */
    public static void m85724b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23625y.m85981e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = m85722b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    /* renamed from: c */
    public static String m85725c(Context context, String str) {
        String packageName = context.getPackageName();
        String n = AbstractC23598c.m85644n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + n;
    }
}
