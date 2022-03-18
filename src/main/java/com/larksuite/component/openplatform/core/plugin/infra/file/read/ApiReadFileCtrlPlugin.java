package com.larksuite.component.openplatform.core.plugin.infra.file.read;

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
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.nio.ByteBuffer;

public class ApiReadFileCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiReadFileCtrlRequest extends C25920a {
        @JSONField(name = "encoding")
        public String mEncoding;
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String mFilePath;
        @JSONField(name = "length")
        public Long mLength;
        @JSONField(name = "position")
        public Long mPosition;

        private ApiReadFileCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiReadFileCtrlResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String mData;

        private ApiReadFileCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private boolean isReadWithString(String str) {
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            return false;
        }
        return true;
    }

    @LKPluginFunction(eventName = {"readFileSync"})
    public ApiReadFileCtrlResponse readFileSync(LKEvent lKEvent, ApiReadFileCtrlRequest apiReadFileCtrlRequest) {
        return readFileInfo(lKEvent, lKEvent.mo92146m(), apiReadFileCtrlRequest, lKEvent.mo92150q());
    }

    private ApiReadFileCtrlResponse standard(LKEvent lKEvent, ApiReadFileCtrlRequest apiReadFileCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiReadFileCtrlResponse apiReadFileCtrlResponse = new ApiReadFileCtrlResponse();
        String str = apiReadFileCtrlRequest.mFilePath;
        String str2 = apiReadFileCtrlRequest.mEncoding;
        Long l = apiReadFileCtrlRequest.mPosition;
        Long l2 = apiReadFileCtrlRequest.mLength;
        b.mo92224i("ApiReadFileCtrlPlugin", "srcPath=" + str + " encoding=" + str2 + " position:" + l + " length:" + l2);
        AbstractC67722a aVar = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar = new TTFile(str);
        try {
            if (!isReadWithString(str2) || C67070z.m261404c(str2)) {
                byte[] a = aVar.mo235607a(gVar, l, l2, 10485760L, new TTFileContext(lKEvent.mo92134c().mo92188a(), "copyFile"));
                if (a == null) {
                    b.mo92224i("ApiReadFileCtrlPlugin", "read file return false");
                    fillFailedResponse(apiReadFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                    return apiReadFileCtrlResponse;
                }
                if (isReadWithString(str2)) {
                    apiReadFileCtrlResponse.mData = C67070z.m261390a(a, str2);
                } else {
                    b.mo92224i("ApiReadFileCtrlPlugin", "read stream with byte array");
                    LKBasePluginResult.AbstractC25940a.C25941a aVar2 = new LKBasePluginResult.AbstractC25940a.C25941a();
                    aVar2.f64248a = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                    aVar2.f64249b = (T) ByteBuffer.wrap(a);
                    apiReadFileCtrlResponse.mIsArrayBuffer = true;
                    apiReadFileCtrlResponse.addArrayBuffer(aVar2);
                }
                return apiReadFileCtrlResponse;
            }
            b.mo92224i("ApiReadFileCtrlPlugin", "encoding:" + str2 + " not invalid");
            C25906a aVar3 = C25906a.f64072b;
            fillFailedResponse(apiReadFileCtrlResponse, aVar3, "encoding not support" + str2);
            return apiReadFileCtrlResponse;
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiReadFileCtrlResponse, e, b);
        }
    }

    @LKPluginFunction(async = true, eventName = {"readFile"})
    public void readFile(LKEvent lKEvent, ApiReadFileCtrlRequest apiReadFileCtrlRequest, AbstractC25897h<ApiReadFileCtrlResponse> hVar) {
        hVar.callback(readFileInfo(lKEvent, lKEvent.mo92146m(), apiReadFileCtrlRequest, lKEvent.mo92150q()));
    }

    private ApiReadFileCtrlResponse readFileInfo(LKEvent lKEvent, String str, ApiReadFileCtrlRequest apiReadFileCtrlRequest, boolean z) {
        if (TTFileHelper.m264259a("copyFile", getAppContext())) {
            return standard(lKEvent, apiReadFileCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiReadFileCtrlResponse apiReadFileCtrlResponse = new ApiReadFileCtrlResponse();
        String str2 = apiReadFileCtrlRequest.mFilePath;
        String str3 = apiReadFileCtrlRequest.mEncoding;
        b.mo92224i("ApiReadFileCtrlPlugin", "ApiReadFileCtrl handleInvoke apiName=" + str + " filePath=" + str2 + " encoding=" + str3);
        File file = new File(getApiDependency().mo235044c(str2));
        if (TextUtils.isEmpty(str2)) {
            b.mo92224i("ApiReadFileCtrlPlugin", "filePath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiReadFileCtrlResponse, aVar, "path empty, filePath" + str2);
            return apiReadFileCtrlResponse;
        } else if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiReadFileCtrlPlugin", "file can not read:" + file.getAbsolutePath());
            C25908c a = C25910e.m93820a(C25910e.f64125c, file);
            fillFailedResponse(apiReadFileCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            return apiReadFileCtrlResponse;
        } else if (!file.exists() && StreamLoader.loadByteFromStream(str2, getAppContext()) == null) {
            b.mo92224i("ApiReadFileCtrlPlugin", "file do not exist:" + file.getAbsolutePath());
            C25908c a2 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(apiReadFileCtrlResponse, a2, "file not exists, file:" + file.getAbsolutePath());
            return apiReadFileCtrlResponse;
        } else if (isReadWithString(str3) && !C67070z.m261404c(str3)) {
            b.mo92224i("ApiReadFileCtrlPlugin", "encoding:" + str3 + " not invalid");
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(apiReadFileCtrlResponse, aVar2, "encoding not support" + str3);
            return apiReadFileCtrlResponse;
        } else if (file.exists()) {
            b.mo92224i("ApiReadFileCtrlPlugin", "read nopkg file");
            if (isReadWithString(str3)) {
                b.mo92224i("ApiReadFileCtrlPlugin", "file exist and encoding is valid.");
                String a3 = C67070z.m261389a(file.getAbsolutePath(), str3);
                if (a3 == null) {
                    b.mo92223e("readString return null", new Object[0]);
                    fillFailedResponse(apiReadFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                    return apiReadFileCtrlResponse;
                }
                apiReadFileCtrlResponse.mData = a3;
                return apiReadFileCtrlResponse;
            }
            b.mo92224i("ApiReadFileCtrlPlugin", "file exist but encoding is not exist, read file with binary.");
            byte[] b2 = C67070z.m261399b(file.getAbsolutePath());
            if (b2 == null) {
                b.mo92223e("readString return null", new Object[0]);
                fillFailedResponse(apiReadFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiReadFileCtrlResponse;
            }
            LKBasePluginResult.AbstractC25940a.C25941a aVar3 = new LKBasePluginResult.AbstractC25940a.C25941a();
            aVar3.f64248a = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            aVar3.f64249b = (T) ByteBuffer.wrap(b2);
            apiReadFileCtrlResponse.mIsArrayBuffer = true;
            apiReadFileCtrlResponse.addArrayBuffer(aVar3);
            return apiReadFileCtrlResponse;
        } else {
            b.mo92224i("ApiReadFileCtrlPlugin", "read pkg file");
            byte[] loadByteFromStream = StreamLoader.loadByteFromStream(str2, getAppContext());
            if (loadByteFromStream == null) {
                b.mo92223e("ApiReadFileCtrlPlugin", "StreamLoader.loadByteFromStream return null ");
                fillFailedResponse(apiReadFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiReadFileCtrlResponse;
            } else if (isReadWithString(str3)) {
                b.mo92224i("ApiReadFileCtrlPlugin", "read stream with encode");
                String a4 = C67070z.m261390a(loadByteFromStream, str3);
                if (a4 == null) {
                    b.mo92223e("decodeByteArrayToString return null", new Object[0]);
                    fillFailedResponse(apiReadFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                    return apiReadFileCtrlResponse;
                }
                apiReadFileCtrlResponse.mData = a4;
                return apiReadFileCtrlResponse;
            } else {
                b.mo92224i("ApiReadFileCtrlPlugin", "read stream with byte array");
                LKBasePluginResult.AbstractC25940a.C25941a aVar4 = new LKBasePluginResult.AbstractC25940a.C25941a();
                aVar4.f64248a = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                aVar4.f64249b = (T) ByteBuffer.wrap(loadByteFromStream);
                apiReadFileCtrlResponse.mIsArrayBuffer = true;
                apiReadFileCtrlResponse.addArrayBuffer(aVar4);
                return apiReadFileCtrlResponse;
            }
        }
    }
}
