package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.p1012a.C23418a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.huawei.hmf.tasks.h */
public final class C23435h {

    /* renamed from: a */
    private static final C23435h f57763a = new C23435h();

    /* renamed from: b */
    private final Executor f57764b = new ExecutorC23436a();

    /* renamed from: c */
    private final ExecutorService f57765c = C23418a.m84966a();

    /* renamed from: d */
    private final Executor f57766d = C23418a.m84967b();

    /* renamed from: com.huawei.hmf.tasks.h$a */
    static final class ExecutorC23436a implements Executor {
        ExecutorC23436a() {
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private C23435h() {
    }

    /* renamed from: a */
    public static Executor m85010a() {
        return f57763a.f57766d;
    }
}
