package com.ss.android.lark.widget.photo_picker.animation;

import android.content.Context;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.c */
public class C58595c {
    /* renamed from: a */
    public static Object m227250a(Context context, String str) {
        try {
            return Class.forName(context.getPackageName() + ".BuildConfig").getField(str).get(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
