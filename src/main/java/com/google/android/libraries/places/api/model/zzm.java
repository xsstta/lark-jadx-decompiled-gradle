package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours;
import java.util.List;
import java.util.Objects;

final class zzm extends OpeningHours.Builder {
    private List<Period> zza;
    private List<String> zzb;

    zzm() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" periods");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" weekdayText");
        }
        if (str2.isEmpty()) {
            return new zzal(this.zza, this.zzb);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        Objects.requireNonNull(list, "Null periods");
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        Objects.requireNonNull(list, "Null weekdayText");
        this.zzb = list;
        return this;
    }
}
