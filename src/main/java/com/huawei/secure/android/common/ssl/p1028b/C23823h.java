package com.huawei.secure.android.common.ssl.p1028b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: com.huawei.secure.android.common.ssl.b.h */
public class C23823h {

    /* renamed from: a */
    private static SharedPreferences f59001a;

    /* renamed from: a */
    public static synchronized SharedPreferences m87081a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (C23823h.class) {
            if (f59001a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    f59001a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                } else {
                    f59001a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                }
            }
            sharedPreferences = f59001a;
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    public static void m87082a(String str, long j, Context context) {
        m87081a(context).edit().putLong(str, j).apply();
    }

    /* renamed from: b */
    public static long m87083b(String str, long j, Context context) {
        return m87081a(context).getLong(str, j);
    }
}
