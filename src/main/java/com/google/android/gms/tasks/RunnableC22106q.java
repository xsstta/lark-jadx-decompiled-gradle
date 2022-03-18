package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.q */
final class RunnableC22106q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53758a;

    /* renamed from: b */
    private final /* synthetic */ C22105p f53759b;

    RunnableC22106q(C22105p pVar, Task task) {
        this.f53759b = pVar;
        this.f53758a = task;
    }

    public final void run() {
        synchronized (this.f53759b.f53756b) {
            if (this.f53759b.f53757c != null) {
                this.f53759b.f53757c.onComplete(this.f53758a);
            }
        }
    }
}
