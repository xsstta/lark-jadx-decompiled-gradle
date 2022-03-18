package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.infra.file.Stats;
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

public class ApiGetFileInfoCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiGetFileInfoCtrlRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String filePath;

        private ApiGetFileInfoCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiGetFileInfoCtrlResponse extends C25921b {
        @JSONField(name = "size")
        public long size;

        private ApiGetFileInfoCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiGetFileInfoCtrlResponse standardGetFileInfo(LKEvent lKEvent, ApiGetFileInfoCtrlRequest apiGetFileInfoCtrlRequest) {
        ApiGetFileInfoCtrlResponse apiGetFileInfoCtrlResponse = new ApiGetFileInfoCtrlResponse();
        ILogger b = lKEvent.mo92134c().mo92190b();
        String str = apiGetFileInfoCtrlRequest.filePath;
        b.mo92224i("ApiGetFileInfoCtrlPlugin", "filePath=" + str);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = new TTFile(str);
        if (gVar.mo235650d() || gVar.mo235651e()) {
            b.mo92224i("ApiGetFileInfoCtrlPlugin", "invalid ttfile" + gVar);
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(apiGetFileInfoCtrlResponse, aVar2, "file is empty, path:" + gVar);
            return apiGetFileInfoCtrlResponse;
        }
        try {
            Stats c = aVar.mo235614c(gVar, new TTFileContext(lKEvent.mo92134c().mo92188a(), "getFileInfo"));
            if (c == null) {
                b.mo92224i("ApiGetFileInfoCtrlPlugin", "copy file return false");
                fillFailedResponse(apiGetFileInfoCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiGetFileInfoCtrlResponse;
            }
            b.mo92224i("ApiGetFileInfoCtrlPlugin", "fileSize=" + c.getSize());
            apiGetFileInfoCtrlResponse.size = c.getSize();
            return apiGetFileInfoCtrlResponse;
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiGetFileInfoCtrlResponse, e, b);
            return apiGetFileInfoCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getFileInfo"})
    public void getFileInfoAsync(LKEvent lKEvent, ApiGetFileInfoCtrlRequest apiGetFileInfoCtrlRequest, ILogger aVar, AbstractC25897h<ApiGetFileInfoCtrlResponse> hVar) {
        if (TTFileHelper.m264259a("getFileInfo", getAppContext())) {
            hVar.callback(standardGetFileInfo(lKEvent, apiGetFileInfoCtrlRequest));
            return;
        }
        ApiGetFileInfoCtrlResponse apiGetFileInfoCtrlResponse = new ApiGetFileInfoCtrlResponse();
        String str = apiGetFileInfoCtrlRequest.filePath;
        if (TextUtils.isEmpty(str)) {
            aVar.mo92224i("filePath is empty", new Object[0]);
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(apiGetFileInfoCtrlResponse, aVar2, "path empty, filePath" + str);
            hVar.callback(apiGetFileInfoCtrlResponse);
            return;
        }
        String c = getApiDependency().mo235044c(str);
        aVar.mo92224i("ApiGetFileInfoCtrlPlugin", "act filePath=" + str + " realFilePath=" + c);
        File file = new File(c);
        if (!getApiDependency().mo235035a(file)) {
            aVar.mo92224i("ApiGetFileInfoCtrlPlugin", "file can not read:" + file.getAbsolutePath());
            C25908c a = C25910e.m93820a(C25910e.f64125c, file);
            fillFailedResponse(apiGetFileInfoCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            hVar.callback(apiGetFileInfoCtrlResponse);
        } else if (!file.exists()) {
            aVar.mo92224i("ApiGetFileInfoCtrlPlugin", "file do not exist:" + c);
            C25908c a2 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiGetFileInfoCtrlResponse, a2, "file not exists, file:" + file.getAbsolutePath());
            hVar.callback(apiGetFileInfoCtrlResponse);
        } else {
            aVar.mo92224i("ApiGetFileInfoCtrlPlugin", "fileSize=" + file.length());
            apiGetFileInfoCtrlResponse.size = file.length();
            hVar.callback(apiGetFileInfoCtrlResponse);
        }
    }
}
