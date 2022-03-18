package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"updateBadge"}, support = {AppType.WebAPP, AppType.GadgetAPP}, testSupport = {AppType.GadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.f */
public class C25114f extends AbstractC65797c {

    /* renamed from: a */
    public IMonitorCreator f61366a;

    public C25114f() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("updateBadge");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            mo230481a(ApiCode.GENERAL_UNABLE);
        }
        String appId = mo230473f().getAppId();
        AppBrandLogger.m52830i("ApiHandler", "AppContextKey:" + appId);
        CommonEnum.OpenAppFeatureType a = C25105b.m90435a(bVar.mo234983a());
        if (a == null) {
            AppBrandLogger.m52830i("ApiHandler", "invalid appType, can not update local bage");
            mo230481a(ApiCode.GENERAL_UNABLE);
            return;
        }
        Integer num = (Integer) bVar.mo234985a("badgeNum", 0);
        C25103a.m90430a(appId, AppbrandApplicationImpl.getInst(mo230473f()).getAppInfo().appName, mo230473f().getAppType(), num.intValue());
        if (a == CommonEnum.OpenAppFeatureType.MiniApp) {
            this.f61366a = new GadgetMonitorCreator(mo230473f());
        } else {
            this.f61366a = new C13757d(mo230473f());
        }
        m90452a(appId, num, a);
    }

    public C25114f(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    public void mo88221a(boolean z, ApiCode apiCode) {
        if (!z) {
            if (apiCode == ApiCode.GENERAL_OK) {
                mo230494j();
            } else {
                mo230481a(apiCode);
            }
        }
    }

    /* renamed from: a */
    private void m90452a(String str, Integer num, CommonEnum.OpenAppFeatureType openAppFeatureType) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("badge_num", (Object) num).mo234760a("feature_type", (Object) Integer.valueOf(openAppFeatureType.getValue())).mo234763b();
        final String a = C25105b.m90439a(str, null, num, openAppFeatureType);
        ((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50446a("update_badge", b, new AbstractC67727a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25114f.C251151 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52830i("ApiHandler", "onIpcCallback updateLocalBage");
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("update_badge_response");
                    if (b != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(b);
                            int i = jSONObject.getInt("code");
                            String string = jSONObject.getString("event");
                            int i2 = jSONObject.getInt("scene");
                            boolean z = jSONObject.getBoolean("fromPull");
                            ApiCode a = C25105b.m90436a(i);
                            if (a == ApiCode.GENERAL_OK) {
                                LarkInnerEventHelper.mpBadgeLocalOperation(C25114f.this.f61366a, string, Integer.valueOf(i2), a, true, null, null);
                            } else {
                                LarkInnerEventHelper.mpBadgeLocalOperation(C25114f.this.f61366a, string, Integer.valueOf(i2), a, false, String.valueOf(a.code), a.msg);
                            }
                            C25114f.this.mo88221a(z, a);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            AppBrandLogger.m52830i("ApiHandler", "onIpcCallback updateLocalBage exception " + e.getMessage());
                        }
                    }
                } else {
                    C25114f.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                }
            }
        });
    }
}
