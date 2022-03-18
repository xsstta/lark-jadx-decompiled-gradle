package com.bytedance.common.utility.collection;

import com.bytedance.common.utility.reflect.JavaCalls;
import java.util.Collection;

public class CollectionUtils {
    public static void clear(Object obj) {
        JavaCalls.callMethod(obj, "clear", new Object[0]);
    }

    public static <T> boolean isEmpty(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
