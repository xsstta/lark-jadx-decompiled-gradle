package com.ss.android.socialbase.downloader.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, T> extends LinkedHashMap<K, T> {
    private int mMaxSize;

    public LruCache() {
        this(4, 4);
    }

    public void setMaxSize(int i) {
        this.mMaxSize = i;
    }

    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, T> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }

    public LruCache(int i, int i2) {
        super(i, 0.75f, true);
        setMaxSize(i2);
    }
}
