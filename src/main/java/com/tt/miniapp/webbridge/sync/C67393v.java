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

@ApiHandler(eventName = "updateAdHTMLWebView")
/* renamed from: com.tt.miniapp.webbridge.sync.v */
public class C67393v extends AbstractC67320f {

    /* renamed from: a */
    public String f169982a = "UpdateADHTMLWebViewHandler";

    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateAdHTMLWebView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (C66236a.m259222a(getApiName(), this.mCallBackId, new AbstractC67619e() {
            /* class com.tt.miniapp.webbridge.sync.C67393v.C673941 */

            @Override // com.tt.option.ext.AbstractC67619e
            public void callback(int i, String str) {
                C67393v.this.invokeHandler(str);
            }
        }, this.iAppContext)) {
            return CharacterUtils.empty();
        }
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("htmlId");
            if (this.mRender != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67393v.RunnableC673952 */

                    public void run() {
                        try {
                            if (C67393v.this.mRender != null) {
                                C67393v.this.mRender.updateNativeView(optInt, C67393v.this.mArgs, null);
                                C67393v vVar = C67393v.this;
                                vVar.invokeHandler(vVar.makeOkMsg());
                            }
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, C67393v.this.f169982a, e.getStackTrace());
                            try {
                                C67393v vVar2 = C67393v.this;
                                vVar2.invokeHandler(vVar2.makeFailMsg(e));
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e(C67393v.this.f169982a, "updateAdHTMLWebView", e2);
                            }
                        }
                    }
                });
                return CharacterUtils.empty();
            }
            throw new RuntimeException("render is null");
        } catch (Exception e) {
            invokeHandler(makeFailMsg(e));
            AppBrandLogger.stacktrace(6, this.f169982a, e.getStackTrace());
        }
    }

    public C67393v(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
