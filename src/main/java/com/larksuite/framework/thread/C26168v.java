package com.larksuite.framework.thread;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.thread.v */
public class C26168v {

    /* renamed from: a */
    public static String f64633a = "CoreThreadPool TestThreadPoolDelay";

    /* renamed from: b */
    public static int f64634b = 0;

    /* renamed from: c */
    private static String f64635c = "lk_test";

    /* renamed from: d */
    private static ScheduledExecutorService f64636d;

    /* renamed from: e */
    private static ScheduledFuture<?> f64637e;

    /* renamed from: f */
    private static ScheduledFuture<?> f64638f;

    /* renamed from: g */
    private static int f64639g;

    /* renamed from: com.larksuite.framework.thread.v$a */
    public static class RunnableC26169a implements Runnable {
        public void run() {
        }
    }

    /* renamed from: a */
    protected static void m94668a() {
        if (f64636d == null) {
            synchronized (C26168v.class) {
                f64636d = CoreThreadPool.getDefault().getSingleScheduledThreadPool(f64635c);
            }
        }
    }

    /* renamed from: e */
    public static void m94673e() {
        ScheduledFuture<?> scheduledFuture = f64637e;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                Log.m165385e(f64633a, "found ScheduleThreadPool schedule task delay over 10s, please check", new Throwable(), true);
                f64639g++;
                m94674f();
            } else {
                f64639g = 0;
            }
        }
        f64637e = CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new RunnableC26169a(), 0, TimeUnit.SECONDS);
    }

    /* renamed from: f */
    private static void m94674f() {
        if (f64639g >= 2) {
            C26141f fVar = (C26141f) CoreThreadPool.getDefault().getScheduleThreadPool();
            if (fVar.getCorePoolSize() < 6) {
                fVar.setCorePoolSize(6);
                Log.m165397w(f64633a, "add schedule thread pool core size 6");
            }
        }
    }

    /* renamed from: com.larksuite.framework.thread.v$b */
    public static class RunnableC26170b implements Runnable {
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C26168v.f64634b++;
            if (C26168v.f64634b % 2 == 0) {
                C26168v.m94673e();
                C26168v.m94672d();
                C26168v.m94669a((C26155n) CoreThreadPool.getDefault().getCachedThreadPool(), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            }
            C26168v.m94669a((C26155n) CoreThreadPool.getDefault().getFixedThreadPool(), 5000);
            C26168v.m94669a((C26141f) CoreThreadPool.getDefault().getScheduleThreadPool(), 5000);
            Log.m165379d(C26168v.f64633a, "check cost time:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: b */
    public static void m94670b() {
        f64639g = 0;
        if (CoreThreadPool.getScheduleDelayTestOpen()) {
            m94668a();
            synchronized (C26168v.class) {
                Log.m165389i(f64633a, "startScheduleThreadPoolTest");
                if (f64638f == null) {
                    f64638f = f64636d.scheduleWithFixedDelay(new RunnableC26170b(), 20, 5, TimeUnit.SECONDS);
                    ((C26155n) CoreThreadPool.getDefault().getCachedThreadPool()).mo93085b(true);
                    ((C26155n) CoreThreadPool.getDefault().getFixedThreadPool()).mo93085b(true);
                    ((C26141f) CoreThreadPool.getDefault().getScheduleThreadPool()).mo93050a(true);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m94671c() {
        boolean z;
        f64639g = 0;
        f64634b = 0;
        boolean z2 = !CoreThreadPool.getScheduleDelayTestOpen();
        if (f64638f == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !z) {
            m94668a();
            synchronized (C26168v.class) {
                Log.m165389i(f64633a, "stopScheduleThreadPoolTest");
                ScheduledFuture<?> scheduledFuture = f64638f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    f64638f = null;
                }
                ((C26155n) CoreThreadPool.getDefault().getCachedThreadPool()).mo93085b(false);
                ((C26155n) CoreThreadPool.getDefault().getFixedThreadPool()).mo93085b(false);
                ((C26141f) CoreThreadPool.getDefault().getScheduleThreadPool()).mo93050a(false);
            }
        }
    }

    /* renamed from: d */
    public static void m94672d() {
        C26138c cVar = (C26138c) CoreThreadPool.getDefault().getFixedThreadPool();
        int c = cVar.mo93086c();
        String str = f64633a;
        Log.m165389i(str, "backUpTaskNum:" + c);
        if (c >= 10) {
            String str2 = f64633a;
            Log.m165383e(str2, "fixedThread Pool over backup task , num:" + c);
            int min = Math.min(C26138c.f64536a * 2, (int) (((double) C26138c.f64536a) + Math.ceil((double) (((float) c) / ((float) 10)))));
            String str3 = f64633a;
            Log.m165389i(str3, "need thread num:" + min);
            if (cVar.getCorePoolSize() != min) {
                cVar.setCorePoolSize(min);
                cVar.setMaximumPoolSize(min + 3);
            }
        } else if (cVar.getCorePoolSize() != C26138c.f64536a) {
            cVar.setCorePoolSize(C26138c.f64536a);
            cVar.setMaximumPoolSize(C26138c.f64536a + 3);
        }
    }

    /* renamed from: a */
    public static void m94669a(AbstractC26160p pVar, int i) {
        synchronized (pVar.mo93051b()) {
            for (Map.Entry<String, Long> entry : pVar.mo93051b().entrySet()) {
                if (System.currentTimeMillis() - entry.getValue().longValue() > ((long) i)) {
                    String str = entry.getKey().split("#")[0];
                    long currentTimeMillis = System.currentTimeMillis() - entry.getValue().longValue();
                    C26149k.m94631a().mo93081a(C26149k.m94631a().mo93078a(str, pVar.mo93047a(), currentTimeMillis));
                    String str2 = f64633a;
                    Log.m165397w(str2, pVar.mo93047a() + ", taskname: " + str + "run time over " + currentTimeMillis);
                }
            }
        }
    }
}
