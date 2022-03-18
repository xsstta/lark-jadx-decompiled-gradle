package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "updateTextArea")
/* renamed from: com.tt.miniapp.webbridge.sync.z */
public class C67402z extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateTextArea";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67402z.RunnableC674031 */

                public void run() {
                    try {
                        AppBrandLogger.m52828d("WebEventHandler", "update text area");
                        C67402z.this.mRender.updateNativeView(new JSONObject(C67402z.this.mArgs).optInt("inputId"), C67402z.this.mArgs, null);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("WebEventHandler", e);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("updateTextArea", "ok"));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("WebEventHandler", "Exception", e);
            return makeFailMsg(e);
        }
    }

    public C67402z(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
