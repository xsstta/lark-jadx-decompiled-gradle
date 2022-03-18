package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzdc;

public abstract class FetchPhotoRequest implements zzdc {
    @Override // com.google.android.libraries.places.internal.zzdc
    public abstract AbstractC22083a getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();

    public static abstract class Builder {
        public abstract Builder setCancellationToken(AbstractC22083a aVar);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(PhotoMetadata photoMetadata);

        /* access modifiers changed from: package-private */
        public abstract Integer zza();

        /* access modifiers changed from: package-private */
        public abstract Integer zzb();

        /* access modifiers changed from: package-private */
        public abstract PhotoMetadata zzc();

        /* access modifiers changed from: package-private */
        public abstract FetchPhotoRequest zzd();

        public FetchPhotoRequest build() {
            PhotoMetadata zzc = zzc();
            if (zza() == null && zzb() == null && zzc != null) {
                int width = zzc.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = zzc.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzd();
        }
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        return new zzd().zza(photoMetadata);
    }

    public static FetchPhotoRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }
}
