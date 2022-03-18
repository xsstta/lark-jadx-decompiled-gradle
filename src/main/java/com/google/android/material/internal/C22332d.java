package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.google.android.material.internal.d */
public class C22332d {
    /* renamed from: a */
    public static boolean m80914a() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: b */
    public static boolean m80915b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m80916c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }

    /* renamed from: d */
    public static boolean m80917d() {
        if (m80915b() || m80916c()) {
            return true;
        }
        return false;
    }
}
