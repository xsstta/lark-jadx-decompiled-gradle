package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C22090b;
import java.util.Objects;

final class zzel extends zzeq {
    private final C22090b zza;
    private final String zzb;

    @Override // com.google.android.libraries.places.internal.zzet
    public final C22090b zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzeq
    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(str).length());
        sb.append("PlaceRequest{source=");
        sb.append(valueOf);
        sb.append(", placeId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeq) {
            zzeq zzeq = (zzeq) obj;
            if (!this.zza.equals(zzeq.zza()) || !this.zzb.equals(zzeq.zzb())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzel(C22090b bVar, String str) {
        this.zza = bVar;
        Objects.requireNonNull(str, "Null placeId");
        this.zzb = str;
    }
}
