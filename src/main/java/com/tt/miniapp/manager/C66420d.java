package com.tt.miniapp.manager;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.tt.miniapp.manager.d */
public class C66420d {

    /* renamed from: a */
    public volatile boolean f167688a;

    /* renamed from: b */
    public List<AbstractC66428c> f167689b = new ArrayList();

    /* renamed from: c */
    private boolean f167690c;

    /* renamed from: d */
    private boolean f167691d;

    /* renamed from: e */
    private long f167692e = -1;

    /* renamed from: f */
    private C66426a f167693f;

    /* renamed from: g */
    private IAppContext f167694g;

    /* renamed from: h */
    private Runnable f167695h = new Runnable() {
        /* class com.tt.miniapp.manager.C66420d.RunnableC664255 */

        public void run() {
            C66420d.this.mo231966h();
        }
    };

    /* renamed from: com.tt.miniapp.manager.d$b */
    public static class C66427b implements AbstractC66428c {
        @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
        /* renamed from: a */
        public void mo88040a() {
        }

        @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
        /* renamed from: b */
        public void mo88041b() {
        }

        @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
        /* renamed from: c */
        public void mo88042c() {
        }

        @Override // com.tt.miniapp.manager.C66420d.AbstractC66428c
        /* renamed from: d */
        public void mo88043d() {
        }
    }

    /* renamed from: com.tt.miniapp.manager.d$c */
    public interface AbstractC66428c {
        /* renamed from: a */
        void mo88040a();

        /* renamed from: b */
        void mo88041b();

        /* renamed from: c */
        void mo88042c();

        /* renamed from: d */
        void mo88043d();
    }

    /* renamed from: c */
    public boolean mo231961c() {
        return !this.f167690c;
    }

    /* renamed from: d */
    public boolean mo231962d() {
        if (this.f167691d || !this.f167690c) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private long m259668l() {
        if (this.f167692e == -1) {
            return -1;
        }
        return System.currentTimeMillis() - this.f167692e;
    }

    /* renamed from: b */
    public void mo231960b() {
        C66426a aVar;
        this.f167689b.clear();
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null && (aVar = this.f167693f) != null) {
            applicationContext.unregisterReceiver(aVar);
        }
    }

    /* renamed from: h */
    public void mo231966h() {
        AppBrandLogger.m52830i("ForeBackgroundManager", "onBackgroundOverLimitTime");
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.manager.C66420d.C664233 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                synchronized (C66420d.this) {
                    if (C66420d.this.mo231961c()) {
                        if (!C66420d.this.f167688a) {
                            AppBrandLogger.m52830i("ForeBackgroundManager", "notifyOnBackgroundOverLimitTime");
                            for (AbstractC66428c cVar : C66420d.this.f167689b) {
                                cVar.mo88042c();
                            }
                        }
                    }
                }
            }
        }, C67554l.m262725b());
    }

    /* renamed from: i */
    public void mo231967i() {
        AppBrandLogger.m52830i("ForeBackgroundManager", "onTriggerHomeOrRecentApp");
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.manager.C66420d.C664244 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                synchronized (C66420d.this) {
                    for (AbstractC66428c cVar : C66420d.this.f167689b) {
                        cVar.mo88043d();
                    }
                }
            }
        }, C67554l.m262725b());
    }

    /* renamed from: k */
    public void mo231969k() {
        AppBrandLogger.m52830i("ForeBackgroundManager", "resumeBackgroundOverLimitTimeStrategy mPauseBackgroundOverLimitTimeStrategy", Boolean.valueOf(this.f167688a));
        this.f167688a = false;
    }

    /* renamed from: a */
    public void mo231957a() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext != null) {
            C66426a aVar = new C66426a();
            this.f167693f = aVar;
            m259666a(applicationContext, aVar, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    /* renamed from: e */
    public boolean mo231963e() {
        boolean z;
        if (this.f167688a) {
            AppBrandLogger.m52830i("ForeBackgroundManager", "isStayBackgroundOverLimitTime mPauseBackgroundOverLimitTimeStrategy");
            return false;
        }
        if (m259668l() > 5000) {
            z = true;
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("ForeBackgroundManager", "isStayBackgroundOverLimitTime:", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public void mo231964f() {
        IAppContext iAppContext = this.f167694g;
        if (iAppContext != null) {
            ((AbstractC67720a) iAppContext.findServiceByInterface(AbstractC67720a.class)).mo235070a();
        }
        AppBrandLogger.m52830i("ForeBackgroundManager", "onForeground");
        m259667b(true);
        this.f167692e = -1;
        this.f167688a = false;
        AppbrandContext.getMainHandler().removeCallbacks(this.f167695h);
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.manager.C66420d.C664211 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                synchronized (C66420d.this) {
                    AppBrandLogger.m52830i("ForeBackgroundManager", "notifyOnForeground");
                    for (AbstractC66428c cVar : C66420d.this.f167689b) {
                        cVar.mo88040a();
                    }
                }
            }
        }, C67554l.m262725b());
    }

    /* renamed from: j */
    public void mo231968j() {
        AppBrandLogger.m52830i("ForeBackgroundManager", "pauseBackgroundOverLimitTimeStrategy mPauseBackgroundOverLimitTimeStrategy", Boolean.valueOf(this.f167688a));
        this.f167688a = true;
        AppbrandContext.getMainHandler().removeCallbacks(this.f167695h);
    }

    /* renamed from: g */
    public void mo231965g() {
        IAppContext iAppContext = this.f167694g;
        if (iAppContext != null) {
            ((AbstractC67720a) iAppContext.findServiceByInterface(AbstractC67720a.class)).mo235073c();
        }
        AppBrandLogger.m52830i("ForeBackgroundManager", "onBackground");
        m259667b(false);
        this.f167692e = System.currentTimeMillis();
        if (!this.f167688a) {
            AppbrandContext.getMainHandler().postDelayed(this.f167695h, 5000);
        }
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.manager.C66420d.C664222 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                synchronized (C66420d.this) {
                    AppBrandLogger.m52830i("ForeBackgroundManager", "notifyOnBackground");
                    for (AbstractC66428c cVar : C66420d.this.f167689b) {
                        cVar.mo88041b();
                    }
                }
            }
        }, C67554l.m262725b());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.manager.d$a */
    public class C66426a extends BroadcastReceiver {
        private C66426a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("reason")) != null) {
                String lowerCase = stringExtra.toLowerCase();
                lowerCase.hashCode();
                char c = 65535;
                switch (lowerCase.hashCode()) {
                    case -1408204183:
                        if (lowerCase.equals("assist")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 350448461:
                        if (lowerCase.equals("recentapps")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1092716832:
                        if (lowerCase.equals("homekey")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 2014770135:
                        if (lowerCase.equals("fs_gesture")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        C66420d.this.mo231967i();
                        C66420d.this.mo231959a(true);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m259667b(boolean z) {
        this.f167690c = z;
        this.f167691d = false;
    }

    public C66420d(IAppContext iAppContext) {
        this.f167694g = iAppContext;
    }

    /* renamed from: a */
    public void mo231958a(AbstractC66428c cVar) {
        if (cVar != null) {
            synchronized (this) {
                if (!this.f167689b.contains(cVar)) {
                    this.f167689b.add(cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo231959a(boolean z) {
        AppBrandLogger.m52828d("ForeBackgroundManager", "setGoingBackground", Boolean.valueOf(z));
        this.f167691d = z;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m259666a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
