package com.larksuite.component.openplatform.core.plugin.infra.storage;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.infra.file.Stats;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.impl.business.file.AbstractC67918a;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.util.List;

public class ApiGetSavedFileListCtrlPlugin extends OPPlugin {

    private static class ApiGetSavedFileListCtrlRequest extends C25920a {
        private ApiGetSavedFileListCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiGetSavedFileListCtrlResponse extends C25921b {
        @JSONField(name = "fileList")
        public JSONArray fileList;

        private ApiGetSavedFileListCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiGetSavedFileListCtrlResponse standard(LKEvent lKEvent) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiGetSavedFileListCtrlResponse apiGetSavedFileListCtrlResponse = new ApiGetSavedFileListCtrlResponse();
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = TTFile.f171099a;
        try {
            TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), "getSavedFileList");
            List<String> e = aVar.mo235622e(gVar, hVar);
            JSONArray jSONArray = new JSONArray();
            if (e != null && !e.isEmpty()) {
                for (String str : e) {
                    try {
                        TTFile a = gVar.mo235646a(str);
                        Stats c = aVar.mo235614c(a, hVar);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("filePath", (Object) a.mo235647a());
                        jSONObject.put("createTime", (Object) Long.valueOf(c.getLastModifiedTime()));
                        jSONObject.put("size", (Object) Long.valueOf(c.getSize()));
                        jSONArray.add(jSONObject);
                    } catch (TTFileException e2) {
                        b.mo92224i("ApiGetSavedFileListCtrlPlugin", "ttfile exception", e2);
                    }
                }
            }
            apiGetSavedFileListCtrlResponse.fileList = jSONArray;
            return apiGetSavedFileListCtrlResponse;
        } catch (TTFileException e3) {
            b.mo92224i("ApiGetSavedFileListCtrlPlugin", "ttfile exception", e3);
            fillFailedResponse(apiGetSavedFileListCtrlResponse, C25906a.f64080j, e3.getMessage());
            return apiGetSavedFileListCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getSavedFileList"})
    public void apiGetSavedFileListCtrlAsync(LKEvent lKEvent, ApiGetSavedFileListCtrlRequest apiGetSavedFileListCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiGetSavedFileListCtrlResponse> hVar) {
        if (TTFileHelper.m264259a("getSavedFileList", getAppContext())) {
            hVar.callback(standard(lKEvent));
            return;
        }
        ApiGetSavedFileListCtrlResponse apiGetSavedFileListCtrlResponse = new ApiGetSavedFileListCtrlResponse();
        try {
            List<AbstractC67918a.C67921a> c = getApiDependency().mo235045c();
            JSONArray jSONArray = new JSONArray();
            if (c != null) {
                AppBrandLogger.m52830i("ApiGetSavedFileListCtrlPlugin", "act fileInfoListLen=" + c.size());
                for (AbstractC67918a.C67921a aVar : c) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("filePath", (Object) aVar.f171079a);
                    jSONObject.put("createTime", (Object) Long.valueOf(aVar.f171080b));
                    jSONObject.put("size", (Object) Long.valueOf(aVar.f171081c));
                    jSONArray.add(jSONObject);
                }
            } else {
                AppBrandLogger.m52830i("ApiGetSavedFileListCtrlPlugin", "act fileInfoList=null");
            }
            apiGetSavedFileListCtrlResponse.fileList = jSONArray;
            hVar.callback(apiGetSavedFileListCtrlResponse);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("ApiGetSavedFileListCtrlPlugin", e.getMessage(), e);
            fillFailedResponse(apiGetSavedFileListCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
            hVar.callback(apiGetSavedFileListCtrlResponse);
        }
    }
}
