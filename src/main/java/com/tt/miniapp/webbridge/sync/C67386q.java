package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "showTextAreaKeyboard")
/* renamed from: com.tt.miniapp.webbridge.sync.q */
public class C67386q extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showTextAreaKeyboard";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("inputId");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67386q.RunnableC673871 */

                public void run() {
                    try {
                        AppBrandLogger.m52828d("tma_ShowTextAreaKeyboardHandler", "update text area");
                        C67386q.this.mRender.updateNativeView(optInt, C67386q.this.mArgs, null);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("tma_ShowTextAreaKeyboardHandler", "onFail", e);
                    }
                }
            });
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("updateTextArea", "ok"));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ShowTextAreaKeyboardHandler", "Exception", e);
            return makeFailMsg(e);
        }
    }

    public C67386q(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
