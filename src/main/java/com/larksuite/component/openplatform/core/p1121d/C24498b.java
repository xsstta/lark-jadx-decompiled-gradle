package com.larksuite.component.openplatform.core.p1121d;

import com.larksuite.component.openplatform.api.p1105d.AbstractC24374c;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.d.b */
public class C24498b implements AbstractC24374c {

    /* renamed from: b */
    private static C24498b f60432b;

    /* renamed from: a */
    private Map<Class, Object> f60433a = new ConcurrentHashMap();

    private C24498b() {
    }

    /* renamed from: a */
    public static AbstractC24374c m89361a() {
        if (f60432b == null) {
            synchronized (C24498b.class) {
                if (f60432b == null) {
                    f60432b = new C24498b();
                }
            }
        }
        return f60432b;
    }

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24374c
    /* renamed from: a */
    public <T> T mo87139a(Class cls) {
        synchronized (C24498b.class) {
            if (cls != null) {
                if (this.f60433a.containsKey(cls)) {
                    return (T) this.f60433a.get(cls);
                }
            }
            return null;
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24374c
    /* renamed from: a */
    public void mo87140a(Class cls, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("setProvider:");
        if (cls != null) {
            str = cls.getName();
        } else {
            str = "";
        }
        sb.append(str);
        Log.m165389i("OPProviderManagerImpl", sb.toString());
        synchronized (C24498b.class) {
            if (!(obj == null || cls == null)) {
                this.f60433a.put(cls, obj);
            }
        }
    }
}
