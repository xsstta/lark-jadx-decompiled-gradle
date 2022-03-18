package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC21679n;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.internal.location.C21920h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.location.ae */
final class C21944ae extends AbstractC21679n<C21920h, C21947c> {

    /* renamed from: a */
    private final /* synthetic */ FusedLocationProviderClient f53430a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C21944ae(FusedLocationProviderClient fusedLocationProviderClient, C21668f.C21669a aVar) {
        super(aVar);
        this.f53430a = fusedLocationProviderClient;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.tasks.TaskCompletionSource] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC21679n
    /* renamed from: a */
    public final /* synthetic */ void mo73497a(C21920h hVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        try {
            hVar.mo74036a(mo73496a(), FusedLocationProviderClient.m79281a(this.f53430a, taskCompletionSource));
        } catch (RuntimeException e) {
            taskCompletionSource.trySetException(e);
        }
    }
}
