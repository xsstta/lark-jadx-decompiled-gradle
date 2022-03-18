package com.google.android.libraries.places.internal;

import java.lang.Comparable;

/* access modifiers changed from: package-private */
public final class zzgf<C extends Comparable> extends zzgd<C> {
    @Override // com.google.android.libraries.places.internal.zzgd
    public final int hashCode() {
        return ~this.zza.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("/");
        sb.append(valueOf);
        sb.append("\\");
        return sb.toString();
    }

    zzgf(C c) {
        super((Comparable) zzft.zza(c));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgd
    public final void zza(StringBuilder sb) {
        sb.append('(');
        sb.append(this.zza);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgd
    public final void zzb(StringBuilder sb) {
        sb.append(this.zza);
        sb.append(']');
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzgd
    public final boolean zza(C c) {
        if (zzgr.zzc(this.zza, c) < 0) {
            return true;
        }
        return false;
    }
}
