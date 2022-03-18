package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
public class C1172r {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4295a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends AbstractC1163i>>> f4296b = new HashMap();

    /* renamed from: d */
    private static boolean m5407d(Class<?> cls) {
        if (cls == null || !LifecycleObserver.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m5403a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: b */
    private static int m5405b(Class<?> cls) {
        Integer num = f4295a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int c = m5406c(cls);
        f4295a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: a */
    static AbstractC1168n m5402a(Object obj) {
        boolean z = obj instanceof AbstractC1168n;
        boolean z2 = obj instanceof FullLifecycleObserver;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, (AbstractC1168n) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj, null);
        }
        if (z) {
            return (AbstractC1168n) obj;
        }
        Class<?> cls = obj.getClass();
        if (m5405b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends AbstractC1163i>> list = f4296b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m5401a(list.get(0), obj));
        }
        AbstractC1163i[] iVarArr = new AbstractC1163i[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iVarArr[i] = m5401a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(iVarArr);
    }

    /* renamed from: c */
    private static int m5406c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC1163i> a = m5404a(cls);
        if (a != null) {
            f4296b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C1151c.f4266a.mo6012a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m5407d(superclass)) {
                if (m5405b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4296b.get(superclass));
            }
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (m5407d(cls2)) {
                    if (m5405b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4296b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4296b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static Constructor<? extends AbstractC1163i> m5404a(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String a = m5403a(canonicalName);
            if (!str.isEmpty()) {
                a = str + "." + a;
            }
            Constructor declaredConstructor = Class.forName(a).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static AbstractC1163i m5401a(Constructor<? extends AbstractC1163i> constructor, Object obj) {
        try {
            return (AbstractC1163i) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
