package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;
import java.util.Objects;

final class zzc extends FetchPhotoResponse {
    private final Bitmap zza;

    @Override // com.google.android.libraries.places.api.net.FetchPhotoResponse
    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("FetchPhotoResponse{bitmap=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    zzc(Bitmap bitmap) {
        Objects.requireNonNull(bitmap, "Null bitmap");
        this.zza = bitmap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoResponse) {
            return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
        }
        return false;
    }
}
