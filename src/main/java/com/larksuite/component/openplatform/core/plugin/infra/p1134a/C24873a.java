package com.larksuite.component.openplatform.core.plugin.infra.p1134a;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.a.a */
public class C24873a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "createDownloadAppTask";
    }

    public C24873a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        callbackAppUnSupportFeature();
    }

    public C24873a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
