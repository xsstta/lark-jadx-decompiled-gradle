package com.ss.android.lark.widget.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;

/* renamed from: com.ss.android.lark.widget.util.b */
public class C59255b {

    /* renamed from: a */
    private static int f147159a;

    /* renamed from: b */
    private static long f147160b;

    /* renamed from: a */
    public static void m230155a() {
        InputMethodManager inputMethodManager = (InputMethodManager) aj.m224263a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }

    /* renamed from: b */
    private static int m230158b() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m230157a(Activity activity) {
        if (m230154a(activity.getWindow()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m230156a(Context context) {
        Activity a = ViewUtils.m224141a(context);
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - f147160b;
            if (m230157a(a) && j > 500) {
                m230155a();
            }
            f147160b = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public static int m230154a(Window window) {
        View decorView = window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.m165379d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > m230158b()) {
            return abs - f147159a;
        }
        f147159a = abs;
        return 0;
    }
}
