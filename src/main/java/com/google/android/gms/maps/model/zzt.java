package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzag;

final class zzt extends zzag {
    private final /* synthetic */ AbstractC22048i zzen;

    zzt(TileOverlayOptions tileOverlayOptions, AbstractC22048i iVar) {
        this.zzen = iVar;
    }

    @Override // com.google.android.gms.internal.maps.zzaf
    public final Tile getTile(int i, int i2, int i3) {
        return this.zzen.mo74906a(i, i2, i3);
    }
}
