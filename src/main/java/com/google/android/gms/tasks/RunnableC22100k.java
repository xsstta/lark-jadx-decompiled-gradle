package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
final class RunnableC22100k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53744a;

    /* renamed from: b */
    private final /* synthetic */ C22099j f53745b;

    RunnableC22100k(C22099j jVar, Task task) {
        this.f53745b = jVar;
        this.f53744a = task;
    }

    public final void run() {
        if (this.f53744a.isCanceled()) {
            this.f53745b.f53743c.mo75034a();
            return;
        }
        try {
            this.f53745b.f53743c.mo75033a(this.f53745b.f53742b.then(this.f53744a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f53745b.f53743c.mo75032a((Exception) e.getCause());
            } else {
                this.f53745b.f53743c.mo75032a((Exception) e);
            }
        } catch (Exception e2) {
            this.f53745b.f53743c.mo75032a(e2);
        }
    }
}
