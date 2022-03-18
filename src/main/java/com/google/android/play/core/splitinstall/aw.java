package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C22741m;
import java.util.ArrayList;
import java.util.List;

final class aw extends ay<List<SplitInstallSessionState>> {
    aw(C22721s sVar, C22741m<List<SplitInstallSessionState>> mVar) {
        super(sVar, mVar);
    }

    @Override // com.google.android.play.core.splitinstall.ay, com.google.android.play.core.internal.br
    /* renamed from: a */
    public final void mo78901a(List<Bundle> list) throws RemoteException {
        super.mo78901a(list);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SplitInstallSessionState.m82545a(list.get(i)));
        }
        this.f56173a.mo79092b(arrayList);
    }
}
