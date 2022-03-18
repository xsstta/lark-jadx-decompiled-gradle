package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.ss.android.lark.chat.utils.aa */
public class C34331aa {
    /* renamed from: a */
    public static void m133108a(Context context, long j) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            vibrator.vibrate(j);
        }
    }
}
