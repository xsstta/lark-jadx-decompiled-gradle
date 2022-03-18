package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.net.C66504b;

public class OperateDownloadFileTaskAsyncHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;

    private static class OperateDownloadFileTaskAsyncHandlerRequest extends C25920a {
        @JSONField(name = "downloadTaskId")
        public int downloadTaskId;
        @JSONField(name = "operationType")
        public String operationType;

        private OperateDownloadFileTaskAsyncHandlerRequest() {
        }
    }

    private static class OperateDownloadFileTaskAsyncHandlerResponse extends C25921b {
        private OperateDownloadFileTaskAsyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"operateDownloadTask"})
    public void operateDownloadFileTask(LKEvent lKEvent, OperateDownloadFileTaskAsyncHandlerRequest operateDownloadFileTaskAsyncHandlerRequest, ILogger aVar, AbstractC25897h<OperateDownloadFileTaskAsyncHandlerResponse> hVar) {
        this.mAppContext = getEventContext(lKEvent);
        OperateDownloadFileTaskAsyncHandlerResponse operateDownloadFileTaskAsyncHandlerResponse = new OperateDownloadFileTaskAsyncHandlerResponse();
        aVar.mo92223e("OperateDownloadFileTaskAsyncHandlerPlugin", "abort download task " + operateDownloadFileTaskAsyncHandlerRequest.downloadTaskId);
        try {
            int i = operateDownloadFileTaskAsyncHandlerRequest.downloadTaskId;
            String str = operateDownloadFileTaskAsyncHandlerRequest.operationType;
            if (TextUtils.equals(str, "abort")) {
                aVar.mo92224i("OperateDownloadFileTaskAsyncHandlerPlugin", "operate download task cancel download task:", Integer.valueOf(i));
                C66504b.m259890a(i, this.mAppContext);
            } else {
                aVar.mo92224i("OperateDownloadFileTaskAsyncHandlerPlugin", "operate download task,operateType:", str);
            }
            hVar.callback(operateDownloadFileTaskAsyncHandlerResponse);
        } catch (Exception e) {
            aVar.mo92223e("OperateDownloadFileTaskAsyncHandlerPlugin", "OperateDownloadFileTaskAsyncHandler error:", e);
            operateDownloadFileTaskAsyncHandlerResponse.mErrorCode = C25906a.f64080j.f64115H;
            operateDownloadFileTaskAsyncHandlerResponse.mErrorMessage = "OperateDownloadFileTaskAsyncHandler error ";
            hVar.callback(operateDownloadFileTaskAsyncHandlerResponse);
        }
    }
}
