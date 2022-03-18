package com.ss.android.lark.platform.map;

import android.app.Activity;
import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.p2145a.AbstractC41553b;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapModuleProvider {

    /* renamed from: a */
    public static final Map<AbstractC41582a, AbstractC29586u> f128864a = new ConcurrentHashMap();

    @ClaymoreImpl(AbstractC41553b.class)
    public static class MapModuleDependencyImpl implements AbstractC41553b {
        @Override // com.ss.android.lark.location.p2145a.AbstractC41553b
        public AbstractC41553b.AbstractC41554a getAppStateDependency() {
            return new AbstractC41553b.AbstractC41554a() {
                /* class com.ss.android.lark.platform.map.MapModuleProvider.MapModuleDependencyImpl.C518532 */

                @Override // com.ss.android.lark.location.p2145a.AbstractC41553b.AbstractC41554a
                /* renamed from: a */
                public boolean mo149519a() {
                    return AppLifecycle.m200904a().mo177975e();
                }

                @Override // com.ss.android.lark.location.p2145a.AbstractC41553b.AbstractC41554a
                /* renamed from: b */
                public void mo149520b(AbstractC41582a aVar) {
                    AbstractC29586u uVar = MapModuleProvider.f128864a.get(aVar);
                    if (uVar == null) {
                        Log.m165389i("MapModuleProvider", "removeAppStateChangeListener called. but already removed.");
                        return;
                    }
                    AppLifecycle.m200904a().mo177972b(uVar);
                    MapModuleProvider.f128864a.remove(aVar);
                }

                @Override // com.ss.android.lark.location.p2145a.AbstractC41553b.AbstractC41554a
                /* renamed from: a */
                public void mo149518a(AbstractC41582a aVar) {
                    if (MapModuleProvider.f128864a.containsKey(aVar)) {
                        Log.m165389i("MapModuleProvider", "addAppStateChangeListener called. but already added.");
                        return;
                    }
                    $$Lambda$MapModuleProvider$MapModuleDependencyImpl$2$AQD8wnszCiYKsci4I2UOBzDvLPE r0 = new AbstractC29586u() {
                        /* class com.ss.android.lark.platform.map.$$Lambda$MapModuleProvider$MapModuleDependencyImpl$2$AQD8wnszCiYKsci4I2UOBzDvLPE */

                        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                        public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                            MapModuleProvider.MapModuleDependencyImpl.C518532.m201090a(AbstractC41582a.this, aVar, aVar2);
                        }
                    };
                    MapModuleProvider.f128864a.put(aVar, r0);
                    AppLifecycle.m200904a().mo177967a(r0);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m201090a(AbstractC41582a aVar, AbstractC29586u.C29587a aVar2, AbstractC29586u.C29587a aVar3) {
                    boolean c;
                    if (aVar2 != null && aVar3 != null && aVar2.mo105887c() != (c = aVar3.mo105887c()) && aVar != null) {
                        aVar.mo149537a(c);
                    }
                }
            };
        }

        @Override // com.ss.android.lark.location.p2145a.AbstractC41553b
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.location.p2145a.AbstractC41553b
        public AbstractC41553b.AbstractC41555b getLanguageDependency() {
            return new AbstractC41553b.AbstractC41555b() {
                /* class com.ss.android.lark.platform.map.MapModuleProvider.MapModuleDependencyImpl.C518521 */

                @Override // com.ss.android.lark.location.p2145a.AbstractC41553b.AbstractC41555b
                /* renamed from: a */
                public boolean mo149521a() {
                    return C36235a.m142710a().mo148281b().mo105661b();
                }
            };
        }

        public String getSpecificAMapKey() {
            return C36083a.m141486a().getThirdPartyInfoDependency().mo133119j();
        }

        @Override // com.ss.android.lark.location.p2145a.AbstractC41553b
        public Activity getTopActivity() {
            return AppLifecycle.m200904a().mo177978h();
        }

        @Override // com.ss.android.lark.location.p2145a.AbstractC41553b
        public boolean isFeatureGatingOn(String str) {
            return C37239a.m146648b().mo136951a(str);
        }
    }

    /* renamed from: a */
    public static AbstractC41567g m201088a() {
        return (AbstractC41567g) ClaymoreServiceLoader.loadFirstOrNull(AbstractC41567g.class);
    }
}
