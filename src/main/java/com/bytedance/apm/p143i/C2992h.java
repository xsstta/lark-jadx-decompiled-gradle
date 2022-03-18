package com.bytedance.apm.p143i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.apm.C2785b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.apm.i.h */
public class C2992h {

    /* renamed from: a */
    public float f9645a;

    /* renamed from: b */
    public int f9646b;

    /* renamed from: c */
    public int f9647c;

    /* renamed from: d */
    private BroadcastReceiver f9648d;

    /* renamed from: e */
    private IntentFilter f9649e;

    /* renamed from: f */
    private boolean f9650f;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.h$a */
    public static class C2994a {

        /* renamed from: a */
        public static final C2992h f9652a = new C2992h();
    }

    /* renamed from: a */
    public static C2992h m12578a() {
        return C2994a.f9652a;
    }

    /* renamed from: c */
    public float mo12743c() {
        return this.f9645a;
    }

    /* renamed from: d */
    public boolean mo12744d() {
        return this.f9650f;
    }

    /* renamed from: e */
    public int mo12745e() {
        return this.f9646b;
    }

    private C2992h() {
        m12579f();
    }

    /* renamed from: f */
    private void m12579f() {
        this.f9648d = new BroadcastReceiver() {
            /* class com.bytedance.apm.p143i.C2992h.C29931 */

            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    C2992h.this.f9645a = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                    C2992h.this.f9646b = intent.getIntExtra(UpdateKey.STATUS, 1);
                    C2992h.this.f9647c = intent.getIntExtra("plugged", -1);
                }
            }
        };
        this.f9649e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* renamed from: b */
    public synchronized void mo12742b() {
        if (!this.f9650f) {
            try {
                this.f9650f = true;
                m12577a(C2785b.m11735a(), this.f9648d, this.f9649e);
            } catch (Exception unused) {
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m12577a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
