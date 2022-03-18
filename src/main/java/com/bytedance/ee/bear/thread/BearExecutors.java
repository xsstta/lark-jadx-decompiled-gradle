package com.bytedance.ee.bear.thread;

import com.larksuite.framework.thread.CoreThreadPool;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class BearExecutors {

    /* renamed from: a */
    private static ExecutorService f31450a;

    /* renamed from: b */
    private static ExecutorService f31451b;

    /* renamed from: c */
    private static Executor f31452c;

    /* renamed from: d */
    private static ScheduledExecutorService f31453d;

    public enum ExecutorType {
        CPU,
        IO,
        HIGH_PRIORITY
    }

    /* renamed from: a */
    public static ExecutorService m48466a() {
        if (f31450a == null) {
            f31450a = CoreThreadPool.getDefault().getFixedThreadPool();
        }
        return f31450a;
    }

    /* renamed from: b */
    public static ExecutorService m48467b() {
        if (f31451b == null) {
            f31451b = CoreThreadPool.getDefault().getCachedThreadPool();
        }
        return f31451b;
    }

    /* renamed from: c */
    public static Executor m48468c() {
        if (f31452c == null) {
            f31452c = CoreThreadPool.getDefault().getUIExecutor();
        }
        return f31452c;
    }

    /* renamed from: d */
    public static Executor m48469d() {
        if (f31451b == null) {
            f31451b = CoreThreadPool.getDefault().getCachedThreadPool();
        }
        return f31451b;
    }

    /* renamed from: e */
    public static ExecutorService m48470e() {
        if (f31451b == null) {
            f31451b = CoreThreadPool.getDefault().getCachedThreadPool();
        }
        return f31451b;
    }

    /* renamed from: f */
    public static ScheduledExecutorService m48471f() {
        if (f31453d == null) {
            f31453d = CoreThreadPool.getDefault().getScheduleThreadPool();
        }
        return f31453d;
    }
}
