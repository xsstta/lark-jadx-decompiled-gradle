package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;

public class ClearStoragePlugin extends OPPlugin {

    private static class ClearStorageRequest extends C25920a {
        private ClearStorageRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ClearStorageResponse extends C25921b {
        @JSONField(name = "currentSize")
        public long currentSize;

        private ClearStorageResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void clearStartUpStorageKey() {
        AbstractC67699a aVar = (AbstractC67699a) getAppContext().findServiceByInterface(AbstractC67699a.class);
        if (aVar != null) {
            aVar.mo234975a();
        }
    }

    @LKPluginFunction(async = false, eventName = {"clearStorageSync"})
    public ClearStorageResponse clearStorageAsyncHandlerSync(AbstractC25895f fVar) {
        ClearStorageResponse clearStorageResponse = new ClearStorageResponse();
        fVar.mo92190b();
        AbstractC12910a aVar = (AbstractC12910a) getAppContext().findServiceByInterface(AbstractC12910a.class);
        if (aVar.mo48689a()) {
            clearStartUpStorageKey();
            clearStorageResponse.currentSize = C67070z.m261383a(aVar.mo48694b(), true);
            return clearStorageResponse;
        }
        clearStorageResponse.mErrorMessage = ApiCode.CLEARSTORAGE_CLEAR_FAIL.msg;
        clearStorageResponse.mErrorCode = ApiCode.CLEARSTORAGE_CLEAR_FAIL.code;
        return clearStorageResponse;
    }

    @LKPluginFunction(async = true, eventName = {"clearStorage"})
    public void clearStorageAsyncHandlerAsync(LKEvent lKEvent, AbstractC25895f fVar, AbstractC25897h<ClearStorageResponse> hVar) {
        hVar.callback(clearStorageAsyncHandlerSync(fVar));
    }
}
