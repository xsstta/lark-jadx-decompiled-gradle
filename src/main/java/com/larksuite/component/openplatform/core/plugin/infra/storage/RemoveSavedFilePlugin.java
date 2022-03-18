package com.larksuite.component.openplatform.core.plugin.infra.storage;

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
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;

public class RemoveSavedFilePlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class RemoveSavedFileAsyncHandlerRequest extends C25920a {
        @JSONField(name = "filePath")
        @LKRequiredParam
        public String keyFilePath;

        private RemoveSavedFileAsyncHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class RemoveSavedFileAsyncHandlerResponse extends C25921b {
        private RemoveSavedFileAsyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private RemoveSavedFileAsyncHandlerResponse standard(LKEvent lKEvent, RemoveSavedFileAsyncHandlerRequest removeSavedFileAsyncHandlerRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        RemoveSavedFileAsyncHandlerResponse removeSavedFileAsyncHandlerResponse = new RemoveSavedFileAsyncHandlerResponse();
        String str = removeSavedFileAsyncHandlerRequest.keyFilePath;
        b.mo92224i("RemoveSavedFilePlugin", "srcPath=" + str);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235620d(new TTFile(str), new TTFileContext(lKEvent.mo92134c().mo92188a(), "removeSavedFile"))) {
                b.mo92224i("RemoveSavedFilePlugin", "remove file return false");
                fillFailedResponse(removeSavedFileAsyncHandlerResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return removeSavedFileAsyncHandlerResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(removeSavedFileAsyncHandlerResponse, e, b);
        }
        return removeSavedFileAsyncHandlerResponse;
    }

    @LKPluginFunction(async = true, eventName = {"removeSavedFile"})
    public void removeSavedFileAsync(LKEvent lKEvent, RemoveSavedFileAsyncHandlerRequest removeSavedFileAsyncHandlerRequest, ILogger aVar, AbstractC25897h<RemoveSavedFileAsyncHandlerResponse> hVar) {
        if (TTFileHelper.m264259a("removeSavedFile", getAppContext())) {
            hVar.callback(standard(lKEvent, removeSavedFileAsyncHandlerRequest));
            return;
        }
        AbstractC67722a aVar2 = (AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class);
        String str = removeSavedFileAsyncHandlerRequest.keyFilePath;
        RemoveSavedFileAsyncHandlerResponse removeSavedFileAsyncHandlerResponse = new RemoveSavedFileAsyncHandlerResponse();
        aVar.mo92224i("RemoveSavedFilePlugin", "delete file filePath=" + str);
        if (TextUtils.isEmpty(str)) {
            aVar.mo92225w("RemoveSavedFilePlugin", "filePath is empty");
            C25906a aVar3 = C25906a.f64072b;
            fillFailedResponse(removeSavedFileAsyncHandlerResponse, aVar3, "path empty, filePath" + str);
            hVar.callback(removeSavedFileAsyncHandlerResponse);
            return;
        }
        File a = aVar2.mo235076a(str);
        if (!aVar2.mo235091e(a) && !aVar2.mo235089d(a)) {
            aVar.mo92224i("RemoveSavedFilePlugin", "can not write file:" + a.getPath());
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str);
            fillFailedResponse(removeSavedFileAsyncHandlerResponse, a2, "cannot remove, file:" + a.getAbsolutePath());
            hVar.callback(removeSavedFileAsyncHandlerResponse);
        } else if (!a.exists()) {
            hVar.callback(removeSavedFileAsyncHandlerResponse);
        } else if (!a.isFile()) {
            aVar.mo92224i("RemoveSavedFilePlugin", "not file:" + a.getPath());
            C25908c a3 = C25910e.m93820a(C25910e.f64131i, str);
            fillFailedResponse(removeSavedFileAsyncHandlerResponse, a3, "not regular file, file:" + a.getAbsolutePath());
            hVar.callback(removeSavedFileAsyncHandlerResponse);
        } else if (a.delete()) {
            hVar.callback(removeSavedFileAsyncHandlerResponse);
        } else {
            aVar.mo92225w("RemoveSavedFilePlugin", "delete file failed:" + a.getPath());
            fillFailedResponse(removeSavedFileAsyncHandlerResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
            hVar.callback(removeSavedFileAsyncHandlerResponse);
        }
    }
}
