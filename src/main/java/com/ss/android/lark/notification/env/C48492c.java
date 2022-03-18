package com.ss.android.lark.notification.env;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.env.c */
public class C48492c {
    /* renamed from: a */
    public static int m191191a(int i, int i2) {
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            if (i2 == 2) {
                return 2;
            }
            if (i2 == 3) {
                return 3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m191192a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return C57823a.m224448a(context).mo196178b(context);
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return false;
            }
            return notificationManager.areNotificationsEnabled();
        } catch (Exception e) {
            Log.m165383e("EnvUtil", "judge notification on failed " + e.getMessage());
            return false;
        }
    }
}
