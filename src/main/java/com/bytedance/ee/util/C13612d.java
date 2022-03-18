package com.bytedance.ee.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.d */
public class C13612d {
    /* renamed from: a */
    public static void m55253a(Context context) {
        if (!(context instanceof Activity)) {
            C13479a.m54759a("KeyBoardUtils", "hideKeyboard context not activity", new IllegalArgumentException());
        } else {
            m55254a(((Activity) context).getWindow().getDecorView());
        }
    }

    /* renamed from: a */
    public static void m55254a(View view) {
        if (view == null) {
            C13479a.m54759a("KeyBoardUtils", "hideKeyboard view null", new IllegalArgumentException());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
