package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.i */
public abstract class AbstractC25161i extends ApiHandler implements AbstractC25162j {

    /* renamed from: a */
    private AbstractC25162j f61450a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo88252a(JSONObject jSONObject);

    public AbstractC25161i() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            mo88252a(new JSONObject(this.mArgs));
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "ApiHandler", e.getStackTrace());
            callbackException(e);
        }
    }

    public AbstractC25161i(String str, int i, AbstractC67619e eVar, AbstractC25162j jVar) {
        super(str, i, eVar);
        this.f61450a = jVar;
    }
}
