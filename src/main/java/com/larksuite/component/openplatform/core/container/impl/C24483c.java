package com.larksuite.component.openplatform.core.container.impl;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a;
import com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24560a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.meta.base.AbsAppMeta;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.c */
public class C24483c extends AbstractC24459a {

    /* renamed from: a */
    private boolean f60404a;

    /* renamed from: b */
    private String f60405b = "";

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a
    /* renamed from: a */
    public boolean mo87272a() {
        return this.f60404a;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a
    /* renamed from: b */
    public String mo87274b() {
        return this.f60405b;
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a
    /* renamed from: a */
    public void mo87271a(AbsAppMeta absAppMeta) {
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.blockit.open_shema_white_list", false);
        AppBrandLogger.m52830i("BlockMetaWhiteListService", "saveWhiteList ", absAppMeta.getAppId(), " enable fg: " + featureGating);
        if (featureGating && (absAppMeta instanceof C24560a)) {
            C24560a aVar = (C24560a) absAppMeta;
            try {
                this.f60404a = aVar.mo87515c();
                JSONArray jSONArray = new JSONArray();
                List<ApplicationMeta.C24550b> b = aVar.mo87512b();
                if (b != null) {
                    for (ApplicationMeta.C24550b bVar : b) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("schema", bVar.mo87489b());
                        jSONObject.put("host", bVar.mo87487a());
                        jSONArray.put(jSONObject);
                    }
                }
                String jSONArray2 = jSONArray.toString();
                this.f60405b = jSONArray2;
                AppBrandLogger.m52830i("BlockMetaWhiteListService", "block openScheme white list ", jSONArray2);
            } catch (JSONException unused) {
                AppBrandLogger.m52829e("BlockMetaWhiteListService", new Object[0]);
            }
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a
    /* renamed from: a */
    public boolean mo87273a(String str, String str2, IAppContext iAppContext) {
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.blockit.open_shema_white_list", false);
        AppBrandLogger.m52830i("BlockMetaWhiteListService", "isSafeDomain", " enable fg: " + featureGating);
        if (!featureGating) {
            return true;
        }
        boolean isCheckSafeDomain = HostDependManager.getInst().isCheckSafeDomain(true, str, str2, iAppContext);
        AppBrandLogger.m52830i("BlockMetaWhiteListService", "isSafeDomain", " check result: ", str2, " result: ", Boolean.valueOf(isCheckSafeDomain));
        return !isCheckSafeDomain;
    }
}
