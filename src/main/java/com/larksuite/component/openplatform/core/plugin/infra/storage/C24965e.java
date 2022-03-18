package com.larksuite.component.openplatform.core.plugin.infra.storage;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.impl.business.file.AbstractC67918a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.e */
public class C24965e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getSavedFileList";
    }

    public C24965e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            List<AbstractC67918a.C67921a> c = getApiDependency().mo235045c();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (c != null) {
                AppBrandLogger.m52830i("ApiGetSavedFileListCtrl", "act fileInfoListLen=" + c.size());
                for (AbstractC67918a.C67921a aVar : c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("filePath", aVar.f171079a);
                    jSONObject2.put("createTime", aVar.f171080b);
                    jSONObject2.put("size", aVar.f171081c);
                    jSONArray.put(jSONObject2);
                }
            } else {
                AppBrandLogger.m52830i("ApiGetSavedFileListCtrl", "act fileInfoList=null");
            }
            jSONObject.put("fileList", jSONArray);
            AppBrandLogger.m52830i("ApiGetSavedFileListCtrl", "act fileList=" + jSONArray.toString());
            callbackOk(jSONObject);
        } catch (Exception e) {
            callbackFail(e);
            AppBrandLogger.eWithThrowable("ApiGetSavedFileListCtrl", e.getMessage(), e);
        }
    }

    public C24965e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
