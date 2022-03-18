package com.bytedance.apm6.util.timetask;

import android.os.Process;
import com.bytedance.apm6.util.C3345a;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm6.util.timetask.c */
public class ThreadFactoryC3366c implements ThreadFactory {

    /* renamed from: a */
    public final String f10661a;

    /* renamed from: a */
    public static Thread m14002a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public ThreadFactoryC3366c(String str) {
        this.f10661a = "APM6-" + str;
    }

    public Thread newThread(final Runnable runnable) {
        if (C3345a.m13915u()) {
            C3350b.m13932a("APM-AsyncTask", "creating newThread " + this.f10661a);
        }
        return m14002a(new Thread(new Runnable() {
            /* class com.bytedance.apm6.util.timetask.ThreadFactoryC3366c.RunnableC33671 */

            public void run() {
                Process.setThreadPriority(10);
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C3350b.m13935b("APM-AsyncTask", "SingleThreadFactory error when running in thread " + ThreadFactoryC3366c.this.f10661a, th);
                }
            }
        }, this.f10661a));
    }
}
