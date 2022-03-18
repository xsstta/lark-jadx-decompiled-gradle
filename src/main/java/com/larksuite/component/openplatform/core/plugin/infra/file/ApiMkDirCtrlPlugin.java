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
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiMkDirCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiMkDirCtrlRequest extends C25920a {
        @JSONField(name = "dirPath")
        @LKRequiredParam
        public String mDirPath;
        @JSONField(name = "recursive")
        public boolean mRecursive;

        private ApiMkDirCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiMkDirCtrlResponse extends C25921b {
        private ApiMkDirCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"mkdirSync"})
    public ApiMkDirCtrlResponse mkdirSync(ApiMkDirCtrlRequest apiMkDirCtrlRequest, AbstractC25895f fVar) {
        return mkdirInternal(apiMkDirCtrlRequest, fVar, "mkdirSync");
    }

    private ApiMkDirCtrlResponse standard(AbstractC25895f fVar, ApiMkDirCtrlRequest apiMkDirCtrlRequest) {
        ILogger b = fVar.mo92190b();
        ApiMkDirCtrlResponse apiMkDirCtrlResponse = new ApiMkDirCtrlResponse();
        String str = apiMkDirCtrlRequest.mDirPath;
        boolean z = apiMkDirCtrlRequest.mRecursive;
        b.mo92224i("ApiMkDirCtrl", "dir=" + str);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235604a(new TTFile(str), z, new TTFileContext(fVar.mo92188a(), "mkdir"))) {
                b.mo92224i("ApiMkDirCtrl", "mkdir return false");
                fillFailedResponse(apiMkDirCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiMkDirCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiMkDirCtrlResponse, e, b);
        }
        return apiMkDirCtrlResponse;
    }

    @LKPluginFunction(async = true, eventName = {"mkdir"})
    public void mkdirAsync(ApiMkDirCtrlRequest apiMkDirCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiMkDirCtrlResponse> hVar) {
        hVar.callback(mkdirInternal(apiMkDirCtrlRequest, fVar, "mkdir"));
    }

    private ApiMkDirCtrlResponse mkdirInternal(ApiMkDirCtrlRequest apiMkDirCtrlRequest, AbstractC25895f fVar, String str) {
        if (TTFileHelper.m264259a("mkdir", getAppContext())) {
            return standard(fVar, apiMkDirCtrlRequest);
        }
        ApiMkDirCtrlResponse apiMkDirCtrlResponse = new ApiMkDirCtrlResponse();
        ILogger b = fVar.mo92190b();
        String str2 = apiMkDirCtrlRequest.mDirPath;
        b.mo92224i("ApiMkDirCtrl", str2, Boolean.valueOf(apiMkDirCtrlRequest.mRecursive));
        File file = new File(getApiDependency().mo235044c(str2));
        if (TextUtils.isEmpty(str2)) {
            b.mo92224i("ApiMkDirCtrl", "dirPath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiMkDirCtrlResponse, aVar, "path empty, filePath" + str2);
            return apiMkDirCtrlResponse;
        } else if (!getApiDependency().mo235046c(file)) {
            b.mo92224i("ApiMkDirCtrl", "can not write file:" + file.getPath());
            C25908c a = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiMkDirCtrlResponse, a, "cannot write, file:" + file.getAbsolutePath());
            return apiMkDirCtrlResponse;
        } else if (file.exists()) {
            b.mo92224i("ApiMkDirCtrl", "file exists:" + file.getPath());
            C25908c a2 = C25910e.m93820a(C25910e.f64128f, str2);
            fillFailedResponse(apiMkDirCtrlResponse, a2, "file already exists, file:" + file.getAbsolutePath());
            return apiMkDirCtrlResponse;
        } else if (apiMkDirCtrlRequest.mRecursive || (file.getParentFile() != null && file.getParentFile().exists())) {
            try {
                if (file.mkdirs()) {
                    return apiMkDirCtrlResponse;
                }
                b.mo92223e("ApiMkDirCtrl", "mkdirs fail:" + file.getPath());
                fillFailedResponse(apiMkDirCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiMkDirCtrlResponse;
            } catch (Exception e) {
                b.mo92223e("ApiMkDirCtrl", "mkdirs exception:" + file.getPath(), e);
            }
        } else {
            b.mo92224i("ApiMkDirCtrl", "not recursive and parent not exist:" + file.getPath());
            C25908c a3 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(apiMkDirCtrlResponse, a3, "parent not exists, dest:" + file.getAbsolutePath());
            return apiMkDirCtrlResponse;
        }
    }
}
