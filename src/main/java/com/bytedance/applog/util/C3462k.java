package com.bytedance.applog.util;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.bytedance.applog.util.k */
public class C3462k {
    /* renamed from: a */
    public static String m14622a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
