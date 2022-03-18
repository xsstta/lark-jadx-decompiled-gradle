package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.api.model.PhotoMetadata;

final class zzb extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final AbstractC22083a zzd;

    @Override // com.google.android.libraries.places.internal.zzdc, com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final AbstractC22083a getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        int i;
        int i2;
        Integer num = this.zza;
        int i3 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        Integer num2 = this.zzb;
        if (num2 == null) {
            i2 = 0;
        } else {
            i2 = num2.hashCode();
        }
        int hashCode = (((i4 ^ i2) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        AbstractC22083a aVar = this.zzd;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FetchPhotoRequest{maxWidth=");
        sb.append(valueOf);
        sb.append(", maxHeight=");
        sb.append(valueOf2);
        sb.append(", photoMetadata=");
        sb.append(valueOf3);
        sb.append(", cancellationToken=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        AbstractC22083a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (!this.zzc.equals(fetchPhotoRequest.getPhotoMetadata()) || ((aVar = this.zzd) != null ? !aVar.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() != null)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private zzb(Integer num, Integer num2, PhotoMetadata photoMetadata, AbstractC22083a aVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = aVar;
    }
}
