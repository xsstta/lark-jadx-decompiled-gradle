package com.bytedance.applog.p197a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.applog.util.C3469r;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.a.f */
public class C3375f extends BroadcastReceiver {

    /* renamed from: a */
    private static NetworkUtils.NetworkType f10703a = NetworkUtils.NetworkType.UNKNOWN;

    /* renamed from: b */
    private static long f10704b;

    /* renamed from: d */
    private static AtomicBoolean f10705d = new AtomicBoolean(false);

    /* renamed from: c */
    private final C3373e f10706c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo13617a() {
        if (Math.abs(f10704b - System.currentTimeMillis()) > 60000) {
            try {
                f10703a = NetworkUtils.getNetworkType(this.f10706c.mo13607b());
            } catch (Throwable th) {
                C3469r.m14667a(th);
            }
            f10704b = System.currentTimeMillis();
            if (f10705d.compareAndSet(false, true)) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    m14110a(this.f10706c.mo13607b(), this, intentFilter);
                } catch (Throwable th2) {
                    C3469r.m14667a(th2);
                }
            }
        }
        return f10703a.getValue();
    }

    C3375f(C3373e eVar) {
        this.f10706c = eVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            f10704b = 0;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m14110a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
