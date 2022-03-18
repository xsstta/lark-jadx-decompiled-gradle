package com.ss.android.eventbus.collector;

import android.util.Log;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.LRUCache;
import java.lang.reflect.Method;
import java.util.Map;

public class CollectorCompileImpl implements ICollector {
    private static final Map<String, Method> sClassName2RegisterMethodMap = new LRUCache(10);

    @Override // com.ss.android.eventbus.collector.ICollector
    public void unRegister(Object obj) {
        EventBus.getDefault().unregister(obj);
    }

    @Override // com.ss.android.eventbus.collector.ICollector
    public void register(Object obj) {
        if (obj != null) {
            for (Class<?> cls = obj.getClass(); cls != null; cls = getSuperclass(cls)) {
                registerInternal(obj, cls.getName());
            }
        }
    }

    private static Class<?> getSuperclass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        String name = superclass.getName();
        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
            return null;
        }
        return superclass;
    }

    private void registerInternal(Object obj, String str) {
        Method declaredMethod;
        if (obj != null && str != null) {
            Method method = sClassName2RegisterMethodMap.get(str);
            if (method != null) {
                try {
                    method.invoke(null, obj);
                    return;
                } catch (Exception e) {
                    Log.d("CollectorCompileImpl", "method invoke error : ", e);
                    e.printStackTrace();
                }
            }
            try {
                Class<?> loadClass = obj.getClass().getClassLoader().loadClass(str + "_Subscriber");
                if (loadClass != null && (declaredMethod = loadClass.getDeclaredMethod("register", Object.class)) != null) {
                    declaredMethod.invoke(null, obj);
                    sClassName2RegisterMethodMap.put(str, declaredMethod);
                }
            } catch (Throwable th) {
                Log.w("CollectorCompileImpl", "register find method error : ", th);
                th.printStackTrace();
            }
        }
    }
}
