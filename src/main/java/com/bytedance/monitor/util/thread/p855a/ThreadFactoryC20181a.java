package com.bytedance.monitor.util.thread.p855a;

import android.os.Process;
import com.bytedance.monitor.util.thread.AbstractC20193e;
import com.bytedance.monitor.util.thread.C20188b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.monitor.util.thread.a.a */
public class ThreadFactoryC20181a implements ThreadFactory {

    /* renamed from: a */
    public final String f49304a = getClass().getSimpleName();

    /* renamed from: b */
    public AbstractC20193e f49305b;

    /* renamed from: c */
    public AbstractC20183a f49306c;

    /* renamed from: d */
    private final String f49307d;

    /* renamed from: com.bytedance.monitor.util.thread.a.a$a */
    public interface AbstractC20183a {
        /* renamed from: a */
        void mo68333a(long j);
    }

    /* renamed from: a */
    public static Thread m73663a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public void mo68334a(AbstractC20183a aVar) {
        this.f49306c = aVar;
    }

    /* renamed from: a */
    public void mo68335a(AbstractC20193e eVar) {
        this.f49305b = eVar;
    }

    public Thread newThread(final Runnable runnable) {
        return m73663a(new Thread(new Runnable() {
            /* class com.bytedance.monitor.util.thread.p855a.ThreadFactoryC20181a.RunnableC201821 */

            public void run() {
                Process.setThreadPriority(10);
                if (ThreadFactoryC20181a.this.f49306c != null) {
                    ThreadFactoryC20181a.this.f49306c.mo68333a(Thread.currentThread().getId());
                }
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    C20188b.m73688a().mo68325a(th, "APM_INNER_ERROR_async_task");
                    if (ThreadFactoryC20181a.this.f49305b != null) {
                        ThreadFactoryC20181a.this.f49305b.mo68354b(ThreadFactoryC20181a.this.f49304a, th.getMessage());
                    }
                }
            }
        }, this.f49307d));
    }

    public ThreadFactoryC20181a(String str) {
        this.f49307d = "APM_" + str;
    }
}
