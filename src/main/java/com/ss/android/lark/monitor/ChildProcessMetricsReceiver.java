package com.ss.android.lark.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.log.Log;
import me.ele.lancet.base.annotations.Skip;

public class ChildProcessMetricsReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static void m190221a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo == null) {
                return;
            }
            if (packageInfo.permissions != null) {
                for (int i = 0; i < packageInfo.permissions.length; i++) {
                    if (packageInfo.permissions[i] != null) {
                        String str = packageInfo.permissions[i].name;
                        if (str.contains("broadcast.metrics")) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.ss.android.lark.metrics.doMetrics");
                            m190220a(context, new ChildProcessMetricsReceiver(), intentFilter, str, null);
                            return;
                        }
                    }
                }
                Log.m165383e("LarkMetrics", "register metrics receiver failed");
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        LarkMetrics a = LarkMetrics.m190223a();
        if ("com.ss.android.lark.metrics.doMetrics".equals(action)) {
            a.mo168671a(intent.getStringExtra("activity_name"));
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m190220a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e;
        }
    }
}
