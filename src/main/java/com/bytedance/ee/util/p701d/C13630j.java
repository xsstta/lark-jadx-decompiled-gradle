package com.bytedance.ee.util.p701d;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.d.j */
public class C13630j {

    /* renamed from: a */
    private static Vibrator f35793a;

    /* renamed from: a */
    public static void m55310a(Context context, int i, int i2) {
        if (i2 < 1 && i2 != -1) {
            i2 = 1;
        }
        if (i2 > 255) {
            i2 = 255;
        }
        if (i <= 0) {
            C13479a.m54775e("VibratorUtil", "vibrator: milliseconds must be positive");
            return;
        }
        if (f35793a == null && context != null) {
            f35793a = (Vibrator) context.getSystemService("vibrator");
        }
        Vibrator vibrator = f35793a;
        if (vibrator == null || !vibrator.hasVibrator()) {
            C13479a.m54758a("VibratorUtil", "vibrator is unavailable");
            return;
        }
        f35793a.cancel();
        if (Build.VERSION.SDK_INT >= 26) {
            f35793a.vibrate(VibrationEffect.createOneShot((long) i, i2));
        } else {
            f35793a.vibrate((long) i);
        }
    }
}
