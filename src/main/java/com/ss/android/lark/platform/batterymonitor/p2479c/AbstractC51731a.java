package com.ss.android.lark.platform.batterymonitor.p2479c;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.batterymonitor.c.a */
public abstract class AbstractC51731a {

    /* renamed from: a */
    protected String f128624a = Build.BRAND;

    /* renamed from: b */
    protected ArrayList<ScheduledFuture<?>> f128625b = new ArrayList<>();

    /* renamed from: c */
    protected ScheduledExecutorService f128626c;

    /* renamed from: d */
    protected boolean f128627d = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo177835a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo177838b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo177842d() {
    }

    AbstractC51731a() {
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + ", phone brand is " + this.f128624a);
        ScheduledExecutorService scheduleThreadPool = CoreThreadPool.getDefault().getScheduleThreadPool();
        this.f128626c = scheduleThreadPool;
        if (scheduleThreadPool == null) {
            Log.m165383e("BatteryMonitor", getClass().getSimpleName() + " getScheduledThreadPool failed.");
        }
    }

    /* renamed from: c */
    public void mo177840c() {
        synchronized (this) {
            Iterator<ScheduledFuture<?>> it = this.f128625b.iterator();
            while (it.hasNext()) {
                ScheduledFuture<?> next = it.next();
                if (next != null && !next.isCancelled()) {
                    next.cancel(true);
                    Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " cannelRecycleProcess cannel recycle success");
                }
            }
            this.f128625b.clear();
        }
    }

    /* renamed from: c */
    public void mo177841c(long j) {
        synchronized (this) {
            mo177837a(mo177836a(j), true);
            if (this.f128627d) {
                Log.m165389i("BatteryMonitor", getClass().getSimpleName() + "need recycle relative process");
                mo177837a(mo177839b(j), false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo177836a(long j) {
        long a = mo177835a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + a;
        long j3 = j2 - elapsedRealtime;
        if (j3 < 0) {
            j3 = 0;
        }
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " getRecycleTaskDelayTime, recycleInterval: " + a + ", currentTimeRelOSBoot: " + elapsedRealtime + ", recycleTashExecTimeRelOSBoot: " + j2 + ", delaytime: " + j3);
        return j3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo177839b(long j) {
        long b = mo177838b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + b;
        long j3 = j2 - elapsedRealtime;
        if (j3 < 0) {
            j3 = 0;
        }
        Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " getRelateProcRecycleTaskDelayTime, recycleInterval: " + b + ", currentTimeRelOSBoot: " + elapsedRealtime + ", recycleTashExecTimeRelOSBoot: " + j2 + ", delaytime: " + j3);
        return j3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177837a(long j, final boolean z) {
        if (j == Long.MAX_VALUE) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + "recycleProcess found current process not support recycle, so return");
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.f128626c;
        if (scheduledExecutorService == null) {
            Log.m165383e("BatteryMonitor", getClass().getSimpleName() + "mExecutorService is null, so return");
            return;
        }
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.p2479c.AbstractC51731a.RunnableC517321 */

            public void run() {
                if (z) {
                    Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " kill process now!");
                    Process.killProcess(Process.myPid());
                    return;
                }
                AbstractC51731a.this.mo177842d();
            }
        }, j, TimeUnit.MILLISECONDS);
        if (schedule != null) {
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " recycleProcess add recycle task success, delay time is " + j + " ms");
            this.f128625b.add(schedule);
        }
    }
}
