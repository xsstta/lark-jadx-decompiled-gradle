package com.ss.android.vc.common.p3083e;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.vc.common.p3077b.C60700b;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.vc.common.e.e */
public class C60751e {

    /* renamed from: a */
    private static String f151942a = "InputMethodLeakUtil";

    /* renamed from: a */
    public static void m236074a(Context context) {
        InputMethodManager inputMethodManager;
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            m236075a(inputMethodManager, "mLastSrvView");
            m236075a(inputMethodManager, "mCurrentInputConnection");
        }
    }

    /* renamed from: a */
    private static void m236075a(InputMethodManager inputMethodManager, String str) {
        try {
            Field declaredField = inputMethodManager.getClass().getDeclaredField(str);
            if (declaredField != null) {
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (declaredField.get(inputMethodManager) != null) {
                    declaredField.set(inputMethodManager, null);
                }
            }
        } catch (Exception e) {
            C60700b.m235864f(f151942a, "[setFieldNull]", e.getMessage());
        }
    }
}
