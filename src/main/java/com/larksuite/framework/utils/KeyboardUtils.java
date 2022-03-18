package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class KeyboardUtils {
    private static volatile int KEYBOARD_HEIGHT;

    public static void setKeyboardHeight(int i) {
        if (KEYBOARD_HEIGHT != i) {
            KEYBOARD_HEIGHT = i;
        }
    }

    public static int getKeyboardHeight(Context context) {
        if (KEYBOARD_HEIGHT != 0) {
            return KEYBOARD_HEIGHT;
        }
        int i = 708;
        if (context != null) {
            i = UIUtils.dp2px(context, 236.0f);
        }
        if (i >= KEYBOARD_HEIGHT) {
            return i;
        }
        return KEYBOARD_HEIGHT;
    }

    public static void showKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    public static int getSoftButtonsBarHeight(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    public static void hideKeyboard(Context context) {
        Activity activityFromContext;
        InputMethodManager inputMethodManager;
        if (UIUtils.getActivityFromContext(context) != null && (activityFromContext = UIUtils.getActivityFromContext(context)) != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && inputMethodManager.isActive() && activityFromContext.getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(activityFromContext.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public static boolean isSoftShowing(Activity activity) {
        int height = activity.getWindow().getDecorView().getHeight();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if ((height - rect.bottom) - getSoftButtonsBarHeight(activity) != 0) {
            return true;
        }
        return false;
    }

    public static void showKeyboard(Context context) {
        Activity activityFromContext;
        if (UIUtils.getActivityFromContext(context) != null && (activityFromContext = UIUtils.getActivityFromContext(context)) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activityFromContext.getSystemService("input_method");
            View currentFocus = activityFromContext.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activityFromContext);
            }
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInputFromInputMethod(currentFocus.getWindowToken(), 0);
                inputMethodManager.toggleSoftInput(0, 2);
            }
        }
    }

    public static void hideKeyboard(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
