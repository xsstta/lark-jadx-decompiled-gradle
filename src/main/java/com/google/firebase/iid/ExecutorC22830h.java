package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.h */
final /* synthetic */ class ExecutorC22830h implements Executor {

    /* renamed from: a */
    static final Executor f56446a = new ExecutorC22830h();

    private ExecutorC22830h() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
