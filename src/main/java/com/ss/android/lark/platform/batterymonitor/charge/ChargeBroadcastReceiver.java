package com.ss.android.lark.platform.batterymonitor.charge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.log.Log;
import me.ele.lancet.base.annotations.Skip;

public class ChargeBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static ChargeBroadcastReceiver f128630a;

    /* renamed from: b */
    public static void m200592b(Context context) {
        if (context == null) {
            Log.m165383e("BatteryMonitor", "failed to unRegister ChargeBroadcast, context is null");
            return;
        }
        ChargeBroadcastReceiver chargeBroadcastReceiver = f128630a;
        if (chargeBroadcastReceiver != null) {
            context.unregisterReceiver(chargeBroadcastReceiver);
            f128630a = null;
        }
    }

    /* renamed from: a */
    public static void m200591a(Context context) {
        if (context == null) {
            Log.m165383e("BatteryMonitor", "failed to register ChargeBroadcast, context is null");
            return;
        }
        if (f128630a == null) {
            f128630a = new ChargeBroadcastReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        m200590a(context, f128630a, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED")) {
            C51734a.m200593g().mo177845a(0);
            Log.m165389i("BatteryMonitor", "ChargeBroadcast onReceive called. Current charge is plug in.");
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            C51734a.m200593g().mo177845a(1);
            Log.m165389i("BatteryMonitor", "ChargeBroadcast onReceive called. action is ACTION_POWER_DISCONNECTED, Current charge is plug off.");
        } else {
            Log.m165389i("BatteryMonitor", "ChargeBroadcast onReceive called. But not plug in or plug off.");
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m200590a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
