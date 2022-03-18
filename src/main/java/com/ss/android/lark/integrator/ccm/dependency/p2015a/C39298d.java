package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.basesdk.p253d.AbstractC4470b;
import com.bytedance.ee.bear.basesdk.p253d.C4466a;
import com.bytedance.ee.bear.dto.DocAppUserConfig;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.biz.core.api.AbstractC29560g;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.d */
class C39298d implements AbstractC4470b {

    /* renamed from: a */
    Map<AbstractC39300a, AbstractC29560g> f100634a = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.d$a */
    public interface AbstractC39300a {
        void onAppConfigReady();
    }

    C39298d() {
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4470b
    /* renamed from: a */
    public C4466a.C4467a mo17237a() {
        DocAppUserConfig d = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30992d();
        if (!d.getUrlRegex().isEmpty()) {
            return new C4466a.C4467a(d.getUrlRegex(), DynamicConfigModule.m145551a(DomainSettings.Alias.PASSPORT));
        }
        Log.m165389i("AppUserConfigAgentImpl", "update url regex fail url regex is empty");
        return null;
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4470b
    /* renamed from: a */
    public void mo17238a(C4466a.AbstractC4468b bVar) {
        m155007a(new AbstractC39300a() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$d$riT0KEFgec_P8dqOzPPG2BDDD9Q */

            @Override // com.ss.android.lark.integrator.ccm.dependency.p2015a.C39298d.AbstractC39300a
            public final void onAppConfigReady() {
                C39298d.lambda$riT0KEFgec_P8dqOzPPG2BDDD9Q(C4466a.AbstractC4468b.this);
            }
        });
    }

    /* renamed from: a */
    private void m155007a(final AbstractC39300a aVar) {
        C392991 r0 = new AbstractC29560g() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39298d.C392991 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29560g
            public void notifyCacheUpdated(C29550b bVar) {
                AbstractC39300a aVar = aVar;
                if (aVar != null) {
                    aVar.onAppConfigReady();
                }
            }
        };
        this.f100634a.put(aVar, r0);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerAppConfigCacheCallback(r0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m155008b(C4466a.AbstractC4468b bVar) {
        Log.m165389i("DocSdkProxy", "appconfig create ready");
        DocAppUserConfig d = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30992d();
        if (d.getUrlRegex().isEmpty()) {
            Log.m165389i("DocSdkProxy", "update url regex fail url regex is empty");
        } else {
            bVar.onAppUserConfigChange(new C4466a.C4467a(d.getUrlRegex(), DynamicConfigModule.m145551a(DomainSettings.Alias.PASSPORT)));
        }
    }
}
