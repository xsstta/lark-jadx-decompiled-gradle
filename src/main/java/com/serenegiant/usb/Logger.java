package com.serenegiant.usb;

import android.util.Log;

final class Logger {
    Logger() {
    }

    /* renamed from: d */
    public static int m98782d(String str, String str2) {
        return Log.d("UVC_SDK", str + ":" + str2);
    }

    /* renamed from: e */
    public static int m98783e(String str, String str2) {
        return Log.e("UVC_SDK", str + ":" + str2);
    }

    /* renamed from: i */
    public static int m98784i(String str, String str2) {
        return Log.i("UVC_SDK", str + ":" + str2);
    }
}
