package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.List;
import java.util.Objects;

final class zzl extends FindAutocompletePredictionsRequest.Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private LatLng zzd;
    private List<String> zze;
    private AutocompleteSessionToken zzf;
    private TypeFilter zzg;
    private AbstractC22083a zzh;

    zzl() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final List<String> zza() {
        List<String> list = this.zze;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest zzb() {
        String str;
        String str2 = "";
        if (this.zze == null) {
            str2 = str2.concat(" countries");
        }
        if (str2.isEmpty()) {
            return new zzj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCancellationToken(AbstractC22083a aVar) {
        this.zzh = aVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationBias(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setOrigin(LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setQuery(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest.Builder
    public final FindAutocompletePredictionsRequest.Builder setCountries(List<String> list) {
        Objects.requireNonNull(list, "Null countries");
        this.zze = list;
        return this;
    }
}
