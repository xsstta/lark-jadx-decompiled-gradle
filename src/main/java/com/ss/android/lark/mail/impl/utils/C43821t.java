package com.ss.android.lark.mail.impl.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;

/* renamed from: com.ss.android.lark.mail.impl.utils.t */
public class C43821t {
    /* renamed from: a */
    public static void m173694a(View view) {
        m173695a(view, 0);
    }

    /* renamed from: a */
    public static void m173695a(final View view, long j) {
        Log.m165389i("SystemServiceUtil", "hideKeyboard");
        if (view == null) {
            Log.m165383e("SystemServiceUtil", "hideKeyboard no view");
            return;
        }
        if (j < 0) {
            j = 0;
        }
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.C43821t.RunnableC438221 */

            public void run() {
                Context context = view.getContext();
                if (context == null) {
                    context = C41816b.m166115a().mo150132b();
                }
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }, j);
    }
}
