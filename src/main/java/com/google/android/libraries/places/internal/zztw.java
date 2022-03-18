package com.google.android.libraries.places.internal;

import java.util.Iterator;

final class zztw implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zztu zzb;

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    zztw(zztu zztu) {
        this.zzb = zztu;
        this.zza = zztu.zza.iterator();
    }
}
