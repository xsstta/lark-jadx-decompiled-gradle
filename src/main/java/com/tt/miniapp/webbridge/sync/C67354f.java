package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "insertHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.f */
public class C67354f extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67354f.RunnableC673551 */

                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        AppBrandLogger.m52830i("tma_InsertHTMLWebViewHandle", "insertHtml webviewId ", Integer.valueOf(AppbrandApplicationImpl.getInst(C67354f.this.iAppContext).getRenderViewManager().getCurrentIRender().getRenderViewId()));
                        JSONObject jSONObject2 = new JSONObject(C67354f.this.mArgs);
                        int a = C67302a.m262173a();
                        jSONObject2.put("htmlId", a);
                        C67354f.this.mRender.addNativeView(a, "webHtml", jSONObject2.toString(), null);
                        jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67354f.this.buildErrorMsg("insertHTMLWebView", "ok"));
                        jSONObject.put("htmlId", a);
                        AppbrandApplicationImpl.getInst(C67354f.this.iAppContext).getRenderViewManager().invokeHandler(C67354f.this.mRender.getRenderViewId(), C67354f.this.mCallBackId, jSONObject.toString());
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "tma_InsertHTMLWebViewHandle", e.getStackTrace());
                        try {
                            jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67354f.this.buildErrorMsg("insertHTMLWebView", "fail"));
                            AppbrandApplicationImpl.getInst(C67354f.this.iAppContext).getRenderViewManager().invokeHandler(C67354f.this.mRender.getRenderViewId(), C67354f.this.mCallBackId, jSONObject.toString());
                        } catch (Exception e2) {
                            AppBrandLogger.m52829e("tma_InsertHTMLWebViewHandle", "insertHTMLWebView", e2);
                        }
                    }
                }
            });
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_InsertHTMLWebViewHandle", e.getStackTrace());
            return makeFailMsg(e);
        }
    }

    public C67354f(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
