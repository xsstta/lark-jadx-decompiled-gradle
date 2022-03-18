package com.larksuite.component.openplatform.core.plugin.device.nfc;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;

public class NfcSetTimeoutAsyncPlugin extends NfcApiAsyncBasePlugin {
    @LKPluginFunction(async = true, eventName = {"nfcSetTimeout"})
    public void nfcSetTimeout(LKEvent lKEvent, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel) {
        handleAPI(lKEvent, nfcApiRequestModel);
    }

    @Override // com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin
    public void execute(AbstractC67731b bVar, NfcApiAsyncBasePlugin.NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent) {
        try {
            bVar.mo87894a(nfcApiRequestModel.mTimeout);
            callbackOk(lKEvent);
        } catch (Exception e) {
            AppBrandLogger.m52829e("NfcSetTimeoutAsyncHandler", "", e);
            callbackFail(e.getMessage(), lKEvent);
        }
    }
}
