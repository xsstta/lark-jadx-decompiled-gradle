package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

final class zzj extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final LatLng zzd;
    private final List<String> zze;
    private final AutocompleteSessionToken zzf;
    private final TypeFilter zzg;
    private final AbstractC22083a zzh;

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzdc
    public final AbstractC22083a getCancellationToken() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.zza;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i ^ 1000003) * 1000003;
        LocationBias locationBias = this.zzb;
        if (locationBias == null) {
            i2 = 0;
        } else {
            i2 = locationBias.hashCode();
        }
        int i9 = (i8 ^ i2) * 1000003;
        LocationRestriction locationRestriction = this.zzc;
        if (locationRestriction == null) {
            i3 = 0;
        } else {
            i3 = locationRestriction.hashCode();
        }
        int i10 = (i9 ^ i3) * 1000003;
        LatLng latLng = this.zzd;
        if (latLng == null) {
            i4 = 0;
        } else {
            i4 = latLng.hashCode();
        }
        int hashCode = (((i10 ^ i4) * 1000003) ^ this.zze.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        if (autocompleteSessionToken == null) {
            i5 = 0;
        } else {
            i5 = autocompleteSessionToken.hashCode();
        }
        int i11 = (hashCode ^ i5) * 1000003;
        TypeFilter typeFilter = this.zzg;
        if (typeFilter == null) {
            i6 = 0;
        } else {
            i6 = typeFilter.hashCode();
        }
        int i12 = (i11 ^ i6) * 1000003;
        AbstractC22083a aVar = this.zzh;
        if (aVar != null) {
            i7 = aVar.hashCode();
        }
        return i12 ^ i7;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        String valueOf5 = String.valueOf(this.zzf);
        String valueOf6 = String.valueOf(this.zzg);
        String valueOf7 = String.valueOf(this.zzh);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 148 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("FindAutocompletePredictionsRequest{query=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(valueOf);
        sb.append(", locationRestriction=");
        sb.append(valueOf2);
        sb.append(", origin=");
        sb.append(valueOf3);
        sb.append(", countries=");
        sb.append(valueOf4);
        sb.append(", sessionToken=");
        sb.append(valueOf5);
        sb.append(", typeFilter=");
        sb.append(valueOf6);
        sb.append(", cancellationToken=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        TypeFilter typeFilter;
        AbstractC22083a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsRequest) {
            FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
            String str = this.zza;
            if (str != null ? str.equals(findAutocompletePredictionsRequest.getQuery()) : findAutocompletePredictionsRequest.getQuery() == null) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(findAutocompletePredictionsRequest.getLocationBias()) : findAutocompletePredictionsRequest.getLocationBias() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction()) : findAutocompletePredictionsRequest.getLocationRestriction() == null) {
                        LatLng latLng = this.zzd;
                        if (latLng != null ? latLng.equals(findAutocompletePredictionsRequest.getOrigin()) : findAutocompletePredictionsRequest.getOrigin() == null) {
                            if (!this.zze.equals(findAutocompletePredictionsRequest.getCountries()) || ((autocompleteSessionToken = this.zzf) != null ? !autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken()) : findAutocompletePredictionsRequest.getSessionToken() != null) || ((typeFilter = this.zzg) != null ? !typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter()) : findAutocompletePredictionsRequest.getTypeFilter() != null) || ((aVar = this.zzh) != null ? !aVar.equals(findAutocompletePredictionsRequest.getCancellationToken()) : findAutocompletePredictionsRequest.getCancellationToken() != null)) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private zzj(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List<String> list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, AbstractC22083a aVar) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = aVar;
    }
}
