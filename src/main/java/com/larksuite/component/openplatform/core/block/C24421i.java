package com.larksuite.component.openplatform.core.block;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.p3371e.AbstractC67510c;

/* renamed from: com.larksuite.component.openplatform.core.block.i */
public class C24421i implements IMonitorCreator {

    /* renamed from: a */
    private IAppContext f60277a;

    public C24421i(IAppContext iAppContext) {
        this.f60277a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67510c createOPMonitor(String str, OPMonitorCode oPMonitorCode) {
        if (TextUtils.isEmpty(str)) {
            str = "op_monitor_event";
        }
        C24417g gVar = new C24417g(str, oPMonitorCode, this.f60277a);
        gVar.addCategoryValue("app_type", "block");
        return gVar;
    }
}
