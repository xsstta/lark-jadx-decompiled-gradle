package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.progress.TMALaunchProgress;
import com.tt.miniapp.render.RenderEngineManager;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapp.render.RenderLoadManager;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.AbstractC67261e;
import com.tt.miniapp.webbridge.C67310b;
import com.tt.miniapp.webbridge.C67321g;
import com.tt.miniapp.webbridge.NewBrandRenderBridge;
import com.tt.miniapp.webbridge.WebBridge;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.e */
public abstract class AbstractC67261e extends FrameLayout implements IBackPressedListener, RenderLoadManager.IRenderLoadManagerHost {

    /* renamed from: a */
    private final int f169776a;

    /* renamed from: b */
    private final String f169777b;

    /* renamed from: c */
    private String f169778c;

    /* renamed from: j */
    protected WebViewWrapper f169779j;

    /* renamed from: k */
    protected WebBridge f169780k;

    /* renamed from: l */
    protected NewBrandRenderBridge f169781l;

    /* renamed from: m */
    protected RenderViewManager.IRender f169782m;

    /* renamed from: n */
    protected C67321g f169783n;

    /* renamed from: o */
    protected C67310b f169784o;

    /* renamed from: p */
    public final AppbrandApplicationImpl f169785p;

    /* renamed from: q */
    protected IAppContext f169786q;

    /* renamed from: r */
    public final RenderLoadManager f169787r;

    /* renamed from: s */
    public boolean f169788s;

    /* renamed from: b */
    public abstract RenderViewManager.IRender mo233868b();

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void checkAppDarkModeStatus() {
        mo233866a();
    }

    public IAppContext getAppContext() {
        return this.f169786q;
    }

