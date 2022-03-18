package com.bytedance.ee.android.file.picker.lib.p235a;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.a.a */
public class C4038a {

    /* renamed from: a */
    private final Object f12249a = new Object();

    /* renamed from: b */
    private List<ICancelableCallback> f12250b = new ArrayList();

    /* renamed from: c */
    private boolean f12251c;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.a.a$a */
    public static class C4039a<T extends ICallback> implements InvocationHandler {

        /* renamed from: a */
        private T f12252a;

        /* renamed from: b */
        private boolean f12253b;

        /* renamed from: a */
        private void m16780a() {
            this.f12252a = null;
        }

        /* renamed from: b */
        private boolean m16781b() {
            if (this.f12252a == null) {
                return true;
            }
            return false;
        }

        C4039a(T t, boolean z) {
            this.f12252a = t;
            this.f12253b = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z = false;
            if (m16781b()) {
                Class<?> returnType = method.getReturnType();
                if (returnType == null) {
                    return null;
                }
                if (returnType == Boolean.TYPE || returnType == Boolean.class) {
                    return false;
                }
                if (returnType == Byte.TYPE || returnType == Byte.class) {
                    return (byte) 0;
                }
                if (returnType == Character.TYPE || returnType == Character.class) {
                    return (char) 0;
                }
                if (returnType == Short.TYPE || returnType == Short.class) {
                    return (short) 0;
                }
                if (returnType == Integer.TYPE || returnType == Integer.class) {
                    return 0;
                }
                if (returnType == Long.TYPE || returnType == Long.class) {
                    return 0L;
                }
                if (returnType == Float.TYPE || returnType == Float.class) {
                    return Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
                }
                if (returnType == Double.TYPE || returnType == Double.class) {
                    return Double.valueOf(0.0d);
                }
                return null;
            } else if (method.equals(ICancelable.class.getMethod(C63954b.f161494a, new Class[0]))) {
                T t = this.f12252a;
                m16780a();
                if (this.f12253b) {
                    return method.invoke(t, objArr);
                }
                return null;
            } else if (!method.equals(ICancelable.class.getMethod(C60375c.f150914a, new Class[0]))) {
                return method.invoke(this.f12252a, objArr);
            } else {
                if (!this.f12253b) {
                    return Boolean.valueOf(m16781b());
                }
                if (m16781b() && ((Boolean) method.invoke(this.f12252a, objArr)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
    }

    /* renamed from: a */
    public void mo15811a() {
        synchronized (this.f12249a) {
            this.f12251c = true;
            Log.m165379d("lark", "cancel CallbackManager");
        }
        for (ICancelableCallback eVar : this.f12250b) {
            if (eVar != null) {
                eVar.mo15816b();
            }
        }
    }

    /* renamed from: a */
    public <T extends ICallback> T mo15810a(T t) {
        T t2 = (T) mo15813b(t);
        mo15812a((ICancelableCallback) t2);
        return t2;
    }

    /* renamed from: a */
    public <T extends ICancelableCallback> void mo15812a(T t) {
        synchronized (this.f12249a) {
            if (!this.f12251c) {
                this.f12250b.add(t);
            } else {
                t.mo15816b();
            }
        }
    }

    /* renamed from: b */
    public <T extends ICallback> T mo15813b(T t) {
        if (t == null) {
            return null;
        }
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            boolean z = false;
            boolean z2 = false;
            for (Class<?> cls2 : interfaces) {
                if (ICancelableCallback.class.equals(cls2)) {
                    z = true;
                    z2 = true;
                }
            }
            if (!z && ICancelable.class.isAssignableFrom(cls)) {
                z2 = true;
            }
            if (!z) {
                interfaces = (Class[]) Arrays.copyOf(interfaces, interfaces.length + 1);
                interfaces[interfaces.length - 1] = ICancelableCallback.class;
            }
            return (T) ((ICallback) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new C4039a(t, z2)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
