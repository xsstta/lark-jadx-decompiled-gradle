package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "insertTextArea")
/* renamed from: com.tt.miniapp.webbridge.sync.ab */
public class C67335ab extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertTextArea";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        AppBrandLogger.m52828d("tma_WebInsertTextAreaHandler", "params ", this.mArgs, " mCallbackId ", Integer.valueOf(this.mCallBackId));
        final int a = C67302a.m262173a();
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.webbridge.sync.C67335ab.RunnableC673361 */

            public void run() {
                try {
                    boolean optBoolean = new JSONObject(C67335ab.this.mArgs).optBoolean("switchable");
                    AppBrandLogger.m52828d("tma_WebInsertTextAreaHandler", "add text area");
                    if (optBoolean) {
                        C67335ab.this.mRender.addNativeView(a, "textarea2", C67335ab.this.mArgs, null);
                    } else {
                        C67335ab.this.mRender.addNativeView(a, "textarea", C67335ab.this.mArgs, null);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("insertTextArea", "ok"));
            jSONObject.put("inputId", a);
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_WebInsertTextAreaHandler", "Exception", e);
            return makeFailMsg(e);
        }
    }

    public C67335ab(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
