package com.tt.refer.common.util;

import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Scheduler;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.optrace.p2413c.p2414a.C48934a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.tt.refer.common.util.g */
public class C67866g {
    /* renamed from: a */
    public static Thread m264023a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public static boolean m264030a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m264031b(Runnable runnable) {
        if (runnable != null) {
            AppbrandContext.getMainHandler().removeCallbacks(runnable);
        }
    }

    /* renamed from: c */
    public static void m264032c(Runnable runnable) {
        if (m264030a()) {
            C67554l.m262725b().execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m264027a(Runnable runnable) {
        m264029a(runnable, true);
    }

    /* renamed from: a */
    public static ThreadFactory m264024a(final String str, final boolean z) {
        return new ThreadFactory() {
            /* class com.tt.refer.common.util.C67866g.ThreadFactoryC678682 */

            /* renamed from: a */
            public static Thread m264033a(Thread thread) {
                return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
            }

            public Thread newThread(Runnable runnable) {
                if (HostDependManager.getInst().getFeatureGating("gadget.log.trace")) {
                    C48934a aVar = new C48934a(runnable, str);
                    aVar.setDaemon(z);
                    return aVar;
                }
                Thread a = m264033a(new Thread(runnable, str));
                a.setDaemon(z);
                return a;
            }
        };
    }

    /* renamed from: a */
    public static void m264025a(Action action, Scheduler scheduler) {
        m264026a(action, scheduler, true);
    }

    /* renamed from: a */
    public static Thread m264022a(Runnable runnable, String str) {
        if (HostDependManager.getInst().getFeatureGating("gadget.log.trace")) {
            return new C48934a(runnable, str);
        }
        return m264023a(new Thread(runnable, str));
    }

    /* renamed from: a */
    public static void m264028a(Runnable runnable, long j) {
        if (j <= 0) {
            m264027a(runnable);
        } else {
            AppbrandContext.getMainHandler().postDelayed(runnable, j);
        }
    }

    /* renamed from: a */
    public static void m264029a(Runnable runnable, boolean z) {
        if (!m264030a() || !z) {
            AppbrandContext.getMainHandler().post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m264026a(Action action, Scheduler scheduler, boolean z) {
        if (z || m264030a()) {
            Observable.create(action).schudleOn(scheduler).subscribe(new Subscriber() {
                /* class com.tt.refer.common.util.C67866g.C678671 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onSuccess() {
                }

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onSuccess(Object obj) {
                }

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.eWithThrowable("ThreadUtil", "runOnWorkThread", th);
                }
            });
        } else {
            action.act();
        }
    }
}
