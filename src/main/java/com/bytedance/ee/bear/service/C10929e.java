package com.bytedance.ee.bear.service;

import android.app.Application;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.bear.service.base.AbstractC10914b;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.bear.service.base.Result;
import com.bytedance.ee.bear.service.callback.AbstractC10926b;
import com.bytedance.ee.bear.service.callback.C10918a;
import com.bytedance.ee.bear.service.p541a.C10910c;
import com.bytedance.ee.bear.service.remote.C10958e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.service.e */
public class C10929e {

    /* renamed from: a */
    public static final List<AbstractC10914b> f29411a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static final AtomicBoolean f29412b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final AtomicBoolean f29413c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final AtomicBoolean f29414d = new AtomicBoolean(false);

    /* renamed from: e */
    private static AbstractC10928d f29415e;

    /* renamed from: f */
    private static CountDownLatch f29416f = new CountDownLatch(1);

    /* renamed from: g */
    private static CountDownLatch f29417g = new CountDownLatch(1);

    /* renamed from: h */
    private static Map<Class<?>, Boolean> f29418h = new ConcurrentHashMap();

    /* renamed from: a */
    public static AbstractC10928d m45432a() {
        return f29415e;
    }

    /* renamed from: c */
    private static synchronized void m45436c() {
        synchronized (C10929e.class) {
            AtomicBoolean atomicBoolean = f29413c;
            if (!atomicBoolean.get()) {
                AtomicBoolean atomicBoolean2 = f29414d;
                if (!atomicBoolean2.get()) {
                    try {
                        atomicBoolean2.set(true);
                        m45438d();
                        atomicBoolean2.set(false);
                        atomicBoolean.set(true);
                        f29417g.countDown();
                        return;
                    } catch (Throwable th) {
                        f29414d.set(false);
                        f29413c.set(true);
                        f29417g.countDown();
                        throw th;
                    }
                }
            }
            C13479a.m54775e("Services", "handleMessage: service has init. ");
        }
    }

