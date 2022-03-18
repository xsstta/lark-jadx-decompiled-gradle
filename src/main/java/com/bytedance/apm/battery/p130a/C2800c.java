package com.bytedance.apm.battery.p130a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.apm.battery.a.c */
public class C2800c implements InvocationHandler {

    /* renamed from: a */
    IBinder f8941a;

    /* renamed from: b */
    IBinder f8942b;

    /* renamed from: c */
    AbstractC2801d f8943c;

    /* renamed from: d */
    Class<?> f8944d;

    /* renamed from: e */
    Class<?> f8945e;

    /* renamed from: a */
    public C2800c mo12129a(IBinder iBinder) {
        this.f8942b = iBinder;
        return this;
    }

    public C2800c(IBinder iBinder, AbstractC2801d dVar) {
        this.f8941a = iBinder;
        this.f8943c = dVar;
        try {
            String a = dVar.mo12131a();
            this.f8944d = Class.forName(a + "$Stub");
            this.f8945e = Class.forName(a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"queryLocalInterface".equals(method.getName())) {
            return method.invoke(this.f8941a, objArr);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f8945e}, new C2798a(this.f8941a, this.f8944d, this.f8943c, this.f8942b));
    }
}
