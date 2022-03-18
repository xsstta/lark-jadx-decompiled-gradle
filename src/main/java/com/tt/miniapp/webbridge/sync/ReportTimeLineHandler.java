package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "reportTimeline")
public class ReportTimeLineHandler extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "reportTimeline";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("phase");
            AppBrandLogger.m52830i("StartApp", "reportTimeline, json: " + jSONObject);
            if (!"DOMReady".equalsIgnoreCase(optString)) {
                return makeFailMsg(ApiCallResultHelper.generateIllegalParamExtraInfo("phase"));
            }
            report(this.iAppContext, this.mRender);
            return makeOkMsg();
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebEventHandler", e);
            return makeFailMsg(e);
        }
    }

    public static void report(IAppContext iAppContext, RenderViewManager.IRender iRender) {
        AppbrandApplicationImpl.getInst(iAppContext).getTimeLineReporter().recordLaunchStopTime();
        TimeLogger.getInstance(iAppContext).logTimeDuration("ReportTimeLineHandler_DOMReady");
        if (iRender != null) {
            iRender.onDOMReady();
        }
        ((PreloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(PreloadManager.class)).preloadOnIdle();
        AppbrandApplicationImpl.getInst(iAppContext).notifyPreloadEmptyProcess();
    }

    public ReportTimeLineHandler(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
