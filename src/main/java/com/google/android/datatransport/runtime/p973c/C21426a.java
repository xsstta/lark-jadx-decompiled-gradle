package com.google.android.datatransport.runtime.p973c;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.EnumMap;

/* renamed from: com.google.android.datatransport.runtime.c.a */
public final class C21426a {

    /* renamed from: a */
    private static SparseArray<Priority> f52030a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<Priority, Integer> f52031b;

    static {
        EnumMap<Priority, Integer> enumMap = new EnumMap<>(Priority.class);
        f52031b = enumMap;
        enumMap.put(Priority.DEFAULT, (Integer) 0);
        f52031b.put(Priority.VERY_LOW, (Integer) 1);
        f52031b.put(Priority.HIGHEST, (Integer) 2);
        for (Priority priority : f52031b.keySet()) {
            f52030a.append(f52031b.get(priority).intValue(), priority);
        }
    }

    /* renamed from: a */
    public static int m77512a(Priority priority) {
        Integer num = f52031b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    /* renamed from: a */
    public static Priority m77513a(int i) {
        Priority priority = f52030a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
