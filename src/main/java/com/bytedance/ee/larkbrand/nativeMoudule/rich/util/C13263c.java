package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tt.miniapp.util.C67047m;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.c */
public class C13263c {
    /* renamed from: b */
    public static void m54033b(View view) {
        C67047m.m261305a(view, view.getContext());
    }

    /* renamed from: a */
    public static void m54032a(View view) {
        if (view != null && view.getContext() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (view != null && view.getWindowToken() != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
