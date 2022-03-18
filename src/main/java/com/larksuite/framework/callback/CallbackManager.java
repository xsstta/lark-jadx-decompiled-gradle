package com.larksuite.framework.callback;

import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallbackManager {
    private List<AbstractC25972f> callBackList = new ArrayList();
    private boolean isCanceled;
    private final Object isCanceledLock = new Object();

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.callback.CallbackManager$a */
    public static class C25962a<T extends ICallback> implements InvocationHandler {

        /* renamed from: a */
        private T f64279a;

        /* renamed from: b */
        private boolean f64280b;

        /* renamed from: a */
        private void m94001a() {
            this.f64279a = null;
        }

        /* renamed from: b */
        private boolean m94002b() {
            if (this.f64279a == null) {
                return true;
            }
            return false;
        }

        C25962a(T t, boolean z) {
            this.f64279a = t;
            this.f64280b = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z = false;
            if (m94002b()) {
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
            } else if (method.equals(AbstractC25971e.class.getMethod("cancel", new Class[0]))) {
                T t = this.f64279a;
                m94001a();
                if (this.f64280b) {
                    return method.invoke(t, objArr);
                }
                return null;
            } else if (!method.equals(AbstractC25971e.class.getMethod("isCanceled", new Class[0]))) {
                T t2 = this.f64279a;
                if (t2 != null) {
                    return method.invoke(t2, objArr);
                }
                return null;
            } else if (!this.f64280b) {
                return Boolean.valueOf(m94002b());
            } else {
                if (m94002b() || ((Boolean) method.invoke(this.f64279a, objArr)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
    }

    public void cancelCallbacks() {
        synchronized (this.isCanceledLock) {
            this.isCanceled = true;
            Log.d("lark", "cancel CallbackManager");
        }
        for (AbstractC25972f fVar : this.callBackList) {
            if (fVar != null) {
                fVar.cancel();
            }
        }
    }

    private <Data> UIGetDataCallback<Data> wrapGetDataCallback(IGetDataCallback<Data> iGetDataCallback) {
        return new UIGetDataCallback<>(iGetDataCallback);
    }

    public <Data> UIGetDataCallback<Data> wrapAndAddGetDataCallback(IGetDataCallback<Data> iGetDataCallback) {
        UIGetDataCallback<Data> wrapGetDataCallback = wrapGetDataCallback(iGetDataCallback);
        addCancelableCallback(wrapGetDataCallback);
        return wrapGetDataCallback;
    }

    public <T extends ICallback> T wrapAndAddCallback(T t) {
        T t2 = (T) wrapCallback(t);
        addCancelableCallback((AbstractC25972f) t2);
        return t2;
    }

    public <T extends AbstractC25972f> void addCancelableCallback(T t) {
        synchronized (this.isCanceledLock) {
            if (!this.isCanceled) {
                this.callBackList.add(t);
            } else {
                t.cancel();
            }
        }
    }

    public <T extends ICallback> T wrapCallback(T t) {
        if (t == null) {
            return null;
        }
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            boolean z = false;
            boolean z2 = false;
            for (Class<?> cls2 : interfaces) {
                if (AbstractC25972f.class.equals(cls2)) {
                    z = true;
                    z2 = true;
                }
            }
            if (!z && AbstractC25971e.class.isAssignableFrom(cls)) {
                z2 = true;
            }
            if (!z) {
                interfaces = (Class[]) Arrays.copyOf(interfaces, interfaces.length + 1);
                interfaces[interfaces.length - 1] = AbstractC25972f.class;
            }
            return (T) ((ICallback) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new C25962a(t, z2)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
