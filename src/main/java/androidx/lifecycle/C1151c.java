package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
final class C1151c {

    /* renamed from: a */
    static C1151c f4266a = new C1151c();

    /* renamed from: b */
    private final Map<Class<?>, C1152a> f4267b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Boolean> f4268c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.c$b */
    public static final class C1153b {

        /* renamed from: a */
        final int f4271a;

        /* renamed from: b */
        final Method f4272b;

        public int hashCode() {
            return (this.f4271a * 31) + this.f4272b.getName().hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1153b)) {
                return false;
            }
            C1153b bVar = (C1153b) obj;
            if (this.f4271a != bVar.f4271a || !this.f4272b.getName().equals(bVar.f4272b.getName())) {
                return false;
            }
            return true;
        }

        C1153b(int i, Method method) {
            this.f4271a = i;
            this.f4272b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6015a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f4271a;
                if (i == 0) {
                    this.f4272b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4272b.invoke(obj, lifecycleOwner);
                } else if (i == 2) {
                    this.f4272b.invoke(obj, lifecycleOwner, event);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    C1151c() {
    }

    /* renamed from: c */
    private Method[] m5376c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1152a mo6013b(Class<?> cls) {
        C1152a aVar = this.f4267b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m5374a(cls, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6012a(Class<?> cls) {
        Boolean bool = this.f4268c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m5376c(cls);
        for (Method method : c) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                m5374a(cls, c);
                return true;
            }
        }
        this.f4268c.put(cls, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.c$a */
    public static class C1152a {

        /* renamed from: a */
        final Map<Lifecycle.Event, List<C1153b>> f4269a = new HashMap();

        /* renamed from: b */
        final Map<C1153b, Lifecycle.Event> f4270b;

        C1152a(Map<C1153b, Lifecycle.Event> map) {
            this.f4270b = map;
            for (Map.Entry<C1153b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<C1153b> list = this.f4269a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4269a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6014a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            m5379a(this.f4269a.get(event), lifecycleOwner, event, obj);
            m5379a(this.f4269a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }

        /* renamed from: a */
        private static void m5379a(List<C1153b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo6015a(lifecycleOwner, event, obj);
                }
            }
        }
    }

    /* renamed from: a */
    private C1152a m5374a(Class<?> cls, Method[] methodArr) {
        int i;
        C1152a b;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo6013b(superclass)) == null)) {
            hashMap.putAll(b.f4270b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1153b, Lifecycle.Event> entry : mo6013b(cls2).f4270b.entrySet()) {
                m5375a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m5376c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m5375a(hashMap, new C1153b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1152a aVar = new C1152a(hashMap);
        this.f4267b.put(cls, aVar);
        this.f4268c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m5375a(Map<C1153b, Lifecycle.Event> map, C1153b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f4272b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }
}
