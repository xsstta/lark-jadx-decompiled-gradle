package com.larksuite.component.openplatform.core.plugin;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.p3371e.C67515e;

public class OPEventReportPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"innerMonitorReport"})
    public void eventReport(OPMonitorReportModel.Request request, LKEvent lKEvent) {
        Object obj;
        Object obj2;
        IMonitorCreator a = C67515e.m262603a(getEventContext(lKEvent));
        if (a == null) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("not support this appType monitorCode:");
            if (getEventContext(lKEvent) != null) {
                obj2 = getEventContext(lKEvent).getAppType();
            } else {
                obj2 = " error";
            }
            sb.append(obj2);
            objArr[0] = sb.toString();
            AppBrandLogger.m52829e("OPEventReportPlugin", objArr);
            return;
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventName:");
        sb2.append(request.mEventName);
        sb2.append(" code:");
        if (request.mMonitorCode != null) {
            obj = Integer.valueOf(request.mMonitorCode.mCode);
        } else {
            obj = " empty!";
        }
        sb2.append(obj);
        objArr2[0] = sb2.toString();
        AppBrandLogger.m52830i("OPEventReportPlugin", objArr2);
        OPMonitorCode oPMonitorCode = null;
        if (request.mMonitorCode != null) {
            oPMonitorCode = new OPMonitorCode(request.mMonitorCode.mDomain, request.mMonitorCode.mCode, request.mMonitorCode.mLevel, request.mMonitorCode.mMessage);
            if (!TextUtils.isEmpty(request.mMonitorCode.mID)) {
                oPMonitorCode.ID = request.mMonitorCode.mID;
            }
        }
        a.createOPMonitor(request.mEventName, oPMonitorCode).setErrorCode(request.mErrorCode).setErrorMessage(request.mErrorMessage).flush();
    }
}
