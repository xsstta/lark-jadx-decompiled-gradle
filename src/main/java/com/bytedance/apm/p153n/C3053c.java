package com.bytedance.apm.p153n;

import com.bytedance.apm.C2785b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.n.c */
public class C3053c {

    /* renamed from: a */
    private volatile ExecutorService f9827a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.n.c$a */
    public static class C3055a {

        /* renamed from: a */
        static final C3053c f9829a = new C3053c();
    }

    private C3053c() {
        this.f9827a = Executors.newFixedThreadPool(1, new ThreadFactory() {
            /* class com.bytedance.apm.p153n.C3053c.ThreadFactoryC30541 */

            /* renamed from: a */
            public static Thread m12776a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                return m12776a(new Thread(runnable, "Apm_Log_Bypass_Store"));
            }
        });
    }

    /* renamed from: a */
    public static C3053c m12774a() {
        if (C2785b.m11770k()) {
            return C3055a.f9829a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo12897a(Runnable runnable) {
        this.f9827a.submit(runnable);
    }
}
