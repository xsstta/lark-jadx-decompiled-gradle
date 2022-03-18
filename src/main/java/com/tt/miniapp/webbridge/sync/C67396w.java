package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "updateHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.w */
public class C67396w extends AbstractC67320f {

    /* renamed from: a */
    public String f169986a = "UpdateHTMLWebViewHandler";

    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("htmlId");
            if (this.mRender != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67396w.RunnableC673971 */

                    public void run() {
                        try {
                            if (C67396w.this.mRender != null) {
                                C67396w.this.mRender.updateNativeView(optInt, C67396w.this.mArgs, null);
                                C67396w wVar = C67396w.this;
                                wVar.invokeHandler(wVar.makeOkMsg());
                            }
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, C67396w.this.f169986a, e.getStackTrace());
                            try {
                                C67396w wVar2 = C67396w.this;
                                wVar2.invokeHandler(wVar2.makeFailMsg(e));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e(C67396w.this.f169986a, "updateHTMLWebView", e2);
                            }
                        }
                    }
                });
                return CharacterUtils.empty();
            }
            AppBrandLogger.m52829e(this.f169986a, "UpdateHTMLWebView mRender is null");
            throw new RuntimeException("render is null");
        } catch (Exception e) {
            invokeHandler(makeFailMsg(e));
            AppBrandLogger.stacktrace(6, this.f169986a, e.getStackTrace());
        }
    }

    public C67396w(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
