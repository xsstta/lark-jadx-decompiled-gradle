package com.ss.android.ugc.aweme.framework.services;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.aweme.framework.services.d */
public class C60457d {
    /* renamed from: a */
    public static <T> T m234894a(Class<?> cls) {
        if (cls == null || !cls.isInterface()) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.ss.android.ugc.aweme.framework.services.C60457d.C604581 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isPrimitive()) {
                    return C60454b.m234888a((Class) returnType);
                }
                return method.getDefaultValue();
            }
        });
    }
}
