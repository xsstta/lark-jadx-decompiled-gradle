package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
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
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiUnlinkCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiUnlinkCtrlRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String filePath;

        private ApiUnlinkCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiUnlinkCtrlResponse extends C25921b {
        private ApiUnlinkCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiUnlinkCtrlResponse standard(LKEvent lKEvent, ApiUnlinkCtrlRequest apiUnlinkCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiUnlinkCtrlResponse apiUnlinkCtrlResponse = new ApiUnlinkCtrlResponse();
        String str = apiUnlinkCtrlRequest.filePath;
        b.mo92224i("ApiUnlinkCtrlPlugin", "srcPath=" + str);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235620d(new TTFile(str), new TTFileContext(lKEvent.mo92134c().mo92188a(), "unlink"))) {
                b.mo92224i("ApiUnlinkCtrlPlugin", "rm file return false");
                fillFailedResponse(apiUnlinkCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiUnlinkCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiUnlinkCtrlResponse, e, b);
        }
        return apiUnlinkCtrlResponse;
    }

    @LKPluginFunction(async = true, eventName = {"unlink"})
    public void apiUnlinkAsync(LKEvent lKEvent, ApiUnlinkCtrlRequest apiUnlinkCtrlRequest, AbstractC25897h<ApiUnlinkCtrlResponse> hVar) {
        hVar.callback(apiUnlinkImpl(lKEvent, apiUnlinkCtrlRequest, hVar));
    }

    @LKPluginFunction(eventName = {"unlink"})
    public ApiUnlinkCtrlResponse apiUnlinkSync(LKEvent lKEvent, ApiUnlinkCtrlRequest apiUnlinkCtrlRequest, AbstractC25897h<ApiUnlinkCtrlResponse> hVar) {
        return apiUnlinkImpl(lKEvent, apiUnlinkCtrlRequest, hVar);
    }

    private ApiUnlinkCtrlResponse apiUnlinkImpl(LKEvent lKEvent, ApiUnlinkCtrlRequest apiUnlinkCtrlRequest, AbstractC25897h<ApiUnlinkCtrlResponse> hVar) {
        if (TTFileHelper.m264259a("unlink", getAppContext())) {
            return standard(lKEvent, apiUnlinkCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiUnlinkCtrlResponse apiUnlinkCtrlResponse = new ApiUnlinkCtrlResponse();
        String str = apiUnlinkCtrlRequest.filePath;
        File file = new File(getApiDependency().mo235044c(str));
        b.mo92224i("ApiUnlinkCtrlPlugin", "apiName:" + lKEvent.mo92146m() + " filePath:" + apiUnlinkCtrlRequest.filePath + " realPath:" + file.getPath());
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("ApiUnlinkCtrlPlugin", "filePath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiUnlinkCtrlResponse, aVar, "path empty, filePath" + str);
            return apiUnlinkCtrlResponse;
        }
        AbstractC67722a aVar2 = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        if (!getApiDependency().mo235046c(file) && !aVar2.mo235091e(file)) {
            b.mo92223e("ApiUnlinkCtrlPlugin", "file cannot write");
            C25908c a = C25910e.m93820a(C25910e.f64126d, str);
            fillFailedResponse(apiUnlinkCtrlResponse, a, "cannot write, file:" + file.getAbsolutePath());
            return apiUnlinkCtrlResponse;
        } else if (!file.exists()) {
            b.mo92224i("ApiUnlinkCtrlPlugin", "file not exist, treat not exists as success");
            return apiUnlinkCtrlResponse;
        } else if (!file.isFile()) {
            b.mo92224i("ApiUnlinkCtrlPlugin", "not file:" + file.getPath());
            C25908c a2 = C25910e.m93820a(C25910e.f64131i, str);
            fillFailedResponse(apiUnlinkCtrlResponse, a2, "not regular file, file:" + file.getAbsolutePath());
            return apiUnlinkCtrlResponse;
        } else {
            if (!file.delete()) {
                b.mo92223e("ApiUnlinkCtrlPlugin", "delete fail, filePath=" + str);
                fillFailedResponse(apiUnlinkCtrlResponse, C25906a.f64080j, "file delete failed");
            }
            return apiUnlinkCtrlResponse;
        }
    }
}
