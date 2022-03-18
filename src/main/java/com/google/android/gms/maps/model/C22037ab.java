package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.maps.model.ab */
public final class C22037ab implements AbstractC22048i {

    /* renamed from: b */
    private final zzaf f53657b;

    /* renamed from: c */
    private final /* synthetic */ TileOverlayOptions f53658c;

    C22037ab(TileOverlayOptions tileOverlayOptions) {
        this.f53658c = tileOverlayOptions;
        this.f53657b = tileOverlayOptions.f53645a;
    }

    @Override // com.google.android.gms.maps.model.AbstractC22048i
    /* renamed from: a */
    public final Tile mo74906a(int i, int i2, int i3) {
        try {
            return this.f53657b.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
