package com.google.android.libraries.places.internal;

public final class zzgc extends zzgd<Comparable<?>> {
    private static final zzgc zzb = new zzgc();

    public final String toString() {
        return "+∞";
    }

    @Override // com.google.android.libraries.places.internal.zzgd
    public final int zza(zzgd<Comparable<?>> zzgd) {
        return zzgd == this ? 0 : 1;
    }

    @Override // com.google.android.libraries.places.internal.zzgd
    public final boolean zza(Comparable<?> comparable) {
        return false;
    }

    private zzgc() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzgd
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // com.google.android.libraries.places.internal.zzgd, java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return zza((zzgd) obj);
    }

    @Override // com.google.android.libraries.places.internal.zzgd
    public final void zzb(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // com.google.android.libraries.places.internal.zzgd
    public final void zza(StringBuilder sb) {
        throw new AssertionError();
    }
}
