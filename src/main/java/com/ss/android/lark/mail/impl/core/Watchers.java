package com.ss.android.lark.mail.impl.core;

import com.larksuite.framework.thread.CoreThreadPool;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Watchers {

    /* renamed from: a */
    static final Watchers f106670a = new Watchers();

    /* renamed from: b */
    final ConcurrentMap<Class<? extends AbstractC42035a>, ArrayList<AbstractC42035a>> f106671b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ConcurrentMap<Class<? extends AbstractC42035a>, AbstractC42035a> f106672c = new ConcurrentHashMap();

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Config {
        long delayTs() default 0;

        boolean once() default false;
    }

    @Config
    /* renamed from: com.ss.android.lark.mail.impl.core.Watchers$a */
    public interface AbstractC42035a {
    }

    private Watchers() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.core.Watchers$b */
    public static class C42036b implements InvocationHandler {

        /* renamed from: a */
        private final Class<? extends AbstractC42035a> f106677a;

        C42036b(Class<? extends AbstractC42035a> cls) {
            this.f106677a = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            Watchers.f106670a.mo151049a(this.f106677a, method, objArr);
            return null;
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC42035a> T m167205a(Class<T> cls) {
        return (T) f106670a.m167208b(cls);
    }

    /* renamed from: b */
    public static void m167209b(AbstractC42035a aVar) {
        f106670a.m167216e(aVar);
    }

    /* renamed from: a */
    public static void m167206a(AbstractC42035a aVar) {
        f106670a.m167212c(aVar);
    }

    /* renamed from: d */
    private HashSet<Class<? extends AbstractC42035a>> m167213d(AbstractC42035a aVar) {
        return C42037a.m167219a(AbstractC42035a.class, aVar.getClass());
    }

    /* renamed from: b */
    private <T extends AbstractC42035a> T m167208b(Class<T> cls) {
        if (!this.f106672c.containsKey(cls)) {
            this.f106672c.putIfAbsent(cls, m167211c(cls));
        }
        return cls.cast(this.f106672c.get(cls));
    }

    /* renamed from: c */
    private void m167212c(AbstractC42035a aVar) {
        Iterator<Class<? extends AbstractC42035a>> it = m167213d(aVar).iterator();
        while (it.hasNext()) {
            m167207a(aVar, it.next());
        }
    }

    /* renamed from: d */
    private void m167214d(Class<? extends AbstractC42035a> cls) {
        if (this.f106671b.get(cls) == null) {
            this.f106671b.putIfAbsent(cls, new ArrayList<>());
        }
    }

    /* renamed from: e */
    private Config m167215e(Class<? extends AbstractC42035a> cls) {
        Config config = (Config) cls.getAnnotation(Config.class);
        if (config != null) {
            return config;
        }
        return (Config) AbstractC42035a.class.getAnnotation(Config.class);
    }

    /* renamed from: e */
    private void m167216e(AbstractC42035a aVar) {
        Iterator<Class<? extends AbstractC42035a>> it = m167213d(aVar).iterator();
        while (it.hasNext()) {
            m167210b(aVar, it.next());
        }
    }

    /* renamed from: c */
    private static <T extends AbstractC42035a> T m167211c(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("Only interface endpoint definitions are supported.");
        } else if (!C42037a.m167218a(cls).contains(AbstractC42035a.class)) {
            return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                /* class com.ss.android.lark.mail.impl.core.Watchers.C420331 */

                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    throw new IllegalArgumentException("Interface definitions must extend Watcher interface.");
                }
            }));
        } else {
            return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C42036b(cls)));
        }
    }

    /* renamed from: a */
    private void m167207a(AbstractC42035a aVar, Class<? extends AbstractC42035a> cls) {
        m167214d(cls);
        ArrayList<AbstractC42035a> arrayList = this.f106671b.get(cls);
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
    }

    /* renamed from: b */
    private void m167210b(AbstractC42035a aVar, Class<? extends AbstractC42035a> cls) {
        m167214d(cls);
        ArrayList<AbstractC42035a> arrayList = this.f106671b.get(cls);
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo151049a(Class<? extends AbstractC42035a> cls, final Method method, final Object... objArr) {
        m167214d(cls);
        ArrayList<AbstractC42035a> arrayList = this.f106671b.get(cls);
        if (arrayList != null && arrayList.size() > 0) {
            Config e = m167215e(cls);
            long delayTs = e.delayTs();
            boolean once = e.once();
            for (int i = 0; i < arrayList.size(); i++) {
                final AbstractC42035a aVar = arrayList.get(i);
                if (aVar != null) {
                    RunnableC420342 r5 = new Runnable() {
                        /* class com.ss.android.lark.mail.impl.core.Watchers.RunnableC420342 */

                        public void run() {
                            try {
                                method.invoke(aVar, objArr);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    if (delayTs > 0) {
                        CoreThreadPool.getBackgroundHandler().postDelayed(r5, delayTs);
                    } else {
                        CoreThreadPool.getBackgroundHandler().post(r5);
                    }
                }
            }
            if (once) {
                arrayList.clear();
            }
        }
    }
}
