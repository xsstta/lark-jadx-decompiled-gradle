package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "removeTextArea")
/* renamed from: com.tt.miniapp.webbridge.sync.k */
public class C67367k extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "removeTextArea";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("inputId");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67367k.RunnableC673681 */

                public void run() {
                    AppBrandLogger.m52828d("RemoveTextAreaHandler", "remove text area");
                    C67047m.m261304a(C67367k.this.iAppContext.getCurrentActivity());
                    C67367k.this.mRender.removeNativeView(optInt, null);
                }
            });
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("RemoveTextAreaHandler", "Exception", e);
            return makeFailMsg(e);
        }
    }

    public C67367k(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
