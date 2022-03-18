package com.ss.android.videoshop.p3203i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.ss.android.videoshop.i.c */
public class C64174c {
    /* renamed from: a */
    public static Activity m252210a(Context context) {
        if (context == null) {
            return null;
        }
        if (Activity.class.isInstance(context)) {
            return (Activity) context;
        }
        if (ContextWrapper.class.isInstance(context)) {
            return m252210a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m252211a(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }
}
