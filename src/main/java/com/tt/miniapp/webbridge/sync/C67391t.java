package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "systemLog")
/* renamed from: com.tt.miniapp.webbridge.sync.t */
public class C67391t extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "systemLog";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("tag");
            C66020b.m258530a(optString, this.iAppContext).mo231091a(jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).mo231092a();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("SystemLogHandler", "Exception", e);
        }
        return CharacterUtils.empty();
    }

    public C67391t(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
