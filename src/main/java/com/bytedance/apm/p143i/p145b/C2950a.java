package com.bytedance.apm.p143i.p145b;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.config.C2881a;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.p143i.p145b.p146a.C2955a;
import com.bytedance.apm.p143i.p145b.p146a.C2956b;
import com.bytedance.apm.p143i.p145b.p146a.C2957c;
import com.bytedance.apm.p150l.C3023c;
import com.bytedance.monitor.util.thread.AbstractC20190c;
import com.bytedance.monitor.util.thread.C20188b;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.i.b.a */
public class C2950a {

    /* renamed from: e */
    private static C2950a f9487e = new C2950a();

    /* renamed from: f */
    private static boolean f9488f = false;

    /* renamed from: a */
    public ReferenceQueue<Object> f9489a;

    /* renamed from: b */
    public Set<String> f9490b;

    /* renamed from: c */
    public C2881a f9491c;

    /* renamed from: d */
    private Handler f9492d;

    /* renamed from: g */
    private long f9493g;

    /* renamed from: h */
    private volatile AbstractC20190c f9494h;

    /* renamed from: c */
    private long m12425c() {
        if (this.f9493g <= 0) {
            this.f9493g = 60000;
        }
        return this.f9493g;
    }

    /* renamed from: d */
    private void m12427d() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public void mo12658b() {
        while (true) {
            C2956b bVar = (C2956b) this.f9489a.poll();
            if (bVar != null) {
                this.f9490b.remove(bVar.f9503a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo12653a() {
        long currentTimeMillis = System.currentTimeMillis();
        Runtime.getRuntime().gc();
        m12427d();
        System.runFinalization();
        if (C2785b.m11769j()) {
            C2925e.m12374c("DetectActivityLeakTask", "GC time done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }

    /* renamed from: b */
    public String mo12657b(Activity activity) {
        return activity.getLocalClassName();
    }

    /* renamed from: a */
    public void mo12654a(final Activity activity) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            /* class com.bytedance.apm.p143i.p145b.C2950a.C29544 */

            public boolean queueIdle() {
                C2955a.m12437a(activity);
                return false;
            }
        });
    }

    /* renamed from: c */
    private void m12426c(final Activity activity) {
        this.f9492d.post(new Runnable() {
            /* class com.bytedance.apm.p143i.p145b.C2950a.RunnableC29533 */

            public void run() {
                C2950a.this.mo12654a(activity);
            }
        });
    }

    /* renamed from: a */
    private void m12423a(Application application) {
        this.f9492d = new Handler(Looper.getMainLooper());
        this.f9489a = new ReferenceQueue<>();
        this.f9490b = new CopyOnWriteArraySet();
        this.f9494h = C20188b.m73688a();
        application.registerActivityLifecycleCallbacks(new C2957c() {
            /* class com.bytedance.apm.p143i.p145b.C2950a.C29511 */

            @Override // com.bytedance.apm.p143i.p145b.p146a.C2957c
            public void onActivityDestroyed(Activity activity) {
                boolean b = C3023c.m12694b("activity_leak_switch");
                if (C2785b.m11769j()) {
                    C2925e.m12374c("DetectActivityLeakTask", "activity_leak_switch : " + b);
                }
                if (b) {
                    String uuid = UUID.randomUUID().toString();
                    C2950a.this.f9490b.add(uuid);
                    C2956b bVar = new C2956b(activity, uuid, "", C2950a.this.f9489a);
                    String b2 = C2950a.this.mo12657b(activity);
                    if (C2785b.m11769j()) {
                        C2925e.m12374c("DetectActivityLeakTask", "Wait Check Leak:" + b2);
                    }
                    C2950a.this.mo12655a(bVar, b2);
                }
            }
        });
    }

    /* renamed from: d */
    private void m12428d(Activity activity) {
        if (activity != null) {
            C2955a.m12443a(activity.getClass().getName());
            if (C2785b.m11769j()) {
                C2925e.m12374c("DetectActivityLeakTask", "upload leak activity:" + activity.getLocalClassName());
            }
        }
    }

    /* renamed from: a */
    public boolean mo12656a(C2956b bVar) {
        return !this.f9490b.contains(bVar.f9503a);
    }

    /* renamed from: a */
    public static void m12424a(Application application, C2881a aVar) {
        if (application != null && aVar != null && !f9488f) {
            f9488f = true;
            f9487e.mo12659b(application, aVar);
        }
    }

    /* renamed from: b */
    public void mo12659b(Application application, C2881a aVar) {
        this.f9491c = aVar;
        this.f9493g = aVar.mo12383b();
        long currentTimeMillis = System.currentTimeMillis();
        m12423a(application);
        if (C2785b.m11769j()) {
            C2925e.m12374c("DetectActivityLeakTask", "initActivityLeakCheck done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }

    /* renamed from: b */
    public void mo12660b(C2956b bVar, String str) {
        if (C2785b.m11769j()) {
            C2925e.m12372a("DetectActivityLeakTask", "Leak:" + str);
        }
        Activity activity = (Activity) bVar.get();
        if (activity != null) {
            if (this.f9491c.mo12385d()) {
                m12426c(activity);
            }
            if (this.f9491c.mo12384c()) {
                m12428d(activity);
            }
            this.f9490b.remove(bVar.f9503a);
            AbstractC2958b e = this.f9491c.mo12386e();
            if (e != null) {
                e.mo12671a(activity);
            }
        }
    }

    /* renamed from: a */
    public void mo12655a(final C2956b bVar, final String str) {
        if (this.f9494h != null) {
            this.f9494h.mo68323a(C20188b.m73690a("LeakCheck-Thread", new Runnable() {
                /* class com.bytedance.apm.p143i.p145b.C2950a.RunnableC29522 */

                public void run() {
                    try {
                        C2950a.this.mo12658b();
                        if (C2950a.this.mo12656a(bVar)) {
                            if (C2785b.m11769j()) {
                                C2925e.m12375d("DetectActivityLeakTask", "No Leak First Check:" + str);
                            }
                        } else if (C2950a.this.f9491c.mo12382a()) {
                            C2950a.this.mo12653a();
                            C2950a.this.mo12658b();
                            if (!C2950a.this.mo12656a(bVar)) {
                                C2950a.this.mo12660b(bVar, str);
                            } else if (C2785b.m11769j()) {
                                C2925e.m12375d("DetectActivityLeakTask", "No Leak:" + str);
                            }
                        } else {
                            C2950a.this.mo12660b(bVar, str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }), m12425c());
        }
    }
}
