package com.ss.android.appcenter.common.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.appcenter.common.util.e */
public class C28181e {
    /* renamed from: a */
    public static void m103233a(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && view.getContext() != null && (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    public static void m103232a(Context context) {
        Activity activity = (Activity) context;
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager.isActive() && activity.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }
}
