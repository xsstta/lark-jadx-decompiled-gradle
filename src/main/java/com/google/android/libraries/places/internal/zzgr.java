package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzgr<C extends Comparable> extends zzgq implements Serializable {
    private static final zzgr<Comparable> zza = new zzgr<>(zzge.zza(), zzgc.zza());
    private final zzgd<C> zzb;
    private final zzgd<C> zzc;

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        return zzb((zzgd<?>) this.zzb, (zzgd<?>) this.zzc);
    }

    public static <C extends Comparable<?>> zzgr<C> zza(C c) {
        return zza(zzgd.zzb(c), (zzgd) zzgc.zza());
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzgr) {
            zzgr zzgr = (zzgr) obj;
            if (!this.zzb.equals(zzgr.zzb) || !this.zzc.equals(zzgr.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean zzb(C c) {
        zzft.zza(c);
        if (!this.zzb.zza(c) || this.zzc.zza(c)) {
            return false;
        }
        return true;
    }

    private static <C extends Comparable<?>> zzgr<C> zza(zzgd<C> zzgd, zzgd<C> zzgd2) {
        return new zzgr<>(zzgd, zzgd2);
    }

    static int zzc(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> zzgr<C> zzb(C c, C c2) {
        return zza(zzgd.zzb(c), zzgd.zzb(c2));
    }

    public static <C extends Comparable<?>> zzgr<C> zza(C c, C c2) {
        return zza(zzgd.zzb(c), (zzgd) new zzgf(c2));
    }

    private static String zzb(zzgd<?> zzgd, zzgd<?> zzgd2) {
        StringBuilder sb = new StringBuilder(16);
        zzgd.zza(sb);
        sb.append("..");
        zzgd2.zzb(sb);
        return sb.toString();
    }

    private zzgr(zzgd<C> zzgd, zzgd<C> zzgd2) {
        String str;
        this.zzb = (zzgd) zzft.zza(zzgd);
        this.zzc = (zzgd) zzft.zza(zzgd2);
        if (zzgd.zza((zzgd) zzgd2) > 0 || zzgd == zzgc.zza() || zzgd2 == zzge.zza()) {
            String valueOf = String.valueOf(zzb((zzgd<?>) zzgd, (zzgd<?>) zzgd2));
            if (valueOf.length() != 0) {
                str = "Invalid range: ".concat(valueOf);
            } else {
                str = new String("Invalid range: ");
            }
            throw new IllegalArgumentException(str);
        }
    }
}
