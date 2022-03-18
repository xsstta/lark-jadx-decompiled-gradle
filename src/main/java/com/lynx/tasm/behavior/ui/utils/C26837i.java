package com.lynx.tasm.behavior.ui.utils;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: com.lynx.tasm.behavior.ui.utils.i */
public class C26837i {
    /* renamed from: a */
    public static void m97587a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
