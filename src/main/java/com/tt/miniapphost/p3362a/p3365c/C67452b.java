package com.tt.miniapphost.p3362a.p3365c;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67437e;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.refer.common.base.AppType;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapphost.a.c.b */
public class C67452b {

    /* renamed from: a */
    private static final Map<AppType, AbstractC67437e> f170056a = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m262375a(AbstractC67437e eVar) {
        f170056a.put(eVar.mo50158a(), eVar);
    }

    /* renamed from: a */
    public static void m262376a(Map<String, IBaseService> map) {
        if (map.size() > 0) {
            for (IBaseService iBaseService : map.values()) {
                if (iBaseService instanceof AbstractC67439g) {
                    ((AbstractC67439g) iBaseService).mo50164b();
                }
            }
        }
    }

    /* renamed from: a */
    public static <T extends IBaseService> T m262374a(IAppContext iAppContext, Map<String, IBaseService> map, Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            T t = (T) map.get(canonicalName);
            if (t != null) {
                return t;
            }
            if (iAppContext.getAppType() == null) {
                AppBrandLogger.m52831w("ModuleManager", "appContext.AppType is null");
                return null;
            }
            Objects.requireNonNull(cls);
            synchronized (cls) {
                T t2 = (T) map.get(canonicalName);
                if (t2 != null) {
                    return t2;
                }
                AbstractC67437e eVar = f170056a.get(iAppContext.getAppType());
                if (eVar == null) {
                    return null;
                }
                T t3 = (T) eVar.mo50157a(iAppContext, cls);
                if (t3 == null) {
                    return null;
                }
                map.put(canonicalName, t3);
                return t3;
            }
        }
        throw new RuntimeException("getService fail : className is null");
    }
}
