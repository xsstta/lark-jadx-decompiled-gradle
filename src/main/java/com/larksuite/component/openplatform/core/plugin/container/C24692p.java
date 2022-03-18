package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.common.util.C67866g;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.p */
public class C24692p {

    /* renamed from: a */
    public static final Queue<Runnable> f60733a = new LinkedList();

    /* renamed from: b */
    public static final Queue<Runnable> f60734b = new LinkedList();

    /* renamed from: c */
    public static boolean f60735c;

    /* renamed from: a */
    private static void m89745a() {
        if (!f60734b.isEmpty()) {
            C67866g.m264025a(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.container.C24692p.C246931 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    synchronized (C24692p.f60734b) {
                        while (true) {
                            Runnable poll = C24692p.f60734b.poll();
                            if (poll != null) {
                                poll.run();
                            }
                        }
                    }
                }
            }, Schedulers.longIO());
        }
    }

    /* renamed from: b */
    private static void m89748b() {
        if (!f60733a.isEmpty()) {
            C67866g.m264025a(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.container.C24692p.C246942 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    synchronized (C24692p.f60733a) {
                        while (true) {
                            Runnable poll = C24692p.f60733a.poll();
                            if (poll != null) {
                                poll.run();
                            }
                        }
                    }
                }
            }, Schedulers.longIO());
        }
    }

    /* renamed from: a */
    public static void m89746a(IAppContext iAppContext) {
        if (m89750c(iAppContext)) {
            m89745a();
        }
        m89748b();
    }

    /* renamed from: b */
    public static void m89749b(IAppContext iAppContext) {
        if (!f60735c) {
            f60735c = true;
            m89745a();
        }
    }

    /* renamed from: c */
    private static boolean m89750c(IAppContext iAppContext) {
        AppConfig appConfig;
        AppInfoEntity appInfo;
        String str;
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst == null || (appConfig = inst.getAppConfig()) == null || (appInfo = inst.getAppInfo()) == null) {
            return true;
        }
        if (!TextUtils.isEmpty(appInfo.startPage)) {
            str = appInfo.startPage;
        } else {
            str = appConfig.f165497d;
        }
        return !C67054r.m261341a(str, appConfig);
    }

    /* renamed from: a */
    public static void m89747a(IAppContext iAppContext, Runnable runnable) {
        if (f60735c) {
            runnable.run();
            return;
        }
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        if (inst == null) {
            runnable.run();
            return;
        }
        C66890j routeEventCtrl = inst.getRouteEventCtrl();
        if (routeEventCtrl.mo232879h()) {
            runnable.run();
        } else if (!routeEventCtrl.mo232878g() || !m89750c(iAppContext)) {
            Queue<Runnable> queue = f60734b;
            synchronized (queue) {
                queue.offer(runnable);
            }
        } else {
            runnable.run();
        }
    }
}
