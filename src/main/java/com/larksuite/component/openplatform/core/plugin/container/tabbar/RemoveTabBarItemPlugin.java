package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.refer.common.util.C67866g;

public class RemoveTabBarItemPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private static class Request extends C25920a {
        @JSONField(name = "tag")
        @LKRequiredParam
        public String tag;

        private Request() {
        }
    }

    /* access modifiers changed from: private */
    public static class Response extends C25921b {
        @JSONField(name = "successCode")
        public int successCode;
        @JSONField(name = "successMsg")
        public String successMsg;

        private Response() {
        }
    }

    public void handleResponse(int i, String str, AbstractC25897h<Response> hVar) {
        Response response = new Response();
        if (i == 10000) {
            response.successCode = i;
            response.successMsg = str;
        } else {
            response.mErrorCode = i;
            response.mErrorMessage = str;
        }
        hVar.callback(response);
    }

    @LKPluginFunction(async = true, eventName = {"removeTabBarItem"})
    public void removeTabBarItem(final Request request, AbstractC25905b bVar, final AbstractC25897h<Response> hVar) {
        if (hVar == null) {
            AppBrandLogger.m52829e("OP_SDK_RemoveTabBarItemPlugin", "fatal error : no invoke callback");
        } else if (request == null) {
            AppBrandLogger.m52829e("OP_SDK_RemoveTabBarItemPlugin", "fatal error : no request");
            handleResponse(-10001, "no request", hVar);
        } else if (TextUtils.isEmpty(request.tag)) {
            handleResponse(-10002, "no page path", hVar);
        } else if (getAppContext() instanceof AbstractC67433a) {
            AbstractC67434b a = ((AbstractC67433a) getAppContext()).mo234156a();
            if (a instanceof C66546p) {
                final C66661q D = ((C66546p) a).mo232112D();
                if (D == null) {
                    handleResponse(-10005, "no current tab controller", hVar);
                } else {
                    C67866g.m264027a(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.RemoveTabBarItemPlugin.RunnableC247051 */

                        public void run() {
                            Pair<Integer, String> c = D.mo232392c(request.tag);
                            RemoveTabBarItemPlugin.this.handleResponse(((Integer) c.first).intValue(), (String) c.second, hVar);
                        }
                    });
                }
            } else {
                handleResponse(-10004, "no current app view proxy", hVar);
            }
        } else {
            handleResponse(-10003, "only support in gadget", hVar);
        }
    }
}
