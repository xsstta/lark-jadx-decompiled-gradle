package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class ca<ResultT> extends bj {

    /* renamed from: a */
    private final AbstractC21677l<C21611a.AbstractC21613b, ResultT> f52775a;

    /* renamed from: b */
    private final TaskCompletionSource<ResultT> f52776b;

    /* renamed from: c */
    private final AbstractC21675j f52777c;

    public ca(int i, AbstractC21677l<C21611a.AbstractC21613b, ResultT> lVar, TaskCompletionSource<ResultT> taskCompletionSource, AbstractC21675j jVar) {
        super(i);
        this.f52776b = taskCompletionSource;
        this.f52775a = lVar;
        this.f52777c = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73356a(C21661c.C21662a<?> aVar) throws DeadObjectException {
        try {
            this.f52775a.mo72946a(aVar.mo73431b(), this.f52776b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo73355a(an.m78404b(e2));
        } catch (RuntimeException e3) {
            mo73358a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73355a(Status status) {
        this.f52776b.trySetException(this.f52777c.mo73334a(status));
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73358a(RuntimeException runtimeException) {
        this.f52776b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.an
    /* renamed from: a */
    public final void mo73357a(C21681p pVar, boolean z) {
        pVar.mo73500a(this.f52776b, z);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: b */
    public final Feature[] mo73393b(C21661c.C21662a<?> aVar) {
        return this.f52775a.mo73494a();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: c */
    public final boolean mo73394c(C21661c.C21662a<?> aVar) {
        return this.f52775a.mo73495b();
    }
}
