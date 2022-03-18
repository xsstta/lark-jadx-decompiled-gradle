package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.calendar.impl.framework.C32484a;

/* renamed from: com.ss.android.lark.calendar.impl.utils.ae */
public class C32634ae {
    /* renamed from: b */
    public static Resources m125181b() {
        return m125179a().getResources();
    }

    /* renamed from: a */
    public static Context m125179a() {
        return new C32484a().mo118635a();
    }

    /* renamed from: a */
    public static int m125178a(int i) {
        return m125181b().getColor(i);
    }

    /* renamed from: c */
    public static String[] m125183c(int i) {
        return m125181b().getStringArray(i);
    }

    /* renamed from: d */
    public static Drawable m125184d(int i) {
        return m125181b().getDrawable(i);
    }

    /* renamed from: e */
    public static int m125185e(int i) {
        return m125181b().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public static String m125182b(int i) {
        return m125181b().getString(i);
    }

    /* renamed from: a */
    public static String m125180a(int i, int i2) {
        return m125181b().getQuantityString(i, i2, Integer.valueOf(i2));
    }
}
