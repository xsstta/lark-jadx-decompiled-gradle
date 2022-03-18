package com.ss.android.bytedcert.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.graphics.C0768a;
import com.ss.android.bytedcert.manager.C28396a;

/* renamed from: com.ss.android.bytedcert.utils.g */
public class C28441g {
    /* renamed from: a */
    public static int m104235a(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static void m104236a(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(1284);
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
    }

    /* renamed from: b */
    public static float m104239b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (C28396a.m104125a().mo101170b()) {
            return ((float) i) * 0.375f;
        }
        return (((float) i) * 0.75910366f) / 2.0f;
    }

    /* renamed from: a */
    public static float m104234a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static void m104237a(Activity activity, int i) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
        if (C0768a.m3704a(i) < 0.5d) {
            if (Build.VERSION.SDK_INT >= 26) {
                window.getDecorView().setSystemUiVisibility(16);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(8192);
        }
    }

    /* renamed from: b */
    public static void m104240b(Activity activity, int i) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(i);
        }
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if (C0768a.m3704a(i) < 0.5d) {
            if (Build.VERSION.SDK_INT >= 26) {
                systemUiVisibility &= -17;
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            systemUiVisibility |= 16;
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* renamed from: a */
    public static void m104238a(String str, Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            Window window = ((Activity) context).getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(Color.parseColor(str));
            window.getDecorView().setSystemUiVisibility(8192);
        }
    }
}
