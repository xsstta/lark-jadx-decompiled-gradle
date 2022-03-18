package com.larksuite.component.openplatform.core.plugin.infra.storage;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Base64ToTempFilePathPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class Base64ToTempFilePathRequest extends C25920a {
        @JSONField(name = "base64Data")
        @LKRequiredParam
        public String base64Data;
        @JSONField(name = "fileType")
        public String fileType;

        private Base64ToTempFilePathRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class Base64ToTempFilePathResponse extends C25921b {
        @JSONField(name = "tempFilePath")
        public String tempFilePath;

        private Base64ToTempFilePathResponse() {
        }
    }

    private String ensureBase64(String str, ILogger aVar) {
        if (str.startsWith("data:image/png;base64,") || str.startsWith("data:image/x-icon;base64,") || str.startsWith("data:image/jpg;base64,")) {
            String[] split = str.split(",");
            if (split.length > 1) {
                return split[1];
            }
            aVar.mo92223e("Base64ToTempFilePathCtrlPlugin", "base base-64:" + str);
        }
        return str;
    }

    private Base64ToTempFilePathResponse standardGetResponse(LKEvent lKEvent, Base64ToTempFilePathRequest base64ToTempFilePathRequest, ILogger aVar) {
        String str;
        aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "invoke api " + lKEvent.mo92146m());
        String ensureBase64 = ensureBase64(base64ToTempFilePathRequest.base64Data, aVar);
        Base64ToTempFilePathResponse base64ToTempFilePathResponse = new Base64ToTempFilePathResponse();
        try {
            byte[] decode = Base64.decode(ensureBase64, 0);
            aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "base-64 convert to bytes success");
            if (TextUtils.isEmpty(base64ToTempFilePathRequest.fileType)) {
                str = "png";
            } else {
                str = base64ToTempFilePathRequest.fileType;
            }
            TTFile gVar = TTFile.f171100b;
            TTFile a = gVar.mo235646a(System.currentTimeMillis() + "." + str);
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235606a(new ByteArrayInputStream(decode), a, new TTFileContext(lKEvent.mo92134c().mo92188a(), "base64ToTempFilePath"))) {
                base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                base64ToTempFilePathResponse.mErrorMessage = "save temp file fail";
                aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "save temp file fail");
                return base64ToTempFilePathResponse;
            }
            base64ToTempFilePathResponse.tempFilePath = a.mo235647a();
            aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "return success.");
            return base64ToTempFilePathResponse;
        } catch (IllegalArgumentException e) {
            aVar.mo92223e("Base64ToTempFilePathCtrlPlugin", "illegal argument :" + ensureBase64, e);
            base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
            base64ToTempFilePathResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
        } catch (TTFileException e2) {
            aVar.mo92223e("Base64ToTempFilePathCtrlPlugin", "internal error:" + ensureBase64, e2);
            base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            base64ToTempFilePathResponse.mErrorMessage = ApiHandler.API_CALLBACK_EXCEPTION;
        }
    }

    private Base64ToTempFilePathResponse base64ToTempFilePathImpl(LKEvent lKEvent, Base64ToTempFilePathRequest base64ToTempFilePathRequest, ILogger aVar) {
        String str;
        if (TTFileHelper.m264259a("base64ToTempFilePath", getAppContext())) {
            return standardGetResponse(lKEvent, base64ToTempFilePathRequest, aVar);
        }
        aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "invoke api " + lKEvent.mo92146m());
        String ensureBase64 = ensureBase64(base64ToTempFilePathRequest.base64Data, aVar);
        Base64ToTempFilePathResponse base64ToTempFilePathResponse = new Base64ToTempFilePathResponse();
        try {
            byte[] decode = Base64.decode(ensureBase64, 0);
            aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "base-64 convert to bytes success");
            File d = getApiDependency().mo235047d();
            if (TextUtils.isEmpty(base64ToTempFilePathRequest.fileType)) {
                str = "png";
            } else {
                str = base64ToTempFilePathRequest.fileType;
            }
            File file = new File(d, System.currentTimeMillis() + "." + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(decode, 0, decode.length);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!file.exists()) {
                base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                base64ToTempFilePathResponse.mErrorMessage = "save temp file fail";
                aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "save temp file fail");
                return base64ToTempFilePathResponse;
            }
            base64ToTempFilePathResponse.tempFilePath = getApiDependency().mo235048d(file.getPath());
            aVar.mo92224i("Base64ToTempFilePathCtrlPlugin", "return success.");
            return base64ToTempFilePathResponse;
        } catch (IllegalArgumentException e) {
            aVar.mo92223e("Base64ToTempFilePathCtrlPlugin", "illegal argument :" + ensureBase64, e);
            base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
            base64ToTempFilePathResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
        } catch (Exception e2) {
            aVar.mo92223e("Base64ToTempFilePathCtrlPlugin", "internal error:" + ensureBase64, e2);
            base64ToTempFilePathResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            base64ToTempFilePathResponse.mErrorMessage = ApiHandler.API_CALLBACK_EXCEPTION;
        }
    }

    @LKPluginFunction(async = true, eventName = {"base64ToTempFilePath"})
    public void base64ToTempFilePathAsync(LKEvent lKEvent, Base64ToTempFilePathRequest base64ToTempFilePathRequest, ILogger aVar, AbstractC25897h<Base64ToTempFilePathResponse> hVar) {
        hVar.callback(base64ToTempFilePathImpl(lKEvent, base64ToTempFilePathRequest, aVar));
    }

    @LKPluginFunction(eventName = {"base64ToTempFilePathSync"})
    public Base64ToTempFilePathResponse base64ToTempFilePathSync(LKEvent lKEvent, Base64ToTempFilePathRequest base64ToTempFilePathRequest, ILogger aVar, AbstractC25897h<Base64ToTempFilePathResponse> hVar) {
        return base64ToTempFilePathImpl(lKEvent, base64ToTempFilePathRequest, aVar);
    }
}
