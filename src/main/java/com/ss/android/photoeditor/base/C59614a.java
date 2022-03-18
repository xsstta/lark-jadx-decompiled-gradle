package com.ss.android.photoeditor.base;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.photoeditor.base.a */
public class C59614a {
    /* renamed from: a */
    public static boolean m231217a(Context context, float f, float f2, float f3, float f4) {
        if (((double) ((float) Math.sqrt(Math.pow((double) (f3 - f), 2.0d) + Math.pow((double) (f4 - f2), 2.0d)))) > ((double) ((float) ViewConfiguration.get(context).getScaledTouchSlop())) * 1.5d) {
            return true;
        }
        return false;
    }
}
