package com.ss.android.lark.littleapp.plugin;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import org.json.JSONObject;

public class OfflineFaceCheckPlugin extends OfflineFaceBasePlugin {

    public static class OfflineFaceCheckRequest extends C25920a {
        @JSONField(name = "checkUpdate")
        public boolean checkUpdate = true;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportSuccess(AbstractC25905b bVar) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.bf);
        bVar.mo92212a(request);
    }

    @LKPluginFunction(async = true, eventName = {"checkLocalFaceVerify"})
    public void faceOfflineCheckReady(OfflineFaceCheckRequest offlineFaceCheckRequest, final AbstractC25905b bVar, final AbstractC25897h<OfflineFaceBasePlugin.FaceCheckResponse> hVar) {
        AppBrandLogger.m52830i("OfflineFaceCheckPlugin", "plugin process start checkUpdate:" + offlineFaceCheckRequest.checkUpdate);
        LarkExtensionManager.getInstance().getExtension().mo49592a(offlineFaceCheckRequest.mAppIdentify, offlineFaceCheckRequest.checkUpdate, new AbstractC13317i.AbstractC13318a() {
            /* class com.ss.android.lark.littleapp.plugin.OfflineFaceCheckPlugin.C413981 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public void onResult(JSONObject jSONObject) {
                OfflineFaceCheckPlugin.this.commResultCallback(jSONObject, hVar, bVar);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportOtherFailed(AbstractC25905b bVar, int i, String str, JSONObject jSONObject) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.bg);
        request.mErrorCode = String.valueOf(i);
        request.mErrorMessage = str;
        bVar.mo92212a(request);
    }
}
