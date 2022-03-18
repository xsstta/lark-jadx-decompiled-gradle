package com.google.android.gms.maps;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.model.C22045f;

final class zzg extends zzi {
    private final /* synthetic */ GoogleMap.AbstractC21974b zzo;

    zzg(GoogleMap googleMap, GoogleMap.AbstractC21974b bVar) {
        this.zzo = bVar;
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final IObjectWrapper zzh(zzt zzt) {
        return ObjectWrapper.wrap(this.zzo.mo74424a(new C22045f(zzt)));
    }

    @Override // com.google.android.gms.maps.internal.zzh
    public final IObjectWrapper zzi(zzt zzt) {
        return ObjectWrapper.wrap(this.zzo.mo74425b(new C22045f(zzt)));
    }
}
