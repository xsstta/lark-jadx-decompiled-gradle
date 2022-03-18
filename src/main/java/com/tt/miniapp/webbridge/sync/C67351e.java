package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "insertAdHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.e */
public class C67351e extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertAdHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (C66236a.m259222a(getApiName(), this.mCallBackId, new AbstractC67619e() {
            /* class com.tt.miniapp.webbridge.sync.C67351e.C673521 */

            @Override // com.tt.option.ext.AbstractC67619e
            public void callback(int i, String str) {
                C67351e.this.invokeHandler(str);
            }
        }, this.iAppContext)) {
            return CharacterUtils.empty();
        }
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67351e.RunnableC673532 */

                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        AppBrandLogger.m52828d("tma_InsertADHTMLWebViewHandler", "insertHtml webviewId ", Integer.valueOf(AppbrandApplicationImpl.getInst(C67351e.this.iAppContext).getRenderViewManager().getCurrentIRender().getRenderViewId()));
                        JSONObject jSONObject2 = new JSONObject(C67351e.this.mArgs);
                        int a = C67302a.m262173a();
                        jSONObject2.put("htmlId", a);
                        C67351e.this.mRender.addNativeView(a, "adWebHtml", jSONObject2.toString(), null);
                        jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67351e.this.buildErrorMsg("insertAdHTMLWebView", "ok"));
                        jSONObject.put("htmlId", a);
                        AppbrandApplicationImpl.getInst(C67351e.this.iAppContext).getRenderViewManager().invokeHandler(C67351e.this.mRender.getRenderViewId(), C67351e.this.mCallBackId, jSONObject.toString());
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "tma_InsertADHTMLWebViewHandler", e.getStackTrace());
                        try {
                            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67351e.this.buildErrorMsg("insertAdHTMLWebView", "fail"));
                            AppbrandApplicationImpl.getInst(C67351e.this.iAppContext).getRenderViewManager().invokeHandler(C67351e.this.mRender.getRenderViewId(), C67351e.this.mCallBackId, jSONObject.toString());
                        } catch (Exception e2) {
                            AppBrandLogger.m52829e("tma_InsertADHTMLWebViewHandler", "insertAdHTMLWebView", e2);
                        }
                    }
                }
            });
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_InsertADHTMLWebViewHandler", e.getStackTrace());
        }
        return CharacterUtils.empty();
    }

    public C67351e(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
