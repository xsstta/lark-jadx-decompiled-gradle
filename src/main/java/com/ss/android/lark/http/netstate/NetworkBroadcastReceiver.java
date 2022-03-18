package com.ss.android.lark.http.netstate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import me.ele.lancet.base.annotations.Skip;

public class NetworkBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static NetworkBroadcastReceiver f99695a;

    /* renamed from: a */
    public static void m153065a(Context context) {
        if (f99695a == null) {
            f99695a = new NetworkBroadcastReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m153064a(context, f99695a, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                NetworkUtils.NetworkType d = NetworkUtils.m153071d(context);
                Log.m165389i("NetworkBroadcastReceiver", "network change: " + d.toString());
                C38770b.m153078a().mo142126a(d);
            } catch (Exception unused) {
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m153064a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
