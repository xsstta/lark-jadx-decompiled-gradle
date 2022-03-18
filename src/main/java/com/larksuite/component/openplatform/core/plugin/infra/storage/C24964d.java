package com.larksuite.component.openplatform.core.plugin.infra.storage;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.impl.business.file.AbstractC67918a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.d */
public class C24964d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getSavedFileInfo";
    }

    public C24964d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AbstractC67918a.C67921a aVar;
        try {
            aVar = getApiDependency().mo235015a(new JSONObject(this.mArgs).optString("filePath"));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ApiGetSavedFileInfo", e.getStackTrace());
            aVar = null;
        }
        if (aVar == null) {
            callbackDefaultMsg(false);
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("size", Long.valueOf(aVar.f171081c));
        hashMap.put("createTime", Long.valueOf(aVar.f171080b));
        callbackOtherExtraMsg(true, hashMap);
    }

    public C24964d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
