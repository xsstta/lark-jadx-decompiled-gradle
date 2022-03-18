package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.impl.business.file.AbstractC67918a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiGetSavedFileInfoPlugin extends OPPlugin {

    private static class ApiGetSavedFileInfoRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String mFilePath;

        private ApiGetSavedFileInfoRequest() {
        }
    }

    private static class ApiGetSavedFileInfoResponse extends C25921b {
        @JSONField(name = "createTime")
        public long mCreateTime;
        @JSONField(name = "size")
        public long mSize;

        private ApiGetSavedFileInfoResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getSavedFileInfo"})
    public void getSavedFileInfoAsync(ApiGetSavedFileInfoRequest apiGetSavedFileInfoRequest, AbstractC25895f fVar, ILogger aVar, LKEvent lKEvent, AbstractC25897h<ApiGetSavedFileInfoResponse> hVar) {
        AbstractC67918a.C67921a aVar2 = null;
        ApiGetSavedFileInfoResponse apiGetSavedFileInfoResponse = new ApiGetSavedFileInfoResponse();
        String str = apiGetSavedFileInfoRequest.mFilePath;
        aVar.mo92224i("ApiGetSavedFileInfo", "apiName=getSavedFileInfo path=" + str);
        if (TextUtils.isEmpty(str)) {
            aVar.mo92224i("ApiGetSavedFileInfo", "path is empty");
            apiGetSavedFileInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetSavedFileInfoResponse.mErrorMessage = ApiCallResultHelper.generateIllegalParamExtraInfo("filePath");
            hVar.callback(apiGetSavedFileInfoResponse);
            return;
        }
        File file = new File(getApiDependency().mo235044c(str));
        if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235089d(file)) {
            aVar.mo92224i("ApiGetSavedFileInfo", "file cannot read:" + file.getPath());
            apiGetSavedFileInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetSavedFileInfoResponse.mErrorMessage = "only user dir is allowed";
            hVar.callback(apiGetSavedFileInfoResponse);
        } else if (!file.exists()) {
            aVar.mo92224i("ApiGetSavedFileInfo", "file not exists:" + file.getPath());
            apiGetSavedFileInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetSavedFileInfoResponse.mErrorMessage = ApiCallResultHelper.generateNoSuchFileInfo(lKEvent.mo92146m(), str);
            hVar.callback(apiGetSavedFileInfoResponse);
        } else if (file.isDirectory()) {
            aVar.mo92224i("ApiGetSavedFileInfo", "file not exists:" + file.getPath());
            apiGetSavedFileInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            apiGetSavedFileInfoResponse.mErrorMessage = "only file is allowed, not dir";
            hVar.callback(apiGetSavedFileInfoResponse);
        } else {
            try {
                aVar2 = getApiDependency().mo235015a(apiGetSavedFileInfoRequest.mFilePath);
            } catch (Exception e) {
                aVar.mo92223e("ApiGetSavedFileInfo", e.getMessage());
            }
            if (aVar2 == null) {
                apiGetSavedFileInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                apiGetSavedFileInfoResponse.mErrorMessage = "fileInfo is null";
            } else {
                apiGetSavedFileInfoResponse.mSize = aVar2.f171081c;
                apiGetSavedFileInfoResponse.mCreateTime = aVar2.f171080b;
            }
            hVar.callback(apiGetSavedFileInfoResponse);
        }
    }
}
