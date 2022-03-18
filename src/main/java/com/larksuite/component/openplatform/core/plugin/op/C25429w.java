package com.larksuite.component.openplatform.core.plugin.op;

import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3352w.p3354b.AbstractC67293a;
import com.tt.miniapp.p3352w.p3354b.AbstractC67297c;
import com.tt.option.ext.AbstractC67619e;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.w */
public class C25429w extends AbstractC25423u {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "removeHostEventListener";
    }

    public C25429w() {
    }

    @Override // com.larksuite.component.openplatform.core.plugin.op.AbstractC25423u
    /* renamed from: a */
    public void mo88460a(String str, AbstractC67297c cVar) {
        ConcurrentHashMap<String, AbstractC67293a> a = m90936a(getAppContext());
        if (a.containsKey(str)) {
            cVar.mo233962b(AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo().appId, str, a.get(str));
            a.remove(str);
        }
    }

    public C25429w(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
