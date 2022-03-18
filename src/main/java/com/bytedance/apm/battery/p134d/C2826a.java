package com.bytedance.apm.battery.p134d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.apm.battery.d.a */
public class C2826a {
    /* renamed from: a */
    public static boolean m11956a(Context context) {
        int intExtra;
        Intent a = m11955a(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (a == null || (intExtra = a.getIntExtra(UpdateKey.STATUS, -1)) == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m11955a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
