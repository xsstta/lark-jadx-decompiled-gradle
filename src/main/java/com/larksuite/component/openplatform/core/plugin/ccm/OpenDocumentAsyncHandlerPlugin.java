package com.larksuite.component.openplatform.core.plugin.ccm;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.tt.refer.impl.business.file.TTBizError;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileError;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class OpenDocumentAsyncHandlerPlugin extends OPPlugin {
    private static final List<String> FILE_TYPE_LIST = Arrays.asList("doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf");

    private static class OpenDocumentAsyncHandlerResponse extends C25921b {
        private OpenDocumentAsyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static class OpenDocumentAsyncHandlerRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String filePath;
        @JSONField(name = "fileType")
        public String fileType;
        @JSONField(name = "showMenu")
        public boolean showMenu = true;

        private OpenDocumentAsyncHandlerRequest() {
        }
    }

    private void callbackOk(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    private String convertToRealFilePath(String str) {
        if (!str.startsWith("ttfile")) {
            return "";
        }
        return getApiDependency().mo235038b(str).getAbsolutePath();
    }

    public String getFileType(String str, String str2) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".") + 1) >= str.length()) {
            return "";
        }
        String substring = str.substring(lastIndexOf);
        AppBrandLogger.m52828d("LarkApiOpenDocument-AsyncHandler", "getFileType:" + substring);
        if (FILE_TYPE_LIST.contains(substring.toLowerCase())) {
            return substring.toLowerCase();
        }
        return "";
    }

    @LKPluginFunction(async = true, eventName = {"openDocument"})
    public void OpenDocumentAsyncHandlerAsync(LKEvent lKEvent, OpenDocumentAsyncHandlerRequest openDocumentAsyncHandlerRequest, AbstractC25905b bVar, AbstractC25897h<OpenDocumentAsyncHandlerResponse> hVar) {
        OpenDocumentAsyncHandlerResponse openDocumentAsyncHandlerResponse = new OpenDocumentAsyncHandlerResponse();
        String str = openDocumentAsyncHandlerRequest.filePath;
        String str2 = openDocumentAsyncHandlerRequest.fileType;
        boolean z = openDocumentAsyncHandlerRequest.showMenu;
        AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc begin filePath=" + str + " fileType=" + str2 + " showMenu=" + z);
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed filePath=null");
            fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64072b, "filePath = null");
            hVar.callback(openDocumentAsyncHandlerResponse);
        } else if (TextUtils.equals("cloudFile", str2)) {
            if (getApiDependency().mo235050e(str)) {
                Activity f = getApiDependency().mo235051f();
                if (f != null) {
                    getApiDependency().mo235023a(f, str);
                    callbackOk(lKEvent);
                    return;
                }
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed activity=null");
                fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64080j, "activity = null");
                hVar.callback(openDocumentAsyncHandlerResponse);
                return;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed cannot open cloud file");
            fillFailedResponse(openDocumentAsyncHandlerResponse, C25910e.f64123a, "openDoc failed cannot open cloud file");
            hVar.callback(openDocumentAsyncHandlerResponse);
        } else if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
            hVar.callback(standardOpen(lKEvent, openDocumentAsyncHandlerResponse, str, str2, z));
        } else {
            String convertToRealFilePath = convertToRealFilePath(str);
            if (TextUtils.isEmpty(convertToRealFilePath)) {
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed realFilePath=null");
                fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64072b, "realFilePath = null");
                hVar.callback(openDocumentAsyncHandlerResponse);
                return;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc realFilePath=" + convertToRealFilePath);
            if (!new File(convertToRealFilePath).exists()) {
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "realFile do not exist");
                fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64072b, "realFile do not exist");
                hVar.callback(openDocumentAsyncHandlerResponse);
                return;
            }
            Activity f2 = getApiDependency().mo235051f();
            if (f2 != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = getFileType(str, str2);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                }
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc fileType=" + str2);
                boolean a = getApiDependency().mo235032a(f2, getAppContext().getAppId(), convertToRealFilePath, str2, z);
                AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc end result=" + a);
                if (a) {
                    callbackOk(lKEvent);
                    return;
                }
                fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64080j, "start activity fail");
                hVar.callback(openDocumentAsyncHandlerResponse);
                return;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed activity=null");
            fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64080j, "activity = null");
            hVar.callback(openDocumentAsyncHandlerResponse);
        }
    }

    private OpenDocumentAsyncHandlerResponse standardOpen(LKEvent lKEvent, OpenDocumentAsyncHandlerResponse openDocumentAsyncHandlerResponse, String str, String str2, boolean z) {
        String str3;
        try {
            TTFile gVar = new TTFile(str);
            if (!gVar.mo235649c()) {
                C25906a aVar = C25906a.f64072b;
                fillFailedResponse(openDocumentAsyncHandlerResponse, aVar, "invalid ttfile:" + gVar);
                return openDocumentAsyncHandlerResponse;
            }
            File i = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235635i(gVar, new TTFileContext(lKEvent.mo92134c().mo92188a(), lKEvent.mo92146m()));
            if (i != null) {
                String path = i.getPath();
                Activity f = getApiDependency().mo235051f();
                if (f != null) {
                    if (TextUtils.isEmpty(str2)) {
                        String fileType = getFileType(str, str2);
                        if (TextUtils.isEmpty(fileType)) {
                            fileType = "";
                        }
                        str3 = fileType;
                    } else {
                        str3 = str2;
                    }
                    AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc fileType=" + str3);
                    boolean a = getApiDependency().mo235032a(f, getAppContext().getAppId(), path, str3, z);
                    AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc end result=" + a);
                    if (!a) {
                        fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64080j, "start activity fail");
                    }
                } else {
                    AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "openDoc failed activity=null");
                    fillFailedResponse(openDocumentAsyncHandlerResponse, C25906a.f64080j, "activity = null");
                }
                return openDocumentAsyncHandlerResponse;
            }
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "file is null");
            C25906a aVar2 = C25906a.f64080j;
            fillFailedResponse(openDocumentAsyncHandlerResponse, aVar2, "getSystemFile failed, ttfile:" + gVar);
            return openDocumentAsyncHandlerResponse;
        } catch (TTFileException e) {
            AppBrandLogger.m52830i("LarkApiOpenDocument-AsyncHandler", "get System File exception", e);
            if (e.getTtFileError() == TTBizError.f171093b) {
                C25906a aVar3 = C25906a.f64072b;
                fillFailedResponse(openDocumentAsyncHandlerResponse, aVar3, "invalid ttfile:" + e.getTtFile());
            } else if (e.getTtFileError() == TTFileError.f171110l) {
                C25906a aVar4 = C25906a.f64072b;
                fillFailedResponse(openDocumentAsyncHandlerResponse, aVar4, "ttfile not exists, " + e.getTtFile());
            } else {
                C25906a aVar5 = C25906a.f64080j;
                fillFailedResponse(openDocumentAsyncHandlerResponse, aVar5, "internal error, errorCode:" + e.getTtFileError().mo235661a());
            }
            return openDocumentAsyncHandlerResponse;
        }
    }
}
