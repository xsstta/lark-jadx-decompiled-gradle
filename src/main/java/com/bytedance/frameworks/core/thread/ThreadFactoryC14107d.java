package com.bytedance.frameworks.core.thread;

import android.text.TextUtils;
import com.bytedance.frameworks.core.thread.TTPriority;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.core.thread.d */
public class ThreadFactoryC14107d implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f37068a = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadGroup f37069b;

    /* renamed from: c */
    private final AtomicInteger f37070c = new AtomicInteger(1);

    /* renamed from: d */
    private final String f37071d;

    /* renamed from: e */
    private final TTPriority.Priority f37072e;

    /* renamed from: a */
    public static Thread m57085a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f37069b;
        Thread a = m57085a(new Thread(threadGroup, runnable, this.f37071d + this.f37070c.getAndIncrement(), 0));
        if (a.isDaemon()) {
            a.setDaemon(false);
        }
        TTPriority.Priority priority = this.f37072e;
        if (priority != null && priority.getValue() == TTPriority.Priority.LOW.getValue()) {
            a.setPriority(1);
        } else if (a.getPriority() != 5) {
            a.setPriority(3);
        } else {
            a.setPriority(5);
        }
        return a;
    }

    ThreadFactoryC14107d(TTPriority.Priority priority, String str) {
        ThreadGroup threadGroup;
        this.f37072e = priority;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f37069b = threadGroup;
        if (TextUtils.isEmpty(str)) {
            this.f37071d = "ttdefault-" + f37068a.getAndIncrement() + "-thread-";
            return;
        }
        this.f37071d = str + f37068a.getAndIncrement() + "-thread-";
    }
}
