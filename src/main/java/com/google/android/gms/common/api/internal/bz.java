package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class bz extends bx<Void> {

    /* renamed from: b */
    private final AbstractC21673h<C21611a.AbstractC21613b, ?> f52735b;

    /* renamed from: c */
    private final AbstractC21679n<C21611a.AbstractC21613b, ?> f52736c;

    public bz(bi biVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f52735b = biVar.f52705a;
        this.f52736c = biVar.f52706b;
    }

    @Override // com.google.android.gms.common.api.internal.an, com.google.android.gms.common.api.internal.bx
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73357a(C21681p pVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.bx
    /* renamed from: d */
    public final void mo73410d(C21661c.C21662a<?> aVar) throws RemoteException {
        this.f52735b.mo73490a(aVar.mo73431b(), this.f52733a);
        if (this.f52735b.mo73489a() != null) {
            aVar.mo73432c().put(this.f52735b.mo73489a(), new bi(this.f52735b, this.f52736c));
        }
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: b */
    public final Feature[] mo73393b(C21661c.C21662a<?> aVar) {
        return this.f52735b.mo73492c();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: c */
    public final boolean mo73394c(C21661c.C21662a<?> aVar) {
        return this.f52735b.mo73493d();
    }

    @Override // com.google.android.gms.common.api.internal.an, com.google.android.gms.common.api.internal.bx
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73358a(RuntimeException runtimeException) {
        super.mo73358a(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.an, com.google.android.gms.common.api.internal.bx
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73355a(Status status) {
        super.mo73355a(status);
    }
}
