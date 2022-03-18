package com.ss.ttvideoengine.log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.HashMap;
import me.ele.lancet.base.annotations.Skip;

public class BatteryMonitor {
    private final Context mContext;

    public HashMap<String, Object> getChargingState() {
        Intent INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver;
        int i;
        if (this.mContext == null || (INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this.mContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        int intExtra = INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra(UpdateKey.STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            i = 1;
        } else {
            i = 0;
        }
        int intExtra2 = INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("plugged", -1);
        int intExtra3 = (INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1) * 100) / INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
        HashMap<String, Object> hashMap = new HashMap<>(3);
        hashMap.put("isCharging", Integer.valueOf(i));
        hashMap.put("chargePlug", Integer.valueOf(intExtra2));
        hashMap.put("power", Integer.valueOf(intExtra3));
        return hashMap;
    }

    public BatteryMonitor(Context context) {
        this.mContext = context;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_ttvideoengine_log_BatteryMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
