package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.List;
import java.util.Objects;

final class zzh extends FetchPlaceRequest.Builder {
    private String zza;
    private List<Place.Field> zzb;
    private AutocompleteSessionToken zzc;
    private AbstractC22083a zzd;

    zzh() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" placeId");
        }
        if (this.zzb == null) {
            str2 = String.valueOf(str2).concat(" placeFields");
        }
        if (str2.isEmpty()) {
            return new zzf(this.zza, this.zzb, this.zzc, this.zzd);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setCancellationToken(AbstractC22083a aVar) {
        this.zzd = aVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder zza(String str) {
        Objects.requireNonNull(str, "Null placeId");
        this.zza = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder zza(List<Place.Field> list) {
        Objects.requireNonNull(list, "Null placeFields");
        this.zzb = list;
        return this;
    }
}
