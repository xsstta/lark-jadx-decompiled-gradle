package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Period;

/* access modifiers changed from: package-private */
public final class zzo extends Period.Builder {
    private TimeOfWeek zza;
    private TimeOfWeek zzb;

    zzo() {
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period build() {
        return new zzan(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setClose(TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Period.Builder
    public final Period.Builder setOpen(TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }
}
