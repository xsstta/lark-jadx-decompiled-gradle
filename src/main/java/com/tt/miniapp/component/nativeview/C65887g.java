package com.tt.miniapp.component.nativeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.frontendapiinterface.IKeyboardObserver;
import com.tt.miniapp.AbstractC66179g;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.ab.C65726a;
import com.tt.miniapp.component.nativeview.p3272d.C65877a;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.util.C67027ae;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.webbridge.C67315e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.IllegalColorException;
import com.tt.option.ext.WebEventCallback;
import com.tt.option.p3389j.AbstractC67645c;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.g */
public class C65887g extends FrameLayout implements DownloadListener, IBackPressedListener, AbstractC65886f {

    /* renamed from: a */
    protected TouchWebViewWrapper f166186a;

    /* renamed from: b */
    protected C65895a f166187b;

    /* renamed from: c */
    public VideoFullScreenHelper f166188c;

    /* renamed from: d */
    protected IAppContext f166189d;

    /* renamed from: e */
    public int f166190e = 0;

    /* renamed from: f */
    private C67231a f166191f;

    /* renamed from: g */
    private RenderViewManager.IRender f166192g;

    /* renamed from: h */
    private C65902h f166193h;

    /* renamed from: i */
    private AbstractC67645c f166194i;

    /* renamed from: j */
    private int f166195j;

    /* renamed from: k */
    private C65897b f166196k;

    /* renamed from: l */
    private IKeyboardObserver f166197l;

    /* renamed from: m */
    private C67315e f166198m;

    /* renamed from: n */
    private String f166199n;

    /* renamed from: com.tt.miniapp.component.nativeview.g$c */
    public interface AbstractC65898c {
        /* renamed from: a */
        WebResourceResponse mo230665a(WebView webView, WebResourceRequest webResourceRequest);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo230664a(String str) {
        return false;
    }

    /* renamed from: com.tt.miniapp.component.nativeview.g$a */
    protected static class C65895a extends WebViewClient {

        /* renamed from: a */
        private AbstractC65898c f166214a;

        /* renamed from: b */
        private AbstractC65896a f166215b;

        /* renamed from: c */
        private String f166216c;

        /* renamed from: d */
        private boolean f166217d;

        /* renamed from: e */
        private IAppContext f166218e;

        /* renamed from: com.tt.miniapp.component.nativeview.g$a$a */
        public interface AbstractC65896a {
            /* renamed from: a */
            void mo230685a(WebView webView, String str);

            /* renamed from: a */
            void mo230686a(String str);

