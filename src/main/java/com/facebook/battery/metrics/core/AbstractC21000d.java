package com.facebook.battery.metrics.core;

import android.util.SparseArray;
import androidx.collection.SimpleArrayMap;

/* renamed from: com.facebook.battery.metrics.core.d */
public abstract class AbstractC21000d {
    /* renamed from: a */
    public static void m76507a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static <V> boolean m76508a(SparseArray<V> sparseArray, SparseArray<V> sparseArray2) {
        if (sparseArray == sparseArray2) {
            return true;
        }
        if (sparseArray == null || sparseArray2 == null || sparseArray.size() != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (!sparseArray.get(keyAt).equals(sparseArray2.get(keyAt))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <K, V> boolean m76509a(SimpleArrayMap<K, V> simpleArrayMap, SimpleArrayMap<K, V> simpleArrayMap2) {
        if (simpleArrayMap == simpleArrayMap2) {
            return true;
        }
        int size = simpleArrayMap.size();
        if (size != simpleArrayMap2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            K keyAt = simpleArrayMap.keyAt(i);
            V valueAt = simpleArrayMap.valueAt(i);
            V v = simpleArrayMap2.get(keyAt);
            if (valueAt == null) {
                if (v != null || !simpleArrayMap2.containsKey(keyAt)) {
                    return false;
                }
            } else if (!valueAt.equals(v)) {
                return false;
            }
        }
        return true;
    }
}
