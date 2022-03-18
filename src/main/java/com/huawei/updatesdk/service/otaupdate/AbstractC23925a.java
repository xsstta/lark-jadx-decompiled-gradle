package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.huawei.updatesdk.service.otaupdate.a */
public abstract class AbstractC23925a {
    /* renamed from: a */
    public static void m87468a(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C23834a.m87118b("ActivityUtil", "unregisterReceiver error:" + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m87469a(Context context, IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        if (intentFilter != null && broadcastReceiver != null && !m87470a(context)) {
            try {
                INVOKEVIRTUAL_com_huawei_updatesdk_service_otaupdate_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, broadcastReceiver, intentFilter);
            } catch (IllegalArgumentException e) {
                C23834a.m87118b("ActivityUtil", "registerReceiver error:" + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static boolean m87470a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
            return false;
        }
        C23834a.m87118b("ActivityUtil", "activity has bean finished, cannot instance:" + activity);
        return true;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_huawei_updatesdk_service_otaupdate_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
