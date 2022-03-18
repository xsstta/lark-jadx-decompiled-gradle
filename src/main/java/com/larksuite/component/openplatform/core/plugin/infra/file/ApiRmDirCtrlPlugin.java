package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiRmDirCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiRmDirCtrlRequest extends C25920a {
        @JSONField(name = "dirPath")
        @LKRequiredParam
        public String mDir;
        @JSONField(name = "recursive")
        public boolean mRecursive;

        private ApiRmDirCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiRmDirCtrlResponse extends C25921b {
        private ApiRmDirCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"rmdirSync"})
    public ApiRmDirCtrlResponse rmDirSync(ApiRmDirCtrlRequest apiRmDirCtrlRequest, AbstractC25895f fVar) {
        return rmDirInternal(apiRmDirCtrlRequest, fVar, "rmdirSync");
    }

    private ApiRmDirCtrlResponse standard(AbstractC25895f fVar, ApiRmDirCtrlRequest apiRmDirCtrlRequest) {
        ILogger b = fVar.mo92190b();
        ApiRmDirCtrlResponse apiRmDirCtrlResponse = new ApiRmDirCtrlResponse();
        String str = apiRmDirCtrlRequest.mDir;
        boolean z = apiRmDirCtrlRequest.mRecursive;
        b.mo92224i("ApiRmDirCtrl", "srcPath=" + str);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235611b(new TTFile(str), z, new TTFileContext(fVar.mo92188a(), "rmdir"))) {
                b.mo92224i("ApiRmDirCtrl", "rmDir file return false");
                fillFailedResponse(apiRmDirCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiRmDirCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiRmDirCtrlResponse, e, b);
        }
        return apiRmDirCtrlResponse;
    }

    @LKPluginFunction(async = true, eventName = {"rmdir"})
    public void rmDirAsync(ApiRmDirCtrlRequest apiRmDirCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiRmDirCtrlResponse> hVar) {
        hVar.callback(rmDirInternal(apiRmDirCtrlRequest, fVar, "rmdir"));
    }

    private ApiRmDirCtrlResponse rmDirInternal(ApiRmDirCtrlRequest apiRmDirCtrlRequest, AbstractC25895f fVar, String str) {
        boolean z;
        if (TTFileHelper.m264259a("removeSavedFile", getAppContext())) {
            return standard(fVar, apiRmDirCtrlRequest);
        }
        ApiRmDirCtrlResponse apiRmDirCtrlResponse = new ApiRmDirCtrlResponse();
        String str2 = apiRmDirCtrlRequest.mDir;
        File file = new File(getApiDependency().mo235044c(str2));
        ILogger b = fVar.mo92190b();
        b.mo92224i("ApiRmDirCtrl", "apiName :" + str + " dirPath:" + str2 + " recursive:" + apiRmDirCtrlRequest.mRecursive + " real path:" + file.getPath());
        if (TextUtils.isEmpty(str2)) {
            b.mo92224i("ApiRmDirCtrl", "dirPath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiRmDirCtrlResponse, aVar, "path empty, filePath" + str2);
            return apiRmDirCtrlResponse;
        } else if (getApiDependency().mo235042b(file)) {
            b.mo92223e("ApiRmDirCtrl", "user dir cannot remove");
            C25908c a = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiRmDirCtrlResponse, a, "cannot write, file is user file. file:" + file.getAbsolutePath());
            return apiRmDirCtrlResponse;
        } else if (!getApiDependency().mo235046c(file)) {
            b.mo92223e("ApiRmDirCtrl", "file cannot write");
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiRmDirCtrlResponse, a2, "cannot write, file:" + file.getAbsolutePath());
            return apiRmDirCtrlResponse;
        } else if (!file.exists()) {
            b.mo92224i("ApiRmDirCtrl", "file not exist, treat not exists as success");
            return apiRmDirCtrlResponse;
        } else if (!file.isDirectory()) {
            b.mo92223e("ApiRmDirCtrl", "file is not directory, file:" + file.getAbsolutePath());
            C25908c a3 = C25910e.m93820a(C25910e.f64130h, str2);
            fillFailedResponse(apiRmDirCtrlResponse, a3, "file is not directory, file:" + file.getAbsolutePath());
            return apiRmDirCtrlResponse;
        } else if (apiRmDirCtrlRequest.mRecursive) {
            C67586c.m263051b(file);
            return apiRmDirCtrlResponse;
        } else {
            String[] list = file.list();
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("children is null:");
            if (list == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            b.mo92224i("ApiRmDirCtrl", objArr);
            if (list == null || list.length == 0) {
                if (!file.delete()) {
                    b.mo92223e("ApiRmDirCtrl", "rmDir not success, file:" + file.getAbsolutePath());
                    fillFailedResponse(apiRmDirCtrlResponse, C25906a.f64080j, "file delete failed");
                }
                return apiRmDirCtrlResponse;
            }
            b.mo92224i("ApiRmDirCtrl", "directory is not empty:" + file.getAbsolutePath());
            C25908c a4 = C25910e.m93820a(C25910e.f64129g, str2);
            fillFailedResponse(apiRmDirCtrlResponse, a4, "directory is not empty:" + file.getAbsolutePath());
            return apiRmDirCtrlResponse;
        }
    }
}
