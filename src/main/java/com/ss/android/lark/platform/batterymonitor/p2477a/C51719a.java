package com.ss.android.lark.platform.batterymonitor.p2477a;

import android.os.SystemClock;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.AbstractC51718a;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.statistics.perf.C52000d;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.platform.batterymonitor.a.a */
public final class C51719a extends AbstractC51718a implements Observer {

    /* renamed from: a */
    private long f128603a = 30000;

    /* renamed from: b */
    private int f128604b = 4;

    /* renamed from: c */
    private long f128605c;

    /* renamed from: d */
    private AtomicBoolean f128606d = new AtomicBoolean(false);

    /* renamed from: e */
    private int f128607e = 1;

    /* renamed from: com.ss.android.lark.platform.batterymonitor.a.a$a */
    public static class C51720a {

        /* renamed from: a */
        public static final C51719a f128608a = new C51719a();
    }

    /* renamed from: g */
    public static C51719a m200550g() {
        return C51720a.f128608a;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: b */
    public void mo177814b() {
        C52000d.m201770a().deleteObserver(this);
    }

    /* renamed from: k */
    public long mo177822k() {
        long j;
        synchronized (this) {
            j = this.f128605c;
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo177821j() {
        boolean z;
        synchronized (this) {
            int i = this.f128604b;
            if (i != 0) {
                if (i != 4) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177812a() {
        int i;
        mo177819h();
        C52000d.m201770a().addObserver(this);
        AppLifecycle.m200904a().mo177967a(new AbstractC29586u() {
            /* class com.ss.android.lark.platform.batterymonitor.p2477a.$$Lambda$a$Optm_fHj8RM3KYFXikAtfHtmiNk */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                C51719a.lambda$Optm_fHj8RM3KYFXikAtfHtmiNk(C51719a.this, aVar, aVar2);
            }
        });
        if (AppLifecycle.m200904a().mo177975e()) {
            i = 0;
        } else {
            i = 4;
        }
        m200548a(i);
    }

    /* renamed from: h */
    public void mo177819h() {
        if (AppLifecycle.m200904a().mo177975e()) {
            this.f128604b = 0;
            this.f128606d.set(true);
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " app front now!");
        }
    }

    /* renamed from: i */
    public void mo177820i() {
        synchronized (this) {
            if (this.f128604b == 0) {
                Log.m165379d("BatteryMonitor", "fixAppStateWhenRemovDoze app in foreground, so do nothing");
                return;
            }
            this.f128604b = 1;
            this.f128605c = SystemClock.elapsedRealtime();
            Log.m165379d("BatteryMonitor", "fixAppStateWhenRemovDoze app not fg , so fix app state and bd begin time");
        }
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: e */
    public int mo177817e() {
        synchronized (this) {
            int i = this.f128604b;
            if (i != 1) {
                return i;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f128605c > this.f128603a) {
                this.f128604b = 2;
                Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " bgtime is " + (elapsedRealtime - this.f128605c) + " ,mBgStateChangeInterval is " + this.f128603a + " ，set current status is ConditionState.AppState.BACKGROUND_5_MINUTE");
            }
            return this.f128604b;
        }
    }

    /* renamed from: a */
    private void m200548a(int i) {
        synchronized (this) {
            if (i != this.f128604b) {
                this.f128604b = i;
                if (i == 0) {
                    this.f128605c = 0;
                    Log.m165379d("BatteryMonitor", "updateAppState: set mBgStartTime is 0");
                } else if (i == 1) {
                    this.f128605c = SystemClock.elapsedRealtime();
                    Log.m165379d("BatteryMonitor", "updateAppState: set mBgStartTime is " + this.f128605c);
                } else {
                    if (i == 2) {
                        this.f128605c = SystemClock.elapsedRealtime() - this.f128603a;
                        Log.m165379d("BatteryMonitor", "updateAppState: set mBgStartTime is " + this.f128605c);
                    }
                }
            }
        }
    }

    public void update(Observable observable, Object obj) {
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " update called. current process already background start.");
        if (this.f128606d.get()) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " app have front, so cannel set app back start state");
            return;
        }
        m200548a(this.f128607e);
        mo177816d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m200549a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onAppLifecycleChanged called.");
        if (aVar2.mo105887c() == aVar.mo105887c()) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " onAppLifecycleChanged called. newState equals oldState");
            return;
        }
        if (aVar2.mo105887c() && !this.f128606d.get()) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " app first enter front!");
            this.f128606d.set(true);
        }
        m200548a(!aVar2.mo105887c());
        mo177816d();
    }
}
