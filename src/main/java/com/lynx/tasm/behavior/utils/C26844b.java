package com.lynx.tasm.behavior.utils;

import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.behavior.utils.b */
public class C26844b {

    /* renamed from: a */
    static HashMap<Class, HashMap<String, Method>> f66675a = new HashMap<>();

    /* renamed from: a */
    public static HashMap<String, Method> m97611a(Class<? extends LynxBaseUI> cls) {
        if (cls == null) {
            return null;
        }
        return m97612b(cls);
    }

    /* renamed from: b */
    private static HashMap<String, Method> m97612b(Class<?> cls) {
        if (f66675a.containsKey(cls)) {
            return f66675a.get(cls);
        }
        HashMap<String, Method> hashMap = new HashMap<>();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (((LynxUIMethod) method.getAnnotation(LynxUIMethod.class)) != null) {
                hashMap.put(method.getName(), method);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            hashMap.putAll(m97612b(superclass));
        }
        f66675a.put(cls, hashMap);
        return hashMap;
    }
}
