package com.google.android.libraries.places.internal;

public final class zzf {
    private static zzf zza;
    private final zze zzb;

    public final zzg zzb() {
        return this.zzb.zza();
    }

    public static zzf zza() {
        boolean z;
        zzf zzf = zza;
        if (zzf == null || (zzf.zzb instanceof zzc)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            zza = new zzf(new zzc());
        }
        return zza;
    }

    private zzf(zze zze) {
        this.zzb = zze;
    }

    public final void zza(zzh zzh) {
        this.zzb.zza(zzh);
    }

    public final void zzb(zzh zzh) {
        this.zzb.zzb(zzh);
    }

    public final void zza(zzg zzg, zzh zzh) {
        this.zzb.zza(zzg, zzh);
    }
}
