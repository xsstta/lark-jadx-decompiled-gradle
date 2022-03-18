package com.ss.lark.android.passport.biz.compat.tenant;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.lark.android.passport.biz.compat.tenant.c */
public class C64473c {

    /* renamed from: a */
    private static final Object f162796a = new Object();

    /* renamed from: b */
    private boolean f162797b;

    /* renamed from: c */
    private final Map<AbstractC49404s, Object> f162798c = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo223071a() {
        Log.m165389i("TenantModuleExport_TenantImpl", "changeTenantComplete");
        mo223073a(false);
    }

    /* renamed from: a */
    public void mo223072a(AbstractC49404s sVar) {
        this.f162798c.put(sVar, f162796a);
    }

    /* renamed from: b */
    public void mo223074b(AbstractC49404s sVar) {
        this.f162798c.remove(sVar);
    }

    /* renamed from: b */
    private void m253347b(boolean z) {
        if (z) {
            for (AbstractC49404s sVar : this.f162798c.keySet()) {
                if (sVar != null) {
                    sVar.mo144512a();
                }
            }
            return;
        }
        for (AbstractC49404s sVar2 : this.f162798c.keySet()) {
            if (sVar2 != null) {
                sVar2.mo144513a(true);
            }
        }
    }

    /* renamed from: a */
    public void mo223073a(boolean z) {
        Log.m165389i("TenantModuleExport_TenantImpl", "triggerTenantSwitchStatusChange: " + z);
        if (z != this.f162797b) {
            this.f162797b = z;
            m253347b(z);
        }
    }
}
