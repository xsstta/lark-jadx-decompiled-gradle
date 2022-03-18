package com.google.android.libraries.places.api.model;

import java.util.Objects;

/* access modifiers changed from: package-private */
public abstract class zzr extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public double getLikelihood() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public Place getPlace() {
        return this.zza;
    }

    public int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb)));
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        double d = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
        sb.append("PlaceLikelihood{place=");
        sb.append(valueOf);
        sb.append(", likelihood=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            if (!this.zza.equals(placeLikelihood.getPlace()) || Double.doubleToLongBits(this.zzb) != Double.doubleToLongBits(placeLikelihood.getLikelihood())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzr(Place place, double d) {
        Objects.requireNonNull(place, "Null place");
        this.zza = place;
        this.zzb = d;
    }
}
