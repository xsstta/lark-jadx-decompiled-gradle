package com.larksuite.component.openplatform.core.plugin.infra.p1134a;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.a.c */
public class C24875c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "operateDownloadAppTask";
    }

    public C24875c() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        callbackAppUnSupportFeature();
    }

    public C24875c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
