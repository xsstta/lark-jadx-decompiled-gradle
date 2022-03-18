package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzay;

final class zzh extends zzay {
    private final /* synthetic */ GoogleMap.AbstractC21992t zzp;

    zzh(GoogleMap googleMap, GoogleMap.AbstractC21992t tVar) {
        this.zzp = tVar;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zza(IObjectWrapper iObjectWrapper) {
        this.zzp.mo74446a((Location) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
