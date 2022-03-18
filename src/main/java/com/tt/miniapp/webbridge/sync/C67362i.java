package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "removeAdHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.i */
public class C67362i extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "removeAdHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (C66236a.m259222a(getApiName(), this.mCallBackId, new AbstractC67619e() {
            /* class com.tt.miniapp.webbridge.sync.C67362i.C673631 */

            @Override // com.tt.option.ext.AbstractC67619e
            public void callback(int i, String str) {
                C67362i.this.invokeHandler(str);
            }
        }, this.iAppContext)) {
            return CharacterUtils.empty();
        }
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("htmlId");
            if (this.mRender != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67362i.RunnableC673642 */

                    public void run() {
                        try {
                            if (C67362i.this.mRender != null) {
                                C67362i.this.mRender.removeNativeView(optInt, null);
                                C67362i iVar = C67362i.this;
                                iVar.invokeHandler(iVar.makeOkMsg());
                            }
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, "RemoveADHTMLWebViewHandler", e.getStackTrace());
                            try {
                                C67362i iVar2 = C67362i.this;
                                iVar2.invokeHandler(iVar2.makeFailMsg(e));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e("RemoveADHTMLWebViewHandler", "removeAdHTMLWebView", e2);
                            }
                        }
                    }
                });
                return CharacterUtils.empty();
            }
            throw new RuntimeException("render is null");
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "RemoveADHTMLWebViewHandler", e.getStackTrace());
            invokeHandler(makeFailMsg(e));
        }
    }

    public C67362i(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
