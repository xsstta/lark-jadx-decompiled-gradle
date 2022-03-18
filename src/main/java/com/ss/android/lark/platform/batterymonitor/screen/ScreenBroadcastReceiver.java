package com.ss.android.lark.platform.batterymonitor.screen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.log.Log;
import me.ele.lancet.base.annotations.Skip;

public class ScreenBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static ScreenBroadcastReceiver f128666a;

    /* renamed from: b */
    public static void m200656b(Context context) {
        if (context == null) {
            Log.m165383e("BatteryMonitor", "failed to unRegister ScreenBroadcast, because context is null");
            return;
        }
        ScreenBroadcastReceiver screenBroadcastReceiver = f128666a;
        if (screenBroadcastReceiver != null) {
            context.unregisterReceiver(screenBroadcastReceiver);
            f128666a = null;
        }
    }

    /* renamed from: a */
    public static void m200655a(Context context) {
        if (context == null) {
            Log.m165383e("BatteryMonitor", "failed to register ScreenBroadcast, because context is null");
            return;
        }
        if (f128666a == null) {
            f128666a = new ScreenBroadcastReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        m200654a(context, f128666a, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            Log.m165389i("BatteryMonitor", "ScreenBroadcast onReceive called. action:ACTION_SCREEN_OFF.");
            C51756a.m200658g().mo177875a(1);
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            Log.m165389i("BatteryMonitor", "ScreenBroadcast onReceive called. action:ACTION_SCREEN_ON.");
            C51756a.m200658g().mo177875a(0);
        } else {
            Log.m165389i("BatteryMonitor", "ScreenBroadcast onReceive called. But not screen on or off.");
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m200654a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
