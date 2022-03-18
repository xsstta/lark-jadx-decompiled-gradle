package com.larksuite.component.openplatform.core.plugin.inner;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;

public class LarkApiReportAnalyticsPlugin extends OPPlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public int priority() {
        return 3;
    }

    private static class LarkApiReportAnalyticsRequest extends C25920a {
        @JSONField(name = "event")
        @LKRequiredParam
        public String mEvent;
        @JSONField(name = "value")
        @LKRequiredParam
        public JSONObject mValue;

        private LarkApiReportAnalyticsRequest() {
        }
    }

    private static class LarkApiReportAnalyticsResponse extends C25921b {
        private LarkApiReportAnalyticsResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"reportAnalytics"})
    public LarkApiReportAnalyticsResponse reportAnalyticsAsync(LarkApiReportAnalyticsRequest larkApiReportAnalyticsRequest, AbstractC25895f fVar) {
        org.json.JSONObject jSONObject;
        LarkApiReportAnalyticsResponse larkApiReportAnalyticsResponse = new LarkApiReportAnalyticsResponse();
        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.api.report_analytics")) {
            try {
                String str = larkApiReportAnalyticsRequest.mEvent;
                ILogger b = fVar.mo92190b();
                b.mo92224i("LarkApiReportAnalytics", "reportAnalytics, event: " + str);
                if (TextUtils.equals("mp_page_tti", str)) {
                    fVar.mo92190b().mo92222d("LarkApiReportAnalytics", "mp_page_tti happened");
                }
                if (TextUtils.isEmpty(str)) {
                    ILogger b2 = fVar.mo92190b();
                    b2.mo92223e("LarkApiReportAnalytics", "invalid event param, eventName: " + str);
                    larkApiReportAnalyticsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    larkApiReportAnalyticsResponse.mErrorMessage = "invalid event param";
                    return larkApiReportAnalyticsResponse;
                } else if (str.length() > 85) {
                    ILogger b3 = fVar.mo92190b();
                    b3.mo92223e("LarkApiReportAnalytics", "event name is too long, event: " + str);
                    larkApiReportAnalyticsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    larkApiReportAnalyticsResponse.mErrorMessage = "event name is too long.85";
                    return larkApiReportAnalyticsResponse;
                } else {
                    String str2 = "";
                    if (larkApiReportAnalyticsRequest.mValue != null) {
                        str2 = larkApiReportAnalyticsRequest.mValue.toJSONString();
                    }
                    if (str2.length() > 294912) {
                        ILogger b4 = fVar.mo92190b();
                        b4.mo92223e("LarkApiReportAnalytics", "event data is too long, data: " + str2);
                        larkApiReportAnalyticsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        larkApiReportAnalyticsResponse.mErrorMessage = "event data is too long";
                        return larkApiReportAnalyticsResponse;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject = new org.json.JSONObject(str2);
                    } else {
                        jSONObject = new org.json.JSONObject();
                    }
                    if (!C13377u.m54420a(str, jSONObject, getAppContext())) {
                        fVar.mo92190b().mo92223e("LarkApiReportAnalytics", "mpReportAnalytics error");
                        larkApiReportAnalyticsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        larkApiReportAnalyticsResponse.mErrorMessage = "mpReportAnalytics error";
                    }
                    return larkApiReportAnalyticsResponse;
                }
            } catch (Throwable th) {
                fVar.mo92190b().mo92223e("LarkApiReportAnalytics", th.getMessage(), th);
                larkApiReportAnalyticsResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                larkApiReportAnalyticsResponse.mErrorMessage = th.getMessage();
                return larkApiReportAnalyticsResponse;
            }
        } else {
            fVar.mo92190b().mo92223e("LarkApiReportAnalytics", "feature gating is off");
            return larkApiReportAnalyticsResponse;
        }
    }
}
