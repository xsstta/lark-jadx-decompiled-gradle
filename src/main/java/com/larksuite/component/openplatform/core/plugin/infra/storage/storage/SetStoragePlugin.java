package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.SetValueIOException;
import com.google.firebase.messaging.Constants;
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
import com.tt.miniapphost.util.DebugUtil;

public class SetStoragePlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class SetStorageSyncHandlerRequest extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String data;
        @JSONField(name = "dataType")
        public String dataType;
        @JSONField(name = "key")
        public String key;

        private SetStorageSyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class SetStorageSyncHandlerResponse extends C25921b {
        @JSONField(name = "currentSize")
        public long currentSize;

        private SetStorageSyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private AbstractC12910a getIStorageService() {
        return (AbstractC12910a) getAppContext().findServiceByInterface(AbstractC12910a.class);
    }

    @LKPluginFunction(async = false, eventName = {"setStorageSync"})
    public SetStorageSyncHandlerResponse setStorageSync(AbstractC25895f fVar, SetStorageSyncHandlerRequest setStorageSyncHandlerRequest) {
        ILogger b = fVar.mo92190b();
        b.mo92224i("SetStoragePlugin", "plugin process start");
        SetStorageSyncHandlerResponse setStorageSyncHandlerResponse = new SetStorageSyncHandlerResponse();
        try {
            String str = setStorageSyncHandlerRequest.key;
            if (TextUtils.isEmpty(str)) {
                b.mo92224i("SetStoragePlugin", "set key is null");
                setStorageSyncHandlerResponse.mErrorMessage = ApiCode.SETSTORAGE_KEY_ILLEGAL.msg;
                setStorageSyncHandlerResponse.mErrorCode = ApiCode.SETSTORAGE_KEY_ILLEGAL.code;
                return setStorageSyncHandlerResponse;
            }
            String str2 = setStorageSyncHandlerRequest.data;
            String str3 = setStorageSyncHandlerRequest.dataType;
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("SetStoragePlugin", "key ", str, " \n value", str2, " \n dataType", str3);
            }
            AppBrandLogger.m52830i("SetStoragePlugin", "key:" + str, "dataType:" + str3);
            if (TextUtils.isEmpty(str2)) {
                AppBrandLogger.m52830i("SetStoragePlugin", "set value is null");
            }
            AbstractC12910a iStorageService = getIStorageService();
            if (iStorageService.mo48693a(str, str2, str3)) {
                long a = C67070z.m261383a(iStorageService.mo48694b(), true);
                setStorageSyncHandlerResponse.currentSize = a;
                setStorageSyncHandlerResponse.mErrorMessage = C25906a.f64071a.f64117J;
                if (TextUtils.isEmpty(str2)) {
                    setStorageSyncHandlerResponse.mInnerMsg = "key:" + str + "set null";
                }
                b.mo92224i("SetStoragePlugin", "set success currentSize:" + a);
            } else {
                setStorageSyncHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                setStorageSyncHandlerResponse.mErrorMessage = "set storage fail";
            }
            return setStorageSyncHandlerResponse;
        } catch (SetValueIOException e) {
            b.mo92223e("SetStoragePlugin", e);
            if (e.getCode() == 10) {
                setStorageSyncHandlerResponse.mErrorMessage = ApiCode.SETSTORAGE_ITEM_STORAGE_EXCEED.msg;
                setStorageSyncHandlerResponse.mErrorCode = ApiCode.SETSTORAGE_ITEM_STORAGE_EXCEED.code;
            } else if (e.getCode() == 20) {
                setStorageSyncHandlerResponse.mErrorMessage = ApiCode.SETSTORAGE_TOTAL_STORAGE_EXCEED.msg;
                setStorageSyncHandlerResponse.mErrorCode = ApiCode.SETSTORAGE_TOTAL_STORAGE_EXCEED.code;
            } else {
                setStorageSyncHandlerResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
                setStorageSyncHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            }
            return setStorageSyncHandlerResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"setStorage"})
    public void setStorageAsync(AbstractC25895f fVar, SetStorageSyncHandlerRequest setStorageSyncHandlerRequest, AbstractC25897h<SetStorageSyncHandlerResponse> hVar) {
        hVar.callback(setStorageSync(fVar, setStorageSyncHandlerRequest));
    }
}
