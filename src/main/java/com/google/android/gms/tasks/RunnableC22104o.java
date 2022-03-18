package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.o */
final class RunnableC22104o implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C22103n f53754a;

    RunnableC22104o(C22103n nVar) {
        this.f53754a = nVar;
    }

    public final void run() {
        synchronized (this.f53754a.f53752b) {
            if (this.f53754a.f53753c != null) {
                this.f53754a.f53753c.V_();
            }
        }
    }
}
