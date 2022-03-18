package com.tt.miniapp.webbridge.sync.p3355a;

import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.webbridge.sync.a.a */
public class C67324a extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "hidePopoverMenu";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.webbridge.sync.p3355a.C67324a.RunnableC673251 */

            public void run() {
                C67326b.m262211a(C67324a.this.iAppContext).mo233999a();
                C67324a.this.callbackOk();
            }
        });
        return CharacterUtils.empty();
    }

    public C67324a(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
