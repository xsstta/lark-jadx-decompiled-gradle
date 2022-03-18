package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class zzga<T> extends zzgo<T> implements Serializable {
    private final Comparator<T> zza;

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    zzga(Comparator<T> comparator) {
        this.zza = (Comparator) zzft.zza(comparator);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzga) {
            return this.zza.equals(((zzga) obj).zza);
        }
        return false;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.zza.compare(t, t2);
    }
}
