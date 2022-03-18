package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12804c;
import com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a;
import com.bytedance.ee.lark.infra.network.p630d.p631a.p632a.C12832a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67019aa;
import com.tt.refer.common.service.net.AbstractC67855c;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileError;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class CreateDownloadFileTaskSyncHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;
    private ILogger mILogger;

    /* access modifiers changed from: private */
    public static class CreateDownloadFileTaskSyncHandlerRequest extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String body;
        @JSONField(name = "filePath")
        public String filePath;
        @JSONField(name = "header")
        public JSONObject header;
        @JSONField(name = "method")
        public String method;
        @JSONField(name = "taskId")
        public int taskId;
        @JSONField(name = "url")
        @LKRequiredParam
        public String url;

        private CreateDownloadFileTaskSyncHandlerRequest() {
        }
    }

    private static class CreateDownloadFileTaskSyncHandlerResponse extends C25921b {
        @JSONField(name = "downloadTaskId")
        public int mDownloadTaskId;

        private CreateDownloadFileTaskSyncHandlerResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class OnDownloadTaskStateChangeResponse extends C25921b {
        @JSONField(name = "downloadTaskId")
        public int mDownloadTaskId;
        @JSONField(name = "state")
        public String mState;

        private OnDownloadTaskStateChangeResponse() {
        }
    }

    public boolean isParentDirExists(File file) {
        File parentFile;
        if (file == null || (parentFile = file.getParentFile()) == null) {
            return false;
        }
        return parentFile.exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject convertFastJsonToJsonObject(com.alibaba.fastjson.JSONObject r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "CreateDownloadFileTaskNew"
            if (r7 == 0) goto L_0x001f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r7 = r7.toJSONString()     // Catch:{ JSONException -> 0x0010 }
            r3.<init>(r7)     // Catch:{ JSONException -> 0x0010 }
            goto L_0x0020
        L_0x0010:
            r7 = move-exception
            com.ss.android.lark.optrace.api.a r3 = r6.mILogger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = " convert fast json JSONObject err "
            r4[r0] = r5
            r4[r1] = r7
            r3.mo92223e(r2, r4)
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0027
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L_0x0027:
            com.ss.android.lark.optrace.api.a r7 = r6.mILogger
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  convert jsonObject size "
            r4.append(r5)
            int r5 = r3.length()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1[r0] = r4
            r7.mo92224i(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.infra.network.CreateDownloadFileTaskSyncHandlerPlugin.convertFastJsonToJsonObject(com.alibaba.fastjson.JSONObject):org.json.JSONObject");
    }

    public void sendOnDownloadTaskStateChange(AbstractC25905b bVar, OnDownloadTaskStateChangeResponse onDownloadTaskStateChangeResponse) {
        AppBrandLogger.m52830i("CreateDownloadFileTaskNew", "innerMsg:" + onDownloadTaskStateChangeResponse.mInnerMsg);
        onDownloadTaskStateChangeResponse.mInnerMsg = null;
        bVar.mo92216b("onDownloadTaskStateChange", onDownloadTaskStateChangeResponse);
    }

    @LKPluginFunction(eventName = {"createDownloadTask"})
    public CreateDownloadFileTaskSyncHandlerResponse createDownloadFileTaskSync(LKEvent lKEvent, ILogger aVar, CreateDownloadFileTaskSyncHandlerRequest createDownloadFileTaskSyncHandlerRequest, AbstractC25905b bVar) {
        int i;
        this.mAppContext = getEventContext(lKEvent);
        this.mILogger = aVar;
        CreateDownloadFileTaskSyncHandlerResponse createDownloadFileTaskSyncHandlerResponse = new CreateDownloadFileTaskSyncHandlerResponse();
        this.mILogger.mo92224i("CreateDownloadFileTaskNew", "create download task.....");
        if (createDownloadFileTaskSyncHandlerRequest.method == null) {
            createDownloadFileTaskSyncHandlerRequest.method = "GET";
        } else if (createDownloadFileTaskSyncHandlerRequest.method.trim().equals("")) {
            createDownloadFileTaskSyncHandlerRequest.method = "POST";
        }
        ILogger aVar2 = this.mILogger;
        aVar2.mo92224i("CreateDownloadFileTaskNew", "request params: " + C67019aa.m261223a(createDownloadFileTaskSyncHandlerRequest.url) + "method:" + createDownloadFileTaskSyncHandlerRequest.method + "taskId:" + createDownloadFileTaskSyncHandlerRequest.taskId);
        if (createDownloadFileTaskSyncHandlerRequest.taskId > 0) {
            i = createDownloadFileTaskSyncHandlerRequest.taskId;
        } else {
            i = C12804c.m52892a();
        }
        download(lKEvent, bVar, createDownloadFileTaskSyncHandlerRequest, i);
        ILogger aVar3 = this.mILogger;
        aVar3.mo92224i("CreateDownloadFileTaskNew", "create downloadTaskId success downloadTaskId:" + i);
        createDownloadFileTaskSyncHandlerResponse.mDownloadTaskId = i;
        return createDownloadFileTaskSyncHandlerResponse;
    }

    private void download(LKEvent lKEvent, AbstractC25905b bVar, CreateDownloadFileTaskSyncHandlerRequest createDownloadFileTaskSyncHandlerRequest, int i) {
        String str;
        OnDownloadTaskStateChangeResponse onDownloadTaskStateChangeResponse = new OnDownloadTaskStateChangeResponse();
        onDownloadTaskStateChangeResponse.mDownloadTaskId = i;
        if (TextUtils.isEmpty(createDownloadFileTaskSyncHandlerRequest.url)) {
            onDownloadTaskStateChangeResponse.mErrorCode = ApiCode.DOWNLOADFILE_INVALID_URL.code;
            onDownloadTaskStateChangeResponse.mErrorMessage = ApiCode.DOWNLOADFILE_INVALID_URL.msg;
            onDownloadTaskStateChangeResponse.mState = "fail";
            sendOnDownloadTaskStateChange(bVar, onDownloadTaskStateChangeResponse);
            this.mILogger.mo92223e("CreateDownloadFileTaskNew", "addDownloadRequest->failed:download url is empty!");
        } else if (!getApiDependency().mo235037a("download", createDownloadFileTaskSyncHandlerRequest.url)) {
            onDownloadTaskStateChangeResponse.mErrorCode = ApiCode.DOWNLOADFILE_INVALID_DOMAIN.code;
            onDownloadTaskStateChangeResponse.mErrorMessage = ApiCode.DOWNLOADFILE_INVALID_DOMAIN.msg;
            onDownloadTaskStateChangeResponse.mState = "fail";
            sendOnDownloadTaskStateChange(bVar, onDownloadTaskStateChangeResponse);
            this.mILogger.mo92223e("CreateDownloadFileTaskNew", "addDownloadRequest->failed:url is not safe:", createDownloadFileTaskSyncHandlerRequest.url);
        } else {
            AbstractC67722a aVar = (AbstractC67722a) this.mAppContext.findServiceByInterface(AbstractC67722a.class);
            String str2 = createDownloadFileTaskSyncHandlerRequest.filePath;
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "null") || TextUtils.equals(str2, "undefined")) {
                this.mILogger.mo92224i("CreateDownloadFileTaskNew", "addDownloadRequest->file path is null!");
                str = null;
            } else {
                if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
                    this.mILogger.mo92224i("CreateDownloadFileTaskNew", "use new file sandbox");
                    try {
                        if (!aVar.mo235617c(new TTFile(str2), true, new TTFileContext(lKEvent.mo92134c().mo92188a(), "createDownloadAppTask"))) {
                            TTFileHelper.m264258a(onDownloadTaskStateChangeResponse, new TTFileException(TTFileError.f171109k), lKEvent.mo92134c().mo92190b());
                            onDownloadTaskStateChangeResponse.mState = "fail";
                            sendOnDownloadTaskStateChange(bVar, onDownloadTaskStateChangeResponse);
                            this.mILogger.mo92224i("CreateDownloadFileTaskNew", "file can`t write");
                            return;
                        }
                    } catch (TTFileException e) {
                        TTFileHelper.m264258a(onDownloadTaskStateChangeResponse, e, lKEvent.mo92134c().mo92190b());
                        onDownloadTaskStateChangeResponse.mState = "fail";
                        sendOnDownloadTaskStateChange(bVar, onDownloadTaskStateChangeResponse);
                        this.mILogger.mo92223e("CreateDownloadFileTaskNew", "ttfile exception", e);
                        return;
                    }
                } else if (!aVar.mo235083b(aVar.mo235076a(str2)) && !aVar.mo235094f(str2)) {
                    onDownloadTaskStateChangeResponse.mErrorCode = ApiCode.GENERAL_FILE_CAN_NOT_WRITE.code;
                    onDownloadTaskStateChangeResponse.mErrorMessage = ApiCode.GENERAL_FILE_CAN_NOT_WRITE.msg;
                    onDownloadTaskStateChangeResponse.mState = "fail";
                    sendOnDownloadTaskStateChange(bVar, onDownloadTaskStateChangeResponse);
                    this.mILogger.mo92223e("CreateDownloadFileTaskNew", "addDownloadRequest failed:file can't write!");
                    return;
                }
                str = str2;
            }
            addDownloadRequest(createDownloadFileTaskSyncHandlerRequest.url, convertFastJsonToJsonObject(createDownloadFileTaskSyncHandlerRequest.header), createDownloadFileTaskSyncHandlerRequest.body, str, createDownloadFileTaskSyncHandlerRequest.method, new AbstractC12831a() {
                /* class com.larksuite.component.openplatform.core.plugin.infra.network.CreateDownloadFileTaskSyncHandlerPlugin.C249231 */

                @Override // com.bytedance.ee.lark.infra.network.p630d.p631a.AbstractC12831a
                /* renamed from: a */
                public void mo48471a(org.json.JSONObject jSONObject) {
                    CreateDownloadFileTaskSyncHandlerPlugin.this.getApiDependency().mo235028a(C67706e.C67708a.m263377a("onDownloadTaskStateChange", jSONObject).mo235009a());
                }
            }, i);
        }
    }

    private void addDownloadRequest(String str, org.json.JSONObject jSONObject, String str2, String str3, String str4, AbstractC12831a aVar, int i) {
        ((AbstractC67855c) this.mAppContext.findServiceByInterface(AbstractC67855c.class)).mo235488a(new C12832a(i, str, jSONObject, str3, str4, str2), aVar);
    }
}
