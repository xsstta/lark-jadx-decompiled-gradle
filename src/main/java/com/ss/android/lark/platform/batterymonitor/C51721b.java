package com.ss.android.lark.platform.batterymonitor;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.batterymonitor.charge.C51734a;
import com.ss.android.lark.platform.batterymonitor.p2477a.C51719a;
import com.ss.android.lark.platform.batterymonitor.p2478b.C51725a;
import com.ss.android.lark.platform.batterymonitor.p2478b.C51728b;
import com.ss.android.lark.platform.batterymonitor.p2480d.C51738b;
import com.ss.android.lark.platform.batterymonitor.p2481e.C51752a;
import com.ss.android.lark.platform.batterymonitor.p2481e.C51753b;
import com.ss.android.lark.platform.batterymonitor.screen.C51756a;
import com.ss.android.lark.utils.C57765ac;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.batterymonitor.b */
public final class C51721b extends AbstractC51718a implements Observer {

    /* renamed from: a */
    public boolean f128609a;

    /* renamed from: b */
    public long f128610b;

    /* renamed from: c */
    private C51738b f128611c;

    /* renamed from: d */
    private ScheduledExecutorService f128612d;

    /* renamed from: e */
    private ScheduledFuture f128613e;

    /* renamed from: f */
    private RunnableC51723a f128614f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.b$b */
    public static class C51724b {

        /* renamed from: a */
        public static final C51721b f128617a = new C51721b();
    }

    /* renamed from: g */
    public static C51721b m200560g() {
        return C51724b.f128617a;
    }

