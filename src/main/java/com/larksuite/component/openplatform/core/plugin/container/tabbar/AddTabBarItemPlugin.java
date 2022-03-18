package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.refer.common.util.C67866g;

public class AddTabBarItemPlugin extends OPPlugin {
    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
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

    private boolean isTabItemModelLegal(AddTabItemModel addTabItemModel, AbstractC25897h<Response> hVar) {
        if (addTabItemModel == null) {
            AppBrandLogger.m52829e("OP_SDK_AddTabBarItemPlugin", "fatal error : no request");
            handleResponse(-10001, "no request", hVar);
            return false;
        } else if (TextUtils.isEmpty(addTabItemModel.pagePath)) {
            handleResponse(-10002, "no page path", hVar);
            return false;
        } else if (addTabItemModel.text == null) {
            handleResponse(-10003, "no page text", hVar);
            return false;
        } else if (addTabItemModel.lightIcon == null) {
            handleResponse(-10004, "no page lightIcon", hVar);
            return false;
        } else if (TextUtils.isEmpty(addTabItemModel.lightIcon.iconPath)) {
            handleResponse(-10005, "no page lightIcon iconPath", hVar);
            return false;
        } else if (TextUtils.isEmpty(addTabItemModel.lightIcon.selectedIconPath)) {
            handleResponse(-10006, "no page lightIcon selectedIconPath", hVar);
            return false;
        } else if (addTabItemModel.darkIcon == null) {
            handleResponse(-10007, "no page darkIcon", hVar);
            return false;
        } else if (TextUtils.isEmpty(addTabItemModel.darkIcon.iconPath)) {
            handleResponse(-10008, "no page darkIcon iconPath", hVar);
            return false;
        } else if (!TextUtils.isEmpty(addTabItemModel.darkIcon.selectedIconPath)) {
            return true;
        } else {
            handleResponse(-10009, "no page darkIcon selectedIconPath", hVar);
            return false;
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

    @LKPluginFunction(async = true, eventName = {"addTabBarItem"})
    public void addTabBarItem(final AddTabItemModel addTabItemModel, AbstractC25905b bVar, final AbstractC25897h<Response> hVar) {
        if (hVar == null) {
            AppBrandLogger.m52829e("OP_SDK_AddTabBarItemPlugin", "fatal error : no invoke callback");
        } else if (isTabItemModelLegal(addTabItemModel, hVar)) {
            if (getAppContext() instanceof AbstractC67433a) {
                AbstractC67434b a = ((AbstractC67433a) getAppContext()).mo234156a();
                if (a instanceof C66546p) {
                    final C66661q D = ((C66546p) a).mo232112D();
                    if (D == null) {
                        handleResponse(-20001, "no current tab controller", hVar);
                    } else if (D.mo232383a() == null) {
                        handleResponse(-10013, "no tab", hVar);
                    } else {
                        C67866g.m264027a(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.AddTabBarItemPlugin.RunnableC246951 */

                            public void run() {
                                Pair<Integer, String> a = D.mo232381a(addTabItemModel);
                                AddTabBarItemPlugin.this.handleResponse(((Integer) a.first).intValue(), (String) a.second, hVar);
                            }
                        });
                    }
                } else {
                    handleResponse(-20002, "no current app view proxy", hVar);
                }
            } else {
                handleResponse(-20003, "only support in gadget", hVar);
            }
        }
    }
}
