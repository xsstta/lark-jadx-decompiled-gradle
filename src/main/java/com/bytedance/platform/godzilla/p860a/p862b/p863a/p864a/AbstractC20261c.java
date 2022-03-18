package com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a;

import com.bytedance.platform.godzilla.common.Logger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.a.b.a.a.c */
public abstract class AbstractC20261c extends AbstractC20260b implements InvocationHandler {

    /* renamed from: a */
    protected static final Map<Class<?>, Class<?>> f49543a;

    /* renamed from: e */
    private static final Map<String, AbstractC20260b> f49544e = new HashMap();

    /* renamed from: b */
    protected HashMap<String, AbstractC20260b> f49545b = new HashMap<>();

    /* renamed from: c */
    protected Object f49546c;

    /* renamed from: d */
    protected boolean f49547d = true;

    /* renamed from: f */
    private boolean f49548f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo68547a(Method method) {
        return true;
    }

    /* renamed from: a */
    public Object mo68545a() {
        return this.f49546c;
    }

    static {
        HashMap hashMap = new HashMap();
        f49543a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(Float.class, Float.TYPE);
    }

    /* renamed from: a */
    public void mo68546a(Object obj) {
        this.f49548f = true;
        this.f49546c = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC20260b mo68544a(String str) {
        AbstractC20260b bVar = f49544e.get(str);
        if (bVar == null) {
            return this.f49545b.get(str);
        }
        return bVar;
    }

    /* renamed from: a */
    protected static void m73958a(String str, AbstractC20260b bVar) {
        f49544e.put(str, bVar);
    }

    /* renamed from: a */
    private Object m73957a(Method method, Object obj) {
        if (obj != null) {
            return obj;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType == null) {
            return null;
        }
        if (!returnType.isPrimitive() && (returnType = f49543a.get(returnType)) == null) {
            return null;
        }
        if (returnType == Boolean.TYPE) {
            return false;
        }
        if (returnType == Void.TYPE) {
            return new Object();
        }
        return 0;
    }

    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
    /* renamed from: a */
    public Object mo68542a(Object obj, Method method, Object[] objArr) {
        AbstractC20260b a = mo68544a(method.getName());
        if (a != null) {
            return a.mo68542a(obj, method, objArr);
        }
        return super.mo68542a(obj, method, objArr);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        if (this.f49548f) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            if (!this.f49547d) {
                return method.invoke(this.f49546c, objArr);
            }
            Object obj2 = null;
            try {
                obj2 = mo68542a(this.f49546c, method, objArr);
            } catch (Throwable th) {
                Logger.m74095a("beforeInvoke", th.toString());
            }
            if (obj2 == null) {
                try {
                    obj2 = method.invoke(this.f49546c, objArr);
                } catch (Throwable th2) {
                    if (mo68547a(method)) {
                        Logger.m74095a("MethodProxyError.", th2.toString());
                    } else {
                        throw new RuntimeException(th2);
                    }
                }
            }
            try {
                obj2 = mo68543a(this.f49546c, method, objArr, obj2);
            } catch (Throwable th3) {
                Logger.m74095a("afterInvokeError.", th3.toString());
            }
            return m73957a(method, obj2);
        }
        throw new IllegalStateException("setTarget must be invoked before this invoke");
    }

    @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
    /* renamed from: a */
    public Object mo68543a(Object obj, Method method, Object[] objArr, Object obj2) {
        AbstractC20260b a = mo68544a(method.getName());
        if (a != null) {
            return a.mo68543a(obj, method, objArr, obj2);
        }
        return super.mo68543a(obj, method, objArr, obj2);
    }
}
