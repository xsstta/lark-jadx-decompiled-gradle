package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C22090b;
import java.util.Objects;

final class zzei extends zzer {
    private final C22090b zza;
    private final String zzb;

    @Override // com.google.android.libraries.places.internal.zzet
    public final C22090b zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzer
    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(str).length());
        sb.append("AutocompleteRequest{source=");
        sb.append(valueOf);
        sb.append(", query=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzer) {
            zzer zzer = (zzer) obj;
            if (!this.zza.equals(zzer.zza()) || !this.zzb.equals(zzer.zzb())) {
                return false;
            }
            return true;
        }
        return false;
    }

    zzei(C22090b bVar, String str) {
        this.zza = bVar;
        Objects.requireNonNull(str, "Null query");
        this.zzb = str;
    }
}
