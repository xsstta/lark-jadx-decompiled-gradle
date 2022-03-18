package com.ss.android.lark.app.taskv2.scheduler;

import android.content.Context;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppLauncherTaskScheduler {

    /* renamed from: a */
    public Context f72868a;

    /* renamed from: b */
    private TaskDependencyResolver f72869b;

    /* renamed from: c */
    private ITaskExecuteListener f72870c;

    /* renamed from: d */
    private ScheduledExecutorService f72871d;

    /* renamed from: e */
    private boolean f72872e;

    /* renamed from: f */
    private LaunchTaskExecutor.IExecutor f72873f;

    /* renamed from: a */
    public AppLauncherTaskScheduler mo103151a(ILaunchTask iLaunchTask) {
        this.f72869b.mo103161a(iLaunchTask);
        return this;
    }

    public AppLauncherTaskScheduler(ITaskExecuteListener iTaskExecuteListener) {
        this(iTaskExecuteListener, CoreThreadPool.getDefault().getScheduleThreadPool(), false);
    }

    /* renamed from: b */
    public void mo103154b(Context context) {
        while (true) {
            List<ILaunchTask> a = this.f72869b.mo103160a();
            if (!CollectionUtils.isEmpty(a)) {
                for (ILaunchTask iLaunchTask : a) {
                    m106901b(iLaunchTask, context);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo103152a(Context context) {
        for (ILaunchTask iLaunchTask : this.f72869b.mo103160a()) {
            $$Lambda$AppLauncherTaskScheduler$YXpDBcEquU9k684umcaLEp9h9A r2 = new Runnable(iLaunchTask, context) {
                /* class com.ss.android.lark.app.taskv2.scheduler.$$Lambda$AppLauncherTaskScheduler$YXpDBcEquU9k684umcaLEp9h9A */
                public final /* synthetic */ ILaunchTask f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    AppLauncherTaskScheduler.this.m106903d(this.f$1, this.f$2);
                }
            };
            if (!iLaunchTask.mo92546d()) {
                this.f72868a = context;
                if (this.f72872e) {
                    UICallbackExecutor.execute(r2);
                } else {
                    LaunchTaskExecutor.m106910a().mo103157a(iLaunchTask, this.f72873f);
                }
            } else if (iLaunchTask.mo43824b() > 0) {
                this.f72871d.schedule(r2, (long) iLaunchTask.mo43824b(), TimeUnit.SECONDS);
            } else {
                this.f72871d.execute(r2);
            }
        }
    }

    /* renamed from: a */
    public void m106903d(ILaunchTask iLaunchTask, Context context) {
        m106901b(iLaunchTask, context);
        mo103152a(context);
    }

    /* renamed from: c */
    private void m106902c(ILaunchTask iLaunchTask, Context context) {
        this.f72869b.mo103163b(iLaunchTask);
        ITaskExecuteListener iTaskExecuteListener = this.f72870c;
        if (iTaskExecuteListener != null) {
            iTaskExecuteListener.mo103156a(iLaunchTask.getClass());
        }
    }

    /* renamed from: b */
    private void m106901b(ILaunchTask iLaunchTask, Context context) {
        C51995b.m201717a(iLaunchTask.mo92547e(), (String) null);
        iLaunchTask.mo92548f();
        try {
            iLaunchTask.mo43817a(context);
        } catch (Throwable th) {
            m106902c(iLaunchTask, context);
            C51995b.m201714a();
            throw th;
        }
        m106902c(iLaunchTask, context);
        C51995b.m201714a();
    }

    public AppLauncherTaskScheduler(ITaskExecuteListener iTaskExecuteListener, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.f72873f = new LaunchTaskExecutor.IExecutor() {
            /* class com.ss.android.lark.app.taskv2.scheduler.AppLauncherTaskScheduler.C290791 */

            @Override // com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor.IExecutor
            /* renamed from: a */
            public void mo103155a(ILaunchTask iLaunchTask) {
                AppLauncherTaskScheduler appLauncherTaskScheduler = AppLauncherTaskScheduler.this;
                appLauncherTaskScheduler.m106903d(iLaunchTask, appLauncherTaskScheduler.f72868a);
            }
        };
        this.f72870c = iTaskExecuteListener;
        this.f72871d = scheduledExecutorService;
        this.f72872e = z;
        this.f72869b = new TaskDependencyResolver();
    }
}
