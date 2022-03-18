package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzft;

public abstract class PhotoMetadata implements Parcelable {
    public abstract String getAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract String zza();

    public static abstract class Builder {
        public abstract Builder setAttributions(String str);

        public abstract Builder setHeight(int i);

        public abstract Builder setWidth(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(String str);

        /* access modifiers changed from: package-private */
        public abstract PhotoMetadata zza();

        public PhotoMetadata build() {
            boolean z;
            PhotoMetadata zza = zza();
            int width = zza.getWidth();
            boolean z2 = false;
            if (width >= 0) {
                z = true;
            } else {
                z = false;
            }
            zzft.zza(z, "Width must not be < 0, but was: %s.", width);
            int height = zza.getHeight();
            if (height >= 0) {
                z2 = true;
            }
            zzft.zza(z2, "Height must not be < 0, but was: %s.", height);
            zzft.zzb(!TextUtils.isEmpty(zza.zza()), "PhotoReference must not be null or empty.");
            return zza;
        }
    }

    public static Builder builder(String str) {
        return new zzq().zza(str).setWidth(0).setHeight(0).setAttributions("");
    }
}
