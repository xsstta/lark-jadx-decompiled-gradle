package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "disableScrollBounce")
/* renamed from: com.tt.miniapp.webbridge.sync.aa */
public class C67334aa extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "disableScrollBounce";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        boolean z;
        try {
            z = new JSONObject(this.mArgs).optBoolean("disable");
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "WebEventHandler", e.getStackTrace());
            z = false;
        }
        if (!(this.mRender instanceof AppbrandFragment)) {
            return makeFailMsg("render type error");
        }
        ((AppbrandFragment) this.mRender).setDisableRefresh(z);
        return makeOkMsg();
    }

    public C67334aa(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
