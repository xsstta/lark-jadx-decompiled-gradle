package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: com.bumptech.glide.util.b */
public final class C2557b<K, V> extends ArrayMap<K, V> {

    /* renamed from: a */
    private int f8270a;

    @Override // androidx.collection.SimpleArrayMap
    public void clear() {
        this.f8270a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public int hashCode() {
        if (this.f8270a == 0) {
            this.f8270a = super.hashCode();
        }
        return this.f8270a;
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f8270a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i) {
        this.f8270a = 0;
        return (V) super.removeAt(i);
    }

    @Override // java.util.Map, androidx.collection.SimpleArrayMap
    public V put(K k, V v) {
        this.f8270a = 0;
        return (V) super.put(k, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i, V v) {
        this.f8270a = 0;
        return (V) super.setValueAt(i, v);
    }
}
