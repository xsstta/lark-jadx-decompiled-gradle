package com.facebook.battery.metrics.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.battery.metrics.network.d */
public class C21008d extends AbstractC21005a {

    /* renamed from: d */
    private static final int f51401d = Process.myUid();

    /* renamed from: a */
    final ConnectivityManager f51402a;

    /* renamed from: b */
    int f51403b;

    /* renamed from: c */
    BroadcastReceiver f51404c = new BroadcastReceiver() {
        /* class com.facebook.battery.metrics.network.C21008d.C210091 */

        public void onReceive(Context context, Intent intent) {
            int type;
            NetworkInfo activeNetworkInfo = C21008d.this.f51402a.getActiveNetworkInfo();
            if (activeNetworkInfo != null && (type = activeNetworkInfo.getType()) != C21008d.this.f51403b) {
                C21008d.this.mo71160c();
                C21008d.this.f51403b = type;
            }
        }
    };

    /* renamed from: e */
    private final long[] f51405e = new long[8];

    /* renamed from: f */
    private boolean f51406f = true;

    @Override // com.facebook.battery.metrics.network.AbstractC21005a
    /* renamed from: b */
    public boolean mo71155b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo71160c() {
        char c;
        int i = f51401d;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes != -1) {
            if (uidTxBytes != -1) {
                if (this.f51403b == 1) {
                    c = 0;
                } else {
                    c = 2;
                }
                long[] jArr = this.f51405e;
                long j = jArr[3] + jArr[1];
                long j2 = jArr[2] + jArr[0];
                int i2 = c | 1;
                jArr[i2] = jArr[i2] + (uidTxBytes - j);
                int i3 = 0 | c;
                jArr[i3] = jArr[i3] + (uidRxBytes - j2);
                return;
            }
        }
        this.f51406f = false;
    }

    @Override // com.facebook.battery.metrics.network.AbstractC21005a
    /* renamed from: a */
    public synchronized boolean mo71154a(long[] jArr) {
        if (!this.f51406f) {
            return false;
        }
        mo71160c();
        System.arraycopy(this.f51405e, 0, jArr, 0, jArr.length);
        return true;
    }

    public C21008d(Context context) {
        int i;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f51402a = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            i = -1;
        } else {
            i = activeNetworkInfo.getType();
        }
        this.f51403b = i;
        m76542a(context, this.f51404c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        mo71160c();
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m76542a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
