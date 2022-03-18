package com.tt.miniapp.net;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;

public class OperateUploadTaskPlugin extends OPPlugin {
    private IAppContext mAppContext;

    private static class OperateUploadTaskRequest extends C25920a {
        @JSONField(name = "operationType")
        public String mOperationType;
        @JSONField(name = "uploadTaskId")
        public int mUploadTaskId;

        private OperateUploadTaskRequest() {
        }
    }

    private static class OperateUploadTaskResponse extends C25921b {
        private OperateUploadTaskResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"operateUploadTask"})
    public void operateUploadTaskAsync(LKEvent lKEvent, OperateUploadTaskRequest operateUploadTaskRequest, AbstractC25905b bVar, ILogger aVar, AbstractC25897h<OperateUploadTaskResponse> hVar) {
        this.mAppContext = getEventContext(lKEvent);
        OperateUploadTaskResponse operateUploadTaskResponse = new OperateUploadTaskResponse();
        aVar.mo92224i("OperateUploadTaskImpl", "operate upload task impl invoke ........");
        try {
            int i = operateUploadTaskRequest.mUploadTaskId;
            String str = operateUploadTaskRequest.mOperationType;
            if (TextUtils.equals(str, "abort")) {
                aVar.mo92224i("OperateUploadTaskImpl", "abort upload task:", Integer.valueOf(i));
                C66504b.m259895b(i, this.mAppContext);
            } else {
                aVar.mo92224i("OperateUploadTaskImpl", "operate upload task and type:", str);
                operateUploadTaskResponse.mErrorCode = C25906a.f64080j.f64115H;
                operateUploadTaskResponse.mErrorMessage = "operate upload task and type:  " + str;
            }
        } catch (Exception e) {
            aVar.mo92223e("OperateUploadTaskImpl", "operate upload task err ", e);
            operateUploadTaskResponse.mErrorCode = C25906a.f64080j.f64115H;
            operateUploadTaskResponse.mErrorMessage = "operate upload task err ";
        }
        hVar.callback(operateUploadTaskResponse);
    }
}
