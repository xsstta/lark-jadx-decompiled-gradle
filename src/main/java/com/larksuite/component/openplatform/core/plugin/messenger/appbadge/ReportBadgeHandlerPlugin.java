package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25909d;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ReportBadgeHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;
    public ILogger mILogger;
    public IMonitorCreator monitorCreator;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class ReportBadgeHandlerRequest extends C25920a {
        @JSONField(name = "badgeNum")
        @LKRequiredParam
        public int badgeNum;

        private ReportBadgeHandlerRequest() {
        }
    }

    private static class ReportBadgeHandlerResponse extends C25921b {
        @JSONField(name = "isMatched")
        public boolean isMatched;

        private ReportBadgeHandlerResponse() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"reportBadge"})
    public void ReportBadgeHandlerAsync(LKEvent lKEvent, ReportBadgeHandlerRequest reportBadgeHandlerRequest, AbstractC25895f fVar, final AbstractC25897h<ReportBadgeHandlerResponse> hVar) {
        this.mILogger = fVar.mo92190b();
        this.mAppContext = getEventContext(lKEvent);
        final ReportBadgeHandlerResponse reportBadgeHandlerResponse = new ReportBadgeHandlerResponse();
        if (this.mAppContext == null) {
            this.mILogger.mo92223e("ReportBadgeHandlerPlugin", "app context is null");
            fillFailedResponse(reportBadgeHandlerResponse, C25906a.f64080j, "app context is null");
            hVar.callback(reportBadgeHandlerResponse);
            return;
        }
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            fillFailedResponse(reportBadgeHandlerResponse, C25906a.f64078h, C25906a.f64078h.f64117J);
            hVar.callback(reportBadgeHandlerResponse);
        }
        final String appId = this.mAppContext.getAppId();
        ILogger aVar = this.mILogger;
        aVar.mo92224i("ReportBadgeHandlerPlugin", "AppContextKey:" + appId);
        CommonEnum.OpenAppFeatureType a = C25105b.m90435a(this.mAppContext.getAppType());
        if (a == null) {
            this.mILogger.mo92224i("ReportBadgeHandlerPlugin", "invalid appType, can not report local bage");
            fillFailedResponse(reportBadgeHandlerResponse, C25909d.f64118a, "invalid appType, can not report local bage");
            hVar.callback(reportBadgeHandlerResponse);
            return;
        }
        if (a == CommonEnum.OpenAppFeatureType.MiniApp) {
            this.monitorCreator = new GadgetMonitorCreator(this.mAppContext);
        } else {
            this.monitorCreator = new C13757d(this.mAppContext);
        }
        final int i = reportBadgeHandlerRequest.badgeNum;
        new HashMap().put(appId, Integer.valueOf(a.getValue()));
        final String a2 = C25105b.m90439a(appId, null, Integer.valueOf(i), a);
        ((AbstractC67724a) this.mAppContext.findServiceByInterface(AbstractC67724a.class)).mo50446a("report_badge", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) appId).mo234760a("badge_num", (Object) Integer.valueOf(i)).mo234760a("feature_type", (Object) Integer.valueOf(a.getValue())).mo234763b(), new AbstractC67727a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.ReportBadgeHandlerPlugin.C251001 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                JSONObject jSONObject;
                ReportBadgeHandlerPlugin.this.mILogger.mo92224i("ReportBadgeHandlerPlugin", "onIpcCallback reportLocalBage");
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("report_badge_response");
                    if (TextUtils.isEmpty(b)) {
                        LarkInnerEventHelper.mpBadgeLocalOperation(ReportBadgeHandlerPlugin.this.monitorCreator, "op_app_badge_pull_node", 2, a2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                        LarkInnerEventHelper.mpReportBadge(ReportBadgeHandlerPlugin.this.monitorCreator, appId, a2, i, -1, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                        ReportBadgeHandlerPlugin.this.fillFailedResponse(reportBadgeHandlerResponse, C25906a.f64081k, "result is empty");
                        hVar.callback(reportBadgeHandlerResponse);
                        return;
                    }
                    LarkInnerEventHelper.mpBadgeLocalOperation(ReportBadgeHandlerPlugin.this.monitorCreator, "op_app_badge_pull_node", 2, a2, true, null, null);
                    try {
                        jSONObject = new JSONObject(b);
                    } catch (JSONException e) {
                        ILogger aVar = ReportBadgeHandlerPlugin.this.mILogger;
                        aVar.mo92224i("ReportBadgeHandlerPlugin", "ReportBadgeHandler response err = " + e.getMessage());
                        ReportBadgeHandlerPlugin reportBadgeHandlerPlugin = ReportBadgeHandlerPlugin.this;
                        ReportBadgeHandlerResponse reportBadgeHandlerResponse = reportBadgeHandlerResponse;
                        C25906a aVar2 = C25906a.f64081k;
                        reportBadgeHandlerPlugin.fillFailedResponse(reportBadgeHandlerResponse, aVar2, "ReportBadgeHandler response err = " + e.getMessage());
                        hVar.callback(reportBadgeHandlerResponse);
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        ReportBadgeHandlerPlugin.this.fillFailedResponse(reportBadgeHandlerResponse, C25906a.f64080j, "responseObject = null");
                        hVar.callback(reportBadgeHandlerResponse);
                    }
                    int optInt = jSONObject.optInt("badgeNum");
                    boolean optBoolean = jSONObject.optBoolean("isMatched");
                    LarkInnerEventHelper.mpReportBadge(ReportBadgeHandlerPlugin.this.monitorCreator, appId, a2, i, optInt, true, null, null);
                    ReportBadgeHandlerResponse reportBadgeHandlerResponse2 = new ReportBadgeHandlerResponse();
                    reportBadgeHandlerResponse2.isMatched = optBoolean;
                    hVar.callback(reportBadgeHandlerResponse2);
                }
            }
        });
    }
}
