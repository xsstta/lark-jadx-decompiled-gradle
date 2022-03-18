package com.bytedance.ee.ref.card.p690e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.p3371e.AbstractC67510c;

/* renamed from: com.bytedance.ee.ref.card.e.c */
public class C13538c implements IMonitorCreator {

    /* renamed from: a */
    private IAppContext f35640a;

    public C13538c(IAppContext iAppContext) {
        this.f35640a = iAppContext;
    }

    /* renamed from: a */
    public AbstractC67510c createOPMonitor(String str, OPMonitorCode oPMonitorCode) {
        if (TextUtils.isEmpty(str)) {
            str = "op_monitor_event";
        }
        C13537b bVar = new C13537b(str, oPMonitorCode, this.f35640a);
        bVar.addCategoryValue("app_type", "native_card");
        return bVar;
    }
}
