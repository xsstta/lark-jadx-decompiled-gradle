package com.bytedance.ee.bear.p522q.p523a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p718t.C13749l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ee.bear.q.a.d */
public class C10548d {
    /* renamed from: b */
    public static void m43703b(View view) {
        m43698a(view, (ResultReceiver) null);
    }

    /* renamed from: b */
    public static void m43702b(Context context) {
        if (!(context instanceof Activity)) {
            C13479a.m54759a("KeyBoardUtils", "showKeyboard context not activity", new IllegalArgumentException());
        } else {
            m43703b(((Activity) context).getCurrentFocus());
        }
    }

    /* renamed from: a */
    public static void m43696a(Context context) {
        if (!(context instanceof Activity)) {
            C13479a.m54759a("KeyBoardUtils", "hideKeyboard context not activity", new IllegalArgumentException());
        } else {
            m43697a(((Activity) context).getWindow().getDecorView());
        }
    }

    /* renamed from: c */
    public static boolean m43704c(View view) {
        if (view == null) {
            return false;
        }
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager == null) {
            return false;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if ((i - rect.bottom) - m43705d(view) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m43705d(View view) {
        if (view == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int a = m43695a(defaultDisplay, displayMetrics, i);
        if (a > i) {
            return a - i;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m43697a(View view) {
        if (view == null) {
            C13479a.m54759a("KeyBoardUtils", "hideKeyboard view null", new IllegalArgumentException());
            return;
        }
        C13479a.m54764b("KeyBoardUtils", "hideKeyboard ");
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            try {
                if (inputMethodManager.isActive()) {
                    C13479a.m54764b("KeyBoardUtils", "hideKeyboard  view.getWindowToken() =" + view.getWindowToken());
                    boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    C13479a.m54764b("KeyBoardUtils", "hideKeyboard hideSoftInputFromWindow result =" + hideSoftInputFromWindow);
                }
            } catch (Exception e) {
                C13606d.m55245a("KeyBoardUtils", e);
            }
        }
    }

    /* renamed from: a */
    public static void m43699a(EditText editText) {
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(editText, false);
        } catch (Exception e) {
            C13479a.m54772d("KeyBoardUtils", "disableShowSoftInput fail, error: " + e.toString());
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method2.setAccessible(true);
                method2.invoke(editText, false);
            } catch (Exception e2) {
                C13479a.m54772d("KeyBoardUtils", "disableShowSoftInput fail, error: " + e2.toString());
            }
        }
    }

    /* renamed from: a */
    public static boolean m43701a(Activity activity) {
        if (activity != null) {
            return m43704c(activity.getWindow().getDecorView().getRootView());
        }
        return false;
    }

    /* renamed from: a */
    public static void m43698a(View view, ResultReceiver resultReceiver) {
        if (view == null) {
            C13479a.m54759a("KeyBoardUtils", "showKeyboard view null", new IllegalArgumentException());
            return;
        }
        C13479a.m54764b("KeyBoardUtils", "showKeyboard ");
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            C13749l.m55756c(view);
            inputMethodManager.showSoftInput(view, 1, resultReceiver);
        }
    }

    /* renamed from: a */
    public static void m43700a(PopupWindow popupWindow, int i) {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mWindowLayoutType");
            declaredField.setAccessible(true);
            declaredField.set(Integer.valueOf(i), popupWindow);
        } catch (Exception e) {
            C13479a.m54761a("KeyBoardUtils", e);
        }
    }

    /* renamed from: a */
    private static int m43695a(Display display, DisplayMetrics displayMetrics, int i) {
        try {
            display.getClass().getDeclaredMethod("getRealMetrics", displayMetrics.getClass()).invoke(display, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return i;
        }
    }
}
