package com.google.android.libraries.places.api.model;

import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzx extends TimeOfWeek {
    private final DayOfWeek zza;
    private final LocalTime zzb;

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public DayOfWeek getDay() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public LocalTime getTime() {
        return this.zzb;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append("TimeOfWeek{day=");
        sb.append(valueOf);
        sb.append(", time=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            if (!this.zza.equals(timeOfWeek.getDay()) || !this.zzb.equals(timeOfWeek.getTime())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzx(DayOfWeek dayOfWeek, LocalTime localTime) {
        Objects.requireNonNull(dayOfWeek, "Null day");
        this.zza = dayOfWeek;
        Objects.requireNonNull(localTime, "Null time");
        this.zzb = localTime;
    }
}
