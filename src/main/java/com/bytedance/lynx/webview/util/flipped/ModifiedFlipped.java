package com.bytedance.lynx.webview.util.flipped;

import android.util.Log;
import com.C1711a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ModifiedFlipped {
    private static native Field getDeclaredField(Object obj, String str);

    private static native Method getDeclaredMethod(Object obj, String str, Class<?>[] clsArr);

    static {
        C1711a.m7628a("TTWebViewSdkFlipped");
    }

    /* renamed from: a */
    public static Field m73158a(String str, String str2) {
        Field field = null;
        try {
            field = getDeclaredField(Class.forName(str), str2);
            field.setAccessible(true);
            Log.i("ModifiedFlipped", "invokeHiddenApi success.");
            return field;
        } catch (Exception e) {
            Log.e("ModifiedFlipped", "invokeHiddenApi fail: ", e);
            return field;
        }
    }
}
