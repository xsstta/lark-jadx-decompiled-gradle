package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzte implements Iterator<Map.Entry<K, V>> {
    private int zza;
    private Iterator<Map.Entry<K, V>> zzb;
    private final /* synthetic */ zztc zzc;

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        int i = this.zza;
        if ((i <= 0 || i > this.zzc.zzb.size()) && !zza().hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        List list = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (Map.Entry) list.get(i);
    }

    private zzte(zztc zztc) {
        this.zzc = zztc;
        this.zza = zztc.zzb.size();
    }

    /* synthetic */ zzte(zztc zztc, zztb zztb) {
        this(zztc);
    }
}
