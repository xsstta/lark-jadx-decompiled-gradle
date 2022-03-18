package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzs extends Place.Builder {
    private String zza;
    private AddressComponents zzb;
    private List<String> zzc;
    private String zzd;
    private LatLng zze;
    private String zzf;
    private OpeningHours zzg;
    private String zzh;
    private List<PhotoMetadata> zzi;
    private PlusCode zzj;
    private Integer zzk;
    private Double zzl;
    private List<Place.Type> zzm;
    private Integer zzn;
    private Integer zzo;
    private LatLngBounds zzp;
    private Uri zzq;

    zzs() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place zza() {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq);
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddress(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAddressComponents(AddressComponents addressComponents) {
        this.zzb = addressComponents;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setAttributions(List<String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setId(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setLatLng(LatLng latLng) {
        this.zze = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setName(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setOpeningHours(OpeningHours openingHours) {
        this.zzg = openingHours;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhoneNumber(String str) {
        this.zzh = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPhotoMetadatas(List<PhotoMetadata> list) {
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPlusCode(PlusCode plusCode) {
        this.zzj = plusCode;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setPriceLevel(Integer num) {
        this.zzk = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setRating(Double d) {
        this.zzl = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setTypes(List<Place.Type> list) {
        this.zzm = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUserRatingsTotal(Integer num) {
        this.zzn = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setUtcOffsetMinutes(Integer num) {
        this.zzo = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setViewport(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Place.Builder
    public final Place.Builder setWebsiteUri(Uri uri) {
        this.zzq = uri;
        return this;
    }
}
