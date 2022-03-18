package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
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
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class ApiRenameCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiRenameCtrlRequest extends C25920a {
        @JSONField(name = "newPath")
        @LKRequiredParam
        public String mNewPath;
        @JSONField(name = "oldPath")
        @LKRequiredParam
        public String mOldPath;

        private ApiRenameCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiRenameCtrlResponse extends C25921b {
        private ApiRenameCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private ApiRenameCtrlResponse standard(LKEvent lKEvent, ApiRenameCtrlRequest apiRenameCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiRenameCtrlResponse apiRenameCtrlResponse = new ApiRenameCtrlResponse();
        String str = apiRenameCtrlRequest.mOldPath;
        String str2 = apiRenameCtrlRequest.mNewPath;
        b.mo92224i("ApiRenameCtrlPlugin", "srcPath=" + str + " destPath=" + str2);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235610b(new TTFile(str), new TTFile(str2), new TTFileContext(lKEvent.mo92134c().mo92188a(), "rename"))) {
                b.mo92224i("ApiRenameCtrlPlugin", "move file return false");
                fillFailedResponse(apiRenameCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiRenameCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiRenameCtrlResponse, e, b);
        }
        return apiRenameCtrlResponse;
    }

    @LKPluginFunction(eventName = {"renameSync"})
    public ApiRenameCtrlResponse renameSync(LKEvent lKEvent, ApiRenameCtrlRequest apiRenameCtrlRequest, AbstractC25905b bVar) {
        return renameImpl(lKEvent, apiRenameCtrlRequest, bVar);
    }

    private ApiRenameCtrlResponse renameImpl(LKEvent lKEvent, ApiRenameCtrlRequest apiRenameCtrlRequest, AbstractC25905b bVar) {
        if (TTFileHelper.m264259a("rename", getAppContext())) {
            return standard(lKEvent, apiRenameCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiRenameCtrlResponse apiRenameCtrlResponse = new ApiRenameCtrlResponse();
        String str = apiRenameCtrlRequest.mOldPath;
        String str2 = apiRenameCtrlRequest.mNewPath;
        b.mo92224i("ApiRenameCtrlPlugin", "apiName=" + lKEvent.mo92146m() + " oldPath=" + str + " newPath=" + str2);
        File file = new File(getApiDependency().mo235044c(str));
        File file2 = new File(getApiDependency().mo235044c(str2));
        if (TextUtils.isEmpty(str)) {
            b.mo92225w("ApiRenameCtrlPlugin", "oldPath is empty");
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiRenameCtrlResponse, aVar, "path empty, oldPath" + str);
            return apiRenameCtrlResponse;
        } else if (TextUtils.isEmpty(str2)) {
            b.mo92225w("ApiRenameCtrlPlugin", "newPath is empty");
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(apiRenameCtrlResponse, aVar2, "path empty, newPath" + str2);
            return apiRenameCtrlResponse;
        } else if (!getApiDependency().mo235046c(file)) {
            b.mo92224i("ApiRenameCtrlPlugin", "oldFile canWrite:" + getApiDependency().mo235046c(file));
            C25908c a = C25910e.m93820a(C25910e.f64126d, str);
            fillFailedResponse(apiRenameCtrlResponse, a, "cannot write, file:" + file.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else if (!getApiDependency().mo235046c(file2)) {
            b.mo92224i("ApiRenameCtrlPlugin", " newFile canWrite:" + getApiDependency().mo235046c(file2));
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiRenameCtrlResponse, a2, "cannot write, file:" + file2.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else if (IOUtils.isSubPath(file.getAbsolutePath(), file2.getAbsolutePath())) {
            b.mo92224i("ApiRenameCtrlPlugin", "is subpath, src:" + file.getAbsolutePath() + " dest:" + file2.getAbsolutePath());
            C25910e eVar = C25910e.f64133k;
            fillFailedResponse(apiRenameCtrlResponse, eVar, C25910e.f64133k.f64117J + " src:" + file.getAbsolutePath() + " dest:" + file2.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else if (!file.exists()) {
            b.mo92224i("ApiRenameCtrlPlugin", "oldFile exists:" + file.exists());
            C25908c a3 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(apiRenameCtrlResponse, a3, "file not exists, file:" + file.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else if (file2.exists()) {
            b.mo92224i("ApiRenameCtrlPlugin", " newFile exists:" + file2.getParentFile().exists());
            C25908c a4 = C25910e.m93820a(C25910e.f64128f, str2);
            fillFailedResponse(apiRenameCtrlResponse, a4, "newFile exists, file:" + file2.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else if (file2.getParentFile() == null || !file2.getParentFile().exists()) {
            b.mo92224i("ApiRenameCtrlPlugin", " newFile parentFile exists:" + file2.getParentFile().exists());
            C25908c a5 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(apiRenameCtrlResponse, a5, "parent not exists, file:" + file2.getAbsolutePath());
            return apiRenameCtrlResponse;
        } else {
            AbstractC67722a aVar3 = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
            long fileLength = IOUtils.fileLength(file);
            b.mo92224i("ApiRenameCtrlPlugin", "file length:" + fileLength);
            if (fileLength == -1 || (!aVar3.mo235089d(file) && aVar3.mo235079a(fileLength))) {
                b.mo92223e("ApiRenameCtrlPlugin", "rename failed over limit");
                fillFailedResponse(apiRenameCtrlResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
                return apiRenameCtrlResponse;
            }
            if (!file.renameTo(file2)) {
                b.mo92224i("ApiRenameCtrlPlugin", " renameTo failed, from file:" + file.getAbsolutePath() + " isDirectory:" + file.isDirectory() + " length:" + file.length() + " to file:" + file2.getAbsolutePath() + " length:" + file2.length() + " isDirectory:" + file2.isDirectory());
                try {
                    IOUtils.copyFile(file, file2, true);
                } catch (Exception unused) {
                    b.mo92223e("ApiRenameCtrlPlugin", "rename failed using copy file");
                    fillFailedResponse(apiRenameCtrlResponse, C25906a.f64080j, "rename using copy failed");
                }
            }
            return apiRenameCtrlResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"rename"})
    public void renameAsync(LKEvent lKEvent, ApiRenameCtrlRequest apiRenameCtrlRequest, AbstractC25905b bVar, AbstractC25897h<ApiRenameCtrlResponse> hVar) {
        hVar.callback(renameImpl(lKEvent, apiRenameCtrlRequest, bVar));
    }
}
