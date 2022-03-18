package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class bx<T> extends bj {

    /* renamed from: a */
    protected final TaskCompletionSource<T> f52733a;

    public bx(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f52733a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public void mo73357a(C21681p pVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo73410d(C21661c.C21662a<?> aVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public void mo73355a(Status status) {
        this.f52733a.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public void mo73358a(RuntimeException runtimeException) {
        this.f52733a.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73356a(C21661c.C21662a<?> aVar) throws DeadObjectException {
        try {
            mo73410d(aVar);
        } catch (DeadObjectException e) {
            mo73355a(an.m78404b(e));
            throw e;
        } catch (RemoteException e2) {
            mo73355a(an.m78404b(e2));
        } catch (RuntimeException e3) {
            mo73358a(e3);
        }
    }
}
