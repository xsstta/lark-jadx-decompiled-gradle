package com.ss.android.lark.platform.batterymonitor.screen;

import android.os.SystemClock;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.AbstractC51718a;

/* renamed from: com.ss.android.lark.platform.batterymonitor.screen.a */
public final class C51756a extends AbstractC51718a {

    /* renamed from: a */
    private long f128667a;

    /* renamed from: b */
    private Display f128668b;

    /* renamed from: c */
    private int f128669c;

    /* renamed from: d */
    private long f128670d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.screen.a$a */
    public static class C51758a {

        /* renamed from: a */
        public static final C51756a f128671a = new C51756a();
    }

    /* renamed from: g */
    public static C51756a m200658g() {
        return C51758a.f128671a;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: b */
    public void mo177814b() {
        ScreenBroadcastReceiver.m200656b(mo177815c());
    }

    private C51756a() {
        this.f128667a = 180000;
    }

    /* renamed from: i */
    private boolean m200659i() {
        Display display = this.f128668b;
        if (display != null && display.getState() == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private int m200660j() {
        int i = this.f128669c;
        if (i == 0) {
            return i;
        }
        this.f128670d = 0;
        this.f128669c = 0;
        return 0;
    }

    /* renamed from: k */
    private boolean m200661k() {
        int i = this.f128669c;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177812a() {
        ScreenBroadcastReceiver.m200655a(mo177815c());
        this.f128668b = ((WindowManager) mo177815c().getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: e */
    public int mo177817e() {
        synchronized (this) {
            if (m200659i()) {
                return m200660j();
            }
            return m200657a(false);
        }
    }

    /* renamed from: h */
    public void mo177876h() {
        synchronized (this) {
            if (this.f128669c == 0) {
                Log.m165379d("BatteryMonitor", "fixScreenStateWhenRemovDoze screen on , so do nothing");
                return;
            }
            this.f128669c = 1;
            this.f128670d = SystemClock.elapsedRealtime();
            Log.m165379d("BatteryMonitor", "fixScreenStateWhenRemovDoze not screen on, so fix screen state off and begin time");
        }
    }

    /* renamed from: a */
    private int m200657a(boolean z) {
        int i = this.f128669c;
        if (i == 2) {
            return i;
        }
        if (i == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f128670d = elapsedRealtime;
            if (!z) {
                this.f128670d = elapsedRealtime - 30000;
            }
            this.f128669c = 1;
            return 1;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (elapsedRealtime2 - this.f128670d >= this.f128667a) {
            Log.m165379d("BatteryMonitor", "screen off time is " + (elapsedRealtime2 - this.f128670d) + " ,so set mCurrentState is ConditionState.ScreenState.SCREEN_OFF_3_MINUTE");
            this.f128669c = 2;
        }
        return this.f128669c;
    }

    /* renamed from: a */
    public final void mo177875a(int i) {
        synchronized (this) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onStateChange called. state:" + i);
            if (i == 1 && m200661k()) {
                Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onStateChange called. current screen state is light off and receive screen_off broadcast.");
            } else if (i == 0 && this.f128669c == 0) {
                Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onStateChange called. current screen state is light on and receive screen_on broadcast.");
            } else {
                if (i == 1) {
                    m200657a(true);
                } else {
                    m200660j();
                }
                setChanged();
                notifyObservers();
            }
        }
    }
}
