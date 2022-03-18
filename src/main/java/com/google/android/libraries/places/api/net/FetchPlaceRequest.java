package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzgi;
import java.util.Collection;
import java.util.List;

public abstract class FetchPlaceRequest implements zzdc {
    @Override // com.google.android.libraries.places.internal.zzdc
    public abstract AbstractC22083a getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();

    public abstract String getPlaceId();

    public abstract AutocompleteSessionToken getSessionToken();

    public static abstract class Builder {
        public abstract Builder setCancellationToken(AbstractC22083a aVar);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(List<Place.Field> list);

        /* access modifiers changed from: package-private */
        public abstract FetchPlaceRequest zza();

        public FetchPlaceRequest build() {
            zza(zzgi.zza((Collection) zza().getPlaceFields()));
            return zza();
        }
    }

    public static Builder builder(String str, List<Place.Field> list) {
        return new zzh().zza(str).zza(list);
    }

    public static FetchPlaceRequest newInstance(String str, List<Place.Field> list) {
        return builder(str, list).build();
    }
}
