package com.google.android.libraries.places.internal;

/* access modifiers changed from: package-private */
public final class zzgl<E> extends zzfy<E> {
    private final zzgi<E> zza;

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzfy
    public final E zza(int i) {
        return this.zza.get(i);
    }

    zzgl(zzgi<E> zzgi, int i) {
        super(zzgi.size(), i);
        this.zza = zzgi;
    }
}
