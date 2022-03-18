package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class zzsw {
    private static final zzsw zza = new zzsw();
    private final zzta zzb = new zzrx();
    private final ConcurrentMap<Class<?>, zzsx<?>> zzc = new ConcurrentHashMap();

    public static zzsw zza() {
        return zza;
    }

    private zzsw() {
    }

    public final <T> zzsx<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    public final <T> zzsx<T> zza(Class<T> cls) {
        zzrc.zza((Object) cls, "messageType");
        zzsx<T> zzsx = (zzsx<T>) this.zzc.get(cls);
        if (zzsx != null) {
            return zzsx;
        }
        zzsx<T> zza2 = this.zzb.zza(cls);
        zzrc.zza((Object) cls, "messageType");
        zzrc.zza((Object) zza2, "schema");
        zzsx<T> zzsx2 = (zzsx<T>) this.zzc.putIfAbsent(cls, zza2);
        return zzsx2 != null ? zzsx2 : zza2;
    }
}
