package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.h */
final class RunnableC22736h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f56258a;

    /* renamed from: b */
    final /* synthetic */ C22737i f56259b;

    RunnableC22736h(C22737i iVar, Task task) {
        this.f56259b = iVar;
        this.f56258a = task;
    }

    public final void run() {
        synchronized (this.f56259b.f56261b) {
            if (this.f56259b.f56262c != null) {
                this.f56259b.f56262c.onSuccess(this.f56258a.getResult());
            }
        }
    }
}
