package com.ss.android.floatbubble;

import android.content.Context;

/* renamed from: com.ss.android.floatbubble.a */
public class C28459a {

    /* renamed from: a */
    private static float f71593a;

    /* renamed from: b */
    private static boolean f71594b;

    /* renamed from: a */
    private static void m104292a(Context context) {
        f71593a = ((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f;
        f71594b = true;
    }

    /* renamed from: a */
    public static int m104291a(Context context, int i) {
        if (!f71594b) {
            m104292a(context);
        }
        return Math.round(((float) i) / f71593a);
    }

    /* renamed from: b */
    public static int m104293b(Context context, int i) {
        if (!f71594b) {
            m104292a(context);
        }
        return Math.round(((float) i) * f71593a);
    }
}
