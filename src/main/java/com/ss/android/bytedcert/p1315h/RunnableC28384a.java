package com.ss.android.bytedcert.p1315h;

import com.bytedance.common.utility.concurrent.TTExecutors;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.bytedcert.h.a */
public class RunnableC28384a implements Runnable {

    /* renamed from: a */
    private static volatile ExecutorService f71370a;

    /* renamed from: h */
    public Runnable f71371h;

    public RunnableC28384a() {
        this(null);
    }

    /* renamed from: a */
    public void mo101095a() {
        m104103b().execute(this);
    }

    public void run() {
        Runnable runnable = this.f71371h;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    private static ExecutorService m104103b() {
        if (f71370a == null) {
            synchronized (RunnableC28384a.class) {
                if (f71370a == null) {
                    f71370a = TTExecutors.getNormalExecutor();
                }
            }
        }
        return f71370a;
    }

    /* renamed from: a */
    public static void m104102a(ExecutorService executorService) {
        f71370a = executorService;
    }

    public RunnableC28384a(Runnable runnable) {
        this.f71371h = runnable;
    }
}
