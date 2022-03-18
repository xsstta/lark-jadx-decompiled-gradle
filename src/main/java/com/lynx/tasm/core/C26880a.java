package com.lynx.tasm.core;

import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.lynx.tasm.core.a */
public final class C26880a {

    /* renamed from: a */
    private static volatile Executor f66738a;

    /* renamed from: b */
    private static volatile ExecutorService f66739b;

    private C26880a() {
    }

    /* renamed from: a */
    public static Executor m97713a() {
        if (f66738a == null) {
            synchronized (C26880a.class) {
                if (f66738a == null) {
                    f66738a = m97714a("lynx-brief-io-thread", 3, 2);
                }
            }
        }
        return f66738a;
    }

    /* renamed from: b */
    public static ExecutorService m97715b() {
        if (f66739b == null) {
            synchronized (C26880a.class) {
                if (f66739b == null) {
                    f66739b = m97714a("lynx-view-op-thread", 10, 2);
                }
            }
        }
        return f66739b;
    }

    /* renamed from: a */
    private static ExecutorService m97714a(final String str, final int i, int i2) {
        try {
            return Executors.newFixedThreadPool(i2, new ThreadFactory() {
                /* class com.lynx.tasm.core.C26880a.ThreadFactoryC268811 */

                /* renamed from: a */
                public static Thread m97716a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    Thread a = m97716a(new Thread(runnable, str));
                    if (a.isDaemon()) {
                        a.setDaemon(false);
                    }
                    a.setPriority(i);
                    return a;
                }
            });
        } catch (Throwable th) {
            Log.e("lynx_LynxThreadPool", th.toString());
            f66738a = new Executor() {
                /* class com.lynx.tasm.core.C26880a.ExecutorC268822 */

                public void execute(Runnable runnable) {
                }
            };
            return null;
        }
    }
}
