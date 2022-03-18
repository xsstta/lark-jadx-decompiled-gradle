package com.bytedance.crash.runtime.p227a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.a.d */
public class C3832d {

    /* renamed from: a */
    public int f11786a;

    /* renamed from: a */
    public int mo15424a() {
        return this.f11786a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.runtime.a.d$a */
    public class C3834a extends BroadcastReceiver {
        private C3834a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    C3832d.this.f11786a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    C3832d(final Context context) {
        C3866n.m16016b().mo15508a(new Runnable() {
            /* class com.bytedance.crash.runtime.p227a.C3832d.RunnableC38331 */

            public void run() {
                try {
                    C3832d.this.mo15425a(context);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public void mo15425a(Context context) {
        m15849a(context, new C3834a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m15849a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
