package com.lark.falcon.engine.plugin;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiErrorCode;

public class WorkerGetUserInfoPlugin extends OPPlugin {

    public static class Response extends C25921b {
        @JSONField(name = "userAvatarUrl")
        public String mUserAvatarUrl;
        @JSONField(name = "userId")
        public String mUserId;
        @JSONField(name = "userName")
        public String mUserName;
    }

    @LKPluginFunction(async = true, eventName = {"getUserInfoInJSWorker"})
    public void getUserInfoInJSWorker(AbstractC25897h<Response> hVar, ILogger aVar) {
        aVar.mo92224i("WorkerGetUserInfoPlugin", "getUserInfo in worker");
        Response response = new Response();
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        if (instance != null) {
            ExtensionWrapper extension = instance.getExtension();
            if (extension != null) {
                response.mUserId = extension.mo49566c();
                response.mUserName = extension.mo49567d();
                response.mUserAvatarUrl = extension.mo49568e();
            } else {
                response.mErrorCode = ApiErrorCode.INNER_CONTEXT_ERROR.code;
                response.mErrorMessage = "wrapper is null";
            }
        } else {
            response.mErrorCode = ApiErrorCode.INNER_CONTEXT_ERROR.code;
            response.mErrorMessage = "LarkExtensionManager is null";
        }
        hVar.callback(response);
    }
}
