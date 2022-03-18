package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.lark.calendar.impl.utils.v */
public class C32671v {
    /* renamed from: a */
    public static void m125365a(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 2);
    }

    /* renamed from: b */
    public static void m125366b(Context context, View view) {
        if (view != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
