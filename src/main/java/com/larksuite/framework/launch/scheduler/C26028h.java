package com.larksuite.framework.launch.scheduler;

import android.content.Context;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.launch.scheduler.h */
public class C26028h implements AbstractC26022c {

    /* renamed from: a */
    public ExecutorService f64420a;

    /* renamed from: b */
    private boolean f64421b;

    /* renamed from: c */
    private AbstractC26023d f64422c;

    /* renamed from: d */
    private ScheduledExecutorService f64423d;

    /* renamed from: e */
    private Thread f64424e;

    /* renamed from: f */
    private LinkedBlockingDeque<ILaunchTask> f64425f = new LinkedBlockingDeque<>();

    /* renamed from: g */
    private Set<ILaunchTask> f64426g = new HashSet();

    /* renamed from: h */
    private C26031j f64427h = new C26031j();

    @Override // com.larksuite.framework.launch.scheduler.AbstractC26022c
    /* renamed from: a */
    public AbstractC26022c mo92527a(ILaunchTask iLaunchTask) {
        this.f64427h.mo92540a(iLaunchTask);
        return this;
    }

    @Override // com.larksuite.framework.launch.scheduler.AbstractC26022c
    /* renamed from: a */
    public void mo92528a(Context context) {
        this.f64424e = Thread.currentThread();
        this.f64426g = this.f64427h.mo92539a();
        m94201b(context);
        while (!this.f64426g.isEmpty()) {
            try {
                ILaunchTask take = this.f64425f.take();
                if (take != null) {
                    m94202b(take, context);
                }
                m94201b(context);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m94201b(Context context) {
        while (true) {
            List<ILaunchTask> b = this.f64427h.mo92542b();
            if (!C26030i.m94206a(b)) {
                ArrayList<ILaunchTask> arrayList = new ArrayList();
                for (ILaunchTask iLaunchTask : b) {
                    final $$Lambda$h$2ysmZIHUCmjmInjLueMPJ44ExCA r3 = new Runnable(iLaunchTask, context) {
                        /* class com.larksuite.framework.launch.scheduler.$$Lambda$h$2ysmZIHUCmjmInjLueMPJ44ExCA */
                        public final /* synthetic */ ILaunchTask f$1;
                        public final /* synthetic */ Context f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C26028h.lambda$2ysmZIHUCmjmInjLueMPJ44ExCA(C26028h.this, this.f$1, this.f$2);
                        }
                    };
                    if (iLaunchTask.mo92546d()) {
                        if (iLaunchTask.mo43824b() <= 0) {
                            this.f64420a.execute(r3);
                        } else if (this.f64420a instanceof ScheduledExecutorService) {
                            this.f64423d.schedule(r3, (long) iLaunchTask.mo43824b(), TimeUnit.SECONDS);
                        } else {
                            this.f64423d.schedule(new Runnable() {
                                /* class com.larksuite.framework.launch.scheduler.C26028h.RunnableC260291 */

                                public void run() {
                                    C26028h.this.f64420a.execute(r3);
                                }
                            }, (long) iLaunchTask.mo43824b(), TimeUnit.SECONDS);
                        }
                    } else if (Thread.currentThread() == this.f64424e) {
                        arrayList.add(iLaunchTask);
                    } else {
                        this.f64425f.add(iLaunchTask);
                    }
                }
                for (ILaunchTask iLaunchTask2 : arrayList) {
                    m94202b(iLaunchTask2, context);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: public */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m94203c(ILaunchTask iLaunchTask, Context context) {
        m94202b(iLaunchTask, context);
        m94201b(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7.mo92546d() == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r7.mo92546d() == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r6.f64426g.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        m94200a(r7, r8, android.os.SystemClock.uptimeMillis() - r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m94202b(com.larksuite.framework.launch.task.ILaunchTask r7, android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.launch.scheduler.C26028h.m94202b(com.larksuite.framework.launch.task.ILaunchTask, android.content.Context):void");
    }

    /* renamed from: a */
    private void m94200a(ILaunchTask iLaunchTask, Context context, long j) {
        this.f64427h.mo92543b(iLaunchTask);
        AbstractC26023d dVar = this.f64422c;
        if (dVar != null) {
            dVar.onTaskFinish(iLaunchTask.getClass(), j);
        }
    }

    public C26028h(boolean z, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, AbstractC26023d dVar) {
        this.f64421b = z;
        this.f64420a = executorService;
        this.f64423d = scheduledExecutorService;
        this.f64422c = dVar;
    }
}
