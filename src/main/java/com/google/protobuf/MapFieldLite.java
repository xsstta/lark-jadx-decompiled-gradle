package com.google.protobuf;

import com.google.protobuf.C23115i;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite EMPTY_MAP_FIELD;
    private boolean isMutable = true;

    public void makeImmutable() {
        this.isMutable = false;
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return EMPTY_MAP_FIELD;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    private MapFieldLite() {
    }

    public void clear() {
        ensureMutable();
        clear();
    }

    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    static {
        MapFieldLite mapFieldLite = new MapFieldLite(Collections.emptyMap());
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public MapFieldLite<K, V> mutableCopy() {
        if (isEmpty()) {
            return new MapFieldLite<>();
        }
        return new MapFieldLite<>(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureMutable();
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private MapFieldLite(Map<K, V> map) {
        super(map);
    }

    private static Object copy(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !equals((Map) this, (Map) obj)) {
            return false;
        }
        return true;
    }

    public void mergeFrom(MapFieldLite<K, V> mapFieldLite) {
        ensureMutable();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    private static int calculateHashCodeForObject(Object obj) {
        if (obj instanceof byte[]) {
            return C23115i.m83809a((byte[]) obj);
        }
        if (!(obj instanceof C23115i.AbstractC23116a)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy((Object) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public V put(K k, V v) {
        ensureMutable();
        return (V) super.put(k, v);
    }

    private static boolean equals(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean equals(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = equals(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.equals(java.util.Map, java.util.Map):boolean");
    }
}
