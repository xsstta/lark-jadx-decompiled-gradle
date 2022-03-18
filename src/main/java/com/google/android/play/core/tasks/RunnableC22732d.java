package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.d */
final class RunnableC22732d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f56248a;

    /* renamed from: b */
    final /* synthetic */ C22733e f56249b;

    RunnableC22732d(C22733e eVar, Task task) {
        this.f56249b = eVar;
        this.f56248a = task;
    }

    public final void run() {
        synchronized (this.f56249b.f56251b) {
            if (this.f56249b.f56252c != null) {
                this.f56249b.f56252c.onComplete(this.f56248a);
            }
        }
    }
}
