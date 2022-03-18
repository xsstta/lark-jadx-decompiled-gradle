package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzec;
import com.google.android.libraries.places.internal.zzed;
import com.google.android.libraries.places.internal.zzeg;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

public final class Autocomplete {
    private Autocomplete() {
    }

    public static class IntentBuilder {
        private final zzed.zza zza;

        public IntentBuilder setCountries(List<String> list) {
            this.zza.zzb(list);
            return this;
        }

        public IntentBuilder setCountry(String str) {
            this.zza.zzc(str);
            return this;
        }

        public IntentBuilder setHint(String str) {
            this.zza.zzb(str);
            return this;
        }

        public IntentBuilder setInitialQuery(String str) {
            this.zza.zza(str);
            return this;
        }

        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zza(locationBias);
            return this;
        }

        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zza(locationRestriction);
            return this;
        }

        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zza.zza(typeFilter);
            return this;
        }

        public final IntentBuilder zza(zzec zzec) {
            this.zza.zza(zzec);
            return this;
        }

        public IntentBuilder(zzed zzed) {
            this.zza = zzed.zzl();
        }

        public Intent build(Context context) {
            try {
                Intent intent = new Intent(context, AutocompleteActivity.class);
                zzed.zza zza2 = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(16843827, typedValue, true)) {
                    zza2.zza(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(16843828, typedValue2, true)) {
                    zza2.zzb(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", this.zza.zza());
                return intent;
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }

        public IntentBuilder(AutocompleteActivityMode autocompleteActivityMode, List<Place.Field> list) {
            this.zza = zzed.zza(autocompleteActivityMode, list, zzec.INTENT);
        }
    }

    public static Place getPlaceFromIntent(Intent intent) {
        return zzeg.zza(intent);
    }

    public static Status getStatusFromIntent(Intent intent) {
        return zzeg.zzb(intent);
    }
}
