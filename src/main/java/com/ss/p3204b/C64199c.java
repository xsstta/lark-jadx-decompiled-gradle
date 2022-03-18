package com.ss.p3204b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.b.c */
public class C64199c {

    /* renamed from: a */
    private static BatteryManager f162295a;

    /* renamed from: b */
    private static IntentFilter f162296b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c */
    public static long m252473c(Context context) {
        return m252474d(context).getLongProperty(4);
    }

    /* renamed from: a */
    public static float m252470a(Context context) {
        return ((float) m252471a(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("voltage", -1)) / 1000.0f;
    }

    /* renamed from: d */
    private static BatteryManager m252474d(Context context) {
        if (f162295a == null) {
            synchronized (C64199c.class) {
                if (f162295a == null) {
                    if (Build.VERSION.SDK_INT < 21) {
                        return null;
                    }
                    f162295a = (BatteryManager) context.getSystemService("batterymanager");
                }
            }
        }
        return f162295a;
    }

    /* renamed from: b */
    public static float m252472b(Context context) {
        float longProperty = (float) m252474d(context).getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (C64200d.m252476b() || C64200d.m252477c()) {
            if (longProperty < -10000.0f) {
                longProperty /= 1000.0f;
            }
            return -longProperty;
        } else if (!C64200d.m252475a()) {
            return longProperty / 1000.0f;
        } else {
            if (longProperty > 10000.0f) {
                return longProperty / 1000.0f;
            }
            return longProperty;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m252471a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
