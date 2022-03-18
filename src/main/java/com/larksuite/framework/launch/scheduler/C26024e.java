package com.larksuite.framework.launch.scheduler;

import android.content.Context;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.larksuite.framework.launch.scheduler.e */
public class C26024e {

    /* renamed from: a */
    private Context f64404a;

    /* renamed from: b */
    private boolean f64405b;

    /* renamed from: c */
    private boolean f64406c;

    /* renamed from: d */
    private AbstractC26023d f64407d;

    /* renamed from: e */
    private ExecutorService f64408e;

    /* renamed from: f */
    private ScheduledExecutorService f64409f;

    /* renamed from: g */
    private AbstractC26022c f64410g;

    /* renamed from: h */
    private LinkedBlockingDeque<ILaunchTask> f64411h = new LinkedBlockingDeque<>();

    /* renamed from: a */
    public void mo92530a() {
        this.f64410g.mo92528a(this.f64404a);
    }

    /* renamed from: a */
    public C26024e mo92529a(ILaunchTask iLaunchTask) {
        this.f64410g.mo92527a(iLaunchTask);
        return this;
    }

    C26024e(Context context, boolean z, boolean z2, ExecutorService executorService, AbstractC26023d dVar) {
        this.f64404a = context;
        this.f64405b = z;
        this.f64406c = z2;
        this.f64408e = executorService;
        if (executorService instanceof ScheduledExecutorService) {
            this.f64409f = (ScheduledExecutorService) executorService;
        } else {
            this.f64409f = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
                /* class com.larksuite.framework.launch.scheduler.C26024e.ThreadFactoryC260251 */

                /* renamed from: a */
                public static Thread m94190a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    return m94190a(new Thread(runnable, "default-launch-scheduler"));
                }
            });
        }
        this.f64407d = dVar;
        this.f64410g = new C26028h(z2, executorService, this.f64409f, dVar);
    }
}
