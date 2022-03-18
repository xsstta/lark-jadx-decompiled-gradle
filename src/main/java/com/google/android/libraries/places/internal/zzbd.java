package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

public final class zzbd implements zzan<zzbb> {
    private Bitmap zza;

    /* Return type fixed from 'com.google.android.libraries.places.internal.zzam' to match base method */
    @Override // com.google.android.libraries.places.internal.zzan
    public final /* synthetic */ zzbb zza() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        zzft.zzb(z, "Photo must be set to non-null value.");
        return new zzbb(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzan
    public final zzan<zzbb> zza(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}
