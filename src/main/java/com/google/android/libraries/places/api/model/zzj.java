package com.google.android.libraries.places.api.model;

import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzj extends OpeningHours {
    private final List<Period> zza;
    private final List<String> zzb;

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<Period> getPeriods() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<String> getWeekdayText() {
        return this.zzb;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("OpeningHours{periods=");
        sb.append(valueOf);
        sb.append(", weekdayText=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            if (!this.zza.equals(openingHours.getPeriods()) || !this.zzb.equals(openingHours.getWeekdayText())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzj(List<Period> list, List<String> list2) {
        Objects.requireNonNull(list, "Null periods");
        this.zza = list;
        Objects.requireNonNull(list2, "Null weekdayText");
        this.zzb = list2;
    }
}
