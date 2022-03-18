package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.d */
public class C24818d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "onGetWifiList";
    }

    public C24818d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C24819e.m89919a().mo87855a(getAppContext());
        callbackOk();
    }

    public C24818d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
