package com.by.inflate_lib;

import android.content.Context;
import android.util.Log;

/* renamed from: com.by.inflate_lib.d */
public class C2608d {

    /* renamed from: a */
    public static boolean f8298a;

    /* renamed from: b */
    private static boolean f8299b;

    /* renamed from: a */
    public static void m10969a(Context context) {
        if (!f8299b) {
            f8298a = m10971b(context);
            f8299b = true;
        }
    }

    /* renamed from: b */
    private static boolean m10971b(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m10970a(String str) {
        if (f8298a) {
            Log.w("AndInflater_warning:", str);
        }
    }
}
