package com.bytedance.dataplatform;

import android.app.Application;
import com.bytedance.dataplatform.p233a.C3985a;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.dataplatform.b */
public class C3987b {

    /* renamed from: a */
    public static AbstractC3995h f12128a;

    /* renamed from: b */
    public static volatile C3982a f12129b;

    /* renamed from: c */
    private static final Map<String, Object> f12130c = new ConcurrentHashMap();

    /* renamed from: d */
    private static volatile Future f12131d;

    /* renamed from: e */
    private static boolean f12132e = false;

    /* renamed from: a */
    public static void m16617a() {
        m16620b();
        f12129b.mo15677b();
    }

    /* renamed from: b */
    private static void m16620b() {
        if (f12131d != null) {
            try {
                f12131d.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("ExperimentManager has not been init (obtain)");
        }
    }

    /* renamed from: a */
    public static void m16619a(boolean z) {
        f12132e = z;
    }

    /* renamed from: a */
    public static <T> T m16615a(String str, Type type, T t, boolean z, boolean z2) {
        return (T) m16616a(str, type, t, z, z2, null);
    }

    /* renamed from: a */
    public static <T> T m16616a(String str, Type type, T t, boolean z, boolean z2, C3985a<T> aVar) {
        T t2;
        T t3;
        T t4;
        m16620b();
        if (z) {
            Map<String, Object> map = f12130c;
            if (map.containsKey(str) && map.get(str).getClass() == type) {
                try {
                    return (T) map.get(str);
                } catch (Exception unused) {
                }
            }
        }
        T t5 = (T) C3989c.m16621a(str, type);
        if (t5 != null) {
            if (z) {
                f12130c.put(str, t5);
            }
            return t5;
        } else if (!f12132e || (t4 = (T) f12129b.mo15675a(str, type, null, z2)) == null) {
            AbstractC3995h hVar = f12128a;
            if (hVar != null && (t3 = (T) hVar.mo15699a(str, type, null)) != null) {
                if (z) {
                    f12130c.put(str, t3);
                }
                return t3;
            } else if (f12132e || (t2 = (T) f12129b.mo15675a(str, type, null, z2)) == null) {
                T t6 = (T) f12129b.mo15674a(str, aVar, z2);
                if (t6 != null) {
                    if (z) {
                        f12130c.put(str, t6);
                    }
                    return t6;
                }
                if (z && t != null) {
                    f12130c.put(str, t);
                }
                return t;
            } else {
                if (z) {
                    f12130c.put(str, t2);
                }
                return t2;
            }
        } else {
            if (z) {
                f12130c.put(str, t4);
            }
            return t4;
        }
    }

    /* renamed from: a */
    public static void m16618a(final Application application, final String str, final boolean z, final AbstractC3995h hVar, final AbstractC3994g gVar, final AbstractC3992e eVar, final AbstractC3993f fVar) {
        f12131d = C3996i.m16638a(new Runnable() {
            /* class com.bytedance.dataplatform.C3987b.RunnableC39881 */

            public void run() {
                C3987b.f12129b = new C3982a(application, str, z, gVar, eVar, fVar);
                C3987b.f12128a = hVar;
                C3989c.m16622a(application, hVar, gVar, C3987b.f12129b);
            }
        });
    }
}
