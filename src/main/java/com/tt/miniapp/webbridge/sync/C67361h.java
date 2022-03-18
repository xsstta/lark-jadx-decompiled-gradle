package com.tt.miniapp.webbridge.sync;

import com.tt.miniapp.C66546p;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.refer.common.annotation.ApiHandler;

@ApiHandler(eventName = "postErrors")
/* renamed from: com.tt.miniapp.webbridge.sync.h */
public class C67361h extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public boolean canOverride() {
        return false;
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "postErrors";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        if (this.iAppContext.getCurrentActivity() == null || !(this.iAppContext instanceof AbstractC67433a)) {
            return makeFailMsg("activity is null");
        }
        AbstractC67434b a = ((AbstractC67433a) this.iAppContext).mo234156a();
        if (!(a instanceof C66546p)) {
            return makeFailMsg("is not mini app");
        }
        ((C66546p) a).mo232125f(this.mArgs);
        return makeOkMsg();
    }

    public C67361h(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
