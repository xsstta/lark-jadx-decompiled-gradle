package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.base.Result;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.service.remote.c */
public class C10954c {

    /* renamed from: a */
    public TokenManager f29450a;

    /* renamed from: b */
    public final Map<Class<?>, AbstractC10952a<?>> f29451b = new HashMap();

    /* renamed from: c */
    private final HashMap<Class<Object>, Object> f29452c = new HashMap<>();

    /* renamed from: a */
    public AbstractC68307f<Object> mo41588a(final Class<Object> cls) {
        return this.f29450a.mo41584b(cls).mo238020d(new Function<IBinder, Object>() {
            /* class com.bytedance.ee.bear.service.remote.C10954c.C109551 */

            /* renamed from: a */
            public Object apply(IBinder iBinder) throws Exception {
                if (iBinder != null) {
                    return C10954c.this.f29451b.get(cls).mo16349b(iBinder);
                }
                return null;
            }
        });
    }

    public C10954c(TokenManager tokenManager) {
        this.f29450a = tokenManager;
    }

    /* renamed from: com.bytedance.ee.bear.service.remote.c$a */
    private class C10956a implements InvocationHandler {

        /* renamed from: b */
        private Class<?> f29456b;

        /* renamed from: a */
        private Object m45486a(Class<?> cls) {
            IBinder iBinder;
            RemoteException e;
            long currentTimeMillis = System.currentTimeMillis();
            IBinder iBinder2 = null;
            try {
                iBinder = C10954c.this.f29450a.mo41579a(cls);
                if (iBinder == null) {
                    try {
                        C13479a.m54775e("RemoteProxyFactory", "binder is null for " + cls);
                        C10906a.m45376a(C10929e.m45432a(), "101", cls.getName(), System.currentTimeMillis() - currentTimeMillis, "");
                        return null;
                    } catch (RemoteException e2) {
                        e = e2;
                        iBinder2 = iBinder;
                        C13479a.m54759a("RemoteProxyFactory", "proxy: error", e);
                        iBinder = iBinder2;
                        return C10954c.this.f29451b.get(cls).mo16349b(iBinder);
                    }
                }
            } catch (RemoteException e3) {
                e = e3;
                C13479a.m54759a("RemoteProxyFactory", "proxy: error", e);
                iBinder = iBinder2;
                return C10954c.this.f29451b.get(cls).mo16349b(iBinder);
            }
            return C10954c.this.f29451b.get(cls).mo16349b(iBinder);
        }

        public C10956a(Class<?> cls) {
            this.f29456b = cls;
        }

        /* renamed from: a */
        private Object m45487a(Method method, Throwable th) {
            Class<?> returnType = method.getReturnType();
            C13479a.m54758a("RemoteProxyFactory", "Error when obtaining remote proxy. return type: " + returnType.getName());
            if (AbstractC68307f.class.isAssignableFrom(returnType)) {
                return AbstractC68307f.m265084a((Throwable) new RemoteException("obtaining remote proxy failed for " + this.f29456b + ", e = " + th));
            } else if (Result.class.isAssignableFrom(returnType)) {
                return Result.m45391a(new RemoteException("obtaining remote proxy failed for " + this.f29456b + ", e = " + th));
            } else if ("boolean".equals(returnType.getName())) {
                return false;
            } else {
                if ("long".equals(returnType.getName()) || "int".equals(returnType.getName())) {
                    return -1;
                }
                if ("short".equals(returnType.getName())) {
                    return (short) -1;
                }
                if ("byte".equals(returnType.getName())) {
                    return (byte) -1;
                }
                if ("char".equals(returnType.getName())) {
                    return (char) 1;
                }
                if ("float".equals(returnType.getName()) || "double".equals(returnType.getName())) {
                    return Float.valueOf(-1.0f);
                }
                if (Boolean.class.isAssignableFrom(returnType)) {
                    return false;
                }
                if (Long.class.isAssignableFrom(returnType)) {
                    return -1L;
                }
                if (Integer.class.isAssignableFrom(returnType)) {
                    return -1;
                }
                if (Short.class.isAssignableFrom(returnType)) {
                    return (short) -1;
                }
                if (Byte.class.isAssignableFrom(returnType)) {
                    return (byte) 1;
                }
                if (Character.class.isAssignableFrom(returnType)) {
                    return (char) 1;
                }
                if (Float.class.isAssignableFrom(returnType)) {
                    return Float.valueOf(-1.0f);
                }
                if (Double.class.isAssignableFrom(returnType)) {
                    return Double.valueOf(-1.0d);
                }
                return null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object a = m45486a(this.f29456b);
            if (a == null) {
                return m45487a(method, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                return method.invoke(a, objArr);
            } catch (Throwable th) {
                C13479a.m54773d("RemoteProxyFactory", "invoke error", th);
                C10906a.m45376a(C10929e.m45432a(), "102", this.f29456b.getName(), System.currentTimeMillis() - currentTimeMillis, method.getName());
                return m45487a(method, th);
            }
        }
    }

    /* renamed from: a */
    public void mo41590a(Class<AbstractC10957d> cls, AbstractC10952a<AbstractC10957d> aVar) {
        this.f29451b.put(cls, aVar);
    }

    /* renamed from: a */
    public Object mo41589a(Class<Object> cls, AbstractC10957d dVar) {
        Object obj = this.f29452c.get(cls);
        if (obj != null) {
            return obj;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C10956a(cls));
        this.f29452c.put(cls, newProxyInstance);
        C10906a.m45376a(C10929e.m45432a(), "6", cls.getName(), System.currentTimeMillis() - currentTimeMillis, "");
        return newProxyInstance;
    }
}
