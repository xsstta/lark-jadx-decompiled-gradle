package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
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
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.IOException;
import kotlin.io.C69104g;
import kotlin.io.OnErrorAction;
import kotlin.jvm.functions.Function2;

public class ApiCopyFileCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class ApiCopyFileCtrlRequest extends C25920a {
        @JSONField(name = "destPath")
        @LKRequiredParam
        public String mDestPath;
        @JSONField(name = "srcPath")
        @LKRequiredParam
        public String mSrcPath;

        private ApiCopyFileCtrlRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ApiCopyFileCtrlResponse extends C25921b {
        private ApiCopyFileCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"copyFileSync"})
    public ApiCopyFileCtrlResponse copyFileSync(LKEvent lKEvent, ApiCopyFileCtrlRequest apiCopyFileCtrlRequest) {
        return copyFileImpl(lKEvent, apiCopyFileCtrlRequest);
    }

    private ApiCopyFileCtrlResponse standardCopyFile(LKEvent lKEvent, ApiCopyFileCtrlRequest apiCopyFileCtrlRequest) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiCopyFileCtrlResponse apiCopyFileCtrlResponse = new ApiCopyFileCtrlResponse();
        String str = apiCopyFileCtrlRequest.mSrcPath;
        String str2 = apiCopyFileCtrlRequest.mDestPath;
        b.mo92224i("ApiCopyFileCtrlPlugin", "srcPath=" + str + " destPath=" + str2);
        try {
            if (!((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235602a(new TTFile(str), new TTFile(str2), new TTFileContext(lKEvent.mo92134c().mo92188a(), "copyFile"))) {
                b.mo92224i("ApiCopyFileCtrlPlugin", "copy file return false");
                fillFailedResponse(apiCopyFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                return apiCopyFileCtrlResponse;
            }
        } catch (TTFileException e) {
            TTFileHelper.m264258a(apiCopyFileCtrlResponse, e, b);
        }
        return apiCopyFileCtrlResponse;
    }

    private ApiCopyFileCtrlResponse copyFileImpl(LKEvent lKEvent, ApiCopyFileCtrlRequest apiCopyFileCtrlRequest) {
        boolean z;
        boolean z2;
        if (TTFileHelper.m264259a("copyFile", getAppContext())) {
            return standardCopyFile(lKEvent, apiCopyFileCtrlRequest);
        }
        ILogger b = lKEvent.mo92134c().mo92190b();
        ApiCopyFileCtrlResponse apiCopyFileCtrlResponse = new ApiCopyFileCtrlResponse();
        String str = apiCopyFileCtrlRequest.mSrcPath;
        String str2 = apiCopyFileCtrlRequest.mDestPath;
        b.mo92224i("ApiCopyFileCtrlPlugin", "srcPath=" + str + " destPath=" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            b.mo92224i("path empty, src" + str + " dest:" + str2, new Object[0]);
            C25906a aVar = C25906a.f64072b;
            fillFailedResponse(apiCopyFileCtrlResponse, aVar, "path empty, src" + str + " dest:" + str2);
            return apiCopyFileCtrlResponse;
        }
        File file = new File(getApiDependency().mo235044c(str));
        File file2 = new File(getApiDependency().mo235044c(str2));
        if (!getApiDependency().mo235035a(file)) {
            b.mo92224i("ApiCopyFileCtrlPlugin", "srcFile canRead:" + getApiDependency().mo235035a(file));
            C25908c a = C25910e.m93820a(C25910e.f64125c, str);
            fillFailedResponse(apiCopyFileCtrlResponse, a, "cannot read, src:" + file.getAbsolutePath());
            return apiCopyFileCtrlResponse;
        } else if (!getApiDependency().mo235046c(file2)) {
            b.mo92224i("ApiCopyFileCtrlPlugin", "destFile canWrite:" + getApiDependency().mo235046c(file2));
            C25908c a2 = C25910e.m93820a(C25910e.f64126d, str2);
            fillFailedResponse(apiCopyFileCtrlResponse, a2, "cannot write, dest:" + file2.getAbsolutePath());
            return apiCopyFileCtrlResponse;
        } else {
            TTAPkgFile findFile = StreamLoader.findFile(str, getAppContext());
            if (IOUtils.isSubPath(file.getAbsolutePath(), file2.getAbsolutePath())) {
                b.mo92224i("ApiCopyFileCtrlPlugin", "is subpath, src:" + file.getAbsolutePath() + " dest:" + file2.getAbsolutePath());
                C25910e eVar = C25910e.f64133k;
                fillFailedResponse(apiCopyFileCtrlResponse, eVar, C25910e.f64133k.f64117J + " src:" + file.getAbsolutePath() + " dest:" + file.getAbsolutePath());
                return apiCopyFileCtrlResponse;
            } else if (findFile == null && !file.exists()) {
                b.mo92224i("ApiCopyFileCtrlPlugin", "srcFile not exists");
                C25908c a3 = C25910e.m93820a(C25910e.f64127e, str);
                fillFailedResponse(apiCopyFileCtrlResponse, a3, "file not exists, file:" + file.getAbsolutePath());
                return apiCopyFileCtrlResponse;
            } else if (file2.exists()) {
                b.mo92224i("ApiCopyFileCtrlPlugin", "destFile exists");
                C25908c a4 = C25910e.m93820a(C25910e.f64128f, str2);
                fillFailedResponse(apiCopyFileCtrlResponse, a4, "destFile exists, file:" + file2.getAbsolutePath());
                return apiCopyFileCtrlResponse;
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile == null || !parentFile.exists()) {
                    b.mo92224i("ApiCopyFileCtrlPlugin", "destFile parent not exists:");
                    C25908c a5 = C25910e.m93820a(C25910e.f64127e, str2);
                    fillFailedResponse(apiCopyFileCtrlResponse, a5, "parent not exists, dest:" + file2.getAbsolutePath());
                    return apiCopyFileCtrlResponse;
                }
                long fileLength = IOUtils.fileLength(file);
                b.mo92224i("ApiCopyFileCtrlPlugin", "file length:" + fileLength);
                if ((findFile == null || !getApiDependency().mo235031a((long) findFile.getSize())) && ((!file.exists() || !getApiDependency().mo235031a(file.length())) && fileLength != -1)) {
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("srcFileExist=");
                    sb.append(file.exists());
                    sb.append(" srcTTTileExist=");
                    if (findFile != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    objArr[0] = sb.toString();
                    b.mo92224i("ApiCopyFileCtrlPlugin", objArr);
                    if (file.exists()) {
                        z2 = C69104g.m265932a(file, file2, false, (Function2<? super File, ? super IOException, ? extends OnErrorAction>) new Function2() {
                            /* class com.larksuite.component.openplatform.core.plugin.infra.file.$$Lambda$ApiCopyFileCtrlPlugin$Ns76_wiWOpKBjRhUYrz9B1JfIY */

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ILogger.this.mo92223e("ApiCopyFileCtrlPlugin", "file exception", (File) obj, (IOException) obj2);
                            }
                        });
                    } else if (findFile != null) {
                        z2 = StreamLoader.extractToFile(str, file2.getParent(), file2.getName(), getAppContext());
                    } else {
                        z2 = false;
                    }
                    b.mo92224i("ApiCopyFileCtrlPlugin", "success=" + z2);
                    if (!z2) {
                        fillFailedResponse(apiCopyFileCtrlResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                    }
                    return apiCopyFileCtrlResponse;
                }
                b.mo92224i("ApiCopyFileCtrlPlugin", "user dir over limit");
                fillFailedResponse(apiCopyFileCtrlResponse, C25910e.f64132j, C25910e.f64132j.f64117J);
                return apiCopyFileCtrlResponse;
            }
        }
    }

    @LKPluginFunction(async = true, eventName = {"copyFile"})
    public void copyFileAsync(LKEvent lKEvent, ApiCopyFileCtrlRequest apiCopyFileCtrlRequest, AbstractC25897h<ApiCopyFileCtrlResponse> hVar) {
        hVar.callback(copyFileImpl(lKEvent, apiCopyFileCtrlRequest));
    }
}
