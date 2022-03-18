package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.HandlerC21912c;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.concurrent.a */
public class ExecutorC21807a implements Executor {

    /* renamed from: a */
    private final Handler f53204a;

    public ExecutorC21807a(Looper looper) {
        this.f53204a = new HandlerC21912c(looper);
    }

    public void execute(Runnable runnable) {
        this.f53204a.post(runnable);
    }
}
