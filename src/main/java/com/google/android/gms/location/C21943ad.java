package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC21673h;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.internal.location.C21920h;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.location.ad */
final class C21943ad extends AbstractC21673h<C21920h, C21947c> {

    /* renamed from: a */
    private final /* synthetic */ zzbd f53428a;

    /* renamed from: b */
    private final /* synthetic */ C21668f f53429b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C21943ad(FusedLocationProviderClient fusedLocationProviderClient, C21668f fVar, zzbd zzbd, C21668f fVar2) {
        super(fVar);
        this.f53428a = zzbd;
        this.f53429b = fVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.tasks.TaskCompletionSource] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC21673h
    /* renamed from: a */
    public final /* synthetic */ void mo73490a(C21920h hVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        hVar.mo74037a(this.f53428a, this.f53429b, new FusedLocationProviderClient.zza(taskCompletionSource));
    }
}
