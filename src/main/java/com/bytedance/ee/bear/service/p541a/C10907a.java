package com.bytedance.ee.bear.service.p541a;

import com.bytedance.ee.log.C13479a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.service.a.a */
public class C10907a {
    /* renamed from: a */
    public AbstractC10909b mo41482a(Class<AbstractC10909b> cls, AbstractC10909b bVar) {
        if (bVar != null) {
            return bVar;
        }
        C13479a.m54758a("LocalProxyFactory", "proxy: we have not register service, so we used a empty one!, service = " + cls);
        return (AbstractC10909b) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C10908a());
    }

    /* renamed from: com.bytedance.ee.bear.service.a.a$a */
    public static class C10908a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C13479a.m54758a("LocalProxyFactory", "invoke: in empty method = " + method + "args = " + Arrays.toString(objArr));
            Class<?> returnType = method.getReturnType();
            if (Boolean.class.isAssignableFrom(returnType)) {
                return false;
            }
            if (Long.class.isAssignableFrom(returnType) || Integer.class.isAssignableFrom(returnType) || Short.class.isAssignableFrom(returnType)) {
                return 0;
            }
            return null;
        }
    }
}