    public RenderLoadManager getRenderLoadManager() {
        return this.f169787r;
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public int getRenderViewId() {
        return this.f169776a;
    }

    /* renamed from: d */
    public void mo233887d() {
        this.f169787r.onLoadTemplateFinished();
    }

    /* renamed from: e */
    public void mo233888e() {
        this.f169787r.onLoadPageFrameFinished();
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public boolean isFirstPage() {
        if (this.f169776a == 1) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void loadPageFrame() {
        this.f169779j.mo233951a("ttJSBridge.subscribeHandler('onPreloadPageFrame')", new ValueCallback<String>() {
            /* class com.tt.miniapp.view.webcore.AbstractC67261e.C672643 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                AbstractC67261e.this.f169787r.onPreloadPageFrameCallback(str);
            }
        }, "PAGE_FRAME");
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void loadPreloadTemplate() {
        this.f169779j.mo233948a().loadUrl("https://tmaservice.developer.toutiao.com/page-frame.html");
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void onEnvironmentReady() {
        HostDependManager.getInst().convertMouseEvent(this.f169779j.mo233948a());
    }

    @Override // com.tt.frontendapiinterface.IBackPressedListener
    public boolean onBackPressed() {
        VideoFullScreenHelper d = this.f169779j.mo233956d();
        if (d == null || !d.mo233134a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void mo233859c() {
        if (C25529d.m91145a(this.f169786q.getApplicationContext())) {
            TTWebSdk.setForceDark(this.f169779j.mo233948a().getSettings(), 2);
            TTWebSdk.setForceDarkStrategy(this.f169779j.mo233948a().getSettings(), 1);
            AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "checkGlobalDarkModeStatus : true");
            this.f169788s = true;
        }
    }

    private PackageEntity getPackageEntity() {
        AbstractC67796c cVar = (AbstractC67796c) this.f169786q.findServiceByInterface(AbstractC67796c.class);
        if (cVar == null || !(cVar.mo88670a() instanceof GadgetAppInfo)) {
            return null;
        }
        return GadgetBeanConverter.convertAppInfoEntityToPackageEntity((GadgetAppInfo) cVar.mo88670a(), this.f169786q);
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void checkGlobalDarkModeStatus() {
        WebViewWrapper kVar = this.f169779j;
        if (kVar == null || kVar.mo233948a() == null) {
            AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "checkGlobalDarkModeStatus : web view is null");
            return;
        }
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.webcore.$$Lambda$e$trihUMsChT8HS4zI2gDCIxs6S34 */

            public final void run() {
                AbstractC67261e.lambda$trihUMsChT8HS4zI2gDCIxs6S34(AbstractC67261e.this);
            }
        });
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public String getTemplateFilePathIfNotExist() {
        File file = new File(AppbrandConstant.getJsBundleDir(AppbrandContext.getInst().getApplicationContext(), this.f169786q), "page-frame.html");
        if (!file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: a */
    private void mo233866a() {
        IAppContext iAppContext = this.f169786q;
        if (iAppContext == null) {
            AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig fail : app context is null");
        } else if (iAppContext.isDestroying() || this.f169786q.isDestroyed()) {
            AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig fail : app context is destroyed");
        } else if (this.f169785p == null) {
            AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig fail : app is null");
        } else {
            C67866g.m264032c(new Runnable() {
                /* class com.tt.miniapp.view.webcore.AbstractC67261e.RunnableC672676 */

                public void run() {
                    AppConfig appConfig = AbstractC67261e.this.f169785p.getAppConfig();
                    if (appConfig == null) {
                        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig sync fail : app config is null");
                        return;
                    }
                    C67866g.m264027a(new Runnable(appConfig) {
                        /* class com.tt.miniapp.view.webcore.$$Lambda$e$6$atYzewdZEXeZycIxHkOZbvYCc */
                        public final /* synthetic */ AppConfig f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            AbstractC67261e.RunnableC672676.m271556lambda$atYzewdZEXeZycIxHkOZbvYCc(AbstractC67261e.RunnableC672676.this, this.f$1);
                        }
                    });
                }

                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m262115a(AppConfig appConfig) {
                    if (!TTWebSdk.isDarkModeSupported()) {
                        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig fail : tt web core do not support dark mode");
                    } else if (!TTWebSdk.isDarkStrategySupported()) {
                        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig fail : tt web core do not support dark mode strategy");
                    } else {
                        if (appConfig.mo230040a()) {
                            TTWebSdk.setForceDark(AbstractC67261e.this.f169779j.mo233948a().getSettings(), 2);
                            TTWebSdk.setForceDarkStrategy(AbstractC67261e.this.f169779j.mo233948a().getSettings(), 1);
                            AbstractC67261e.this.f169788s = true;
                        } else {
                            TTWebSdk.setForceDark(AbstractC67261e.this.f169779j.mo233948a().getSettings(), 0);
                            AbstractC67261e.this.f169788s = false;
                        }
                        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "initDarkModeConfig result : " + AbstractC67261e.this.f169788s);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public void mo233889f() {
        String e = C25529d.m91164e(this.f169786q);
        this.f169779j.mo233951a("ttJSBridge.subscribeHandler('onThemeChange',{theme: '" + e + "'})", new ValueCallback() {
            /* class com.tt.miniapp.view.webcore.$$Lambda$e$dJe6Srn56cV9sIMLVerKu4TDF0s */

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractC67261e.lambda$dJe6Srn56cV9sIMLVerKu4TDF0s(AbstractC67261e.this, (String) obj);
            }
        }, "ON_THEME_CHANGE");
        StringBuilder sb = new StringBuilder();
        sb.append("notifySystemThemeStatus : ");
        sb.append(e);
        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", sb.toString());
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void loadPathFrame() {
        AppBrandLogger.m52828d("NativeNestWebViewLoadBase", "loadPathFrame " + this.f169777b);
        WebViewWrapper kVar = this.f169779j;
        kVar.mo233951a("ttJSBridge.subscribeHandler('onLoadPageFrame',{path: '" + this.f169777b + "',subPackagePath:'" + this.f169778c + "'})", new ValueCallback<String>() {
            /* class com.tt.miniapp.view.webcore.AbstractC67261e.C672654 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                AbstractC67261e.this.f169787r.onLoadPathFrameFinished();
            }
        }, "PATH_FRAME=>" + this.f169777b);
        ((TMALaunchProgress) this.f169785p.getService(TMALaunchProgress.class)).updateStatus(8);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m262105a(String str) {
        this.f169787r.onPreloadPageFrameCallback(str);
    }

    public void setWebviewInterface(RenderLoadManager.AbstractC66720a aVar) {
        this.f169787r.setRenderViewInterface(aVar);
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void preRenderData(String str) {
        this.f169779j.mo233951a("ttJSBridge.subscribeHandler('onPreRenderData',{preRenderData: '" + str + "', webviewId:'" + this.f169776a + "'})", new ValueCallback<String>() {
            /* class com.tt.miniapp.view.webcore.AbstractC67261e.C672665 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
            }
        }, "PRE_RENDER=>");
    }

    /* renamed from: a */
    public void mo233865a(Context context) {
        boolean z;
        if (C66399c.m259608a() != null) {
            C66399c.m259608a().mo231915a(context, this.f169786q);
        }
        MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) this.f169785p.getService(MpTimeLineReporter.class);
        mpTimeLineReporter.addPoint("create_webview_begin");
        this.f169779j = new WebViewWrapper(context, this.f169786q);
        mpTimeLineReporter.addPoint("create_webview_end");
        this.f169779j.mo233953b();
        this.f169780k = new WebBridge(this, this.f169786q);
        this.f169779j.mo233948a().addJavascriptInterface(this.f169780k, "ttJSCore");
        if (BridgeUniteHelper.f166701a.mo231125a()) {
            this.f169781l = new NewBrandRenderBridge(this.f169786q, (LarkWebView) this.f169779j.mo233948a(), getRenderViewId());
            this.f169779j.mo233948a().addJavascriptInterface(this.f169781l, "Lark_Bridge");
        }
        this.f169784o = new C67310b(this.f169786q, this.f169779j.mo233955c());
        this.f169779j.mo233948a().addJavascriptInterface(this.f169784o, "EMANativeConfig");
        this.f169783n = new C67321g();
        this.f169779j.mo233948a().addJavascriptInterface(this.f169783n, "ttGlobalConfig");
        addView(this.f169779j.mo233948a(), new FrameLayout.LayoutParams(-1, -1));
        mo233866a();
        this.f169779j.mo233948a().setWebViewClient(new C67237b(this.f169786q) {
            /* class com.tt.miniapp.view.webcore.AbstractC67261e.C672621 */

            @Override // com.tt.miniapp.view.webcore.C67237b
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (!C24512a.m89385a(AbstractC67261e.this.f169786q.getAppId())) {
                    AbstractC67261e.this.mo233887d();
                }
            }

            @Override // com.tt.miniapp.view.webcore.C67237b
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                super.onRenderProcessGone(webView, renderProcessGoneDetail);
                if (Build.VERSION.SDK_INT >= 26) {
                    if (renderProcessGoneDetail.didCrash()) {
                        AppBrandLogger.m52829e("NativeNestWebViewLoadBase", "onRenderProcessGone WebView has been killed - crashed");
                    } else {
                        AppBrandLogger.m52829e("NativeNestWebViewLoadBase", "onRenderProcessGone WebView has been killed - not crash");
                    }
                }
                if (!AbstractC67261e.this.f169786q.isDestroying() && !AbstractC67261e.this.f169786q.isDestroyed()) {
                    AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(AbstractC67261e.this.f169786q);
                    if (inst != null) {
                        TMALaunchProgress tMALaunchProgress = (TMALaunchProgress) inst.getService(TMALaunchProgress.class);
                        if (tMALaunchProgress == null || tMALaunchProgress.isDestroy()) {
                            AppBrandLogger.m52829e("NativeNestWebViewLoadBase", "render crash after loading");
                        } else {
                            TimeLogger.getInstance(AbstractC67261e.this.f169786q).logTimeDuration("NativeNestWebViewLoadBase_renderCrash");
                        }
                    }
                    if (AbstractC67261e.this.f169786q != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                jSONObject.put("didCrash", renderProcessGoneDetail.didCrash());
                            }
                            AbstractC67261e.this.f169786q.sendEvent("gadgetPageRenderProcessGone", jSONObject);
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("NativeNestWebViewLoadBase", "put GADGET_PAGE_RENDER_PROCESS_GONE params error : " + e.getMessage());
                        }
                    }
                }
                return true;
            }
        });
        this.f169779j.mo233948a().setWebChromeClient(new WebChromeClient() {
            /* class com.tt.miniapp.view.webcore.AbstractC67261e.C672632 */

            public void onHideCustomView() {
                VideoFullScreenHelper d;
                super.onHideCustomView();
                if (AbstractC67261e.this.f169782m != null && AbstractC67261e.this.f169782m.getCurrentActivity() != null && (d = AbstractC67261e.this.f169779j.mo233956d()) != null) {
                    d.mo233129a(AbstractC67261e.this.f169782m.getCurrentActivity(), AbstractC67261e.this.f169782m.getRenderViewId());
                    AbstractC67261e.this.f169782m.unregisterBackPressedListener(AbstractC67261e.this);
                }
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    String message = consoleMessage.message();
                    int lineNumber = consoleMessage.lineNumber();
                    String sourceId = consoleMessage.sourceId();
                    AppBrandLogger.m52829e("NativeNestWebViewLoadBase", message + " at line:" + lineNumber + " source:" + sourceId);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
                if (AbstractC67261e.this.f169782m != null && AbstractC67261e.this.f169782m.getCurrentActivity() != null) {
                    VideoFullScreenHelper d = AbstractC67261e.this.f169779j.mo233956d();
                    if (d == null) {
                        d = new VideoFullScreenHelper(AbstractC67261e.this.f169786q);
                        AbstractC67261e.this.f169779j.mo233949a(d);
                    }
                    d.mo233131a(AbstractC67261e.this.f169782m.getCurrentActivity(), view, customViewCallback, AbstractC67261e.this.f169782m.getRenderViewId());
                    AbstractC67261e.this.f169782m.registerBackPressedListener(AbstractC67261e.this);
                }
            }
        });
        AbstractC67724a aVar = (AbstractC67724a) this.f169786q.findServiceByInterface(AbstractC67724a.class);
        if (aVar != null) {
            z = aVar.mo50466g(this.f169786q.getAppId());
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("NativeNestWebViewLoadBase", "currentBrandCanDebug: " + z);
        if (z) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public AbstractC67261e(Context context, IAppContext iAppContext) {
        super(context);
        boolean z;
        this.f169786q = iAppContext;
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
        this.f169785p = inst;
        this.f169776a = ((RenderEngineManager) inst.getService(RenderEngineManager.class)).nextRenderViewId(RenderEngineType.WebView);
        this.f169777b = ((LoadPathInterceptor) inst.getService(LoadPathInterceptor.class)).genPlaceHolder("__path_frame__", "");
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (z) {
            this.f169778c = ((LoadPathInterceptor) inst.getService(LoadPathInterceptor.class)).genPageFramePlaceHolder("__page_frame__", "");
        } else {
            this.f169778c = "";
        }
        mo233865a(context);
        RenderViewManager.IRender b = mo233868b();
        this.f169782m = b;
        this.f169780k.setRender(b);
        NewBrandRenderBridge cVar = this.f169781l;
        if (cVar != null) {
            cVar.mo233986a(this.f169782m);
        }
        this.f169784o.mo233977a(this.f169782m);
        this.f169783n.mo233995a(this.f169782m);
        this.f169787r = new RenderLoadManager(inst, iAppContext, this);
    }

    @Override // com.tt.miniapp.render.RenderLoadManager.IRenderLoadManagerHost
    public void onUpdateArgument(String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        String str5 = this.f169777b;
        ((LoadPathInterceptor) this.f169785p.getService(LoadPathInterceptor.class)).updateRealPath(str5, str3 + "-frame.js");
        AppBrandLogger.m52828d("NativeNestWebViewLoadBase", "onUpdateArgument mPathFramePlaceHolder: " + this.f169777b + " real path :" + str3 + "-frame.js");
        PackageEntity packageEntity = getPackageEntity();
        IAppContext iAppContext = this.f169786q;
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (z && packageEntity != null && packageEntity.getRootPaths() != null) {
            if (TextUtils.isEmpty(this.f169778c)) {
                this.f169778c = ((LoadPathInterceptor) this.f169785p.getService(LoadPathInterceptor.class)).genPageFramePlaceHolder("__page_frame__", "");
            }
            int i = 0;
            while (true) {
                if (i >= packageEntity.getRootPaths().size()) {
                    z2 = true;
                    break;
                } else if (str3.startsWith(packageEntity.getRootPaths().get(i)) || str3.equals(packageEntity.getRootPaths().get(i))) {
                    String str6 = this.f169778c;
                    ((LoadPathInterceptor) this.f169785p.getService(LoadPathInterceptor.class)).updateRealPath(str6, packageEntity.getRootPaths().get(i) + "/page-frame.js");
                    AppBrandLogger.m52828d("NativeNestWebViewLoadBase", "onUpdateArgument mPageFramePlaceHolder: " + this.f169778c + " real path :" + packageEntity.getRootPaths().get(i) + "/page-frame.js");
                    z2 = false;
                } else {
                    i++;
                }
            }
            if (z2) {
                ((LoadPathInterceptor) this.f169785p.getService(LoadPathInterceptor.class)).updateRealPath(this.f169778c, "");
                AppBrandLogger.m52828d("NativeNestWebViewLoadBase", "onUpdateArgument mPageFramePlaceHolder: " + this.f169778c + " real path :");
            }
        }
    }
}
