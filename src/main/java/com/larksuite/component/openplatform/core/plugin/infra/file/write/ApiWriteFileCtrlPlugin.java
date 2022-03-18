package com.larksuite.component.openplatform.core.plugin.infra.file.write;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class ApiWriteFileCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiWriteFileCtrlResponse extends C25921b {
        private ApiWriteFileCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    /* access modifiers changed from: private */
    public static class ApiWriteFileCtrlRequest extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String mData;
        @JSONField(name = "encoding")
        public String mEncoding = "utf-8";
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String mFilePath;

        private ApiWriteFileCtrlRequest() {
        }
    }

    private boolean isWriteWithString(String str) {
        if (str == null || str.getBytes() == null) {
            return false;
        }
        return true;
    }

    @LKPluginFunction(eventName = {"writeFileSync"})
    public ApiWriteFileCtrlResponse writeFileSync(LKEvent lKEvent, ApiWriteFileCtrlRequest apiWriteFileCtrlRequest) {
        return writeFileImpl(lKEvent, apiWriteFileCtrlRequest);
    }

    private ApiWriteFileCtrlResponse writeFileImpl(LKEvent lKEvent, ApiWriteFileCtrlRequest apiWriteFileCtrlRequest) {
        if (TTFileHelper.m264259a("writeFile", getAppContext())) {
            return standard(lKEvent, apiWriteFileCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        try {
            return writeFileInner(lKEvent, apiWriteFileCtrlRequest);
        } catch (IllegalArgumentException e) {
            b.mo92223e("ApiWriteFileCtrlPlugin", lKEvent.mo92146m(), e);
            ApiWriteFileCtrlResponse apiWriteFileCtrlResponse = new ApiWriteFileCtrlResponse();
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiWriteFileCtrlResponse, aVar, "downstream illegal argument, e:" + e.getMessage());
            return apiWriteFileCtrlResponse;
        } catch (Exception e2) {
            b.mo92223e("ApiWriteFileCtrlPlugin", lKEvent.mo92146m(), e2);
            ApiWriteFileCtrlResponse apiWriteFileCtrlResponse2 = new ApiWriteFileCtrlResponse();
            C25906a aVar2 = C25906a.f64080j;
            fillFailedResponse(apiWriteFileCtrlResponse2, aVar2, "downstream exception, e:" + e2.getMessage());
            return apiWriteFileCtrlResponse2;
        }
    }

    private ApiWriteFileCtrlResponse standard(LKEvent lKEvent, ApiWriteFileCtrlRequest apiWriteFileCtrlRequest) {
        int i;
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiWriteFileCtrlResponse apiWriteFileCtrlResponse = new ApiWriteFileCtrlResponse();
        String str = apiWriteFileCtrlRequest.mFilePath;
        String str2 = apiWriteFileCtrlRequest.mData;
        String str3 = apiWriteFileCtrlRequest.mEncoding;
        LKBasePluginResult.AbstractC25940a.C25941a arrayBuffers = apiWriteFileCtrlRequest.getArrayBuffers();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("srcPath=");
        sb.append(str);
        sb.append(" data.length=");
        if (str2 == null) {
            i = 0;
        } else {
            i = str2.length();
        }
        sb.append(i);
        sb.append(" encoding:");
        sb.append(str3);
        sb.append(" arrayBuffer:");
        sb.append(arrayBuffers);
        objArr[0] = sb.toString();
        b.mo92224i("ApiWriteFileCtrlPlugin", objArr);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = new TTFile(str);
        try {
            TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), "copyFile");
            if (!isWriteWithString(str2)) {
                b.mo92224i("ApiWriteFileCtrlPlugin", "write file with ByteBuffer");
                LKBasePluginResult.AbstractC25940a.C25941a arrayBuffers2 = apiWriteFileCtrlRequest.getArrayBuffers();
                if (arrayBuffers2 == null) {
                    b.mo92223e("ApiWriteFileCtrlPlugin", "array buffer event with null ArrayBuffer");
                    fillFailedResponse(apiWriteFileCtrlResponse, C25906a.f64072b, "array buffer is null");
                    return apiWriteFileCtrlResponse;
                }
                aVar.mo235599a((ByteBuffer) arrayBuffers2.f64249b, gVar, hVar);
                return apiWriteFileCtrlResponse;
            } else if (!C67070z.m261404c(str3)) {
                b.mo92224i("ApiWriteFileCtrlPlugin", "encoding:" + str3 + " not invalid");
                C25906a aVar2 = C25906a.f64072b;
                fillFailedResponse(apiWriteFileCtrlResponse, aVar2, "encoding not support, encoding:" + str3);
                return apiWriteFileCtrlResponse;
            } else {
                byte[] b2 = C67070z.m261400b(str2, str3);
                if (b2 == null) {
                    C25906a aVar3 = C25906a.f64072b;
                    fillFailedResponse(apiWriteFileCtrlResponse, aVar3, "data cannot be decoded. encoding:" + str3 + " data:" + str2);
                    return apiWriteFileCtrlResponse;
                }
                aVar.mo235600a(b2, gVar, hVar);
                return apiWriteFileCtrlResponse;
            }
        } catch (UnsupportedEncodingException e) {
            b.mo92223e("ApiWriteFileCtrlPlugin", "UnsupportedEncodingException encoding:" + str3 + " not invalid", e);
            C25906a aVar4 = C25906a.f64072b;
            fillFailedResponse(apiWriteFileCtrlResponse, aVar4, "encoding not support, encoding:" + str3);
        } catch (TTFileException e2) {
            TTFileHelper.m264258a(apiWriteFileCtrlResponse, e2, b);
        }
    }

    private ApiWriteFileCtrlResponse writeFileInner(LKEvent lKEvent, ApiWriteFileCtrlRequest apiWriteFileCtrlRequest) throws Exception {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiWriteFileCtrlResponse apiWriteFileCtrlResponse = new ApiWriteFileCtrlResponse();
        apiWriteFileCtrlResponse.mIsArrayBuffer = lKEvent.mo92150q();
        lKEvent.mo92146m();
        String str = apiWriteFileCtrlRequest.mFilePath;
        String str2 = apiWriteFileCtrlRequest.mData;
        String str3 = apiWriteFileCtrlRequest.mEncoding;
        File file = new File(getApiDependency().mo235044c(str));
        b.mo92224i("ApiWriteFileCtrlPlugin", "filePath ", str, " \n data ", str2, " \n encoding ", str3);
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("ApiWriteFileCtrlPlugin", "filePath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiWriteFileCtrlResponse, aVar, "path empty, filePath" + str);
            return apiWriteFileCtrlResponse;
        } else if (!getApiDependency().mo235046c(file) || getApiDependency().mo235042b(file)) {
            b.mo92224i("ApiWriteFileCtrlPlugin", "filePath canWrite");
            C25908c a = C25910e.m93820a(C25910e.f64126d, str);
            fillFailedResponse(apiWriteFileCtrlResponse, a, "cannot write, file:" + file.getAbsolutePath());
            return apiWriteFileCtrlResponse;
        } else if (file.exists()) {
            b.mo92224i("ApiWriteFileCtrlPlugin", " to exists:" + file.getParentFile().exists());
            C25908c a2 = C25910e.m93820a(C25910e.f64128f, str);
            fillFailedResponse(apiWriteFileCtrlResponse, a2, "to exists, file:" + file.getAbsolutePath());
            return apiWriteFileCtrlResponse;
        } else if (file.getParentFile() == null || !file.getParentFile().exists()) {
            b.mo92224i("ApiWriteFileCtrlPlugin", "the parent is not exist, filePath=" + str);
            C25908c a3 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiWriteFileCtrlResponse, a3, "file not exists, file:" + file.getAbsolutePath());
            return apiWriteFileCtrlResponse;
        } else if (!isWriteWithString(str2)) {
            b.mo92224i("ApiWriteFileCtrlPlugin", "write file with ByteBuffer");
            LKBasePluginResult.AbstractC25940a.C25941a arrayBuffers = apiWriteFileCtrlRequest.getArrayBuffers();
            if (arrayBuffers == null) {
                b.mo92223e("ApiWriteFileCtrlPlugin", "array buffer event with null ArrayBuffer");
                fillFailedResponse(apiWriteFileCtrlResponse, C25906a.f64072b, "array buffer is null");
                return apiWriteFileCtrlResponse;
            }
            T t = arrayBuffers.f64249b;
            if (getApiDependency().mo235031a(C67070z.m261384a((ByteBuffer) t))) {
                b.mo92224i("ApiWriteFileCtrlPlugin", "buffer data is not null, user dir saved file size limit exceeded");
                fillFailedResponse(apiWriteFileCtrlResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
                return apiWriteFileCtrlResponse;
            }
            C67070z.m261395a(file.getAbsolutePath(), (ByteBuffer) t);
            return apiWriteFileCtrlResponse;
        } else if (!C67070z.m261404c(str3)) {
            b.mo92224i("ApiWriteFileCtrlPlugin", "encoding:" + str3 + " not invalid");
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(apiWriteFileCtrlResponse, aVar2, "encoding not support, encoding:" + str3);
            return apiWriteFileCtrlResponse;
        } else {
            if (getApiDependency().mo235031a((long) str2.getBytes().length)) {
                b.mo92224i("ApiWriteFileCtrlPlugin", "data is not null, user dir saved file size limit exceeded");
                fillFailedResponse(apiWriteFileCtrlResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
                return apiWriteFileCtrlResponse;
            }
            C67070z.m261394a(file.getAbsolutePath(), str2, str3);
            return apiWriteFileCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"writeFile"})
    public void writeFileAsync(LKEvent lKEvent, ApiWriteFileCtrlRequest apiWriteFileCtrlRequest, AbstractC25897h<ApiWriteFileCtrlResponse> hVar) {
        hVar.callback(writeFileImpl(lKEvent, apiWriteFileCtrlRequest));
    }
}
