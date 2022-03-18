package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.g */
public final class C22095g {

    /* renamed from: a */
    public static final Executor f53736a = new ExecutorC22096a();

    /* renamed from: b */
    static final Executor f53737b = new ExecutorC22084aa();

    /* renamed from: com.google.android.gms.tasks.g$a */
    private static final class ExecutorC22096a implements Executor {

        /* renamed from: a */
        private final Handler f53738a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f53738a.post(runnable);
        }
    }
}
