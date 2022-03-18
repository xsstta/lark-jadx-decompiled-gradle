package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.c */
public class C24817c extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "offGetWifiList";
    }

    public C24817c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C24819e.m89919a().mo87858b(getAppContext());
        callbackOk();
    }

    public C24817c(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
