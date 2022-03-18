package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67732c;
import org.json.JSONObject;

public class NfcStopDiscoveryAsyncPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void callbackOk(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    private void callbackFail(String str, AbstractC25897h<C25921b> hVar) {
        C25921b bVar = new C25921b();
        bVar.mErrorMessage = str;
        hVar.callback(bVar);
    }

    @LKPluginFunction(async = true, eventName = {"nfcStopDiscovery"})
    public void nfcStopDiscovery(LKEvent lKEvent, AbstractC25897h<C25921b> hVar) {
        AbstractC67730a aVar = (AbstractC67730a) getAppContext().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("NfcStopDiscoveryAsyncPlugin", "nfc service is null");
            callbackFail("nfc service is null", hVar);
            return;
        }
        aVar.mo87908a((AbstractC67732c) null);
        callbackOk(lKEvent);
        getApiDependency().mo235028a(C67706e.C67708a.m263377a("nfcFoundDevice", new JSONObject()).mo235009a());
    }
}
