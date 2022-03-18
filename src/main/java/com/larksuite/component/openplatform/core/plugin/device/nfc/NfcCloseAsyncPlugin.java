package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;

public class NfcCloseAsyncPlugin extends NfcApiAsyncBasePlugin {
    @LKPluginFunction(async = true, eventName = {"nfcClose"})
    public void nfcClose(LKEvent lKEvent, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel) {
        handleAPI(lKEvent, nfcApiRequestModel);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public void execute(AbstractC67731b bVar, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent) {
        if (bVar.mo87897c()) {
            callbackOk(lKEvent);
        } else {
            callbackFail("close error", lKEvent);
        }
    }
}
