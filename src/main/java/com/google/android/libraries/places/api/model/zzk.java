package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.LocalTime;

final class zzk extends LocalTime.zza {
    private Integer zza;
    private Integer zzb;

    zzk() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.LocalTime.zza
    public final LocalTime zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" hours");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" minutes");
        }
        if (str2.isEmpty()) {
            return new zzaj(this.zza.intValue(), this.zzb.intValue());
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.LocalTime.zza
    public final LocalTime.zza zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.LocalTime.zza
    public final LocalTime.zza zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }
}
