package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;

final class zaf extends zaa {
    private final C21655b.AbstractC21657b<Status> mResultHolder;

    public zaf(C21655b.AbstractC21657b<Status> bVar) {
        this.mResultHolder = bVar;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zaj
    public final void zaj(int i) throws RemoteException {
        this.mResultHolder.mo73385a(new Status(i));
    }
}
