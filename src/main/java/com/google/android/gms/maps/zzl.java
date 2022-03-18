package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.zzah;

final class zzl extends ILocationSourceDelegate.zza {
    private final /* synthetic */ AbstractC22008c zzt;

    zzl(GoogleMap googleMap, AbstractC22008c cVar) {
        this.zzt = cVar;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(zzah zzah) {
        this.zzt.mo74526a(new C22032m(this, zzah));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.zzt.mo74525a();
    }
}
