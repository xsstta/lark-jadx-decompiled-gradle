package com.ss.android.lark.littleapp.plugin;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.larksuite.component.openplatform.core.plugin.OPFileInnerPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin;
import com.ss.android.lark.littleapp.util.MainTTFileHelper;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.impl.business.file.TTFile;
import org.json.JSONObject;

public class OfflineFaceStartPlugin extends OfflineFaceBasePlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    /* access modifiers changed from: private */
    public static class OfflineFaceStartRequest extends C25920a {
        @JSONField(name = "path")
        public String mPath;

        private OfflineFaceStartRequest() {
        }
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportSuccess(AbstractC25905b bVar) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.bk);
        bVar.mo92212a(request);
    }

    public /* synthetic */ void lambda$standardFaceOfflineStart$0$OfflineFaceStartPlugin(AbstractC25897h hVar, LKEvent lKEvent, JSONObject jSONObject) {
        commResultCallback(jSONObject, hVar, lKEvent.mo92136d());
    }

    private void standardFaceOfflineStart(OfflineFaceStartRequest offlineFaceStartRequest, LKEvent lKEvent, AbstractC25897h<OfflineFaceBasePlugin.FaceCheckResponse> hVar) {
        AppBrandLogger.m52830i("OfflineFaceStartPlugin", "offline face  origin path = " + offlineFaceStartRequest.mPath);
        String str = offlineFaceStartRequest.mPath;
        if (!TextUtils.isEmpty(str)) {
            if (new TTFile(str).mo235649c()) {
                OpenPlatform.GetSystemFileRequest getSystemFileRequest = new OpenPlatform.GetSystemFileRequest();
                getSystemFileRequest.mTTFilePath = offlineFaceStartRequest.mPath;
                getSystemFileRequest.mTag = lKEvent.mo92146m();
                str = ((OpenPlatform.GetSystemFileResponse) lKEvent.mo92136d().mo92210a("getSystemFile", getSystemFileRequest, OpenPlatform.GetSystemFileResponse.class)).mFilePath;
            }
            AppBrandLogger.m52830i("OfflineFaceStartPlugin", "after transfer path = " + str);
        }
        Log.m165389i("OfflineFaceStartPlugin", "faceOfflineStart , path = " + str);
        LarkExtensionManager.getInstance().getExtension().mo49590a(offlineFaceStartRequest.mAppIdentify, str, new AbstractC13317i.AbstractC13318a(hVar, lKEvent) {
            /* class com.ss.android.lark.littleapp.plugin.$$Lambda$OfflineFaceStartPlugin$IKbTwiQS3cqcpxp6tfDtf3_uN8 */
            public final /* synthetic */ AbstractC25897h f$1;
            public final /* synthetic */ LKEvent f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public final void onResult(JSONObject jSONObject) {
                OfflineFaceStartPlugin.this.lambda$standardFaceOfflineStart$0$OfflineFaceStartPlugin(this.f$1, this.f$2, jSONObject);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportOtherFailed(AbstractC25905b bVar, int i, String str, JSONObject jSONObject) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.bl);
        request.mErrorCode = String.valueOf(i);
        request.mErrorMessage = str;
        bVar.mo92212a(request);
    }

    @LKPluginFunction(async = true, eventName = {"startLocalFaceVerify"})
    public void faceOfflineStart(OfflineFaceStartRequest offlineFaceStartRequest, LKEvent lKEvent, final AbstractC25905b bVar, final AbstractC25897h<OfflineFaceBasePlugin.FaceCheckResponse> hVar) {
        AppBrandLogger.m52830i("OfflineFaceStartPlugin", "offline face  origin path = " + offlineFaceStartRequest.mPath);
        if (MainTTFileHelper.m163936a(lKEvent.mo92146m())) {
            AppBrandLogger.m52830i("OfflineFaceStartPlugin", "use new sandbox");
            standardFaceOfflineStart(offlineFaceStartRequest, lKEvent, hVar);
            return;
        }
        String str = offlineFaceStartRequest.mPath;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("ttfile://")) {
                OPFileInnerPlugin.GetTTFileInfoRequest getTTFileInfoRequest = new OPFileInnerPlugin.GetTTFileInfoRequest();
                getTTFileInfoRequest.mTTFilePath = offlineFaceStartRequest.mPath;
                str = ((OPFileInnerPlugin.GetTTFileInfoResponse) bVar.mo92210a("getTTFileInfo", getTTFileInfoRequest, OPFileInnerPlugin.GetTTFileInfoResponse.class)).mRealFilePath;
            }
            AppBrandLogger.m52830i("OfflineFaceStartPlugin", "after transfer path = " + str);
        }
        Log.m165389i("OfflineFaceStartPlugin", "faceOfflineStart , path = " + str);
        LarkExtensionManager.getInstance().getExtension().mo49590a(offlineFaceStartRequest.mAppIdentify, str, new AbstractC13317i.AbstractC13318a() {
            /* class com.ss.android.lark.littleapp.plugin.OfflineFaceStartPlugin.C414021 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public void onResult(JSONObject jSONObject) {
                OfflineFaceStartPlugin.this.commResultCallback(jSONObject, hVar, bVar);
            }
        });
    }
}
