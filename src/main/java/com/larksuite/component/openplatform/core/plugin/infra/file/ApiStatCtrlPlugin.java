package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.loader.Library;
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
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiStatCtrlPlugin extends OPPlugin {
    private static volatile boolean isLibLoaded;

    /* access modifiers changed from: private */
    public static class ApiStatCtrlRequest extends C25920a {
        @JSONField(name = "path")
        @LKRequiredParam
        public String mPath;

        private ApiStatCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiStatCtrlResponse extends C25921b {
        @JSONField(name = "stat")
        public JSONObject mStat;

        private ApiStatCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static void loadLib() {
        if (!isLibLoaded) {
            synchronized (ApiStatCtrlPlugin.class) {
                if (!isLibLoaded) {
                    try {
                        AppBrandLogger.m52830i("ApiStatCtrlPlugin", "load jsbindingv2 lib for stats");
                        Library.load("jsbindingv2");
                        isLibLoaded = true;
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("ApiStatCtrlPlugin", "lib load fatal error", e);
                    }
                }
            }
        }
    }

    @LKPluginFunction(eventName = {"statSync"})
    public ApiStatCtrlResponse statSync(ApiStatCtrlRequest apiStatCtrlRequest, AbstractC25895f fVar) {
        return statInternal(apiStatCtrlRequest, fVar, "statSync");
    }

    private ApiStatCtrlResponse standard(AbstractC25895f fVar, ApiStatCtrlRequest apiStatCtrlRequest) {
        ILogger b = fVar.mo92190b();
        ApiStatCtrlResponse apiStatCtrlResponse = new ApiStatCtrlResponse();
        String str = apiStatCtrlRequest.mPath;
        b.mo92224i("ApiStatCtrlPlugin", "srcPath=" + str);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = new TTFile(str);
        try {
            TTFileContext hVar = new TTFileContext(fVar.mo92188a(), "stat");
            if (getAppContext() instanceof C67462h) {
                loadLib();
            }
            Stats c = aVar.mo235614c(gVar, hVar);
            if (c == null) {
                b.mo92224i("ApiStatCtrlPlugin", "get stat return null");
                fillFailedResponse(apiStatCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiStatCtrlResponse;
            }
            apiStatCtrlResponse.mStat = new JSONObject();
            apiStatCtrlResponse.mStat.put("mode", (Object) Integer.valueOf(c.getMode()));
            apiStatCtrlResponse.mStat.put("size", (Object) Long.valueOf(c.getSize()));
            apiStatCtrlResponse.mStat.put("lastAccessedTime", (Object) Long.valueOf(c.getLastAccessedTime()));
            apiStatCtrlResponse.mStat.put("lastModifiedTime", (Object) Long.valueOf(c.getLastModifiedTime()));
            return apiStatCtrlResponse;
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiStatCtrlResponse, e, b);
        }
    }

    @LKPluginFunction(async = true, eventName = {"stat"})
    public void statAsync(ApiStatCtrlRequest apiStatCtrlRequest, AbstractC25895f fVar, AbstractC25897h<ApiStatCtrlResponse> hVar) {
        hVar.callback(statInternal(apiStatCtrlRequest, fVar, "stat"));
    }

    private ApiStatCtrlResponse statInternal(ApiStatCtrlRequest apiStatCtrlRequest, AbstractC25895f fVar, String str) {
        if (TTFileHelper.m264259a("stat", getAppContext())) {
            return standard(fVar, apiStatCtrlRequest);
        }
        ApiStatCtrlResponse apiStatCtrlResponse = new ApiStatCtrlResponse();
        ILogger b = fVar.mo92190b();
        String str2 = apiStatCtrlRequest.mPath;
        b.mo92224i("ApiStatCtrlPlugin", "params mPath", str2);
        if (TextUtils.isEmpty(str2)) {
            b.mo92224i("ApiStatCtrlPlugin", "filePath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiStatCtrlResponse, aVar, "path empty, filePath" + str2);
            return apiStatCtrlResponse;
        }
        File file = new File(getApiDependency().mo235044c(str2));
        if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiStatCtrlPlugin", "filePath cannot be read, filePath=" + str2);
            C25908c a = C25910e.m93820a(C25910e.f64125c, str2);
            fillFailedResponse(apiStatCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            return apiStatCtrlResponse;
        } else if (!file.exists()) {
            b.mo92224i("ApiStatCtrlPlugin", "file do not exist:" + file.getAbsolutePath());
            C25908c a2 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(apiStatCtrlResponse, a2, "file not exists, file:" + file.getAbsolutePath());
            return apiStatCtrlResponse;
        } else {
            if (getAppContext() instanceof C67462h) {
                loadLib();
            }
            Stats fileStats = Stats.getFileStats(getApiDependency().mo235044c(str2));
            if (fileStats == null) {
                b.mo92223e("ApiStatCtrlPlugin", "get stat fail");
                fillFailedResponse(apiStatCtrlResponse, C25906a.f64080j, "get stat failed");
                return apiStatCtrlResponse;
            }
            apiStatCtrlResponse.mStat = new JSONObject();
            apiStatCtrlResponse.mStat.put("mode", (Object) Integer.valueOf(fileStats.getMode()));
            apiStatCtrlResponse.mStat.put("size", (Object) Long.valueOf(fileStats.getSize()));
            apiStatCtrlResponse.mStat.put("lastAccessedTime", (Object) Long.valueOf(fileStats.getLastAccessedTime()));
            apiStatCtrlResponse.mStat.put("lastModifiedTime", (Object) Long.valueOf(fileStats.getLastModifiedTime()));
            return apiStatCtrlResponse;
        }
    }
}
