package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.ac */
public final class RunnableC22087ac implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C22085ab f53731a;

    /* renamed from: b */
    private final /* synthetic */ Callable f53732b;

    RunnableC22087ac(C22085ab abVar, Callable callable) {
        this.f53731a = abVar;
        this.f53732b = callable;
    }

    public final void run() {
        try {
            this.f53731a.mo75033a(this.f53732b.call());
        } catch (Exception e) {
            this.f53731a.mo75032a(e);
        }
    }
}
