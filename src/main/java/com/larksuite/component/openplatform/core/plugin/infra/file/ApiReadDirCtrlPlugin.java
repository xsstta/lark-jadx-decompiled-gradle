package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1176b.C25910e;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.Set;

public class ApiReadDirCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiReadDirCtrlRequest extends C25920a {
        @JSONField(name = "dirPath")
        @LKRequiredParam
        public String mDirPath;

        private ApiReadDirCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiReadDirCtrlResponse extends C25921b {
        @JSONField(name = "files")
        public String[] mFiles;

        private ApiReadDirCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"readdirSync"})
    public ApiReadDirCtrlResponse readDirAsync(LKEvent lKEvent, ApiReadDirCtrlRequest apiReadDirCtrlRequest) {
        return readDirImpl(lKEvent, apiReadDirCtrlRequest);
    }

    private ApiReadDirCtrlResponse standard(LKEvent lKEvent, ApiReadDirCtrlRequest apiReadDirCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiReadDirCtrlResponse apiReadDirCtrlResponse = new ApiReadDirCtrlResponse();
        String str = apiReadDirCtrlRequest.mDirPath;
        b.mo92224i("ApiReadDirCtrl", "srcPath=" + str);
        try {
            apiReadDirCtrlResponse.mFiles = (String[]) ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235622e(new TTFile(str), new TTFileContext(lKEvent.mo92134c().mo92188a(), "readdir")).toArray(new String[0]);
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiReadDirCtrlResponse, e, b);
        }
        return apiReadDirCtrlResponse;
    }

    private ApiReadDirCtrlResponse readDirImpl(LKEvent lKEvent, ApiReadDirCtrlRequest apiReadDirCtrlRequest) {
        if (TTFileHelper.m264259a("readdir", getAppContext())) {
            return standard(lKEvent, apiReadDirCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        String str = apiReadDirCtrlRequest.mDirPath;
        b.mo92224i("ApiReadDirCtrl", "readDir begin dirPath=" + str);
        ApiReadDirCtrlResponse apiReadDirCtrlResponse = new ApiReadDirCtrlResponse();
        if (TextUtils.isEmpty(str)) {
            b.mo92224i("ApiReadDirCtrl", "dirPath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiReadDirCtrlResponse, aVar, "path empty, filePath" + str);
            return apiReadDirCtrlResponse;
        }
        File file = new File(getApiDependency().mo235044c(str));
        if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiReadDirCtrl", "file can not read:" + file.getAbsolutePath());
            C25908c a = C25910e.m93820a(C25910e.f64125c, file);
            fillFailedResponse(apiReadDirCtrlResponse, a, "cannot read, file:" + file.getAbsolutePath());
            return apiReadDirCtrlResponse;
        } else if (!file.exists() && !StreamLoader.isDirectoryOfPkg(str, getAppContext())) {
            b.mo92224i("ApiReadDirCtrl", "file do not exist:" + file.getAbsolutePath());
            C25908c a2 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiReadDirCtrlResponse, a2, "file not exists, file:" + file.getAbsolutePath());
            return apiReadDirCtrlResponse;
        } else if (!file.exists()) {
            if (StreamLoader.isDirectoryOfPkg(str, getAppContext())) {
                b.mo92224i("ApiReadDirCtrl", "readDir pkg begin");
                if (StreamLoader.getLoadTask(getAppContext()) != null) {
                    Set<String> listTTAPKG = StreamLoader.listTTAPKG(getApiDependency().mo235044c(str), getAppContext());
                    if (listTTAPKG == null || listTTAPKG.isEmpty()) {
                        b.mo92224i("ApiReadDirCtrl", "readDir pkg dir empty");
                    } else {
                        apiReadDirCtrlResponse.mFiles = (String[]) listTTAPKG.toArray(new String[0]);
                    }
                    return apiReadDirCtrlResponse;
                }
                b.mo92224i("ApiReadDirCtrl", "readDir pkg task null");
            }
            fillFailedResponse(apiReadDirCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
            return apiReadDirCtrlResponse;
        } else if (!file.isDirectory()) {
            b.mo92224i("ApiReadDirCtrl", "file is not directory" + file.getPath());
            C25908c a3 = C25910e.m93820a(C25910e.f64130h, str);
            fillFailedResponse(apiReadDirCtrlResponse, a3, "file is not directory, file:" + file.getAbsolutePath());
            return apiReadDirCtrlResponse;
        } else {
            b.mo92224i("ApiReadDirCtrl", "readDir nonPkg begin");
            String[] list = file.list();
            if (list == null) {
                b.mo92224i("ApiReadDirCtrl", "file is not directory after lists");
                C25908c a4 = C25910e.m93820a(C25910e.f64130h, str);
                fillFailedResponse(apiReadDirCtrlResponse, a4, "file is not directory, file:" + file.getAbsolutePath());
                return apiReadDirCtrlResponse;
            }
            if (list.length == 0) {
                b.mo92224i("ApiReadDirCtrl", "dir is empty");
            }
            apiReadDirCtrlResponse.mFiles = list;
            return apiReadDirCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"readdir"})
    public void readDirAsync(LKEvent lKEvent, ApiReadDirCtrlRequest apiReadDirCtrlRequest, AbstractC25897h<ApiReadDirCtrlResponse> hVar) {
        hVar.callback(readDirImpl(lKEvent, apiReadDirCtrlRequest));
    }
}
