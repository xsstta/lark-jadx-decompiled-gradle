package com.bytedance.ee.bear.document.web;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\"H\u0014J\b\u0010$\u001a\u00020\"H\u0014J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010'H\u0014J\b\u0010*\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\"H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/document/web/CommonWebActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "mConnect", "", "mErrorLayout", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEmptyState;", "mFrameLayout", "Landroid/widget/FrameLayout;", "mLoadingView", "Lcom/bytedance/ee/bear/document/loading/LoadingLayout;", "getMLoadingView", "()Lcom/bytedance/ee/bear/document/loading/LoadingLayout;", "setMLoadingView", "(Lcom/bytedance/ee/bear/document/loading/LoadingLayout;)V", "mTitle", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "getMTitle", "()Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "setMTitle", "(Lcom/bytedance/ee/bear/widgets/BaseTitleBar;)V", "mWebView", "Landroid/webkit/WebView;", "getMWebView", "()Landroid/webkit/WebView;", "setMWebView", "(Landroid/webkit/WebView;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "initNotNetTip", "", "initUserAgent", "initWebSettings", "initWebview", "bundle", "Landroid/os/Bundle;", "onDoCreate", "savedInstanceState", "onResume", "startWeb", "Companion", "WebviewActivityClient", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class CommonWebActivity extends BaseActivity {

    /* renamed from: g */
    public static ak.AbstractC5642a f17406g;

    /* renamed from: h */
    public static final Companion f17407h = new Companion(null);

    /* renamed from: a */
    protected WebView f17408a;

    /* renamed from: b */
    protected BaseTitleBar f17409b;

    /* renamed from: c */
    public SpaceEmptyState f17410c;

    /* renamed from: d */
    public FrameLayout f17411d;

    /* renamed from: e */
    protected LoadingLayout f17412e;

    /* renamed from: f */
    public boolean f17413f = true;

    /* renamed from: i */
    private String f17414i;

    @JvmStatic
    /* renamed from: a */
    public static final void m25190a(ak.AbstractC5642a aVar) {
        f17407h.mo25273a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25271g() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/document/web/CommonWebActivity$Companion;", "", "()V", "DEFAULT_URL", "", "TAG", "WEB_URL", "webViewCreateListener", "Lcom/bytedance/ee/bear/document/WebViewHolder$OnWebViewCreateListener;", "setOnWebViewCreateListener", "", "listener", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo25273a(ak.AbstractC5642a aVar) {
            CommonWebActivity.f17406g = aVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25264a() {
        return this.f17414i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final BaseTitleBar mo25266c() {
        BaseTitleBar baseTitleBar = this.f17409b;
        if (baseTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
        }
        return baseTitleBar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final LoadingLayout mo25268d() {
        LoadingLayout loadingLayout = this.f17412e;
        if (loadingLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        }
        return loadingLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo25272h() {
        WebView webView = this.f17408a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        webView.loadUrl(this.f17414i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        WebView webView = this.f17408a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        webView.resumeTimers();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final WebView mo25265b() {
        WebView webView = this.f17408a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        return webView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo25269e() {
        View findViewById = findViewById(R.id.common_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.common_empty_state)");
        this.f17410c = (SpaceEmptyState) findViewById;
        View findViewById2 = findViewById(R.id.common_fl_webview);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.common_fl_webview)");
        this.f17411d = (FrameLayout) findViewById2;
        C5084ad.m20847d().mo20037a().mo5923a(this, new C6286c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo25270f() {
        WebView webView = this.f17408a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setAllowFileAccess(true);
        }
        if (settings != null) {
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        if (settings != null) {
            settings.setSupportZoom(true);
        }
        if (settings != null) {
            settings.setBuiltInZoomControls(true);
        }
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        if (settings != null) {
            settings.setLoadWithOverviewMode(true);
        }
        if (settings != null) {
            settings.setAppCacheEnabled(true);
        }
        if (settings != null) {
            settings.setDomStorageEnabled(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/document/web/CommonWebActivity$WebviewActivityClient;", "Landroid/webkit/WebViewClient;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/document/web/CommonWebActivity;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "mIsPageLoading", "", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "setServiceContext", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "isRedirect", "view", "Landroid/webkit/WebView;", "url", "", "isRouteToLarkMineAbout", "onPageFinished", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldOverrideUrlLoading", "request", "Landroid/webkit/WebResourceRequest;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$b */
    public final class WebviewActivityClient extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ CommonWebActivity f17415a;

        /* renamed from: b */
        private boolean f17416b;

        /* renamed from: c */
        private C10917c f17417c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$b$c */
        static final class C6285c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C6285c f17420a = new C6285c();

            C6285c() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("CommonWebActivity", "hostService routeToLarkAbout fail", th);
            }
        }

        /* renamed from: a */
        private final boolean m25204a(String str) {
            return "lark://inner/mine/about".equals(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hostService", "Lcom/bytedance/ee/bear/contract/HostService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$b$a */
        static final class C6283a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C6283a f17418a = new C6283a();

            C6283a() {
            }

            /* renamed from: a */
            public final String apply(com.bytedance.ee.bear.contract.ak akVar) {
                Intrinsics.checkParameterIsNotNull(akVar, "hostService");
                akVar.routeToLarkAbout();
                return "";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "s", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$b$b */
        static final class C6284b<T> implements Consumer<String> {

            /* renamed from: a */
            final /* synthetic */ WebviewActivityClient f17419a;

            C6284b(WebviewActivityClient bVar) {
                this.f17419a = bVar;
            }

            /* renamed from: a */
            public final void accept(String str) {
                this.f17419a.f17415a.finish();
                C13479a.m54772d("CommonWebActivity", "hostService routeToLarkAbout success ");
            }
        }

        public WebviewActivityClient(CommonWebActivity commonWebActivity, C10917c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            this.f17415a = commonWebActivity;
            this.f17417c = cVar;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C13479a.m54764b("CommonWebActivity", "onPageFinished:");
            this.f17416b = false;
        }

        /* renamed from: a */
        private final boolean m25203a(WebView webView, String str) {
            WebView.HitTestResult hitTestResult;
            if (webView != null) {
                hitTestResult = webView.getHitTestResult();
            } else {
                hitTestResult = null;
            }
            if (hitTestResult == null || hitTestResult.getType() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            boolean z;
            String str2;
            ComponentName component;
            ComponentName componentName;
            Uri url;
            String str3 = null;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            String str4 = str;
            if (str4 == null || StringsKt.isBlank(str4)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (m25204a(str)) {
                this.f17417c.mo41508c(com.bytedance.ee.bear.contract.ak.class).mo238020d(C6283a.f17418a).mo237985a(C11678b.m48481e()).mo238001b(new C6284b(this), C6285c.f17420a);
                return true;
            }
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (Throwable th) {
                C13479a.m54761a("CommonWebActivity", th);
            }
            if (m25203a(webView, str)) {
                AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null);
                if (fVar != null) {
                    RouteBean routeBean = new RouteBean();
                    Serializable serializableExtra = this.f17415a.getIntent().getSerializableExtra("extra_data_map");
                    if (serializableExtra != null) {
                        routeBean.mo40612a((Map) serializableExtra);
                    }
                    fVar.mo17293a(str, routeBean);
                    Activity b = fVar.mo17294b();
                    if (b == null || (componentName = b.getComponentName()) == null) {
                        str2 = null;
                    } else {
                        str2 = componentName.getClassName();
                    }
                    Intent c = fVar.mo17297c();
                    if (!(c == null || (component = c.getComponent()) == null)) {
                        str3 = component.getClassName();
                    }
                    if (!(str2 == null && str3 == null) && Objects.equals(str2, str3)) {
                        C13479a.m54764b("CommonWebActivity", "shouldOverrideUrlLoading: same activity");
                    } else {
                        this.f17415a.finish();
                        return true;
                    }
                } else {
                    C13479a.m54764b("CommonWebActivity", "shouldOverrideUrlLoading: routeService = null");
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22261b(str);
            return true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C13479a.m54764b("CommonWebActivity", "onPageStarted:");
            this.f17416b = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/document/web/CommonWebActivity$initWebview$1", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "onReceivedTitle", "webView", "title", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$d */
    public static final class C6287d extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ CommonWebActivity f17422a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6287d(CommonWebActivity commonWebActivity) {
            this.f17422a = commonWebActivity;
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                this.f17422a.mo25268d().setVisibility(8);
            } else {
                this.f17422a.mo25268d().setVisibility(0);
                this.f17422a.mo25268d().mo23567a();
            }
            super.onProgressChanged(webView, i);
        }

        public void onReceivedTitle(WebView webView, String str) {
            boolean z;
            super.onReceivedTitle(webView, str);
            BaseTitleBar c = this.f17422a.mo25266c();
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = this.f17422a.getString(R.string.Doc_Facade_DefaultTitle);
            }
            c.setTitle(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SpaceEmptyState m25189a(CommonWebActivity commonWebActivity) {
        SpaceEmptyState spaceEmptyState = commonWebActivity.f17410c;
        if (spaceEmptyState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mErrorLayout");
        }
        return spaceEmptyState;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m25191b(CommonWebActivity commonWebActivity) {
        FrameLayout frameLayout = commonWebActivity.f17411d;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFrameLayout");
        }
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.doc_common_web_activity);
        Bundle bundle2 = null;
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17288a(this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        }
        mo25269e();
        mo25267c(bundle2);
        mo25270f();
        mo25271g();
        mo25272h();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "networkState", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.web.CommonWebActivity$c */
    public static final class C6286c<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ CommonWebActivity f17421a;

        C6286c(CommonWebActivity commonWebActivity) {
            this.f17421a = commonWebActivity;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            Boolean bool;
            boolean z;
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("onChanged: network state = ");
            if (networkState != null) {
                bool = Boolean.valueOf(networkState.mo20041b());
            } else {
                bool = null;
            }
            sb.append(bool);
            C13479a.m54764b("CommonWebActivity", sb.toString());
            int i2 = 0;
            if (networkState == null || !networkState.mo20041b()) {
                z = false;
            } else {
                z = true;
            }
            SpaceEmptyState a = CommonWebActivity.m25189a(this.f17421a);
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            a.setVisibility(i);
            FrameLayout b = CommonWebActivity.m25191b(this.f17421a);
            if (!z) {
                i2 = 8;
            }
            b.setVisibility(i2);
            if (z && z != this.f17421a.f17413f) {
                this.f17421a.mo25265b().reload();
            }
            this.f17421a.mo25266c().setMainTitleVisible(z);
            this.f17421a.f17413f = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25267c(Bundle bundle) {
        String str;
        boolean z;
        if (bundle != null) {
            str = bundle.getString("web_url");
        } else {
            str = null;
        }
        this.f17414i = str;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f17414i = "file:///android_asset/html/default_web.html";
        }
        View findViewById = findViewById(R.id.common_webview);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.common_webview)");
        WebView webView = (WebView) findViewById;
        this.f17408a = webView;
        ak.AbstractC5642a aVar = f17406g;
        if (aVar != null) {
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            aVar.mo17108a(webView);
        }
        View findViewById2 = findViewById(R.id.common_loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.common_loading)");
        this.f17412e = (LoadingLayout) findViewById2;
        View findViewById3 = findViewById(R.id.common_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.common_title)");
        this.f17409b = (BaseTitleBar) findViewById3;
        C13479a.m54772d("CommonWebActivity", "initWebview: url= ");
        WebView webView2 = this.f17408a;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        C10917c n = mo30076n();
        Intrinsics.checkExpressionValueIsNotNull(n, "serviceContext()");
        webView2.setWebViewClient(new WebviewActivityClient(this, n));
        WebView webView3 = this.f17408a;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        webView3.setWebChromeClient(new C6287d(this));
    }
}
