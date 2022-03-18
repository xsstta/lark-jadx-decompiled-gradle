package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.d */
final /* synthetic */ class ExecutorC22894d implements Executor {

    /* renamed from: a */
    static final Executor f56601a = new ExecutorC22894d();

    private ExecutorC22894d() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
