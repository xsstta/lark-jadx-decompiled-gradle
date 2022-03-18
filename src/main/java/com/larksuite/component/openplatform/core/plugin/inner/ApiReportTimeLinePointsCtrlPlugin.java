package com.larksuite.component.openplatform.core.plugin.inner;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.MpTimeLineReporter;

public class ApiReportTimeLinePointsCtrlPlugin extends OPPlugin {

    private static class ApiReportTimeLinePointsCtrlRequest extends C25920a {
        @JSONField(name = "points")
        @LKRequiredParam
        public String mPoints;

        private ApiReportTimeLinePointsCtrlRequest() {
        }
    }

    private static class ApiReportTimeLinePointsCtrlResponse extends C25921b {
        private ApiReportTimeLinePointsCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"reportTimelinePoints"})
    public void reportTimeLinePoints(ApiReportTimeLinePointsCtrlRequest apiReportTimeLinePointsCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiReportTimeLinePointsCtrlResponse> hVar) {
        ApiReportTimeLinePointsCtrlResponse apiReportTimeLinePointsCtrlResponse = new ApiReportTimeLinePointsCtrlResponse();
        try {
            String str = apiReportTimeLinePointsCtrlRequest.mPoints;
            if (!TextUtils.isEmpty(str)) {
                MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(getAppContext()).getService(MpTimeLineReporter.class);
                mpTimeLineReporter.sendPointsDirectly(str);
                mpTimeLineReporter.addPoint("verify_time", System.currentTimeMillis(), SystemClock.elapsedRealtime(), null);
            } else {
                fVar.mo92190b().mo92223e("ApiReportTimeLinePointsCtrl", "points is empty");
                apiReportTimeLinePointsCtrlResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
                apiReportTimeLinePointsCtrlResponse.mErrorMessage = "points is empty.";
            }
        } catch (Exception e) {
            fVar.mo92190b().mo92223e("ApiReportTimeLinePointsCtrl", ApiHandler.API_CALLBACK_EXCEPTION, e);
            apiReportTimeLinePointsCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiReportTimeLinePointsCtrlResponse.mErrorMessage = e.getMessage();
        }
        hVar.callback(apiReportTimeLinePointsCtrlResponse);
    }
}
