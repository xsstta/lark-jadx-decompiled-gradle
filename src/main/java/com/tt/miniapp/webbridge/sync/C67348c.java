package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "protocolPathToAbsPath")
/* renamed from: com.tt.miniapp.webbridge.sync.c */
public class C67348c extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "protocolPathToAbsPath";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            String optString = new JSONObject(this.mArgs).optString("protocolPath");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("absPath", optString);
            return makeOkMsg(jSONObject);
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebEventHandler", e);
            return makeFailMsg(e);
        }
    }

    public C67348c(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
