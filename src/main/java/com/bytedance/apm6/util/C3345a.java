package com.bytedance.apm6.util;

import android.app.Application;
import android.content.Context;

/* renamed from: com.bytedance.apm6.util.a */
public class C3345a {

    /* renamed from: a */
    private static boolean f10635a;

    /* renamed from: b */
    private static boolean f10636b;

    /* renamed from: c */
    private static Application f10637c;

    /* renamed from: v */
    public static boolean m13916v() {
        return f10636b;
    }

    /* renamed from: w */
    public static Application m13917w() {
        return f10637c;
    }

    /* renamed from: u */
    public static boolean m13915u() {
        if (!f10635a || f10636b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m13913a(boolean z) {
        f10635a = z;
    }

    /* renamed from: a */
    public static void m13912a(Context context) {
        if (context != null) {
            f10637c = m13914b(context);
        }
    }

    /* renamed from: b */
    private static Application m13914b(Context context) {
        if (context == null) {
            return null;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return (Application) context;
    }
}
