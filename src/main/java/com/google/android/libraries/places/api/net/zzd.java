package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.Objects;

final class zzd extends FetchPhotoRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private AbstractC22083a zzd;

    zzd() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final Integer zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final Integer zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final PhotoMetadata zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest zzd() {
        String str;
        String str2 = "";
        if (this.zzc == null) {
            str2 = str2.concat(" photoMetadata");
        }
        if (str2.isEmpty()) {
            return new zzb(this.zza, this.zzb, this.zzc, this.zzd);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Missing required properties:".concat(valueOf);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setCancellationToken(AbstractC22083a aVar) {
        this.zzd = aVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder
    public final FetchPhotoRequest.Builder zza(PhotoMetadata photoMetadata) {
        Objects.requireNonNull(photoMetadata, "Null photoMetadata");
        this.zzc = photoMetadata;
        return this;
    }
}
