package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.internal.c */
public abstract class AbstractRunnableC22634c implements Runnable {

    /* renamed from: a */
    private final C22741m<?> f56046a;

    AbstractRunnableC22634c() {
    }

    public AbstractRunnableC22634c(C22741m<?> mVar) {
        this.f56046a = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo78814a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C22741m<?> mo78910b() {
        return this.f56046a;
    }

    public final void run() {
        try {
            mo78814a();
        } catch (Exception e) {
            C22741m<?> mVar = this.f56046a;
            if (mVar != null) {
                mVar.mo79091b(e);
            }
        }
    }
}