            /* renamed from: b */
            void mo230687b(String str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo230698a() {
            return this.f166216c;
        }

        /* renamed from: a */
        public void mo230699a(AbstractC65898c cVar) {
            this.f166214a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo230700a(boolean z) {
            this.f166217d = z;
        }

        public C65895a(AbstractC65896a aVar, IAppContext iAppContext) {
            this.f166215b = aVar;
            this.f166218e = iAppContext;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            AppBrandLogger.m52828d("tma_NativeWebView", "shouldOverrideUrlLoading ", str);
            return m258113a(webView, str);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (renderProcessGoneDetail.didCrash()) {
                    AppBrandLogger.m52829e("tma_NativeWebView", "onRenderProcessGone WebView has been killed - crashed");
                } else {
                    AppBrandLogger.m52829e("tma_NativeWebView", "onRenderProcessGone WebView has been killed - not crash");
                }
            }
            return true;
        }

        /* renamed from: a */
        private boolean m258113a(WebView webView, String str) {
            String a = C67027ae.m261237a(str);
            if (C65887g.m258093a(webView, str, this.f166218e) || HostDependManager.getInst().interceptOpenWebUrl(webView.getContext(), str)) {
                return true;
            }
            if (C65887g.m258094b(str)) {
                HostDependManager.getInst().syncWebViewLoginCookie(str);
                return false;
            }
            if (TextUtils.isEmpty(str) || "about".equals(a) || "about:blank".equals(str)) {
            }
            return false;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null && !str.startsWith("http://larkwebview.error.page")) {
                this.f166215b.mo230685a(webView, str);
            }
            this.f166217d = false;
            webView.evaluateJavascript("window.isRenderInBrowser=" + ContextSingletonInstance.getInstance().webViewDataInstance.f169825a + ";", null);
            AppBrandLogger.m52828d("tma_NativeWebView", "onPageFinished url ", str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse a;
            AbstractC65898c cVar = this.f166214a;
            if (cVar != null && (a = cVar.mo230665a(webView, webResourceRequest)) != null) {
                return a;
            }
            try {
                if (webResourceRequest.getUrl().toString().equalsIgnoreCase("http://larkwebview.error.page")) {
                    return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(C65841a.f165932a.getBytes()));
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_NativeWebView", "shouldInterceptRequest erro " + e);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            AppBrandLogger.m52828d("tma_NativeWebView", "onPageStarted url ", str);
            if (str != null && !str.startsWith("http://larkwebview.error.page")) {
                this.f166215b.mo230686a(str);
            }
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            AppBrandLogger.m52829e("tma_NativeWebView", "onReceivedHttpError WebResourceRequest  ", webResourceRequest.getUrl().toString(), " ", Integer.valueOf(webResourceResponse.getStatusCode()), " ", Boolean.valueOf(webResourceRequest.isForMainFrame()));
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webResourceRequest.getUrl().toString());
                    jSONObject.put("code", webResourceResponse.getStatusCode());
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, webResourceResponse.getEncoding());
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_NativeWebView", e.getStackTrace());
                }
                C67509b.m262587a("mp_start_error", 3000, jSONObject, this.f166218e);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (str2 != null && !str2.startsWith("http://larkwebview.error.page")) {
                this.f166215b.mo230687b(str2);
            }
            if (!this.f166217d) {
                this.f166216c = str2;
                webView.stopLoading();
                webView.loadUrl("http://larkwebview.error.page?language=" + C67043j.m261286g());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str2);
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_NativeWebView", e.getStackTrace());
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str);
                    } catch (JSONException e2) {
                        AppBrandLogger.stacktrace(6, "tma_NativeWebView", e2.getStackTrace());
                    }
                    AppBrandLogger.m52831w("tma_NativeWebView", "onReceivedError WebResourceRequest  ", str2, " ", str, " ", Integer.valueOf(i));
                }
                C67509b.m262587a("mp_start_error", 3000, jSONObject, this.f166218e);
            }
        }
    }

    public IAppContext getAppContext() {
        return this.f166189d;
    }

    public C67315e getBridge() {
        return this.f166198m;
    }

    public AbstractC67645c getFileChooseHandler() {
        return this.f166194i;
    }

    public int getWebViewId() {
        return this.f166195j;
    }

    /* renamed from: com.tt.miniapp.component.nativeview.g$b */
    static class C65897b implements AbstractC66179g {

        /* renamed from: a */
        C65887g f166219a;

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: a */
        public void mo48892a() {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: a */
        public void mo48893a(Bundle bundle) {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: b */
        public void mo48895b(Bundle bundle) {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: e */
        public void mo48898e() {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: f */
        public void mo48899f() {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: g */
        public void mo48900g() {
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: b */
        public void mo48894b() {
            this.f166219a.mo230675d();
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: c */
        public void mo48896c() {
            this.f166219a.mo230674c();
        }

        @Override // com.tt.miniapp.AbstractC66179g
        /* renamed from: d */
        public void mo48897d() {
            this.f166219a.mo230673b();
        }

        public C65897b(C65887g gVar) {
            this.f166219a = gVar;
        }
    }

    public WebView getWebView() {
        return this.f166186a.mo230762a();
    }

    /* renamed from: a */
    public void mo230671a() {
        if (this.f166187b != null) {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.component.nativeview.C65887g.RunnableC658903 */

                public void run() {
                    WebView a = C65887g.this.f166186a.mo230762a();
                    a.evaluateJavascript("document.location.replace('" + C65887g.this.f166187b.mo230698a() + "')", null);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo230674c() {
        try {
            this.f166186a.mo230762a().onResume();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_NativeWebView", "onResume", e);
        }
    }

    /* renamed from: d */
    public void mo230675d() {
        try {
            this.f166186a.mo230762a().onPause();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_NativeWebView", "onPause", e);
        }
    }

    public int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // com.tt.frontendapiinterface.IBackPressedListener
    public boolean onBackPressed() {
        C65895a aVar = this.f166187b;
        if (aVar != null) {
            aVar.mo230700a(true);
        }
        if (!this.f166186a.mo230762a().canGoBack()) {
            return false;
        }
        this.f166186a.mo230762a().goBack();
        return true;
    }

    public static String getUnsafePageUrl() {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            return initParams.mo234501a(1004, AppbrandConstant.C65701b.m257612c().mo230142g());
        }
        return AppbrandConstant.C65701b.m257612c().mo230142g();
    }

    /* renamed from: b */
    public void mo230673b() {
        this.f166186a.mo230762a().setWebChromeClient(null);
        this.f166186a.mo230762a().setWebViewClient(null);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
            try {
                this.f166186a.mo230762a().destroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f166192g.removeNativeView(this.f166195j, null);
        if (this.f166199n != null) {
            try {
                C67485a.m262488a(this.f166189d).mo234278H().mo87232b(this.f166199n);
            } catch (Exception e) {
                Log.m165384e("tma_NativeWebView", "Exception", e);
            }
        }
        this.f166198m = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230663a(WebView webView) {
        C67315e eVar = new C67315e(this);
        this.f166198m = eVar;
        webView.addJavascriptInterface(eVar, "ttJSCore");
    }

    /* renamed from: b */
    public static boolean m258094b(String str) {
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        AppBrandLogger.m52830i("tma_NativeWebView", "dispatchTouchEvent ", Boolean.valueOf(dispatchTouchEvent));
        return dispatchTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AppBrandLogger.m52830i("tma_NativeWebView", "onTouchEvent ", Boolean.valueOf(onTouchEvent));
        return onTouchEvent;
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(final IAppContext iAppContext) {
        this.f166189d = iAppContext;
        this.f166199n = C67485a.m262488a(iAppContext).mo234278H().mo87230a(this.f166195j);
        TouchWebViewWrapper iVar = new TouchWebViewWrapper(iAppContext.getCurrentActivity(), iAppContext);
        this.f166186a = iVar;
        iVar.mo230762a().setDownloadListener(this);
        this.f166187b = new C65895a(new C65895a.AbstractC65896a() {
            /* class com.tt.miniapp.component.nativeview.C65887g.C658881 */

            @Override // com.tt.miniapp.component.nativeview.C65887g.C65895a.AbstractC65896a
            /* renamed from: b */
            public void mo230687b(String str) {
                C65887g.this.mo230672a(str, iAppContext, "onWebviewError");
            }

            @Override // com.tt.miniapp.component.nativeview.C65887g.C65895a.AbstractC65896a
            /* renamed from: a */
            public void mo230686a(String str) {
                C65887g.this.mo230672a(str, iAppContext, "onWebviewStartLoad");
            }

            @Override // com.tt.miniapp.component.nativeview.C65887g.C65895a.AbstractC65896a
            /* renamed from: a */
            public void mo230685a(WebView webView, String str) {
                C65887g.this.mo230672a(str, iAppContext, "onWebviewFinishLoad");
            }
        }, iAppContext);
        HostDependManager.getInst().onCreateWebView(this.f166186a.mo230762a());
        if (HostDependManager.getInst().getFeatureGating("gadget.component.webview")) {
            AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
            if (inst != null) {
                this.f166197l = new IKeyboardObserver() {
                    /* class com.tt.miniapp.component.nativeview.C65887g.C658892 */

                    @Override // com.tt.frontendapiinterface.IKeyboardObserver
                    public void onKeyboardHeightChanged(int i, int i2) {
                        AppBrandLogger.m52830i("tma_NativeWebView", "receive keyboard change - height: " + i);
                        if (i > 0) {
                            int b = (int) C65887g.this.f166186a.mo230763b();
                            if (b > 0) {
                                int a = C67043j.m261267a(iAppContext.getApplicationContext()) - b;
                                int statusBarHeight = C65887g.this.getStatusBarHeight();
                                AppBrandLogger.m52830i("tma_NativeWebView", "touchY:" + b + " toBottom:" + a + " height:" + i + " statusBarHeight:" + statusBarHeight);
                                if (a < statusBarHeight + i) {
                                    C65887g gVar = C65887g.this;
                                    gVar.f166190e = (a - i) - gVar.getStatusBarHeight();
                                    AppBrandLogger.m52830i("tma_NativeWebView", "adjustOffSet: " + C65887g.this.f166190e);
                                    C65887g.this.f166186a.mo230762a().offsetTopAndBottom(C65887g.this.f166190e);
                                    return;
                                }
                                return;
                            }
                            AppBrandLogger.m52829e("tma_NativeWebView", "invalid touch Y");
                            return;
                        }
                        AppBrandLogger.m52830i("tma_NativeWebView", "adjustOffSet: " + (-C65887g.this.f166190e));
                        C65887g.this.f166186a.mo230762a().offsetTopAndBottom(-C65887g.this.f166190e);
                        C65887g.this.f166190e = 0;
                    }
                };
                inst.getActivityLife().registerKeyboardListener(this.f166197l);
                return;
            }
            AppBrandLogger.m52829e("tma_NativeWebView", "not listener keyboard height change, application null");
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("position");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("left");
                int optInt2 = optJSONObject.optInt("top");
                int optInt3 = optJSONObject.optInt("width");
                int optInt4 = optJSONObject.optInt("height");
                if (optInt >= 0) {
                    optInt = C67589g.m263062a((double) optInt);
                }
                if (optInt2 >= 0) {
                    optInt2 = C67589g.m263062a((double) optInt2);
                }
                if (optInt3 >= 0) {
                    optInt3 = C67589g.m263062a((double) optInt3);
                }
                if (optInt4 >= 0) {
                    optInt4 = C67589g.m263062a((double) optInt4);
                }
                AppBrandLogger.m52830i("tma_NativeWebView", "addView width ", Integer.valueOf(optInt3), " ", Integer.valueOf(optInt4));
                AppBrandLogger.m52830i("tma_NativeWebView", "addView left ", Integer.valueOf(optInt3), " ", Integer.valueOf(optInt2));
                AppBrandLogger.m52830i("tma_NativeWebView", "addView getScreenWidth ", Integer.valueOf(C67590h.m263066a(this.f166191f.getContext())));
                AppBrandLogger.m52830i("tma_NativeWebView", "createWebView", mo230670a(this, this.f166192g, this.f166187b).toString());
                C67231a.C67234b bVar = new C67231a.C67234b(optInt3, optInt4, optInt - this.f166191f.getCurScrollX(), optInt2 - this.f166191f.getCurScrollY());
                if (jSONObject.has("zIndex")) {
                    bVar.f169723c = jSONObject.optInt("zIndex");
                }
                if (jSONObject.has("fixed")) {
                    bVar.f169724d = jSONObject.optBoolean("fixed");
                }
                this.f166191f.addView(this, bVar);
                addView(this.f166186a.mo230762a(), new FrameLayout.LayoutParams(optInt3, optInt4));
                addView(this.f166193h, new FrameLayout.LayoutParams(optInt3, (int) C67590h.m263065a(this.f166191f.getContext(), 2.0f)));
                this.f166193h.mo230758b();
                C65897b bVar2 = new C65897b(this);
                this.f166196k = bVar2;
                this.f166192g.registerPageLife(bVar2);
                try {
                    String optString = jSONObject.optString("progressBarColor");
                    if (!TextUtils.isEmpty(optString)) {
                        this.f166193h.setProgressDrawable(new ClipDrawable(new ColorDrawable(C67590h.m263082b(optString)), 3, 1));
                    }
                } catch (IllegalColorException e) {
                    AppBrandLogger.eWithThrowable("tma_NativeWebView", "", e);
                }
                this.f166186a.mo230762a().setOnTouchListener(new View.OnTouchListener() {
                    /* class com.tt.miniapp.component.nativeview.C65887g.View$OnTouchListenerC658925 */

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        if ((motionEvent.getAction() & 255) == 1) {
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        return false;
                    }
                });
                this.f166192g.registerBackPressedListener(this);
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "tma_NativeWebView", e2.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
        AppbrandApplicationImpl inst;
        C65897b bVar = this.f166196k;
        if (bVar != null) {
            this.f166192g.unregisterPageLife(bVar);
        }
        if (!(this.f166197l == null || (inst = AppbrandApplicationImpl.getInst(this.f166189d)) == null || this.f166197l == null)) {
            inst.getActivityLife().unRegisterKeyboardListener(this.f166197l);
        }
        this.f166192g.unregisterBackPressedListener(this);
        TouchWebViewWrapper iVar = this.f166186a;
        if (iVar != null) {
            iVar.mo230762a().setWebChromeClient(null);
            this.f166186a.mo230762a().setWebViewClient(null);
            HostDependManager.getInst().onWebViewComponentDestroyed(this.f166186a.mo230762a(), this.f166189d);
            try {
                this.f166186a.mo230762a().destroy();
            } catch (Throwable th) {
                AppBrandLogger.m52829e("tma_NativeWebView", th);
            }
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("src");
            AppBrandLogger.m52828d("tma_NativeWebView", "updateView ", str);
            if (!TextUtils.isEmpty(optString)) {
                if (HostDependManager.getInst().interceptOpenWebUrl(getContext(), optString)) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.tt.miniapp.component.nativeview.C65887g.RunnableC658914 */

                        public void run() {
                            IActivityLife activityLife = C67432a.m262319a(C65887g.this.f166189d).getActivityLife();
                            if (activityLife != null) {
                                activityLife.goback();
                            }
                        }
                    });
                    return;
                } else if (!mo230664a(optString)) {
                    if (!m258093a(this.f166186a.mo230762a(), optString, this.f166189d)) {
                        HostDependManager.getInst().syncWebViewLoginCookie(optString);
                        this.f166186a.mo230762a().loadUrl(optString);
                    } else {
                        return;
                    }
                }
            }
            C67231a.C67234b bVar = (C67231a.C67234b) getLayoutParams();
            if (jSONObject.has("fixed")) {
                bVar.f169724d = jSONObject.optBoolean("fixed");
            }
            if (jSONObject.has("zIndex")) {
                bVar.f169723c = jSONObject.optInt("zIndex");
                requestLayout();
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_NativeWebView", "updateView error ", e);
        }
    }

    /* renamed from: a */
    private void m258091a(Context context, String str, boolean z) {
        HostDependManager.getInst().openWebBrowser(context, str, z);
    }

    public C65887g(int i, C67231a aVar, RenderViewManager.IRender iRender) {
        super(aVar.getContext());
        this.f166191f = aVar;
        this.f166192g = iRender;
        this.f166195j = i;
        this.f166193h = new C65902h(aVar.getContext());
        this.f166194i = iRender.getFileChooseHandler();
    }

    /* renamed from: a */
    public void mo230672a(String str, IAppContext iAppContext, String str2) {
        AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager().publish(this.f166192g.getRenderViewId(), str2, new C67587d().mo234783a("htmlId", Integer.valueOf(this.f166195j)).mo234783a("src", str).mo234783a("channel", this.f166199n).mo234784a().toString());
    }

    /* renamed from: a */
    public static boolean m258093a(WebView webView, String str, IAppContext iAppContext) {
        if (C65877a.m258066a(webView, str, iAppContext, "http://larkwebview.error.page")) {
            Log.m165389i("tma_NativeWebView", "url:" + str + " not set safe domain");
            return true;
        }
        String a = C67027ae.m261237a(str);
        if (C67027ae.m261242b("webview_schema", a, iAppContext)) {
            if (!C67027ae.m261239a(a, str, iAppContext)) {
                m258092a(webView, str, "webview_schema");
            }
            return true;
        } else if (C67053q.m261326a("webview", str, iAppContext)) {
            return false;
        } else {
            m258092a(webView, str, "webview");
            C66020b.m258530a("mp_webview_invalid_domain", iAppContext).mo231090a("host", str).mo231092a();
            return true;
        }
    }

    /* renamed from: a */
    private static void m258092a(WebView webView, String str, String str2) {
        String unsafePageUrl = getUnsafePageUrl();
        try {
            if (!TextUtils.isEmpty(unsafePageUrl)) {
                StringBuffer stringBuffer = new StringBuffer(unsafePageUrl);
                stringBuffer.append("?");
                stringBuffer.append(C67478b.m262466b());
                Uri parse = Uri.parse(str);
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != 290602151) {
                    if (hashCode == 1224424441) {
                        if (str2.equals("webview")) {
                            c = 0;
                        }
                    }
                } else if (str2.equals("webview_schema")) {
                    c = 1;
                }
                if (c == 0) {
                    String host = parse.getHost();
                    String substring = str.substring(0, str.indexOf(host) + host.length());
                    stringBuffer.append("&unconfig_domain=");
                    stringBuffer.append(Uri.encode(substring));
                } else if (c == 1) {
                    String scheme = parse.getScheme();
                    stringBuffer.append("&unconfig_schema=");
                    stringBuffer.append(Uri.encode(scheme));
                }
                if (webView != null) {
                    webView.loadUrl(stringBuffer.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.m52829e("tma_NativeWebView", e);
            if (webView != null) {
                StringBuffer stringBuffer2 = new StringBuffer(unsafePageUrl);
                stringBuffer2.append("?");
                stringBuffer2.append(C67478b.m262466b());
                webView.loadUrl(stringBuffer2.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebView mo230670a(final C65887g gVar, final RenderViewManager.IRender iRender, WebViewClient webViewClient) {
        WebView a = gVar.f166186a.mo230762a();
        final C65902h hVar = gVar.f166193h;
        C65726a aVar = new C65726a(a.getSettings(), this.f166189d);
        aVar.mo230326a();
        aVar.mo230328b();
        aVar.mo230327a(true);
        if (((Boolean) HostDependManager.getInst().getHostData(2005, true, this.f166189d)).booleanValue()) {
            aVar.mo230329c();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(a, true);
        if (C65983a.m258415a().f166554d) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        a.setWebChromeClient(new WebChromeClient() {
            /* class com.tt.miniapp.component.nativeview.C65887g.C658936 */

            public void onHideCustomView() {
                AppBrandLogger.m52830i("tma_NativeWebView", "onHideCustomView ");
                super.onHideCustomView();
                if (C65887g.this.f166188c != null) {
                    C65887g.this.f166188c.mo233128a(iRender.getCurrentActivity());
                }
            }

            /* renamed from: a */
            private boolean m258109a(String str) {
                if (str == null) {
                    return false;
                }
                if (str.startsWith(C65887g.getUnsafePageUrl()) || str.startsWith("http://larkwebview.error.page")) {
                    return true;
                }
                return false;
            }

            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                if (!m258110a(webView.getUrl(), str)) {
                    iRender.updateWebTitle(str, m258109a(webView.getUrl()));
                }
            }

            public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
                AppBrandLogger.m52830i("tma_NativeWebView", "location permission ", str);
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C66588h.m260183a().mo232189a(C65887g.this.f166189d.getCurrentActivity(), hashSet, new AbstractC66590i() {
                    /* class com.tt.miniapp.component.nativeview.C65887g.C658936.C658941 */

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48890a() {
                        AppBrandLogger.m52830i("tma_NativeWebView", "granted location");
                        callback.invoke(str, true, false);
                    }

                    @Override // com.tt.miniapp.permission.AbstractC66590i
                    /* renamed from: a */
                    public void mo48891a(String str) {
                        AppBrandLogger.m52830i("tma_NativeWebView", "denied location");
                        callback.invoke(str, false, false);
                    }
                });
            }

            public void onProgressChanged(WebView webView, int i) {
                AppBrandLogger.m52830i("tma_NativeWebView", "onProgressChanged ", Integer.valueOf(i));
                if (i >= 99) {
                    hVar.mo230758b();
                    iRender.onNativeWebViewPageFinished(webView.canGoBack());
                } else {
                    if (!hVar.isShown()) {
                        hVar.mo230757a();
                    }
                    hVar.setProgress(i);
                }
                super.onProgressChanged(webView, i);
            }

            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                AppBrandLogger.m52830i("tma_NativeWebView", "onShowCustomView ");
                super.onShowCustomView(view, customViewCallback);
                if (C65887g.this.f166188c == null) {
                    C65887g gVar = C65887g.this;
                    gVar.f166188c = new VideoFullScreenHelper(gVar.f166189d);
                }
                C65887g.this.f166188c.mo233132a(VideoFullScreenHelper.ScreenDirection.LANDSCAPE);
                C65887g.this.f166188c.mo233130a(iRender.getCurrentActivity(), view, customViewCallback);
            }

            /* renamed from: a */
            private boolean m258110a(String str, String str2) {
                if (str == null) {
                    return false;
                }
                if (str.equals(str2)) {
                    return true;
                }
                Uri parse = Uri.parse(str);
                if (!str.equals(parse.getScheme() + "://" + str2)) {
                    return false;
                }
                AppBrandLogger.m52830i("tma_NativeWebView", "title is url:" + str);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                AbstractC67645c fileChooseHandler = gVar.getFileChooseHandler();
                if (fileChooseHandler == null) {
                    return false;
                }
                fileChooseHandler.mo230669a(valueCallback, fileChooserParams);
                return true;
            }

            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
        });
        if (TTWebSdk.isDarkModeSupported() && TTWebSdk.isDarkStrategySupported()) {
            if ("dark".equalsIgnoreCase(C25529d.m91164e(this.f166189d))) {
                TTWebSdk.setForceDark(this.f166186a.mo230762a().getSettings(), 2);
                TTWebSdk.setForceDarkStrategy(this.f166186a.mo230762a().getSettings(), 1);
            } else {
                TTWebSdk.setForceDark(this.f166186a.mo230762a().getSettings(), 0);
            }
        }
        a.setWebViewClient(webViewClient);
        a.loadUrl("javascript: window.__ttjsenv__='microapp';console.log(__ttjsenv__);");
        mo230663a(a);
        AppbrandApplicationImpl.getInst(this.f166189d).getRenderViewManager().addWebComponent(getWebViewId(), this);
        return a;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        m258091a(getContext(), str, true);
    }
}
