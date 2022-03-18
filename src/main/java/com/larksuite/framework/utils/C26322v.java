package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: com.larksuite.framework.utils.v */
public class C26322v {
    /* renamed from: a */
    public static void m95320a(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                return;
            }
            if (RomUtils.m94933a()) {
                Class<?> cls = Class.forName("android.app.HwChangeButtonWindowCtrl");
                Field declaredField = cls.getDeclaredField("mInstanceMap");
                declaredField.setAccessible(true);
                Object obj = ((HashMap) declaredField.get(cls)).get(Integer.valueOf(activity.hashCode()));
                if (obj != null) {
                    C26254af.m95000a(obj, "destoryView", null, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m95321a(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i = 0; i < 3; i++) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (!(obj instanceof View)) {
                        continue;
                    } else if (((View) obj).getContext() == context) {
                        declaredField.set(inputMethodManager, null);
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
