package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.graphics.Bitmap;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.container.C24692p;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25914i;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;

public class ApiSetTabBarItemPlugin extends OPPlugin {

    private static class ApiSetTabBarItemRequest extends C25920a {
        @JSONField(name = "iconPath")
        public String mIconPath;
        @JSONField(name = "index")
        @LKRequiredParam
        public int mIndex;
        @JSONField(name = "selectedIconPath")
        public String mSelectedIconPath;
        @JSONField(name = "text")
        public String mText;

        private ApiSetTabBarItemRequest() {
        }
    }

    private static class ApiSetTabBarItemResponse extends C25921b {
        private ApiSetTabBarItemResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"setTabBarItem"})
    public void setTabBarItemAsync(LKEvent lKEvent, ApiSetTabBarItemRequest apiSetTabBarItemRequest, final AbstractC25895f fVar, final AbstractC25897h<ApiSetTabBarItemResponse> hVar) {
        final ApiSetTabBarItemResponse apiSetTabBarItemResponse = new ApiSetTabBarItemResponse();
        if (!C67054r.m261338a(getAppContext())) {
            fVar.mo92190b().mo92223e("ApiSetTabBarItem", ApiCode.HIDETABBAR_NO_TAB.msg);
            fillFailedResponse(apiSetTabBarItemResponse, C25914i.f64197a, C25914i.f64197a.f64117J);
            hVar.callback(apiSetTabBarItemResponse);
            return;
        }
        final int i = apiSetTabBarItemRequest.mIndex;
        final String str = apiSetTabBarItemRequest.mText;
        final String str2 = apiSetTabBarItemRequest.mIconPath;
        final String str3 = apiSetTabBarItemRequest.mSelectedIconPath;
        ILogger b = fVar.mo92190b();
        b.mo92224i("ApiSetTabBarItem", "index: " + i + " text:" + str + " iconPath:" + str2 + " selectedIconPath:" + str3);
        if (!(getAppContext() instanceof AbstractC67433a)) {
            ILogger b2 = fVar.mo92190b();
            b2.mo92223e("ApiSetTabBarItem", "app context is not an instance of IGadgetAppContext. appContext:" + getAppContext().getClass().getSimpleName());
            fillFailedResponse(apiSetTabBarItemResponse, C25906a.f64080j, "only support in gadget");
            hVar.callback(apiSetTabBarItemResponse);
            return;
        }
        C24692p.m89747a(getAppContext(), new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiSetTabBarItemPlugin.RunnableC246991 */

            public void run() {
                final Bitmap bitmap;
                Bitmap bitmap2;
                AbstractC67434b a = ((AbstractC67433a) ApiSetTabBarItemPlugin.this.getAppContext()).mo234156a();
                if (a != null && (a instanceof C66546p)) {
                    C66546p pVar = (C66546p) a;
                    if (pVar.mo232112D() != null) {
                        C66661q D = pVar.mo232112D();
                        if (D == null) {
                            fVar.mo92190b().mo92223e("ApiSetTabBarItem", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                            ApiSetTabBarItemPlugin.this.fillFailedResponse(apiSetTabBarItemResponse, C25906a.f64080j, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                            hVar.callback(apiSetTabBarItemResponse);
                            return;
                        }
                        final C66661q.C66665a a2 = D.mo232382a(i);
                        if (a2 == null) {
                            fVar.mo92190b().mo92223e("ApiSetTabBarItem", "TabController is null");
                            ApiSetTabBarItemPlugin.this.fillFailedResponse(apiSetTabBarItemResponse, C25906a.f64072b, "TabController is null pageIndex " + i);
                            hVar.callback(apiSetTabBarItemResponse);
                            return;
                        }
                        String str = str2;
                        final Bitmap bitmap3 = null;
                        if (str == null || str.isEmpty()) {
                            bitmap = null;
                        } else {
                            byte[] loadByteFromStream = StreamLoader.loadByteFromStream(str2, ApiSetTabBarItemPlugin.this.getAppContext());
                            if (loadByteFromStream == null || loadByteFromStream.length <= 0) {
                                bitmap2 = null;
                            } else {
                                bitmap2 = C67070z.m261385a(loadByteFromStream);
                            }
                            if (bitmap2 == null) {
                                fVar.mo92190b().mo92223e("ApiSetTabBarItem", "iconPath not found:" + str2);
                                ApiSetTabBarItemPlugin.this.fillFailedResponse(apiSetTabBarItemResponse, C25914i.f64198b, "iconPath not found:" + str2);
                                hVar.callback(apiSetTabBarItemResponse);
                                return;
                            }
                            bitmap = bitmap2;
                        }
                        String str2 = str3;
                        if (str2 != null && !str2.isEmpty()) {
                            byte[] loadByteFromStream2 = StreamLoader.loadByteFromStream(str3, ApiSetTabBarItemPlugin.this.getAppContext());
                            if (loadByteFromStream2 != null && loadByteFromStream2.length > 0) {
                                bitmap3 = C67070z.m261385a(loadByteFromStream2);
                            }
                            if (bitmap3 == null) {
                                fVar.mo92190b().mo92223e("ApiSetTabBarItem", "selectedIconPath not found:" + str3);
                                ApiSetTabBarItemPlugin.this.fillFailedResponse(apiSetTabBarItemResponse, C25914i.f64199c, "selectedIconPath not found:" + str3);
                                hVar.callback(apiSetTabBarItemResponse);
                                return;
                            }
                        }
                        final String e = D.mo232396e();
                        AppbrandContext.getMainHandler().post(new Runnable() {
                            /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.ApiSetTabBarItemPlugin.RunnableC246991.RunnableC247001 */

                            public void run() {
                                a2.mo232406a(str, bitmap, bitmap3, e);
                                hVar.callback(apiSetTabBarItemResponse);
                            }
                        });
                        return;
                    }
                }
                fVar.mo92190b().mo92223e("ApiSetTabBarItem", "environment not available");
                ApiSetTabBarItemPlugin.this.fillFailedResponse(apiSetTabBarItemResponse, C25906a.f64080j, "environment not available");
                hVar.callback(apiSetTabBarItemResponse);
            }
        });
    }
}
