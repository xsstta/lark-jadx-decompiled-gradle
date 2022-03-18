package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.s */
final class RunnableC22108s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53763a;

    /* renamed from: b */
    private final /* synthetic */ C22107r f53764b;

    RunnableC22108s(C22107r rVar, Task task) {
        this.f53764b = rVar;
        this.f53763a = task;
    }

    public final void run() {
        synchronized (this.f53764b.f53761b) {
            if (this.f53764b.f53762c != null) {
                this.f53764b.f53762c.mo75025a(this.f53763a.getException());
            }
        }
    }
}
