package com.bytedance.monitor.util.thread;

import java.util.Locale;

/* renamed from: com.bytedance.monitor.util.thread.b */
public class C20188b {
    /* renamed from: a */
    public static AbstractC20190c m73688a() {
        return C20176a.m73641a();
    }

    /* renamed from: a */
    public static String m73691a(AbstractRunnableC20192d dVar) {
        if (dVar == null) {
            return "null";
        }
        return dVar.mo12092a() + ", " + dVar.mo12093b();
    }

    /* renamed from: b */
    public static AbstractRunnableC20192d m73693b(String str, Runnable runnable) {
        return m73689a(AsyncTaskType.IO, str, runnable);
    }

    /* renamed from: a */
    public static AbstractRunnableC20192d m73690a(String str, Runnable runnable) {
        return m73689a(AsyncTaskType.LIGHT_WEIGHT, str, runnable);
    }

    /* renamed from: a */
    public static AbstractRunnableC20192d m73689a(final AsyncTaskType asyncTaskType, final String str, final Runnable runnable) {
        return new AbstractRunnableC20192d() {
            /* class com.bytedance.monitor.util.thread.C20188b.C201891 */

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: a */
            public String mo12092a() {
                return str;
            }

            @Override // com.bytedance.monitor.util.thread.AbstractRunnableC20192d
            /* renamed from: b */
            public AsyncTaskType mo12093b() {
                return asyncTaskType;
            }

            public void run() {
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                        AbstractC20190c a = C20188b.m73688a();
                        if (a != null && a.mo68329c() != null && a.mo68329c().mo68353a()) {
                            AbstractC20193e c = a.mo68329c();
                            C20188b.m73692a(c, "AsyncTaskUtil", "task execute: " + asyncTaskType + "  /  " + str);
                        }
                    }
                } catch (Throwable th) {
                    C20188b.m73688a().mo68325a(th, "APM_INNER_ERROR_async_task");
                }
            }
        };
    }

    /* renamed from: a */
    public static void m73692a(AbstractC20193e eVar, String str, String str2) {
        if (eVar != null && eVar.mo68353a()) {
            String name = Thread.currentThread().getName();
            eVar.mo68352a(str, String.format(Locale.CHINA, "[callerThread: %s] \n %s", name, str2));
        }
    }
}
