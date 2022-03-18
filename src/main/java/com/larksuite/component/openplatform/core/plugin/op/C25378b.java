package com.larksuite.component.openplatform.core.plugin.op;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.C67432a;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.b */
public class C25378b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "applyUpdate";
    }

    public C25378b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (C67432a.m262319a(getAppContext()).getUpdateAppInfo() != null) {
            C66036d.m258605c(C67432a.m262319a(getAppContext()).getUpdateAppInfo().version, C67432a.m262319a(getAppContext()).getAppInfo().version, getAppContext());
        }
        C66612a.m260227a(C67432a.m262319a(getAppContext()).getAppInfo().appId, C67432a.m262319a(getAppContext()).getSchema(), true);
    }

    public C25378b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
