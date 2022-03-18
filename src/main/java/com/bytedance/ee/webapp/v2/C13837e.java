package com.bytedance.ee.webapp.v2;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.plugin_annotation.bean.LKOpenApiBizDomain;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.ref.p682a.p683a.C13484a;
import com.bytedance.ee.util.C13663f;
import com.bytedance.ee.webapp.p720a.C13755b;
import com.bytedance.ee.webapp.p720a.C13756c;
import com.bytedance.ee.webapp.utils.C13821a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.webapp.v2.e */
public class C13837e {

    /* renamed from: a */
    public C13484a f36174a;

    /* renamed from: b */
    public IAppContext f36175b;

    /* renamed from: c */
    private LarkWebView f36176c;

    /* renamed from: d */
    private final String[] f36177d = {"config"};

    /* renamed from: c */
    public boolean mo51062c(String str) {
        return true;
    }

    /* renamed from: a */
    public LKOpenApiBizDomain mo51055a() {
        return LKOpenApiBizDomain.OPEN_PLATFORM;
    }

    /* renamed from: b */
    private void m56108b() {
        mo51061b("openDocument");
        mo51061b("getUserInfo");
        mo51061b("getSystemInfo");
        mo51061b("config");
        mo51061b("vibrateShort");
        mo51061b("vibrateLong");
        mo51061b("getNetworkType");
        mo51061b("saveFile");
        mo51061b("showToast");
        mo51061b("hideToast");
        mo51061b("showModal");
        mo51061b("showActionSheet");
        mo51061b("previewImage");
        mo51061b("chooseImage");
        mo51061b("chooseVideo");
        mo51061b("saveImageToPhotosAlbum");
        mo51061b("saveVideoToPhotosAlbum");
        mo51061b("getImageInfo");
        mo51061b("compressImage");
        mo51061b("filePicker");
        mo51061b("docsPicker");
        mo51061b("mailto");
        mo51061b("checkWatermark");
        mo51061b("getStorage");
        mo51061b("setStorage");
        mo51061b("removeStorage");
        mo51061b("clearStorage");
        mo51061b("getStorageInfo");
        mo51061b("getClipboardData");
        mo51061b("setClipboardData");
        mo51061b("getConnectedWifi");
        mo51061b("getWifiStatus");
        mo51061b("onUserCaptureScreen");
        mo51061b("offUserCaptureScreen");
        mo51061b("onGetWifiList");
        mo51061b("offGetWifiList");
        mo51061b("getWifiList");
        mo51061b("makePhoneCall");
        mo51061b("getLocation");
        mo51061b("monitorReport");
        mo51061b("startCompass");
        mo51061b("stopCompass");
        mo51061b("enableAccelerometer");
        mo51061b("startDeviceCredential");
        mo51061b("startPasswordVerify");
        mo51061b("openSchema");
        mo51061b("createDownloadTask");
        mo51061b("operateDownloadTask");
        mo51061b("removeSavedFile");
        mo51061b("authorize");
        mo51061b("openSetting");
        mo51061b("getSetting");
        mo51061b("getBlockActionSourceDetail");
        C13821a.m55979a(this.f36175b, new C13821a.AbstractC13822a() {
            /* class com.bytedance.ee.webapp.v2.C13837e.C138432 */

            @Override // com.bytedance.ee.webapp.utils.C13821a.AbstractC13822a
            /* renamed from: a */
            public void mo50913a(String str) {
                C13837e.this.mo51061b(str);
            }
        });
    }

    /* renamed from: d */
    public AbstractC48760b mo51063d(String str) {
        return new AbstractC48760b(0) {
            /* class com.bytedance.ee.webapp.v2.C13837e.C138443 */

            @Override // com.ss.android.lark.openapi.jsapi.AbstractC48760b
            /* renamed from: a */
            public boolean mo51068a() {
                return false;
            }

            @Override // com.ss.android.lark.openapi.jsapi.AbstractC48760b
            /* renamed from: b */
            public String mo51069b() {
                return "has no permission";
            }
        };
    }

