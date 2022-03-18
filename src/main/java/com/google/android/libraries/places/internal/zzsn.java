package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzsn<T> implements zzsx<T> {
    private final zzsk zza;
    private final zztp<?, ?> zzb;
    private final boolean zzc;
    private final zzqo<?> zzd;

    @Override // com.google.android.libraries.places.internal.zzsx
    public final void zzb(T t) {
        this.zzb.zzb(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final boolean zzc(T t) {
        return this.zzd.zza((Object) t).zzf();
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final int zza(T t) {
        int hashCode = this.zzb.zza(t).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zza((Object) t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final int zzd(T t) {
        zztp<?, ?> zztp = this.zzb;
        int zzc2 = zztp.zzc(zztp.zza(t)) + 0;
        if (this.zzc) {
            return zzc2 + this.zzd.zza((Object) t).zzg();
        }
        return zzc2;
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final void zzb(T t, T t2) {
        zzsz.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzsz.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final boolean zza(T t, T t2) {
        if (!this.zzb.zza(t).equals(this.zzb.zza(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t).equals(this.zzd.zza((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzsx
    public final void zza(T t, zzuj zzuj) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t).zzd();
        while (zzd2.hasNext()) {
            Map.Entry<?, Object> next = zzd2.next();
            zzqv zzqv = (zzqv) next.getKey();
            if (zzqv.zzc() != zzuk.MESSAGE || zzqv.zzd() || zzqv.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzrn) {
                zzuj.zza(zzqv.zza(), (Object) ((zzrn) next).zza().zzc());
            } else {
                zzuj.zza(zzqv.zza(), next.getValue());
            }
        }
        zztp<?, ?> zztp = this.zzb;
        zztp.zzb(zztp.zza(t), zzuj);
    }

    static <T> zzsn<T> zza(zztp<?, ?> zztp, zzqo<?> zzqo, zzsk zzsk) {
        return new zzsn<>(zztp, zzqo, zzsk);
    }

    private zzsn(zztp<?, ?> zztp, zzqo<?> zzqo, zzsk zzsk) {
        this.zzb = zztp;
        this.zzc = zzqo.zza(zzsk);
        this.zzd = zzqo;
        this.zza = zzsk;
    }
}
