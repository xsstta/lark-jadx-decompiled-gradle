package com.larksuite.component.openplatform.core.plugin.op;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.p3398s.AbstractC67675b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.e */
public class C25382e extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "checkSession";
    }

    public C25382e() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        HostDependManager.getInst().checkSession(C67432a.m262319a(getAppContext()).getAppInfo().appId, new AbstractC67675b.AbstractC67676a() {
            /* class com.larksuite.component.openplatform.core.plugin.op.C25382e.C253831 */

            @Override // com.tt.option.p3398s.AbstractC67675b.AbstractC67676a
            /* renamed from: a */
            public void mo88522a(boolean z, String str) {
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("session", str);
                        C25382e.this.callbackOk(jSONObject);
                    } catch (JSONException e) {
                        C25382e.this.callbackFail(e);
                    }
                } else {
                    C25382e.this.callbackFail("session invalid");
                }
            }
        });
    }

    public C25382e(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
