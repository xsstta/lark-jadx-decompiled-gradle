package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;

public class GetStoragePlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class GetStorageRequest extends C25920a {
        @JSONField(name = "key")
        public String key;

        private GetStorageRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class GetStorageResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String data;
        @JSONField(name = "dataType")
        public String dataType;

        private GetStorageResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void saveStartUpStorageKey(String str) {
        AbstractC67699a aVar;
        if (!AppbrandApplicationImpl.getInst(getAppContext()).isMainJsLoadCompleted() && (aVar = (AbstractC67699a) getAppContext().findServiceByInterface(AbstractC67699a.class)) != null) {
            aVar.mo234976a(str);
        }
    }

    @LKPluginFunction(async = false, eventName = {"getStorageSync"})
    public GetStorageResponse getStorageSync(AbstractC25895f fVar, GetStorageRequest getStorageRequest) {
        ILogger b = fVar.mo92190b();
        b.mo92224i("GetStoragePlugin", "plugin process start");
        GetStorageResponse getStorageResponse = new GetStorageResponse();
        try {
            AbstractC12910a aVar = (AbstractC12910a) getAppContext().findServiceByInterface(AbstractC12910a.class);
            String str = getStorageRequest.key;
            if (TextUtils.isEmpty(str)) {
                b.mo92224i("GetStoragePlugin", "key is null");
                getStorageResponse.mErrorMessage = ApiCode.GETSTORAGE_KEY_ILLEGAL.msg;
                getStorageResponse.mErrorCode = ApiCode.GETSTORAGE_KEY_ILLEGAL.code;
                return getStorageResponse;
            }
            String b2 = aVar.mo48697b(str);
            String c = aVar.mo48700c(str);
            b.mo92224i("GetStoragePlugin", "key:" + str, "type:" + c);
            if (b2 == null) {
                b.mo92224i("GetStoragePlugin", "value is null");
                getStorageResponse.data = "";
                getStorageResponse.dataType = "String";
                getStorageResponse.mErrorCode = ApiCode.GETSTORAGE_KEY_NOT_FOUND.code;
                getStorageResponse.mErrorMessage = ApiCode.GETSTORAGE_KEY_NOT_FOUND.msg + "key==" + str;
                return getStorageResponse;
            }
            saveStartUpStorageKey(str);
            getStorageResponse.data = b2;
            getStorageResponse.dataType = c;
            b.mo92224i("GetStoragePlugin", "plugin process success");
            return getStorageResponse;
        } catch (Exception e) {
            b.mo92223e("GetStoragePlugin", e);
            getStorageResponse.mErrorMessage = ApiCode.GENERAL_JSON_ERROR.msg;
            getStorageResponse.mErrorCode = ApiCode.GENERAL_JSON_ERROR.code;
            getStorageResponse.mInnerMsg = e.getLocalizedMessage();
            return getStorageResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getStorage"})
    public void getStorageSync(AbstractC25895f fVar, GetStorageRequest getStorageRequest, AbstractC25897h<GetStorageResponse> hVar) {
        hVar.callback(getStorageSync(fVar, getStorageRequest));
    }
}
