package com.google.android.libraries.places.internal;

import java.util.Map;

final class zzrn<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzrl> zza;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    public final zzrl zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzrl.zza();
    }

    private zzrn(Map.Entry<K, zzrl> entry) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzsk) {
            return this.zza.getValue().zza((zzsk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
