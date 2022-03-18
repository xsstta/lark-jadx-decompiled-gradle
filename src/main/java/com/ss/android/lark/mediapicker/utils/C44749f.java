package com.ss.android.lark.mediapicker.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mediapicker.utils.f */
public class C44749f {

    /* renamed from: a */
    private static int f113353a = -1;

    /* renamed from: b */
    private static int f113354b = -1;

    /* renamed from: c */
    private static int f113355c = -1;

    /* renamed from: a */
    public static int m177489a(Context context) {
        if (f113353a <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f113353a = displayMetrics.widthPixels;
        }
        return f113353a;
    }

    /* renamed from: b */
    public static int m177490b(Context context) {
        if (f113354b <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f113354b = displayMetrics.heightPixels;
        }
        return f113354b;
    }

    /* renamed from: c */
    public static int m177491c(Context context) {
        int i = f113355c;
        if (i > 0) {
            return i;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        f113355c = dimensionPixelSize;
        if (dimensionPixelSize != -1) {
            return dimensionPixelSize;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            f113355c = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (f113355c <= 0) {
            Log.m165383e("DeviceUtils", " status height is exception： " + f113355c);
        }
        return f113355c;
    }
}
