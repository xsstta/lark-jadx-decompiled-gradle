package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.List;
import java.util.Objects;

final class zzp extends FindCurrentPlaceRequest.Builder {
    private List<Place.Field> zza;
    private AbstractC22083a zzb;

    zzp() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest zza() {
        String str;
        String str2 = "";
        if (this.zza == null) {
            str2 = str2.concat(" placeFields");
        }
        if (str2.isEmpty()) {
            return new zzn(this.zza, this.zzb);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(AbstractC22083a aVar) {
        this.zzb = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder zza(List<Place.Field> list) {
        Objects.requireNonNull(list, "Null placeFields");
        this.zza = list;
        return this;
    }
}
