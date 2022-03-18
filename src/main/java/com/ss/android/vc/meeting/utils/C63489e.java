package com.ss.android.vc.meeting.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.meeting.utils.e */
public class C63489e {
    /* renamed from: a */
    public static void m248808a(Context context) {
        if (!(context instanceof Activity)) {
            C60700b.m235846a("KeyBoardUtils", "hideKeyboard context not activity", new IllegalArgumentException());
        } else {
            m248809a(((Activity) context).getWindow().getDecorView());
        }
    }

    /* renamed from: a */
    public static void m248809a(View view) {
        if (view == null) {
            C60700b.m235846a("KeyBoardUtils", "hideKeyboard view null", new IllegalArgumentException());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
