package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.i */
final class C22737i<ResultT> implements AbstractC22739k<ResultT> {

    /* renamed from: a */
    private final Executor f56260a;

    /* renamed from: b */
    private final Object f56261b = new Object();

    /* renamed from: c */
    private final OnSuccessListener<? super ResultT> f56262c;

    public C22737i(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f56260a = executor;
        this.f56262c = onSuccessListener;
    }

    @Override // com.google.android.play.core.tasks.AbstractC22739k
    /* renamed from: a */
    public final void mo79083a(Task<ResultT> task) {
        if (task.isSuccessful()) {
            synchronized (this.f56261b) {
                if (this.f56262c != null) {
                    this.f56260a.execute(new RunnableC22736h(this, task));
                }
            }
        }
    }
}
