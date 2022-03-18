package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiUnzipCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiUnzipCtrlRequest extends C25920a {
        @JSONField(name = "targetPath")
        public String targetPath;
        @JSONField(name = "zipFilePath")
        @LKRequiredParam
        public String zipFilePath;

        private ApiUnzipCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiUnzipCtrlResponse extends C25921b {
        private ApiUnzipCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiUnzipCtrlResponse standard(LKEvent lKEvent, ApiUnzipCtrlRequest apiUnzipCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiUnzipCtrlResponse apiUnzipCtrlResponse = new ApiUnzipCtrlResponse();
        String str = apiUnzipCtrlRequest.zipFilePath;
        String str2 = apiUnzipCtrlRequest.targetPath;
        b.mo92224i("ApiUnzipCtrlPlugin", "srcPath=" + str + " destPath=" + str2);
        try {
            ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235616c(new TTFile(str), new TTFile(str2), new TTFileContext(lKEvent.mo92134c().mo92188a(), "unzip"));
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiUnzipCtrlResponse, e, b);
        }
        return apiUnzipCtrlResponse;
    }

    @LKPluginFunction(async = true, eventName = {"unzip"})
    public void apiUnzipCtrlAsync(LKEvent lKEvent, ApiUnzipCtrlRequest apiUnzipCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiUnzipCtrlResponse> hVar) {
        if (TTFileHelper.m264259a("unzip", getAppContext())) {
            hVar.callback(standard(lKEvent, apiUnzipCtrlRequest));
        }
        ApiUnzipCtrlResponse apiUnzipCtrlResponse = new ApiUnzipCtrlResponse();
        String str = apiUnzipCtrlRequest.zipFilePath;
        String str2 = apiUnzipCtrlRequest.targetPath;
        ILogger b = lKEvent.mo92134c().mo92190b();
        b.mo92224i("ApiUnzipCtrlPlugin", "handleInvoke zipFilePath=" + str + " targetPath=" + str2);
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("ApiUnzipCtrlPlugin", "zipFilePath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiUnzipCtrlResponse, aVar, "path empty, zipFilePath" + str);
            hVar.callback(apiUnzipCtrlResponse);
            return;
        }
        File file = new File(getApiDependency().mo235044c(str));
        File file2 = new File(getApiDependency().mo235044c(str2));
        StreamLoader.waitExtractFinishIfNeeded(str, getAppContext());
        if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiUnzipCtrlPlugin", "zip file cannot be read, zipFilePath=" + str);
            C25908c a = C25910e.m93820a(C25910e.f64125c, str);
            fillFailedResponse(apiUnzipCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else if (!getApiDependency().mo235046c(file2)) {
            b.mo92224i("ApiUnzipCtrlPlugin", "targetFile cannot be write, targetFile=" + file2);
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiUnzipCtrlResponse, a2, "cannot write, file:" + file2.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else if (!file.exists()) {
            b.mo92224i("ApiUnzipCtrlPlugin", "zipFile exist=" + file.exists());
            b.mo92224i("ApiUnzipCtrlPlugin", "file do not exist:" + file.getAbsolutePath());
            C25908c a3 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiUnzipCtrlResponse, a3, "file not exists, file:" + file.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else if (!file.isFile()) {
            b.mo92224i("ApiUnzipCtrlPlugin", "not file:" + file.getPath());
            C25908c a4 = C25910e.m93820a(C25910e.f64131i, str);
            fillFailedResponse(apiUnzipCtrlResponse, a4, "not regular file, file:" + file.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else if (file2.exists()) {
            b.mo92224i("ApiUnzipCtrlPlugin", "targetFile exists:" + file2.getParentFile().exists());
            C25908c a5 = C25910e.m93820a(C25910e.f64128f, str2);
            fillFailedResponse(apiUnzipCtrlResponse, a5, "targetFile exists, file:" + file2.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else if (file2.getParentFile() == null || !file2.getParentFile().exists()) {
            b.mo92224i("ApiUnzipCtrlPlugin", "targetFile is not exist, targetFilePath=" + str2);
            C25908c a6 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(apiUnzipCtrlResponse, a6, "file not exists, file:" + file2.getAbsolutePath());
            hVar.callback(apiUnzipCtrlResponse);
        } else {
            if (getApiDependency().mo235031a(IOUtils.getZipTrueSize(file.getAbsolutePath()))) {
                b.mo92223e("ApiUnzipCtrlPlugin", "over limit");
                fillFailedResponse(apiUnzipCtrlResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
                hVar.callback(apiUnzipCtrlResponse);
                return;
            }
            try {
                IOUtils.unZipFolder(file.getAbsolutePath(), file2.getAbsolutePath(), true);
                hVar.callback(apiUnzipCtrlResponse);
            } catch (Exception e) {
                b.mo92223e("ApiUnzipCtrlPlugin", "delete fail, zipFilePath=" + str, e);
                fillFailedResponse(apiUnzipCtrlResponse, C25906a.f64080j, "file delete failed");
                hVar.callback(apiUnzipCtrlResponse);
            }
        }
    }
}
