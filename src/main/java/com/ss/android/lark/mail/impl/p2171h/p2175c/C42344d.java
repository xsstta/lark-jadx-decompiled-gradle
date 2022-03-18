package com.ss.android.lark.mail.impl.p2171h.p2175c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.h.c.d */
public class C42344d<T extends AbstractC42231a> {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class<?>, ConcurrentHashMap<String, AbstractC42340a>> f107793a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static AbstractC42340a m169095b(Class<? extends AbstractC42340a> cls) {
        try {
            return (AbstractC42340a) cls.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m169093a(Context context) {
        String obj = context.toString();
        for (ConcurrentHashMap<String, AbstractC42340a> concurrentHashMap : f107793a.values()) {
            AbstractC42340a aVar = concurrentHashMap.get(obj);
            if (aVar != null && aVar.mo152325c()) {
                concurrentHashMap.remove(obj);
            }
        }
    }

    /* renamed from: b */
    public static void m169096b(Context context) {
        String obj = context.toString();
        for (ConcurrentHashMap<String, AbstractC42340a> concurrentHashMap : f107793a.values()) {
            AbstractC42340a aVar = concurrentHashMap.get(obj);
            if (aVar instanceof AbstractC42251b) {
                final AbstractC42251b bVar = (AbstractC42251b) aVar;
                bVar.mo152371a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d.RunnableC423451 */

                    public void run() {
                        bVar.mo152373a("cancel", 0L, false);
                    }
                });
            }
            concurrentHashMap.remove(obj);
        }
    }

    /* renamed from: c */
    public static void m169097c(Context context) {
        String obj = context.toString();
        for (ConcurrentHashMap<String, AbstractC42340a> concurrentHashMap : f107793a.values()) {
            AbstractC42340a aVar = concurrentHashMap.get(obj);
            if (aVar instanceof AbstractC42251b) {
                final AbstractC42251b bVar = (AbstractC42251b) aVar;
                bVar.mo152371a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d.RunnableC423462 */

                    public void run() {
                        bVar.mo152373a("cancel", 0L, false);
                    }
                });
                C13479a.m54764b("EventMonitorManager", bVar.getClass() + " got canceled");
            }
        }
    }

    /* renamed from: a */
    public static void m169094a(Class<?> cls) {
        ConcurrentHashMap<String, AbstractC42340a> concurrentHashMap = f107793a.get(cls);
        if (concurrentHashMap != null) {
            for (AbstractC42340a aVar : concurrentHashMap.values()) {
                if (aVar instanceof AbstractC42251b) {
                    final AbstractC42251b bVar = (AbstractC42251b) aVar;
                    bVar.mo152371a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d.RunnableC423473 */

                        public void run() {
                            bVar.mo152373a("cancel", 0L, false);
                        }
                    });
                    C13479a.m54764b("EventMonitorManager", bVar.getClass() + " got canceled");
                }
            }
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC42340a> T m169091a(Class<T> cls, Context context) {
        return (T) m169092a(cls, context, "def_bid");
    }

    /* renamed from: a */
    public static synchronized <T extends AbstractC42340a> T m169092a(Class<T> cls, Context context, String str) {
        synchronized (C42344d.class) {
            if (TextUtils.isEmpty(str)) {
                str = "def_bid";
            }
            String obj = context.toString();
            ConcurrentHashMap<Class<?>, ConcurrentHashMap<String, AbstractC42340a>> concurrentHashMap = f107793a;
            ConcurrentHashMap<String, AbstractC42340a> concurrentHashMap2 = concurrentHashMap.get(cls);
            if (concurrentHashMap2 != null && !concurrentHashMap2.isEmpty()) {
                if (concurrentHashMap2.get(obj) != null) {
                    T t = (T) concurrentHashMap2.get(obj);
                    t.mo152331f(str);
                    return t;
                }
            }
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap.put(cls, concurrentHashMap2);
            }
            T t2 = (T) m169095b(cls);
            concurrentHashMap2.put(obj, t2);
            t2.mo152331f(str);
            return t2;
        }
    }
}
