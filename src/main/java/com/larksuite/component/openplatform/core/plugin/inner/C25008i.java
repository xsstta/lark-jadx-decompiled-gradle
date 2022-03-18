package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.i */
public class C25008i extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setTiming";
    }

    public C25008i() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            new JSONObject(this.mArgs).keys();
            callbackDefaultMsg(true);
        } catch (JSONException e) {
            callbackDefaultMsg(false);
            AppBrandLogger.eWithThrowable("ApiHandler", "JSONException", e);
        }
    }

    public C25008i(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
