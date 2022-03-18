package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.ac.C65733b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapphost.entity.C67522b;
import java.nio.ByteBuffer;
import okio.ByteString;

public class ApiOperateSocketTaskV2Plugin extends OPPlugin {
    private IAppContext mAppContext;
    private ILogger mILogger;

    /* access modifiers changed from: private */
    public static class ApiOperateSocketTaskV2Request extends C25920a {
        @JSONField(name = "code")
        public int code;
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String data;
        @JSONField(name = "operationType")
        public String operationType;
        @JSONField(name = "reason")
        public String reason;
        @JSONField(name = "socketTaskId")
        public int socketTaskId;

        private ApiOperateSocketTaskV2Request() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiOperateSocketTaskV2Response extends C25921b {
        private ApiOperateSocketTaskV2Response() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ByteString getByteString(LKBasePluginResult.AbstractC25940a.C25941a aVar) {
        if (aVar == null || !(aVar.f64249b instanceof ByteBuffer)) {
            return null;
        }
        return ByteString.of(aVar.f64249b);
    }

    private void closeCollection(ApiOperateSocketTaskV2Request apiOperateSocketTaskV2Request, AbstractC25897h<ApiOperateSocketTaskV2Response> hVar) {
        boolean z;
        ApiOperateSocketTaskV2Response apiOperateSocketTaskV2Response = new ApiOperateSocketTaskV2Response();
        try {
            z = C65733b.m257704a(this.mAppContext).mo230340a(apiOperateSocketTaskV2Request.socketTaskId, apiOperateSocketTaskV2Request.code, apiOperateSocketTaskV2Request.reason);
        } catch (Exception e) {
            this.mILogger.mo92223e("ApiOperateSocketTaskV2", e);
            z = false;
        }
        if (z) {
            this.mILogger.mo92224i("ApiOperateSocketTaskV2", "closeCollection success!");
        } else {
            this.mILogger.mo92224i("ApiOperateSocketTaskV2", "closeCollection failed!");
            apiOperateSocketTaskV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_SEND_ERROR.msg;
            apiOperateSocketTaskV2Response.mErrorCode = ApiCode.CONNECTSOCKET_SEND_ERROR.code;
        }
        hVar.callback(apiOperateSocketTaskV2Response);
    }

    private void sendMsg(ApiOperateSocketTaskV2Request apiOperateSocketTaskV2Request, AbstractC25897h<ApiOperateSocketTaskV2Response> hVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ApiOperateSocketTaskV2Response apiOperateSocketTaskV2Response = new ApiOperateSocketTaskV2Response();
        try {
            C67522b bVar = new C67522b();
            int i = apiOperateSocketTaskV2Request.socketTaskId;
            if (!C66718d.m260519a(apiOperateSocketTaskV2Request.data)) {
                z = true;
            } else {
                z = false;
            }
            if (apiOperateSocketTaskV2Request.getArrayBuffers() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                z3 = C65733b.m257704a(this.mAppContext).mo230341a(i, apiOperateSocketTaskV2Request.data, bVar);
            } else if (z2) {
                z3 = C65733b.m257704a(this.mAppContext).mo230342a(i, getByteString(apiOperateSocketTaskV2Request.getArrayBuffers()), bVar);
            } else {
                bVar.mo234467a("param: data illegal");
                z3 = false;
            }
            if (z3) {
                this.mILogger.mo92224i("ApiOperateSocketTaskV2", "send message success!");
            } else {
                this.mILogger.mo92224i("ApiOperateSocketTaskV2", "send message failed!");
                apiOperateSocketTaskV2Response.mErrorMessage = bVar.mo234468a();
                apiOperateSocketTaskV2Response.mErrorCode = ApiCode.CONNECTSOCKET_SEND_ERROR.code;
            }
        } catch (Exception e) {
            this.mILogger.mo92223e("ApiOperateSocketTaskV2", e);
            apiOperateSocketTaskV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_SEND_ERROR.msg;
            apiOperateSocketTaskV2Response.mErrorCode = ApiCode.CONNECTSOCKET_SEND_ERROR.code;
        }
        hVar.callback(apiOperateSocketTaskV2Response);
    }

    @LKPluginFunction(async = true, eventName = {"operateSocketTask"})
    public void operateSocketTaskV2Async(LKEvent lKEvent, ILogger aVar, ApiOperateSocketTaskV2Request apiOperateSocketTaskV2Request, AbstractC25905b bVar, AbstractC25897h<ApiOperateSocketTaskV2Response> hVar) {
        this.mILogger = aVar;
        this.mAppContext = getEventContext(lKEvent);
        ApiOperateSocketTaskV2Response apiOperateSocketTaskV2Response = new ApiOperateSocketTaskV2Response();
        try {
            String str = apiOperateSocketTaskV2Request.operationType;
            if (TextUtils.equals(str, "send")) {
                this.mILogger.mo92224i("ApiOperateSocketTaskV2", "operate socket send message!");
                sendMsg(apiOperateSocketTaskV2Request, hVar);
            } else if (TextUtils.equals("close", str)) {
                this.mILogger.mo92224i("ApiOperateSocketTaskV2", "operate socket close socket");
                closeCollection(apiOperateSocketTaskV2Request, hVar);
            } else {
                apiOperateSocketTaskV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_ILLEGAL_OPERATIONTYPE.msg;
                apiOperateSocketTaskV2Response.mErrorCode = ApiCode.CONNECTSOCKET_ILLEGAL_OPERATIONTYPE.code;
                this.mILogger.mo92224i("ApiOperateSocketTaskV2", "illegal type:", str);
                hVar.callback(apiOperateSocketTaskV2Response);
            }
        } catch (Exception e) {
            apiOperateSocketTaskV2Response.mErrorMessage = ApiCode.CONNECTSOCKET_SEND_ERROR.msg;
            apiOperateSocketTaskV2Response.mErrorCode = ApiCode.CONNECTSOCKET_SEND_ERROR.code;
            hVar.callback(apiOperateSocketTaskV2Response);
            aVar.mo92223e("ApiOperateSocketTaskV2", e);
        }
    }
}
