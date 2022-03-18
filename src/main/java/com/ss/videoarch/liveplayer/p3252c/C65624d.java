package com.ss.videoarch.liveplayer.p3252c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.videoarch.liveplayer.c.d */
public class C65624d {
    /* renamed from: a */
    public static NetworkInfo m257253a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
