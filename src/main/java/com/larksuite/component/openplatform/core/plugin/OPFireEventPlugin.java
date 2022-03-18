package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.AbstractC25889a;

public class OPFireEventPlugin extends AbstractC25889a {
    private IAppContext mAppContext;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public OPFireEventPlugin(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    @com.larksuite.framework.apiplugin.annotation.LKPluginFunction(async = true, eventName = {"fireEvent"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fireEvent(com.larksuite.framework.apiplugin.common.LKFireEvent.Request r10) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.OPFireEventPlugin.fireEvent(com.larksuite.framework.apiplugin.common.LKFireEvent$Request):void");
    }
}
