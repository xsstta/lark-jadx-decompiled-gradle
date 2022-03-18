package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.c */
public class C24963c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getFileInfo";
    }

    public C24963c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("filePath");
            String c = getApiDependency().mo235044c(optString);
            AppBrandLogger.m52830i("ApiGetFileInfoCtrl", "act filePath=" + optString + " realFilePath=" + c);
            File file = new File(c);
            if (TextUtils.isEmpty(optString)) {
                callbackFail(ApiCallResultHelper.generateFilePermissionDenyInfo(true, getActionName(), optString));
            } else if (!getApiDependency().mo235035a(file) || !file.exists()) {
                AppBrandLogger.m52830i("ApiGetFileInfoCtrl", "act file do not exist");
                callbackFail(ApiCallResultHelper.generateNoSuchFileInfo(getActionName(), optString));
            } else {
                AppBrandLogger.m52830i("ApiGetFileInfoCtrl", "act fileSize=" + file.length());
                HashMap hashMap = new HashMap();
                hashMap.put("size", Long.valueOf(file.length()));
                callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "ApiGetFileInfoCtrl", e.getStackTrace());
            callbackFail(e);
        }
    }

    public C24963c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
