package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzgi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class FindAutocompletePredictionsRequest implements zzdc {
    @Override // com.google.android.libraries.places.internal.zzdc
    public abstract AbstractC22083a getCancellationToken();

    public abstract List<String> getCountries();

    public abstract LocationBias getLocationBias();

    public abstract LocationRestriction getLocationRestriction();

    public abstract LatLng getOrigin();

    public abstract String getQuery();

    public abstract AutocompleteSessionToken getSessionToken();

    public abstract TypeFilter getTypeFilter();

    public static abstract class Builder {
        public abstract Builder setCancellationToken(AbstractC22083a aVar);

        public abstract Builder setCountries(List<String> list);

        public abstract Builder setLocationBias(LocationBias locationBias);

        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        public abstract Builder setOrigin(LatLng latLng);

        public abstract Builder setQuery(String str);

        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        public abstract Builder setTypeFilter(TypeFilter typeFilter);

        /* access modifiers changed from: package-private */
        public abstract List<String> zza();

        /* access modifiers changed from: package-private */
        public abstract FindAutocompletePredictionsRequest zzb();

        public FindAutocompletePredictionsRequest build() {
            setCountries(zzgi.zza((Collection) zza()));
            return zzb();
        }

        public Builder setCountries(String... strArr) {
            return setCountries(zzgi.zza((Object[]) strArr));
        }

        public Builder setCountry(String str) {
            zzgi zzgi;
            if (str == null) {
                zzgi = zzgi.zza();
            } else {
                zzgi = zzgi.zza(str);
            }
            setCountries(zzgi);
            return this;
        }
    }

    public static Builder builder() {
        return new zzl().setCountries(new ArrayList());
    }

    public String getCountry() {
        T t;
        if (getCountries().size() <= 1) {
            Iterator<T> it = getCountries().iterator();
            if (it.hasNext()) {
                t = it.next();
            } else {
                t = null;
            }
            return t;
        }
        throw new UnsupportedOperationException("Multiple countries found in this request - use getCountries() instead of getCountry().");
    }

    public static FindAutocompletePredictionsRequest newInstance(String str) {
        return builder().setQuery(str).build();
    }
}
