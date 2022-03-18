package com.ss.android.lark.integrator.im.p2029i.p2030a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.sdk.C53241h;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.integrator.im.i.a.b */
public class C39657b implements AbstractC38037a.AbstractC38042b {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38042b
    /* renamed from: a */
    public long mo139221a() {
        C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
        if (v != null) {
            return v.mo105655j();
        }
        C53241h.m205894a("AppConfigDependency", "cache config is empty!");
        return 10080;
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38042b
    /* renamed from: a */
    public void mo139223a(final IGetDataCallback<HashMap<String, Boolean>> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143566c(new IGetDataCallback<AppConfig>() {
            /* class com.ss.android.lark.integrator.im.p2029i.p2030a.C39657b.C396581 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(AppConfig appConfig) {
                if (appConfig != null && iGetDataCallback != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(C37264a.f95669a, Boolean.valueOf(appConfig.isOn(C37264a.f95669a, true)));
                    hashMap.put(C37264a.f95670b, Boolean.valueOf(appConfig.isOn(C37264a.f95670b, true)));
                    hashMap.put(C37264a.f95671c, Boolean.valueOf(appConfig.isOn(C37264a.f95671c, true)));
                    iGetDataCallback.onSuccess(hashMap);
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38042b
    /* renamed from: a */
    public <T extends C41152a> T mo139222a(String str, AbstractC41160a aVar) {
        return (T) C39603g.m157159a().getCoreDependency().mo143409a(str, aVar);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38042b
    /* renamed from: a */
    public boolean mo139224a(String str, boolean z) {
        AppConfig.FeatureConfig g = C39603g.m157159a().getCoreDependency().mo143587g(str);
        if (g == null) {
            return z;
        }
        return g.isOn();
    }
}
