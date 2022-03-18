package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.C20577a;
import com.bytedance.retrofit2.C20640l;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.client.AbstractC20592a;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p893a.AbstractC20587a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class Retrofit {
    public static volatile CopyOnWriteArrayList<Interceptor> sCommonInterceptors;
    private final List<CallAdapter.Factory> adapterFactories;
    private final AbstractC20587a cacheServer;
    private final Executor callbackExecutor;
    private final AbstractC20592a.AbstractC20593a clientProvider;
    private final List<Converter.Factory> converterFactories;
    private final Executor httpExecutor;
    private final List<Interceptor> interceptors;
    private final AbstractC20595d server;
    private final Map<Method, C20640l> serviceMethodCache;
    private final boolean validateEagerly;

    public AbstractC20587a cacheServer() {
        return this.cacheServer;
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.adapterFactories;
    }

    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public AbstractC20592a.AbstractC20593a clientProvider() {
        return this.clientProvider;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public Executor httpExecutor() {
        return this.httpExecutor;
    }

    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public AbstractC20595d server() {
        return this.server;
    }

    /* renamed from: com.bytedance.retrofit2.Retrofit$a */
    public static final class C20576a {

        /* renamed from: a */
        private C20632i f50149a;

        /* renamed from: b */
        private AbstractC20592a.AbstractC20593a f50150b;

        /* renamed from: c */
        private AbstractC20595d f50151c;

        /* renamed from: d */
        private List<Interceptor> f50152d;

        /* renamed from: e */
        private List<Converter.Factory> f50153e;

        /* renamed from: f */
        private List<CallAdapter.Factory> f50154f;

        /* renamed from: g */
        private Executor f50155g;

        /* renamed from: h */
        private Executor f50156h;

        /* renamed from: i */
        private boolean f50157i;

        public C20576a() {
            this(C20632i.m75006a());
        }

        /* renamed from: a */
        public Retrofit mo69319a() {
            if (this.f50151c == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f50150b == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.f50155g != null) {
                Executor executor = this.f50156h;
                if (executor == null) {
                    executor = this.f50149a.mo69442c();
                }
                ArrayList arrayList = new ArrayList(this.f50154f);
                arrayList.add(this.f50149a.mo69439a(executor));
                ArrayList arrayList2 = new ArrayList(this.f50153e);
                if (Retrofit.sCommonInterceptors != null) {
                    Iterator<Interceptor> it = Retrofit.sCommonInterceptors.iterator();
                    while (it.hasNext()) {
                        Interceptor next = it.next();
                        if (!this.f50152d.contains(next)) {
                            this.f50152d.add(next);
                        }
                    }
                }
                return new Retrofit(this.f50151c, this.f50150b, this.f50152d, arrayList2, arrayList, this.f50155g, executor, this.f50157i);
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.List<com.bytedance.retrofit2.CallAdapter$Factory> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public C20576a mo69313a(CallAdapter.Factory factory) {
            this.f50154f.add(C20653o.m75097a((Object) factory, "factory == null"));
            return this;
        }

        /* renamed from: b */
        public C20576a mo69320b(AbstractC20592a.AbstractC20593a aVar) {
            this.f50150b = (AbstractC20592a.AbstractC20593a) C20653o.m75097a((Object) aVar, "provider == null");
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.List<com.bytedance.retrofit2.Converter$Factory> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public C20576a mo69314a(Converter.Factory factory) {
            this.f50153e.add(C20653o.m75097a((Object) factory, "factory == null"));
            return this;
        }

        C20576a(C20632i iVar) {
            this.f50152d = new CopyOnWriteArrayList();
            this.f50153e = new ArrayList();
            this.f50154f = new ArrayList();
            this.f50149a = iVar;
            this.f50153e.add(new C20577a());
        }

        /* renamed from: a */
        public C20576a mo69315a(AbstractC20592a.AbstractC20593a aVar) {
            return mo69320b((AbstractC20592a.AbstractC20593a) C20653o.m75097a((Object) aVar, "provider == null"));
        }

        /* renamed from: a */
        public C20576a mo69316a(Interceptor interceptor) {
            this.f50152d.add((Interceptor) C20653o.m75097a((Object) interceptor, "interceptor == null"));
            return this;
        }

        /* renamed from: a */
        public C20576a mo69317a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f50151c = C20596e.m74962a(str);
            return this;
        }

        /* renamed from: a */
        public C20576a mo69318a(Executor executor) {
            this.f50155g = (Executor) C20653o.m75097a((Object) executor, "httpExecutor == null");
            return this;
        }
    }

    public static void setCommonInterceptor(CopyOnWriteArrayList<Interceptor> copyOnWriteArrayList) {
        sCommonInterceptors = copyOnWriteArrayList;
    }

    private void eagerlyValidateMethods(Class<?> cls) {
        C20632i a = C20632i.m75006a();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!a.mo69441a(method)) {
                loadServiceMethod(method);
            }
        }
    }

    public <T> T create(final Class<T> cls) {
        C20653o.m75102a((Class) cls);
        if (this.validateEagerly) {
            eagerlyValidateMethods(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.bytedance.retrofit2.Retrofit.C205751 */

            /* renamed from: c */
            private final C20632i f50148c = C20632i.m75006a();

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
                C20639k kVar = new C20639k();
                kVar.f50276f = System.currentTimeMillis();
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f50148c.mo69441a(method)) {
                    return this.f50148c.mo69440a(method, cls, obj, objArr);
                }
                kVar.f50282l = SystemClock.uptimeMillis();
                C20640l loadServiceMethod = Retrofit.this.loadServiceMethod(method);
                kVar.f50283m = SystemClock.uptimeMillis();
                loadServiceMethod.mo69453a(kVar);
                return loadServiceMethod.f50301d.mo69250a(new C20642m(loadServiceMethod, objArr));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public C20640l loadServiceMethod(Method method) {
        C20640l lVar;
        C20640l lVar2 = this.serviceMethodCache.get(method);
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (this.serviceMethodCache) {
            lVar = this.serviceMethodCache.get(method);
            if (lVar == null) {
                lVar = new C20640l.C20641a(this, method).mo69454a();
                this.serviceMethodCache.put(method, lVar);
            }
        }
        return lVar;
    }

    public CallAdapter<?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public <T> Converter<TypedInput, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, Header> headerConverter(Type type, Annotation[] annotationArr) {
        C20653o.m75097a((Object) type, "type == null");
        C20653o.m75097a((Object) annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, Header> converter = (Converter<T, Header>) this.converterFactories.get(i).headerConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    public <T> Converter<T, Object> objectConverter(Type type, Annotation[] annotationArr) {
        C20653o.m75097a((Object) type, "type == null");
        C20653o.m75097a((Object) annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, Object> converter = (Converter<T, Object>) this.converterFactories.get(i).objectConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        C20653o.m75097a((Object) type, "type == null");
        C20653o.m75097a((Object) annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return C20577a.C20585h.f50165a;
    }

    public <T> Converter<T, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public CallAdapter<?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        C20653o.m75097a((Object) type, "returnType == null");
        C20653o.m75097a((Object) annotationArr, "annotations == null");
        int indexOf = this.adapterFactories.indexOf(factory) + 1;
        int size = this.adapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?> callAdapter = this.adapterFactories.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.adapterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.adapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.adapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<TypedInput, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        C20653o.m75097a((Object) type, "type == null");
        C20653o.m75097a((Object) annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<TypedInput, T> converter = (Converter<TypedInput, T>) this.converterFactories.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> Converter<T, TypedOutput> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C20653o.m75097a((Object) type, "type == null");
        C20653o.m75097a((Object) annotationArr, "parameterAnnotations == null");
        C20653o.m75097a((Object) annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, TypedOutput> converter = (Converter<T, TypedOutput>) this.converterFactories.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    Retrofit(AbstractC20595d dVar, AbstractC20592a.AbstractC20593a aVar, List<Interceptor> list, List<Converter.Factory> list2, List<CallAdapter.Factory> list3, Executor executor, Executor executor2, boolean z) {
        this(dVar, aVar, list, list2, list3, executor, executor2, z, null);
    }

    Retrofit(AbstractC20595d dVar, AbstractC20592a.AbstractC20593a aVar, List<Interceptor> list, List<Converter.Factory> list2, List<CallAdapter.Factory> list3, Executor executor, Executor executor2, boolean z, AbstractC20587a aVar2) {
        this.serviceMethodCache = new ConcurrentHashMap();
        this.server = dVar;
        this.clientProvider = aVar;
        this.interceptors = list;
        this.converterFactories = Collections.unmodifiableList(list2);
        this.adapterFactories = Collections.unmodifiableList(list3);
        this.httpExecutor = executor;
        this.callbackExecutor = executor2;
        this.validateEagerly = z;
        this.cacheServer = aVar2;
    }
}
