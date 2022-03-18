package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.util.c */
public final class C21806c {

    /* renamed from: a */
    private static final String[] f53202a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static int f53203b = -1;

    /* renamed from: a */
    public static boolean m79081a(Context context, Throwable th) {
        return m79082a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m79082a(Context context, Throwable th, int i) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
