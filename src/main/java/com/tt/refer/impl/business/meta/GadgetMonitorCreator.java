package com.tt.refer.impl.business.meta;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.p3371e.AbstractC67510c;
import com.tt.miniapphost.p3371e.p3372a.C67500a;

public class GadgetMonitorCreator implements IMonitorCreator {
    private IAppContext mAppContext;

    public GadgetMonitorCreator(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    @Override // com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator
    public AbstractC67510c createOPMonitor(String str, OPMonitorCode oPMonitorCode) {
        if (TextUtils.isEmpty(str)) {
            str = "op_monitor_event";
        }
        C67500a aVar = new C67500a(str, oPMonitorCode, this.mAppContext);
        aVar.addCategoryValue("app_type", "native_app");
        aVar.mo234325a(this.mAppContext.getAppId());
        return aVar;
    }
}
