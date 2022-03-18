package com.larksuite.framework.thread;

import android.os.Process;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.larksuite.framework.thread.m */
public class ThreadFactoryC26153m implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f64591a;

    /* renamed from: b */
    private final String f64592b;

    /* renamed from: c */
    private final boolean f64593c;

    /* renamed from: d */
    private final ThreadGroup f64594d;

    /* renamed from: e */
    private final int f64595e;

    /* renamed from: a */
    public static Thread m94643a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: com.larksuite.framework.thread.m$a */
    public static class RunnableC26154a implements Runnable {

        /* renamed from: a */
        private final int f64596a;

        /* renamed from: b */
        private final Runnable f64597b;

        public void run() {
            try {
                Process.setThreadPriority(this.f64596a);
            } catch (IllegalArgumentException e) {
                Log.e("CoreThreadPool CoreThreadFactory", "AdjustPoolThreadPriority run: ", e);
            } catch (SecurityException e2) {
                Log.e("CoreThreadPool CoreThreadFactory", "AdjustPoolThreadPriority run: ", e2);
            }
            this.f64597b.run();
        }

        public RunnableC26154a(int i, Runnable runnable) {
            this.f64596a = i;
            this.f64597b = runnable;
        }
    }

    public ThreadFactoryC26153m(String str) {
        this(str, 10, false);
    }

    public Thread newThread(Runnable runnable) {
        Thread a = m94643a(new Thread(this.f64594d, new RunnableC26154a(this.f64595e, runnable), this.f64592b + "-" + this.f64591a.getAndIncrement(), 0));
        a.setDaemon(this.f64593c);
        return a;
    }

    public ThreadFactoryC26153m(String str, int i, boolean z) {
        ThreadGroup threadGroup;
        this.f64591a = new AtomicInteger(1);
        if (i >= 19 || i < -4) {
            throw new IllegalArgumentException("CoreThreadFactory priority is not illegal! please use android.os.Process define priority!");
        }
        this.f64592b = str;
        this.f64593c = z;
        this.f64595e = i;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f64594d = threadGroup;
    }
}
