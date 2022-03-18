package com.ss.android.lark.platform.p2499s.p2500a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.monitor.C48248r;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.platform.p2494o.C51886a;
import com.ss.android.lark.rust.track.C53165b;
import com.ss.android.lark.rust.track.IRustTrackModuleDependency;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.s.a.a */
public class C51949a {

    /* renamed from: a */
    public static final Map<IRustTrackModuleDependency.AppStateChangeListener, AbstractC29586u> f128997a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.platform.s.a.a$a */
    public static class C51953a {

        /* renamed from: a */
        public static final IRustTrackModuleDependency f129002a = C51949a.m201492a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C53165b m201493a() {
        return new C53165b(C51953a.f129002a);
    }

    /* renamed from: a */
    public static IRustTrackModuleDependency m201492a(final Application application) {
        return new IRustTrackModuleDependency() {
            /* class com.ss.android.lark.platform.p2499s.p2500a.C51949a.C519501 */

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: b */
            public String mo178124b() {
                return LarkSettingModuleProvider.m200903a().mo148458l();
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: c */
            public boolean mo178127c() {
                return AppLifecycle.m200904a().mo177975e();
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: a */
            public void mo178120a() {
                C48246q a = C51886a.m201246a();
                C48248r.m190384a(new C48248r.AbstractC48249a() {
                    /* class com.ss.android.lark.platform.p2499s.p2500a.C51949a.C519501.C519511 */

                    @Override // com.ss.android.lark.monitor.C48248r.AbstractC48249a
                    /* renamed from: b */
                    public JSONObject mo102825b() {
                        return CoreThreadPool.collectCoreThreadPoolMetric();
                    }

                    @Override // com.ss.android.lark.monitor.C48248r.AbstractC48249a
                    /* renamed from: a */
                    public ScheduledExecutorService mo102824a() {
                        return CoreThreadPool.getDefault().getScheduleThreadPool();
                    }
                });
                a.mo168808a(a.mo168806a(application).mo168789a(false).mo168788a(C57881t.m224639k(application)).mo168792b(C26246a.m94977a(application)).mo168787a($$Lambda$a$1$kCXDFvPYYaNfoMFeDTY_6zA7_E.INSTANCE).mo168793b(C26252ad.m94993b(application)).mo168794c(C26252ad.m94992a(application)).mo168795c(false).mo168796d(":pushservice").mo168796d(":push").mo168785a(6).mo168784a(2.0f).mo168791b(1.0f).mo168786a(a.mo168805a()).mo168797d(AppLifecycle.m200904a().mo177975e()).mo168790a());
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: a */
            public void mo178121a(ComponentCallbacks2 componentCallbacks2) {
                ComponentCallbacks2C51833b.m200972b(componentCallbacks2);
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: b */
            public void mo178125b(ComponentCallbacks2 componentCallbacks2) {
                ComponentCallbacks2C51833b.m200968a(componentCallbacks2);
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: a */
            public void mo178122a(final IRustTrackModuleDependency.AppStateChangeListener aVar) {
                C519522 r0 = new AbstractC29586u() {
                    /* class com.ss.android.lark.platform.p2499s.p2500a.C51949a.C519501.C519522 */

                    @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                    public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                        aVar.mo181561a(aVar2.mo105887c());
                    }
                };
                C51949a.f128997a.put(aVar, r0);
                AppLifecycle.m200904a().mo177967a(r0);
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: b */
            public void mo178126b(IRustTrackModuleDependency.AppStateChangeListener aVar) {
                AbstractC29586u uVar = C51949a.f128997a.get(aVar);
                if (uVar != null) {
                    AppLifecycle.m200904a().mo177972b(uVar);
                    C51949a.f128997a.remove(aVar);
                }
            }

            @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency
            /* renamed from: a */
            public boolean mo178123a(String str, boolean z) {
                return C37239a.m146648b().mo136952a(str, z);
            }
        };
    }
}
