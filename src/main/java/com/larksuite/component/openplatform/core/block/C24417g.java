package com.larksuite.component.openplatform.core.block;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p690e.C13537b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.tt.miniapphost.p3371e.AbstractC67510c;

/* renamed from: com.larksuite.component.openplatform.core.block.g */
public class C24417g extends AbstractC67510c {

    /* renamed from: b */
    private static C48924d f60249b;

    /* renamed from: b */
    public static C48924d m89088b() {
        if (f60249b == null) {
            synchronized (C13537b.class) {
                if (f60249b == null) {
                    f60249b = m262592c();
                }
            }
        }
        return f60249b;
    }

    public C24417g(String str, IAppContext iAppContext) {
        super(m89088b(), str, C24418h.f60252b, iAppContext);
    }

    public C24417g(String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(m89088b(), str, oPMonitorCode, iAppContext);
        addCategoryValue("op_app_type", "op_app_type_blockit");
    }
}
