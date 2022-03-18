package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.o */
final class ExecutorC22743o implements Executor {

    /* renamed from: a */
    private final Handler f56267a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f56267a.post(runnable);
    }
}
