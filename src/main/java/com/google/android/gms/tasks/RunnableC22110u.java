package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.u */
final class RunnableC22110u implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53768a;

    /* renamed from: b */
    private final /* synthetic */ C22109t f53769b;

    RunnableC22110u(C22109t tVar, Task task) {
        this.f53769b = tVar;
        this.f53768a = task;
    }

    public final void run() {
        synchronized (this.f53769b.f53766b) {
            if (this.f53769b.f53767c != null) {
                this.f53769b.f53767c.mo75026a(this.f53768a.getResult());
            }
        }
    }
}
