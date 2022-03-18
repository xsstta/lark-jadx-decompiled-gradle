package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21613b;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.n */
public abstract class AbstractC21679n<A extends C21611a.AbstractC21613b, L> {

    /* renamed from: a */
    private final C21668f.C21669a<L> f52869a;

    protected AbstractC21679n(C21668f.C21669a<L> aVar) {
        this.f52869a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73497a(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;

    /* renamed from: a */
    public C21668f.C21669a<L> mo73496a() {
        return this.f52869a;
    }
}
