package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

final class zzdm extends LinkedHashMap<Long, Integer> {
    /* access modifiers changed from: protected */
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, Integer> entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }

    zzdm(int i, float f, boolean z) {
        super(16, 0.75f, true);
    }
}
