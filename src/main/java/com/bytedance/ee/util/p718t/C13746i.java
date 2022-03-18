package com.bytedance.ee.util.p718t;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.t.i */
public class C13746i {

    /* renamed from: a */
    private static int f35939a = -1;

    /* renamed from: b */
    private static int f35940b = -1;

    /* renamed from: a */
    public static void m55723a(Window window) {
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024);
    }

    /* renamed from: a */
    public static int m55721a(Activity activity) {
        View findViewById;
        int i = 0;
        try {
            View decorView = activity.getWindow().getDecorView();
            if ((decorView instanceof ViewGroup) && (findViewById = decorView.findViewById(16908336)) != null && findViewById.getVisibility() == 0) {
                i = findViewById.getHeight();
            }
        } catch (Throwable th) {
            C13479a.m54761a("StatusAndNavigationBarUtils", th);
        }
        C13479a.m54772d("StatusAndNavigationBarUtils", "navigationBarHeight:" + i);
        return i;
    }

    /* renamed from: a */
    public static int m55722a(Context context) {
        int i = f35940b;
        if (i != -1) {
            return i;
        }
        Resources resources = context.getResources();
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            f35940b = resources.getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            C13479a.m54770c("StatusAndNavigationBarUtils", e);
        }
        if (f35940b <= 0) {
            C13479a.m54758a("StatusAndNavigationBarUtils", "get the abnormal height value of the status bar " + f35940b);
        }
        return f35940b;
    }
}
