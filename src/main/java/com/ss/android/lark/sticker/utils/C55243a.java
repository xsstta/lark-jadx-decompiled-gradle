package com.ss.android.lark.sticker.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.android.lark.sticker.utils.a */
public class C55243a {
    /* renamed from: a */
    public static boolean m214261a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
