package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21613b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.l */
public abstract class AbstractC21677l<A extends C21611a.AbstractC21613b, ResultT> {

    /* renamed from: a */
    private final Feature[] f52867a;

    /* renamed from: b */
    private final boolean f52868b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72946a(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    /* renamed from: a */
    public final Feature[] mo73494a() {
        return this.f52867a;
    }

    /* renamed from: b */
    public boolean mo73495b() {
        return this.f52868b;
    }
}
