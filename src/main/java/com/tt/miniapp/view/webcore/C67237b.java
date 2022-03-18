package com.tt.miniapp.view.webcore;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.view.webcore.p3350b.C67238a;
import com.tt.miniapp.view.webcore.p3350b.C67239b;
import com.tt.miniapp.view.webcore.p3350b.C67241d;
import com.tt.miniapp.view.webcore.p3350b.C67247g;
import com.tt.miniapp.view.webcore.p3350b.C67248h;
import com.tt.miniapp.view.webcore.p3350b.C67249i;
import com.tt.miniapp.view.webcore.p3350b.C67250j;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.b */
public class C67237b extends WebViewClient {

    /* renamed from: a */
    private IAppContext f169727a;

    /* renamed from: b */
    private C67241d<WebResourceRequest, WebResourceResponse> f169728b;

    public C67237b(IAppContext iAppContext) {
        this.f169727a = iAppContext;
        C67241d<WebResourceRequest, WebResourceResponse> dVar = new C67241d<>();
        this.f169728b = dVar;
        dVar.mo233847a(new C67239b(iAppContext));
        this.f169728b.mo233847a(new C67250j(iAppContext));
        this.f169728b.mo233847a(new C67249i(iAppContext));
        this.f169728b.mo233847a(new C67238a());
    }

    public void onPageFinished(WebView webView, String str) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "onPageFinished url ", str);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "shouldOverrideUrlLoading url ", str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!ProcessUtil.isMiniappProcess() && (this.f169727a == null || AppType.GadgetAPP != this.f169727a.getAppType())) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Boolean bool = null;
        if (Build.VERSION.SDK_INT >= 26) {
            bool = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        }
        ((LaunchScheduler) AppbrandApplicationImpl.getInst(this.f169727a).getService(LaunchScheduler.class)).onRenderProcessGone(bool);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "shouldInterceptRequest url ", webResourceRequest.getUrl().toString());
        C67248h<WebResourceResponse> a = this.f169728b.mo233846a(new C67247g<>(webResourceRequest));
        if (a == null || a.f169746a == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return a.f169746a;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "shouldOverrideUrlLoading WebResourceRequest  ", webResourceRequest.getUrl().toString());
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "onPageStarted url ", str);
        super.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AppBrandLogger.m52828d("AppbrandWebviewClient", "onReceivedError WebResourceRequest  ", webResourceRequest.getUrl().toString(), " ", Boolean.valueOf(webResourceRequest.isForMainFrame()));
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webResourceRequest.getUrl().toString());
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "AppbrandWebviewClient", e.getStackTrace());
            }
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    jSONObject.put("code", webResourceError.getErrorCode());
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, webResourceError.getDescription());
                } catch (JSONException e2) {
                    AppBrandLogger.stacktrace(6, "AppbrandWebviewClient", e2.getStackTrace());
                }
                AppBrandLogger.m52831w("AppbrandWebviewClient", "onReceivedError WebResourceRequest  ", webResourceRequest.getUrl().toString(), " ", webResourceError.getDescription(), " ", Integer.valueOf(webResourceError.getErrorCode()));
            }
            C67509b.m262587a("mp_start_error", 3000, jSONObject, this.f169727a);
            OPMonitor resultTypeFail = new C67500a("mp_webview_load_exception", C67501b.f170238f, this.f169727a).setResultTypeFail();
            resultTypeFail.setErrorMessage("onReceivedError: " + jSONObject.toString()).flush();
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AppBrandLogger.m52831w("AppbrandWebviewClient", "onReceivedHttpError WebResourceRequest  ", webResourceRequest.getUrl().toString(), " ", Integer.valueOf(webResourceResponse.getStatusCode()), " ", Boolean.valueOf(webResourceRequest.isForMainFrame()));
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webResourceRequest.getUrl().toString());
                jSONObject.put("code", webResourceResponse.getStatusCode());
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, webResourceResponse.getEncoding());
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "AppbrandWebviewClient", e.getStackTrace());
            }
            C67509b.m262587a("mp_start_error", 3000, jSONObject, this.f169727a);
            OPMonitor resultTypeFail = new C67500a("mp_webview_load_exception", C67501b.f170238f, this.f169727a).setResultTypeFail();
            resultTypeFail.setErrorMessage("onReceivedHttpError: " + jSONObject.toString()).flush();
        }
    }
}
