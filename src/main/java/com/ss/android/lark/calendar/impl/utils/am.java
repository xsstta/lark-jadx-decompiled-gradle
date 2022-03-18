package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import android.os.Vibrator;
import com.ss.android.lark.log.Log;

public class am {
    /* renamed from: a */
    public static void m125208a(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(j);
            }
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
