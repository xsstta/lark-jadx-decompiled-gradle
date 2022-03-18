package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzhh;
import com.google.android.libraries.places.internal.zzhj;
import com.google.android.libraries.places.internal.zzmh;

public final class zzdq {
    public static zzhh.zza zza(zzmh.zzs zzs) {
        return (zzhh.zza) ((zzqy) zzhh.zza.zza().zza(zzhh.zza.zzb.PLACES).zza(zzs).zzf());
    }

    public static zzmh.zzs.zzb zza(zzdj zzdj) {
        zzmh.zzs.zze zze;
        int i = zzdp.zza[zzdj.zzc().ordinal()];
        if (i == 1) {
            zze = zzmh.zzs.zze.AUTOCOMPLETE_WIDGET;
        } else if (i != 2) {
            zze = zzmh.zzs.zze.UNKNOWN_SOURCE;
        } else {
            zze = zzmh.zzs.zze.PROGRAMMATIC_API;
        }
        return zzmh.zzs.zza().zza((zzhj.zza) ((zzqy) zzhj.zza.zza().zza(zzdj.zza()).zza(zzdj.zzb()).zzf())).zza(true).zza(zze).zzb("2.2.0");
    }
}
