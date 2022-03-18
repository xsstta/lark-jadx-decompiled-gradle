package com.ss.android.lark.magic.p2156e;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.magic.e.a */
public class C41717a {

    /* renamed from: a */
    private static int f105959a;

    /* renamed from: a */
    private static int m165625a() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m165627a(Activity activity) {
        if (m165626a(activity.getWindow()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m165626a(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.m165379d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > m165625a()) {
            return abs - f105959a;
        }
        f105959a = abs;
        return 0;
    }
}
