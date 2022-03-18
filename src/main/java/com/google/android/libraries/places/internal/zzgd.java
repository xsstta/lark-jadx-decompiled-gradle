package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public abstract class zzgd<C extends Comparable> implements Serializable, Comparable<zzgd<C>> {
    @NullableDecl
    final C zza;

    public abstract int hashCode();

    /* access modifiers changed from: package-private */
    public abstract void zza(StringBuilder sb);

    /* access modifiers changed from: package-private */
    public abstract boolean zza(C c);

    /* access modifiers changed from: package-private */
    public abstract void zzb(StringBuilder sb);

    zzgd(@NullableDecl C c) {
        this.zza = c;
    }

    static <C extends Comparable> zzgd<C> zzb(C c) {
        return new zzgh(c);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return zza((zzgd) ((zzgd) obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzgd) {
            try {
                if (zza((zzgd) ((zzgd) obj)) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public int zza(zzgd<C> zzgd) {
        if (zzgd == zzge.zzb) {
            return 1;
        }
        if (zzgd == zzgc.zzb) {
            return -1;
        }
        int zzc = zzgr.zzc(this.zza, zzgd.zza);
        if (zzc != 0) {
            return zzc;
        }
        boolean z = this instanceof zzgf;
        if (z == (zzgd instanceof zzgf)) {
            return 0;
        }
        if (z) {
            return 1;
        }
        return -1;
    }
}
