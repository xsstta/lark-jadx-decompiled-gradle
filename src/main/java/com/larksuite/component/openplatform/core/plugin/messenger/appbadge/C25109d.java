package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
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
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"reportBadge"}, support = {AppType.WebAPP, AppType.GadgetAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.d */
public class C25109d extends AbstractC65797c {

    /* renamed from: a */
    public IMonitorCreator f61357a;

    public C25109d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("reportBadge");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            mo230481a(ApiCode.GENERAL_UNABLE);
        }
        final String appId = mo230473f().getAppId();
        AppBrandLogger.m52830i("ApiHandler", "AppContextKey:" + appId);
        CommonEnum.OpenAppFeatureType a = C25105b.m90435a(bVar.mo234983a());
        if (a == null) {
            AppBrandLogger.m52830i("ApiHandler", "invalid appType, can not report local bage");
            mo230481a(ApiCode.GENERAL_UNABLE);
            return;
        }
        if (a == CommonEnum.OpenAppFeatureType.MiniApp) {
            this.f61357a = new GadgetMonitorCreator(mo230473f());
        } else {
            this.f61357a = new C13757d(mo230473f());
        }
        final int intValue = ((Integer) bVar.mo234985a("badgeNum", 0)).intValue();
        new HashMap().put(appId, Integer.valueOf(a.getValue()));
        final String a2 = C25105b.m90439a(appId, null, Integer.valueOf(intValue), a);
        ((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50446a("report_badge", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) appId).mo234760a("badge_num", (Object) Integer.valueOf(intValue)).mo234760a("feature_type", (Object) Integer.valueOf(a.getValue())).mo234763b(), new AbstractC67727a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25109d.C251101 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                AppBrandLogger.m52830i("ApiHandler", "onIpcCallback reportLocalBage");
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("report_badge_response");
                    if (TextUtils.isEmpty(b)) {
                        LarkInnerEventHelper.mpBadgeLocalOperation(C25109d.this.f61357a, "op_app_badge_pull_node", 2, a2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                        LarkInnerEventHelper.mpReportBadge(C25109d.this.f61357a, appId, a2, intValue, -1, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                        C25109d.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                        return;
                    }
                    LarkInnerEventHelper.mpBadgeLocalOperation(C25109d.this.f61357a, "op_app_badge_pull_node", 2, a2, true, null, null);
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(b);
                    } catch (JSONException e) {
                        AppBrandLogger.m52830i("ApiHandler", "ReportBadgeHandler response err = " + e.getMessage());
                        C25109d.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                    }
                    if (jSONObject == null) {
                        C25109d.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                    }
                    int optInt = jSONObject.optInt("badgeNum");
                    boolean optBoolean = jSONObject.optBoolean("isMatched");
                    LarkInnerEventHelper.mpReportBadge(C25109d.this.f61357a, appId, a2, intValue, optInt, true, null, null);
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isMatched", optBoolean);
                        C25109d.this.mo230492b(jSONObject2);
                    } catch (JSONException e2) {
                        AppBrandLogger.m52830i("ApiHandler", "ReportBadgeHandler response err = " + e2.getMessage());
                        C25109d.this.mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
                    }
                }
            }
        });
    }

    public C25109d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
