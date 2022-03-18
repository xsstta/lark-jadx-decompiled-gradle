package com.larksuite.component.openplatform.core.plugin.device;

import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d */
public class C24807d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "offUserCaptureScreen";
    }

    public C24807d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C24843n.m89965b(getAppContext()).mo87872b();
        callbackOk();
    }

    public C24807d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
