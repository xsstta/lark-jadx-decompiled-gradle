package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.g */
public final class C22735g<ResultT> implements AbstractC22739k<ResultT> {

    /* renamed from: a */
    private final Executor f56255a;

    /* renamed from: b */
    private final Object f56256b = new Object();

    /* renamed from: c */
    private final OnFailureListener f56257c;

    public C22735g(Executor executor, OnFailureListener onFailureListener) {
        this.f56255a = executor;
        this.f56257c = onFailureListener;
    }

    @Override // com.google.android.play.core.tasks.AbstractC22739k
    /* renamed from: a */
    public final void mo79083a(Task<ResultT> task) {
        if (!task.isSuccessful()) {
            synchronized (this.f56256b) {
                if (this.f56257c != null) {
                    this.f56255a.execute(new RunnableC22734f(this, task));
                }
            }
        }
    }
}
