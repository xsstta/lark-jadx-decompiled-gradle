package com.larksuite.framework.thread;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.larksuite.framework.thread.b */
public class C26137b {

    /* renamed from: a */
    private static volatile C26137b f64533a;

    /* renamed from: b */
    private Map<Integer, C26159o> f64534b = new ConcurrentHashMap();

    /* renamed from: c */
    private volatile BlockingQueue<C26159o> f64535c = new LinkedBlockingQueue();

    /* renamed from: b */
    public Map<Integer, C26159o> mo93039b() {
        return this.f64534b;
    }

    /* renamed from: c */
    public BlockingQueue<C26159o> mo93040c() {
        return this.f64535c;
    }

    /* renamed from: a */
    public static synchronized C26137b m94599a() {
        C26137b bVar;
        synchronized (C26137b.class) {
            if (f64533a == null) {
                f64533a = new C26137b();
            }
            bVar = f64533a;
        }
        return bVar;
    }

    /* renamed from: a */
    public synchronized void mo93038a(Throwable th) {
        C26159o oVar = new C26159o();
        if (m94599a().mo93039b().get(Integer.valueOf(th.hashCode())) == null) {
            oVar.f64611a = (Exception) th;
            oVar.f64612b = 1;
            oVar.f64613c = System.currentTimeMillis();
            m94599a().mo93039b().put(Integer.valueOf(th.hashCode()), oVar);
            try {
                m94599a().mo93040c().put(oVar);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m94599a().mo93039b().get(Integer.valueOf(th.hashCode())).f64612b++;
        }
    }
}
