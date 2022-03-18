package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class zzrq<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zza.next();
        if (next.getValue() instanceof zzrl) {
            return new zzrn(next);
        }
        return next;
    }

    public zzrq(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }
}
