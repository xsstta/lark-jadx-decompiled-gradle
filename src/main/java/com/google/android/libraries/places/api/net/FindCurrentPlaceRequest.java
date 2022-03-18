package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzgi;
import java.util.Collection;
import java.util.List;

public abstract class FindCurrentPlaceRequest implements zzdc {
    @Override // com.google.android.libraries.places.internal.zzdc
    public abstract AbstractC22083a getCancellationToken();

    public abstract List<Place.Field> getPlaceFields();

    public static abstract class Builder {
        public abstract Builder setCancellationToken(AbstractC22083a aVar);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(List<Place.Field> list);

        /* access modifiers changed from: package-private */
        public abstract FindCurrentPlaceRequest zza();

        public FindCurrentPlaceRequest build() {
            zza(zzgi.zza((Collection) zza().getPlaceFields()));
            return zza();
        }
    }

    public static Builder builder(List<Place.Field> list) {
        return new zzp().zza(list);
    }

    public static FindCurrentPlaceRequest newInstance(List<Place.Field> list) {
        return builder(list).build();
    }
}
