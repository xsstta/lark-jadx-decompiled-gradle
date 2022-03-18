package com.bytedance.apm.util;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.bytedance.common.utility.reflect.Reflect;

/* renamed from: com.bytedance.apm.util.g */
public class C3120g {
    /* renamed from: a */
    public static String m12995a(PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT > 23 || pendingIntent == null) {
            return "";
        }
        return ((Intent) Reflect.on(pendingIntent).call("getIntent").get()).toString();
    }
}
