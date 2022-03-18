package com.ss.android.lark.mediapicker.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* renamed from: com.ss.android.lark.mediapicker.utils.a */
public class C44742a {
    /* renamed from: a */
    public static boolean m177479a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return m177478a((Activity) context);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m177480b(Activity activity) {
        if (activity == null) {
            return false;
        }
        return m177482c(activity);
    }

    /* renamed from: a */
    public static boolean m177478a(Activity activity) {
        boolean z;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            z = false;
        } else {
            z = true;
        }
        if (z || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m177481b(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            return m177482c((Activity) context);
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m177482c(Activity activity) {
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }
}
