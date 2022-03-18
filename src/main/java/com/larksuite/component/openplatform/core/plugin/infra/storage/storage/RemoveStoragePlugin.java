package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;

public class RemoveStoragePlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class RemoveStorageRequest extends C25920a {
        @JSONField(name = "key")
        public String key;

        private RemoveStorageRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class RemoveStorageResponse extends C25921b {
        @JSONField(name = "currentSize")
        public long currentSize;

        private RemoveStorageResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"removeStorageSync"})
    public RemoveStorageResponse removeStorageSync(AbstractC25895f fVar, RemoveStorageRequest removeStorageRequest) {
        ILogger b = fVar.mo92190b();
        b.mo92224i("RemoveStorageSyncHandlerPlugin", "plugin process start");
        RemoveStorageResponse removeStorageResponse = new RemoveStorageResponse();
        String str = removeStorageRequest.key;
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("RemoveStorageSyncHandlerPlugin", "remove key is null");
            removeStorageResponse.mErrorMessage = ApiCode.REMOVESTORAGE_KEY_ILLEGAL.msg;
            removeStorageResponse.mErrorCode = ApiCode.REMOVESTORAGE_KEY_ILLEGAL.code;
            return removeStorageResponse;
        }
        b.mo92224i("RemoveStorageSyncHandlerPlugin", "remove key:" + str);
        AbstractC12910a aVar = (AbstractC12910a) getAppContext().findServiceByInterface(AbstractC12910a.class);
        if (aVar == null) {
            b.mo92225w("RemoveStorageSyncHandlerPlugin", "storageService is null");
            removeStorageResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
            removeStorageResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            return removeStorageResponse;
        } else if (aVar.mo48697b(str) == null) {
            return removeStorageResponse;
        } else {
            if (aVar.mo48704d(str)) {
                AbstractC67699a aVar2 = (AbstractC67699a) getAppContext().findServiceByInterface(AbstractC67699a.class);
                if (aVar2 != null) {
                    aVar2.mo234978b(str);
                }
                removeStorageResponse.mErrorMessage = C25906a.f64071a.f64117J + "key:" + str;
                long a = C67070z.m261383a(aVar.mo48694b(), true);
                b.mo92224i("RemoveStorageSyncHandlerPlugin", "remove success currentSize:" + a);
                removeStorageResponse.currentSize = a;
            } else {
                removeStorageResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
                removeStorageResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            }
            return removeStorageResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"removeStorage"})
    public void removeStorageSync(AbstractC25895f fVar, RemoveStorageRequest removeStorageRequest, AbstractC25897h<RemoveStorageResponse> hVar) {
        hVar.callback(removeStorageSync(fVar, removeStorageRequest));
    }
}
