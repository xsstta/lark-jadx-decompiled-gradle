package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzn extends FindCurrentPlaceRequest {
    private final List<Place.Field> zza;
    private final AbstractC22083a zzb;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzdc
    public final AbstractC22083a getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        AbstractC22083a aVar = this.zzb;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("FindCurrentPlaceRequest{placeFields=");
        sb.append(valueOf);
        sb.append(", cancellationToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        AbstractC22083a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (!this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) || ((aVar = this.zzb) != null ? !aVar.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private zzn(List<Place.Field> list, AbstractC22083a aVar) {
        this.zza = list;
        this.zzb = aVar;
    }
}
