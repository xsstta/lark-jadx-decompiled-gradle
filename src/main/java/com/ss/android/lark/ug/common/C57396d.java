package com.ss.android.lark.ug.common;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.ug.common.d */
public class C57396d {

    /* renamed from: a */
    private static int f141340a;

    /* renamed from: b */
    private static long f141341b;

    /* renamed from: a */
    private static int m222523a() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m222527b(Activity activity) {
        if (m222524a(activity.getWindow()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m222525a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - f141341b;
        if (m222527b(activity) && j > 500) {
            m222526a((Context) activity);
        }
        f141341b = currentTimeMillis;
    }

    /* renamed from: a */
    private static int m222524a(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.m165379d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > m222523a()) {
            return abs - f141340a;
        }
        f141340a = abs;
        return 0;
    }

    /* renamed from: a */
    public static void m222526a(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }
}
