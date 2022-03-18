package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.k */
public final /* synthetic */ class ExecutorC22833k implements Executor {

    /* renamed from: a */
    static final Executor f56451a = new ExecutorC22833k();

    private ExecutorC22833k() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
