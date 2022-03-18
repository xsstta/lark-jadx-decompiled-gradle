package com.lynx.tasm.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class NullableConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public static final Object NULL = new Object();

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public Set<Map.Entry<K, V>> entrySet() {
        final Set<Map.Entry<K, V>> entrySet = super.entrySet();
        return new Set<Map.Entry<K, V>>() {
            /* class com.lynx.tasm.common.NullableConcurrentHashMap.C268691 */

            public void clear() {
                entrySet.clear();
            }

            public boolean isEmpty() {
                return entrySet.isEmpty();
            }

            public int size() {
                return entrySet.size();
            }

            @Override // java.util.Collection, java.util.Set, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                final Iterator it = entrySet.iterator();
                return new Iterator<Map.Entry<K, V>>() {
                    /* class com.lynx.tasm.common.NullableConcurrentHashMap.C268691.C268701 */

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    /* renamed from: a */
                    public Map.Entry<K, V> next() {
                        final Map.Entry entry = (Map.Entry) it.next();
                        return new Map.Entry<K, V>() {
                            /* class com.lynx.tasm.common.NullableConcurrentHashMap.C268691.C268701.C268711 */

                            @Override // java.util.Map.Entry
                            public K getKey() {
                                K k = (K) entry.getKey();
                                if (k == NullableConcurrentHashMap.NULL) {
                                    return null;
                                }
                                return k;
                            }

                            @Override // java.util.Map.Entry
                            public V getValue() {
                                V v = (V) entry.getValue();
                                if (v == NullableConcurrentHashMap.NULL) {
                                    return null;
                                }
                                return v;
                            }

                            @Override // java.util.Map.Entry
                            public V setValue(V v) {
                                Map.Entry entry = entry;
                                if (v == null) {
                                    v = (V) NullableConcurrentHashMap.NULL;
                                }
                                return (V) entry.setValue(v);
                            }
                        };
                    }
                };
            }

            public Object[] toArray() {
                Object[] array = entrySet.toArray();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == NullableConcurrentHashMap.NULL) {
                        array[i] = null;
                    }
                }
                return array;
            }

            /* renamed from: a */
            public boolean add(Map.Entry<K, V> entry) {
                return entrySet.add(entry);
            }

            @Override // java.util.Collection, java.util.Set
            public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
                return entrySet.addAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return entrySet.containsAll(collection);
            }

            public boolean remove(Object obj) {
                return entrySet.remove(obj);
            }

            @Override // java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return entrySet.retainAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return entrySet.retainAll(collection);
            }

            @Override // java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) entrySet.toArray(tArr);
            }

            public boolean contains(Object obj) {
                Set set = entrySet;
                if (obj == null) {
                    obj = NullableConcurrentHashMap.NULL;
                }
                return set.contains(obj);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public V get(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        V v = (V) super.get(obj);
        if (v == NULL) {
            return null;
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.lynx.tasm.common.NullableConcurrentHashMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public void putAll(Map<? extends K, ? extends V> map) {
        if (map != null) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentHashMap
    public V put(K k, V v) {
        if (k == null) {
            k = (K) NULL;
        }
        if (v == null) {
            v = (V) NULL;
        }
        V v2 = (V) super.put(k, v);
        if (v2 == NULL) {
            return null;
        }
        return v2;
    }
}
