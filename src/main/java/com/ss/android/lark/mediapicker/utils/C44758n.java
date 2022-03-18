package com.ss.android.lark.mediapicker.utils;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.lark.mediapicker.utils.n */
public class C44758n {

    /* renamed from: a */
    private static volatile C44758n f113358a;

    /* renamed from: b */
    private final ExecutorService f113359b;

    /* renamed from: a */
    public static C44758n m177507a() {
        if (f113358a == null) {
            m177508a(2);
        }
        return f113358a;
    }

    /* renamed from: a */
    public <T> Future<T> mo158473a(Callable<T> callable) {
        return this.f113359b.submit(callable);
    }

    private C44758n(int i) {
        this.f113359b = Executors.newFixedThreadPool(i, new ThreadFactory() {
            /* class com.ss.android.lark.mediapicker.utils.C44758n.ThreadFactoryC447591 */

            /* renamed from: a */
            public static Thread m177511a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                Thread a = m177511a(new Thread(runnable, "picker-thread-pool"));
                a.setDaemon(false);
                return a;
            }
        });
    }

    /* renamed from: a */
    public static void m177508a(int i) {
        if (f113358a == null) {
            synchronized (C44758n.class) {
                if (f113358a == null) {
                    f113358a = new C44758n(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo158474a(Runnable runnable) {
        this.f113359b.execute(runnable);
    }
}