    /* renamed from: b */
    public static void m45435b() {
        if (!f29412b.get()) {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                C13479a.m54764b("Services", "wait set provider...");
                try {
                    f29416f.await();
                } catch (InterruptedException e) {
                    C13479a.m54759a("Services", "wait set provider failed", e);
                    return;
                }
            } else {
                C13479a.m54758a("Services", "your must invoke Services.init() first");
                throw new RuntimeException("your must invoke Services.init() first");
            }
        }
        if (f29413c.get()) {
            C13479a.m54768c("Services", "initInMainThread: Have initialized.");
            return;
        }
        if (f29414d.get()) {
            C13479a.m54768c("Services", "onInit: is initializing");
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                C13479a.m54764b("Services", "we are not in main thread, wait init finish.");
                try {
                    f29417g.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException e2) {
                    C13479a.m54759a("Services", "interrupt init when is initializing", e2);
                }
            } else {
                try {
                    f29417g.await(3, TimeUnit.SECONDS);
                    return;
                } catch (InterruptedException e3) {
                    C13479a.m54759a("Services", "interrupt init1 when is initializing", e3);
                    return;
                }
            }
        }
        m45436c();
    }

    /* renamed from: d */
    private static void m45438d() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC10928d dVar = f29415e;
        C13479a.m54764b("Services", "doInit()...begin");
        List<AbstractC10913a> a = dVar.mo16986a();
        if (a != null) {
            List<AbstractC10913a> a2 = new C10911b().mo41495a(a);
            C13479a.m54764b("Services", "doInit: register services");
            for (AbstractC10913a aVar : a2) {
                for (AbstractC10914b bVar : f29411a) {
                    if (bVar.mo41489a(aVar)) {
                        bVar.mo41487a(aVar, dVar);
                    }
                }
            }
            C13479a.m54764b("Services", "doInit: init services");
            for (AbstractC10913a aVar2 : a2) {
                for (AbstractC10914b bVar2 : f29411a) {
                    if (bVar2.mo41489a(aVar2)) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        bVar2.mo41492b(aVar2);
                        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                        C13479a.m54764b("Services", "init " + aVar2.getClass().getName() + " : " + currentTimeMillis3);
                        C10906a.m45376a(f29415e, "1", aVar2.getClass().getName(), currentTimeMillis3, "");
                    }
                }
            }
            C13479a.m54764b("Services", "doInit: end init services");
            for (AbstractC10914b bVar3 : f29411a) {
                bVar3.mo41484a();
            }
            C13479a.m54764b("Services", "doInit()...end");
            C10906a.m45376a(f29415e, "4", "", System.currentTimeMillis() - currentTimeMillis, "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.service.e$a */
    public static class C10932a implements InvocationHandler {

        /* renamed from: a */
        private Class<?> f29420a;

        public C10932a(Class<?> cls) {
            this.f29420a = cls;
        }

        /* renamed from: a */
        private Object m45444a(Method method) {
            C13479a.m54758a("Services", "Error when you get this service: " + this.f29420a.getName() + "\nCheck UI Thread brock!!! ");
            Class<?> returnType = method.getReturnType();
            C13479a.m54758a("Services", "return type:  " + returnType.getName());
            if (AbstractC68307f.class.isAssignableFrom(returnType)) {
                return AbstractC68307f.m265084a((Throwable) new Exception("You get the service is error"));
            }
            if (Result.class.isAssignableFrom(returnType)) {
                return Result.m45391a(new Exception("You get the service is error"));
            }
            if ("boolean".equals(returnType.getName())) {
                return false;
            }
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

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return m45444a(method);
        }
    }

    /* renamed from: b */
    public <T> AbstractC68307f<T> mo41523b(Class<T> cls) {
        return AbstractC68307f.m265083a(cls).mo238014c(new Function<Class<T>, AbstractC70020b<T>>() {
            /* class com.bytedance.ee.bear.service.C10929e.C109312 */

            /* renamed from: a */
            public AbstractC70020b<T> apply(Class<T> cls) throws Exception {
                C10929e.m45435b();
                for (AbstractC10914b bVar : C10929e.f29411a) {
                    if (bVar.mo41490a((Class<?>) cls)) {
                        return bVar.mo41493c(cls);
                    }
                }
                return AbstractC68307f.m265084a(new Throwable("unknown service type: " + cls.getName()));
            }
        });
    }

    /* renamed from: c */
    private <T> void m45437c(Class<T> cls) {
        boolean z;
        Boolean bool = f29418h.get(cls);
        if (bool == null) {
            NewRemoteService newRemoteService = (NewRemoteService) cls.getAnnotation(NewRemoteService.class);
            Map<Class<?>, Boolean> map = f29418h;
            if (newRemoteService != null) {
                z = true;
            } else {
                z = false;
            }
            map.put(cls, Boolean.valueOf(z));
            if (newRemoteService != null) {
                throw new UnsupportedOperationException("can't get " + cls.getName() + " in this method.  Please use ofNotNull() replace.");
            }
        } else if (bool == Boolean.TRUE) {
            throw new UnsupportedOperationException("can't get " + cls.getName() + " in this method.  Please use ofNotNull() replace.");
        }
    }

    /* renamed from: a */
    public <T> T mo41522a(Class<T> cls) {
        C13479a.m54772d("Services", "of: " + cls.getName());
        long uptimeMillis = SystemClock.uptimeMillis();
        m45435b();
        m45437c(cls);
        for (AbstractC10914b bVar : f29411a) {
            if (bVar.mo41490a((Class<?>) cls)) {
                return (T) bVar.mo41491b(cls);
            }
        }
        C13479a.m54758a("Services", "get service is null, un resolve the case. " + m45433a(uptimeMillis, cls));
        AbstractC10928d dVar = f29415e;
        if (dVar != null) {
            C10906a.m45376a(dVar, "101", cls.getName(), SystemClock.uptimeMillis() - uptimeMillis, m45433a(uptimeMillis, cls));
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C10932a(cls));
    }

    /* renamed from: a */
    private <T> String m45433a(long j, Class<T> cls) {
        return "\n process: " + C10916c.m45409b(null) + "\n thread: " + Thread.currentThread().getName() + "\n service: " + cls.getName() + "\n costTime: " + (SystemClock.uptimeMillis() - j) + "\n services.invoke: " + f29412b.get() + "\n services.init: " + f29413c.get() + "\n sServiceFacades: " + f29411a.size() + "\n service provider: " + f29415e.mo16986a().toString();
    }

    /* renamed from: a */
    public static void m45434a(Application application, AbstractC10928d dVar, AbstractC10926b bVar) {
        C13479a.m54764b("Services", "Services.init start....");
        C10918a.m45417a(application, bVar);
        f29415e = dVar;
        List<AbstractC10914b> list = f29411a;
        list.add(new C10910c());
        list.add(new C10958e());
        for (AbstractC10914b bVar2 : list) {
            bVar2.mo41485a(application);
            bVar2.mo41488a(new AbstractC10914b.AbstractC10915a() {
                /* class com.bytedance.ee.bear.service.C10929e.C109301 */

                @Override // com.bytedance.ee.bear.service.base.AbstractC10914b.AbstractC10915a
                /* renamed from: b */
                public boolean mo41504b() {
                    return C10929e.f29413c.get();
                }

                @Override // com.bytedance.ee.bear.service.base.AbstractC10914b.AbstractC10915a
                /* renamed from: a */
                public void mo41503a() {
                    C13479a.m54764b("Services", "Services.init registerInitCallback....");
                    C10929e.m45435b();
                }
            });
        }
        f29412b.set(true);
        f29416f.countDown();
        C13479a.m54764b("Services", "Services.init  end....");
    }
}
