package com.ss.ttm.utils;

import android.util.Log;

public class AVLogger {
    public static int LogTurnOn = 112;

    public static final void turnOn(int i, int i2) {
        int i3 = (~(1 << i)) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }

    /* renamed from: d */
    public static final void m256494d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            Log.d("ttmj", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: e */
    public static void m256495e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            Log.e("ttmj", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: i */
    public static final void m256496i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            Log.i("ttmj", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: k */
    public static final void m256497k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            Log.i("ttmj", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: t */
    public static final void m256498t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            Log.i("ttmj", String.format("<%s>%s", str, str2));
        }
    }

    /* renamed from: w */
    public static final void m256499w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            Log.w("ttmj", String.format("<%s>%s", str, str2));
        }
    }
}
