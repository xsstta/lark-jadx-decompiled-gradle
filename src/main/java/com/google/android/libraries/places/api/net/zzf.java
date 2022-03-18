package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzf extends FetchPlaceRequest {
    private final String zza;
    private final List<Place.Field> zzb;
    private final AutocompleteSessionToken zzc;
    private final AbstractC22083a zzd;

    @Override // com.google.android.libraries.places.internal.zzdc, com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final AbstractC22083a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int i2 = 0;
        if (autocompleteSessionToken == null) {
            i = 0;
        } else {
            i = autocompleteSessionToken.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        AbstractC22083a aVar = this.zzd;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 76 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FetchPlaceRequest{placeId=");
        sb.append(str);
        sb.append(", placeFields=");
        sb.append(valueOf);
        sb.append(", sessionToken=");
        sb.append(valueOf2);
        sb.append(", cancellationToken=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        AbstractC22083a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceRequest) {
            FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
            if (!this.zza.equals(fetchPlaceRequest.getPlaceId()) || !this.zzb.equals(fetchPlaceRequest.getPlaceFields()) || ((autocompleteSessionToken = this.zzc) != null ? !autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken()) : fetchPlaceRequest.getSessionToken() != null) || ((aVar = this.zzd) != null ? !aVar.equals(fetchPlaceRequest.getCancellationToken()) : fetchPlaceRequest.getCancellationToken() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private zzf(String str, List<Place.Field> list, AutocompleteSessionToken autocompleteSessionToken, AbstractC22083a aVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = aVar;
    }
}
