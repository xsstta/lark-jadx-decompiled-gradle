package com.google.android.libraries.places.internal;

import android.content.Context;

public final class zzdr {
    private final Context zza;

    public final zzgn<String, String> zza() {
        String packageName = this.zza.getPackageName();
        String zza2 = zzde.zza(this.zza.getPackageManager(), packageName);
        zzgm zzgm = new zzgm();
        if (packageName != null) {
            zzgm.zza("X-Android-Package", packageName);
        }
        if (zza2 != null) {
            zzgm.zza("X-Android-Cert", zza2);
        }
        return zzgm.zza();
    }

    public zzdr(Context context) {
        zzft.zza(context, "Context must not be null.");
        this.zza = context;
    }
}
