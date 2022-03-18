package com.bytedance.ee.larkwebview.service;

import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkwebview.service.l */
public class C13477l {

    /* renamed from: a */
    private Map<String, AbstractC13474i> f35522a = new ConcurrentHashMap();

    /* renamed from: b */
    public <T extends AbstractC13474i> T mo49931b(Class<T> cls) {
        return (T) this.f35522a.get(cls.getCanonicalName());
    }

    /* renamed from: a */
    public void mo49930a(Class<? extends AbstractC13474i> cls) {
        try {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces != null) {
                if (interfaces.length != 0) {
                    AbstractC13474i iVar = (AbstractC13474i) cls.newInstance();
                    for (Class<?> cls2 : interfaces) {
                        if (AbstractC13474i.class.isAssignableFrom(cls2)) {
                            this.f35522a.put(cls2.getCanonicalName(), iVar);
                        }
                    }
                    return;
                }
            }
            Log.m165389i("ServiceManager", "no IWebService interface exists");
        } catch (InstantiationException e) {
            Log.m165384e("ServiceManager", "instantiation error", e);
        } catch (IllegalAccessException e2) {
            Log.m165384e("ServiceManager", "illegal access", e2);
        }
    }
}
