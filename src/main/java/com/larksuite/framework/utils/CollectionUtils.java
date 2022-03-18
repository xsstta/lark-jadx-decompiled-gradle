package com.larksuite.framework.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CollectionUtils {
    public static <T> List<T> asList(T[] tArr) {
        return asList(0, tArr);
    }

    public static <T> List<T> checkListNull(List<T> list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> getAscSortMapByValue(Map<K, V> map) {
        return getSortMap(new HashMap(map), new Comparator<Map.Entry<K, V>>() {
            /* class com.larksuite.framework.utils.CollectionUtils.C262351 */

            /* renamed from: a */
            public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
                return entry.getValue().compareTo(entry2.getValue());
            }
        });
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> getDescSortMapByValue(Map<K, V> map) {
        return getSortMap(new HashMap(map), new Comparator<Map.Entry<K, V>>() {
            /* class com.larksuite.framework.utils.CollectionUtils.C262362 */

            /* renamed from: a */
            public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
                return entry2.getValue().compareTo(entry.getValue());
            }
        });
    }

    public static boolean isEmpty(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static <T> List<T> iterableToList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static String generateAttributes(List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        if (list.size() == 1) {
            return "('" + list.get(0) + "')";
        }
        Iterator<String> it = list.iterator();
        String str = "(";
        while (it.hasNext()) {
            str = str + "'" + it.next() + "',";
        }
        return str.substring(0, str.length() - 1) + ")";
    }

    public static <T> void resetToList(List<? super T> list, List<? extends T> list2) {
        Objects.requireNonNull(list);
        list.clear();
        if (list2 != null) {
            list.addAll(list2);
        }
    }

    public static <T> List<T> asList(int i, T[] tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null) {
            while (i < tArr.length) {
                arrayList.add(tArr[i]);
                i++;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V extends Comparable<? super V>> Map<K, V> getSortMap(Map<K, V> map, Comparator<Map.Entry<K, V>> comparator) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(map == null || comparator == null)) {
            LinkedList<Map.Entry> linkedList = new LinkedList(map.entrySet());
            Collections.sort(linkedList, comparator);
            for (Map.Entry entry : linkedList) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static <T> boolean isListSame(List<T> list, List<T> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List[] split(List list, int i) {
        int i2;
        if (!isNotEmpty(list) || i <= 0) {
            return null;
        }
        int i3 = 0;
        if (list.size() % i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int size = (list.size() / i) + i2;
        ArrayList[] arrayListArr = new ArrayList[size];
        while (i3 < size) {
            int i4 = i * i3;
            int i5 = i3 + 1;
            int i6 = i * i5;
            if (i5 == size) {
                i6 = list.size();
            }
            arrayListArr[i3] = new ArrayList(list.subList(i4, i6));
            i3 = i5;
        }
        return arrayListArr;
    }
}
