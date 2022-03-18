package com.tt.miniapp.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.util.m */
public class C67047m {
    /* renamed from: a */
    public static void m261304a(Activity activity) {
        AppBrandLogger.m52828d("tma_InputMethodUtil", "hideSoftKeyboard");
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplication().getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: a */
    public static void m261305a(final View view, final Context context) {
        AppBrandLogger.m52828d("tma_InputMethodUtil", "showSoftKeyboard");
        if (view.requestFocus()) {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.util.C67047m.RunnableC670481 */

                public void run() {
                    ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m261306a(EditText editText, Context context) {
        AppBrandLogger.m52828d("tma_InputMethodUtil", "hideSoftKeyboard1");
        if (editText != null) {
            AppBrandLogger.m52828d("tma_InputMethodUtil", "hideSoftKeyboard1 mEditText != null");
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }
}