    /* renamed from: l */
    private boolean m200561l() {
        ScheduledFuture scheduledFuture = this.f128613e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo177826h() {
        C51738b bVar = this.f128611c;
        if (bVar == null) {
            return false;
        }
        return bVar.mo177855a();
    }

    private C51721b() {
        this.f128614f = new RunnableC51723a();
        this.f128609a = false;
        this.f128610b = 30;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: f */
    public void mo177818f() {
        Log.m165389i("BatteryMonitor", "BatteryMonitorManager destroy called.");
        C51725a.m200572a().mo177834b();
        super.mo177818f();
    }

    /* renamed from: j */
    public long mo177828j() {
        if (!this.f128609a) {
            return this.f128610b;
        }
        long min = Math.min(this.f128610b * 2, 600L);
        this.f128610b = min;
        return min;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.b$a */
    public class RunnableC51723a implements Runnable {
        public void run() {
            long j;
            synchronized (C51721b.this) {
                C51721b.this.mo177827i();
                if (C51721b.this.mo177826h()) {
                    C51721b.this.f128610b = 30;
                    if (C51721b.this.f128609a) {
                        j = 600;
                    } else {
                        j = 3600;
                    }
                    Log.m165389i("BatteryMonitor", "BatteryMonitorManager current is doze, so add next task after " + j);
                    C51721b.this.mo177825b(j);
                } else if (C51719a.m200550g().mo177821j()) {
                    Log.m165389i("BatteryMonitor", "BatteryMonitorManager current is foreground, so not add next task");
                } else {
                    long j2 = C51721b.this.mo177828j();
                    Log.m165389i("BatteryMonitor", "BatteryMonitorManager current is not doze, so add next task after " + j2);
                    C51721b.this.mo177825b(j2);
                }
            }
        }

        private RunnableC51723a() {
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177812a() {
        Log.m165389i("BatteryMonitor", " BatteryMonitorManager onCreate called.");
        C51719a.m200550g().mo177813a(mo177815c());
        C51719a.m200550g().addObserver(this);
        C51728b.m200577g().mo177813a(mo177815c());
        C51756a.m200658g().mo177813a(mo177815c());
        C51734a.m200593g().mo177813a(mo177815c());
        if (this.f128609a) {
            C51756a.m200658g().addObserver(this);
            C51734a.m200593g().addObserver(this);
        }
        mo177824a(3);
    }

    /* renamed from: i */
    public void mo177827i() {
        Log.m165389i("BatteryMonitor", "BatteryMonitorManager execute called.");
        int e = C51719a.m200550g().mo177817e();
        int e2 = C51728b.m200577g().mo177817e();
        int e3 = C51756a.m200658g().mo177817e();
        try {
            this.f128611c.mo177854a(new ConditionState.C51717a().mo177807a(e).mo177809b(e3).mo177810c(C51734a.m200593g().mo177817e()).mo177811d(e2).mo177808a());
        } catch (Exception e4) {
            Log.m165383e("BatteryMonitor", "failed to BatteryStrategyProxy execute, e:" + e4);
        }
    }

    /* renamed from: k */
    public void mo177829k() {
        synchronized (this) {
            Log.m165389i("BatteryMonitor", "removeMainProcDozeStateForWhile call!");
            if (!C57765ac.m224188b(mo177815c())) {
                Log.m165389i("BatteryMonitor", "removeMainProcDozeStateForWhile found not main process call,so exit!");
            } else if (!mo177826h()) {
                Log.m165389i("BatteryMonitor", "removeMainProcDozeStateForWhile found current strategy is not doze,so exit!");
            } else if (this.f128611c != null) {
                if (m200561l()) {
                    this.f128613e.cancel(true);
                }
                this.f128611c.mo177856b();
                C51719a.m200550g().mo177820i();
                C51756a.m200658g().mo177876h();
                mo177825b(30);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: b */
    public void mo177814b() {
        Log.m165389i("BatteryMonitor", " BatteryMonitorManager onDestroy called.");
        if (m200561l()) {
            Log.m165389i("BatteryMonitor", " BatteryMonitorManager onDestroy called. cancel schedule future");
            this.f128613e.cancel(true);
        }
        C51719a.m200550g().deleteObserver(this);
        C51719a.m200550g().mo177818f();
        C51728b.m200577g().deleteObserver(this);
        C51728b.m200577g().mo177818f();
        C51756a.m200658g().deleteObserver(this);
        C51756a.m200658g().mo177818f();
        C51734a.m200593g().deleteObserver(this);
        C51734a.m200593g().mo177818f();
    }

    /* renamed from: c */
    private void m200559c(Context context) {
        if (C57765ac.m224188b(context)) {
            new C51753b().mo177872b();
        }
    }

    @Override // com.ss.android.lark.platform.batterymonitor.AbstractC51718a
    /* renamed from: a */
    public void mo177813a(Context context) {
        if (m200558b(context)) {
            super.mo177813a(context);
        }
    }

    /* renamed from: a */
    public void mo177824a(long j) {
        synchronized (this) {
            Log.m165389i("BatteryMonitor", "BatteryMonitorManager scheduleExecuteTask called.");
            ScheduledFuture scheduledFuture = this.f128613e;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                Log.m165389i("BatteryMonitor", "BatteryMonitorManager cancel undo future task ");
                this.f128613e.cancel(true);
            }
            this.f128610b = 30;
            mo177825b(j);
        }
    }

    /* renamed from: b */
    public void mo177825b(long j) {
        try {
            Log.m165389i("BatteryMonitor", "addScheduleTaskOnce called. delay:" + j);
            this.f128613e = this.f128612d.schedule(this.f128614f, j, TimeUnit.SECONDS);
        } catch (Exception e) {
            Log.m165383e("BatteryMonitor", "failed to add schedule task. e:" + e);
            this.f128613e = null;
        }
    }

    /* renamed from: b */
    private final boolean m200558b(Context context) {
        C51725a.m200572a().mo177833a(context);
        if (context == null) {
            Log.m165383e("BatteryMonitor", "BatteryMonitorManager create called. context is null.");
            return false;
        } else if (C51752a.m200649a(context)) {
            Log.m165383e("BatteryMonitor", "BatteryMonitorManager create called. current process cannot support battery monitor.");
            return false;
        } else {
            ScheduledExecutorService scheduleThreadPool = CoreThreadPool.getDefault().getScheduleThreadPool();
            this.f128612d = scheduleThreadPool;
            if (scheduleThreadPool == null) {
                Log.m165383e("BatteryMonitor", "BatteryMonitorManager getScheduledThreadPool failed.");
                return false;
            }
            C51738b a = C51738b.m200605a(context);
            this.f128611c = a;
            if (a == null) {
                Log.m165383e("BatteryMonitor", "BatteryMonitorManager create batteryStrategyProxy object failed!");
                return false;
            }
            this.f128609a = C57765ac.m224193g(context);
            m200559c(context);
            return true;
        }
    }

    public void update(Observable observable, Object obj) {
        Log.m165389i("BatteryMonitor", " BatteryMonitorManager update called. condition is changed.");
        this.f128612d.execute(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.C51721b.RunnableC517221 */

            public void run() {
                C51721b.this.mo177824a(0);
            }
        });
    }
}
