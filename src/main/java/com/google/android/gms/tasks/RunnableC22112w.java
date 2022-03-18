package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.tasks.w */
final class RunnableC22112w implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Task f53773a;

    /* renamed from: b */
    private final /* synthetic */ C22111v f53774b;

    RunnableC22112w(C22111v vVar, Task task) {
        this.f53774b = vVar;
        this.f53773a = task;
    }

    public final void run() {
        try {
            Task then = this.f53774b.f53771b.then(this.f53773a.getResult());
            if (then == null) {
                this.f53774b.mo75025a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            then.addOnSuccessListener(C22095g.f53737b, this.f53774b);
            then.addOnFailureListener(C22095g.f53737b, this.f53774b);
            then.addOnCanceledListener(C22095g.f53737b, this.f53774b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f53774b.mo75025a((Exception) e.getCause());
            } else {
                this.f53774b.mo75025a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f53774b.V_();
        } catch (Exception e2) {
            this.f53774b.mo75025a(e2);
        }
    }
}
