package com.larksuite.framework.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.log.Log;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.larksuite.framework.utils.b */
public class C26264b {

    /* renamed from: a */
    private static BluetoothManager f64862a;

    /* renamed from: b */
    private static BluetoothAdapter f64863b;

    /* renamed from: a */
    public static boolean m95071a() {
        if (m95073b() == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m95073b() {
        BluetoothAdapter c = m95077c();
        if (c != null) {
            return c.getState();
        }
        return 0;
    }

    /* renamed from: c */
    public static BluetoothAdapter m95077c() {
        if (f64863b == null) {
            f64863b = BluetoothAdapter.getDefaultAdapter();
        }
        return f64863b;
    }

    /* renamed from: b */
    public static BluetoothManager m95074b(Context context) {
        if (!m95072a(context)) {
            return null;
        }
        if (f64862a == null) {
            f64862a = (BluetoothManager) context.getSystemService("bluetooth");
        }
        return f64862a;
    }

    /* renamed from: a */
    public static BluetoothDevice m95068a(String str) {
        BluetoothAdapter c;
        if (TextUtils.isEmpty(str) || (c = m95077c()) == null) {
            return null;
        }
        return c.getRemoteDevice(str);
    }

    /* renamed from: a */
    public static boolean m95072a(Context context) {
        if (Build.VERSION.SDK_INT < 18 || context == null || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m95069a(Context context, BroadcastReceiver broadcastReceiver) {
        m95076b(context, broadcastReceiver);
    }

    /* renamed from: b */
    private static void m95076b(Context context, BroadcastReceiver broadcastReceiver) {
        context.unregisterReceiver(broadcastReceiver);
    }

    /* renamed from: a */
    public static int m95067a(Context context, String str) {
        BluetoothManager b = m95074b(context);
        if (b == null) {
            return -1;
        }
        try {
            return b.getConnectionState(m95068a(str), 7);
        } catch (Throwable th) {
            Log.m165384e("BluetoothUtils", "getConnectStatus: ", th);
            return -1;
        }
    }

    /* renamed from: c */
    private static void m95078c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        m95075b(context, broadcastReceiver, intentFilter);
    }

    /* renamed from: a */
    public static void m95070a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        m95078c(context, broadcastReceiver, intentFilter);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: b */
    public static Intent m95075b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