    /* renamed from: a */
    public void mo51057a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36174a.mo50163a(str);
        }
    }

    /* renamed from: b */
    public void mo51061b(final String str) {
        if (mo51062c(str)) {
            if (this.f36176c == null) {
                Log.m165383e("WebAppJsBridge", "mWebView is null !!!!!");
                return;
            }
            this.f36176c.getBridge().mo49770a(str, new BridgeHandler<String, LarkWebView>() {
                /* class com.bytedance.ee.webapp.v2.C13837e.C138381 */

                @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
                /* renamed from: a */
                public boolean mo30817a() {
                    return true;
                }

                /* renamed from: a */
                public void mo30815a(String str, final JsCallBack gVar, String str2, LarkWebView larkWebView) {
                    final OPTrace subTrace = C13837e.this.f36175b.getTracingSpan().subTrace(str);
                    String url = larkWebView.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        url = "";
                    } else if (url.contains("?")) {
                        url = url.substring(0, url.indexOf("?"));
                    }
                    IAppContext iAppContext = C13837e.this.f36175b;
                    String str3 = str;
                    OPMonitorUtils.monitorNativeInvoke(iAppContext, subTrace, str3, C13837e.this.mo51056a(str3, str), null, url, false);
                    final AbstractC48760b d = C13837e.this.mo51063d(str);
                    if (d.mo51068a()) {
                        C13484a aVar = C13837e.this.f36174a;
                        String str4 = str;
                        final String a = aVar.mo235562a(str4, C13837e.this.mo51056a(str4, str), subTrace, new AbstractC65805h() {
                            /* class com.bytedance.ee.webapp.v2.C13837e.C138381.C138391 */

                            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
                            public void callback(final ApiCallResult apiCallResult) {
                                if (apiCallResult.isFail()) {
                                    C13755b.m55771a("op_h5_api_error", C13756c.f35974p, C13837e.this.f36175b).addCategoryValue("api_name", str).addCategoryValue("app_id", C13837e.this.f36175b.getAppId()).flush();
                                }
                                C13663f.m55437a(new Runnable() {
                                    /* class com.bytedance.ee.webapp.v2.C13837e.C138381.C138391.RunnableC138401 */

                                    public void run() {
                                        C13837e.this.mo51058a(apiCallResult.getJson(), !apiCallResult.isFail(), gVar);
                                    }
                                });
                            }
                        });
                        if (TextUtils.isEmpty(a)) {
                            return;
                        }
                        if (a.contains("ok") || a.contains("fail")) {
                            C13663f.m55437a(new Runnable() {
                                /* class com.bytedance.ee.webapp.v2.C13837e.C138381.RunnableC138412 */

                                public void run() {
                                    try {
                                        C13837e.this.mo51058a(new JSONObject(a), a.contains("ok"), gVar);
                                    } catch (JSONException e) {
                                        AppBrandLogger.m52829e("WebAppJsBridge", "JSONException", e);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Logger.m15173i("WebAppJsBridge", str + " for tenant has no access permission");
                    C13663f.m55437a(new Runnable() {
                        /* class com.bytedance.ee.webapp.v2.C13837e.C138381.RunnableC138423 */

                        public void run() {
                            OPMonitorUtils.monitorResultCallback(C13837e.this.f36175b, str, subTrace, "fail", C25906a.f64074d.f64115H, C25906a.f64074d.f64116I, C25906a.f64074d.f64117J, C25906a.f64074d.f64117J, false);
                            C13837e.this.mo51058a(C13837e.this.mo51060b(str, d.mo51069b()), false, gVar);
                        }
                    });
                }
            });
        }
    }

    public C13837e(IAppContext iAppContext, LarkWebView larkWebView) {
        iAppContext.setApiAccessConfig(new LKOpenApiAccessConfig.C25569a().mo88733a(mo51055a()).mo88737a());
        C13484a aVar = (C13484a) iAppContext.findServiceByInterface(AbstractC67717a.class);
        this.f36174a = aVar;
        if (aVar == null) {
            this.f36174a = new C13484a(iAppContext);
        }
        this.f36174a.mo50161a(larkWebView);
        this.f36175b = iAppContext;
        this.f36176c = larkWebView;
        m56108b();
    }

    /* renamed from: a */
    public String mo51056a(String str, String str2) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str2);
            }
            if (Arrays.asList(this.f36177d).contains(str) || !jSONObject.optBoolean("isOldJSSDK")) {
                return str2;
            }
            new C67500a("web_old_protocol_invoke", null, this.f36175b).addCategoryValue("url", this.f36176c.getUrl()).addCategoryValue("api_name", jSONObject.optString("method")).flush();
            return jSONObject.optString("params");
        } catch (JSONException e) {
            Log.m165382e("getParams error:" + e.getLocalizedMessage());
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public JSONObject mo51060b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str + ":fail");
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            Log.m165383e("WebAppJsBridge", "makeErrorMsg" + jSONObject.toString());
        } catch (JSONException e) {
            Log.m165383e("WebAppJsBridge", "makeErrorMsg fail:" + str);
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo51058a(JSONObject jSONObject, boolean z, JsCallBack gVar) {
        Status status;
        if (z) {
            status = Status.SUCCESS;
        } else {
            status = Status.FAILURE;
        }
        gVar.mo49778a(status, jSONObject);
    }

    /* renamed from: a */
    public boolean mo51059a(int i, int i2, Intent intent) {
        IAppContext iAppContext = this.f36175b;
        if (iAppContext == null) {
            return false;
        }
        AbstractC25576a defaultPluginContainer = iAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer == null || !defaultPluginContainer.mo87111a(i, i2, intent)) {
            if (defaultPluginContainer != null) {
                defaultPluginContainer.mo92186x();
            }
            return false;
        }
        defaultPluginContainer.mo92186x();
        return true;
    }
}
