package com.tt.miniapp.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.n */
public class C67049n {
    /* renamed from: a */
    public static void m261314a(boolean z, IAppContext iAppContext) {
        IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
        if (jsBridge != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("from", z ? 1002 : CommonCode.StatusCode.API_CLIENT_EXPIRED);
                jSONObject.put("fromTag", z ? "backPress" : "tag");
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("tma_JsCoreUtils", "", e);
            }
            jsBridge.sendMsgToJsCore("onBeforeExitMiniProgram", jSONObject.toString());
        }
    }

    /* renamed from: a */
    public static void m261309a(IAppContext iAppContext) {
        try {
            JSONObject jSONObject = new JSONObject();
            IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
            if (jsBridge != null) {
                jsBridge.sendMsgToJsCore("onAppEnterBackground", jSONObject.toString());
                AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppEnterBackground" + jSONObject.toString());
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }

    /* renamed from: d */
    public static void m261317d(IAppContext iAppContext) {
        IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
        if (jsBridge == null) {
            AppBrandLogger.m52830i("tma_JsCoreUtils", "sendThemeChange fail : js bridge is null");
        } else if (!AppbrandApplicationImpl.getInst(iAppContext).isMainJsLoadCompleted()) {
            AppBrandLogger.m52830i("tma_JsCoreUtils", "sendThemeChange fail : main js not ready");
        } else {
            String e = C25529d.m91164e(iAppContext);
            if (TextUtils.isEmpty(e)) {
                AppBrandLogger.m52830i("tma_JsCoreUtils", "sendThemeChange fail : app config is not loaded");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("theme", e);
                jsBridge.sendMsgToJsCore("onThemeChange", jSONObject.toString());
            } catch (JSONException e2) {
                AppBrandLogger.m52830i("tma_JsCoreUtils", "sendThemeChange fail : " + e2.getMessage());
            }
        }
    }

    /* renamed from: e */
    public static void m261318e(IAppContext iAppContext) {
        try {
            JSONObject jSONObject = new JSONObject();
            IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
            if (jsBridge != null) {
                if (iAppContext.getExtra("tab_bar_ready") != null) {
                    jSONObject.put("tab_bar_ready", iAppContext.getExtra("tab_bar_ready"));
                } else {
                    jSONObject.put("tab_bar_ready", -1);
                }
                jsBridge.sendMsgToJsCore("onTabBarReady", jSONObject.toString());
                AppBrandLogger.m52830i("tma_JsCoreUtils", "onTabBarReady" + jSONObject.toString());
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }

    /* renamed from: b */
    public static void m261315b(IAppContext iAppContext) {
        try {
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            if (appInfo != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("shareTicket", appInfo.shareTicket);
                jSONObject.put("scene", appInfo.scene);
                jSONObject.put("subScene", appInfo.subScene);
                if (!TextUtils.isEmpty(appInfo.refererInfo)) {
                    JSONObject jSONObject2 = new JSONObject(appInfo.refererInfo);
                    if (jSONObject2.has("__NotInnerGame")) {
                        jSONObject2.remove("__NotInnerGame");
                    }
                    jSONObject.put("refererInfo", jSONObject2);
                    appInfo.refererInfo = null;
                }
                IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
                if (jsBridge != null) {
                    jsBridge.sendMsgToJsCore("onAppEnterForeground", jSONObject.toString());
                    AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppEnterForeground" + jSONObject.toString());
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }

    /* renamed from: c */
    public static void m261316c(IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo != null) {
            try {
                jSONObject.put("scene", appInfo.scene);
                jSONObject.put("subScene", appInfo.subScene);
                jSONObject.put("shareTicket", appInfo.shareTicket);
                if (!TextUtils.isEmpty(appInfo.refererInfo)) {
                    JSONObject jSONObject2 = new JSONObject(appInfo.refererInfo);
                    if (jSONObject2.has("__NotInnerGame")) {
                        jSONObject2.remove("__NotInnerGame");
                    }
                    jSONObject.put("refererInfo", jSONObject2);
                }
                if (appInfo.isGame()) {
                    jSONObject.put(SearchIntents.EXTRA_QUERY, appInfo.query);
                } else {
                    String str = appInfo.oriStartPage;
                    AppConfig appConfig = AppbrandApplicationImpl.getInst(iAppContext).getAppConfig();
                    if (appConfig != null && (TextUtils.isEmpty(str) || !C67054r.m261340a(str, iAppContext))) {
                        str = appConfig.f165497d;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String[] split = str.split("\\?");
                        if (split.length > 1) {
                            jSONObject.put("path", split[0]);
                            jSONObject.put(SearchIntents.EXTRA_QUERY, split[1]);
                        } else {
                            jSONObject.put("path", split[0]);
                            jSONObject.put(SearchIntents.EXTRA_QUERY, "");
                        }
                    } else {
                        jSONObject.put("path", "");
                        jSONObject.put(SearchIntents.EXTRA_QUERY, "");
                    }
                }
                try {
                    IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
                    if (jsBridge != null) {
                        jsBridge.sendMsgToJsCore("onAppLaunch", jSONObject.toString());
                        AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppLaunch" + jSONObject.toString());
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_JsCoreUtils", "onAppLaunch fail", e);
                }
            } catch (Exception e2) {
                AppBrandLogger.m52829e("tma_JsCoreUtils", "onAppLaunch params error", e2);
                try {
                    IJsBridge jsBridge2 = C67432a.m262319a(iAppContext).getJsBridge();
                    if (jsBridge2 != null) {
                        jsBridge2.sendMsgToJsCore("onAppLaunch", jSONObject.toString());
                        AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppLaunch" + jSONObject.toString());
                    }
                } catch (Exception e3) {
                    AppBrandLogger.m52829e("tma_JsCoreUtils", "onAppLaunch fail", e3);
                }
            } catch (Throwable th) {
                try {
                    IJsBridge jsBridge3 = C67432a.m262319a(iAppContext).getJsBridge();
                    if (jsBridge3 != null) {
                        jsBridge3.sendMsgToJsCore("onAppLaunch", jSONObject.toString());
                        AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppLaunch" + jSONObject.toString());
                    }
                } catch (Exception e4) {
                    AppBrandLogger.m52829e("tma_JsCoreUtils", "onAppLaunch fail", e4);
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m261313a(final JSONArray jSONArray, final IAppContext iAppContext) {
        final JsRuntimeManager jsRuntimeManager = (JsRuntimeManager) AppbrandApplicationImpl.getInst(iAppContext).getService(JsRuntimeManager.class);
        IJsBridge jsBridge = jsRuntimeManager.getJsBridge();
        if (jsBridge != null) {
            m261311a(jsBridge, jSONArray, iAppContext);
        } else {
            jsRuntimeManager.addJsRuntimeReadyListener(new JsRuntimeManager.JsRuntimeReadyListener() {
                /* class com.tt.miniapp.util.C67049n.C670501 */

                @Override // com.tt.miniapp.jsbridge.JsRuntimeManager.JsRuntimeReadyListener
                public void onJsRuntimeReady() {
                    C67049n.m261311a(jsRuntimeManager.getJsBridge(), jSONArray, iAppContext);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m261310a(IAppContext iAppContext, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webViewId", i);
            IJsBridge jsBridge = C67432a.m262319a(iAppContext).getJsBridge();
            if (jsBridge != null) {
                jsBridge.sendMsgToJsCore("markTemplateReady", jSONObject.toString());
                AppBrandLogger.m52828d("tag_yinyien", "markTemplateReady", jSONObject.toString());
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public static void m261308a(Context context, IAppContext iAppContext) {
        RenderViewManager.IRender currentIRender;
        if (context != null && (currentIRender = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager().getCurrentIRender()) != null) {
            int renderWidth = currentIRender.getRenderWidth();
            int renderHeight = currentIRender.getRenderHeight();
            int ceil = (int) Math.ceil((double) (((float) renderWidth) / C67043j.m261281e(context)));
            int ceil2 = (int) Math.ceil((double) (((float) renderHeight) / C67043j.m261281e(context)));
            AppBrandLogger.m52828d("tma_JsCoreUtils", "onWindowSizeChange->width:" + ceil + " height:" + ceil2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("windowWidth", ceil);
                jSONObject.put("windowHeight", ceil2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("size", jSONObject);
                C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onWindowResize", jSONObject2.toString());
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
            }
        }
    }

    /* renamed from: a */
    public static void m261311a(IJsBridge iJsBridge, JSONArray jSONArray, IAppContext iAppContext) {
        try {
            VConsoleManager vConsoleManager = (VConsoleManager) AppbrandApplicationImpl.getInst(iAppContext).getService(VConsoleManager.class);
            if (vConsoleManager != null) {
                if (vConsoleManager.isVConsoleSwitchOn()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("logs", jSONArray);
                    if (iJsBridge != null) {
                        iJsBridge.sendMsgToJsCore("console", jSONObject.toString());
                        AppBrandLogger.m52828d("tma_JsCoreUtils", "sendConsole" + jSONObject.toString());
                        return;
                    }
                    return;
                }
            }
            AppBrandLogger.m52829e("tma_JsCoreUtils", vConsoleManager, Boolean.valueOf(vConsoleManager.isVConsoleSwitchOn()));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }

    /* renamed from: a */
    public static void m261312a(String str, int i, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareHitPoint.f121869d, str);
            jSONObject.put("id", String.valueOf(i));
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_JsCoreUtils", "onBackPressed", e);
        }
        C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onPressedBackButton", jSONObject.toString(), i);
    }

    /* renamed from: a */
    public static void m261307a(int i, String str, String str2, String str3, TracingCoreSpan tracingCoreSpan, IAppContext iAppContext) {
        TimeLogger.getInstance(iAppContext).logTimeDuration("SendOnAppRoute", str3, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webviewId", i);
            jSONObject.put("path", str);
            jSONObject.put(SearchIntents.EXTRA_QUERY, str2);
            jSONObject.put("openType", str3);
            if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
                jSONObject.put("scene", C67432a.m262319a(iAppContext).getAppInfo().scene);
                jSONObject.put("subScene", C67432a.m262319a(iAppContext).getAppInfo().subScene);
                jSONObject.put("shareTicket", C67432a.m262319a(iAppContext).getAppInfo().shareTicket);
            }
            if (tracingCoreSpan != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("traceId", tracingCoreSpan.getTracingID());
                jSONObject2.put("createTime", tracingCoreSpan.createTime());
                jSONObject2.put("extensions", new JSONArray());
                jSONObject.put("trace", jSONObject2);
            }
            AppBrandLogger.m52828d("tma_JsCoreUtils", "sendAppRoute", jSONObject.toString());
            C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onAppRoute", jSONObject.toString(), i, "appLaunch".equals(str3));
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_JsCoreUtils", e.getStackTrace());
        }
    }
}
