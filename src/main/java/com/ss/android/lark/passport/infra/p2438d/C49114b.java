package com.ss.android.lark.passport.infra.p2438d;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.passport.infra.d.b */
public class C49114b extends OPMonitor {

    /* renamed from: a */
    public static AtomicBoolean f123326a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final ThreadLocal<Integer> f123327b = new ThreadLocal<>();

    /* renamed from: c */
    private static AtomicBoolean f123328c = new AtomicBoolean(false);

    /* renamed from: d */
    private static int f123329d = 1000;

    /* renamed from: e */
    private static int f123330e = 1000;

    /* renamed from: f */
    private static final LinkedList<OPMonitor> f123331f = new LinkedList<>();

    /* renamed from: b */
    public synchronized void mo171429b() {
        m193656a(this);
    }

    @Override // com.ss.android.lark.opmonitor.service.OPMonitor
    public synchronized void flush() {
        WatcherHelper.m193661a(this);
        super.flush();
    }

    /* renamed from: c */
    public void mo171430c() {
        LinkedList linkedList;
        Log.m165389i("PassportMonitor", "handleCache start at " + Thread.currentThread().getName());
        LinkedList<OPMonitor> linkedList2 = f123331f;
        synchronized (linkedList2) {
            linkedList = new LinkedList(linkedList2);
            linkedList2.clear();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (linkedList.size() > 0) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                OPMonitor oPMonitor = (OPMonitor) it.next();
                oPMonitor.addCategoryValue("monitor_type", "type_cache");
                oPMonitor.flush();
            }
        }
        f123326a.set(true);
        Log.m165389i("PassportMonitor", "handleCache end, cacheListSize=" + linkedList.size() + ",cost =" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public boolean mo171428a() {
        boolean z;
        boolean z2 = true;
        if (f123328c.get()) {
            return true;
        }
        C48919b a = C48924d.f122912a.mo170860a();
        AtomicBoolean atomicBoolean = f123328c;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        StringBuilder sb = new StringBuilder();
        sb.append("isOpMonitorReady config != null=");
        if (a == null) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(" at thread:");
        sb.append(Thread.currentThread().getName());
        Log.m165389i("PassportMonitor", sb.toString());
        return f123328c.get();
    }

    public C49114b(OPMonitorCode oPMonitorCode) {
        super(oPMonitorCode);
    }

    /* renamed from: a */
    private synchronized void m193656a(final C49114b bVar) {
        Integer num = f123327b.get();
        if (num == null || num.intValue() <= 0) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.passport.infra.p2438d.C49114b.RunnableC491151 */

                public void run() {
                    C49114b.f123327b.set(1);
                    if (C49114b.this.mo171428a()) {
                        bVar.flush();
                        if (!C49114b.f123326a.get()) {
                            C49114b.this.mo171430c();
                        }
                    } else {
                        Log.m165389i("PassportMonitor", "flush cache at thread:" + Thread.currentThread().getName());
                        C49114b bVar = C49114b.this;
                        bVar.mo171427a(bVar.addCategoryValue("cache_create_time", Long.valueOf(System.currentTimeMillis())));
                    }
                    C49114b.f123327b.set(0);
                }
            });
            return;
        }
        Log.m165383e("PassportMonitor", "watcher flush depth return for depth>0, monitor=" + C38760a.m153057a(bVar));
    }

    /* renamed from: a */
    public void mo171427a(OPMonitor oPMonitor) {
        LinkedList<OPMonitor> linkedList = f123331f;
        synchronized (linkedList) {
            if (linkedList.size() >= f123330e) {
                Log.m165397w("PassportMonitor", "cacheMonitors clear the oldest,deleted monitor=" + C38760a.m153057a(linkedList.poll()));
            }
            linkedList.add(oPMonitor);
            Log.m165379d("PassportMonitor", "cacheMonitors add end,msg=" + C38760a.m153057a(oPMonitor));
        }
    }
}
