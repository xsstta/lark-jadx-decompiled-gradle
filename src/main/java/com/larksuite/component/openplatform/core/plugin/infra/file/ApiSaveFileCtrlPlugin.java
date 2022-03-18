package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
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

public class ApiSaveFileCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class SaveFileAsyncHandlerRequest extends C25920a {
        @JSONField(name = "filePath")
        public String mFilePath;
        @JSONField(name = "tempFilePath")
        @LKRequiredParam
        public String mTempFilePath;

        private SaveFileAsyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class SaveFileAsyncHandlerResponse extends C25921b {
        @JSONField(name = "savedFilePath")
        @LKRequiredParam
        public String mSavedFilePath;

        private SaveFileAsyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"saveFileSync"})
    public SaveFileAsyncHandlerResponse saveFileSync(LKEvent lKEvent, SaveFileAsyncHandlerRequest saveFileAsyncHandlerRequest, AbstractC25905b bVar) {
        return saveFileSyncImpl(lKEvent, saveFileAsyncHandlerRequest, bVar);
    }

    private SaveFileAsyncHandlerResponse saveFileSyncImpl(LKEvent lKEvent, SaveFileAsyncHandlerRequest saveFileAsyncHandlerRequest, AbstractC25905b bVar) {
        return saveFileImpl(lKEvent, saveFileAsyncHandlerRequest, lKEvent.mo92134c().mo92190b());
    }

    private SaveFileAsyncHandlerResponse standard(LKEvent lKEvent, ILogger aVar, SaveFileAsyncHandlerRequest saveFileAsyncHandlerRequest) {
        TTFile gVar;
        SaveFileAsyncHandlerResponse saveFileAsyncHandlerResponse = new SaveFileAsyncHandlerResponse();
        String str = saveFileAsyncHandlerRequest.mTempFilePath;
        String str2 = saveFileAsyncHandlerRequest.mFilePath;
        aVar.mo92224i("SaveFileAsyncHandlerPlugin", "srcPath=" + str + " destPath=" + str2);
        AbstractC67722a aVar2 = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        TTFile gVar2 = new TTFile(str);
        TTFileContext hVar = new TTFileContext(lKEvent.mo92134c().mo92188a(), "saveFile");
        if (gVar2.mo235650d() || !gVar2.mo235653g()) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "srcPath invalid, src:" + str);
            C25906a aVar3 = C25906a.f64072b;
            fillFailedResponse(saveFileAsyncHandlerResponse, aVar3, "path empty, tempFilePath" + gVar2.mo235647a());
            return saveFileAsyncHandlerResponse;
        }
        if (TextUtils.isEmpty(str2)) {
            TTFile gVar3 = TTFile.f171099a;
            gVar = gVar3.mo235646a(System.currentTimeMillis() + IOUtils.getFileExtension(gVar2.mo235654h()));
        } else {
            gVar = new TTFile(str2);
        }
        try {
            if (aVar2.mo235629g(gVar2, hVar)) {
                aVar.mo92224i("SaveFileAsyncHandlerPlugin", "srcPath is dir, src:" + str);
                C25910e eVar = C25910e.f64131i;
                fillFailedResponse(saveFileAsyncHandlerResponse, eVar, "path empty, tempFilePath" + gVar2.mo235647a());
                return saveFileAsyncHandlerResponse;
            } else if (!aVar2.mo235610b(gVar2, gVar, hVar)) {
                aVar.mo92224i("SaveFileAsyncHandlerPlugin", "save file return false");
                fillFailedResponse(saveFileAsyncHandlerResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return saveFileAsyncHandlerResponse;
            } else {
                saveFileAsyncHandlerResponse.mSavedFilePath = gVar.mo235647a();
                return saveFileAsyncHandlerResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(saveFileAsyncHandlerResponse, e, aVar);
        }
    }

    public SaveFileAsyncHandlerResponse saveFileImpl(LKEvent lKEvent, SaveFileAsyncHandlerRequest saveFileAsyncHandlerRequest, ILogger aVar) {
        File file;
        if (TTFileHelper.m264259a("saveFile", getAppContext())) {
            return standard(lKEvent, aVar, saveFileAsyncHandlerRequest);
        }
        String str = saveFileAsyncHandlerRequest.mTempFilePath;
        String str2 = saveFileAsyncHandlerRequest.mFilePath;
        aVar.mo92224i("SaveFileAsyncHandlerPlugin", "tempFilePath=" + str + " targetFilePath=" + str2);
        SaveFileAsyncHandlerResponse saveFileAsyncHandlerResponse = new SaveFileAsyncHandlerResponse();
        if (TextUtils.isEmpty(str)) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "tempFilePath is empty");
            C25906a aVar2 = C25906a.f64072b;
            fillFailedResponse(saveFileAsyncHandlerResponse, aVar2, "path empty, tempFilePath" + str);
            return saveFileAsyncHandlerResponse;
        }
        File b = getApiDependency().mo235038b(str);
        if (TextUtils.isEmpty(str2)) {
            File e = getApiDependency().mo235049e();
            file = new File(e, System.currentTimeMillis() + IOUtils.getFileExtension(b.getAbsolutePath()));
        } else {
            file = getApiDependency().mo235038b(str2);
        }
        if (!getApiDependency().mo235035a(b)) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "tempFile cannot be read, tempFilePath=" + str);
            C25908c a = C25910e.m93820a(C25910e.f64125c, str);
            fillFailedResponse(saveFileAsyncHandlerResponse, a, "cannot read, file:" + b.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (!getApiDependency().mo235046c(file)) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "targetFile cannot be written, targetFile=" + str2);
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(saveFileAsyncHandlerResponse, a2, "cannot write, file:" + file.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (!b.exists()) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "tempFile is not exist, tempFilePath=" + str);
            C25908c a3 = C25910e.m93820a(C25910e.f64127e, str);
            fillFailedResponse(saveFileAsyncHandlerResponse, a3, "file not exists, file:" + b.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (file.exists()) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", " to exists:" + file.getParentFile().exists());
            C25908c a4 = C25910e.m93820a(C25910e.f64128f, str2);
            fillFailedResponse(saveFileAsyncHandlerResponse, a4, "to exists, file:" + file.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (file.getParentFile() == null || !file.getParentFile().exists()) {
            aVar.mo92224i("SaveFileAsyncHandlerPlugin", "targetFile is not exist, targetFilePath=" + str2);
            C25908c a5 = C25910e.m93820a(C25910e.f64127e, str2);
            fillFailedResponse(saveFileAsyncHandlerResponse, a5, "file not exists, file:" + file.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (getApiDependency().mo235031a(b.length())) {
            aVar.mo92223e("SaveFileAsyncHandlerPlugin", "over limit");
            fillFailedResponse(saveFileAsyncHandlerResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
            return saveFileAsyncHandlerResponse;
        } else if (TextUtils.equals(str, str2)) {
            aVar.mo92222d("SaveFileAsyncHandlerPlugin", "TextUtils.equals(tempPath, targetFilePath)");
            saveFileAsyncHandlerResponse.mSavedFilePath = getApiDependency().mo235048d(file.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else if (IOUtils.copyFile(b, file, true) == 0) {
            saveFileAsyncHandlerResponse.mSavedFilePath = getApiDependency().mo235048d(file.getAbsolutePath());
            return saveFileAsyncHandlerResponse;
        } else {
            fillFailedResponse(saveFileAsyncHandlerResponse, C25906a.f64080j, "file copy failed");
            return saveFileAsyncHandlerResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"saveFile"})
    public void saveFileAsync(final LKEvent lKEvent, final SaveFileAsyncHandlerRequest saveFileAsyncHandlerRequest, AbstractC25905b bVar, final AbstractC25897h<SaveFileAsyncHandlerResponse> hVar) {
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.infra.file.ApiSaveFileCtrlPlugin.C248951 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AbstractC25897h hVar = hVar;
                ApiSaveFileCtrlPlugin apiSaveFileCtrlPlugin = ApiSaveFileCtrlPlugin.this;
                LKEvent lKEvent = lKEvent;
                hVar.callback(apiSaveFileCtrlPlugin.saveFileImpl(lKEvent, saveFileAsyncHandlerRequest, lKEvent.mo92134c().mo92190b()));
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }
}
