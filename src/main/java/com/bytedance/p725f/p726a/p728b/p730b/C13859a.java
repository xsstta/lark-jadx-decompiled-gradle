package com.bytedance.p725f.p726a.p728b.p730b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p728b.AbstractC13858b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.f.a.b.b.a */
public class C13859a extends AbstractC13858b {

    /* renamed from: c */
    private PowerManager f36255c = ((PowerManager) this.f36253a.getSystemService("power"));

    /* renamed from: d */
    private BatteryManager f36256d = ((BatteryManager) this.f36253a.getSystemService("batterymanager"));

    /* renamed from: e */
    private boolean f36257e;

    /* renamed from: f */
    private int f36258f = -1;

    /* renamed from: g */
    private int f36259g;

    /* renamed from: h */
    private float f36260h;

    /* renamed from: i */
    private long f36261i;

    /* renamed from: c */
    public boolean mo51116c() {
        m56200h();
        return this.f36257e;
    }

    /* renamed from: d */
    public int mo51117d() {
        return m56199g();
    }

    /* renamed from: e */
    public int mo51118e() {
        m56200h();
        return this.f36259g;
    }

    /* renamed from: f */
    public float mo51119f() {
        m56200h();
        return this.f36260h;
    }

    /* renamed from: g */
    private int m56199g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f36255c.isPowerSaveMode() ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: i */
    private boolean m56201i() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f36256d.isCharging();
        }
        return false;
    }

    /* renamed from: h */
    private void m56200h() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f36261i;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.f36261i = elapsedRealtime;
            Intent a = m56198a(this.f36253a, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = a.getIntExtra(UpdateKey.STATUS, -1);
            this.f36258f = intExtra;
            if (intExtra == 2 || (intExtra == 5 && m56201i())) {
                z = true;
            } else {
                z = false;
            }
            this.f36257e = z;
            this.f36259g = a.getIntExtra("level", 0);
            int intExtra2 = a.getIntExtra("temperature", 0);
            if (intExtra2 > 0) {
                this.f36260h = ((float) intExtra2) / 10.0f;
            }
        }
    }

    public C13859a(Context context, AbstractC13853c cVar) {
        super(context, cVar);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m56198a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
