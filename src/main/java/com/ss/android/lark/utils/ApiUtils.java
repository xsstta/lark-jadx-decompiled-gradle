package com.ss.android.lark.utils;

import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.bytedance.news.common.service.manager.C20216d;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApiUtils {
    private static final Map<Class, Object> APIS = new ConcurrentHashMap();
    private static final Map<Class, Class> API_IMPL_MAP = new ConcurrentHashMap();
    private static C57893z handler = new C57893z();
    private static boolean sEnableMockProxy = false;

    /* renamed from: com.ss.android.lark.utils.ApiUtils$a */
    public interface AbstractC57748a<T> {
        void consume(T t);
    }

    /* renamed from: com.ss.android.lark.utils.ApiUtils$b */
    public interface AbstractC57749b<T> {
        /* renamed from: a */
        T mo189978a();
    }

    private static boolean isDebug() {
        return LarkContext.getApplication().getPackageName().endsWith(".debug");
    }

    public static void enableMockProxy(boolean z) {
        sEnableMockProxy = z;
    }

    public static <T> T getApi(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        T t = (T) ClaymoreServiceLoader.loadFirstOrNull(cls);
        if (t != null) {
            return t;
        }
        if (sEnableMockProxy) {
            return (T) Proxy.newProxyInstance(handler.getClass().getClassLoader(), new Class[]{cls}, handler);
        } else if (!isDebug()) {
            return t;
        } else {
            ViewUtils.m224152b("need register(" + cls.getSimpleName() + ")");
            return t;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.utils.ApiUtils$a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void invokeApi(Class<T> cls, AbstractC57748a<T> aVar) {
        Object api;
        if (aVar != 0 && (api = getApi(cls)) != null) {
            aVar.consume(api);
        }
    }

    public static <T, E extends T> void register(Class<T> cls, Class<E> cls2) {
        if (cls == null) {
            Log.m165383e("ApiUtils", "api is null.");
        } else if (cls2 == null) {
            Log.m165383e("ApiUtils", "implClass is null.");
        } else if (!cls.isAssignableFrom(cls2)) {
            Log.m165383e("ApiUtils", "The api of <" + cls.getSimpleName() + "> register failed: " + cls2.getSimpleName() + " didn't implement api.");
        } else {
            API_IMPL_MAP.put(cls, cls2);
            Log.m165379d("ApiUtils", "The api of <" + cls.getSimpleName() + "> register <" + cls2.getSimpleName() + "> success.");
        }
    }

    public static <T> void register(Class<T> cls, T t) {
        if (cls == null) {
            Log.m165383e("ApiUtils", "api is null.");
        } else if (t == null) {
            Log.m165383e("ApiUtils", "The api of <" + cls.getSimpleName() + "> register failed: apiImpl is null.");
        } else {
            C20216d.m73785a((Class) cls, (Object) t);
            Log.m165379d("ApiUtils", "The api of <" + cls.getSimpleName() + "> register <" + t.getClass().getSimpleName() + "> instance success.");
        }
    }
}
