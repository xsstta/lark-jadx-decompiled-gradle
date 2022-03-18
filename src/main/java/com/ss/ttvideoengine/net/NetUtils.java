package com.ss.ttvideoengine.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

public class NetUtils {
    public static long netUpdateTimeMs = -1;
    private static final BroadcastReceiver networkReceiver = new BroadcastReceiver() {
        /* class com.ss.ttvideoengine.net.NetUtils.C654721 */

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetUtils.netUpdateTimeMs = System.currentTimeMillis();
            }
        }
    };
    public static boolean registerNetworkReceiver;

    public static boolean isNetAvailable(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo != null && networkInfo.isAvailable()) {
                return networkInfo.getExtraInfo();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo != null && networkInfo.isAvailable()) {
                return networkInfo.getType();
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static void release(Context context) {
        try {
            BroadcastReceiver broadcastReceiver = networkReceiver;
            synchronized (broadcastReceiver) {
                if (registerNetworkReceiver && context != null) {
                    registerNetworkReceiver = false;
                    context.getApplicationContext().unregisterReceiver(broadcastReceiver);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!registerNetworkReceiver) {
                BroadcastReceiver broadcastReceiver = networkReceiver;
                synchronized (broadcastReceiver) {
                    if (!registerNetworkReceiver) {
                        registerNetworkReceiver = true;
                        INVOKEVIRTUAL_com_ss_ttvideoengine_net_NetUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context.getApplicationContext(), broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                }
            }
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_ttvideoengine_net_NetUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
