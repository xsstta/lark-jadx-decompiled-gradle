package com.larksuite.component.openplatform.core.plugin.container.tabbar;

import android.graphics.Bitmap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.container.C24692p;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.C66661q;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.tabbar.d */
public class C24712d extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "setTabBarItem";
    }

    public C24712d() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67054r.m261338a(getAppContext())) {
            callbackFail(ApiCode.SETTABBARITEM_NO_TAB);
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(this.mArgs);
            final int optInt = jSONObject.optInt("index", -1);
            if (optInt == -1) {
                callbackFail(ApiCode.SETTABBARITEM_INDEX_IS_NOT_NUMBER);
                return;
            }
            final String optString = jSONObject.optString("text");
            final String optString2 = jSONObject.optString("iconPath");
            final String optString3 = jSONObject.optString("selectedIconPath");
            AppBrandLogger.m52830i("ApiSetTabBarItem", "index: " + optInt + " text:" + optString + " iconPath:" + optString2 + " selectedIconPath:" + optString3);
            if (getAppContext() instanceof AbstractC67433a) {
                C24692p.m89747a(getAppContext(), new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24712d.RunnableC247131 */

                    public void run() {
                        final Bitmap bitmap;
                        Bitmap bitmap2;
                        try {
                            AbstractC67434b a = ((AbstractC67433a) C24712d.this.getAppContext()).mo234156a();
                            if (a != null && (a instanceof C66546p)) {
                                if (((C66546p) a).mo232112D() != null) {
                                    C66661q D = ((C66546p) a).mo232112D();
                                    if (D == null) {
                                        AppBrandLogger.m52829e("ApiSetTabBarItem", ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                                        C24712d.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("tabFragment"));
                                        return;
                                    }
                                    final C66661q.C66665a a2 = D.mo232382a(optInt);
                                    if (a2 == null) {
                                        AppBrandLogger.m52829e("ApiSetTabBarItem", "TabController is null");
                                        C24712d.this.callbackFail(ApiCode.SETTABBARITEM_INDEX_ERROR);
                                        return;
                                    }
                                    final Bitmap bitmap3 = null;
                                    if (jSONObject.has("iconPath")) {
                                        byte[] loadByteFromStream = StreamLoader.loadByteFromStream(optString2, C24712d.this.getAppContext());
                                        if (loadByteFromStream == null || loadByteFromStream.length <= 0) {
                                            bitmap2 = null;
                                        } else {
                                            bitmap2 = C67070z.m261385a(loadByteFromStream);
                                        }
                                        if (bitmap2 == null) {
                                            AppBrandLogger.m52829e("ApiSetTabBarItem", "iconPath not found:" + optString2);
                                            C24712d.this.callbackFail(ApiCode.SETTABBARITEM_ICON_NOT_FOUND);
                                            return;
                                        }
                                        bitmap = bitmap2;
                                    } else {
                                        bitmap = null;
                                    }
                                    if (jSONObject.has("selectedIconPath")) {
                                        byte[] loadByteFromStream2 = StreamLoader.loadByteFromStream(optString3, C24712d.this.getAppContext());
                                        if (loadByteFromStream2 != null && loadByteFromStream2.length > 0) {
                                            bitmap3 = C67070z.m261385a(loadByteFromStream2);
                                        }
                                        if (bitmap3 == null) {
                                            AppBrandLogger.m52829e("ApiSetTabBarItem", "selectedIconPath not found:" + optString3);
                                            C24712d.this.callbackFail(ApiCode.SETTABBARITEM_SELECTED_ICON_NOT_FOUND);
                                            return;
                                        }
                                    }
                                    final String e = D.mo232396e();
                                    AppbrandContext.getMainHandler().post(new Runnable() {
                                        /* class com.larksuite.component.openplatform.core.plugin.container.tabbar.C24712d.RunnableC247131.RunnableC247141 */

                                        public void run() {
                                            a2.mo232406a(optString, bitmap, bitmap3, e);
                                            C24712d.this.callbackOk();
                                        }
                                    });
                                    return;
                                }
                            }
                            AppBrandLogger.m52829e("ApiSetTabBarItem", "environment not available");
                            C24712d.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, "environment not available");
                        } catch (Exception e2) {
                            AppBrandLogger.m52829e("ApiSetTabBarItem", e2);
                            C24712d.this.callbackFail(e2);
                        }
                    }
                });
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiSetTabBarItem", e);
            callbackFail(e);
        }
    }

    public C24712d(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
