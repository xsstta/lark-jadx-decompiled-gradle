package com.bytedance.common.utility.collection;

import java.util.ArrayList;
import java.util.List;

public final class ArrayUtils {
    public static List<Long> toList(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static long[] toLongArray(List<Long> list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = list.get(i).longValue();
        }
        return jArr;
    }
}
