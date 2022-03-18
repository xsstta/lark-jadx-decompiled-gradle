package com.larksuite.component.openplatform.core.plugin.inner;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.h */
public class C25007h extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "reportTimelinePoints";
    }

    public C25007h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("points");
            if (!TextUtils.isEmpty(optString)) {
                MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(getAppContext()).getService(MpTimeLineReporter.class);
                mpTimeLineReporter.sendPointsDirectly(optString);
                mpTimeLineReporter.addPoint("verify_time", System.currentTimeMillis(), SystemClock.elapsedRealtime(), null);
                callbackOk();
                return;
            }
            AppBrandLogger.m52829e("ApiReportTimeLinePointsCtrl", "points is empty");
            callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo("points"));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ApiReportTimeLinePointsCtrl", ApiHandler.API_CALLBACK_EXCEPTION, e);
            callbackFail(e);
        }
    }

    public C25007h(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
