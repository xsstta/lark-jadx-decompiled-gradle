package com.ss.android.eventbus;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int cacheSize;

    public LRUCache(int i) {
        super(16, 0.75f, true);
        this.cacheSize = i;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() >= this.cacheSize) {
            return true;
        }
        return false;
    }
}
