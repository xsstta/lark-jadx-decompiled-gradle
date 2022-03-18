package com.larksuite.component.ui.p1153e;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;

/* renamed from: com.larksuite.component.ui.e.b */
public class C25653b {
    /* renamed from: a */
    public static float m91892a(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m91896b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m91897c(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m91893a(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static String m91895a(Context context, int i) {
        return context.getResources().getString(i);
    }

    /* renamed from: a */
    public static int m91894a(Context context, int i, float f) {
        return m91893a(context.getResources().getColor(i), f);
    }
}
