package com.ss.android.lark.calendar.impl.utils;

import androidx.core.graphics.C0768a;

/* renamed from: com.ss.android.lark.calendar.impl.utils.j */
public class C32658j {
    /* renamed from: a */
    public static final int m125333a(int i, double d) {
        if (d >= 0.0d && d <= 1.0d) {
            return C0768a.m3716c(i, (int) (d * 255.0d));
        }
        throw new IllegalArgumentException();
    }
}
