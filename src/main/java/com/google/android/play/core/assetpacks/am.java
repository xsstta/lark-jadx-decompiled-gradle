package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C22741m;

final class am extends al<ParcelFileDescriptor> {
    am(C22604n nVar, C22741m<ParcelFileDescriptor> mVar) {
        super(nVar, mVar);
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: b */
    public final void mo78745b(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo78745b(bundle, bundle2);
        this.f55681a.mo79092b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
