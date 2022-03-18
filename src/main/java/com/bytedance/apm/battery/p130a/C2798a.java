package com.bytedance.apm.battery.p130a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.apm.battery.a.a */
public class C2798a implements InvocationHandler {

    /* renamed from: a */
    private Object f8937a;

    /* renamed from: b */
    private AbstractC2801d f8938b;

    /* renamed from: c */
    private IBinder f8939c;

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.f8939c != null && method.getName().equals("asBinder")) {
            return this.f8939c;
        }
        this.f8938b.mo12132a(obj, method, objArr);
        return method.invoke(this.f8937a, objArr);
    }

    C2798a(IBinder iBinder, Class<?> cls, AbstractC2801d dVar, IBinder iBinder2) {
        try {
            this.f8937a = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
            this.f8938b = dVar;
            this.f8939c = iBinder2;
        } catch (Exception unused) {
        }
    }
}
