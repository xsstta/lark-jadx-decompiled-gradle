package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J8\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0010H\u0007¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "decryptFile", "Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin$Response;", "request", "Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin$Request;", "logger", "Lcom/ss/android/lark/optrace/api/ILogger;", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "decryptFileAsync", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "callback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Companion", "Request", "Response", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApiDecryptFilePlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin$Response;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Response extends C25921b {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin$Request;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "filePath", "", "targetFilePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getTargetFilePath", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Request extends C25920a {
        private final String filePath;
        private final String targetFilePath;

        public final String getFilePath() {
            return this.filePath;
        }

        public final String getTargetFilePath() {
            return this.targetFilePath;
        }

        public Request(@JSONField(name = "filePath") String str, @JSONField(name = "targetPath") String str2) {
            this.filePath = str;
            this.targetFilePath = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/infra/file/ApiDecryptFilePlugin$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.ApiDecryptFilePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final Response decryptFile(Request request, ILogger aVar, OPTrace oPTrace) {
        String str;
        String str2;
        if (aVar != null) {
            aVar.mo92224i("ApiDecryptFilePlugin", "decrypt file request " + request);
        }
        Response response = new Response();
        AbstractC67722a aVar2 = null;
        if (request != null) {
            str = request.getFilePath();
        } else {
            str = null;
        }
        TTFile gVar = new TTFile(str);
        if (request != null) {
            str2 = request.getTargetFilePath();
        } else {
            str2 = null;
        }
        TTFile gVar2 = new TTFile(str2);
        TTFileContext hVar = new TTFileContext(oPTrace, "decryptFile");
        IAppContext appContext = getAppContext();
        if (appContext != null) {
            aVar2 = (AbstractC67722a) appContext.findServiceByInterface(AbstractC67722a.class);
        }
        if (aVar2 != null) {
            try {
                aVar2.mo235619d(gVar, gVar2, hVar);
            } catch (TTFileException e) {
                if (aVar != null) {
                    TTFileHelper.f171065a.mo235592a(response, e, aVar);
                }
            }
        }
        return response;
    }

    @LKPluginFunction(async = true, eventName = {"decryptFile"})
    public final void decryptFileAsync(LKEvent lKEvent, ILogger aVar, Request request, AbstractC25897h<Response> hVar) {
        OPTrace oPTrace;
        AbstractC25895f c;
        if (hVar != null) {
            if (lKEvent == null || (c = lKEvent.mo92134c()) == null) {
                oPTrace = null;
            } else {
                oPTrace = c.mo92188a();
            }
            hVar.callback(decryptFile(request, aVar, oPTrace));
        }
    }
}
