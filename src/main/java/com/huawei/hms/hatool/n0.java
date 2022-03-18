package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class n0 {

    /* renamed from: b */
    public static n0 f58291b = new n0();

    /* renamed from: c */
    public static n0 f58292c = new n0();

    /* renamed from: a */
    public ThreadPoolExecutor f58293a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000));

    /* renamed from: com.huawei.hms.hatool.n0$a */
    public static class RunnableC23612a implements Runnable {

        /* renamed from: a */
        public Runnable f58294a;

        public RunnableC23612a(Runnable runnable) {
            this.f58294a = runnable;
        }

        public void run() {
            Runnable runnable = this.f58294a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    C23625y.m85981e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    static {
        new n0();
        new n0();
    }

    /* renamed from: a */
    public static n0 m85860a() {
        return f58292c;
    }

    /* renamed from: b */
    public static n0 m85861b() {
        return f58291b;
    }

    /* renamed from: a */
    public void mo83125a(m0 m0Var) {
        try {
            this.f58293a.execute(new RunnableC23612a(m0Var));
        } catch (RejectedExecutionException unused) {
            C23625y.m85981e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
