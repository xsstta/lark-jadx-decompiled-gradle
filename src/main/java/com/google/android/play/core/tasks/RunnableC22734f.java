package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.f */
final class RunnableC22734f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f56253a;

    /* renamed from: b */
    final /* synthetic */ C22735g f56254b;

    RunnableC22734f(C22735g gVar, Task task) {
        this.f56254b = gVar;
        this.f56253a = task;
    }

    public final void run() {
        synchronized (this.f56254b.f56256b) {
            if (this.f56254b.f56257c != null) {
                this.f56254b.f56257c.onFailure(this.f56253a.getException());
            }
        }
    }
}
