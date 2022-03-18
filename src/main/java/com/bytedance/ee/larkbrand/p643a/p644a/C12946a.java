package com.bytedance.ee.larkbrand.p643a.p644a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13314g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.a.a.a */
public final class C12946a {

    /* renamed from: a */
    private Map<String, C12950b> f34491a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.a.a.a$a */
    public static class C12949a {

        /* renamed from: a */
        static C12946a f34496a = new C12946a();
    }

    /* renamed from: a */
    public static C12946a m53334a() {
        return C12949a.f34496a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.a.a.a$b */
    public static class C12950b {

        /* renamed from: a */
        public String f34497a;

        /* renamed from: b */
        public final Object f34498b;

        /* renamed from: c */
        private long f34499c;

        private C12950b() {
            this.f34498b = new Object();
        }

        /* renamed from: b */
        public boolean mo48848b() {
            if (this.f34499c != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo48847a() {
            if (System.currentTimeMillis() - this.f34499c < 300000) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo48846a(String str) {
            this.f34497a = str;
            this.f34499c = System.currentTimeMillis();
        }
    }

    private C12946a() {
        this.f34491a = new HashMap();
    }

    /* renamed from: a */
    public void mo48842a(final String str) {
        C12950b bVar = this.f34491a.get(str);
        if (bVar != null) {
            if (bVar.mo48847a()) {
                AppBrandLogger.m52830i("StrategyResultHelper", "appId:" + str + " use result cache");
                return;
            }
            AppBrandLogger.m52830i("StrategyResultHelper", "appId:" + str + " has result cache, but invalid");
            this.f34491a.remove(str);
        }
        final C12950b bVar2 = new C12950b();
        this.f34491a.put(str, bVar2);
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p643a.p644a.C12946a.C129471 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AppBrandLogger.m52830i("StrategyResultHelper", "pre request:" + str);
                LarkExtensionManager.getInstance().getExtension().mo49587a(str, new AbstractC13314g.AbstractC13315a() {
                    /* class com.bytedance.ee.larkbrand.p643a.p644a.C12946a.C129471.C129481 */

                    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13314g.AbstractC13315a
                    /* renamed from: a */
                    public void mo48844a() {
                        synchronized (bVar2.f34498b) {
                            bVar2.mo48846a("");
                            AppBrandLogger.m52830i("StrategyResultHelper", "request error:" + str);
                            bVar2.f34498b.notify();
                        }
                    }

                    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13314g.AbstractC13315a
                    /* renamed from: a */
                    public void mo48845a(String str) {
                        synchronized (bVar2.f34498b) {
                            bVar2.mo48846a(str);
                            AppBrandLogger.m52830i("StrategyResultHelper", "request success:" + str);
                            bVar2.f34498b.notify();
                        }
                    }
                });
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: a */
    private void m53335a(AbstractC13314g.AbstractC13315a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo48844a();
        } else {
            aVar.mo48845a(str);
        }
    }

    /* renamed from: a */
    public void mo48843a(String str, AbstractC13314g.AbstractC13315a aVar) {
        C12950b bVar = this.f34491a.get(str);
        if (bVar != null) {
            AppBrandLogger.m52830i("StrategyResultHelper", "getPreResult:" + str);
            synchronized (bVar.f34498b) {
                if (!bVar.mo48848b()) {
                    try {
                        AppBrandLogger.m52830i("StrategyResultHelper", "get wait:" + str);
                        bVar.f34498b.wait();
                        AppBrandLogger.m52830i("StrategyResultHelper", "get result:" + str);
                        m53335a(aVar, bVar.f34497a);
                    } catch (InterruptedException unused) {
                        aVar.mo48844a();
                    }
                } else if (bVar.mo48847a()) {
                    AppBrandLogger.m52830i("StrategyResultHelper", "getPreResult from cache:" + str);
                    m53335a(aVar, bVar.f34497a);
                } else {
                    AppBrandLogger.m52830i("StrategyResultHelper", "get invalid:" + str);
                    LarkExtensionManager.getInstance().getExtension().mo49587a(str, aVar);
                    this.f34491a.remove(str);
                }
            }
            return;
        }
        AppBrandLogger.m52830i("StrategyResultHelper", "direct request appId:" + str + " usePreRequest:" + true);
        LarkExtensionManager.getInstance().getExtension().mo49587a(str, aVar);
    }
}
