package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzft;
import com.google.android.libraries.places.internal.zzgi;
import java.util.Collection;
import java.util.List;

public abstract class AddressComponent implements Parcelable {
    public abstract String getName();

    public abstract String getShortName();

    public abstract List<String> getTypes();

    public static abstract class Builder {
        public abstract Builder setShortName(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(List<String> list);

        /* access modifiers changed from: package-private */
        public abstract AddressComponent zza();

        public AddressComponent build() {
            AddressComponent zza = zza();
            zzft.zzb(!zza.getName().isEmpty(), "Name must not be empty.");
            List<String> types = zza.getTypes();
            for (String str : types) {
                zzft.zzb(!TextUtils.isEmpty(str), "Types must not contain null or empty values.");
            }
            zza(zzgi.zza((Collection) types));
            return zza();
        }
    }

    public static Builder builder(String str, List<String> list) {
        return new zzc().zza(str).zza(list);
    }
}
