package com.ttnet.org.chromium.base;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class CollectionUtil {
    private CollectionUtil() {
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>(eArr.length);
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @SafeVarargs
    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static boolean[] booleanListToBooleanArray(List<Boolean> list) {
        boolean[] zArr = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            zArr[i] = list.get(i).booleanValue();
        }
        return zArr;
    }

    public static int[] integerListToIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static long[] longListToLongArray(List<Long> list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = list.get(i).longValue();
        }
        return jArr;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<E> iterable) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E e : iterable) {
            arrayList.add(e);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.HashMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    public static <K, V> HashMap<K, V> newHashMap(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> hashMap = (HashMap<K, V>) new HashMap();
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            hashMap.put(pair.first, pair.second);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ttnet.org.chromium.base.Callback<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void forEach(Collection<? extends T> collection, Callback<T> callback) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            callback.onResult(it.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ttnet.org.chromium.base.Callback<java.util.Map$Entry<K, V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void forEach(Map<? extends K, ? extends V> map, Callback<Map.Entry<K, V>> callback) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            callback.onResult(entry);
        }
    }
}
