package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "updateInput")
/* renamed from: com.tt.miniapp.webbridge.sync.x */
public class C67398x extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateInput";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            if (this.mRender == null) {
                return makeFailMsg("render is null");
            }
            final int optInt = new JSONObject(this.mArgs).optInt("inputId");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67398x.RunnableC673991 */

                public void run() {
                    if (C67398x.this.mRender != null) {
                        C67398x.this.mRender.updateNativeView(optInt, C67398x.this.mArgs, null);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("updateInput", "ok"));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_UpdateInputHandler", e.getStackTrace());
            return makeFailMsg(e);
        }
    }

    public C67398x(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
