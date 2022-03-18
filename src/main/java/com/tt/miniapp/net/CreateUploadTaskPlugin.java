package com.tt.miniapp.net;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.net.C66504b;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import org.json.JSONObject;

public class CreateUploadTaskPlugin extends OPPlugin {
    public IAppContext mAppContext;

    private static class CreateUploadTaskRequest extends C25920a {
        @JSONField(name = "filePath")
        public String mFilePath;
        @JSONField(name = "formData")
        public String mFromData;
        @JSONField(name = "header")
        public String mHeader;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "url")
        @LKRequiredParam
        public String mUrl;

        private CreateUploadTaskRequest() {
        }
    }

    private static class CreateUploadTaskResponse extends C25921b {
        @JSONField(name = "uploadTaskId")
        public int uploadTaskId;

        private CreateUploadTaskResponse() {
        }
    }

    private static class UploadTaskStateChangeResponse extends C25921b {
        @JSONField(name = "state")
        public String state;
        @JSONField(name = "uploadTaskId")
        public int uploadTaskId;

        private UploadTaskStateChangeResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public void sendOnUploadTaskStateChange(AbstractC25905b bVar, UploadTaskStateChangeResponse uploadTaskStateChangeResponse) {
        bVar.mo92216b("onUploadTaskStateChange", uploadTaskStateChangeResponse);
    }

    @LKPluginFunction(eventName = {"createUploadTask"})
    public CreateUploadTaskResponse createUploadRequestSync(LKEvent lKEvent, CreateUploadTaskRequest createUploadTaskRequest, final ILogger aVar, AbstractC25905b bVar) {
        String str;
        Exception e;
        this.mAppContext = getEventContext(lKEvent);
        CreateUploadTaskResponse createUploadTaskResponse = new CreateUploadTaskResponse();
        String str2 = createUploadTaskRequest.mUrl;
        String str3 = createUploadTaskRequest.mHeader;
        String str4 = createUploadTaskRequest.mFilePath;
        String str5 = createUploadTaskRequest.mName;
        String str6 = createUploadTaskRequest.mFromData;
        int a = C12804c.m52892a();
        createUploadTaskResponse.uploadTaskId = a;
        aVar.mo92224i("CreateUploadTaskPlugin", "upload task invoke string .....");
        aVar.mo92224i("CreateUploadTaskPlugin", "request params url:" + C67019aa.m261223a(str2) + "    fileName:" + str5);
        C664951 r0 = new AbstractC67550j.AbstractC67551a<String>() {
            /* class com.tt.miniapp.net.CreateUploadTaskPlugin.C664951 */

            /* renamed from: a */
            public void onNativeModuleCall(String str) {
                if (DebugUtil.debug()) {
                    ILogger aVar = aVar;
                    aVar.mo92222d("CreateUploadTaskPlugin", "create upload task -> onNativeModuleCall:" + str);
                } else {
                    aVar.mo92224i("CreateUploadTaskPlugin", "create upload task ->onNativeModuleCall......");
                }
                try {
                    CreateUploadTaskPlugin.this.getApiDependency().mo235028a(C67706e.C67708a.m263377a("onUploadTaskStateChange", new JSONObject(str)).mo235009a());
                } catch (Throwable th) {
                    aVar.mo92223e("CreateUploadTaskPlugin", "JSONException", th);
                    IJsBridge jsBridge = C67432a.m262319a(CreateUploadTaskPlugin.this.mAppContext).getJsBridge();
                    if (jsBridge != null) {
                        jsBridge.sendMsgToJsCore("onUploadTaskStateChange", str);
                    }
                }
            }
        };
        try {
            UploadTaskStateChangeResponse uploadTaskStateChangeResponse = new UploadTaskStateChangeResponse();
            uploadTaskStateChangeResponse.uploadTaskId = a;
            if (TextUtils.isEmpty(str2)) {
                aVar.mo92223e("CreateUploadTaskPlugin", "createUploadTask failed:url is empty");
                uploadTaskStateChangeResponse.mErrorCode = ApiCode.UPLOADFILE_INVALID_URL.code;
                uploadTaskStateChangeResponse.mErrorMessage = ApiCode.UPLOADFILE_INVALID_URL.msg;
                uploadTaskStateChangeResponse.state = "fail";
                sendOnUploadTaskStateChange(bVar, uploadTaskStateChangeResponse);
                return createUploadTaskResponse;
            } else if (!C67053q.m261326a("upload", str2, this.mAppContext)) {
                aVar.mo92223e("CreateUploadTaskPlugin", "createUploadTask failed:is not safe domain");
                uploadTaskStateChangeResponse.mErrorCode = ApiCode.UPLOADFILE_INVALID_DOMAIN.code;
                uploadTaskStateChangeResponse.mErrorMessage = ApiCode.UPLOADFILE_INVALID_DOMAIN.msg;
                uploadTaskStateChangeResponse.state = "fail";
                sendOnUploadTaskStateChange(bVar, uploadTaskStateChangeResponse);
                return createUploadTaskResponse;
            } else if (TextUtils.isEmpty(str5)) {
                aVar.mo92223e("CreateUploadTaskPlugin", "createUploadTask failed>> file name is empty!");
                uploadTaskStateChangeResponse.mErrorCode = ApiCode.UPLOADFILE_NAME_EMPTY.code;
                uploadTaskStateChangeResponse.mErrorMessage = ApiCode.UPLOADFILE_NAME_EMPTY.msg;
                uploadTaskStateChangeResponse.state = "fail";
                sendOnUploadTaskStateChange(bVar, uploadTaskStateChangeResponse);
                return createUploadTaskResponse;
            } else {
                str = "CreateUploadTaskPlugin";
                try {
                    C66504b.m259893a(new C66504b.C66508a(a, str2, str3, str4, str5, str6, this.mAppContext), r0, this.mAppContext, C12805d.m52894a(AppbrandContext.getInst().getTracing(), true, this.mAppContext));
                    return createUploadTaskResponse;
                } catch (Exception e2) {
                    e = e2;
                    aVar.mo92223e(str, "createUploadTask fail>>>exception:", e);
                    createUploadTaskResponse.mErrorCode = C25906a.f64080j.f64115H;
                    createUploadTaskResponse.mErrorMessage = C25906a.f64080j.f64117J;
                    return createUploadTaskResponse;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "CreateUploadTaskPlugin";
            aVar.mo92223e(str, "createUploadTask fail>>>exception:", e);
            createUploadTaskResponse.mErrorCode = C25906a.f64080j.f64115H;
            createUploadTaskResponse.mErrorMessage = C25906a.f64080j.f64117J;
            return createUploadTaskResponse;
        }
    }
}
