package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
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

public class ApiAccessCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiAccessCtrlRequest extends C25920a {
        @JSONField(name = "path")
        @LKRequiredParam
        public String mPath;

        private ApiAccessCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiAccessCtrlResponse extends C25921b {
        private ApiAccessCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiAccessCtrlResponse standardAccess(LKEvent lKEvent, ApiAccessCtrlRequest apiAccessCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiAccessCtrlResponse apiAccessCtrlResponse = new ApiAccessCtrlResponse();
        String str = apiAccessCtrlRequest.mPath;
        b.mo92224i("ApiAccessCtrl", "apiName=" + lKEvent.mo92146m() + " path=" + str);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        try {
            TTFile gVar = new TTFile(str);
            if (!aVar.mo235603a(gVar, new TTFileContext(lKEvent.mo92134c().mo92188a(), "access"))) {
                b.mo92224i("ApiAccessCtrl", "file not exists, file:" + gVar);
                C25908c a = C25910e.m93820a(C25910e.f64127e, str);
                fillFailedResponse(apiAccessCtrlResponse, a, "not exists, file:" + gVar);
                return apiAccessCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiAccessCtrlResponse, e, b);
        }
        return apiAccessCtrlResponse;
    }

    @LKPluginFunction(eventName = {"accessSync"})
    public ApiAccessCtrlResponse accessSync(LKEvent lKEvent, ApiAccessCtrlRequest apiAccessCtrlRequest, AbstractC25905b bVar) {
        return accessImpl(lKEvent, apiAccessCtrlRequest, bVar);
    }

    private ApiAccessCtrlResponse accessImpl(LKEvent lKEvent, ApiAccessCtrlRequest apiAccessCtrlRequest, AbstractC25905b bVar) {
        if (TTFileHelper.m264259a("access", getAppContext())) {
            return standardAccess(lKEvent, apiAccessCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiAccessCtrlResponse apiAccessCtrlResponse = new ApiAccessCtrlResponse();
        String str = apiAccessCtrlRequest.mPath;
        b.mo92224i("ApiAccessCtrl", "apiName=" + lKEvent.mo92146m() + " path=" + str);
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("ApiAccessCtrl", "path is empty, path:" + str);
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiAccessCtrlResponse, aVar, "file is empty, path:" + str);
            return apiAccessCtrlResponse;
        }
        File file = new File(getApiDependency().mo235044c(str));
        if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiAccessCtrl", "file cannot read:" + file.getAbsolutePath());
            C25908c a = C25910e.m93820a(C25910e.f64125c, str);
            fillFailedResponse(apiAccessCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            return apiAccessCtrlResponse;
        }
        if (!file.exists() && StreamLoader.findFile(str, getAppContext()) == null && !StreamLoader.isDirectoryOfPkg(str, getAppContext())) {
            b.mo92224i("ApiAccessCtrl", "file not exists, file:" + file.getAbsolutePath());
            C25908c a2 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiAccessCtrlResponse, a2, "not exists, file:" + file.getAbsolutePath());
        }
        return apiAccessCtrlResponse;
    }

    @LKPluginFunction(async = true, eventName = {"access"})
    public void accessAsync(LKEvent lKEvent, ApiAccessCtrlRequest apiAccessCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiAccessCtrlResponse> hVar) {
        hVar.callback(accessImpl(lKEvent, apiAccessCtrlRequest, bVar));
    }
}
