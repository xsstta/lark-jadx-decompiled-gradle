package com.bytedance.sysoptimizer;

import android.content.Context;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
import java.util.HashMap;

public class LayoutInflaterAsyncCrashOptimizer {
    private static boolean hasFixed;

    public static final class FixLayoutInflaterAsyncHashMap<K, V> extends HashMap<K, V> {
        public synchronized void clear() {
            super.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public synchronized V remove(Object obj) {
            return (V) super.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public synchronized V put(K k, V v) {
            return (V) super.put(k, v);
        }
    }

    public static synchronized void fix(Context context) {
        synchronized (LayoutInflaterAsyncCrashOptimizer.class) {
            if (!hasFixed) {
                hasFixed = true;
                try {
                    Field declaredField = LayoutInflater.class.getDeclaredField("sConstructorMap");
                    declaredField.setAccessible(true);
                    declaredField.set(null, new FixLayoutInflaterAsyncHashMap());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
