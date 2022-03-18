package com.ss.android.lark.app.task.base;

import android.content.Context;
import android.os.SystemClock;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppLauncherTaskScheduler {

    /* renamed from: a */
    private ScheduledExecutorService f72653a;

    /* renamed from: b */
    private List<ILaunchTask> f72654b;

    /* renamed from: c */
    private TaskDependencyResolver f72655c;

    public AppLauncherTaskScheduler() {
        this(CoreThreadPool.getDefault().getScheduleThreadPool());
    }

    /* renamed from: a */
    public AppLauncherTaskScheduler mo102769a(ILaunchTask iLaunchTask) {
        this.f72655c.mo102771a(iLaunchTask);
        this.f72654b.add(iLaunchTask);
        return this;
    }

    public AppLauncherTaskScheduler(ScheduledExecutorService scheduledExecutorService) {
        this.f72654b = new ArrayList();
        this.f72655c = new TaskDependencyResolver();
        this.f72653a = scheduledExecutorService;
    }

    /* renamed from: a */
    public void mo102770a(Context context) {
        for (ILaunchTask iLaunchTask : this.f72654b) {
            m106328a(iLaunchTask, context);
        }
        this.f72654b.clear();
    }

    /* renamed from: a */
    private void m106328a(ILaunchTask iLaunchTask, Context context) {
        if (iLaunchTask.mo92546d()) {
            m106329b(iLaunchTask, context);
        } else if (iLaunchTask.mo43824b() > 0) {
            UICallbackExecutor.executeDelayed(new Runnable(iLaunchTask, context) {
                /* class com.ss.android.lark.app.task.base.$$Lambda$AppLauncherTaskScheduler$qU3AB4dYElMxABZ81hiBSud6sFA */
                public final /* synthetic */ ILaunchTask f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    AppLauncherTaskScheduler.this.m106332e(this.f$1, this.f$2);
                }
            }, (long) (iLaunchTask.mo43824b() * 1000));
        } else {
            m106332e(iLaunchTask, context);
        }
    }

    /* renamed from: b */
    private void m106329b(ILaunchTask iLaunchTask, Context context) {
        $$Lambda$AppLauncherTaskScheduler$2jKIELwobQLPpKeq3bAgxoS1dL4 r0 = new Runnable(iLaunchTask, context) {
            /* class com.ss.android.lark.app.task.base.$$Lambda$AppLauncherTaskScheduler$2jKIELwobQLPpKeq3bAgxoS1dL4 */
            public final /* synthetic */ ILaunchTask f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AppLauncherTaskScheduler.this.m106331d(this.f$1, this.f$2);
            }
        };
        if (iLaunchTask.mo43824b() > 0) {
            this.f72653a.schedule(r0, (long) iLaunchTask.mo43824b(), TimeUnit.SECONDS);
        } else {
            CoreThreadPool.getDefault().getScheduleThreadPool().execute(r0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m106332e(ILaunchTask iLaunchTask, Context context) {
        C51995b.m201717a(iLaunchTask.mo92547e(), (String) null);
        iLaunchTask.mo92548f();
        SystemClock.uptimeMillis();
        this.f72655c.mo102772b(iLaunchTask);
        try {
            iLaunchTask.mo43817a(context);
        } catch (Exception e) {
            Log.m165385e("AppLauncherTaskScheduler", "[" + iLaunchTask.mo92547e() + "]" + e.getMessage(), e, true);
        } catch (Throwable th) {
            this.f72655c.mo102773c(iLaunchTask);
            C51995b.m201714a();
            throw th;
        }
        this.f72655c.mo102773c(iLaunchTask);
        C51995b.m201714a();
    }
}
