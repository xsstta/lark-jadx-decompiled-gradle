package com.tt.miniapp.falcon.p3286b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.falcon.openplugin.LarkWebViewJavaScriptBridge;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.larksuite.component.openplatform.core.utils.ApiMonitorUtil;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.falcon.jsmodule.TTJSBridge;
import com.tt.miniapp.falcon.p3285a.C66049d;
import com.tt.miniapp.jsbridge.C66237b;
import com.tt.miniapp.p3324r.C66718d;
import com.tt.miniapp.p3331t.C66890j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.falcon.b.c */
public class C66057c implements IJsBridge {

    /* renamed from: a */
    public IAppContext f166737a;

    /* renamed from: b */
    public AndroidFalconShellHolder f166738b;

    /* renamed from: c */
    public C66237b f166739c;

    /* renamed from: lambda$1AQxWhZ1x5z4W-czCj5xTEdKjGs  reason: not valid java name */
    public static /* synthetic */ void m271545lambda$1AQxWhZ1x5z4WczCj5xTEdKjGs(C66057c cVar, String str, String str2) {
        cVar.m258682a(str, str2);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public String invoke(String str, String str2, int i) {
        return "";
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void release() {
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void removeHandler() {
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void onHide() {
        ILogger d = C25529d.m91161d(this.f166737a);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "onHide");
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "onHide");
        }
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f166737a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232875d();
        }
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void onShow() {
        ILogger d = C25529d.m91161d(this.f166737a);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "onShow");
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "onShow");
        }
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.f166737a).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232874c();
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m258682a(String str, String str2) {
        if (BridgeUniteHelper.f166701a.mo231125a()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("callbackID", str);
            javaOnlyMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
            javaOnlyMap.putString("callbackType", "continued");
            javaOnlyMap.putMap("extra", new JavaOnlyMap());
            ((LarkWebViewJavaScriptBridge) this.f166738b.mo86077a(LarkWebViewJavaScriptBridge.class)).nativeCallBack(javaOnlyMap);
            AppBrandLogger.m52828d("JsDispatchBridge", "sendMsgToJsCore use new bridge");
            return;
        }
        ((TTJSBridge) this.f166738b.mo86077a(TTJSBridge.class)).subscribeHandler(str, str2);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(String str, String str2) {
        if (str2 != null && str2.contains("fail")) {
            C66060d.m258685a(this.f166737a, str, "subscribeHandler2", Log.getStackTraceString(new Throwable()), 1);
        }
        ILogger d = C25529d.m91161d(this.f166737a);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "event:" + str);
            d.mo92222d("JsDispatchBridge", "data ", str2);
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "event:" + str);
            AppBrandLogger.m52828d("JsDispatchBridge", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
        }
        if (!C25529d.m91154b(this.f166737a, str)) {
            AppBrandLogger.m52828d("JsDispatchBridge", "publishToServer event ", str, " data ", str2);
            this.f166738b.mo86083a(new Runnable(str, str2) {
                /* class com.tt.miniapp.falcon.p3286b.$$Lambda$c$1AQxWhZ1x5z4WczCj5xTEdKjGs */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C66057c.m271545lambda$1AQxWhZ1x5z4WczCj5xTEdKjGs(C66057c.this, this.f$1, this.f$2);
                }
            });
        } else if (d != null) {
            d.mo92224i("JsDispatchBridge", "intercept:" + str);
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "intercept:" + str);
        }
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void invokeApi(String str, AbstractC25903n nVar, int i) {
        C66051b.m258666a(str, nVar, i, this.f166737a, this.f166738b);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(String str, String str2, int i) {
        sendMsgToJsCore(str, str2, i, false);
    }

    public C66057c(IAppContext iAppContext, AndroidFalconShellHolder androidFalconShellHolder, C66237b bVar) {
        this.f166737a = iAppContext;
        this.f166738b = androidFalconShellHolder;
        this.f166739c = bVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m258683a(String str, String str2, int i) {
        ((TTJSBridge) this.f166738b.mo86077a(TTJSBridge.class)).subscribeHandler(str, str2, i);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void invokeApi(String str, LKBasePluginResult lKBasePluginResult, int i) {
        C66051b.m258667a(str, lKBasePluginResult, i, this.f166737a, this.f166738b);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore2(final String str, final IApiOutputParam iApiOutputParam, final boolean z) {
        ILogger d = C25529d.m91161d(this.f166737a);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "sendMsgToJsCore2 event:" + str);
        }
        RunnableC660592 r0 = new Runnable() {
            /* class com.tt.miniapp.falcon.p3286b.C66057c.RunnableC660592 */

            /* renamed from: e */
            private boolean f166753e;

            public void run() {
                if (!this.f166753e) {
                    this.f166753e = true;
                    if (z) {
                        C66057c.this.f166739c.mo231611b(this);
                    }
                    C66049d dVar = (C66049d) C66718d.m260516a(str, iApiOutputParam, new C66050a());
                    if (dVar != null) {
                        String string = dVar.getString(ApiHandler.API_CALLBACK_ERRMSG);
                        if (!TextUtils.isEmpty(string) && string.contains("fail")) {
                            C66060d.m258685a(C66057c.this.f166737a, str, "subscribeHandler2", string, 2);
                        }
                    }
                    ((TTJSBridge) C66057c.this.f166738b.mo86077a(TTJSBridge.class)).subscribeHandler(str, dVar.mo231137a());
                }
            }
        };
        if (z) {
            this.f166739c.mo231608a(r0);
        }
        this.f166738b.mo86083a(r0);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void returnAsyncResult(int i, String str, String str2, String str3) {
        m258681a(i, str, str2, str3, this.f166737a, this.f166738b, this.f166739c);
    }

    @Override // com.tt.frontendapiinterface.IJsBridge
    public void sendMsgToJsCore(String str, String str2, int i, boolean z) {
        if (str2 != null && str2.contains("fail")) {
            C66060d.m258685a(this.f166737a, str, "subscribeHandler3", Log.getStackTraceString(new Throwable()), 1);
        }
        ILogger d = C25529d.m91161d(this.f166737a);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "event:" + str + " webview id:" + i + " forceFront:" + z);
            d.mo92222d("JsDispatchBridge", "data ", str2);
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "event:" + str + " webview id:" + i + " forceFront:" + z);
            AppBrandLogger.m52828d("JsDispatchBridge", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
        }
        if (C25529d.m91154b(this.f166737a, str)) {
            AppBrandLogger.m52828d("JsDispatchBridge", "shouldInterceptSendEventToJs ", str, " data ", str2);
            return;
        }
        AppBrandLogger.m52828d("JsDispatchBridge", "publishToServer event ", str, " data ", str2);
        $$Lambda$c$tUTuICjPJzef_m5t87gPG5vlfvI r0 = new Runnable(str, str2, i) {
            /* class com.tt.miniapp.falcon.p3286b.$$Lambda$c$tUTuICjPJzef_m5t87gPG5vlfvI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C66057c.this.m258683a(this.f$1, this.f$2, this.f$3);
            }
        };
        if (z) {
            this.f166738b.mo86092c(r0);
        } else {
            this.f166738b.mo86083a(r0);
        }
    }

    /* renamed from: a */
    public static void m258681a(final int i, String str, final String str2, final String str3, final IAppContext iAppContext, final AndroidFalconShellHolder androidFalconShellHolder, final C66237b bVar) {
        final boolean a = bVar.mo231610a(iAppContext.getAppId(), str);
        if (!TextUtils.isEmpty(str2) && str2.contains("fail")) {
            C66060d.m258685a(iAppContext, "returnAsyncResult", "invokeHandler2", "api internal fail", 1);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        ILogger d = C25529d.m91161d(iAppContext);
        if (d != null) {
            d.mo92224i("JsDispatchBridge", "callbackId:" + i);
            d.mo92222d("JsDispatchBridge", " data ", str2, "tracingId:" + str3);
        } else {
            AppBrandLogger.m52830i("JsDispatchBridge", "callbackId:" + i);
            AppBrandLogger.m52828d("JsDispatchBridge", " data ", str2, "tracingId:" + str3);
        }
        RunnableC660581 r12 = new Runnable() {
            /* class com.tt.miniapp.falcon.p3286b.C66057c.RunnableC660581 */

            /* renamed from: i */
            private boolean f166748i;

            public void run() {
                String str;
                if (!this.f166748i) {
                    this.f166748i = true;
                    if (a) {
                        bVar.mo231611b(this);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    ApiMonitorUtil.m91100a(str3, currentTimeMillis, currentTimeMillis - currentTimeMillis);
                    if (BridgeUniteHelper.f166701a.mo231125a()) {
                        JSONObject jSONObject = new JSONObject();
                        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager();
                        if (renderViewManager != null) {
                            try {
                                str = renderViewManager.getCallBackType(str2);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                            javaOnlyMap.putInt("callbackID", i);
                            javaOnlyMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
                            javaOnlyMap.putString("callbackType", str);
                            javaOnlyMap.putString("extra", jSONObject.toString());
                            ((LarkWebViewJavaScriptBridge) androidFalconShellHolder.mo86077a(LarkWebViewJavaScriptBridge.class)).nativeCallBack(javaOnlyMap);
                            return;
                        }
                        str = "failure";
                        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                        javaOnlyMap2.putInt("callbackID", i);
                        javaOnlyMap2.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str2);
                        javaOnlyMap2.putString("callbackType", str);
                        javaOnlyMap2.putString("extra", jSONObject.toString());
                        ((LarkWebViewJavaScriptBridge) androidFalconShellHolder.mo86077a(LarkWebViewJavaScriptBridge.class)).nativeCallBack(javaOnlyMap2);
                        return;
                    }
                    ((TTJSBridge) androidFalconShellHolder.mo86077a(TTJSBridge.class)).invokeHandler(i, str2);
                }
            }
        };
        if (a) {
            bVar.mo231608a(r12);
        }
        androidFalconShellHolder.mo86083a(r12);
    }
}
