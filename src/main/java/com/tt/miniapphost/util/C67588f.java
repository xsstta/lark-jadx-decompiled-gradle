package com.tt.miniapphost.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.miniapphost.util.f */
public class C67588f {
    /* renamed from: a */
    public static int m263060a(Context context) {
        Activity activity = (Activity) context;
        try {
            if (Build.VERSION.SDK_INT < 28 || activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() == null) {
                return 0;
            }
            return m263061b(context);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static int m263061b(Context context) {
        int i;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i = -1;
        }
        AppBrandLogger.m52828d("MobileSpecial", "getStatusBarHeight=" + i);
        return i;
    }
}
