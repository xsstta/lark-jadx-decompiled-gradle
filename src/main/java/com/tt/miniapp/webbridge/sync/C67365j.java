package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "removeHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.j */
public class C67365j extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "removeHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("htmlId");
            if (this.mRender != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67365j.RunnableC673661 */

                    public void run() {
                        try {
                            if (C67365j.this.mRender != null) {
                                C67365j.this.mRender.removeNativeView(optInt, null);
                                C67365j jVar = C67365j.this;
                                jVar.invokeHandler(jVar.makeOkMsg());
                            }
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, "RemoveHTMLWebViewHandler", e.getStackTrace());
                            try {
                                C67365j jVar2 = C67365j.this;
                                jVar2.invokeHandler(jVar2.makeFailMsg(e));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e("RemoveHTMLWebViewHandler", "removeHTMLWebView", e2);
                            }
                        }
                    }
                });
            } else {
                AppBrandLogger.m52829e("RemoveHTMLWebViewHandler", "render is null");
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "RemoveHTMLWebViewHandler", e.getStackTrace());
            invokeHandler(makeFailMsg(e));
        }
        return CharacterUtils.empty();
    }

    public C67365j(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
