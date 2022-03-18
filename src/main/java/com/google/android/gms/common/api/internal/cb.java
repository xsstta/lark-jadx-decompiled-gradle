package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class cb extends bx<Boolean> {

    /* renamed from: b */
    private final C21668f.C21669a<?> f52778b;

    public cb(C21668f.C21669a<?> aVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f52778b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.an, com.google.android.gms.common.api.internal.bx
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73357a(C21681p pVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.bx
    /* renamed from: d */
    public final void mo73410d(C21661c.C21662a<?> aVar) throws RemoteException {
        bi remove = aVar.mo73432c().remove(this.f52778b);
        if (remove != null) {
            remove.f52706b.mo73497a(aVar.mo73431b(), this.f52733a);
            remove.f52705a.mo73491b();
            return;
        }
        this.f52733a.trySetResult(false);
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: b */
    public final Feature[] mo73393b(C21661c.C21662a<?> aVar) {
        bi biVar = aVar.mo73432c().get(this.f52778b);
        if (biVar == null) {
            return null;
        }
        return biVar.f52705a.mo73492c();
    }

    @Override // com.google.android.gms.common.api.internal.bj
    /* renamed from: c */
    public final boolean mo73394c(C21661c.C21662a<?> aVar) {
        bi biVar = aVar.mo73432c().get(this.f52778b);
        return biVar != null && biVar.f52705a.mo73493d();
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
