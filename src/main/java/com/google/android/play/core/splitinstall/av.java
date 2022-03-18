package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C22741m;

final class av extends ay<SplitInstallSessionState> {
    av(C22721s sVar, C22741m<SplitInstallSessionState> mVar) {
        super(sVar, mVar);
    }

    @Override // com.google.android.play.core.splitinstall.ay, com.google.android.play.core.internal.br
    /* renamed from: b */
    public final void mo78903b(int i, Bundle bundle) throws RemoteException {
        super.mo78903b(i, bundle);
        this.f56173a.mo79092b(SplitInstallSessionState.m82545a(bundle));
    }
}
