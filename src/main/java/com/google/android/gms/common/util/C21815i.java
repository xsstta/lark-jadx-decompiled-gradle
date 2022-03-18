package com.google.android.gms.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.google.android.gms.common.util.i */
public final class C21815i {

    /* renamed from: a */
    private static final IntentFilter f53218a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f53219b;

    /* renamed from: c */
    private static float f53220c = Float.NaN;

    /* renamed from: a */
    public static int m79093a(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent a = m79094a(context.getApplicationContext(), null, f53218a);
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 2;
        }
        return i2 | i3;
    }

    /* renamed from: b */
    public static synchronized float m79095b(Context context) {
        synchronized (C21815i.class) {
            if (SystemClock.elapsedRealtime() - f53219b >= 60000 || Float.isNaN(f53220c)) {
                Intent a = m79094a(context.getApplicationContext(), null, f53218a);
                if (a != null) {
                    f53220c = ((float) a.getIntExtra("level", -1)) / ((float) a.getIntExtra("scale", -1));
                }
                f53219b = SystemClock.elapsedRealtime();
                return f53220c;
            }
            return f53220c;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m79094a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
