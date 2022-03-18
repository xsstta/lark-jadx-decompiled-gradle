package com.larksuite.component.openplatform.core.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.p1103b.AbstractC24366a;
import com.larksuite.component.openplatform.core.container.C24470b;
import com.larksuite.component.openplatform.core.container.C24474c;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.mina.AdapterApiSettingHandler;
import com.larksuite.component.openplatform.core.p1114c.C24423a;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.core.C25925c;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25892c;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.debug.C65989c;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.render.OPRenderEngineProvider;
import com.tt.miniapp.render.RenderEngineManageService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import ee.android.framework.manis.C68183b;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.utils.d */
public class C25529d {

    /* renamed from: a */
    private static int f62155a = 1;

    /* renamed from: a */
    public static String m91139a(Bundle bundle, String str) {
        return m91140a(bundle, str, "");
    }

    /* renamed from: a */
    public static String m91140a(Bundle bundle, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return (String) m91137a(bundle, str, (Object) str2);
    }

    /* renamed from: a */
    public static Serializable m91136a(Bundle bundle, String str, Serializable serializable) {
        if (!bundle.containsKey(str)) {
            return serializable;
        }
        return bundle.getSerializable(str);
    }

    /* renamed from: a */
    public static <T> T m91137a(Bundle bundle, String str, T t) {
        if (bundle == null || TextUtils.isEmpty(str) || !bundle.containsKey(str)) {
            return t;
        }
        T t2 = (T) bundle.get(str);
        if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
            return t2;
        }
        AppBrandLogger.m52828d("OPUtils", "[key] " + str + " [value] " + ((Object) t2));
        return t;
    }

    /* renamed from: a */
    public static <T> T m91138a(JSONObject jSONObject, String str, T t) {
        if (jSONObject == null || jSONObject.length() == 0 || t == null || jSONObject.isNull(str)) {
            return t;
        }
        try {
            T t2 = (T) jSONObject.get(str);
            if (t2 != null && t.getClass().isAssignableFrom(t2.getClass())) {
                return t2;
            }
            AppBrandLogger.m52831w("OPUtils", "[key] " + str + " [value] " + ((Object) t2));
            return t;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("OPUtils", ApiHandler.API_CALLBACK_EXCEPTION, e);
            return t;
        }
    }

    /* renamed from: a */
    public static boolean m91147a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http");
    }

    /* renamed from: a */
    public static boolean m91148a(String str, String str2) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.disable.newcontainer", false)) {
            AppBrandLogger.m52830i("OPUtils", "isGlobalSwitchOff is on, all new container are disabled ");
            return false;
        }
        String str3 = str2 + "." + str;
        String str4 = "gadget.container.disable." + str3;
        if (HostDependManager.getInst().getFeatureGating(str4, false)) {
            AppBrandLogger.m52830i("OPUtils", "target blockedKey: " + str4 + " is in blocked list");
            return false;
        }
        String str5 = "gadget.container.enable." + str3;
        boolean featureGating = HostDependManager.getInst().getFeatureGating(str5, false);
        AppBrandLogger.m52830i("OPUtils", "target accessKey: " + str5 + " is Enable: " + featureGating);
        if (!featureGating && TextUtils.equals(str2, "embed")) {
            featureGating = HostDependManager.getInst().getFeatureGating("gadget.container.enable.embed.batch", false);
            AppBrandLogger.m52830i("OPUtils", "target batch embed key is Enable: " + featureGating);
        }
        if (featureGating) {
            return featureGating;
        }
        boolean featureGating2 = HostDependManager.getInst().getFeatureGating("gadget.container.enable.batch", false);
        AppBrandLogger.m52830i("OPUtils", "target batch key is Enable: " + featureGating2);
        return featureGating2;
    }

    /* renamed from: a */
    public static void m91143a(LKEvent lKEvent, IAppContext iAppContext) {
        if (lKEvent == null || iAppContext == null) {
            AppBrandLogger.m52829e("OPUtils", "invalid params");
            return;
        }
        lKEvent.mo92126a(C24377a.f60157b, iAppContext.getAppId());
        AbstractC67720a aVar = (AbstractC67720a) iAppContext.findServiceByInterface(AbstractC67720a.class);
        if (aVar != null) {
            lKEvent.mo92126a("isBackground", Boolean.valueOf(aVar.mo235074d()));
        }
        lKEvent.mo92125a(iAppContext);
    }

    /* renamed from: a */
    public static ILogger m91135a(LKEvent lKEvent) {
        return lKEvent.mo92134c().mo92190b();
    }

    /* renamed from: a */
    public static void m91144a(C25925c cVar, Class<? extends IHostProcessHandleEvent> cls, String str) {
        cVar.mo92247a(new AbstractC25892c(str, cls) {
            /* class com.larksuite.component.openplatform.core.utils.$$Lambda$d$lvbyobq1vMyYSGUc2OVlpyzxrWc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Class f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25892c
            public final LKBasePluginResult dispatchEvent(LKEvent lKEvent) {
                return C25529d.m91134a(this.f$0, this.f$1, lKEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ LKBasePluginResult m91134a(String str, Class cls, LKEvent lKEvent) {
        ILogger a = m91135a(lKEvent);
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("event:");
        sb.append(lKEvent.mo92146m());
        sb.append(" paramsLength:");
        sb.append(lKEvent.mo92147n() != null ? Integer.valueOf(lKEvent.mo92147n().length()) : "");
        sb.append(" env:");
        sb.append(lKEvent.mo92141h());
        objArr[0] = sb.toString();
        a.mo92224i("OPUtils", objArr);
        if (lKEvent.mo92141h() == null) {
            lKEvent.mo92118a(LKEvent.EventSourceEnv.APP_ENV);
        }
        if (LKEvent.EventSourceEnv.BIZ_ENV == lKEvent.mo92141h()) {
            return LKBasePluginResult.f64237b;
        }
        a.mo92224i("OPUtils", "dispatchEvent:" + lKEvent.mo92146m());
        try {
            LKBasePluginResult a2 = new C24470b(str, cls, lKEvent).mo87306a();
            a.mo92224i("OPUtils", "event:" + lKEvent.mo92146m() + "sync callback:" + a2);
            return a2;
        } catch (Exception e) {
            a.mo92224i("OPUtils", e);
            a.mo92224i("OPUtils", "fakeContainerId:" + str);
            return LKBasePluginResult.f64237b;
        }
    }

    /* renamed from: a */
    public static String m91141a(JSONObject jSONObject) {
        Object remove = jSONObject.remove("innerMsg");
        String str = remove instanceof String ? (String) remove : "";
        return TextUtils.isEmpty(str) ? jSONObject.optString(ApiHandler.API_CALLBACK_ERRMSG) : str;
    }

    /* renamed from: a */
    public static boolean m91146a(AppType appType, String str) {
        return AdapterApiSettingHandler.m89609a().mo87533a(appType, str) == AdapterApiSettingHandler.ApiCommand.USE_OLD;
    }

    /* renamed from: a */
    public static boolean m91145a(Context context) {
        if (context == null) {
            AppBrandLogger.m52830i("OPUtils", "isGlobalDarkModeEnvOn : context is null");
            return false;
        }
        boolean featureGating = HostDependManager.getInst().getFeatureGating("gadget.container.disable.dark.mode.support", false);
        boolean a = UDUiModeUtils.m93319a(context);
        boolean d = m91163d();
        AppBrandLogger.m52830i("OPUtils", " disableDarkMode : " + featureGating + " curDarkModeStatus : " + a + " renderSupport : " + d);
        if (featureGating || !a || !d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m91142a(IAppContext iAppContext, int i, boolean z) {
        if (iAppContext == null || iAppContext.isDestroyed()) {
            AppBrandLogger.m52830i("OPUtils", " notifyTabBarReadyStatus app context is destroyed");
            return;
        }
        iAppContext.putExtra("tab_bar_ready", Integer.valueOf(i));
        if (z) {
            C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(iAppContext).getRouteEventCtrl();
            if (routeEventCtrl != null) {
                routeEventCtrl.mo232876e();
                return;
            }
            AppBrandLogger.m52830i("OPUtils", " notifyTabBarReadyStatus routeEventCtrl is null");
        }
    }

    /* renamed from: a */
    public static long m91128a() {
        int i = f62155a;
        f62155a = i + 1;
        return (long) i;
    }

    /* renamed from: b */
    public static void m91150b() {
        if (C67448a.m262353a().mo234188g()) {
            AppBrandLogger.m52830i("OPUtils", "preloadOPGadgetRunner : touch max count");
            return;
        }
        AbstractC67433a d = C67448a.m262353a().mo234185d();
        d.setContainerType("embed");
        ((PreloadManager) AppbrandApplicationImpl.getInst(d).getService(PreloadManager.class)).preloadOnProcessInit(null);
        C67448a.m262353a().mo234179a(d, true);
    }

    /* renamed from: c */
    public static void m91157c() {
        List<IAppContext> e = C67448a.m262353a().mo234186e();
        if (e != null) {
            for (IAppContext iAppContext : e) {
                ((PreloadManager) AppbrandApplicationImpl.getInst(iAppContext).getService(PreloadManager.class)).clean();
            }
            C67448a.m262353a().mo234187f();
        }
    }

    /* renamed from: d */
    private static boolean m91163d() {
        for (Map.Entry<RenderEngineType, OPRenderEngineProvider> entry : RenderEngineManageService.getInstance().getAllRenderEngineProvider().entrySet()) {
            if (!entry.getValue().isSupportDarkMode()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static ILogger m91161d(IAppContext iAppContext) {
        return iAppContext.getTracingSpan();
    }

    /* renamed from: c */
    public static boolean m91158c(IAppContext iAppContext) {
        if (iAppContext == null) {
            return false;
        }
        return iAppContext.isNewContainer();
    }

    /* renamed from: f */
    public static boolean m91165f(IAppContext iAppContext) {
        if (iAppContext != null) {
            return iAppContext.getCurrentActivity() instanceof MiniappHostBase;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m91166g(IAppContext iAppContext) {
        if (iAppContext instanceof AbstractC67433a) {
            return ((AbstractC67433a) iAppContext).mo234169i();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m91167h(IAppContext iAppContext) {
        if (!m91166g(iAppContext) || !m91165f(iAppContext)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m91151b(IAppContext iAppContext) {
        AbstractC25576a defaultPluginContainer = iAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer == null) {
            m91130a(iAppContext).mo92183u().mo92200a(C24423a.m89092c());
        } else if (iAppContext instanceof AbstractC67433a) {
            ((AbstractC67433a) iAppContext).mo234158a(defaultPluginContainer);
        }
    }

    /* renamed from: c */
    public static boolean m91160c(String str) {
        return HostDependManager.getInst().getFeatureGating("openplatform.gadget.expirationtime.enable." + str, false);
    }

    /* renamed from: e */
    public static String m91164e(IAppContext iAppContext) {
        if (iAppContext == null) {
            return "";
        }
        if (iAppContext.getCurrentTheme() == 2) {
            return "dark";
        }
        if (iAppContext.getCurrentTheme() == 1) {
            return "light";
        }
        return "";
    }

    /* renamed from: i */
    public static AbstractC12888c m91168i(IAppContext iAppContext) {
        AbstractC12888c cVar = null;
        if (iAppContext == null) {
            return null;
        }
        AbstractC25891b appContainer = iAppContext.getAppContainer();
        if (appContainer instanceof AbstractC24366a) {
            cVar = ((AbstractC24366a) appContainer).mo87129f();
        }
        if (m91166g(iAppContext) || cVar != null) {
            return cVar;
        }
        return iAppContext.getGadgetInteractiveProxy();
    }

    /* renamed from: j */
    public static boolean m91169j(IAppContext iAppContext) {
        if (!m91166g(iAppContext) || !(iAppContext instanceof AbstractC67433a) || ((AbstractC67433a) iAppContext).mo234171k()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m91170k(IAppContext iAppContext) {
        boolean z;
        boolean z2 = C65983a.m258415a().f166554d;
        if (iAppContext != null) {
            z = ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50466g(iAppContext.getAppId());
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("OPUtils", "canDebug: " + z2 + ",currentBrandCanDebug：" + z);
        if (!z2 && !z) {
            return false;
        }
        if (C65983a.m258415a().f166556f) {
            C65989c.m258429a().mo230985a((String) null);
        }
        return true;
    }

    /* renamed from: a */
    public static AbstractC25576a m91130a(IAppContext iAppContext) {
        AbstractC25576a defaultPluginContainer = iAppContext.getDefaultPluginContainer();
        if (defaultPluginContainer != null) {
            return defaultPluginContainer;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C24474c cVar = new C24474c(iAppContext);
        AppBrandLogger.m52830i("OPUtils", "getUnitePluginList OpDefaultPluginContainer:" + (System.currentTimeMillis() - currentTimeMillis));
        cVar.mo92183u().mo92200a(C24423a.m89091b());
        AppBrandLogger.m52830i("OPUtils", "getUnitePluginList:" + (System.currentTimeMillis() - currentTimeMillis));
        return cVar;
    }

    /* renamed from: b */
    public static boolean m91153b(Context context) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.force.host.stack.in.parallel.window", false)) {
            AppBrandLogger.m52830i("OPUtils", "isInParallelWindow : disable by fg");
            return false;
        } else if (context == null) {
            AppBrandLogger.m52830i("OPUtils", "isInParallelWindow : context is null");
            return false;
        } else if (context.getResources() == null || context.getResources().getConfiguration() == null) {
            AppBrandLogger.m52830i("OPUtils", "isInParallelWindow : context resource is null");
            return false;
        } else {
            String configuration = context.getResources().getConfiguration().toString();
            if (TextUtils.isEmpty(configuration)) {
                AppBrandLogger.m52830i("OPUtils", "isInParallelWindow : context resource config is null");
                return false;
            }
            boolean contains = configuration.contains("magic-windows");
            AppBrandLogger.m52830i("OPUtils", "isParallelWindow : " + contains);
            if (RomUtils.m94944c()) {
                AppBrandLogger.m52830i("OPUtils", "isParallelWindow in Miui");
            } else if (RomUtils.m94933a()) {
                AppBrandLogger.m52830i("OPUtils", "isParallelWindow in Huawei");
            } else {
                AppBrandLogger.m52830i("OPUtils", "isParallelWindow in Other Brand");
            }
            return contains;
        }
    }

    /* renamed from: b */
    public static boolean m91155b(String str) {
        return TextUtils.equals(str, "setMeta");
    }

    /* renamed from: b */
    public static Serializable m91149b(Bundle bundle, String str) {
        return m91136a(bundle, str, (Serializable) null);
    }

    /* renamed from: c */
    public static int m91156c(Bundle bundle, String str) {
        return m91126a(bundle, str, 0);
    }

    /* renamed from: b */
    public static void m91152b(final IAppContext iAppContext, final LKEvent lKEvent) {
        C67866g.m264032c(new Runnable() {
            /* class com.larksuite.component.openplatform.core.utils.C25529d.RunnableC255301 */

            public void run() {
                C25529d.m91131a(iAppContext, lKEvent);
            }
        });
    }

    /* renamed from: a */
    public static int m91125a(int i, JSONObject jSONObject) {
        Integer num;
        Object remove = jSONObject.remove("innerCode");
        if (remove instanceof Integer) {
            num = (Integer) remove;
        } else {
            num = null;
        }
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static IHostProcessHandleEvent m91129a(Context context, Class<? extends IHostProcessHandleEvent> cls) {
        if (context == null) {
            return null;
        }
        return (IHostProcessHandleEvent) C68183b.m264839a().mo237086a(context, cls);
    }

    /* renamed from: b */
    public static boolean m91154b(IAppContext iAppContext, String str) {
        if (iAppContext == null || TextUtils.isEmpty(str) || (iAppContext.getCurrentActivity() instanceof MiniappHostBase)) {
            return false;
        }
        if (!TextUtils.equals(str, "onCheckForUpdate") && !TextUtils.equals(str, "onUpdateReady") && !TextUtils.equals(str, "onUpdateFailed")) {
            return false;
        }
        ILogger d = m91161d(iAppContext);
        if (d != null) {
            d.mo92224i("OPUtils", " event : " + str + " shouldInterceptSendEventToJs & caused by current activity is not MiniappHostBase");
        } else {
            AppBrandLogger.m52830i("OPUtils", " event : " + str + " shouldInterceptSendEventToJs & caused by current activity is not MiniappHostBase");
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m91159c(IAppContext iAppContext, String str) {
        if (iAppContext == null || TextUtils.isEmpty(str) || (iAppContext.getCurrentActivity() instanceof MiniappHostBase)) {
            return false;
        }
        if (!TextUtils.equals(str, "applyUpdate") && !TextUtils.equals(str, "exitMiniProgram")) {
            return false;
        }
        AppBrandLogger.m52830i("OPUtils", "JSAPI : " + str + " is intercept caused by current activity is not MiniappHostBase");
        return true;
    }

    /* renamed from: d */
    public static void m91162d(IAppContext iAppContext, String str) {
        if (iAppContext != null && !TextUtils.isEmpty(str) && str.startsWith("ttJSBridge.subscribeHandler")) {
            if (str.contains("onPreloadPageFrame") || str.contains("onLoadPageFrame")) {
                AppBrandLogger.m52830i("OPUtils", "checkJSEvaluateStatus : " + str + " evaluate timeout");
                iAppContext.sendEvent("render_page_frame_js_load_timeout");
            }
        }
    }

    /* renamed from: a */
    public static LKBasePluginResult m91131a(IAppContext iAppContext, LKEvent lKEvent) {
        m91143a(lKEvent, iAppContext);
        lKEvent.mo92117a((Context) iAppContext.getCurrentActivity());
        return iAppContext.sendEvent(lKEvent);
    }

    /* renamed from: a */
    public static LKBasePluginResult m91132a(IAppContext iAppContext, String str) {
        return m91131a(iAppContext, new LKEvent.C25888a().mo92168a(str).mo92171a());
    }

    /* renamed from: a */
    public static int m91126a(Bundle bundle, String str, int i) {
        return ((Integer) m91137a(bundle, str, (Object) Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static int m91127a(JSONObject jSONObject, String str, int i) {
        return ((Integer) m91138a(jSONObject, str, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static LKBasePluginResult m91133a(final LKEvent lKEvent, final IHostProcessHandleEvent.HandleEventCallback handleEventCallback, AbstractC25891b bVar, Context context, Object obj) {
        lKEvent.mo92117a(context);
        final ILogger a = m91135a(lKEvent);
        lKEvent.mo92122a((AbstractC25894e) new AbstractC25894e() {
            /* class com.larksuite.component.openplatform.core.utils.C25529d.C255312 */

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48104a(int i, JSONObject jSONObject) {
                String str;
                ILogger aVar = a;
                aVar.mo92224i("OPUtils", "eventId:" + i);
                IHostProcessHandleEvent.HandleEventCallback handleEventCallback = handleEventCallback;
                if (handleEventCallback != null) {
                    if (jSONObject != null) {
                        str = jSONObject.toString();
                    } else {
                        str = "";
                    }
                    handleEventCallback.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
            /* renamed from: a */
            public void mo48103a(int i, int i2, JSONObject jSONObject) {
                String str;
                ILogger aVar = a;
                aVar.mo92224i("OPUtils", "eventName:" + lKEvent.mo92146m() + " errorCode:" + i2);
                IHostProcessHandleEvent.HandleEventCallback handleEventCallback = handleEventCallback;
                if (handleEventCallback != null) {
                    if (jSONObject != null) {
                        str = jSONObject.toString();
                    } else {
                        str = "";
                    }
                    handleEventCallback.onFail(i2, str);
                }
            }
        });
        if (obj != null) {
            lKEvent.mo92125a(obj);
        }
        LKBasePluginResult b = bVar.mo92179b(lKEvent);
        if (handleEventCallback != null) {
            long currentTimeMillis = System.currentTimeMillis();
            handleEventCallback.onLinkTraceId(lKEvent.mo92134c().mo92188a().getTracingID());
            a.mo92222d("OPUtils", "onLinkTraceId:" + (System.currentTimeMillis() - currentTimeMillis));
        }
        return b;
    }
}
