package com.google.android.libraries.places.internal;

import android.content.Context;

public abstract class zzdj {

    public enum zzb {
        PROGRAMMATIC_API,
        AUTOCOMPLETE_WIDGET
    }

    public abstract String zza();

    public abstract int zzb();

    public abstract zzb zzc();

    public static abstract class zza {
        /* access modifiers changed from: package-private */
        public abstract zza zza(int i);

        public abstract zza zza(zzb zzb);

        /* access modifiers changed from: package-private */
        public abstract zza zza(String str);

        /* access modifiers changed from: package-private */
        public abstract zzdj zza();

        public final zzdj zzb() {
            zzdj zza = zza();
            zzft.zzb(!zza.zza().isEmpty(), "Package name must not be empty.");
            return zza;
        }
    }

    public static zza zza(Context context) {
        zzdd zzdd = new zzdd(context);
        return new zzdh().zza(zzdd.zza()).zza(zzdd.zzb()).zza(zzb.PROGRAMMATIC_API);
    }
}
