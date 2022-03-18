package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67070z;
import java.util.List;
import org.json.JSONArray;

public class GetStorageInfoPlugin extends OPPlugin {

    private static class GetStorageInfoRequest extends C25920a {
        private GetStorageInfoRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class GetStorageInfoResponse extends C25921b {
        @JSONField(name = "currentSize")
        public long currentSize;
        @JSONField(name = "keys")
        public List<String> keys;
        @JSONField(name = "limitSize")
        public long limitSize;

        private GetStorageInfoResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"getStorageInfoSync"})
    public GetStorageInfoResponse getStorageSyncHandlerSync(AbstractC25895f fVar) {
        ILogger b = fVar.mo92190b();
        GetStorageInfoResponse getStorageInfoResponse = new GetStorageInfoResponse();
        try {
            AbstractC12910a aVar = (AbstractC12910a) getAppContext().findServiceByInterface(AbstractC12910a.class);
            long a = C67070z.m261383a(aVar.mo48694b(), true);
            long a2 = C67070z.m261383a(aVar.mo48698c(), true);
            JSONArray d = aVar.mo48702d();
            getStorageInfoResponse.currentSize = a;
            getStorageInfoResponse.limitSize = a2;
            getStorageInfoResponse.keys = JSONObject.parseArray(d.toString(), String.class);
            return getStorageInfoResponse;
        } catch (Exception e) {
            b.mo92223e("GetStorageInfoPlugin", e);
            getStorageInfoResponse.mErrorMessage = ApiCode.GENERAL_JSON_ERROR.msg;
            getStorageInfoResponse.mErrorCode = ApiCode.GENERAL_JSON_ERROR.code;
            return getStorageInfoResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getStorageInfo"})
    public void getStorageSyncHandlerAsync(AbstractC25895f fVar, AbstractC25897h<GetStorageInfoResponse> hVar) {
        hVar.callback(getStorageSyncHandlerSync(fVar));
    }
}
