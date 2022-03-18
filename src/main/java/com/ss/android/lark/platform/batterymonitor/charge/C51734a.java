package com.ss.android.lark.platform.batterymonitor.charge;

import android.os.BatteryManager;
import android.os.Build;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.AbstractC51718a;

/* renamed from: com.ss.android.lark.platform.batterymonitor.charge.a */
public final class C51734a extends AbstractC51718a {

    /* renamed from: a */
    private int f128631a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.charge.a$a */
    public static class C51735a {

        /* renamed from: a */
        public static final C51734a f128632a = new C51734a();
    }

    /* renamed from: g */
    public static C51734a m200593g() {
        return C51735a.f128632a;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: b */
    public void mo177814b() {
        ChargeBroadcastReceiver.m200592b(mo177815c());
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177812a() {
        this.f128631a = 1;
        ChargeBroadcastReceiver.m200591a(mo177815c());
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: e */
    public int mo177817e() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f128631a = !((BatteryManager) mo177815c().getSystemService("batterymanager")).isCharging();
        }
        return this.f128631a;
    }

    /* renamed from: a */
    public final void mo177845a(int i) {
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onStateChange called. state:" + i);
        this.f128631a = i;
        setChanged();
        notifyObservers();
    }
}
