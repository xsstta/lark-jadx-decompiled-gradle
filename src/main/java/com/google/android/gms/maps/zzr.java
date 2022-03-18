package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbt;

final class zzr extends zzbt {
    private final /* synthetic */ GoogleMap.AbstractC21997y zzz;

    zzr(GoogleMap googleMap, GoogleMap.AbstractC21997y yVar) {
        this.zzz = yVar;
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void onSnapshotReady(Bitmap bitmap) throws RemoteException {
        this.zzz.mo74451a(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbs
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzz.mo74451a((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
