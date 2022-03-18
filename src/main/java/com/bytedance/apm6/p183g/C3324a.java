package com.bytedance.apm6.p183g;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.C3360j;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.apm6.g.a */
public class C3324a {

    /* renamed from: a */
    public static List<AbstractC3327c> f10609a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static LinkedBlockingQueue<AbstractC3326b> f10610b = new LinkedBlockingQueue<>();

    /* renamed from: c */
    private static volatile boolean f10611c = false;

    /* renamed from: a */
    public static Thread m13870a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    private static synchronized void m13871a() {
        synchronized (C3324a.class) {
            if (!f10611c) {
                f10611c = true;
                m13870a(new Thread(new Runnable() {
                    /* class com.bytedance.apm6.p183g.C3324a.RunnableC33251 */

                    public void run() {
                        while (true) {
                            C3360j.m13993a("APM-Consumers");
                            try {
                                AbstractC3326b take = C3324a.f10610b.take();
                                for (AbstractC3327c cVar : C3324a.f10609a) {
                                    C3360j.m13993a("APM-Handler");
                                    try {
                                        if (take.mo13106h()) {
                                            cVar.mo13278a(take);
                                        } else if (C3318a.m13915u()) {
                                            C3350b.m13936c("APM-Monitor", "monitorable invalid. ignored. " + take);
                                        }
                                    } catch (Throwable th) {
                                        C3350b.m13935b("APM-Monitor", "monitorableHandler " + cVar + " handle monitorable " + take + "failed.", th);
                                    }
                                    C3360j.m13992a();
                                }
                            } catch (Throwable th2) {
                                C3350b.m13935b("APM", "Oh, Damn it!!!", th2);
                            }
                            C3360j.m13992a();
                        }
                    }
                }, "APM-Monitor")).start();
            }
        }
    }

    /* renamed from: a */
    public static void m13872a(AbstractC3326b bVar) {
        if (bVar != null) {
            f10610b.offer(bVar);
            if (!f10611c) {
                m13871a();
            }
        }
    }

    /* renamed from: a */
    public static void m13873a(AbstractC3327c cVar) {
        if (!f10609a.contains(cVar)) {
            f10609a.add(cVar);
        }
    }
}
