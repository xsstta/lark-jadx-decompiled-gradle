package com.larksuite.component.openplatform.core.plugin.op;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.p3352w.p3354b.AbstractC67293a;
import com.tt.miniapp.p3352w.p3354b.AbstractC67297c;
import com.tt.option.ext.AbstractC67619e;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.a */
public class C25327a extends AbstractC25423u {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "addHostEventListener";
    }

    public C25327a() {
    }

    @Override // com.larksuite.component.openplatform.core.plugin.op.AbstractC25423u
    /* renamed from: a */
    public void mo88460a(String str, AbstractC67297c cVar) {
        AppBrandLogger.m52830i("ApiAddHostEventListener", "invoke api");
        ConcurrentHashMap<String, AbstractC67293a> a = m90936a(getAppContext());
        AbstractC67293a aVar = a.get(str);
        if (aVar == null) {
            aVar = new AbstractC67293a() {
                /* class com.larksuite.component.openplatform.core.plugin.op.C25327a.C253281 */

                @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67293a
                /* renamed from: a */
                public void mo88461a(String str, JSONObject jSONObject) {
                    AppBrandLogger.m52830i("ApiAddHostEventListener", "onHostEvent:" + str);
                    AbstractC25423u.m90937a(str, jSONObject.toString(), C25327a.this.getAppContext());
                }
            };
            a.put(str, aVar);
        }
        cVar.mo233960a(getAppContext().getAppId(), str, aVar);
    }

    public C25327a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
