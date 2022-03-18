package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    AbstractC0519f<K, V> mCollections;

    public ArrayMap() {
    }

    private AbstractC0519f<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new AbstractC0519f<K, V>() {
                /* class androidx.collection.ArrayMap.C05121 */

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: b */
                public Map<K, V> mo2906b() {
                    return ArrayMap.this;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public int mo2899a() {
                    return ArrayMap.this.mSize;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: c */
                public void mo2907c() {
                    ArrayMap.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: b */
                public int mo2905b(Object obj) {
                    return ArrayMap.this.indexOfValue(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public int mo2900a(Object obj) {
                    return ArrayMap.this.indexOfKey(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public void mo2903a(int i) {
                    ArrayMap.this.removeAt(i);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public Object mo2901a(int i, int i2) {
                    return ArrayMap.this.mArray[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public V mo2902a(int i, V v) {
                    return (V) ArrayMap.this.setValueAt(i, v);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.collection.AbstractC0519f
                /* renamed from: a */
                public void mo2904a(K k, V v) {
                    ArrayMap.this.put(k, v);
                }
            };
        }
        return this.mCollections;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().mo2985d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return getCollection().mo2986e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return getCollection().mo2987f();
    }

    public ArrayMap(int i) {
        super(i);
    }

    public boolean containsAll(Collection<?> collection) {
        return AbstractC0519f.m2356a((Map) this, collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return AbstractC0519f.m2358b(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return AbstractC0519f.m2359c(this, collection);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.collection.ArrayMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
