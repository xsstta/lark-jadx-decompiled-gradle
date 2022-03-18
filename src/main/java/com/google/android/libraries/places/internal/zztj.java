package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class zztj extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zztc zza;

    public void clear() {
        this.zza.clear();
    }

    public int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zztk(this.zza, null);
    }

    private zztj(zztc zztc) {
        this.zza = zztc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    /* synthetic */ zztj(zztc zztc, zztb zztb) {
        this(zztc);
    }
}
