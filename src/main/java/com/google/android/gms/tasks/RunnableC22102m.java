package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.m */
final class RunnableC22102m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53749a;

    /* renamed from: b */
    private final /* synthetic */ C22101l f53750b;

    RunnableC22102m(C22101l lVar, Task task) {
        this.f53750b = lVar;
        this.f53749a = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f53750b.f53747b.then(this.f53749a);
            if (task == null) {
                this.f53750b.mo75025a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(C22095g.f53737b, this.f53750b);
            task.addOnFailureListener(C22095g.f53737b, this.f53750b);
            task.addOnCanceledListener(C22095g.f53737b, this.f53750b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f53750b.f53748c.mo75032a((Exception) e.getCause());
            } else {
                this.f53750b.f53748c.mo75032a((Exception) e);
            }
        } catch (Exception e2) {
            this.f53750b.f53748c.mo75032a(e2);
        }
    }
}
