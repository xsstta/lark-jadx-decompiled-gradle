package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import java.util.List;
import java.util.Objects;

final class zzo extends FindCurrentPlaceResponse {
    private final List<PlaceLikelihood> zza;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
    public final List<PlaceLikelihood> getPlaceLikelihoods() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("FindCurrentPlaceResponse{placeLikelihoods=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    zzo(List<PlaceLikelihood> list) {
        Objects.requireNonNull(list, "Null placeLikelihoods");
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceResponse) {
            return this.zza.equals(((FindCurrentPlaceResponse) obj).getPlaceLikelihoods());
        }
        return false;
    }
}
