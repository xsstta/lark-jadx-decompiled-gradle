package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zztd extends zztj {
    private final /* synthetic */ zztc zza;

    @Override // com.google.android.libraries.places.internal.zztj, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzte(this.zza, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zztd(zztc zztc) {
        super(zztc, null);
        this.zza = zztc;
    }

    /* synthetic */ zztd(zztc zztc, zztb zztb) {
        this(zztc);
    }
}
