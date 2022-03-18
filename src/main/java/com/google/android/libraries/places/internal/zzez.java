package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzmh;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public final class zzez implements zzfa {
    private final zzdn zza;
    private final zzdj zzb;

    @Override // com.google.android.libraries.places.internal.zzfa
    public final void zza(zzey zzey) {
        zzmh.zzp.zzb zzh = zzmh.zzp.zza().zza(zzey.zzd()).zzb(zzey.zze()).zzc(zzey.zzf()).zza(zzey.zzg()).zzb(zzey.zzh()).zzc(zzey.zzi()).zzd(zzey.zzj()).zze(zzey.zzk().length()).zzf(zzey.zzl()).zzg(zzey.zzm()).zzd(zzey.zzn()).zzh(zzey.zzo());
        if (zzey.zza() == zzec.FRAGMENT) {
            zzh.zza(zzmh.zzp.zzd.ANDROID_AUTOCOMPLETE_FRAGMENT);
        } else if (zzey.zza() == zzec.INTENT) {
            zzh.zza(zzmh.zzp.zzd.ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER);
        } else {
            zzh.zza(zzmh.zzp.zzd.UNKNOWN_ORIGIN);
        }
        if (zzey.zzb() == AutocompleteActivityMode.FULLSCREEN) {
            zzh.zza(zzmh.zzp.zza.FULLSCREEN);
        } else if (zzey.zzb() == AutocompleteActivityMode.OVERLAY) {
            zzh.zza(zzmh.zzp.zza.OVERLAY);
        }
        this.zza.zza(zzdq.zza((zzmh.zzs) ((zzqy) zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.AUTOCOMPLETE_WIDGET_SESSION).zza((zzmh.zzp) ((zzqy) zzh.zzf())).zzf())));
    }

    public zzez(zzdn zzdn, zzdj zzdj) {
        this.zza = zzdn;
        this.zzb = zzdj;
    }
}
