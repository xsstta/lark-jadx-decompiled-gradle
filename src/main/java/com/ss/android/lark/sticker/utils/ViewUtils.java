package com.ss.android.lark.sticker.utils;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewUtils {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    /* renamed from: a */
    public static void m214260a(int i, View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(i);
        }
    }
}
