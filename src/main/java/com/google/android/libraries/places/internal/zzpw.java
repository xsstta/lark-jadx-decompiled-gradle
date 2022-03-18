package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class zzpw extends zzpy {
    private int zza;
    private final int zzb;
    private final /* synthetic */ zzpx zzc;

    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzqc
    public final byte zza() {
        int i = this.zza;
        if (i < this.zzb) {
            this.zza = i + 1;
            return this.zzc.zzb(i);
        }
        throw new NoSuchElementException();
    }

    zzpw(zzpx zzpx) {
        this.zzc = zzpx;
        this.zzb = zzpx.zza();
    }
}
