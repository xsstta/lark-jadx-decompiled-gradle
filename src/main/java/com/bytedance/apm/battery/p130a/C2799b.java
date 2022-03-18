package com.bytedance.apm.battery.p130a;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.apm.battery.a.b */
public class C2799b {

    /* renamed from: a */
    private Map<String, AbstractC2801d> f8940a = new HashMap();

    /* renamed from: a */
    public void mo12127a() throws Exception {
        if (this.f8940a.size() != 0) {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Method declaredMethod = cls.getDeclaredMethod("getService", String.class);
            Field declaredField = cls.getDeclaredField("sCache");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(null);
            for (Map.Entry<String, AbstractC2801d> entry : this.f8940a.entrySet()) {
                String key = entry.getKey();
                IBinder iBinder = (IBinder) declaredMethod.invoke(null, key);
                C2800c cVar = new C2800c(iBinder, entry.getValue());
                IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{IBinder.class}, cVar);
                cVar.mo12129a(iBinder2);
                map.put(key, iBinder2);
            }
        }
    }

    /* renamed from: a */
    public void mo12128a(String str, AbstractC2801d dVar) {
        this.f8940a.put(str, dVar);
    }
}
