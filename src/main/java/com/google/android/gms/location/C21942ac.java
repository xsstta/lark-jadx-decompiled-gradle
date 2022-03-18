package com.google.android.gms.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC21677l;
import com.google.android.gms.internal.location.C21920h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.location.ac */
final class C21942ac extends AbstractC21677l<C21920h, Location> {
    C21942ac(FusedLocationProviderClient fusedLocationProviderClient) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.tasks.TaskCompletionSource] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC21677l
    /* renamed from: a */
    public final /* synthetic */ void mo72946a(C21920h hVar, TaskCompletionSource<Location> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(hVar.mo74035a());
    }
}
